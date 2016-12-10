package com.example.andresarango.midtermassessment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andresarango.midtermassessment.recyclerview_main_fragment.VineAdapter;

/**
 * Created by andresarango on 12/10/16.
 */

public class MainFragment extends Fragment{

    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.main_fragment, container, false);
        mRecyclerView = (RecyclerView) root.findViewById(R.id.main_fragment_rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mRecyclerView.setAdapter(new VineAdapter());
        return root;
    }
}
