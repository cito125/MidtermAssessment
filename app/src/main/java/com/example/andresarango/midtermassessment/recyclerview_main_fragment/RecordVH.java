package com.example.andresarango.midtermassessment.recyclerview_main_fragment;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.andresarango.midtermassessment.R;
import com.example.andresarango.midtermassessment.model.Record;

/**
 * Created by andresarango on 12/10/16.
 */
public class RecordVH extends RecyclerView.ViewHolder{

    private final TextView mLikedTV;
    private final TextView mUsernameTV;

    public RecordVH(View itemView) {
        super(itemView);
        mLikedTV = (TextView) itemView.findViewById(R.id.tv_liked);
        mUsernameTV = (TextView) itemView.findViewById(R.id.tv_username);

    }

    public void bind(Record record) {
        int backgroundColor = Integer.valueOf(record.getRepost().getProfileBackground());
        String likes = Integer.toString(record.getLiked());
        String userName = record.getUsername();
        mLikedTV.setText(likes);
        mUsernameTV.setText(userName);
        itemView.setBackgroundColor(backgroundColor);
    }
}
