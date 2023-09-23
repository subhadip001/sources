package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgli extends zzglm {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzgli() {
        super(null);
    }

    public /* synthetic */ zzgli(zzglh zzglhVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j2, int i2) {
        zzglf zzglfVar;
        List arrayList;
        List list = (List) zzgns.zzh(obj, j2);
        if (list.isEmpty()) {
            if (list instanceof zzglg) {
                arrayList = new zzglf(i2);
            } else if ((list instanceof zzgmf) && (list instanceof zzgkx)) {
                arrayList = ((zzgkx) list).zzd(i2);
            } else {
                arrayList = new ArrayList(i2);
            }
            zzgns.zzv(obj, j2, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i2);
            arrayList2.addAll(list);
            zzgns.zzv(obj, j2, arrayList2);
            zzglfVar = arrayList2;
        } else if (list instanceof zzgnn) {
            zzglf zzglfVar2 = new zzglf(list.size() + i2);
            zzglfVar2.addAll(zzglfVar2.size(), (zzgnn) list);
            zzgns.zzv(obj, j2, zzglfVar2);
            zzglfVar = zzglfVar2;
        } else if ((list instanceof zzgmf) && (list instanceof zzgkx)) {
            zzgkx zzgkxVar = (zzgkx) list;
            if (zzgkxVar.zzc()) {
                return list;
            }
            zzgkx zzd = zzgkxVar.zzd(list.size() + i2);
            zzgns.zzv(obj, j2, zzd);
            return zzd;
        } else {
            return list;
        }
        return zzglfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final List zza(Object obj, long j2) {
        return zzf(obj, j2, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final void zzb(Object obj, long j2) {
        Object unmodifiableList;
        List list = (List) zzgns.zzh(obj, j2);
        if (list instanceof zzglg) {
            unmodifiableList = ((zzglg) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzgmf) && (list instanceof zzgkx)) {
                zzgkx zzgkxVar = (zzgkx) list;
                if (zzgkxVar.zzc()) {
                    zzgkxVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzgns.zzv(obj, j2, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final void zzc(Object obj, Object obj2, long j2) {
        List list = (List) zzgns.zzh(obj2, j2);
        List zzf = zzf(obj, j2, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzgns.zzv(obj, j2, list);
    }
}
