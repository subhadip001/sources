package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzdce extends zzdhb implements zzdbw {
    @VisibleForTesting
    public zzdce(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzdcb
            @Override // com.google.android.gms.internal.ads.zzdha
            public final void zza(Object obj) {
                ((zzdci) obj).zzk(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzb() {
        zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzdcc
            @Override // com.google.android.gms.internal.ads.zzdha
            public final void zza(Object obj) {
                ((zzdci) obj).zzk(zzfcx.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zze(final zzdle zzdleVar) {
        zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzdcd
            @Override // com.google.android.gms.internal.ads.zzdha
            public final void zza(Object obj) {
                ((zzdci) obj).zzk(zzfcx.zzd(12, zzdle.this.getMessage(), null));
            }
        });
    }
}
