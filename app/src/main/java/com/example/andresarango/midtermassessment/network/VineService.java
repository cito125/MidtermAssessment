package com.example.andresarango.midtermassessment.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by andresarango on 12/10/16.
 */
public interface VineService {
    // https://vine.co/api/timelines/users/918753190470619136
    @GET("api/timelines/users/918753190470619136")
    Call<ResponseBody> getVineJSON();
}
