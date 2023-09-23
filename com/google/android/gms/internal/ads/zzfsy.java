package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfsy extends zzfsp implements Serializable {
    public final zzfsp zza;

    public zzfsy(zzfsp zzfspVar) {
        this.zza = zzfspVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsp, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfsy) {
            return this.zza.equals(((zzfsy) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.ads.zzfsp
    public final zzfsp zza() {
        return this.zza;
    }
}
