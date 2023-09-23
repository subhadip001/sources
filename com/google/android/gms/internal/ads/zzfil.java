package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfil {
    public static zzfil zza(zzfim zzfimVar, zzfin zzfinVar) {
        if (zzfij.zzb()) {
            return new zzfip(zzfimVar, zzfinVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void zzb(View view, zzfir zzfirVar, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
