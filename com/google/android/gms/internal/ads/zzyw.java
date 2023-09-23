package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzyw {
    public static int zza(zzyt zzytVar, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            int zzb = zzytVar.zzb(bArr, i2 + i4, i3 - i4);
            if (zzb == -1) {
                break;
            }
            i4 += zzb;
        }
        return i4;
    }

    public static void zzb(boolean z, String str) {
        if (!z) {
            throw zzbp.zza(str, null);
        }
    }

    public static boolean zzc(zzyt zzytVar, byte[] bArr, int i2, int i3, boolean z) {
        try {
            return zzytVar.zzm(bArr, 0, i3, z);
        } catch (EOFException e2) {
            if (z) {
                return false;
            }
            throw e2;
        }
    }

    public static boolean zzd(zzyt zzytVar, byte[] bArr, int i2, int i3) {
        try {
            ((zzym) zzytVar).zzn(bArr, i2, i3, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzyt zzytVar, int i2) {
        try {
            ((zzym) zzytVar).zzo(i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
