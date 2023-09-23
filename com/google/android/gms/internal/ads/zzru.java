package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzru extends zzrp {
    public static final Object zzd = new Object();
    private final Object zze;
    private final Object zzf;

    private zzru(zzci zzciVar, Object obj, Object obj2) {
        super(zzciVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zzru zzq(zzbb zzbbVar) {
        return new zzru(new zzrv(zzbbVar), zzch.zza, zzd);
    }

    public static zzru zzr(zzci zzciVar, Object obj, Object obj2) {
        return new zzru(zzciVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzrp, com.google.android.gms.internal.ads.zzci
    public final int zza(Object obj) {
        Object obj2;
        zzci zzciVar = this.zzc;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return zzciVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzrp, com.google.android.gms.internal.ads.zzci
    public final zzcf zzd(int i2, zzcf zzcfVar, boolean z) {
        this.zzc.zzd(i2, zzcfVar, z);
        if (zzeg.zzS(zzcfVar.zzc, this.zzf) && z) {
            zzcfVar.zzc = zzd;
        }
        return zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrp, com.google.android.gms.internal.ads.zzci
    public final zzch zze(int i2, zzch zzchVar, long j2) {
        this.zzc.zze(i2, zzchVar, j2);
        if (zzeg.zzS(zzchVar.zzc, this.zze)) {
            zzchVar.zzc = zzch.zza;
        }
        return zzchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrp, com.google.android.gms.internal.ads.zzci
    public final Object zzf(int i2) {
        Object zzf = this.zzc.zzf(i2);
        return zzeg.zzS(zzf, this.zzf) ? zzd : zzf;
    }

    public final zzru zzp(zzci zzciVar) {
        return new zzru(zzciVar, this.zze, this.zzf);
    }
}
