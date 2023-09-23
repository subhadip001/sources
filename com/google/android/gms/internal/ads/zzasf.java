package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzasf {
    public static final zzasf zza = new zzasf(new int[]{2}, 2);
    private final int[] zzb;
    private final int zzc;

    public zzasf(int[] iArr, int i2) {
        int[] copyOf = Arrays.copyOf(iArr, 1);
        this.zzb = copyOf;
        Arrays.sort(copyOf);
        this.zzc = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzasf) && Arrays.equals(this.zzb, ((zzasf) obj).zzb);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzb) * 31) + 2;
    }

    public final String toString() {
        return a.q("AudioCapabilities[maxChannelCount=2, supportedEncodings=", Arrays.toString(this.zzb), "]");
    }
}
