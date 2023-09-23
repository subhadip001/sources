package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes2.dex */
public interface FileLogStore {
    void closeLogFile();

    void deleteLogFile();

    byte[] getLogAsBytes();

    String getLogAsString();

    void writeToLog(long j2, String str);
}
