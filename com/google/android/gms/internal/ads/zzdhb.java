package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzdhb {
    public final Map zza = new HashMap();

    public zzdhb(Set set) {
        zzm(set);
    }

    public final synchronized void zzg(zzdiy zzdiyVar) {
        zzj(zzdiyVar.zza, zzdiyVar.zzb);
    }

    public final synchronized void zzj(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzm(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzg((zzdiy) it.next());
        }
    }

    public final synchronized void zzo(final zzdha zzdhaVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgz
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdha.this.zza(key);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzs(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
