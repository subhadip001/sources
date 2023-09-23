package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfwz implements Comparable {
    private final byte[] zza;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfwz zzfwzVar = (zzfwz) obj;
        int length = this.zza.length;
        int length2 = zzfwzVar.zza.length;
        if (length != length2) {
            return length - length2;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i2 >= bArr.length) {
                return 0;
            }
            byte b = bArr[i2];
            byte b2 = zzfwzVar.zza[i2];
            if (b != b2) {
                return b - b2;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfwz) {
            return Arrays.equals(this.zza, ((zzfwz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzgia.zza(this.zza);
    }
}
