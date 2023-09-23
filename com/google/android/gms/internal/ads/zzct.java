package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzct {
    public static final zzct zza = new zzct(zzfrh.zzo());
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zzcq
    };
    private final zzfrh zzc;

    public zzct(List list) {
        this.zzc = zzfrh.zzm(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzct.class != obj.getClass()) {
            return false;
        }
        return this.zzc.equals(((zzct) obj).zzc);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final zzfrh zza() {
        return this.zzc;
    }

    public final boolean zzb(int i2) {
        for (int i3 = 0; i3 < this.zzc.size(); i3++) {
            zzcs zzcsVar = (zzcs) this.zzc.get(i3);
            if (zzcsVar.zzc() && zzcsVar.zza() == i2) {
                return true;
            }
        }
        return false;
    }
}
