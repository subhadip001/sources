package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfov implements Serializable, zzfot {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfov) {
            return this.zza.equals(((zzfov) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.zza;
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfot
    public final boolean zza(Object obj) {
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            if (!((zzfot) this.zza.get(i2)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
