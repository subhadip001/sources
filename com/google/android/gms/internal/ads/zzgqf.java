package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgqf implements zzgpu {
    private static final zzgpu zza = zzgpv.zza(Collections.emptySet());
    private final List zzb;
    private final List zzc;

    public /* synthetic */ zzgqf(List list, List list2, zzgqd zzgqdVar) {
        this.zzb = list;
        this.zzc = list2;
    }

    public static zzgqe zza(int i2, int i3) {
        return new zzgqe(i2, i3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zzc */
    public final Set zzb() {
        int size = this.zzb.size();
        ArrayList arrayList = new ArrayList(this.zzc.size());
        int size2 = this.zzc.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) ((zzgqh) this.zzc.get(i2)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zza2 = zzgpr.zza(size);
        int size3 = this.zzb.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object zzb = ((zzgqh) this.zzb.get(i3)).zzb();
            Objects.requireNonNull(zzb);
            zza2.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object obj : (Collection) arrayList.get(i4)) {
                Objects.requireNonNull(obj);
                zza2.add(obj);
            }
        }
        return Collections.unmodifiableSet(zza2);
    }
}
