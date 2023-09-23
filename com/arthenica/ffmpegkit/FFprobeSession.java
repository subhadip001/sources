package com.arthenica.ffmpegkit;

import f.a.b.a.a;

/* loaded from: classes.dex */
public class FFprobeSession extends AbstractSession implements Session {
    private final FFprobeSessionCompleteCallback completeCallback;

    private FFprobeSession(String[] strArr, FFprobeSessionCompleteCallback fFprobeSessionCompleteCallback, LogCallback logCallback, LogRedirectionStrategy logRedirectionStrategy) {
        super(strArr, logCallback, logRedirectionStrategy);
        this.completeCallback = fFprobeSessionCompleteCallback;
    }

    public static FFprobeSession create(String[] strArr) {
        return new FFprobeSession(strArr, null, null, FFmpegKitConfig.getLogRedirectionStrategy());
    }

    public FFprobeSessionCompleteCallback getCompleteCallback() {
        return this.completeCallback;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public boolean isFFmpeg() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public boolean isFFprobe() {
        return true;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public boolean isMediaInformation() {
        return false;
    }

    public String toString() {
        StringBuilder D = a.D("FFprobeSession{", "sessionId=");
        D.append(this.sessionId);
        D.append(", createTime=");
        D.append(this.createTime);
        D.append(", startTime=");
        D.append(this.startTime);
        D.append(", endTime=");
        D.append(this.endTime);
        D.append(", arguments=");
        D.append(FFmpegKitConfig.argumentsToString(this.arguments));
        D.append(", logs=");
        D.append(getLogsAsString());
        D.append(", state=");
        D.append(this.state);
        D.append(", returnCode=");
        D.append(this.returnCode);
        D.append(", failStackTrace=");
        D.append('\'');
        D.append(this.failStackTrace);
        D.append('\'');
        D.append('}');
        return D.toString();
    }

    public static FFprobeSession create(String[] strArr, FFprobeSessionCompleteCallback fFprobeSessionCompleteCallback) {
        return new FFprobeSession(strArr, fFprobeSessionCompleteCallback, null, FFmpegKitConfig.getLogRedirectionStrategy());
    }

    public static FFprobeSession create(String[] strArr, FFprobeSessionCompleteCallback fFprobeSessionCompleteCallback, LogCallback logCallback) {
        return new FFprobeSession(strArr, fFprobeSessionCompleteCallback, logCallback, FFmpegKitConfig.getLogRedirectionStrategy());
    }

    public static FFprobeSession create(String[] strArr, FFprobeSessionCompleteCallback fFprobeSessionCompleteCallback, LogCallback logCallback, LogRedirectionStrategy logRedirectionStrategy) {
        return new FFprobeSession(strArr, fFprobeSessionCompleteCallback, logCallback, logRedirectionStrategy);
    }
}
