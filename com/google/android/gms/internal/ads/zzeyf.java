package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeyf implements zzfuw {
    public zzeyf(zzeyh zzeyhVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* synthetic */ void zzb(@NullableDecl Object obj) {
        Void r1 = (Void) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit successful.");
    }
}
