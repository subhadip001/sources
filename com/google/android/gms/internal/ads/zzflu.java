package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import f.a.b.a.a;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzflu {
    public static boolean zza(int i2) {
        int i3 = i2 - 1;
        return i3 == 2 || i3 == 4 || i3 == 5 || i3 == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int zzb(android.content.Context r13, com.google.android.gms.internal.ads.zzfks r14) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzflu.zzb(android.content.Context, com.google.android.gms.internal.ads.zzfks):int");
    }

    private static final String zzc(Context context, zzfks zzfksVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String zza = zzfpf.OS_ARCH.zza();
        if (TextUtils.isEmpty(zza) || !hashSet.contains(zza)) {
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null && strArr.length > 0) {
                    return strArr[0];
                }
            } catch (IllegalAccessException e2) {
                zzfksVar.zzc(2024, 0L, e2);
            } catch (NoSuchFieldException e3) {
                zzfksVar.zzc(2024, 0L, e3);
            }
            String str = Build.CPU_ABI;
            return str != null ? str : Build.CPU_ABI2;
        }
        return zza;
    }

    private static final void zzd(byte[] bArr, String str, Context context, zzfks zzfksVar) {
        StringBuilder A = a.A("os.arch:");
        A.append(zzfpf.OS_ARCH.zza());
        A.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                A.append("supported_abis:");
                A.append(Arrays.toString(strArr));
                A.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        A.append("CPU_ABI:");
        A.append(Build.CPU_ABI);
        A.append(";CPU_ABI2:");
        A.append(Build.CPU_ABI2);
        A.append(";");
        if (bArr != null) {
            A.append("ELF:");
            A.append(Arrays.toString(bArr));
            A.append(";");
        }
        if (str != null) {
            A.append("dbg:");
            A.append(str);
            A.append(";");
        }
        zzfksVar.zzb(4007, A.toString());
    }
}
