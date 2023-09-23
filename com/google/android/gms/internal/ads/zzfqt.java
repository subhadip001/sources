package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfqt extends zzfsp implements Serializable {
    public final Comparator zza;

    public zzfqt(Comparator comparator) {
        Objects.requireNonNull(comparator);
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfsp, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqt) {
            return this.zza.equals(((zzfqt) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
