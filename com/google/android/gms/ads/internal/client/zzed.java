package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbql;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzed extends zzbql {
    public final /* synthetic */ zzee zza;

    public /* synthetic */ zzed(zzee zzeeVar, zzec zzecVar) {
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqm
    public final void zzb(List list) {
        InitializationStatus zzA;
        ArrayList arrayList;
        ArrayList arrayList2;
        this.zza.zze = false;
        this.zza.zzf = true;
        zzee zzeeVar = this.zza;
        zzA = zzee.zzA(list);
        arrayList = zzee.zzf().zzb;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((OnInitializationCompleteListener) arrayList.get(i2)).onInitializationComplete(zzA);
        }
        arrayList2 = zzee.zzf().zzb;
        arrayList2.clear();
    }
}
