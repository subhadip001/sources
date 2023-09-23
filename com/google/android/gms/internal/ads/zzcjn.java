package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcjn implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final zzcjm zza(zzchr zzchrVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcjm zzcjmVar = (zzcjm) it.next();
            if (zzcjmVar.zza == zzchrVar) {
                return zzcjmVar;
            }
        }
        return null;
    }

    public final void zzb(zzcjm zzcjmVar) {
        this.zza.add(zzcjmVar);
    }

    public final void zzc(zzcjm zzcjmVar) {
        this.zza.remove(zzcjmVar);
    }

    public final boolean zzd(zzchr zzchrVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcjm zzcjmVar = (zzcjm) it.next();
            if (zzcjmVar.zza == zzchrVar) {
                arrayList.add(zzcjmVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcjm) it2.next()).zzb.zzb();
        }
        return true;
    }
}
