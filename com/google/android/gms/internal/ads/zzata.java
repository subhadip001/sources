package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import f.a.b.a.a;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzata {
    private Method zzA;
    private int zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private int zzI;
    private long zzJ;
    private long zzK;
    private long zzL;
    private float zzM;
    private zzash[] zzN;
    private ByteBuffer[] zzO;
    private ByteBuffer zzP;
    private ByteBuffer zzQ;
    private byte[] zzR;
    private int zzS;
    private int zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private final zzatb zza;
    private final zzath zzb;
    private final zzash[] zzc;
    private final zzasw zzd;
    private final ConditionVariable zze = new ConditionVariable(true);
    private final long[] zzf;
    private final zzass zzg;
    private final LinkedList zzh;
    private AudioTrack zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private int zzo;
    private long zzp;
    private zzarw zzq;
    private zzarw zzr;
    private long zzs;
    private long zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private long zzx;
    private boolean zzy;
    private long zzz;

    public zzata(zzasf zzasfVar, zzash[] zzashVarArr, zzasw zzaswVar) {
        this.zzd = zzaswVar;
        if (zzazn.zza >= 18) {
            try {
                this.zzA = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzazn.zza >= 19) {
            this.zzg = new zzast();
        } else {
            this.zzg = new zzass(null);
        }
        zzatb zzatbVar = new zzatb();
        this.zza = zzatbVar;
        zzath zzathVar = new zzath();
        this.zzb = zzathVar;
        this.zzc = r1;
        System.arraycopy(zzashVarArr, 0, r1, 2, 0);
        zzash[] zzashVarArr2 = {new zzatf(), zzatbVar, zzathVar};
        this.zzf = new long[10];
        this.zzM = 1.0f;
        this.zzI = 0;
        this.zzW = 0;
        this.zzr = zzarw.zza;
        this.zzT = -1;
        this.zzN = new zzash[0];
        this.zzO = new ByteBuffer[0];
        this.zzh = new LinkedList();
    }

    private final long zzp(long j2) {
        return (j2 * this.zzj) / 1000000;
    }

    private final long zzq(long j2) {
        return (j2 * 1000000) / this.zzj;
    }

    private final long zzr() {
        return this.zzn ? this.zzG : this.zzF / this.zzE;
    }

    private final void zzs(long j2) {
        ByteBuffer byteBuffer;
        int length = this.zzN.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.zzO[i2 - 1];
            } else {
                byteBuffer = this.zzP;
                if (byteBuffer == null) {
                    byteBuffer = zzash.zza;
                }
            }
            if (i2 == length) {
                zzz(byteBuffer, j2);
            } else {
                zzash zzashVar = this.zzN[i2];
                zzashVar.zzf(byteBuffer);
                ByteBuffer zzc = zzashVar.zzc();
                this.zzO[i2] = zzc;
                if (zzc.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i2--;
        }
    }

    private final void zzt() {
        ArrayList arrayList = new ArrayList();
        zzash[] zzashVarArr = this.zzc;
        for (int i2 = 0; i2 < 3; i2++) {
            zzash zzashVar = zzashVarArr[i2];
            if (zzashVar.zzi()) {
                arrayList.add(zzashVar);
            } else {
                zzashVar.zzd();
            }
        }
        int size = arrayList.size();
        this.zzN = (zzash[]) arrayList.toArray(new zzash[size]);
        this.zzO = new ByteBuffer[size];
        for (int i3 = 0; i3 < size; i3++) {
            zzash zzashVar2 = this.zzN[i3];
            zzashVar2.zzd();
            this.zzO[i3] = zzashVar2.zzc();
        }
    }

    private final void zzu() {
        this.zzw = 0L;
        this.zzv = 0;
        this.zzu = 0;
        this.zzx = 0L;
        this.zzy = false;
        this.zzz = 0L;
    }

    private final void zzv() {
        if (zzx()) {
            if (zzazn.zza >= 21) {
                this.zzi.setVolume(this.zzM);
                return;
            }
            AudioTrack audioTrack = this.zzi;
            float f2 = this.zzM;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzw() {
        /*
            r9 = this;
            int r0 = r9.zzT
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.zzn
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzash[] r0 = r9.zzN
            int r0 = r0.length
            goto L10
        Lf:
            r0 = 0
        L10:
            r9.zzT = r0
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.zzT
            com.google.android.gms.internal.ads.zzash[] r5 = r9.zzN
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.zze()
        L28:
            r9.zzs(r7)
            boolean r0 = r4.zzj()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.zzT
            int r0 = r0 + r2
            r9.zzT = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.zzQ
            if (r0 == 0) goto L44
            r9.zzz(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzQ
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.zzT = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzata.zzw():boolean");
    }

    private final boolean zzx() {
        return this.zzi != null;
    }

    private final boolean zzy() {
        int i2;
        return zzazn.zza < 23 && ((i2 = this.zzm) == 5 || i2 == 6);
    }

    private final boolean zzz(ByteBuffer byteBuffer, long j2) {
        int write;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzQ;
            if (byteBuffer2 != null) {
                zzayy.zzc(byteBuffer2 == byteBuffer);
            } else {
                this.zzQ = byteBuffer;
                if (zzazn.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzR;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzR = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzR, 0, remaining);
                    byteBuffer.position(position);
                    this.zzS = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (zzazn.zza < 21) {
                int zza = this.zzo - ((int) (this.zzF - (this.zzg.zza() * this.zzE)));
                if (zza > 0) {
                    write = this.zzi.write(this.zzR, this.zzS, Math.min(remaining2, zza));
                    if (write > 0) {
                        this.zzS += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.zzi.write(byteBuffer, remaining2, 1);
            }
            this.zzY = SystemClock.elapsedRealtime();
            if (write >= 0) {
                boolean z = this.zzn;
                if (!z) {
                    this.zzF += write;
                }
                if (write == remaining2) {
                    if (z) {
                        this.zzG += this.zzH;
                    }
                    this.zzQ = null;
                    return true;
                }
                return false;
            }
            throw new zzasz(write);
        }
        return true;
    }

    public final long zza(boolean z) {
        long zzb;
        long j2;
        long j3;
        zzarw zzarwVar;
        long j4;
        long j5;
        if (!zzx() || this.zzI == 0) {
            return Long.MIN_VALUE;
        }
        if (this.zzi.getPlayState() == 3) {
            long zzb2 = this.zzg.zzb();
            if (zzb2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.zzx >= 30000) {
                    long[] jArr = this.zzf;
                    int i2 = this.zzu;
                    jArr[i2] = zzb2 - nanoTime;
                    this.zzu = (i2 + 1) % 10;
                    int i3 = this.zzv;
                    if (i3 < 10) {
                        this.zzv = i3 + 1;
                    }
                    this.zzx = nanoTime;
                    this.zzw = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.zzv;
                        if (i4 >= i5) {
                            break;
                        }
                        this.zzw = (this.zzf[i4] / i5) + this.zzw;
                        i4++;
                    }
                }
                if (!zzy() && nanoTime - this.zzz >= 500000) {
                    boolean zzh = this.zzg.zzh();
                    this.zzy = zzh;
                    if (zzh) {
                        long zzd = this.zzg.zzd() / 1000;
                        long zzc = this.zzg.zzc();
                        if (zzd < this.zzK) {
                            this.zzy = false;
                        } else if (Math.abs(zzd - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(zzc);
                            sb.append(", ");
                            sb.append(zzd);
                            a.Q(sb, ", ", nanoTime, ", ");
                            sb.append(zzb2);
                            Log.w("AudioTrack", sb.toString());
                            this.zzy = false;
                        } else if (Math.abs(zzq(zzc) - zzb2) > 5000000) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(zzc);
                            sb2.append(", ");
                            sb2.append(zzd);
                            a.Q(sb2, ", ", nanoTime, ", ");
                            sb2.append(zzb2);
                            Log.w("AudioTrack", sb2.toString());
                            this.zzy = false;
                        }
                    }
                    Method method = this.zzA;
                    if (method != null && !this.zzn) {
                        try {
                            long intValue = (((Integer) method.invoke(this.zzi, null)).intValue() * 1000) - this.zzp;
                            this.zzL = intValue;
                            long max = Math.max(intValue, 0L);
                            this.zzL = max;
                            if (max > 5000000) {
                                Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + max);
                                this.zzL = 0L;
                            }
                        } catch (Exception unused) {
                            this.zzA = null;
                        }
                    }
                    this.zzz = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.zzy) {
            zzb = zzq(this.zzg.zzc() + zzp(nanoTime2 - (this.zzg.zzd() / 1000)));
        } else {
            zzb = this.zzv == 0 ? this.zzg.zzb() : nanoTime2 + this.zzw;
            if (!z) {
                zzb -= this.zzL;
            }
        }
        long j6 = this.zzJ;
        while (!this.zzh.isEmpty()) {
            j3 = ((zzasy) this.zzh.getFirst()).zzc;
            if (zzb < j3) {
                break;
            }
            zzasy zzasyVar = (zzasy) this.zzh.remove();
            zzarwVar = zzasyVar.zza;
            this.zzr = zzarwVar;
            j4 = zzasyVar.zzc;
            this.zzt = j4;
            j5 = zzasyVar.zzb;
            this.zzs = j5 - this.zzJ;
        }
        if (this.zzr.zzb == 1.0f) {
            j2 = (zzb + this.zzs) - this.zzt;
        } else {
            if (this.zzh.isEmpty()) {
                zzath zzathVar = this.zzb;
                if (zzathVar.zzn() >= 1024) {
                    j2 = zzazn.zzj(zzb - this.zzt, zzathVar.zzm(), zzathVar.zzn()) + this.zzs;
                }
            }
            j2 = ((long) (this.zzr.zzb * (zzb - this.zzt))) + this.zzs;
        }
        return j6 + j2;
    }

    public final zzarw zzc() {
        return this.zzr;
    }

    public final zzarw zzd(zzarw zzarwVar) {
        if (this.zzn) {
            zzarw zzarwVar2 = zzarw.zza;
            this.zzr = zzarwVar2;
            return zzarwVar2;
        }
        float zzl = this.zzb.zzl(zzarwVar.zzb);
        this.zzb.zzk(1.0f);
        zzarw zzarwVar3 = new zzarw(zzl, 1.0f);
        zzarw zzarwVar4 = this.zzq;
        if (zzarwVar4 == null) {
            if (!this.zzh.isEmpty()) {
                zzarwVar4 = ((zzasy) this.zzh.getLast()).zza;
            } else {
                zzarwVar4 = this.zzr;
            }
        }
        if (!zzarwVar3.equals(zzarwVar4)) {
            if (zzx()) {
                this.zzq = zzarwVar3;
            } else {
                this.zzr = zzarwVar3;
            }
        }
        return this.zzr;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(java.lang.String r7, int r8, int r9, int r10, int r11, int[] r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzata.zze(java.lang.String, int, int, int, int, int[]):void");
    }

    public final void zzf() {
        if (this.zzI == 1) {
            this.zzI = 2;
        }
    }

    public final void zzg() {
        this.zzV = false;
        if (zzx()) {
            zzu();
            this.zzg.zzf();
        }
    }

    public final void zzh() {
        this.zzV = true;
        if (zzx()) {
            this.zzK = System.nanoTime() / 1000;
            this.zzi.play();
        }
    }

    public final void zzi() {
        if (!this.zzU && zzx() && zzw()) {
            this.zzg.zze(zzr());
            this.zzU = true;
        }
    }

    public final void zzj() {
        zzk();
        zzash[] zzashVarArr = this.zzc;
        for (int i2 = 0; i2 < 3; i2++) {
            zzashVarArr[i2].zzg();
        }
        this.zzW = 0;
        this.zzV = false;
    }

    public final void zzk() {
        zzarw zzarwVar;
        if (zzx()) {
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzH = 0;
            zzarw zzarwVar2 = this.zzq;
            if (zzarwVar2 != null) {
                this.zzr = zzarwVar2;
                this.zzq = null;
            } else if (!this.zzh.isEmpty()) {
                zzarwVar = ((zzasy) this.zzh.getLast()).zza;
                this.zzr = zzarwVar;
            }
            this.zzh.clear();
            this.zzs = 0L;
            this.zzt = 0L;
            this.zzP = null;
            this.zzQ = null;
            int i2 = 0;
            while (true) {
                zzash[] zzashVarArr = this.zzN;
                if (i2 >= zzashVarArr.length) {
                    break;
                }
                zzash zzashVar = zzashVarArr[i2];
                zzashVar.zzd();
                this.zzO[i2] = zzashVar.zzc();
                i2++;
            }
            this.zzU = false;
            this.zzT = -1;
            this.zzI = 0;
            this.zzL = 0L;
            zzu();
            if (this.zzi.getPlayState() == 3) {
                this.zzi.pause();
            }
            AudioTrack audioTrack = this.zzi;
            this.zzi = null;
            this.zzg.zzg(null, false);
            this.zze.close();
            new zzasq(this, audioTrack).start();
        }
    }

    public final void zzl(float f2) {
        if (this.zzM != f2) {
            this.zzM = f2;
            zzv();
        }
    }

    public final boolean zzm(ByteBuffer byteBuffer, long j2) {
        int i2;
        zzaso zzasoVar;
        zzaso zzasoVar2;
        ByteBuffer byteBuffer2 = this.zzP;
        zzayy.zzc(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!zzx()) {
            this.zze.block();
            int i3 = this.zzW;
            if (i3 == 0) {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1);
            } else {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1, i3);
            }
            int state = this.zzi.getState();
            if (state == 1) {
                int audioSessionId = this.zzi.getAudioSessionId();
                if (this.zzW != audioSessionId) {
                    this.zzW = audioSessionId;
                    zzasoVar2 = ((zzatd) this.zzd).zza.zzb;
                    zzasoVar2.zzb(audioSessionId);
                }
                this.zzg.zzg(this.zzi, zzy());
                zzv();
                this.zzX = false;
                if (this.zzV) {
                    zzh();
                }
            } else {
                try {
                    this.zzi.release();
                } catch (Exception unused) {
                } finally {
                    this.zzi = null;
                }
                throw new zzasv(state, this.zzj, this.zzk, this.zzo);
            }
        }
        if (zzy()) {
            if (this.zzi.getPlayState() == 2) {
                this.zzX = false;
                return false;
            } else if (this.zzi.getPlayState() == 1 && this.zzg.zza() != 0) {
                return false;
            }
        }
        boolean z = this.zzX;
        boolean zzn = zzn();
        this.zzX = zzn;
        if (z && !zzn && this.zzi.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = this.zzY;
            zzasw zzaswVar = this.zzd;
            int i4 = this.zzo;
            long zzb = zzard.zzb(this.zzp);
            zzasoVar = ((zzatd) zzaswVar).zza.zzb;
            zzasoVar.zzc(i4, zzb, elapsedRealtime - j3);
        }
        if (this.zzP == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.zzn && this.zzH == 0) {
                int i5 = this.zzm;
                if (i5 == 7 || i5 == 8) {
                    int position = byteBuffer.position();
                    i2 = ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i5 == 5) {
                    i2 = 1536;
                } else if (i5 == 6) {
                    i2 = zzase.zza(byteBuffer);
                } else {
                    throw new IllegalStateException(a.i("Unexpected audio encoding: ", i5));
                }
                this.zzH = i2;
            }
            if (this.zzq != null) {
                if (!zzw()) {
                    return false;
                }
                this.zzh.add(new zzasy(this.zzq, Math.max(0L, j2), zzq(zzr()), null));
                this.zzq = null;
                zzt();
            }
            if (this.zzI == 0) {
                this.zzJ = Math.max(0L, j2);
                this.zzI = 1;
            } else {
                long zzq = this.zzJ + zzq(this.zzn ? this.zzD : this.zzC / this.zzB);
                if (this.zzI == 1 && Math.abs(zzq - j2) > 200000) {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + zzq + ", got " + j2 + "]");
                    this.zzI = 2;
                }
                if (this.zzI == 2) {
                    this.zzJ = (j2 - zzq) + this.zzJ;
                    this.zzI = 1;
                    ((zzatd) this.zzd).zza.zzh = true;
                }
            }
            if (this.zzn) {
                this.zzD += this.zzH;
            } else {
                this.zzC += byteBuffer.remaining();
            }
            this.zzP = byteBuffer;
        }
        if (this.zzn) {
            zzz(this.zzP, j2);
        } else {
            zzs(j2);
        }
        if (this.zzP.hasRemaining()) {
            return false;
        }
        this.zzP = null;
        return true;
    }

    public final boolean zzn() {
        if (zzx()) {
            if (zzr() > this.zzg.zza()) {
                return true;
            }
            if (zzy() && this.zzi.getPlayState() == 2 && this.zzi.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzo() {
        return !zzx() || (this.zzU && !zzn());
    }
}
