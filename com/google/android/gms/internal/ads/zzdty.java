package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdty {
    private final Map zza = new HashMap();

    public final synchronized zzdtx zza(String str) {
        return (zzdtx) this.zza.get(str);
    }

    public final zzdtx zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdtx zza = zza((String) it.next());
            if (zza != null) {
                return zza;
            }
        }
        return null;
    }

    public final String zzc(String str) {
        zzbwf zzbwfVar;
        zzdtx zza = zza(str);
        return (zza == null || (zzbwfVar = zza.zzb) == null) ? "" : zzbwfVar.toString();
    }

    public final synchronized void zzd(String str, zzfct zzfctVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdtx(str, zzfctVar.zze(), zzfctVar.zzf()));
        } catch (zzfcd unused) {
        }
    }

    public final synchronized void zze(String str, zzbvs zzbvsVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdtx(str, zzbvsVar.zzf(), zzbvsVar.zzg()));
        } catch (Throwable unused) {
        }
    }
}
