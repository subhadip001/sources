package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzemf implements zzded {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zza.set(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzded
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzeyj.zza(this.zza, new zzeyi() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // com.google.android.gms.internal.ads.zzeyi
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzde) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }
}
