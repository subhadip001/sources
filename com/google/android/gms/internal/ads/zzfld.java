package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@ShowFirstParty
/* loaded from: classes.dex */
public final class zzfld {
    private final Context zza;
    private final Looper zzb;

    public zzfld(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzflr zza = zzflt.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(2);
        zzflo zza2 = zzflp.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzfle(this.zza, this.zzb, (zzflt) zza.zzaj()).zza();
    }
}
