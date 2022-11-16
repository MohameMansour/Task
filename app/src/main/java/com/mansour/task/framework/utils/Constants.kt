package com.mansour.task.framework.utils

import com.mansour.task.BuildConfig

interface Constants {
    object Network {
        const val BASE_URL: String = BuildConfig.HOST

        object ImagesEndPoints {
            const val IMAGES = "svc/mostpopular/v2/emailed/7.json"
        }

        const val API_KEY = "api-key"
        const val API_KEY_VALUE = "nukJ0B2kWgyLRxIcyRATNMK4sHz5fCvU"
    }
}