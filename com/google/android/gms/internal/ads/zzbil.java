package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzbil {
    private final Map zza = new HashMap();
    private final zzbin zzb;

    public zzbil(zzbin zzbinVar) {
        this.zzb = zzbinVar;
    }

    public final zzbin zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbik zzbikVar) {
        this.zza.put(str, zzbikVar);
    }

    public final void zzc(String str, String str2, long j2) {
        zzbin zzbinVar = this.zzb;
        zzbik zzbikVar = (zzbik) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbikVar != null) {
            zzbinVar.zze(zzbikVar, j2, strArr);
        }
        this.zza.put(str, new zzbik(j2, null, null));
    }
}
