package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzekf implements zzeey {
    private final Context zza;
    private final zzcwr zzb;
    private final zzbit zzc;
    private final zzfvk zzd;
    private final zzfge zze;

    public zzekf(Context context, zzcwr zzcwrVar, zzfge zzfgeVar, zzfvk zzfvkVar, zzbit zzbitVar) {
        this.zza = context;
        this.zzb = zzcwrVar;
        this.zze = zzfgeVar;
        this.zzd = zzfvkVar;
        this.zzc = zzbitVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final zzfvj zza(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        zzcvv zza = this.zzb.zza(new zzcyl(zzfbsVar, zzfbgVar, null), new zzekd(this, new View(this.zza), null, new zzcxu() { // from class: com.google.android.gms.internal.ads.zzekb
            @Override // com.google.android.gms.internal.ads.zzcxu
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                return null;
            }
        }, (zzfbh) zzfbgVar.zzv.get(0)));
        zzeke zzk = zza.zzk();
        zzfbl zzfblVar = zzfbgVar.zzt;
        final zzbio zzbioVar = new zzbio(zzk, zzfblVar.zzb, zzfblVar.zza);
        zzfge zzfgeVar = this.zze;
        return zzffo.zzd(new zzffi() { // from class: com.google.android.gms.internal.ads.zzekc
            @Override // com.google.android.gms.internal.ads.zzffi
            public final void zza() {
                zzekf.this.zzc(zzbioVar);
            }
        }, this.zzd, zzffy.CUSTOM_RENDER_SYN, zzfgeVar).zzb(zzffy.CUSTOM_RENDER_ACK).zzd(zzfva.zzi(zza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final boolean zzb(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        zzfbl zzfblVar;
        return (this.zzc == null || (zzfblVar = zzfbgVar.zzt) == null || zzfblVar.zza == null) ? false : true;
    }

    public final /* synthetic */ void zzc(zzbio zzbioVar) {
        this.zzc.zze(zzbioVar);
    }
}
