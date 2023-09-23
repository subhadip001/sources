package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzc {
    public static final zzl zza = new zzl() { // from class: com.google.android.gms.internal.ads.zzb
    };
    public final long zzb;
    public final int zzc;
    public final Uri[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final long zzg;
    public final boolean zzh;

    public zzc(long j2) {
        this(0L, -1, new int[0], new Uri[0], new long[0], 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzc.class == obj.getClass()) {
            zzc zzcVar = (zzc) obj;
            if (this.zzc == zzcVar.zzc && Arrays.equals(this.zzd, zzcVar.zzd) && Arrays.equals(this.zze, zzcVar.zze) && Arrays.equals(this.zzf, zzcVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.zze);
        return (Arrays.hashCode(this.zzf) + ((hashCode + (((this.zzc * 961) + Arrays.hashCode(this.zzd)) * 31)) * 31)) * 961;
    }

    public final int zza(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        return i4;
    }

    public final zzc zzb(int i2) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new zzc(0L, 0, copyOf, (Uri[]) Arrays.copyOf(this.zzd, 0), copyOf2, 0L, false);
    }

    private zzc(long j2, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j3, boolean z) {
        zzcw.zzd(iArr.length == uriArr.length);
        this.zzb = 0L;
        this.zzc = i2;
        this.zze = iArr;
        this.zzd = uriArr;
        this.zzf = jArr;
        this.zzg = 0L;
        this.zzh = false;
    }
}
