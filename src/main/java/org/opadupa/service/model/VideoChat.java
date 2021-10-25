package org.opadupa.service.model;

public class VideoChat extends Chat{

    public byte[] videoData;

    public byte[] getVideoData() {
        return videoData;
    }

    public void setVideoData(byte[] videoData) {
        this.videoData = videoData;
    }
}
