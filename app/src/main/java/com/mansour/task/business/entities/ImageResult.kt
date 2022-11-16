package com.mansour.task.business.entities

import com.google.gson.annotations.SerializedName

data class ImageResult(
    val abstract: String,
    @SerializedName("published_date") val publishedAt: String,
    val id: Long,
    val media: List<Media>,
    val title: String
) {
    val imageUrl: String? get() = media.firstOrNull()?.mediaMetadata?.firstOrNull()?.url
}