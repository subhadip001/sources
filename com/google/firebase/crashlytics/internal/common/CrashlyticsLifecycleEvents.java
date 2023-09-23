package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
public interface CrashlyticsLifecycleEvents {
    void onBeginSession(String str, long j2);

    void onCustomKey(String str, String str2);

    void onLog(long j2, String str);

    void onUserId(String str);
}
