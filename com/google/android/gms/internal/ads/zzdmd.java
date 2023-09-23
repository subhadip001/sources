package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdmd implements zzbol {
    private final WeakReference zza;

    public /* synthetic */ zzdmd(zzdmg zzdmgVar, zzdmc zzdmcVar) {
        this.zza = new WeakReference(zzdmgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zza(Object obj, Map map) {
        zzdbq zzdbqVar;
        zzdjd zzdjdVar;
        zzdmg zzdmgVar = (zzdmg) this.zza.get();
        if (zzdmgVar == null) {
            return;
        }
        zzdbqVar = zzdmgVar.zzh;
        zzdbqVar.onAdClicked();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzif)).booleanValue()) {
            zzdjdVar = zzdmgVar.zzi;
            zzdjdVar.zzq();
        }
    }
}
