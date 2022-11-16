package com.mansour.task.framework.datasources.remote.services

import com.mansour.task.business.entities.ImageModel
import com.mansour.task.framework.utils.Constants.Network
import com.mansour.task.framework.utils.Constants.Network.ImagesEndPoints
import retrofit2.http.GET
import retrofit2.http.Query

interface ImagesApi {

    @GET(ImagesEndPoints.IMAGES)
    suspend fun getImages(@Query(Network.API_KEY) apiKey: String = Network.API_KEY_VALUE): ImageModel
}