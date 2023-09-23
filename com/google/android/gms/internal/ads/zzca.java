package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzca {
    public static final zzl zza = new zzl() { // from class: com.google.android.gms.internal.ads.zzbz
    };
    public final Object zzb;
    public final int zzc;
    public final zzbb zzd;
    public final Object zze;
    public final int zzf;
    public final long zzg;
    public final long zzh;
    public final int zzi;
    public final int zzj;

    public zzca(Object obj, int i2, zzbb zzbbVar, Object obj2, int i3, long j2, long j3, int i4, int i5) {
        this.zzb = obj;
        this.zzc = i2;
        this.zzd = zzbbVar;
        this.zze = obj2;
        this.zzf = i3;
        this.zzg = j2;
        this.zzh = j3;
        this.zzi = i4;
        this.zzj = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzca.class == obj.getClass()) {
            zzca zzcaVar = (zzca) obj;
            if (this.zzc == zzcaVar.zzc && this.zzf == zzcaVar.zzf && this.zzg == zzcaVar.zzg && this.zzh == zzcaVar.zzh && this.zzi == zzcaVar.zzi && this.zzj == zzcaVar.zzj && zzfoo.zza(this.zzb, zzcaVar.zzb) && zzfoo.zza(this.zze, zzcaVar.zze) && zzfoo.zza(this.zzd, zzcaVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, Integer.valueOf(this.zzf), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Integer.valueOf(this.zzi), Integer.valueOf(this.zzj)});
    }
}
