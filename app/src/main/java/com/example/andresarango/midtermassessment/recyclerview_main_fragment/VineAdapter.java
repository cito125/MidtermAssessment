package com.example.andresarango.midtermassessment.recyclerview_main_fragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.andresarango.midtermassessment.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andresarango on 12/10/16.
 */
public class VineAdapter extends RecyclerView.Adapter<RecordVH> {

    List<com.example.andresarango.midtermassessment.modello.Record> mRecordList = new ArrayList<>();


    @Override
    public RecordVH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecordVH(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.record_viewholder,parent,false));
    }

    @Override
    public void onBindViewHolder(RecordVH holder, int position) {
        holder.bind(mRecordList.get(position));
    }

    public void updateRecordList(List<com.example.andresarango.midtermassessment.modello.Record> recordList) {
        mRecordList.clear();
        mRecordList.addAll(recordList);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mRecordList.size();
    }
}
