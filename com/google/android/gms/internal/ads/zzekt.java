package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzekt {
    private final zzdkx zza;

    public zzekt(Context context, zzdkx zzdkxVar) {
        this.zza = zzdkxVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbsVar, zzfbg zzfbgVar, View view, zzekp zzekpVar) {
        zzdjz zze = this.zza.zze(new zzcyl(zzfbsVar, zzfbgVar, null), new zzekr(this, new zzdlf() { // from class: com.google.android.gms.internal.ads.zzekq
            @Override // com.google.android.gms.internal.ads.zzdlf
            public final void zza(boolean z, Context context, zzdcf zzdcfVar) {
            }
        }));
        zzekpVar.zzd(new zzeks(this, zze));
        return zze.zzg();
    }
}
