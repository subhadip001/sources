package com.arthenica.ffmpegkit.usecase;

import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.LogCallback;
import com.arthenica.ffmpegkit.StatisticsCallback;

/* loaded from: classes.dex */
public class Task {
    private String[] command;
    private LogCallback logCallback;
    private ExecuteBinaryResponseHandler responseHandler;
    private FFmpegSessionCompleteCallback sessionCompleteCallback;
    private StatisticsCallback statisticsCallback;

    public Task(String[] strArr, ExecuteBinaryResponseHandler executeBinaryResponseHandler) {
        this.command = strArr;
        this.responseHandler = executeBinaryResponseHandler;
    }

    public String[] getCommand() {
        return this.command;
    }

    public LogCallback getLogCallback() {
        return this.logCallback;
    }

    public ExecuteBinaryResponseHandler getResponseHandler() {
        return this.responseHandler;
    }

    public FFmpegSessionCompleteCallback getSessionCompleteCallback() {
        return this.sessionCompleteCallback;
    }

    public StatisticsCallback getStatisticsCallback() {
        return this.statisticsCallback;
    }

    public void setCommand(String[] strArr) {
        this.command = strArr;
    }

    public void setExecuteCallback(FFmpegSessionCompleteCallback fFmpegSessionCompleteCallback) {
        this.sessionCompleteCallback = fFmpegSessionCompleteCallback;
    }

    public void setLogCallback(LogCallback logCallback) {
        this.logCallback = logCallback;
    }

    public void setResponseHandler(ExecuteBinaryResponseHandler executeBinaryResponseHandler) {
        this.responseHandler = executeBinaryResponseHandler;
    }

    public void setStatisticsCallback(StatisticsCallback statisticsCallback) {
        this.statisticsCallback = statisticsCallback;
    }
}
