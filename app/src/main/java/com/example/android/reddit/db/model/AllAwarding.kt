package com.example.android.reddit.db.model


import com.google.gson.annotations.SerializedName

data class AllAwarding(
    @SerializedName("award_sub_type")
    val awardSubType: String = "",
    @SerializedName("award_type")
    val awardType: String = "",
    @SerializedName("awardings_required_to_grant_benefits")
    val awardingsRequiredToGrantBenefits: Any = Any(),
    @SerializedName("coin_price")
    val coinPrice: Int = 0,
    @SerializedName("coin_reward")
    val coinReward: Int = 0,
    val count: Int = 0,
    @SerializedName("days_of_drip_extension")
    val daysOfDripExtension: Int = 0,
    @SerializedName("days_of_premium")
    val daysOfPremium: Int = 0,
    val description: String = "",
    @SerializedName("end_date")
    val endDate: Any = Any(),
    @SerializedName("giver_coin_reward")
    val giverCoinReward: Int = 0,
    @SerializedName("icon_format")
    val iconFormat: String = "",
    @SerializedName("icon_height")
    val iconHeight: Int = 0,
    @SerializedName("icon_url")
    val iconUrl: String = "",
    @SerializedName("icon_width")
    val iconWidth: Int = 0,
    val id: String = "",
    @SerializedName("is_enabled")
    val isEnabled: Boolean = false,
    @SerializedName("is_new")
    val isNew: Boolean = false,
    val name: String = "",
    @SerializedName("penny_donate")
    val pennyDonate: Int = 0,
    @SerializedName("penny_price")
    val pennyPrice: Int = 0,
    @SerializedName("resized_icons")
    val resizedIcons: List<ResizedIcon> = listOf(),
    @SerializedName("resized_static_icons")
    val resizedStaticIcons: List<ResizedStaticIcon> = listOf(),
    @SerializedName("start_date")
    val startDate: Any = Any(),
    @SerializedName("static_icon_height")
    val staticIconHeight: Int = 0,
    @SerializedName("static_icon_url")
    val staticIconUrl: String = "",
    @SerializedName("static_icon_width")
    val staticIconWidth: Int = 0,
    @SerializedName("subreddit_coin_reward")
    val subredditCoinReward: Int = 0,
    @SerializedName("subreddit_id")
    val subredditId: Any = Any(),
    @SerializedName("tiers_by_required_awardings")
    val tiersByRequiredAwardings: Any = Any()
)