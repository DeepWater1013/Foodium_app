package dev.shreyaspatil.foodium.api

import dev.shreyaspatil.foodium.utils.PostsResponse
import retrofit2.http.GET

interface FoodiumService {

    @GET("/DummyFoodiumApi/api/posts/")
    suspend fun getPosts(): PostsResponse

    companion object {
        const val FOODIUM_API_URL = "https://patilshreyas.github.io/"
    }
}