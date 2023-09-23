package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdof implements zzbkn {
    public final /* synthetic */ zzdpb zza;
    public final /* synthetic */ ViewGroup zzb;

    public zzdof(zzdpb zzdpbVar, ViewGroup viewGroup) {
        this.zza = zzdpbVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final void zzc() {
        zzdpb zzdpbVar = this.zza;
        zzfrh zzfrhVar = zzdoc.zza;
        Map zzm = zzdpbVar.zzm();
        if (zzm == null) {
            return;
        }
        int size = zzfrhVar.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (zzm.get((String) zzfrhVar.get(i2)) != null) {
                this.zza.onClick(this.zzb);
                return;
            }
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
