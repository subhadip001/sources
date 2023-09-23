package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaoj extends zzamm {
    public long zza;
    public long zzb;

    public zzaoj() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.zza));
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }

    public zzaoj(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap zza = zzamm.zza(str);
        if (zza != null) {
            this.zza = ((Long) zza.get(0)).longValue();
            this.zzb = ((Long) zza.get(1)).longValue();
        }
    }
}
