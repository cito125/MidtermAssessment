package com.example.andresarango.midtermassessment.network;

import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by andresarango on 12/10/16.
 */

public class VineAPI {
    private static VineAPI instance;
    private String VINE_BASE_URL = "https://vine.co/";
    private VineService mVineService;

    public static VineAPI getInstance(){
        if(instance == null){
            instance = new VineAPI();
        }
        return instance;
    }

    private VineAPI(){
        mVineService = new Retrofit.Builder()
                .baseUrl(VINE_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(VineService.class);
    }

    public Call<ResponseBody> getCall(){
        return mVineService.getVineJSON();
    }
}
