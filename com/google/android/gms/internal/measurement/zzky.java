package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzky extends zzla {
    private zzky() {
        super(null);
    }

    public /* synthetic */ zzky(zzkx zzkxVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzla
    public final void zza(Object obj, long j2) {
        ((zzkm) zzmy.zzf(obj, j2)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzla
    public final void zzb(Object obj, Object obj2, long j2) {
        zzkm zzkmVar = (zzkm) zzmy.zzf(obj, j2);
        zzkm zzkmVar2 = (zzkm) zzmy.zzf(obj2, j2);
        int size = zzkmVar.size();
        int size2 = zzkmVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzkmVar.zzc()) {
                zzkmVar = zzkmVar.zzd(size2 + size);
            }
            zzkmVar.addAll(zzkmVar2);
        }
        if (size > 0) {
            zzkmVar2 = zzkmVar;
        }
        zzmy.zzs(obj, j2, zzkmVar2);
    }
}
