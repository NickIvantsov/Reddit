package com.example.android.reddit.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android.reddit.databinding.MainFragmentBinding
import org.koin.android.ext.android.inject
import timber.log.Timber

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel by inject<MainViewModel>()

    private var bindingImpl: MainFragmentBinding? = null
    private val binding get() = bindingImpl!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bindingImpl = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.getRedditTopBtn.setOnClickListener {
            viewModel.getRedditTop()
        }
        viewModel.redditTopLiveData.observe(viewLifecycleOwner) {
            //todo
        }
    }

}