package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzakf extends ByteArrayOutputStream {
    private final zzajs zza;

    public zzakf(zzajs zzajsVar, int i2) {
        this.zza = zzajsVar;
        ((ByteArrayOutputStream) this).buf = zzajsVar.zzb(Math.max(i2, 256));
    }

    private final void zza(int i2) {
        int i3 = ((ByteArrayOutputStream) this).count;
        if (i3 + i2 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i4 = i3 + i2;
        byte[] zzb = this.zza.zzb(i4 + i4);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, zzb, 0, ((ByteArrayOutputStream) this).count);
        this.zza.zza(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = zzb;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.zza(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zza(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i2) {
        zza(1);
        super.write(i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i2, int i3) {
        zza(i3);
        super.write(bArr, i2, i3);
    }
}
