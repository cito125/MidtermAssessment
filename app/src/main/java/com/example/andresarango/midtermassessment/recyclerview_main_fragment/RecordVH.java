package com.example.andresarango.midtermassessment.recyclerview_main_fragment;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.andresarango.midtermassessment.R;

/**
 * Created by andresarango on 12/10/16.
 */
public class RecordVH extends RecyclerView.ViewHolder {

    private final TextView mLikedTV;
    private final TextView mUsernameTV;

    public RecordVH(View itemView) {
        super(itemView);
        mLikedTV = (TextView) itemView.findViewById(R.id.tv_liked);
        mUsernameTV = (TextView) itemView.findViewById(R.id.tv_username);

    }

    public void bind(com.example.andresarango.midtermassessment.modello.Record record) {
        if (record.getProfileBackground() != null) {
            Log.d("YEEEEERRR", record.getProfileBackground().substring(2));
            int backgroundColor = Color.parseColor("#" + record.getProfileBackground().substring(2));
            itemView.setBackgroundColor(backgroundColor);
        }
        String userName = record.getUsername();
        String likes = Integer.toString(record.getLiked());
        mLikedTV.setText(likes);
        mUsernameTV.setText(userName);


    }
}
