package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdsc implements zzbol {
    public final /* synthetic */ zzdsd zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbol zzd;

    public /* synthetic */ zzdsc(zzdsd zzdsdVar, WeakReference weakReference, String str, zzbol zzbolVar, zzdsb zzdsbVar) {
        this.zza = zzdsdVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzk(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
