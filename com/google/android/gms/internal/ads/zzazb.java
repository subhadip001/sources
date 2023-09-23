package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzazb {
    private int zza;
    private long[] zzb;

    public zzazb() {
        this(32);
    }

    public zzazb(int i2) {
        this.zzb = new long[32];
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb(int i2) {
        if (i2 >= 0 && i2 < this.zza) {
            return this.zzb[i2];
        }
        throw new IndexOutOfBoundsException(a.k("Invalid index ", i2, ", size is ", this.zza));
    }

    public final void zzc(long j2) {
        int i2 = this.zza;
        long[] jArr = this.zzb;
        if (i2 == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i2 + i2);
        }
        long[] jArr2 = this.zzb;
        int i3 = this.zza;
        this.zza = i3 + 1;
        jArr2[i3] = j2;
    }
}
