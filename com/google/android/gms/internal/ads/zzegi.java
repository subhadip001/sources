package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzegi extends zzbvf {
    public final /* synthetic */ zzegj zza;
    private final zzefb zzb;

    public /* synthetic */ zzegi(zzegj zzegjVar, zzefb zzefbVar, zzegh zzeghVar) {
        this.zza = zzegjVar;
        this.zzb = zzefbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zze(String str) {
        ((zzegu) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ((zzegu) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzegj.zze(this.zza, (View) ObjectWrapper.unwrap(iObjectWrapper));
        ((zzegu) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzh(zzbui zzbuiVar) {
        zzegj.zzd(this.zza, zzbuiVar);
        ((zzegu) this.zzb.zzc).zzo();
    }
}
