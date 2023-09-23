package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeqy implements zzeta {
    public final zzfbf zza;

    public zzeqy(zzfbf zzfbfVar) {
        this.zza = zzfbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfbf zzfbfVar = this.zza;
        if (zzfbfVar != null) {
            bundle.putBoolean("render_in_browser", zzfbfVar.zzd());
            bundle.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
