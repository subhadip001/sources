package com.arthenica.ffmpegkit;

import f.a.b.a.a;

/* loaded from: classes.dex */
public class MediaInformationSession extends AbstractSession implements Session {
    private final MediaInformationSessionCompleteCallback completeCallback;
    private MediaInformation mediaInformation;

    private MediaInformationSession(String[] strArr, MediaInformationSessionCompleteCallback mediaInformationSessionCompleteCallback, LogCallback logCallback) {
        super(strArr, logCallback, LogRedirectionStrategy.NEVER_PRINT_LOGS);
        this.completeCallback = mediaInformationSessionCompleteCallback;
    }

    public static MediaInformationSession create(String[] strArr) {
        return new MediaInformationSession(strArr, null, null);
    }

    public MediaInformationSessionCompleteCallback getCompleteCallback() {
        return this.completeCallback;
    }

    public MediaInformation getMediaInformation() {
        return this.mediaInformation;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public boolean isFFmpeg() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public boolean isFFprobe() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public boolean isMediaInformation() {
        return true;
    }

    public void setMediaInformation(MediaInformation mediaInformation) {
        this.mediaInformation = mediaInformation;
    }

    public String toString() {
        StringBuilder D = a.D("MediaInformationSession{", "sessionId=");
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

    public static MediaInformationSession create(String[] strArr, MediaInformationSessionCompleteCallback mediaInformationSessionCompleteCallback) {
        return new MediaInformationSession(strArr, mediaInformationSessionCompleteCallback, null);
    }

    public static MediaInformationSession create(String[] strArr, MediaInformationSessionCompleteCallback mediaInformationSessionCompleteCallback, LogCallback logCallback) {
        return new MediaInformationSession(strArr, mediaInformationSessionCompleteCallback, logCallback);
    }
}
