package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbbv {
    @VisibleForTesting
    public static long zza(long j2, int i2) {
        return i2 == 1 ? j2 : (i2 & 1) == 0 ? zza((j2 * j2) % 1073807359, i2 >> 1) % 1073807359 : ((zza((j2 * j2) % 1073807359, i2 >> 1) % 1073807359) * j2) % 1073807359;
    }

    @VisibleForTesting
    public static String zzb(String[] strArr, int i2, int i3) {
        int i4 = i3 + i2;
        if (strArr.length < i4) {
            zzcfi.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i4 - 1;
            if (i2 < i5) {
                sb.append(strArr[i2]);
                sb.append(' ');
                i2++;
            } else {
                sb.append(strArr[i5]);
                return sb.toString();
            }
        }
    }

    public static void zzc(String[] strArr, int i2, int i3, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzd(i2, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzd(i2, zze, zzb(strArr, 0, 6), 6, priorityQueue);
        long zza = zza(16785407L, 5);
        int i4 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i4 >= length2 - 5) {
                return;
            }
            zze = (((zzbbr.zza(strArr[i4 + 5]) + 2147483647L) % 1073807359) + (((((zze + 1073807359) - ((((zzbbr.zza(strArr[i4 - 1]) + 2147483647L) % 1073807359) * zza) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzd(i2, zze, zzb(strArr, i4, 6), length2, priorityQueue);
            i4++;
        }
    }

    @VisibleForTesting
    public static void zzd(int i2, long j2, String str, int i3, PriorityQueue priorityQueue) {
        zzbbu zzbbuVar = new zzbbu(j2, str, i3);
        if ((priorityQueue.size() != i2 || (((zzbbu) priorityQueue.peek()).zzc <= zzbbuVar.zzc && ((zzbbu) priorityQueue.peek()).zza <= zzbbuVar.zza)) && !priorityQueue.contains(zzbbuVar)) {
            priorityQueue.add(zzbbuVar);
            if (priorityQueue.size() > i2) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i2, int i3) {
        long zza = (zzbbr.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i4 = 1; i4 < i3; i4++) {
            zza = (((zzbbr.zza(strArr[i4]) + 2147483647L) % 1073807359) + ((zza * 16785407) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
