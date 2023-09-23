package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdnd {
    private zzbkx zza;

    public zzdnd(zzdms zzdmsVar) {
        this.zza = zzdmsVar;
    }

    public final synchronized zzbkx zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbkx zzbkxVar) {
        this.zza = zzbkxVar;
    }
}
