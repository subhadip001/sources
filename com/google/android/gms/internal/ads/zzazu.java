package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzazu {
    public final List zza;
    public final int zzb;

    private zzazu(List list, int i2) {
        this.zza = list;
        this.zzb = i2;
    }

    public static zzazu zza(zzazg zzazgVar) {
        try {
            zzazgVar.zzw(21);
            int zzg = zzazgVar.zzg() & 3;
            int zzg2 = zzazgVar.zzg();
            int zzc = zzazgVar.zzc();
            int i2 = 0;
            for (int i3 = 0; i3 < zzg2; i3++) {
                zzazgVar.zzw(1);
                int zzj = zzazgVar.zzj();
                for (int i4 = 0; i4 < zzj; i4++) {
                    int zzj2 = zzazgVar.zzj();
                    i2 += zzj2 + 4;
                    zzazgVar.zzw(zzj2);
                }
            }
            zzazgVar.zzv(zzc);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < zzg2; i6++) {
                zzazgVar.zzw(1);
                int zzj3 = zzazgVar.zzj();
                for (int i7 = 0; i7 < zzj3; i7++) {
                    int zzj4 = zzazgVar.zzj();
                    System.arraycopy(zzaze.zza, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    System.arraycopy(zzazgVar.zza, zzazgVar.zzc(), bArr, i8, zzj4);
                    i5 = i8 + zzj4;
                    zzazgVar.zzw(zzj4);
                }
            }
            return new zzazu(i2 == 0 ? null : Collections.singletonList(bArr), zzg + 1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new zzarv("Error parsing HEVC config", e2);
        }
    }
}
