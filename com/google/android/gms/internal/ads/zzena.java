package com.google.android.gms.internal.ads;

import android.content.Context;
import e.i.c.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzena implements zzetb {
    private final Context zza;

    public zzena(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcq)).booleanValue()) {
            return zzfva.zzi(new zzenb(a.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return zzfva.zzi(null);
    }
}
