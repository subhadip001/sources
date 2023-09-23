package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import f.h.b.b.f2.e;
import f.h.b.b.g2.b0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class RawResourceDataSource extends e {

    /* renamed from: e  reason: collision with root package name */
    public final Resources f1006e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1007f;

    /* renamed from: g  reason: collision with root package name */
    public Uri f1008g;

    /* renamed from: h  reason: collision with root package name */
    public AssetFileDescriptor f1009h;

    /* renamed from: i  reason: collision with root package name */
    public InputStream f1010i;

    /* renamed from: j  reason: collision with root package name */
    public long f1011j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1012k;

    /* loaded from: classes.dex */
    public static class RawResourceDataSourceException extends IOException {
        public RawResourceDataSourceException(String str) {
            super(str);
        }

        public RawResourceDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f1006e = context.getResources();
        this.f1007f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i2) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i2);
        return Uri.parse(sb.toString());
    }

    @Override // f.h.b.b.f2.f
    public int b(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f1011j;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new RawResourceDataSourceException(e2);
            }
        }
        InputStream inputStream = this.f1010i;
        int i4 = b0.a;
        int read = inputStream.read(bArr, i2, i3);
        if (read == -1) {
            if (this.f1011j == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException(new EOFException());
        }
        long j3 = this.f1011j;
        if (j3 != -1) {
            this.f1011j = j3 - read;
        }
        p(read);
        return read;
    }

    @Override // f.h.b.b.f2.i
    public void close() {
        this.f1008g = null;
        try {
            try {
                InputStream inputStream = this.f1010i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f1010i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f1009h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new RawResourceDataSourceException(e2);
                    }
                } finally {
                    this.f1009h = null;
                    if (this.f1012k) {
                        this.f1012k = false;
                        q();
                    }
                }
            } catch (Throwable th) {
                this.f1010i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f1009h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f1009h = null;
                        if (this.f1012k) {
                            this.f1012k = false;
                            q();
                        }
                        throw th;
                    } catch (IOException e3) {
                        throw new RawResourceDataSourceException(e3);
                    }
                } finally {
                    this.f1009h = null;
                    if (this.f1012k) {
                        this.f1012k = false;
                        q();
                    }
                }
            }
        } catch (IOException e4) {
            throw new RawResourceDataSourceException(e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r1.matches("\\d+") != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    @Override // f.h.b.b.f2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long i(f.h.b.b.f2.j r8) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.i(f.h.b.b.f2.j):long");
    }

    @Override // f.h.b.b.f2.i
    public Uri n() {
        return this.f1008g;
    }
}
