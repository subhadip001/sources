package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdbq extends zzdhb implements com.google.android.gms.ads.internal.client.zza {
    public zzdbq(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzdbp
            @Override // com.google.android.gms.internal.ads.zzdha
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zza) obj).onAdClicked();
            }
        });
    }
}
