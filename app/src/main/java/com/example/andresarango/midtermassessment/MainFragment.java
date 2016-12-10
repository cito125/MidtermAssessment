package com.example.andresarango.midtermassessment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andresarango.midtermassessment.modello.Vine;
import com.example.andresarango.midtermassessment.network.VineAPI;
import com.example.andresarango.midtermassessment.recyclerview_main_fragment.VineAdapter;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by andresarango on 12/10/16.
 */

public class MainFragment extends Fragment {

    private static final String SWAG = "gasnasnfasonfsa";
    private RecyclerView mRecyclerView;
    private VineAdapter mVineAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.main_fragment, container, false);
        mRecyclerView = (RecyclerView) root.findViewById(R.id.main_fragment_rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mVineAdapter = new VineAdapter();
        mRecyclerView.setAdapter(mVineAdapter);
        return root;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        VineAPI vineAPI = VineAPI.getInstance();

        vineAPI.getCall().enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Gson gson = new Gson();
                    String jsonString = response.body().string();
                    Log.d(SWAG, jsonString);
                    Vine vinePOJO = gson.fromJson(jsonString, Vine.class);
                    mVineAdapter.updateRecordList(vinePOJO.getData().getRecords());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }

}
