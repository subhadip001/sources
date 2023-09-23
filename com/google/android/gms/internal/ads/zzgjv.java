package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgjv extends zzgiv {
    private static final Logger zza = Logger.getLogger(zzgjv.class.getName());
    private static final boolean zzb = zzgns.zzA();
    public zzgjw zze;

    private zzgjv() {
    }

    public /* synthetic */ zzgjv(zzgju zzgjuVar) {
    }

    public static int zzA(zzgly zzglyVar, zzgmr zzgmrVar) {
        zzgip zzgipVar = (zzgip) zzglyVar;
        int zzap = zzgipVar.zzap();
        if (zzap == -1) {
            zzap = zzgmrVar.zza(zzgipVar);
            zzgipVar.zzas(zzap);
        }
        return zzE(zzap) + zzap;
    }

    public static int zzB(int i2) {
        if (i2 > 4096) {
            return 4096;
        }
        return i2;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzgnx.zze(str);
        } catch (zzgnw unused) {
            length = str.getBytes(zzgky.zzb).length;
        }
        return zzE(length) + length;
    }

    public static int zzD(int i2) {
        return zzE(i2 << 3);
    }

    public static int zzE(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzF(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static zzgjv zzG(byte[] bArr) {
        return new zzgjr(bArr, 0, bArr.length);
    }

    public static zzgjv zzH(OutputStream outputStream, int i2) {
        return new zzgjt(outputStream, i2);
    }

    public static int zzw(zzgjg zzgjgVar) {
        int zzd = zzgjgVar.zzd();
        return zzE(zzd) + zzd;
    }

    @Deprecated
    public static int zzx(int i2, zzgly zzglyVar, zzgmr zzgmrVar) {
        int zzE = zzE(i2 << 3);
        int i3 = zzE + zzE;
        zzgip zzgipVar = (zzgip) zzglyVar;
        int zzap = zzgipVar.zzap();
        if (zzap == -1) {
            zzap = zzgmrVar.zza(zzgipVar);
            zzgipVar.zzas(zzap);
        }
        return i3 + zzap;
    }

    public static int zzy(int i2) {
        if (i2 >= 0) {
            return zzE(i2);
        }
        return 10;
    }

    public static int zzz(zzgle zzgleVar) {
        int zza2 = zzgleVar.zza();
        return zzE(zza2) + zza2;
    }

    public final void zzI() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzJ(String str, zzgnw zzgnwVar) {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzgnwVar);
        byte[] bytes = str.getBytes(zzgky.zzb);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgjs(e2);
        }
    }

    public abstract void zzN();

    public abstract void zzO(byte b);

    public abstract void zzP(int i2, boolean z);

    public abstract void zzQ(int i2, zzgjg zzgjgVar);

    @Override // com.google.android.gms.internal.ads.zzgiv
    public abstract void zza(byte[] bArr, int i2, int i3);

    public abstract int zzb();

    public abstract void zzh(int i2, int i3);

    public abstract void zzi(int i2);

    public abstract void zzj(int i2, long j2);

    public abstract void zzk(long j2);

    public abstract void zzl(int i2, int i3);

    public abstract void zzm(int i2);

    public abstract void zzn(int i2, zzgly zzglyVar, zzgmr zzgmrVar);

    public abstract void zzo(int i2, String str);

    public abstract void zzq(int i2, int i3);

    public abstract void zzr(int i2, int i3);

    public abstract void zzs(int i2);

    public abstract void zzt(int i2, long j2);

    public abstract void zzu(long j2);
}
