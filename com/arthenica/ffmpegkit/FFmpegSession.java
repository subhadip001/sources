package com.arthenica.ffmpegkit;

import f.a.b.a.a;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class FFmpegSession extends AbstractSession implements Session {
    private final FFmpegSessionCompleteCallback completeCallback;
    private final List<Statistics> statistics;
    private final StatisticsCallback statisticsCallback;
    private final Object statisticsLock;

    private FFmpegSession(String[] strArr, FFmpegSessionCompleteCallback fFmpegSessionCompleteCallback, LogCallback logCallback, StatisticsCallback statisticsCallback, LogRedirectionStrategy logRedirectionStrategy) {
        super(strArr, logCallback, logRedirectionStrategy);
        this.completeCallback = fFmpegSessionCompleteCallback;
        this.statisticsCallback = statisticsCallback;
        this.statistics = new LinkedList();
        this.statisticsLock = new Object();
    }

    public static FFmpegSession create(String[] strArr) {
        return new FFmpegSession(strArr, null, null, null, FFmpegKitConfig.getLogRedirectionStrategy());
    }

    public void addStatistics(Statistics statistics) {
        synchronized (this.statisticsLock) {
            this.statistics.add(statistics);
        }
    }

    public List<Statistics> getAllStatistics(int i2) {
        waitForAsynchronousMessagesInTransmit(i2);
        if (thereAreAsynchronousMessagesInTransmit()) {
            android.util.Log.i(FFmpegKitConfig.TAG, String.format("getAllStatistics was called to return all statistics but there are still statistics being transmitted for session id %d.", Long.valueOf(this.sessionId)));
        }
        return getStatistics();
    }

    public FFmpegSessionCompleteCallback getCompleteCallback() {
        return this.completeCallback;
    }

    public Statistics getLastReceivedStatistics() {
        synchronized (this.statisticsLock) {
            if (this.statistics.size() > 0) {
                List<Statistics> list = this.statistics;
                return list.get(list.size() - 1);
            }
            return null;
        }
    }

    public List<Statistics> getStatistics() {
        List<Statistics> list;
        synchronized (this.statisticsLock) {
            list = this.statistics;
        }
        return list;
    }

    public StatisticsCallback getStatisticsCallback() {
        return this.statisticsCallback;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public boolean isFFmpeg() {
        return true;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public boolean isFFprobe() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public boolean isMediaInformation() {
        return false;
    }

    public String toString() {
        StringBuilder D = a.D("FFmpegSession{", "sessionId=");
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

    public static FFmpegSession create(String[] strArr, FFmpegSessionCompleteCallback fFmpegSessionCompleteCallback) {
        return new FFmpegSession(strArr, fFmpegSessionCompleteCallback, null, null, FFmpegKitConfig.getLogRedirectionStrategy());
    }

    public static FFmpegSession create(String[] strArr, FFmpegSessionCompleteCallback fFmpegSessionCompleteCallback, LogCallback logCallback, StatisticsCallback statisticsCallback) {
        return new FFmpegSession(strArr, fFmpegSessionCompleteCallback, logCallback, statisticsCallback, FFmpegKitConfig.getLogRedirectionStrategy());
    }

    public static FFmpegSession create(String[] strArr, FFmpegSessionCompleteCallback fFmpegSessionCompleteCallback, LogCallback logCallback, StatisticsCallback statisticsCallback, LogRedirectionStrategy logRedirectionStrategy) {
        return new FFmpegSession(strArr, fFmpegSessionCompleteCallback, logCallback, statisticsCallback, logRedirectionStrategy);
    }

    public List<Statistics> getAllStatistics() {
        return getAllStatistics(AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT);
    }
}
