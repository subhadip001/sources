package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdeg implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdeh zzdehVar = (zzdeh) this.zza.get();
        if (zzdehVar != null) {
            zzdehVar.zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzdee
                @Override // com.google.android.gms.internal.ads.zzdha
                public final void zza(Object obj) {
                    ((zzdei) obj).zza();
                }
            });
        }
    }
}
