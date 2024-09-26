package com.nirmal.cric

import android.content.ClipData.Item
import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface APIService {
    @GET("cricket")
    suspend fun getItems(): Call<List<Item>>

}
