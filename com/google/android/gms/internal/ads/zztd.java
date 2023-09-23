package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zztd implements zzrz, zzyv, zzwc, zzwh, zztp {
    private static final Map zzb;
    private static final zzad zzc;
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private long zzG;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzwa zzM;
    private final zzvw zzN;
    private final Uri zzd;
    private final zzer zze;
    private final zzpj zzf;
    private final zzsk zzg;
    private final zzpd zzh;
    private final zzsz zzi;
    private final long zzj;
    private final zzsu zzl;
    private zzry zzq;
    private zzabl zzr;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zztc zzx;
    private zzzv zzy;
    private final zzwk zzk = new zzwk("ProgressiveMediaPeriod");
    private final zzcz zzm = new zzcz(zzcx.zza);
    private final Runnable zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zzsv
        @Override // java.lang.Runnable
        public final void run() {
            zztd.zzz(zztd.this);
        }
    };
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzsw
        @Override // java.lang.Runnable
        public final void run() {
            zztd.this.zzC();
        }
    };
    private final Handler zzp = zzeg.zzC(null);
    private zztb[] zzt = new zztb[0];
    private zztq[] zzs = new zztq[0];
    private long zzH = -9223372036854775807L;
    private long zzF = -1;
    private long zzz = -9223372036854775807L;
    private int zzB = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzab zzabVar = new zzab();
        zzabVar.zzH("icy");
        zzabVar.zzS("application/x-icy");
        zzc = zzabVar.zzY();
    }

    public zztd(Uri uri, zzer zzerVar, zzsu zzsuVar, zzpj zzpjVar, zzpd zzpdVar, zzwa zzwaVar, zzsk zzskVar, zzsz zzszVar, zzvw zzvwVar, String str, int i2, byte[] bArr) {
        this.zzd = uri;
        this.zze = zzerVar;
        this.zzf = zzpjVar;
        this.zzh = zzpdVar;
        this.zzM = zzwaVar;
        this.zzg = zzskVar;
        this.zzi = zzszVar;
        this.zzN = zzvwVar;
        this.zzj = i2;
        this.zzl = zzsuVar;
    }

    private final int zzN() {
        int i2 = 0;
        for (zztq zztqVar : this.zzs) {
            i2 += zztqVar.zzc();
        }
        return i2;
    }

    public final long zzO() {
        long j2 = Long.MIN_VALUE;
        for (zztq zztqVar : this.zzs) {
            j2 = Math.max(j2, zztqVar.zzg());
        }
        return j2;
    }

    private final zzzz zzP(zztb zztbVar) {
        int length = this.zzs.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (zztbVar.equals(this.zzt[i2])) {
                return this.zzs[i2];
            }
        }
        zzvw zzvwVar = this.zzN;
        zzpj zzpjVar = this.zzf;
        zzpd zzpdVar = this.zzh;
        Objects.requireNonNull(zzpjVar);
        zztq zztqVar = new zztq(zzvwVar, zzpjVar, zzpdVar, null);
        zztqVar.zzu(this);
        int i3 = length + 1;
        zztb[] zztbVarArr = (zztb[]) Arrays.copyOf(this.zzt, i3);
        zztbVarArr[length] = zztbVar;
        this.zzt = (zztb[]) zzeg.zzab(zztbVarArr);
        zztq[] zztqVarArr = (zztq[]) Arrays.copyOf(this.zzs, i3);
        zztqVarArr[length] = zztqVar;
        this.zzs = (zztq[]) zzeg.zzab(zztqVarArr);
        return zztqVar;
    }

    private final void zzQ() {
        zzcw.zzf(this.zzv);
        Objects.requireNonNull(this.zzx);
        Objects.requireNonNull(this.zzy);
    }

    private final void zzR(zzsy zzsyVar) {
        long j2;
        if (this.zzF == -1) {
            j2 = zzsyVar.zzm;
            this.zzF = j2;
        }
    }

    public final void zzS() {
        zzbl zzc2;
        int i2;
        if (this.zzL || this.zzv || !this.zzu || this.zzy == null) {
            return;
        }
        for (zztq zztqVar : this.zzs) {
            if (zztqVar.zzh() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzs.length;
        zzck[] zzckVarArr = new zzck[length];
        boolean[] zArr = new boolean[length];
        for (int i3 = 0; i3 < length; i3++) {
            zzad zzh = this.zzs[i3].zzh();
            Objects.requireNonNull(zzh);
            String str = zzh.zzm;
            boolean zzg = zzbo.zzg(str);
            boolean z = zzg || zzbo.zzh(str);
            zArr[i3] = z;
            this.zzw = z | this.zzw;
            zzabl zzablVar = this.zzr;
            if (zzablVar != null) {
                if (zzg || this.zzt[i3].zzb) {
                    zzbl zzblVar = zzh.zzk;
                    if (zzblVar == null) {
                        zzc2 = new zzbl(zzablVar);
                    } else {
                        zzc2 = zzblVar.zzc(zzablVar);
                    }
                    zzab zzb2 = zzh.zzb();
                    zzb2.zzM(zzc2);
                    zzh = zzb2.zzY();
                }
                if (zzg && zzh.zzg == -1 && zzh.zzh == -1 && (i2 = zzablVar.zza) != -1) {
                    zzab zzb3 = zzh.zzb();
                    zzb3.zzv(i2);
                    zzh = zzb3.zzY();
                }
            }
            zzckVarArr[i3] = new zzck(Integer.toString(i3), zzh.zzc(this.zzf.zza(zzh)));
        }
        this.zzx = new zztc(new zztz(zzckVarArr), zArr);
        this.zzv = true;
        zzry zzryVar = this.zzq;
        Objects.requireNonNull(zzryVar);
        zzryVar.zzi(this);
    }

    private final void zzT(int i2) {
        zzQ();
        zztc zztcVar = this.zzx;
        boolean[] zArr = zztcVar.zzd;
        if (zArr[i2]) {
            return;
        }
        zzad zzb2 = zztcVar.zza.zzb(i2).zzb(0);
        this.zzg.zzd(zzbo.zzb(zzb2.zzm), zzb2, 0, null, this.zzG);
        zArr[i2] = true;
    }

    private final void zzU(int i2) {
        zzQ();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i2] && !this.zzs[i2].zzx(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zztq zztqVar : this.zzs) {
                zztqVar.zzp(false);
            }
            zzry zzryVar = this.zzq;
            Objects.requireNonNull(zzryVar);
            zzryVar.zzg(this);
        }
    }

    private final void zzV() {
        zzew zzewVar;
        long j2;
        long j3;
        zzsy zzsyVar = new zzsy(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzcw.zzf(zzW());
            long j4 = this.zzz;
            if (j4 != -9223372036854775807L && this.zzH > j4) {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
            zzzv zzzvVar = this.zzy;
            Objects.requireNonNull(zzzvVar);
            zzsy.zzg(zzsyVar, zzzvVar.zzg(this.zzH).zza.zzc, this.zzH);
            for (zztq zztqVar : this.zzs) {
                zztqVar.zzt(this.zzH);
            }
            this.zzH = -9223372036854775807L;
        }
        this.zzJ = zzN();
        long zza = this.zzk.zza(zzsyVar, this, zzwa.zza(this.zzB));
        zzewVar = zzsyVar.zzl;
        zzsk zzskVar = this.zzg;
        j2 = zzsyVar.zzb;
        zzrs zzrsVar = new zzrs(j2, zzewVar, zzewVar.zza, Collections.emptyMap(), zza, 0L, 0L);
        j3 = zzsyVar.zzk;
        zzskVar.zzl(zzrsVar, 1, -1, null, 0, null, j3, this.zzz);
    }

    private final boolean zzW() {
        return this.zzH != -9223372036854775807L;
    }

    private final boolean zzX() {
        return this.zzD || zzW();
    }

    public static /* synthetic */ void zzz(zztd zztdVar) {
        zztdVar.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final void zzB() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    public final /* synthetic */ void zzC() {
        if (this.zzL) {
            return;
        }
        zzry zzryVar = this.zzq;
        Objects.requireNonNull(zzryVar);
        zzryVar.zzg(this);
    }

    public final /* synthetic */ void zzD(zzzv zzzvVar) {
        this.zzy = this.zzr == null ? zzzvVar : new zzzu(-9223372036854775807L, 0L);
        this.zzz = zzzvVar.zze();
        boolean z = false;
        if (this.zzF == -1 && zzzvVar.zze() == -9223372036854775807L) {
            z = true;
        }
        this.zzA = z;
        this.zzB = true == z ? 7 : 1;
        this.zzi.zza(this.zzz, zzzvVar.zzh(), this.zzA);
        if (this.zzv) {
            return;
        }
        zzS();
    }

    public final void zzE() {
        this.zzk.zzi(zzwa.zza(this.zzB));
    }

    public final void zzF(int i2) {
        this.zzs[i2].zzm();
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final /* bridge */ /* synthetic */ void zzG(zzwg zzwgVar, long j2, long j3, boolean z) {
        zzfs zzfsVar;
        long j4;
        zzew zzewVar;
        long j5;
        long unused;
        zzsy zzsyVar = (zzsy) zzwgVar;
        zzfsVar = zzsyVar.zzd;
        j4 = zzsyVar.zzb;
        zzewVar = zzsyVar.zzl;
        zzrs zzrsVar = new zzrs(j4, zzewVar, zzfsVar.zzh(), zzfsVar.zzi(), j2, j3, zzfsVar.zzg());
        unused = zzsyVar.zzb;
        zzsk zzskVar = this.zzg;
        j5 = zzsyVar.zzk;
        zzskVar.zzf(zzrsVar, 1, -1, null, 0, null, j5, this.zzz);
        if (z) {
            return;
        }
        zzR(zzsyVar);
        for (zztq zztqVar : this.zzs) {
            zztqVar.zzp(false);
        }
        if (this.zzE > 0) {
            zzry zzryVar = this.zzq;
            Objects.requireNonNull(zzryVar);
            zzryVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final /* bridge */ /* synthetic */ void zzH(zzwg zzwgVar, long j2, long j3) {
        zzfs zzfsVar;
        long j4;
        zzew zzewVar;
        long j5;
        zzzv zzzvVar;
        long unused;
        if (this.zzz == -9223372036854775807L && (zzzvVar = this.zzy) != null) {
            boolean zzh = zzzvVar.zzh();
            long zzO = zzO();
            long j6 = zzO == Long.MIN_VALUE ? 0L : zzO + 10000;
            this.zzz = j6;
            this.zzi.zza(j6, zzh, this.zzA);
        }
        zzsy zzsyVar = (zzsy) zzwgVar;
        zzfsVar = zzsyVar.zzd;
        j4 = zzsyVar.zzb;
        zzewVar = zzsyVar.zzl;
        zzrs zzrsVar = new zzrs(j4, zzewVar, zzfsVar.zzh(), zzfsVar.zzi(), j2, j3, zzfsVar.zzg());
        unused = zzsyVar.zzb;
        zzsk zzskVar = this.zzg;
        j5 = zzsyVar.zzk;
        zzskVar.zzh(zzrsVar, 1, -1, null, 0, null, j5, this.zzz);
        zzR(zzsyVar);
        this.zzK = true;
        zzry zzryVar = this.zzq;
        Objects.requireNonNull(zzryVar);
        zzryVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzI() {
        for (zztq zztqVar : this.zzs) {
            zztqVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzJ(zzad zzadVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzK() {
        if (this.zzv) {
            for (zztq zztqVar : this.zzs) {
                zztqVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final void zzL(final zzzv zzzvVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsx
            @Override // java.lang.Runnable
            public final void run() {
                zztd.this.zzD(zzzvVar);
            }
        });
    }

    public final boolean zzM(int i2) {
        return !zzX() && this.zzs[i2].zzx(this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zza(long j2, zzjx zzjxVar) {
        long j3;
        zzQ();
        if (this.zzy.zzh()) {
            zzzt zzg = this.zzy.zzg(j2);
            long j4 = zzg.zza.zzb;
            long j5 = zzg.zzb.zzb;
            long j6 = zzjxVar.zzf;
            if (j6 != 0) {
                j3 = j6;
            } else if (zzjxVar.zzg == 0) {
                return j2;
            } else {
                j3 = 0;
            }
            long zzx = zzeg.zzx(j2, j3, Long.MIN_VALUE);
            long zzq = zzeg.zzq(j2, zzjxVar.zzg, Long.MAX_VALUE);
            boolean z = true;
            boolean z2 = zzx <= j4 && j4 <= zzq;
            z = (zzx > j5 || j5 > zzq) ? false : false;
            if (z2 && z) {
                if (Math.abs(j4 - j2) > Math.abs(j5 - j2)) {
                    return j5;
                }
            } else if (!z2) {
                return z ? j5 : zzx;
            }
            return j4;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzb() {
        long j2;
        zzQ();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzK) {
            return Long.MIN_VALUE;
        }
        if (zzW()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i2] && !this.zzs[i2].zzw()) {
                    j2 = Math.min(j2, this.zzs[i2].zzg());
                }
            }
        } else {
            j2 = Long.MAX_VALUE;
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = zzO();
        }
        return j2 == Long.MIN_VALUE ? this.zzG : j2;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzc() {
        if (this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zzd() {
        if (this.zzD) {
            if (this.zzK || zzN() > this.zzJ) {
                this.zzD = false;
                return this.zzG;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zze(long j2) {
        int i2;
        zzQ();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zzh()) {
            j2 = 0;
        }
        this.zzD = false;
        this.zzG = j2;
        if (zzW()) {
            this.zzH = j2;
            return j2;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            while (i2 < length) {
                i2 = (this.zzs[i2].zzy(j2, false) || (!zArr[i2] && this.zzw)) ? i2 + 1 : 0;
            }
            return j2;
        }
        this.zzI = false;
        this.zzH = j2;
        this.zzK = false;
        zzwk zzwkVar = this.zzk;
        if (zzwkVar.zzl()) {
            for (zztq zztqVar : this.zzs) {
                zztqVar.zzj();
            }
            this.zzk.zzg();
        } else {
            zzwkVar.zzh();
            for (zztq zztqVar2 : this.zzs) {
                zztqVar2.zzp(false);
            }
        }
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x003c, code lost:
        if (r2 == 0) goto L77;
     */
    @Override // com.google.android.gms.internal.ads.zzrz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzf(com.google.android.gms.internal.ads.zzvh[] r8, boolean[] r9, com.google.android.gms.internal.ads.zztr[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztd.zzf(com.google.android.gms.internal.ads.zzvh[], boolean[], com.google.android.gms.internal.ads.zztr[], boolean[], long):long");
    }

    public final int zzg(int i2, zzja zzjaVar, zzgc zzgcVar, int i3) {
        if (zzX()) {
            return -3;
        }
        zzT(i2);
        int zzd = this.zzs[i2].zzd(zzjaVar, zzgcVar, i3, this.zzK);
        if (zzd == -3) {
            zzU(i2);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final zztz zzh() {
        zzQ();
        return this.zzx.zza;
    }

    public final int zzi(int i2, long j2) {
        if (zzX()) {
            return 0;
        }
        zzT(i2);
        zztq zztqVar = this.zzs[i2];
        int zzb2 = zztqVar.zzb(j2, this.zzK);
        zztqVar.zzv(zzb2);
        if (zzb2 == 0) {
            zzU(i2);
            return 0;
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzj(long j2, boolean z) {
        zzQ();
        if (zzW()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.zzs[i2].zzi(j2, false, zArr[i2]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzk() {
        zzE();
        if (this.zzK && !this.zzv) {
            throw zzbp.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzl(zzry zzryVar, long j2) {
        this.zzq = zzryVar;
        this.zzm.zze();
        zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final void zzm(long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzo(long j2) {
        if (this.zzK || this.zzk.zzk() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zze = this.zzm.zze();
        if (this.zzk.zzl()) {
            return zze;
        }
        zzV();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0103  */
    @Override // com.google.android.gms.internal.ads.zzwc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzwe zzt(com.google.android.gms.internal.ads.zzwg r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztd.zzt(com.google.android.gms.internal.ads.zzwg, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzwe");
    }

    public final zzzz zzu() {
        return zzP(new zztb(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final zzzz zzv(int i2, int i3) {
        return zzP(new zztb(i2, false));
    }
}
