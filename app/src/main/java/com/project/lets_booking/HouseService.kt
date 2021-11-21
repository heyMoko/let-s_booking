package com.project.lets_booking

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/676f9085-2390-4603-a268-ffd06e463132")
    fun getHouseList(): Call<HouseDto>
}