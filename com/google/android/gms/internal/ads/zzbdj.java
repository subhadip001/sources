package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbdj {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbdj(InputStream inputStream, boolean z, boolean z2, long j2, boolean z3) {
        this.zza = inputStream;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = j2;
        this.zze = z3;
    }

    public static zzbdj zzb(InputStream inputStream, boolean z, boolean z2, long j2, boolean z3) {
        return new zzbdj(inputStream, z, z2, j2, z3);
    }

    public final long zza() {
        return this.zzd;
    }

    public final InputStream zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return this.zzc;
    }
}
