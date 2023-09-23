package com.bumptech.glide.load;

import java.io.IOException;

/* loaded from: classes.dex */
public final class HttpException extends IOException {
    public HttpException(String str, int i2, Throwable th) {
        super(str + ", status code: " + i2, th);
    }
}
