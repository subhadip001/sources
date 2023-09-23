package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzawu implements zzawy, zzatw, zzays, zzaxi {
    private long zzB;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private final zzayl zzG;
    private final Uri zza;
    private final zzayi zzb;
    private final int zzc;
    private final Handler zzd;
    private final zzawv zze;
    private final zzawz zzf;
    private final long zzg;
    private final zzaws zzi;
    private zzawx zzo;
    private zzauc zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private int zzu;
    private zzaxp zzv;
    private long zzw;
    private boolean[] zzx;
    private boolean[] zzy;
    private boolean zzz;
    private final zzayw zzh = new zzayw("Loader:ExtractorMediaPeriod");
    private final zzaza zzj = new zzaza();
    private final Runnable zzk = new zzawn(this);
    private final Runnable zzl = new zzawo(this);
    private final Handler zzm = new Handler();
    private long zzC = -9223372036854775807L;
    private final SparseArray zzn = new SparseArray();
    private long zzA = -1;

    public zzawu(Uri uri, zzayi zzayiVar, zzatv[] zzatvVarArr, int i2, Handler handler, zzawv zzawvVar, zzawz zzawzVar, zzayl zzaylVar, String str, int i3, byte[] bArr) {
        this.zza = uri;
        this.zzb = zzayiVar;
        this.zzc = i2;
        this.zzd = handler;
        this.zze = zzawvVar;
        this.zzf = zzawzVar;
        this.zzG = zzaylVar;
        this.zzg = i3;
        this.zzi = new zzaws(zzatvVarArr, this);
    }

    private final int zzC() {
        int size = this.zzn.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((zzaxj) this.zzn.valueAt(i3)).zze();
        }
        return i2;
    }

    private final long zzD() {
        int size = this.zzn.size();
        long j2 = Long.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = Math.max(j2, ((zzaxj) this.zzn.valueAt(i2)).zzg());
        }
        return j2;
    }

    private final void zzE(zzawr zzawrVar) {
        long j2;
        if (this.zzA == -1) {
            j2 = zzawrVar.zzj;
            this.zzA = j2;
        }
    }

    private final void zzF() {
        zzauc zzaucVar;
        zzawr zzawrVar = new zzawr(this, this.zza, this.zzb, this.zzi, this.zzj);
        if (this.zzr) {
            zzayy.zze(zzG());
            long j2 = this.zzw;
            if (j2 != -9223372036854775807L && this.zzC >= j2) {
                this.zzE = true;
                this.zzC = -9223372036854775807L;
                return;
            }
            zzawrVar.zzd(this.zzp.zzb(this.zzC), this.zzC);
            this.zzC = -9223372036854775807L;
        }
        this.zzD = zzC();
        int i2 = this.zzc;
        if (i2 == -1) {
            i2 = (this.zzr && this.zzA == -1 && ((zzaucVar = this.zzp) == null || zzaucVar.zza() == -9223372036854775807L)) ? 6 : 3;
        }
        this.zzh.zza(zzawrVar, this, i2);
    }

    private final boolean zzG() {
        return this.zzC != -9223372036854775807L;
    }

    public static /* bridge */ /* synthetic */ void zzp(zzawu zzawuVar) {
        if (zzawuVar.zzF || zzawuVar.zzr || zzawuVar.zzp == null || !zzawuVar.zzq) {
            return;
        }
        int size = zzawuVar.zzn.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((zzaxj) zzawuVar.zzn.valueAt(i2)).zzh() == null) {
                return;
            }
        }
        zzawuVar.zzj.zzb();
        zzaxo[] zzaxoVarArr = new zzaxo[size];
        zzawuVar.zzy = new boolean[size];
        zzawuVar.zzx = new boolean[size];
        zzawuVar.zzw = zzawuVar.zzp.zza();
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 < size) {
                zzars zzh = ((zzaxj) zzawuVar.zzn.valueAt(i3)).zzh();
                zzaxoVarArr[i3] = new zzaxo(zzh);
                String str = zzh.zzf;
                if (!zzazd.zzb(str) && !zzazd.zza(str)) {
                    z = false;
                }
                zzawuVar.zzy[i3] = z;
                zzawuVar.zzz = z | zzawuVar.zzz;
                i3++;
            } else {
                zzawuVar.zzv = new zzaxp(zzaxoVarArr);
                zzawuVar.zzr = true;
                zzawuVar.zzf.zzg(new zzaxn(zzawuVar.zzw, zzawuVar.zzp.zzc()), null);
                zzawuVar.zzo.zzf(zzawuVar);
                return;
            }
        }
    }

    public final boolean zzA(int i2) {
        return this.zzE || (!zzG() && ((zzaxj) this.zzn.valueAt(i2)).zzm());
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x00bc, code lost:
        if (r1 != false) goto L55;
     */
    @Override // com.google.android.gms.internal.ads.zzawy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzB(com.google.android.gms.internal.ads.zzaxt[] r7, boolean[] r8, com.google.android.gms.internal.ads.zzaxk[] r9, boolean[] r10, long r11) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawu.zzB(com.google.android.gms.internal.ads.zzaxt[], boolean[], com.google.android.gms.internal.ads.zzaxk[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.zzawy, com.google.android.gms.internal.ads.zzaxm
    public final long zza() {
        if (this.zzu == 0) {
            return Long.MIN_VALUE;
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zzb() {
        this.zzq = true;
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final zzaue zzbi(int i2, int i3) {
        zzaxj zzaxjVar = (zzaxj) this.zzn.get(i2);
        if (zzaxjVar == null) {
            zzaxj zzaxjVar2 = new zzaxj(this.zzG, null);
            zzaxjVar2.zzk(this);
            this.zzn.put(i2, zzaxjVar2);
            return zzaxjVar2;
        }
        return zzaxjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzawy, com.google.android.gms.internal.ads.zzaxm
    public final boolean zzbj(long j2) {
        if (this.zzE) {
            return false;
        }
        if (this.zzr && this.zzu == 0) {
            return false;
        }
        boolean zzc = this.zzj.zzc();
        if (this.zzh.zzi()) {
            return zzc;
        }
        zzF();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zzc(zzauc zzaucVar) {
        this.zzp = zzaucVar;
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final /* bridge */ /* synthetic */ int zzd(zzayu zzayuVar, long j2, long j3, IOException iOException) {
        zzauc zzaucVar;
        zzawr zzawrVar = (zzawr) zzayuVar;
        zzE(zzawrVar);
        Handler handler = this.zzd;
        if (handler != null) {
            handler.post(new zzawq(this, iOException));
        }
        if (iOException instanceof zzaxq) {
            return 3;
        }
        int zzC = zzC();
        int i2 = this.zzD;
        if (this.zzA == -1 && ((zzaucVar = this.zzp) == null || zzaucVar.zza() == -9223372036854775807L)) {
            this.zzB = 0L;
            this.zzt = this.zzr;
            int size = this.zzn.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((zzaxj) this.zzn.valueAt(i3)).zzj(!this.zzr || this.zzx[i3]);
            }
            zzawrVar.zzd(0L, 0L);
        }
        this.zzD = zzC();
        return zzC <= i2 ? 0 : 1;
    }

    public final int zze(int i2, zzart zzartVar, zzatn zzatnVar, boolean z) {
        if (this.zzt || zzG()) {
            return -3;
        }
        return ((zzaxj) this.zzn.valueAt(i2)).zzf(zzartVar, zzatnVar, z, this.zzE, this.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final long zzg() {
        long zzD;
        if (this.zzE) {
            return Long.MIN_VALUE;
        }
        if (zzG()) {
            return this.zzC;
        }
        if (this.zzz) {
            int size = this.zzn.size();
            zzD = Long.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                if (this.zzy[i2]) {
                    zzD = Math.min(zzD, ((zzaxj) this.zzn.valueAt(i2)).zzg());
                }
            }
        } else {
            zzD = zzD();
        }
        return zzD == Long.MIN_VALUE ? this.zzB : zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final long zzh() {
        if (this.zzt) {
            this.zzt = false;
            return this.zzB;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final long zzi(long j2) {
        if (true != this.zzp.zzc()) {
            j2 = 0;
        }
        this.zzB = j2;
        int size = this.zzn.size();
        boolean zzG = true ^ zzG();
        int i2 = 0;
        while (true) {
            if (!zzG) {
                this.zzC = j2;
                this.zzE = false;
                zzayw zzaywVar = this.zzh;
                if (zzaywVar.zzi()) {
                    zzaywVar.zzf();
                } else {
                    for (int i3 = 0; i3 < size; i3++) {
                        ((zzaxj) this.zzn.valueAt(i3)).zzj(this.zzx[i3]);
                    }
                }
            } else if (i2 >= size) {
                break;
            } else {
                if (this.zzx[i2]) {
                    zzG = ((zzaxj) this.zzn.valueAt(i2)).zzn(j2, false);
                }
                i2++;
            }
        }
        this.zzt = false;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final zzaxp zzn() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final void zzq(long j2) {
    }

    public final void zzr() {
        this.zzh.zzg(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final void zzs() {
        this.zzh.zzg(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final /* bridge */ /* synthetic */ void zzt(zzayu zzayuVar, long j2, long j3, boolean z) {
        zzE((zzawr) zzayuVar);
        if (z || this.zzu <= 0) {
            return;
        }
        int size = this.zzn.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzaxj) this.zzn.valueAt(i2)).zzj(this.zzx[i2]);
        }
        this.zzo.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final /* bridge */ /* synthetic */ void zzu(zzayu zzayuVar, long j2, long j3) {
        zzE((zzawr) zzayuVar);
        this.zzE = true;
        if (this.zzw == -9223372036854775807L) {
            long zzD = zzD();
            long j4 = zzD == Long.MIN_VALUE ? 0L : zzD + 10000;
            this.zzw = j4;
            this.zzf.zzg(new zzaxn(j4, this.zzp.zzc()), null);
        }
        this.zzo.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaxi
    public final void zzv(zzars zzarsVar) {
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzawy
    public final void zzw(zzawx zzawxVar, long j2) {
        this.zzo = zzawxVar;
        this.zzj.zzc();
        zzF();
    }

    public final void zzx() {
        this.zzh.zzh(new zzawp(this, this.zzi));
        this.zzm.removeCallbacksAndMessages(null);
        this.zzF = true;
    }

    public final void zzy(int i2, long j2) {
        zzaxj zzaxjVar = (zzaxj) this.zzn.valueAt(i2);
        if (this.zzE && j2 > zzaxjVar.zzg()) {
            zzaxjVar.zzl();
        } else {
            zzaxjVar.zzn(j2, true);
        }
    }
}
