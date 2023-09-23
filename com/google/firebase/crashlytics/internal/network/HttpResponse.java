package com.google.firebase.crashlytics.internal.network;

/* loaded from: classes2.dex */
public class HttpResponse {
    private final String body;
    private final int code;

    public HttpResponse(int i2, String str) {
        this.code = i2;
        this.body = str;
    }

    public String body() {
        return this.body;
    }

    public int code() {
        return this.code;
    }
}
