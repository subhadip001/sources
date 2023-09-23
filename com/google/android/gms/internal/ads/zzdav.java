package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdav implements zzddg, zzdcn {
    private final Context zza;
    private final zzfbg zzb;
    private final zzbxz zzc;

    public zzdav(Context context, zzfbg zzfbgVar, zzbxz zzbxzVar, byte[] bArr) {
        this.zza = context;
        this.zzb = zzfbgVar;
        this.zzc = zzbxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzbq(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzbs(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzbt(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzddg
    public final void zzn() {
        zzbya zzbyaVar = this.zzb.zzae;
        if (zzbyaVar == null || !zzbyaVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zzb.zzae.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zzb.zzae.zzb);
    }
}
