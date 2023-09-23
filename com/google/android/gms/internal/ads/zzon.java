package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import f.a.b.a.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzon implements zznr {
    private boolean zzA;
    private boolean zzB;
    private long zzC;
    private float zzD;
    private zzmz[] zzE;
    private ByteBuffer[] zzF;
    private ByteBuffer zzG;
    private int zzH;
    private ByteBuffer zzI;
    private byte[] zzJ;
    private int zzK;
    private int zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private zzj zzR;
    private long zzS;
    private boolean zzT;
    private boolean zzU;
    private final zzod zzV;
    private final zzmw zza;
    private final zznx zzb;
    private final zzoy zzc;
    private final zzmz[] zzd;
    private final zzmz[] zze;
    private final ConditionVariable zzf;
    private final zznv zzg;
    private final ArrayDeque zzh;
    private zzol zzi;
    private final zzog zzj;
    private final zzog zzk;
    private final zzoa zzl;
    private zzmv zzm;
    private zzno zzn;
    private zzoc zzo;
    private zzoc zzp;
    private AudioTrack zzq;
    private zzi zzr;
    private zzof zzs;
    private zzof zzt;
    private final zzbt zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private int zzz;

    public /* synthetic */ zzon(zzob zzobVar, zzom zzomVar) {
        zzmw zzmwVar;
        zzod zzodVar;
        zzmwVar = zzobVar.zzb;
        this.zza = zzmwVar;
        zzodVar = zzobVar.zzc;
        this.zzV = zzodVar;
        int i2 = zzeg.zza;
        this.zzl = zzobVar.zza;
        this.zzf = new ConditionVariable(true);
        this.zzg = new zznv(new zzoi(this, null));
        zznx zznxVar = new zznx();
        this.zzb = zznxVar;
        zzoy zzoyVar = new zzoy();
        this.zzc = zzoyVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new zzou(), zznxVar, zzoyVar);
        Collections.addAll(arrayList, zzodVar.zze());
        this.zzd = (zzmz[]) arrayList.toArray(new zzmz[0]);
        this.zze = new zzmz[]{new zzoq()};
        this.zzD = 1.0f;
        this.zzr = zzi.zza;
        this.zzQ = 0;
        this.zzR = new zzj(0, 0.0f);
        zzbt zzbtVar = zzbt.zza;
        this.zzt = new zzof(zzbtVar, false, 0L, 0L, null);
        this.zzu = zzbtVar;
        this.zzL = -1;
        this.zzE = new zzmz[0];
        this.zzF = new ByteBuffer[0];
        this.zzh = new ArrayDeque();
        this.zzj = new zzog(100L);
        this.zzk = new zzog(100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzE() {
        zzoc zzocVar = this.zzp;
        return zzocVar.zzc == 0 ? this.zzv / zzocVar.zzb : this.zzw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzF() {
        zzoc zzocVar = this.zzp;
        return zzocVar.zzc == 0 ? this.zzx / zzocVar.zzd : this.zzy;
    }

    private final AudioTrack zzG(zzoc zzocVar) {
        try {
            return zzocVar.zzb(false, this.zzr, this.zzQ);
        } catch (zznn e2) {
            zzno zznoVar = this.zzn;
            if (zznoVar != null) {
                zznoVar.zza(e2);
            }
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair zzH(com.google.android.gms.internal.ads.zzad r12, com.google.android.gms.internal.ads.zzmw r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzon.zzH(com.google.android.gms.internal.ads.zzad, com.google.android.gms.internal.ads.zzmw):android.util.Pair");
    }

    private final zzof zzI() {
        zzof zzofVar = this.zzs;
        return zzofVar != null ? zzofVar : !this.zzh.isEmpty() ? (zzof) this.zzh.getLast() : this.zzt;
    }

    private final void zzJ(long j2) {
        zzbt zzbtVar;
        boolean z;
        if (zzU()) {
            zzod zzodVar = this.zzV;
            zzbtVar = zzI().zza;
            zzodVar.zzc(zzbtVar);
        } else {
            zzbtVar = zzbt.zza;
        }
        zzbt zzbtVar2 = zzbtVar;
        if (zzU()) {
            zzod zzodVar2 = this.zzV;
            boolean z2 = zzI().zzb;
            zzodVar2.zzd(z2);
            z = z2;
        } else {
            z = false;
        }
        this.zzh.add(new zzof(zzbtVar2, z, Math.max(0L, j2), this.zzp.zza(zzF()), null));
        zzmz[] zzmzVarArr = this.zzp.zzi;
        ArrayList arrayList = new ArrayList();
        for (zzmz zzmzVar : zzmzVarArr) {
            if (zzmzVar.zzg()) {
                arrayList.add(zzmzVar);
            } else {
                zzmzVar.zzc();
            }
        }
        int size = arrayList.size();
        this.zzE = (zzmz[]) arrayList.toArray(new zzmz[size]);
        this.zzF = new ByteBuffer[size];
        zzK();
        zzno zznoVar = this.zzn;
        if (zznoVar != null) {
            zzot.zzU(((zzos) zznoVar).zza).zzs(z);
        }
    }

    private final void zzK() {
        int i2 = 0;
        while (true) {
            zzmz[] zzmzVarArr = this.zzE;
            if (i2 >= zzmzVarArr.length) {
                return;
            }
            zzmz zzmzVar = zzmzVarArr[i2];
            zzmzVar.zzc();
            this.zzF[i2] = zzmzVar.zzb();
            i2++;
        }
    }

    private final void zzL() {
        if (this.zzp.zzc()) {
            this.zzT = true;
        }
    }

    private final void zzM() {
        if (this.zzN) {
            return;
        }
        this.zzN = true;
        this.zzg.zzd(zzF());
        this.zzq.stop();
    }

    private final void zzN(long j2) {
        ByteBuffer byteBuffer;
        int length = this.zzE.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.zzF[i2 - 1];
            } else {
                byteBuffer = this.zzG;
                if (byteBuffer == null) {
                    byteBuffer = zzmz.zza;
                }
            }
            if (i2 == length) {
                zzQ(byteBuffer, j2);
            } else {
                zzmz zzmzVar = this.zzE[i2];
                if (i2 > this.zzL) {
                    zzmzVar.zze(byteBuffer);
                }
                ByteBuffer zzb = zzmzVar.zzb();
                this.zzF[i2] = zzb;
                if (zzb.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i2--;
        }
    }

    private final void zzO(zzbt zzbtVar, boolean z) {
        zzof zzI = zzI();
        if (zzbtVar.equals(zzI.zza) && z == zzI.zzb) {
            return;
        }
        zzof zzofVar = new zzof(zzbtVar, z, -9223372036854775807L, -9223372036854775807L, null);
        if (zzS()) {
            this.zzs = zzofVar;
        } else {
            this.zzt = zzofVar;
        }
    }

    private final void zzP() {
        if (zzS()) {
            if (zzeg.zza >= 21) {
                this.zzq.setVolume(this.zzD);
                return;
            }
            AudioTrack audioTrack = this.zzq;
            float f2 = this.zzD;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    private final void zzQ(ByteBuffer byteBuffer, long j2) {
        int write;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzI;
            if (byteBuffer2 != null) {
                zzcw.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzI = byteBuffer;
                if (zzeg.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzJ;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzJ = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzJ, 0, remaining);
                    byteBuffer.position(position);
                    this.zzK = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i2 = zzeg.zza;
            if (i2 < 21) {
                int zza = this.zzg.zza(this.zzx);
                if (zza > 0) {
                    write = this.zzq.write(this.zzJ, this.zzK, Math.min(remaining2, zza));
                    if (write > 0) {
                        this.zzK += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.zzq.write(byteBuffer, remaining2, 1);
            }
            this.zzS = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((i2 < 24 || write != -6) && write != -32) {
                    r0 = false;
                }
                if (r0) {
                    zzL();
                }
                zznq zznqVar = new zznq(write, this.zzp.zza, r0);
                zzno zznoVar = this.zzn;
                if (zznoVar != null) {
                    zznoVar.zza(zznqVar);
                }
                if (!zznqVar.zzb) {
                    this.zzk.zzb(zznqVar);
                    return;
                }
                throw zznqVar;
            }
            this.zzk.zza();
            if (zzT(this.zzq)) {
                long j3 = this.zzy;
                if (j3 > 0) {
                    this.zzU = false;
                }
                if (this.zzO && this.zzn != null && write < remaining2 && !this.zzU) {
                    long zzc = this.zzg.zzc(j3);
                    zzot zzotVar = ((zzos) this.zzn).zza;
                    if (zzot.zzT(zzotVar) != null) {
                        zzot.zzT(zzotVar).zza(zzc);
                    }
                }
            }
            int i3 = this.zzp.zzc;
            if (i3 == 0) {
                this.zzx += write;
            }
            if (write == remaining2) {
                if (i3 != 0) {
                    zzcw.zzf(byteBuffer == this.zzG);
                    this.zzy += this.zzz * this.zzH;
                }
                this.zzI = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzR() {
        /*
            r9 = this;
            int r0 = r9.zzL
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.zzL = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.zzL
            com.google.android.gms.internal.ads.zzmz[] r5 = r9.zzE
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.zzd()
        L1f:
            r9.zzN(r7)
            boolean r0 = r4.zzh()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.zzL
            int r0 = r0 + r2
            r9.zzL = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.zzI
            if (r0 == 0) goto L3b
            r9.zzQ(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzI
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.zzL = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzon.zzR():boolean");
    }

    private final boolean zzS() {
        return this.zzq != null;
    }

    private static boolean zzT(AudioTrack audioTrack) {
        return zzeg.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzU() {
        if ("audio/raw".equals(this.zzp.zza.zzm)) {
            int i2 = this.zzp.zza.zzB;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final int zza(zzad zzadVar) {
        if (!"audio/raw".equals(zzadVar.zzm)) {
            if (!this.zzT) {
                int i2 = zzeg.zza;
            }
            return zzH(zzadVar, this.zza) != null ? 2 : 0;
        } else if (zzeg.zzU(zzadVar.zzB)) {
            return zzadVar.zzB != 2 ? 1 : 2;
        } else {
            a.O("Invalid PCM encoding: ", zzadVar.zzB, "DefaultAudioSink");
            return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final long zzb(boolean z) {
        long zzs;
        if (!zzS() || this.zzB) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzg.zzb(z), this.zzp.zza(zzF()));
        while (!this.zzh.isEmpty() && min >= ((zzof) this.zzh.getFirst()).zzd) {
            this.zzt = (zzof) this.zzh.remove();
        }
        zzof zzofVar = this.zzt;
        long j2 = min - zzofVar.zzd;
        if (zzofVar.zza.equals(zzbt.zza)) {
            zzs = this.zzt.zzc + j2;
        } else if (this.zzh.isEmpty()) {
            zzs = this.zzV.zza(j2) + this.zzt.zzc;
        } else {
            zzof zzofVar2 = (zzof) this.zzh.getFirst();
            zzs = zzofVar2.zzc - zzeg.zzs(zzofVar2.zzd - min, this.zzt.zza.zzc);
        }
        return this.zzp.zza(this.zzV.zzb()) + zzs;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final zzbt zzc() {
        return zzI().zza;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzd(zzad zzadVar, int i2, int[] iArr) {
        int i3;
        zzmz[] zzmzVarArr;
        int intValue;
        int i4;
        int intValue2;
        int i5;
        int i6;
        int zzf;
        int[] iArr2;
        if ("audio/raw".equals(zzadVar.zzm)) {
            zzcw.zzd(zzeg.zzU(zzadVar.zzB));
            i4 = zzeg.zzo(zzadVar.zzB, zzadVar.zzz);
            zzmz[] zzmzVarArr2 = this.zzd;
            this.zzc.zzq(zzadVar.zzC, zzadVar.zzD);
            if (zzeg.zza < 21 && zzadVar.zzz == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i7 = 0; i7 < 6; i7++) {
                    iArr2[i7] = i7;
                }
            } else {
                iArr2 = iArr;
            }
            this.zzb.zzo(iArr2);
            zzmx zzmxVar = new zzmx(zzadVar.zzA, zzadVar.zzz, zzadVar.zzB);
            for (zzmz zzmzVar : zzmzVarArr2) {
                try {
                    zzmx zza = zzmzVar.zza(zzmxVar);
                    if (true == zzmzVar.zzg()) {
                        zzmxVar = zza;
                    }
                } catch (zzmy e2) {
                    throw new zznm(e2, zzadVar);
                }
            }
            int i8 = zzmxVar.zzd;
            int i9 = zzmxVar.zzb;
            int i10 = zzmxVar.zzc;
            int zzj = zzeg.zzj(i10);
            zzmzVarArr = zzmzVarArr2;
            i6 = zzeg.zzo(i8, i10);
            i5 = i9;
            i3 = 0;
            intValue = i8;
            intValue2 = zzj;
        } else {
            zzmz[] zzmzVarArr3 = new zzmz[0];
            int i11 = zzadVar.zzA;
            int i12 = zzeg.zza;
            Pair zzH = zzH(zzadVar, this.zza);
            if (zzH != null) {
                i3 = 2;
                zzmzVarArr = zzmzVarArr3;
                intValue = ((Integer) zzH.first).intValue();
                i4 = -1;
                intValue2 = ((Integer) zzH.second).intValue();
                i5 = i11;
                i6 = -1;
            } else {
                throw new zznm("Unable to configure passthrough for: ".concat(String.valueOf(zzadVar)), zzadVar);
            }
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i5, intValue2, intValue);
        zzcw.zzf(minBufferSize != -2);
        int i13 = 250000;
        if (i3 == 0) {
            zzf = zzeg.zzf(minBufferSize * 4, zzop.zza(250000, i5, i6), zzop.zza(750000, i5, i6));
        } else if (i3 != 1) {
            int i14 = 5;
            if (intValue == 5) {
                i13 = 500000;
                intValue = 5;
            } else {
                i14 = intValue;
            }
            zzf = zzftm.zza((i13 * zzop.zzb(intValue)) / 1000000);
            i6 = i6;
            intValue = i14;
        } else {
            zzf = zzftm.zza((zzop.zzb(intValue) * 50000000) / 1000000);
        }
        int max = (((Math.max(minBufferSize, zzf) + i6) - 1) / i6) * i6;
        if (intValue == 0) {
            throw new zznm("Invalid output encoding (mode=" + i3 + ") for: " + String.valueOf(zzadVar), zzadVar);
        } else if (intValue2 != 0) {
            this.zzT = false;
            zzoc zzocVar = new zzoc(zzadVar, i4, i3, i6, i5, intValue2, intValue, max, zzmzVarArr);
            if (zzS()) {
                this.zzo = zzocVar;
            } else {
                this.zzp = zzocVar;
            }
        } else {
            throw new zznm("Invalid output channel config (mode=" + i3 + ") for: " + String.valueOf(zzadVar), zzadVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zze() {
        if (zzS()) {
            this.zzv = 0L;
            this.zzw = 0L;
            this.zzx = 0L;
            this.zzy = 0L;
            this.zzU = false;
            this.zzz = 0;
            this.zzt = new zzof(zzI().zza, zzI().zzb, 0L, 0L, null);
            this.zzC = 0L;
            this.zzs = null;
            this.zzh.clear();
            this.zzG = null;
            this.zzH = 0;
            this.zzI = null;
            this.zzN = false;
            this.zzM = false;
            this.zzL = -1;
            this.zzc.zzp();
            zzK();
            if (this.zzg.zzi()) {
                this.zzq.pause();
            }
            if (zzT(this.zzq)) {
                zzol zzolVar = this.zzi;
                Objects.requireNonNull(zzolVar);
                zzolVar.zzb(this.zzq);
            }
            AudioTrack audioTrack = this.zzq;
            this.zzq = null;
            if (zzeg.zza < 21 && !this.zzP) {
                this.zzQ = 0;
            }
            zzoc zzocVar = this.zzo;
            if (zzocVar != null) {
                this.zzp = zzocVar;
                this.zzo = null;
            }
            this.zzg.zze();
            this.zzf.close();
            new zzny(this, "ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.zzk.zza();
        this.zzj.zza();
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzf() {
        this.zzA = true;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzg() {
        this.zzO = false;
        if (zzS() && this.zzg.zzl()) {
            this.zzq.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzh() {
        this.zzO = true;
        if (zzS()) {
            this.zzg.zzg();
            this.zzq.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzi() {
        if (!this.zzM && zzS() && zzR()) {
            zzM();
            this.zzM = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzj() {
        zze();
        for (zzmz zzmzVar : this.zzd) {
            zzmzVar.zzf();
        }
        zzmz[] zzmzVarArr = this.zze;
        int length = zzmzVarArr.length;
        for (int i2 = 0; i2 <= 0; i2++) {
            zzmzVarArr[i2].zzf();
        }
        this.zzO = false;
        this.zzT = false;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzk(zzi zziVar) {
        if (this.zzr.equals(zziVar)) {
            return;
        }
        this.zzr = zziVar;
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzl(int i2) {
        if (this.zzQ != i2) {
            this.zzQ = i2;
            this.zzP = i2 != 0;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzm(zzj zzjVar) {
        if (this.zzR.equals(zzjVar)) {
            return;
        }
        int i2 = zzjVar.zza;
        if (this.zzq != null) {
            int i3 = this.zzR.zza;
        }
        this.zzR = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzn(zzno zznoVar) {
        this.zzn = zznoVar;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzo(zzbt zzbtVar) {
        zzO(new zzbt(zzeg.zza(zzbtVar.zzc, 0.1f, 8.0f), zzeg.zza(zzbtVar.zzd, 0.1f, 8.0f)), zzI().zzb);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzp(zzmv zzmvVar) {
        this.zzm = zzmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzq(boolean z) {
        zzO(zzI().zza, z);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzr(float f2) {
        if (this.zzD != f2) {
            this.zzD = f2;
            zzP();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final boolean zzs(ByteBuffer byteBuffer, long j2, int i2) {
        AudioTrack zzG;
        zzmv zzmvVar;
        boolean z;
        int zza;
        int i3;
        int i4;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        ByteBuffer byteBuffer2 = this.zzG;
        boolean z2 = false;
        zzcw.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzo != null) {
            if (!zzR()) {
                return false;
            }
            zzoc zzocVar = this.zzo;
            zzoc zzocVar2 = this.zzp;
            if (zzocVar2.zzc == zzocVar.zzc && zzocVar2.zzg == zzocVar.zzg && zzocVar2.zze == zzocVar.zze && zzocVar2.zzf == zzocVar.zzf && zzocVar2.zzd == zzocVar.zzd) {
                this.zzp = zzocVar;
                this.zzo = null;
                if (zzT(this.zzq)) {
                    this.zzq.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.zzq;
                    zzad zzadVar = this.zzp.zza;
                    audioTrack.setOffloadDelayPadding(zzadVar.zzC, zzadVar.zzD);
                    this.zzU = true;
                }
            } else {
                zzM();
                if (zzt()) {
                    return false;
                }
                zze();
            }
            zzJ(j2);
        }
        if (!zzS()) {
            try {
                this.zzf.block();
                try {
                    zzoc zzocVar3 = this.zzp;
                    Objects.requireNonNull(zzocVar3);
                    zzG = zzG(zzocVar3);
                } catch (zznn e2) {
                    zzoc zzocVar4 = this.zzp;
                    if (zzocVar4.zzh > 1000000) {
                        zzoc zzocVar5 = new zzoc(zzocVar4.zza, zzocVar4.zzb, zzocVar4.zzc, zzocVar4.zzd, zzocVar4.zze, zzocVar4.zzf, zzocVar4.zzg, 1000000, zzocVar4.zzi);
                        try {
                            zzG = zzG(zzocVar5);
                            this.zzp = zzocVar5;
                        } catch (zznn e3) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e2, e3);
                            } catch (Exception unused) {
                            }
                            zzL();
                            throw e2;
                        }
                    }
                    zzL();
                    throw e2;
                }
                this.zzq = zzG;
                if (zzT(zzG)) {
                    AudioTrack audioTrack2 = this.zzq;
                    if (this.zzi == null) {
                        this.zzi = new zzol(this);
                    }
                    this.zzi.zza(audioTrack2);
                    AudioTrack audioTrack3 = this.zzq;
                    zzad zzadVar2 = this.zzp.zza;
                    audioTrack3.setOffloadDelayPadding(zzadVar2.zzC, zzadVar2.zzD);
                }
                if (zzeg.zza >= 31 && (zzmvVar = this.zzm) != null) {
                    zznz.zza(this.zzq, zzmvVar);
                }
                this.zzQ = this.zzq.getAudioSessionId();
                zznv zznvVar = this.zzg;
                AudioTrack audioTrack4 = this.zzq;
                zzoc zzocVar6 = this.zzp;
                zznvVar.zzf(audioTrack4, zzocVar6.zzc == 2, zzocVar6.zzg, zzocVar6.zzd, zzocVar6.zzh);
                zzP();
                int i9 = this.zzR.zza;
                this.zzB = true;
                z2 = false;
            } catch (zznn e4) {
                if (!e4.zzb) {
                    this.zzj.zzb(e4);
                    return false;
                }
                throw e4;
            }
        }
        this.zzj.zza();
        if (this.zzB) {
            this.zzC = Math.max(0L, j2);
            this.zzA = z2;
            this.zzB = z2;
            zzJ(j2);
            if (this.zzO) {
                zzh();
            }
        }
        if (this.zzg.zzk(zzF())) {
            if (this.zzG == null) {
                zzcw.zzd(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                zzoc zzocVar7 = this.zzp;
                if (zzocVar7.zzc != 0 && this.zzz == 0) {
                    int i10 = zzocVar7.zzg;
                    switch (i10) {
                        case 5:
                        case 6:
                        case 18:
                            z = true;
                            zza = zzxx.zza(byteBuffer);
                            break;
                        case 7:
                        case 8:
                            int position = byteBuffer.position();
                            byte b2 = byteBuffer.get(position);
                            if (b2 != -2) {
                                if (b2 == -1) {
                                    i5 = (byteBuffer.get(position + 4) & 7) << 4;
                                    b = byteBuffer.get(position + 7);
                                } else if (b2 != 31) {
                                    i3 = (byteBuffer.get(position + 4) & 1) << 6;
                                    i7 = byteBuffer.get(position + 5) & 252;
                                    i6 = 2;
                                    i4 = i7 >> i6;
                                } else {
                                    i5 = (byteBuffer.get(position + 5) & 7) << 4;
                                    b = byteBuffer.get(position + 6);
                                }
                                i3 = i5;
                                i6 = 2;
                                i7 = b & 60;
                                i4 = i7 >> i6;
                            } else {
                                i3 = (byteBuffer.get(position + 5) & 1) << 6;
                                i4 = (byteBuffer.get(position + 4) & 252) >> 2;
                            }
                            int i11 = i4 | i3;
                            z = true;
                            zza = (i11 + 1) * 32;
                            break;
                        case 9:
                            zza = zzzm.zzc(zzeg.zzk(byteBuffer, byteBuffer.position()));
                            if (zza == -1) {
                                throw new IllegalArgumentException();
                            }
                            z = true;
                            break;
                        case 10:
                        case 16:
                            zza = 1024;
                            z = true;
                            break;
                        case 11:
                        case 12:
                            zza = RecyclerView.a0.FLAG_MOVED;
                            z = true;
                            break;
                        case 13:
                        default:
                            throw new IllegalStateException(a.i("Unexpected audio encoding: ", i10));
                        case 14:
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i12 = position2;
                            while (true) {
                                if (i12 > limit) {
                                    i8 = -1;
                                } else if ((zzeg.zzk(byteBuffer, i12 + 4) & (-2)) == -126718022) {
                                    i8 = i12 - position2;
                                } else {
                                    i12++;
                                }
                            }
                            if (i8 == -1) {
                                zza = 0;
                            } else {
                                zza = (40 << ((byteBuffer.get((byteBuffer.position() + i8) + ((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            }
                            z = true;
                            break;
                        case 15:
                            zza = 512;
                            z = true;
                            break;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            zza = zzya.zza(new zzdx(bArr, 16)).zzc;
                            z = true;
                            break;
                    }
                    this.zzz = zza;
                    if (zza == 0) {
                        return z;
                    }
                }
                if (this.zzs != null) {
                    if (!zzR()) {
                        return false;
                    }
                    zzJ(j2);
                    this.zzs = null;
                }
                long zzE = (((zzE() - this.zzc.zzo()) * 1000000) / this.zzp.zza.zzA) + this.zzC;
                if (!this.zzA && Math.abs(zzE - j2) > 200000) {
                    this.zzn.zza(new zznp(j2, zzE));
                    this.zzA = true;
                }
                if (this.zzA) {
                    if (!zzR()) {
                        return false;
                    }
                    long j3 = j2 - zzE;
                    this.zzC += j3;
                    this.zzA = false;
                    zzJ(j2);
                    zzno zznoVar = this.zzn;
                    if (zznoVar != null && j3 != 0) {
                        ((zzos) zznoVar).zza.zzab();
                    }
                }
                if (this.zzp.zzc == 0) {
                    this.zzv += byteBuffer.remaining();
                } else {
                    this.zzw += this.zzz * i2;
                }
                this.zzG = byteBuffer;
                this.zzH = i2;
            }
            zzN(j2);
            if (!this.zzG.hasRemaining()) {
                this.zzG = null;
                this.zzH = 0;
                return true;
            } else if (this.zzg.zzj(zzF())) {
                Log.w("DefaultAudioSink", "Resetting stalled audio track");
                zze();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final boolean zzt() {
        return zzS() && this.zzg.zzh(zzF());
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final boolean zzu() {
        return !zzS() || (this.zzM && !zzt());
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final boolean zzv(zzad zzadVar) {
        return zza(zzadVar) != 0;
    }
}
