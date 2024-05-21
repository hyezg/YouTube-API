package com.nbc.video.network.model.video

import com.google.gson.annotations.SerializedName

data class Thumbnail(
    @SerializedName("url") val url: String,
    @SerializedName("width") val width: Int,
    @SerializedName("height") val height: Int,
)