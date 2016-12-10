package com.example.andresarango.midtermassessment.modello;



/**
 * Created by andresarango on 12/10/16.
 */
public class Record {
    int liked;

    public String getProfileBackground() {
        return profileBackground;
    }

    public String getUsername() {
        return username;
    }

    String profileBackground;
    String username;

    public Repost getRepost() {
        return repost;
    }

    public int getLiked() {
        return liked;
    }

    Repost repost;
}
