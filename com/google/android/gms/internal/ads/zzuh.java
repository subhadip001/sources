package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzuh implements zzvh {
    public final zzck zza;
    public final int zzb;
    public final int[] zzc;
    private final zzad[] zzd;
    private int zze;

    public zzuh(zzck zzckVar, int[] iArr, int i2) {
        int length = iArr.length;
        zzcw.zzf(length > 0);
        Objects.requireNonNull(zzckVar);
        this.zza = zzckVar;
        this.zzb = length;
        this.zzd = new zzad[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.zzd[i3] = zzckVar.zzb(iArr[i3]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzug
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzad) obj2).zzi - ((zzad) obj).zzi;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i4 = 0; i4 < this.zzb; i4++) {
            this.zzc[i4] = zzckVar.zza(this.zzd[i4]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzuh zzuhVar = (zzuh) obj;
            if (this.zza == zzuhVar.zza && Arrays.equals(this.zzc, zzuhVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zze;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
            this.zze = hashCode;
            return hashCode;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final int zza(int i2) {
        return this.zzc[0];
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final int zzb(int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            if (this.zzc[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final int zzc() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzad zzd(int i2) {
        return this.zzd[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final zzck zze() {
        return this.zza;
    }
}
