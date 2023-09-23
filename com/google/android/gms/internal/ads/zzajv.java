package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzajv extends FilterInputStream {
    private final long zza;
    private long zzb;

    public zzajv(InputStream inputStream, long j2) {
        super(inputStream);
        this.zza = j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.zzb++;
        }
        return read;
    }

    public final long zza() {
        return this.zza - this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        int read = super.read(bArr, i2, i3);
        if (read != -1) {
            this.zzb += read;
        }
        return read;
    }
}
