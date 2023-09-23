package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzglk extends zzglm {
    private zzglk() {
        super(null);
    }

    public /* synthetic */ zzglk(zzglj zzgljVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final List zza(Object obj, long j2) {
        zzgkx zzgkxVar = (zzgkx) zzgns.zzh(obj, j2);
        if (zzgkxVar.zzc()) {
            return zzgkxVar;
        }
        int size = zzgkxVar.size();
        zzgkx zzd = zzgkxVar.zzd(size == 0 ? 10 : size + size);
        zzgns.zzv(obj, j2, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final void zzb(Object obj, long j2) {
        ((zzgkx) zzgns.zzh(obj, j2)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final void zzc(Object obj, Object obj2, long j2) {
        zzgkx zzgkxVar = (zzgkx) zzgns.zzh(obj, j2);
        zzgkx zzgkxVar2 = (zzgkx) zzgns.zzh(obj2, j2);
        int size = zzgkxVar.size();
        int size2 = zzgkxVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgkxVar.zzc()) {
                zzgkxVar = zzgkxVar.zzd(size2 + size);
            }
            zzgkxVar.addAll(zzgkxVar2);
        }
        if (size > 0) {
            zzgkxVar2 = zzgkxVar;
        }
        zzgns.zzv(obj, j2, zzgkxVar2);
    }
}
