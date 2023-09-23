package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbyo extends zzbyi {
    public final /* synthetic */ List zza;

    public zzbyo(zzbyr zzbyrVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zze(String str) {
        zzcfi.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzf(List list) {
        zzcfi.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
