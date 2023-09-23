package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zztq implements zzzz {
    private boolean zzA;
    private boolean zzB;
    private zzpk zzC;
    private final zztk zza;
    private final zzpj zzd;
    private final zzpd zze;
    private zztp zzf;
    private zzad zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzad zzy;
    private zzad zzz;
    private final zztm zzb = new zztm();
    private int zzh = 1000;
    private int[] zzi = new int[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzzy[] zzn = new zzzy[1000];
    private final zztx zzc = new zztx(new zzda() { // from class: com.google.android.gms.internal.ads.zztl
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;

    public zztq(zzvw zzvwVar, zzpj zzpjVar, zzpd zzpdVar, byte[] bArr) {
        this.zzd = zzpjVar;
        this.zze = zzpdVar;
        this.zza = new zztk(zzvwVar, null);
    }

    private final int zzA(int i2) {
        int i3 = this.zzq + i2;
        int i4 = this.zzh;
        return i3 < i4 ? i3 : i3 - i4;
    }

    private final synchronized int zzB(zzja zzjaVar, zzgc zzgcVar, boolean z, boolean z2, zztm zztmVar) {
        zzgcVar.zzc = false;
        if (!zzJ()) {
            if (!z2 && !this.zzv) {
                zzad zzadVar = this.zzz;
                if (zzadVar == null || (!z && zzadVar == this.zzg)) {
                    return -3;
                }
                zzG(zzadVar, zzjaVar);
                return -5;
            }
            zzgcVar.zzc(4);
            return -4;
        }
        zzad zzadVar2 = ((zzto) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z && zzadVar2 == this.zzg) {
            int zzA = zzA(this.zzr);
            if (!zzK(zzA)) {
                zzgcVar.zzc = true;
                return -3;
            }
            zzgcVar.zzc(this.zzl[zzA]);
            long j2 = this.zzm[zzA];
            zzgcVar.zzd = j2;
            if (j2 < this.zzs) {
                zzgcVar.zza(Integer.MIN_VALUE);
            }
            zztmVar.zza = this.zzk[zzA];
            zztmVar.zzb = this.zzj[zzA];
            zztmVar.zzc = this.zzn[zzA];
            return -4;
        }
        zzG(zzadVar2, zzjaVar);
        return -5;
    }

    private final synchronized long zzC(long j2, boolean z, boolean z2) {
        int i2;
        int i3 = this.zzo;
        if (i3 != 0) {
            long[] jArr = this.zzm;
            int i4 = this.zzq;
            if (j2 >= jArr[i4]) {
                if (z2 && (i2 = this.zzr) != i3) {
                    i3 = i2 + 1;
                }
                int zzz = zzz(i4, i3, j2, false);
                if (zzz == -1) {
                    return -1L;
                }
                return zzE(zzz);
            }
        }
        return -1L;
    }

    private final synchronized long zzD() {
        int i2 = this.zzo;
        if (i2 == 0) {
            return -1L;
        }
        return zzE(i2);
    }

    private final long zzE(int i2) {
        int i3;
        long j2 = this.zzt;
        long j3 = Long.MIN_VALUE;
        if (i2 != 0) {
            int zzA = zzA(i2 - 1);
            for (int i4 = 0; i4 < i2; i4++) {
                j3 = Math.max(j3, this.zzm[zzA]);
                if ((this.zzl[zzA] & 1) != 0) {
                    break;
                }
                zzA--;
                if (zzA == -1) {
                    zzA = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j2, j3);
        this.zzo -= i2;
        int i5 = this.zzp + i2;
        this.zzp = i5;
        int i6 = this.zzq + i2;
        this.zzq = i6;
        int i7 = this.zzh;
        if (i6 >= i7) {
            this.zzq = i6 - i7;
        }
        int i8 = this.zzr - i2;
        this.zzr = i8;
        if (i8 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i5);
        if (this.zzo == 0) {
            int i9 = this.zzq;
            if (i9 == 0) {
                i9 = this.zzh;
            }
            return this.zzj[i9 - 1] + this.zzk[i3];
        }
        return this.zzj[this.zzq];
    }

    private final synchronized void zzF(long j2, int i2, long j3, int i3, zzzy zzzyVar) {
        int i4 = this.zzo;
        if (i4 > 0) {
            int zzA = zzA(i4 - 1);
            zzcw.zzd(this.zzj[zzA] + ((long) this.zzk[zzA]) <= j3);
        }
        this.zzv = (536870912 & i2) != 0;
        this.zzu = Math.max(this.zzu, j2);
        int zzA2 = zzA(this.zzo);
        this.zzm[zzA2] = j2;
        this.zzj[zzA2] = j3;
        this.zzk[zzA2] = i3;
        this.zzl[zzA2] = i2;
        this.zzn[zzA2] = zzzyVar;
        this.zzi[zzA2] = 0;
        if (this.zzc.zzf() || !((zzto) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzpi zzpiVar = zzpi.zzb;
            zztx zztxVar = this.zzc;
            int i5 = this.zzp + this.zzo;
            zzad zzadVar = this.zzz;
            Objects.requireNonNull(zzadVar);
            zztxVar.zzc(i5, new zzto(zzadVar, zzpiVar, null));
        }
        int i6 = this.zzo + 1;
        this.zzo = i6;
        int i7 = this.zzh;
        if (i6 == i7) {
            int i8 = i7 + 1000;
            int[] iArr = new int[i8];
            long[] jArr = new long[i8];
            long[] jArr2 = new long[i8];
            int[] iArr2 = new int[i8];
            int[] iArr3 = new int[i8];
            zzzy[] zzzyVarArr = new zzzy[i8];
            int i9 = this.zzq;
            int i10 = i7 - i9;
            System.arraycopy(this.zzj, i9, jArr, 0, i10);
            System.arraycopy(this.zzm, this.zzq, jArr2, 0, i10);
            System.arraycopy(this.zzl, this.zzq, iArr2, 0, i10);
            System.arraycopy(this.zzk, this.zzq, iArr3, 0, i10);
            System.arraycopy(this.zzn, this.zzq, zzzyVarArr, 0, i10);
            System.arraycopy(this.zzi, this.zzq, iArr, 0, i10);
            int i11 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr, i10, i11);
            System.arraycopy(this.zzm, 0, jArr2, i10, i11);
            System.arraycopy(this.zzl, 0, iArr2, i10, i11);
            System.arraycopy(this.zzk, 0, iArr3, i10, i11);
            System.arraycopy(this.zzn, 0, zzzyVarArr, i10, i11);
            System.arraycopy(this.zzi, 0, iArr, i10, i11);
            this.zzj = jArr;
            this.zzm = jArr2;
            this.zzl = iArr2;
            this.zzk = iArr3;
            this.zzn = zzzyVarArr;
            this.zzi = iArr;
            this.zzq = 0;
            this.zzh = i8;
        }
    }

    private final void zzG(zzad zzadVar, zzja zzjaVar) {
        zzad zzadVar2 = this.zzg;
        zzv zzvVar = zzadVar2 == null ? null : zzadVar2.zzp;
        this.zzg = zzadVar;
        zzv zzvVar2 = zzadVar.zzp;
        zzjaVar.zza = zzadVar.zzc(this.zzd.zza(zzadVar));
        zzjaVar.zzb = this.zzC;
        if (zzadVar2 == null || !zzeg.zzS(zzvVar, zzvVar2)) {
            zzpk zzpkVar = zzadVar.zzp != null ? new zzpk(new zzpb(new zzpm(1), 6001)) : null;
            this.zzC = zzpkVar;
            zzjaVar.zzb = zzpkVar;
        }
    }

    private final void zzH() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzI() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzJ() {
        return this.zzr != this.zzo;
    }

    private final boolean zzK(int i2) {
        if (this.zzC != null) {
            return (this.zzl[i2] & CommonUtils.BYTES_IN_A_GIGABYTE) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzL(zzad zzadVar) {
        this.zzx = false;
        if (zzeg.zzS(zzadVar, this.zzz)) {
            return false;
        }
        if (!this.zzc.zzf() && ((zzto) this.zzc.zzb()).zza.equals(zzadVar)) {
            this.zzz = ((zzto) this.zzc.zzb()).zza;
        } else {
            this.zzz = zzadVar;
        }
        zzad zzadVar2 = this.zzz;
        this.zzA = zzbo.zzf(zzadVar2.zzm, zzadVar2.zzj);
        this.zzB = false;
        return true;
    }

    public static /* synthetic */ void zzl(zzto zztoVar) {
        zzpi zzpiVar = zztoVar.zzb;
        int i2 = zzph.zza;
    }

    private final int zzz(int i2, int i3, long j2, boolean z) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = (this.zzm[i2] > j2 ? 1 : (this.zzm[i2] == j2 ? 0 : -1));
            if (i6 > 0) {
                break;
            }
            if (!z || (this.zzl[i2] & 1) != 0) {
                i4 = i5;
                if (i6 == 0) {
                    break;
                }
            }
            i2++;
            if (i2 == this.zzh) {
                i2 = 0;
            }
        }
        return i4;
    }

    public final int zza() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzb(long j2, boolean z) {
        int i2 = this.zzr;
        int zzA = zzA(i2);
        if (zzJ() && j2 >= this.zzm[zzA]) {
            if (j2 > this.zzu && z) {
                return this.zzo - i2;
            }
            int zzz = zzz(zzA, this.zzo - i2, j2, true);
            if (zzz == -1) {
                return 0;
            }
            return zzz;
        }
        return 0;
    }

    public final int zzc() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r9 != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(com.google.android.gms.internal.ads.zzja r9, com.google.android.gms.internal.ads.zzgc r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = 1
            goto L9
        L7:
            r0 = 0
            r5 = 0
        L9:
            com.google.android.gms.internal.ads.zztm r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzB(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzg()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zztk r9 = r8.zza
            com.google.android.gms.internal.ads.zztm r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.zztk r9 = r8.zza
            com.google.android.gms.internal.ads.zztm r11 = r8.zzb
            r9.zze(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L3d:
            r9 = -4
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztq.zzd(com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzgc, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final /* synthetic */ int zze(zzp zzpVar, int i2, boolean z) {
        return zzzx.zza(this, zzpVar, i2, true);
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final int zzf(zzp zzpVar, int i2, boolean z, int i3) {
        return this.zza.zza(zzpVar, i2, z);
    }

    public final synchronized long zzg() {
        return this.zzu;
    }

    public final synchronized zzad zzh() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzi(long j2, boolean z, boolean z2) {
        this.zza.zzc(zzC(j2, false, z2));
    }

    public final void zzj() {
        this.zza.zzc(zzD());
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final void zzk(zzad zzadVar) {
        this.zzy = zzadVar;
        boolean zzL = zzL(zzadVar);
        zztp zztpVar = this.zzf;
        if (zztpVar == null || !zzL) {
            return;
        }
        zztpVar.zzJ(zzadVar);
    }

    public final void zzm() {
        zzpk zzpkVar = this.zzC;
        if (zzpkVar != null) {
            throw zzpkVar.zza();
        }
    }

    public final void zzn() {
        zzj();
        zzH();
    }

    public final void zzo() {
        zzp(true);
        zzH();
    }

    public final void zzp(boolean z) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final /* synthetic */ void zzq(zzdy zzdyVar, int i2) {
        zzzx.zzb(this, zzdyVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final void zzr(zzdy zzdyVar, int i2, int i3) {
        this.zza.zzh(zzdyVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final void zzs(long j2, int i2, int i3, int i4, zzzy zzzyVar) {
        int i5 = i2 & 1;
        if (this.zzw) {
            if (i5 == 0) {
                return;
            }
            this.zzw = false;
        }
        if (this.zzA) {
            if (j2 < this.zzs) {
                return;
            }
            if (i5 == 0) {
                if (!this.zzB) {
                    Log.w("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i2 |= 1;
            }
        }
        zzF(j2, i2, (this.zza.zzb() - i3) - i4, i3, zzzyVar);
    }

    public final void zzt(long j2) {
        this.zzs = j2;
    }

    public final void zzu(zztp zztpVar) {
        this.zzf = zztpVar;
    }

    public final synchronized void zzv(int i2) {
        boolean z = false;
        if (i2 >= 0) {
            try {
                if (this.zzr + i2 <= this.zzo) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzcw.zzd(z);
        this.zzr += i2;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    public final synchronized boolean zzx(boolean z) {
        boolean z2 = true;
        if (zzJ()) {
            if (((zzto) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzK(zzA(this.zzr));
        }
        if (!z && !this.zzv) {
            zzad zzadVar = this.zzz;
            if (zzadVar == null) {
                z2 = false;
            } else if (zzadVar == this.zzg) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean zzy(long j2, boolean z) {
        zzI();
        int i2 = this.zzr;
        int zzA = zzA(i2);
        if (!zzJ() || j2 < this.zzm[zzA] || (j2 > this.zzu && !z)) {
            return false;
        }
        int zzz = zzz(zzA, this.zzo - i2, j2, true);
        if (zzz == -1) {
            return false;
        }
        this.zzs = j2;
        this.zzr += zzz;
        return true;
    }
}
