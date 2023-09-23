package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzld implements zzlk {
    private final zzlk[] zza;

    public zzld(zzlk... zzlkVarArr) {
        this.zza = zzlkVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final zzlj zzb(Class cls) {
        zzlk[] zzlkVarArr = this.zza;
        for (int i2 = 0; i2 < 2; i2++) {
            zzlk zzlkVar = zzlkVarArr[i2];
            if (zzlkVar.zzc(cls)) {
                return zzlkVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final boolean zzc(Class cls) {
        zzlk[] zzlkVarArr = this.zza;
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzlkVarArr[i2].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
