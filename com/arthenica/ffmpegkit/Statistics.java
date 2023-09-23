package com.arthenica.ffmpegkit;

import f.a.b.a.a;

/* loaded from: classes.dex */
public class Statistics {
    private double bitrate;
    private long sessionId;
    private long size;
    private double speed;
    private int time;
    private float videoFps;
    private int videoFrameNumber;
    private float videoQuality;

    public Statistics(long j2, int i2, float f2, float f3, long j3, int i3, double d2, double d3) {
        this.sessionId = j2;
        this.videoFrameNumber = i2;
        this.videoFps = f2;
        this.videoQuality = f3;
        this.size = j3;
        this.time = i3;
        this.bitrate = d2;
        this.speed = d3;
    }

    public double getBitrate() {
        return this.bitrate;
    }

    public long getSessionId() {
        return this.sessionId;
    }

    public long getSize() {
        return this.size;
    }

    public double getSpeed() {
        return this.speed;
    }

    public int getTime() {
        return this.time;
    }

    public float getVideoFps() {
        return this.videoFps;
    }

    public int getVideoFrameNumber() {
        return this.videoFrameNumber;
    }

    public float getVideoQuality() {
        return this.videoQuality;
    }

    public void setBitrate(double d2) {
        this.bitrate = d2;
    }

    public void setSessionId(long j2) {
        this.sessionId = j2;
    }

    public void setSize(long j2) {
        this.size = j2;
    }

    public void setSpeed(double d2) {
        this.speed = d2;
    }

    public void setTime(int i2) {
        this.time = i2;
    }

    public void setVideoFps(float f2) {
        this.videoFps = f2;
    }

    public void setVideoFrameNumber(int i2) {
        this.videoFrameNumber = i2;
    }

    public void setVideoQuality(float f2) {
        this.videoQuality = f2;
    }

    public String toString() {
        StringBuilder D = a.D("Statistics{", "sessionId=");
        D.append(this.sessionId);
        D.append(", videoFrameNumber=");
        D.append(this.videoFrameNumber);
        D.append(", videoFps=");
        D.append(this.videoFps);
        D.append(", videoQuality=");
        D.append(this.videoQuality);
        D.append(", size=");
        D.append(this.size);
        D.append(", time=");
        D.append(this.time);
        D.append(", bitrate=");
        D.append(this.bitrate);
        D.append(", speed=");
        D.append(this.speed);
        D.append('}');
        return D.toString();
    }
}
