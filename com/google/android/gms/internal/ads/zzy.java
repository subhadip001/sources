package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzy {
    private final SparseBooleanArray zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzy) {
            zzy zzyVar = (zzy) obj;
            if (zzeg.zza < 24) {
                if (this.zza.size() == zzyVar.zza.size()) {
                    for (int i2 = 0; i2 < this.zza.size(); i2++) {
                        if (zza(i2) != zzyVar.zza(i2)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return this.zza.equals(zzyVar.zza);
        }
        return false;
    }

    public final int hashCode() {
        if (zzeg.zza < 24) {
            int size = this.zza.size();
            for (int i2 = 0; i2 < this.zza.size(); i2++) {
                size = (size * 31) + zza(i2);
            }
            return size;
        }
        return this.zza.hashCode();
    }

    public final int zza(int i2) {
        zzcw.zza(i2, 0, this.zza.size());
        return this.zza.keyAt(i2);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i2) {
        return this.zza.get(i2);
    }
}
