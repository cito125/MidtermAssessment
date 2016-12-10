
package com.example.andresarango.midtermassessment.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AudioTrack {

    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("deleted")
    @Expose
    private Object deleted;
    @SerializedName("trackId")
    @Expose
    private Integer trackId;
    @SerializedName("modified")
    @Expose
    private Object modified;
    @SerializedName("numberOfMeasures")
    @Expose
    private Integer numberOfMeasures;
    @SerializedName("track")
    @Expose
    private Track track;
    @SerializedName("audioOffset")
    @Expose
    private Double audioOffset;
    @SerializedName("snapToBeat")
    @Expose
    private Integer snapToBeat;
    @SerializedName("linkId")
    @Expose
    private Integer linkId;
    @SerializedName("duration")
    @Expose
    private Double duration;
    @SerializedName("averageBpm")
    @Expose
    private Integer averageBpm;
    @SerializedName("videoOffset")
    @Expose
    private Double videoOffset;

    /**
     * 
     * @return
     *     The origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * 
     * @param origin
     *     The origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * 
     * @return
     *     The created
     */
    public String getCreated() {
        return created;
    }

    /**
     * 
     * @param created
     *     The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * 
     * @return
     *     The deleted
     */
    public Object getDeleted() {
        return deleted;
    }

    /**
     * 
     * @param deleted
     *     The deleted
     */
    public void setDeleted(Object deleted) {
        this.deleted = deleted;
    }

    /**
     * 
     * @return
     *     The trackId
     */
    public Integer getTrackId() {
        return trackId;
    }

    /**
     * 
     * @param trackId
     *     The trackId
     */
    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    /**
     * 
     * @return
     *     The modified
     */
    public Object getModified() {
        return modified;
    }

    /**
     * 
     * @param modified
     *     The modified
     */
    public void setModified(Object modified) {
        this.modified = modified;
    }

    /**
     * 
     * @return
     *     The numberOfMeasures
     */
    public Integer getNumberOfMeasures() {
        return numberOfMeasures;
    }

    /**
     * 
     * @param numberOfMeasures
     *     The numberOfMeasures
     */
    public void setNumberOfMeasures(Integer numberOfMeasures) {
        this.numberOfMeasures = numberOfMeasures;
    }

    /**
     * 
     * @return
     *     The track
     */
    public Track getTrack() {
        return track;
    }

    /**
     * 
     * @param track
     *     The track
     */
    public void setTrack(Track track) {
        this.track = track;
    }

    /**
     * 
     * @return
     *     The audioOffset
     */
    public Double getAudioOffset() {
        return audioOffset;
    }

    /**
     * 
     * @param audioOffset
     *     The audioOffset
     */
    public void setAudioOffset(Double audioOffset) {
        this.audioOffset = audioOffset;
    }

    /**
     * 
     * @return
     *     The snapToBeat
     */
    public Integer getSnapToBeat() {
        return snapToBeat;
    }

    /**
     * 
     * @param snapToBeat
     *     The snapToBeat
     */
    public void setSnapToBeat(Integer snapToBeat) {
        this.snapToBeat = snapToBeat;
    }

    /**
     * 
     * @return
     *     The linkId
     */
    public Integer getLinkId() {
        return linkId;
    }

    /**
     * 
     * @param linkId
     *     The linkId
     */
    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The averageBpm
     */
    public Integer getAverageBpm() {
        return averageBpm;
    }

    /**
     * 
     * @param averageBpm
     *     The averageBpm
     */
    public void setAverageBpm(Integer averageBpm) {
        this.averageBpm = averageBpm;
    }

    /**
     * 
     * @return
     *     The videoOffset
     */
    public Double getVideoOffset() {
        return videoOffset;
    }

    /**
     * 
     * @param videoOffset
     *     The videoOffset
     */
    public void setVideoOffset(Double videoOffset) {
        this.videoOffset = videoOffset;
    }

}
