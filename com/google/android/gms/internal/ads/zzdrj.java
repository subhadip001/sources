package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdrj implements zzbkn {
    public final /* synthetic */ zzdrk zza;

    public zzdrj(zzdrk zzdrkVar) {
        this.zza = zzdrkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final void zzc() {
        zzdnb zzdnbVar;
        zzdnb zzdnbVar2;
        zzdrk zzdrkVar = this.zza;
        zzdnbVar = zzdrkVar.zzd;
        if (zzdnbVar != null) {
            zzdnbVar2 = zzdrkVar.zzd;
            zzdnbVar2.zzy("_videoMediaView");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final void zzd(MotionEvent motionEvent) {
    }
}
