package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbde extends PushbackInputStream {
    public final /* synthetic */ zzbdf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbde(zzbdf zzbdfVar, InputStream inputStream, int i2) {
        super(inputStream, 1);
        this.zza = zzbdfVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        zzbdh.zze(this.zza.zzc);
        super.close();
    }
}
