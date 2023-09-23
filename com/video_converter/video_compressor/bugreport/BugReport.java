package com.video_converter.video_compressor.bugreport;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import f.h.f.y.b;
import java.io.Serializable;

@Keep
/* loaded from: classes2.dex */
public class BugReport implements Serializable {
    @b("command")
    public String command;
    @b("model")
    public String deviceModel;
    @b("errorMessage")
    public String errorMessage;
    @b("fileCount")
    public int fileCount;
    @b(NotificationCompat.MessagingStyle.Message.KEY_TIMESTAMP)
    public String time;

    public BugReport() {
        this.fileCount = 0;
        this.command = "Not Added";
    }

    public String getCommand() {
        return this.command;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public int getFileCount() {
        return this.fileCount;
    }

    public String getTime() {
        return this.time;
    }

    public void setCommand(String str) {
        this.command = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setFileCount(int i2) {
        this.fileCount = i2;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public BugReport(String str, String str2, String str3, String str4) {
        this.fileCount = 0;
        this.command = str;
        this.time = str3;
        this.errorMessage = str2;
        this.deviceModel = str4;
    }
}
