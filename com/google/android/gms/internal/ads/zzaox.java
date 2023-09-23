package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaox extends zzamm {
    public Long zza;
    public Long zzb;

    public zzaox() {
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        return hashMap;
    }

    public zzaox(String str) {
        HashMap zza = zzamm.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Long) zza.get(1);
        }
    }
}
