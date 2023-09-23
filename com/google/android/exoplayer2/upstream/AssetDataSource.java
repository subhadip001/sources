package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import f.h.b.b.f2.e;
import f.h.b.b.f2.j;
import f.h.b.b.g2.b0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AssetDataSource extends e {

    /* renamed from: e  reason: collision with root package name */
    public final AssetManager f979e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f980f;

    /* renamed from: g  reason: collision with root package name */
    public InputStream f981g;

    /* renamed from: h  reason: collision with root package name */
    public long f982h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f983i;

    /* loaded from: classes.dex */
    public static final class AssetDataSourceException extends IOException {
        public AssetDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f979e = context.getAssets();
    }

    @Override // f.h.b.b.f2.f
    public int b(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f982h;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new AssetDataSourceException(e2);
            }
        }
        InputStream inputStream = this.f981g;
        int i4 = b0.a;
        int read = inputStream.read(bArr, i2, i3);
        if (read == -1) {
            if (this.f982h == -1) {
                return -1;
            }
            throw new AssetDataSourceException(new EOFException());
        }
        long j3 = this.f982h;
        if (j3 != -1) {
            this.f982h = j3 - read;
        }
        p(read);
        return read;
    }

    @Override // f.h.b.b.f2.i
    public void close() {
        this.f980f = null;
        try {
            try {
                InputStream inputStream = this.f981g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e2) {
                throw new AssetDataSourceException(e2);
            }
        } finally {
            this.f981g = null;
            if (this.f983i) {
                this.f983i = false;
                q();
            }
        }
    }

    @Override // f.h.b.b.f2.i
    public long i(j jVar) {
        try {
            Uri uri = jVar.a;
            this.f980f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            r(jVar);
            InputStream open = this.f979e.open(path, 1);
            this.f981g = open;
            if (open.skip(jVar.f4211e) >= jVar.f4211e) {
                long j2 = jVar.f4212f;
                if (j2 != -1) {
                    this.f982h = j2;
                } else {
                    long available = this.f981g.available();
                    this.f982h = available;
                    if (available == 2147483647L) {
                        this.f982h = -1L;
                    }
                }
                this.f983i = true;
                s(jVar);
                return this.f982h;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new AssetDataSourceException(e2);
        }
    }

    @Override // f.h.b.b.f2.i
    public Uri n() {
        return this.f980f;
    }
}
