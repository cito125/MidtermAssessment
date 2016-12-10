package com.example.andresarango.midtermassessment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.andresarango.midtermassessment.network.VineAPI;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String SWAG = "YEEER----------";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VineAPI vineAPI = VineAPI.getInstance();


        vineAPI.getCall().enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d(SWAG, response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });

//        getFragmentManager()
//                .beginTransaction()
//                .replace(R.id.activity_main, new MainFragment())
//                .addToBackStack(null)
//                .commit();
    }
}
