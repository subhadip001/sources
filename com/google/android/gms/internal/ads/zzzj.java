package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzzj {
    private final zzdy zza = new zzdy(10);

    public final zzbl zza(zzyt zzytVar, zzabz zzabzVar) {
        zzbl zzblVar = null;
        int i2 = 0;
        while (true) {
            try {
                ((zzym) zzytVar).zzm(this.zza.zzH(), 0, 10, false);
                this.zza.zzF(0);
                if (this.zza.zzm() != 4801587) {
                    break;
                }
                this.zza.zzG(3);
                int zzj = this.zza.zzj();
                int i3 = zzj + 10;
                if (zzblVar == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.zza.zzH(), 0, bArr, 0, 10);
                    ((zzym) zzytVar).zzm(bArr, 10, zzj, false);
                    zzblVar = zzacb.zza(bArr, i3, zzabzVar, new zzabc());
                } else {
                    ((zzym) zzytVar).zzl(zzj, false);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        zzytVar.zzj();
        ((zzym) zzytVar).zzl(i2, false);
        return zzblVar;
    }
}
