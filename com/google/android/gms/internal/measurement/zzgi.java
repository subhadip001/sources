package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class zzgi extends zzkf implements zzln {
    private static final zzgi zza;
    private zzkl zzd = zzkf.zzbC();
    private zzkl zze = zzkf.zzbC();
    private zzkm zzf = zzkf.zzbE();
    private zzkm zzg = zzkf.zzbE();

    static {
        zzgi zzgiVar = new zzgi();
        zza = zzgiVar;
        zzkf.zzbL(zzgi.class, zzgiVar);
    }

    private zzgi() {
    }

    public static zzgh zzf() {
        return (zzgh) zza.zzbx();
    }

    public static zzgi zzh() {
        return zza;
    }

    public static /* synthetic */ void zzo(zzgi zzgiVar, Iterable iterable) {
        zzkl zzklVar = zzgiVar.zzd;
        if (!zzklVar.zzc()) {
            zzgiVar.zzd = zzkf.zzbD(zzklVar);
        }
        zzio.zzbt(iterable, zzgiVar.zzd);
    }

    public static /* synthetic */ void zzq(zzgi zzgiVar, Iterable iterable) {
        zzkl zzklVar = zzgiVar.zze;
        if (!zzklVar.zzc()) {
            zzgiVar.zze = zzkf.zzbD(zzklVar);
        }
        zzio.zzbt(iterable, zzgiVar.zze);
    }

    public static /* synthetic */ void zzs(zzgi zzgiVar, Iterable iterable) {
        zzgiVar.zzy();
        zzio.zzbt(iterable, zzgiVar.zzf);
    }

    public static /* synthetic */ void zzu(zzgi zzgiVar, int i2) {
        zzgiVar.zzy();
        zzgiVar.zzf.remove(i2);
    }

    public static /* synthetic */ void zzv(zzgi zzgiVar, Iterable iterable) {
        zzgiVar.zzz();
        zzio.zzbt(iterable, zzgiVar.zzg);
    }

    public static /* synthetic */ void zzx(zzgi zzgiVar, int i2) {
        zzgiVar.zzz();
        zzgiVar.zzg.remove(i2);
    }

    private final void zzy() {
        zzkm zzkmVar = this.zzf;
        if (zzkmVar.zzc()) {
            return;
        }
        this.zzf = zzkf.zzbF(zzkmVar);
    }

    private final void zzz() {
        zzkm zzkmVar = this.zzg;
        if (zzkmVar.zzc()) {
            return;
        }
        this.zzg = zzkf.zzbF(zzkmVar);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze.size();
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final int zzd() {
        return this.zzd.size();
    }

    public final zzfr zze(int i2) {
        return (zzfr) this.zzf.get(i2);
    }

    public final zzgk zzi(int i2) {
        return (zzgk) this.zzg.get(i2);
    }

    public final List zzj() {
        return this.zzf;
    }

    public final List zzk() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzgh(null);
                }
                return new zzgi();
            }
            return zzkf.zzbI(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", zzfr.class, "zzg", zzgk.class});
        }
        return (byte) 1;
    }

    public final List zzm() {
        return this.zzg;
    }

    public final List zzn() {
        return this.zzd;
    }
}
