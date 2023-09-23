package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdjv extends zzdhb {
    private boolean zzb;

    public zzdjv(Set set) {
        super(set);
    }

    public final void zza() {
        zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzdjr
            @Override // com.google.android.gms.internal.ads.zzdha
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzdjt
            @Override // com.google.android.gms.internal.ads.zzdha
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzo(zzdjs.zza);
            this.zzb = true;
        }
        zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzdju
            @Override // com.google.android.gms.internal.ads.zzdha
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
            }
        });
    }

    public final synchronized void zzd() {
        zzo(zzdjs.zza);
        this.zzb = true;
    }
}
