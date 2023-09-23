package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdmf implements zzbol {
    private final WeakReference zza;

    public /* synthetic */ zzdmf(zzdmg zzdmgVar, zzdme zzdmeVar) {
        this.zza = new WeakReference(zzdmgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zza(Object obj, Map map) {
        zzdmg zzdmgVar = (zzdmg) this.zza.get();
        if (zzdmgVar == null) {
            return;
        }
        zzdmg.zzb(zzdmgVar).zza();
    }
}
