package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgjo {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    public int zza;
    public final int zzb = zze;
    public zzgjp zzc;

    public /* synthetic */ zzgjo(zzgjn zzgjnVar) {
    }

    public static int zzF(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long zzG(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static zzgjo zzH(InputStream inputStream, int i2) {
        return new zzgjm(inputStream, 4096, null);
    }

    public static zzgjo zzI(byte[] bArr, int i2, int i3, boolean z) {
        zzgji zzgjiVar = new zzgji(bArr, i2, i3, z, null);
        try {
            zzgjiVar.zze(i3);
            return zzgjiVar;
        } catch (zzgla e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract void zzA(int i2);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int i2);

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int i2);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract zzgjg zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int i2);
}
