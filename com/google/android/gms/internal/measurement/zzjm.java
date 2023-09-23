package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public abstract class zzjm extends zziu {
    private static final Logger zzb = Logger.getLogger(zzjm.class.getName());
    private static final boolean zzc = zzmy.zzx();
    public zzjn zza;

    private zzjm() {
    }

    public /* synthetic */ zzjm(zzjl zzjlVar) {
    }

    public static int zzA(int i2) {
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

    public static int zzB(long j2) {
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

    public static zzjm zzC(byte[] bArr) {
        return new zzjj(bArr, 0, bArr.length);
    }

    public static int zzt(zzje zzjeVar) {
        int zzd = zzjeVar.zzd();
        return zzA(zzd) + zzd;
    }

    @Deprecated
    public static int zzu(int i2, zzlm zzlmVar, zzlx zzlxVar) {
        int zzA = zzA(i2 << 3);
        return ((zzio) zzlmVar).zzbr(zzlxVar) + zzA + zzA;
    }

    public static int zzv(int i2) {
        if (i2 >= 0) {
            return zzA(i2);
        }
        return 10;
    }

    public static int zzw(zzks zzksVar) {
        int zza = zzksVar.zza();
        return zzA(zza) + zza;
    }

    public static int zzx(zzlm zzlmVar, zzlx zzlxVar) {
        int zzbr = ((zzio) zzlmVar).zzbr(zzlxVar);
        return zzA(zzbr) + zzbr;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zznd.zzc(str);
        } catch (zznc unused) {
            length = str.getBytes(zzkn.zzb).length;
        }
        return zzA(length) + length;
    }

    public static int zzz(int i2) {
        return zzA(i2 << 3);
    }

    public final void zzD() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzE(String str, zznc zzncVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzncVar);
        byte[] bytes = str.getBytes(zzkn.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjk(e2);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b);

    public abstract void zzd(int i2, boolean z);

    public abstract void zze(int i2, zzje zzjeVar);

    public abstract void zzf(int i2, int i3);

    public abstract void zzg(int i2);

    public abstract void zzh(int i2, long j2);

    public abstract void zzi(long j2);

    public abstract void zzj(int i2, int i3);

    public abstract void zzk(int i2);

    public abstract void zzl(byte[] bArr, int i2, int i3);

    public abstract void zzm(int i2, String str);

    public abstract void zzo(int i2, int i3);

    public abstract void zzp(int i2, int i3);

    public abstract void zzq(int i2);

    public abstract void zzr(int i2, long j2);

    public abstract void zzs(long j2);
}
