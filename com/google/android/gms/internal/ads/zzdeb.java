package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdeb extends zzdhb implements zzdcm, zzddr {
    private final zzfbg zzb;
    private final AtomicBoolean zzc;

    public zzdeb(Set set, zzfbg zzfbgVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfbgVar;
    }

    private final void zzb() {
        com.google.android.gms.ads.internal.client.zzs zzsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgx)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzsVar = this.zzb.zzag) != null && zzsVar.zza == 3) {
            zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzdea
                @Override // com.google.android.gms.internal.ads.zzdha
                public final void zza(Object obj) {
                    zzdeb.this.zza((zzded) obj);
                }
            });
        }
    }

    public final /* synthetic */ void zza(zzded zzdedVar) {
        zzdedVar.zzg(this.zzb.zzag);
    }

    @Override // com.google.android.gms.internal.ads.zzddr
    public final void zzh() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcm
    public final void zzl() {
        int i2 = this.zzb.zzb;
        if (i2 == 2 || i2 == 5 || i2 == 4 || i2 == 6 || i2 == 7) {
            zzb();
        }
    }
}
