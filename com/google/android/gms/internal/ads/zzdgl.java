package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdgl extends zzdhb implements zzbnn {
    public zzdgl(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final synchronized void zzbD(final String str, final String str2) {
        zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzdgk
            @Override // com.google.android.gms.internal.ads.zzdha
            public final void zza(Object obj) {
                ((zzarb) obj).zzbu(str, str2);
            }
        });
    }
}
