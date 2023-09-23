package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbv {
    private final zzw zza = new zzw();

    public final zzbv zza(int i2) {
        this.zza.zza(i2);
        return this;
    }

    public final zzbv zzb(zzbx zzbxVar) {
        zzy zzyVar;
        zzw zzwVar = this.zza;
        zzyVar = zzbxVar.zzc;
        for (int i2 = 0; i2 < zzyVar.zzb(); i2++) {
            zzwVar.zza(zzyVar.zza(i2));
        }
        return this;
    }

    public final zzbv zzc(int... iArr) {
        zzw zzwVar = this.zza;
        for (int i2 = 0; i2 < 20; i2++) {
            zzwVar.zza(iArr[i2]);
        }
        return this;
    }

    public final zzbv zzd(int i2, boolean z) {
        zzw zzwVar = this.zza;
        if (z) {
            zzwVar.zza(i2);
        }
        return this;
    }

    public final zzbx zze() {
        return new zzbx(this.zza.zzb(), null);
    }
}
