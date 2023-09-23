package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeny implements zzetb {
    private final Set zza;

    public zzeny(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        final ArrayList arrayList = new ArrayList();
        for (String str : this.zza) {
            arrayList.add(str);
        }
        return zzfva.zzi(new zzeta() { // from class: com.google.android.gms.internal.ads.zzenx
            @Override // com.google.android.gms.internal.ads.zzeta
            public final void zzf(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
