package com.google.firebase.remoteconfig;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    private final int httpStatusCode;

    public FirebaseRemoteConfigServerException(int i2, String str) {
        super(str);
        this.httpStatusCode = i2;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public FirebaseRemoteConfigServerException(int i2, String str, Throwable th) {
        super(str, th);
        this.httpStatusCode = i2;
    }
}
