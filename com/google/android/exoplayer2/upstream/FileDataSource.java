package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import f.h.b.b.f2.e;
import f.h.b.b.f2.j;
import f.h.b.b.g2.b0;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* loaded from: classes.dex */
public final class FileDataSource extends e {

    /* renamed from: e  reason: collision with root package name */
    public RandomAccessFile f990e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f991f;

    /* renamed from: g  reason: collision with root package name */
    public long f992g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f993h;

    /* loaded from: classes.dex */
    public static class FileDataSourceException extends IOException {
        public FileDataSourceException(IOException iOException) {
            super(iOException);
        }

        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public FileDataSource() {
        super(false);
    }

    public static RandomAccessFile t(Uri uri) {
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            return new RandomAccessFile(path, "r");
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e2);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2);
        }
    }

    @Override // f.h.b.b.f2.f
    public int b(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f992g;
        if (j2 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f990e;
            int i4 = b0.a;
            int read = randomAccessFile.read(bArr, i2, (int) Math.min(j2, i3));
            if (read > 0) {
                this.f992g -= read;
                p(read);
            }
            return read;
        } catch (IOException e2) {
            throw new FileDataSourceException(e2);
        }
    }

    @Override // f.h.b.b.f2.i
    public void close() {
        this.f991f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f990e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e2) {
                throw new FileDataSourceException(e2);
            }
        } finally {
            this.f990e = null;
            if (this.f993h) {
                this.f993h = false;
                q();
            }
        }
    }

    @Override // f.h.b.b.f2.i
    public long i(j jVar) {
        try {
            Uri uri = jVar.a;
            this.f991f = uri;
            r(jVar);
            RandomAccessFile t = t(uri);
            this.f990e = t;
            t.seek(jVar.f4211e);
            long j2 = jVar.f4212f;
            if (j2 == -1) {
                j2 = this.f990e.length() - jVar.f4211e;
            }
            this.f992g = j2;
            if (j2 >= 0) {
                this.f993h = true;
                s(jVar);
                return this.f992g;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new FileDataSourceException(e2);
        }
    }

    @Override // f.h.b.b.f2.i
    public Uri n() {
        return this.f991f;
    }
}
