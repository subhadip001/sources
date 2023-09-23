package com.google.firebase.inappmessaging.display.internal;

import android.util.Log;

/* loaded from: classes2.dex */
public class Logging {
    private static final String TAG = "FIAM.Display";

    public static void logd(String str) {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, str);
        }
    }

    public static void logdHeader(String str) {
        logd("============ " + str + " ============");
    }

    public static void logdNumber(String str, float f2) {
        logd(str + ": " + f2);
    }

    public static void logdPair(String str, float f2, float f3) {
        logd(str + ": (" + f2 + ", " + f3 + ")");
    }

    public static void loge(String str) {
        Log.e(TAG, str);
    }

    public static void logi(String str) {
        if (Log.isLoggable(TAG, 4)) {
            Log.i(TAG, str);
        }
    }
}
