package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import f.h.b.b.f2.e;
import f.h.b.b.f2.j;
import f.h.b.b.g2.b0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class ContentDataSource extends e {

    /* renamed from: e  reason: collision with root package name */
    public final ContentResolver f984e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f985f;

    /* renamed from: g  reason: collision with root package name */
    public AssetFileDescriptor f986g;

    /* renamed from: h  reason: collision with root package name */
    public FileInputStream f987h;

    /* renamed from: i  reason: collision with root package name */
    public long f988i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f989j;

    /* loaded from: classes.dex */
    public static class ContentDataSourceException extends IOException {
        public ContentDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f984e = context.getContentResolver();
    }

    @Override // f.h.b.b.f2.f
    public int b(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f988i;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new ContentDataSourceException(e2);
            }
        }
        FileInputStream fileInputStream = this.f987h;
        int i4 = b0.a;
        int read = fileInputStream.read(bArr, i2, i3);
        if (read == -1) {
            if (this.f988i == -1) {
                return -1;
            }
            throw new ContentDataSourceException(new EOFException());
        }
        long j3 = this.f988i;
        if (j3 != -1) {
            this.f988i = j3 - read;
        }
        p(read);
        return read;
    }

    @Override // f.h.b.b.f2.i
    public void close() {
        this.f985f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f987h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f987h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f986g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new ContentDataSourceException(e2);
                    }
                } finally {
                    this.f986g = null;
                    if (this.f989j) {
                        this.f989j = false;
                        q();
                    }
                }
            } catch (Throwable th) {
                this.f987h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f986g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f986g = null;
                        if (this.f989j) {
                            this.f989j = false;
                            q();
                        }
                        throw th;
                    } catch (IOException e3) {
                        throw new ContentDataSourceException(e3);
                    }
                } finally {
                    this.f986g = null;
                    if (this.f989j) {
                        this.f989j = false;
                        q();
                    }
                }
            }
        } catch (IOException e4) {
            throw new ContentDataSourceException(e4);
        }
    }

    @Override // f.h.b.b.f2.i
    public long i(j jVar) {
        try {
            Uri uri = jVar.a;
            this.f985f = uri;
            r(jVar);
            AssetFileDescriptor openAssetFileDescriptor = this.f984e.openAssetFileDescriptor(uri, "r");
            this.f986g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f987h = fileInputStream;
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(jVar.f4211e + startOffset) - startOffset;
                if (skip == jVar.f4211e) {
                    long j2 = jVar.f4212f;
                    if (j2 != -1) {
                        this.f988i = j2;
                    } else {
                        long length = openAssetFileDescriptor.getLength();
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.f988i = -1L;
                            } else {
                                long position = size - channel.position();
                                this.f988i = position;
                                if (position < 0) {
                                    throw new EOFException();
                                }
                            }
                        } else {
                            long j3 = length - skip;
                            this.f988i = j3;
                            if (j3 < 0) {
                                throw new EOFException();
                            }
                        }
                    }
                    this.f989j = true;
                    s(jVar);
                    return this.f988i;
                }
                throw new EOFException();
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(valueOf.length() + 36);
            sb.append("Could not open file descriptor for: ");
            sb.append(valueOf);
            throw new FileNotFoundException(sb.toString());
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2);
        }
    }

    @Override // f.h.b.b.f2.i
    public Uri n() {
        return this.f985f;
    }
}
