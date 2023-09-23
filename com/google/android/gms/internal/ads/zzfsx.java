package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfsx extends zzfsp implements Serializable {
    public static final zzfsx zza = new zzfsx();

    private zzfsx() {
    }

    @Override // com.google.android.gms.internal.ads.zzfsp, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.android.gms.internal.ads.zzfsp
    public final zzfsp zza() {
        return zzfsn.zza;
    }
}
