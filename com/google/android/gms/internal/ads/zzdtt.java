package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdtt implements zzdcn {
    private final zzcli zza;

    public zzdtt(zzcli zzcliVar) {
        this.zza = zzcliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzbq(Context context) {
        zzcli zzcliVar = this.zza;
        if (zzcliVar != null) {
            zzcliVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzbs(Context context) {
        zzcli zzcliVar = this.zza;
        if (zzcliVar != null) {
            zzcliVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzbt(Context context) {
        zzcli zzcliVar = this.zza;
        if (zzcliVar != null) {
            zzcliVar.onResume();
        }
    }
}
