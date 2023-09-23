package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class zzs extends zzai {
    public final boolean zza;
    public final boolean zzb;
    public final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z, boolean z2) {
        super("log");
        this.zzc = zztVar;
        this.zza = z;
        this.zzb = z2;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzr zzrVar;
        zzr zzrVar2;
        zzr zzrVar3;
        zzh.zzi("log", 1, list);
        if (list.size() == 1) {
            zzrVar3 = this.zzc.zza;
            zzrVar3.zza(3, zzgVar.zzb((zzap) list.get(0)).zzi(), Collections.emptyList(), this.zza, this.zzb);
            return zzap.zzf;
        }
        int zzb = zzh.zzb(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
        int i2 = zzb != 2 ? zzb != 3 ? zzb != 5 ? zzb != 6 ? 3 : 2 : 5 : 1 : 4;
        String zzi = zzgVar.zzb((zzap) list.get(1)).zzi();
        if (list.size() == 2) {
            zzrVar2 = this.zzc.zza;
            zzrVar2.zza(i2, zzi, Collections.emptyList(), this.zza, this.zzb);
            return zzap.zzf;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
            arrayList.add(zzgVar.zzb((zzap) list.get(i3)).zzi());
        }
        zzrVar = this.zzc.zza;
        zzrVar.zza(i2, zzi, arrayList, this.zza, this.zzb);
        return zzap.zzf;
    }
}
