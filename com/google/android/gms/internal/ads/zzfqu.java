package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfqu extends zzfqw {
    public zzfqu() {
        super(null);
    }

    public static final zzfqw zzf(int i2) {
        zzfqw zzfqwVar;
        zzfqw zzfqwVar2;
        zzfqw zzfqwVar3;
        if (i2 < 0) {
            zzfqwVar3 = zzfqw.zzb;
            return zzfqwVar3;
        } else if (i2 > 0) {
            zzfqwVar2 = zzfqw.zzc;
            return zzfqwVar2;
        } else {
            zzfqwVar = zzfqw.zza;
            return zzfqwVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw zzb(int i2, int i3) {
        return zzf(i2 < i3 ? -1 : i2 > i3 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw zzd(boolean z, boolean z2) {
        return zzf(zzftl.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw zze(boolean z, boolean z2) {
        return zzf(zzftl.zza(false, false));
    }
}
