package com.example.android.reddit.util.net

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.net.NetworkInfo
import android.os.Build
import com.example.android.catfacts.util.net.AppResult
import com.google.gson.GsonBuilder
import retrofit2.Response
import java.io.IOException

fun isOnline(context: Context): Boolean {
    var result = false
    val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        connectivityManager?.run {
            connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)?.run {
                result = when {
                    hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                    hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                    hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                    hasTransport(NetworkCapabilities.TRANSPORT_VPN) -> true
                    else -> false
                }
            }
        }
    } else {
        connectivityManager?.run {
            val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo
            return activeNetwork?.isConnected == true
        }
    }
    return result
}

fun <T : Any> handleApiError(resp: Response<T>): AppResult.Error {
    val error = parseError(resp)
    return AppResult.Error(Exception(error.message))
}

fun <T : Any> handleSuccess(response: Response<T>): AppResult<T> {
    response.body()?.let {
        return AppResult.Success(it)
    } ?: return handleApiError(response)
}

fun parseError(response: Response<*>): APIError {

    val gson = GsonBuilder().create()
    val error: APIError

    try {
        error = gson.fromJson(response.errorBody()?.string(), APIError::class.java)
    } catch (e: IOException) {
        return APIError()
    }
    return error
}

fun Context.noNetworkConnectivityError(): AppResult.Error {
    return AppResult.Error(Exception("no_network_connectivity"))
}

data class APIError(val message: String) {
    constructor() : this("")
}

