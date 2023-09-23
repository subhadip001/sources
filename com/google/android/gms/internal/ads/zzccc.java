package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzccc implements zzfuw {
    public final /* synthetic */ zzfvj zza;

    public zzccc(zzccd zzccdVar, zzfvj zzfvjVar) {
        this.zza = zzfvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        List list;
        list = zzccd.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        Void r2 = (Void) obj;
        list = zzccd.zzc;
        list.remove(this.zza);
    }
}
