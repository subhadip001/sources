package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzddm extends zzdhb implements zzbnl {
    private final Bundle zzb;

    public zzddm(Set set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzo(new zzdha() { // from class: com.google.android.gms.internal.ads.zzddl
            @Override // com.google.android.gms.internal.ads.zzdha
            public final void zza(Object obj) {
                ((zzfkm) obj).zzv();
            }
        });
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
