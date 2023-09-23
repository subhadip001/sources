package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzjg {
    private final zzcf zza = new zzcf();
    private final zzch zzb = new zzch();
    private final zzki zzc;
    private final Handler zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjd zzh;
    private zzjd zzi;
    private zzjd zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzjg(zzki zzkiVar, Handler handler) {
        this.zzc = zzkiVar;
        this.zzd = handler;
    }

    private final boolean zzA(zzci zzciVar, zzsb zzsbVar) {
        if (zzC(zzsbVar)) {
            return zzciVar.zze(zzciVar.zzn(zzsbVar.zza, this.zza).zzd, this.zzb, 0L).zzp == zzciVar.zza(zzsbVar.zza);
        }
        return false;
    }

    private final boolean zzB(zzci zzciVar) {
        zzjd zzjdVar = this.zzh;
        if (zzjdVar == null) {
            return true;
        }
        int zza = zzciVar.zza(zzjdVar.zzb);
        while (true) {
            zza = zzciVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzjdVar.zzg() != null && !zzjdVar.zzf.zzg) {
                zzjdVar = zzjdVar.zzg();
            }
            zzjd zzg = zzjdVar.zzg();
            if (zza == -1 || zzg == null || zzciVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzjdVar = zzg;
        }
        boolean zzm = zzm(zzjdVar);
        zzjdVar.zzf = zzg(zzciVar, zzjdVar.zzf);
        return !zzm;
    }

    private static final boolean zzC(zzsb zzsbVar) {
        return !zzsbVar.zzb() && zzsbVar.zze == -1;
    }

    private final long zzs(zzci zzciVar, Object obj, int i2) {
        zzciVar.zzn(obj, this.zza);
        this.zza.zzh(i2);
        this.zza.zzj(i2);
        return 0L;
    }

    private final zzje zzt(zzci zzciVar, zzjd zzjdVar, long j2) {
        long j3;
        zzje zzjeVar = zzjdVar.zzf;
        long zze = (zzjdVar.zze() + zzjeVar.zze) - j2;
        if (zzjeVar.zzg) {
            long j4 = 0;
            int zzi = zzciVar.zzi(zzciVar.zza(zzjeVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi == -1) {
                return null;
            }
            int i2 = zzciVar.zzd(zzi, this.zza, true).zzd;
            Object obj = this.zza.zzc;
            Objects.requireNonNull(obj);
            long j5 = zzjeVar.zza.zzd;
            if (zzciVar.zze(i2, this.zzb, 0L).zzo == zzi) {
                Pair zzm = zzciVar.zzm(this.zzb, this.zza, i2, -9223372036854775807L, Math.max(0L, zze));
                if (zzm == null) {
                    return null;
                }
                obj = zzm.first;
                long longValue = ((Long) zzm.second).longValue();
                zzjd zzg = zzjdVar.zzg();
                if (zzg != null && zzg.zzb.equals(obj)) {
                    j5 = zzg.zzf.zza.zzd;
                } else {
                    j5 = this.zze;
                    this.zze = 1 + j5;
                }
                j3 = longValue;
                j4 = -9223372036854775807L;
            } else {
                j3 = 0;
            }
            zzsb zzx = zzx(zzciVar, obj, j3, j5, this.zzb, this.zza);
            if (j4 != -9223372036854775807L && zzjeVar.zzc != -9223372036854775807L) {
                zzciVar.zzn(zzjeVar.zza.zza, this.zza).zzb();
            }
            return zzu(zzciVar, zzx, j4, j3);
        }
        zzsb zzsbVar = zzjeVar.zza;
        zzciVar.zzn(zzsbVar.zza, this.zza);
        if (zzsbVar.zzb()) {
            int i3 = zzsbVar.zzb;
            if (this.zza.zza(i3) == -1) {
                return null;
            }
            int zzf = this.zza.zzf(i3, zzsbVar.zzc);
            if (zzf < 0) {
                return zzv(zzciVar, zzsbVar.zza, i3, zzf, zzjeVar.zzc, zzsbVar.zzd);
            }
            long j6 = zzjeVar.zzc;
            if (j6 == -9223372036854775807L) {
                zzch zzchVar = this.zzb;
                zzcf zzcfVar = this.zza;
                Pair zzm2 = zzciVar.zzm(zzchVar, zzcfVar, zzcfVar.zzd, -9223372036854775807L, Math.max(0L, zze));
                if (zzm2 == null) {
                    return null;
                }
                j6 = ((Long) zzm2.second).longValue();
            }
            zzs(zzciVar, zzsbVar.zza, zzsbVar.zzb);
            return zzw(zzciVar, zzsbVar.zza, Math.max(0L, j6), zzjeVar.zzc, zzsbVar.zzd);
        }
        int zze2 = this.zza.zze(zzsbVar.zze);
        this.zza.zzl(zzsbVar.zze);
        if (zze2 != this.zza.zza(zzsbVar.zze)) {
            return zzv(zzciVar, zzsbVar.zza, zzsbVar.zze, zze2, zzjeVar.zze, zzsbVar.zzd);
        }
        zzs(zzciVar, zzsbVar.zza, zzsbVar.zze);
        return zzw(zzciVar, zzsbVar.zza, 0L, zzjeVar.zze, zzsbVar.zzd);
    }

    private final zzje zzu(zzci zzciVar, zzsb zzsbVar, long j2, long j3) {
        zzciVar.zzn(zzsbVar.zza, this.zza);
        if (zzsbVar.zzb()) {
            return zzv(zzciVar, zzsbVar.zza, zzsbVar.zzb, zzsbVar.zzc, j2, zzsbVar.zzd);
        }
        return zzw(zzciVar, zzsbVar.zza, j3, j2, zzsbVar.zzd);
    }

    private final zzje zzv(zzci zzciVar, Object obj, int i2, int i3, long j2, long j3) {
        zzsb zzsbVar = new zzsb(obj, i2, i3, j3);
        long zzg = zzciVar.zzn(zzsbVar.zza, this.zza).zzg(zzsbVar.zzb, zzsbVar.zzc);
        if (i3 == this.zza.zze(i2)) {
            this.zza.zzi();
        }
        this.zza.zzl(zzsbVar.zzb);
        long j4 = 0;
        if (zzg != -9223372036854775807L && zzg <= 0) {
            j4 = Math.max(0L, (-1) + zzg);
        }
        return new zzje(zzsbVar, j4, j2, -9223372036854775807L, zzg, false, false, false, false);
    }

    private final zzje zzw(zzci zzciVar, Object obj, long j2, long j3, long j4) {
        long j5;
        long j6;
        long j7;
        long j8 = j2;
        zzciVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j8);
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzl(zzc);
        }
        zzsb zzsbVar = new zzsb(obj, j4, zzc);
        boolean zzC = zzC(zzsbVar);
        boolean zzA = zzA(zzciVar, zzsbVar);
        boolean zzz = zzz(zzciVar, zzsbVar, zzC);
        if (zzc != -1) {
            this.zza.zzl(zzc);
        }
        if (zzc != -1) {
            this.zza.zzh(zzc);
            j5 = 0;
        } else {
            j5 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L) {
            j7 = j5;
            j6 = j7;
        } else {
            j6 = this.zza.zze;
            j7 = -9223372036854775807L;
        }
        if (j6 != -9223372036854775807L && j8 >= j6) {
            j8 = Math.max(0L, j6 - 1);
        }
        return new zzje(zzsbVar, j8, j3, j7, j6, false, zzC, zzA, zzz);
    }

    private static zzsb zzx(zzci zzciVar, Object obj, long j2, long j3, zzch zzchVar, zzcf zzcfVar) {
        zzciVar.zzn(obj, zzcfVar);
        zzciVar.zze(zzcfVar.zzd, zzchVar, 0L);
        zzciVar.zza(obj);
        if (zzcfVar.zze == 0) {
            zzcfVar.zzb();
        }
        zzciVar.zzn(obj, zzcfVar);
        int zzd = zzcfVar.zzd(j2);
        if (zzd == -1) {
            return new zzsb(obj, j3, zzcfVar.zzc(j2));
        }
        return new zzsb(obj, zzd, zzcfVar.zze(zzd), j3);
    }

    private final void zzy() {
        final zzfre zzi = zzfrh.zzi();
        for (zzjd zzjdVar = this.zzh; zzjdVar != null; zzjdVar = zzjdVar.zzg()) {
            zzi.zze(zzjdVar.zzf.zza);
        }
        zzjd zzjdVar2 = this.zzi;
        final zzsb zzsbVar = zzjdVar2 == null ? null : zzjdVar2.zzf.zza;
        this.zzd.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjf
            @Override // java.lang.Runnable
            public final void run() {
                zzjg.this.zzj(zzi, zzsbVar);
            }
        });
    }

    private final boolean zzz(zzci zzciVar, zzsb zzsbVar, boolean z) {
        int zza = zzciVar.zza(zzsbVar.zza);
        return !zzciVar.zze(zzciVar.zzd(zza, this.zza, false).zzd, this.zzb, 0L).zzi && zzciVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    public final zzjd zza() {
        zzjd zzjdVar = this.zzh;
        if (zzjdVar == null) {
            return null;
        }
        if (zzjdVar == this.zzi) {
            this.zzi = zzjdVar.zzg();
        }
        zzjdVar.zzn();
        int i2 = this.zzk - 1;
        this.zzk = i2;
        if (i2 == 0) {
            this.zzj = null;
            zzjd zzjdVar2 = this.zzh;
            this.zzl = zzjdVar2.zzb;
            this.zzm = zzjdVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzjd zzb() {
        zzjd zzjdVar = this.zzi;
        boolean z = false;
        if (zzjdVar != null && zzjdVar.zzg() != null) {
            z = true;
        }
        zzcw.zzf(z);
        this.zzi = this.zzi.zzg();
        zzy();
        return this.zzi;
    }

    public final zzjd zzc() {
        return this.zzj;
    }

    public final zzjd zzd() {
        return this.zzh;
    }

    public final zzjd zze() {
        return this.zzi;
    }

    public final zzje zzf(long j2, zzjo zzjoVar) {
        zzjd zzjdVar = this.zzj;
        return zzjdVar == null ? zzu(zzjoVar.zza, zzjoVar.zzb, zzjoVar.zzc, zzjoVar.zzs) : zzt(zzjoVar.zza, zzjdVar, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzje zzg(com.google.android.gms.internal.ads.zzci r19, com.google.android.gms.internal.ads.zzje r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzsb r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzA(r1, r3)
            boolean r14 = r0.zzz(r1, r3, r12)
            com.google.android.gms.internal.ads.zzsb r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzcf r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.zze
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.google.android.gms.internal.ads.zzcf r9 = r0.zza
            r9.zzh(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzcf r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzg(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.google.android.gms.internal.ads.zzcf r1 = r0.zza
            long r5 = r1.zze
            goto L48
        L57:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.zzcf r1 = r0.zza
            int r4 = r3.zzb
            r1.zzl(r4)
            goto L6e
        L65:
            int r1 = r3.zze
            if (r1 == r4) goto L6e
            com.google.android.gms.internal.ads.zzcf r4 = r0.zza
            r4.zzl(r1)
        L6e:
            com.google.android.gms.internal.ads.zzje r15 = new com.google.android.gms.internal.ads.zzje
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjg.zzg(com.google.android.gms.internal.ads.zzci, com.google.android.gms.internal.ads.zzje):com.google.android.gms.internal.ads.zzje");
    }

    public final zzsb zzh(zzci zzciVar, Object obj, long j2) {
        long j3;
        int zza;
        int i2 = zzciVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza = zzciVar.zza(obj2)) == -1 || zzciVar.zzd(zza, this.zza, false).zzd != i2) {
            zzjd zzjdVar = this.zzh;
            while (true) {
                if (zzjdVar == null) {
                    zzjd zzjdVar2 = this.zzh;
                    while (true) {
                        if (zzjdVar2 != null) {
                            int zza2 = zzciVar.zza(zzjdVar2.zzb);
                            if (zza2 != -1 && zzciVar.zzd(zza2, this.zza, false).zzd == i2) {
                                j3 = zzjdVar2.zzf.zza.zzd;
                                break;
                            }
                            zzjdVar2 = zzjdVar2.zzg();
                        } else {
                            j3 = this.zze;
                            this.zze = 1 + j3;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j3;
                            }
                        }
                    }
                } else if (zzjdVar.zzb.equals(obj)) {
                    j3 = zzjdVar.zzf.zza.zzd;
                    break;
                } else {
                    zzjdVar = zzjdVar.zzg();
                }
            }
        } else {
            j3 = this.zzm;
        }
        long j4 = j3;
        zzciVar.zzn(obj, this.zza);
        zzciVar.zze(this.zza.zzd, this.zzb, 0L);
        int zza3 = zzciVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzch zzchVar = this.zzb;
            if (zza3 >= zzchVar.zzo) {
                zzciVar.zzd(zza3, this.zza, true);
                this.zza.zzb();
                zzcf zzcfVar = this.zza;
                if (zzcfVar.zzd(zzcfVar.zze) != -1) {
                    obj3 = this.zza.zzc;
                    Objects.requireNonNull(obj3);
                }
                zza3--;
            } else {
                return zzx(zzciVar, obj3, j2, j4, zzchVar, this.zza);
            }
        }
    }

    public final void zzi() {
        if (this.zzk == 0) {
            return;
        }
        zzjd zzjdVar = this.zzh;
        zzcw.zzb(zzjdVar);
        this.zzl = zzjdVar.zzb;
        this.zzm = zzjdVar.zzf.zza.zzd;
        while (zzjdVar != null) {
            zzjdVar.zzn();
            zzjdVar = zzjdVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    public final /* synthetic */ void zzj(zzfre zzfreVar, zzsb zzsbVar) {
        this.zzc.zzT(zzfreVar.zzg(), zzsbVar);
    }

    public final void zzk(long j2) {
        zzjd zzjdVar = this.zzj;
        if (zzjdVar != null) {
            zzjdVar.zzm(j2);
        }
    }

    public final boolean zzl(zzrz zzrzVar) {
        zzjd zzjdVar = this.zzj;
        return zzjdVar != null && zzjdVar.zza == zzrzVar;
    }

    public final boolean zzm(zzjd zzjdVar) {
        boolean z = false;
        zzcw.zzf(zzjdVar != null);
        if (zzjdVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzjdVar;
        while (zzjdVar.zzg() != null) {
            zzjdVar = zzjdVar.zzg();
            if (zzjdVar == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzjdVar.zzn();
            this.zzk--;
        }
        this.zzj.zzo(null);
        zzy();
        return z;
    }

    public final boolean zzn() {
        zzjd zzjdVar = this.zzj;
        if (zzjdVar != null) {
            return !zzjdVar.zzf.zzi && zzjdVar.zzr() && this.zzj.zzf.zze != -9223372036854775807L && this.zzk < 100;
        }
        return true;
    }

    public final boolean zzo(zzci zzciVar, long j2, long j3) {
        zzje zzjeVar;
        boolean z;
        zzjd zzjdVar = null;
        for (zzjd zzjdVar2 = this.zzh; zzjdVar2 != null; zzjdVar2 = zzjdVar2.zzg()) {
            zzje zzjeVar2 = zzjdVar2.zzf;
            if (zzjdVar == null) {
                zzjeVar = zzg(zzciVar, zzjeVar2);
            } else {
                zzje zzt = zzt(zzciVar, zzjdVar, j2);
                if (zzt == null) {
                    return !zzm(zzjdVar);
                } else if (zzjeVar2.zzb != zzt.zzb || !zzjeVar2.zza.equals(zzt.zza)) {
                    return !zzm(zzjdVar);
                } else {
                    zzjeVar = zzt;
                }
            }
            zzjdVar2.zzf = zzjeVar.zza(zzjeVar2.zzc);
            long j4 = zzjeVar2.zze;
            long j5 = zzjeVar.zze;
            if (j4 != -9223372036854775807L && j4 != j5) {
                zzjdVar2.zzq();
                long j6 = zzjeVar.zze;
                long zze = j6 == -9223372036854775807L ? Long.MAX_VALUE : j6 + zzjdVar2.zze();
                if (zzjdVar2 == this.zzi) {
                    boolean z2 = zzjdVar2.zzf.zzf;
                    if (j3 == Long.MIN_VALUE || j3 >= zze) {
                        z = true;
                        return zzm(zzjdVar2) && !z;
                    }
                }
                z = false;
                if (zzm(zzjdVar2)) {
                }
            }
            zzjdVar = zzjdVar2;
        }
        return true;
    }

    public final boolean zzp(zzci zzciVar, int i2) {
        this.zzf = i2;
        return zzB(zzciVar);
    }

    public final boolean zzq(zzci zzciVar, boolean z) {
        this.zzg = z;
        return zzB(zzciVar);
    }

    public final zzjd zzr(zzjv[] zzjvVarArr, zzvn zzvnVar, zzvw zzvwVar, zzjn zzjnVar, zzje zzjeVar, zzvo zzvoVar) {
        zzjd zzjdVar = this.zzj;
        zzjd zzjdVar2 = new zzjd(zzjvVarArr, zzjdVar == null ? 1000000000000L : (zzjdVar.zze() + zzjdVar.zzf.zze) - zzjeVar.zzb, zzvnVar, zzvwVar, zzjnVar, zzjeVar, zzvoVar, null);
        zzjd zzjdVar3 = this.zzj;
        if (zzjdVar3 != null) {
            zzjdVar3.zzo(zzjdVar2);
        } else {
            this.zzh = zzjdVar2;
            this.zzi = zzjdVar2;
        }
        this.zzl = null;
        this.zzj = zzjdVar2;
        this.zzk++;
        zzy();
        return zzjdVar2;
    }
}
