package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbfu extends zzgko implements zzglz {
    private static final zzgku zzb = new zzbfs();
    private static final zzbfu zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private zzgkt zzk = zzgko.zzaE();
    private zzbfp zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;

    static {
        zzbfu zzbfuVar = new zzbfu();
        zze = zzbfuVar;
        zzgko.zzaN(zzbfu.class, zzbfuVar);
    }

    private zzbfu() {
    }

    public static /* synthetic */ void zzA(zzbfu zzbfuVar, int i2) {
        zzbfuVar.zzo = i2 - 1;
        zzbfuVar.zzf |= 128;
    }

    public static /* synthetic */ void zzB(zzbfu zzbfuVar, int i2) {
        zzbfuVar.zzq = i2 - 1;
        zzbfuVar.zzf |= 512;
    }

    public static zzbft zzg() {
        return (zzbft) zze.zzaw();
    }

    public static zzbfu zzi(byte[] bArr) {
        return (zzbfu) zzgko.zzaA(zze, bArr);
    }

    public static /* synthetic */ void zzl(zzbfu zzbfuVar, long j2) {
        zzbfuVar.zzf |= 1;
        zzbfuVar.zzg = j2;
    }

    public static /* synthetic */ void zzm(zzbfu zzbfuVar, long j2) {
        zzbfuVar.zzf |= 4;
        zzbfuVar.zzi = j2;
    }

    public static /* synthetic */ void zzn(zzbfu zzbfuVar, long j2) {
        zzbfuVar.zzf |= 8;
        zzbfuVar.zzj = j2;
    }

    public static /* synthetic */ void zzo(zzbfu zzbfuVar, Iterable iterable) {
        zzgkt zzgktVar = zzbfuVar.zzk;
        if (!zzgktVar.zzc()) {
            zzbfuVar.zzk = zzgko.zzaF(zzgktVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzbfuVar.zzk.zzh(((zzbej) it.next()).zza());
        }
    }

    public static /* synthetic */ void zzp(zzbfu zzbfuVar, zzbfp zzbfpVar) {
        zzbfpVar.getClass();
        zzbfuVar.zzl = zzbfpVar;
        zzbfuVar.zzf |= 16;
    }

    public static /* synthetic */ void zzq(zzbfu zzbfuVar, int i2) {
        zzbfuVar.zzf |= 256;
        zzbfuVar.zzp = i2;
    }

    public static /* synthetic */ void zzr(zzbfu zzbfuVar, zzbfy zzbfyVar) {
        zzbfuVar.zzr = zzbfyVar.zza();
        zzbfuVar.zzf |= 1024;
    }

    public static /* synthetic */ void zzx(zzbfu zzbfuVar, int i2) {
        zzbfuVar.zzh = i2 - 1;
        zzbfuVar.zzf |= 2;
    }

    public static /* synthetic */ void zzy(zzbfu zzbfuVar, int i2) {
        zzbfuVar.zzm = i2 - 1;
        zzbfuVar.zzf |= 32;
    }

    public static /* synthetic */ void zzz(zzbfu zzbfuVar, int i2) {
        zzbfuVar.zzn = i2 - 1;
        zzbfuVar.zzf |= 64;
    }

    public final int zza() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                zzgks zzgksVar = zzbey.zza;
                return zzgko.zzaM(zze, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzf", "zzg", "zzh", zzgksVar, "zzi", "zzj", "zzk", zzbej.zzc(), "zzl", "zzm", zzgksVar, "zzn", zzgksVar, "zzo", zzgksVar, "zzp", "zzq", zzgksVar, "zzr", zzbfy.zzc()});
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        return null;
                    }
                    return zze;
                }
                return new zzbft(null);
            } else {
                return new zzbfu();
            }
        }
        return (byte) 1;
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final long zze() {
        return this.zzg;
    }

    public final zzbfp zzf() {
        zzbfp zzbfpVar = this.zzl;
        return zzbfpVar == null ? zzbfp.zzd() : zzbfpVar;
    }

    public final zzbfy zzj() {
        zzbfy zzb2 = zzbfy.zzb(this.zzr);
        return zzb2 == null ? zzbfy.UNSPECIFIED : zzb2;
    }

    public final List zzk() {
        return new zzgkv(this.zzk, zzb);
    }

    public final int zzs() {
        int zza = zzbez.zza(this.zzn);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzt() {
        int zza = zzbez.zza(this.zzo);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzu() {
        int zza = zzbez.zza(this.zzq);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzv() {
        int zza = zzbez.zza(this.zzh);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzw() {
        int zza = zzbez.zza(this.zzm);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
