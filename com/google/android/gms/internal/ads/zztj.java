package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zztj implements zzvq {
    public long zza;
    public long zzb;
    public zzvp zzc;
    public zztj zzd;

    public zztj(long j2, int i2) {
        zze(j2, LogFileManager.MAX_LOG_SIZE);
    }

    public final int zza(long j2) {
        long j3 = this.zza;
        int i2 = this.zzc.zzb;
        return (int) (j2 - j3);
    }

    public final zztj zzb() {
        this.zzc = null;
        zztj zztjVar = this.zzd;
        this.zzd = null;
        return zztjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final zzvp zzc() {
        zzvp zzvpVar = this.zzc;
        Objects.requireNonNull(zzvpVar);
        return zzvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final zzvq zzd() {
        zztj zztjVar = this.zzd;
        if (zztjVar == null || zztjVar.zzc == null) {
            return null;
        }
        return zztjVar;
    }

    public final void zze(long j2, int i2) {
        zzcw.zzf(this.zzc == null);
        this.zza = j2;
        this.zzb = j2 + 65536;
    }
}
