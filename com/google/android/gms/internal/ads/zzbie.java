package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzbie {
    public static final void zza(zzbid zzbidVar, zzbib zzbibVar) {
        if (zzbibVar.zza() != null) {
            if (!TextUtils.isEmpty(zzbibVar.zzb())) {
                zzbidVar.zzd(zzbibVar.zza(), zzbibVar.zzb(), zzbibVar.zzc(), zzbibVar.zzd());
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
}
