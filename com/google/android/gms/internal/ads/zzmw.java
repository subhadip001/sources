package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzmw {
    public static final zzmw zza = new zzmw(new int[]{2}, 8);
    private static final zzmw zzb = new zzmw(new int[]{2, 5, 6}, 8);
    private final int[] zzc;
    private final int zzd;

    public zzmw(int[] iArr, int i2) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
        this.zzd = 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzmw) && Arrays.equals(this.zzc, ((zzmw) obj).zzc);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzc) * 31) + 8;
    }

    public final String toString() {
        return a.q("AudioCapabilities[maxChannelCount=8, supportedEncodings=", Arrays.toString(this.zzc), "]");
    }

    public final boolean zza(int i2) {
        return Arrays.binarySearch(this.zzc, i2) >= 0;
    }
}
