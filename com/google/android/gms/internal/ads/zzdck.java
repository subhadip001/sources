package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdck extends zzdhb {
    private boolean zzb;

    public zzdck(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzdcj
            @Override // com.google.android.gms.internal.ads.zzdha
            public final void zza(Object obj) {
                ((zzdcm) obj).zzl();
            }
        });
        this.zzb = true;
    }
}
