
package com.example.andresarango.midtermassessment.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Track {

    @SerializedName("albumTrackCount")
    @Expose
    private Integer albumTrackCount;
    @SerializedName("hasAudioTrackTimeline")
    @Expose
    private Integer hasAudioTrackTimeline;
    @SerializedName("trackName")
    @Expose
    private String trackName;
    @SerializedName("beatsPerMinute")
    @Expose
    private Integer beatsPerMinute;
    @SerializedName("albumTrackNumber")
    @Expose
    private Integer albumTrackNumber;
    @SerializedName("albumName")
    @Expose
    private String albumName;
    @SerializedName("releaseDate")
    @Expose
    private String releaseDate;
    @SerializedName("artistName")
    @Expose
    private String artistName;
    @SerializedName("albumArtist")
    @Expose
    private String albumArtist;
    @SerializedName("composer")
    @Expose
    private String composer;
    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("discNumber")
    @Expose
    private Integer discNumber;
    @SerializedName("discCount")
    @Expose
    private Integer discCount;

    /**
     * 
     * @return
     *     The albumTrackCount
     */
    public Integer getAlbumTrackCount() {
        return albumTrackCount;
    }

    /**
     * 
     * @param albumTrackCount
     *     The albumTrackCount
     */
    public void setAlbumTrackCount(Integer albumTrackCount) {
        this.albumTrackCount = albumTrackCount;
    }

    /**
     * 
     * @return
     *     The hasAudioTrackTimeline
     */
    public Integer getHasAudioTrackTimeline() {
        return hasAudioTrackTimeline;
    }

    /**
     * 
     * @param hasAudioTrackTimeline
     *     The hasAudioTrackTimeline
     */
    public void setHasAudioTrackTimeline(Integer hasAudioTrackTimeline) {
        this.hasAudioTrackTimeline = hasAudioTrackTimeline;
    }

    /**
     * 
     * @return
     *     The trackName
     */
    public String getTrackName() {
        return trackName;
    }

    /**
     * 
     * @param trackName
     *     The trackName
     */
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    /**
     * 
     * @return
     *     The beatsPerMinute
     */
    public Integer getBeatsPerMinute() {
        return beatsPerMinute;
    }

    /**
     * 
     * @param beatsPerMinute
     *     The beatsPerMinute
     */
    public void setBeatsPerMinute(Integer beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

    /**
     * 
     * @return
     *     The albumTrackNumber
     */
    public Integer getAlbumTrackNumber() {
        return albumTrackNumber;
    }

    /**
     * 
     * @param albumTrackNumber
     *     The albumTrackNumber
     */
    public void setAlbumTrackNumber(Integer albumTrackNumber) {
        this.albumTrackNumber = albumTrackNumber;
    }

    /**
     * 
     * @return
     *     The albumName
     */
    public String getAlbumName() {
        return albumName;
    }

    /**
     * 
     * @param albumName
     *     The albumName
     */
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    /**
     * 
     * @return
     *     The releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * 
     * @param releaseDate
     *     The releaseDate
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * 
     * @return
     *     The artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * 
     * @param artistName
     *     The artistName
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * 
     * @return
     *     The albumArtist
     */
    public String getAlbumArtist() {
        return albumArtist;
    }

    /**
     * 
     * @param albumArtist
     *     The albumArtist
     */
    public void setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }

    /**
     * 
     * @return
     *     The composer
     */
    public String getComposer() {
        return composer;
    }

    /**
     * 
     * @param composer
     *     The composer
     */
    public void setComposer(String composer) {
        this.composer = composer;
    }

    /**
     * 
     * @return
     *     The genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * 
     * @param genre
     *     The genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * 
     * @return
     *     The discNumber
     */
    public Integer getDiscNumber() {
        return discNumber;
    }

    /**
     * 
     * @param discNumber
     *     The discNumber
     */
    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }

    /**
     * 
     * @return
     *     The discCount
     */
    public Integer getDiscCount() {
        return discCount;
    }

    /**
     * 
     * @param discCount
     *     The discCount
     */
    public void setDiscCount(Integer discCount) {
        this.discCount = discCount;
    }

}
