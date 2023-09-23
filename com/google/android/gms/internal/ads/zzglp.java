package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzglp implements zzglw {
    private final zzglw[] zza;

    public zzglp(zzglw... zzglwVarArr) {
        this.zza = zzglwVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzglw
    public final zzglv zzb(Class cls) {
        zzglw[] zzglwVarArr = this.zza;
        for (int i2 = 0; i2 < 2; i2++) {
            zzglw zzglwVar = zzglwVarArr[i2];
            if (zzglwVar.zzc(cls)) {
                return zzglwVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzglw
    public final boolean zzc(Class cls) {
        zzglw[] zzglwVarArr = this.zza;
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzglwVarArr[i2].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
