package com.google.android.exoplayer2.upstream;

import f.h.b.b.f2.j;
import java.io.IOException;

/* loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends IOException {
    public HttpDataSource$HttpDataSourceException(String str, j jVar, int i2) {
        super(str);
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, j jVar, int i2) {
        super(iOException);
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, j jVar, int i2) {
        super(str, iOException);
    }
}
