package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzb extends zzbb {
    private final zza zza;

    public zzb(zza zzaVar) {
        this.zza = zzaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbc
    public final void zzb() {
        this.zza.onAdClicked();
    }
}
