package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzqj extends zzgl {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private float zzA;
    private ArrayDeque zzB;
    private zzqi zzC;
    private zzqg zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private zzpz zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private ByteBuffer zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private boolean zzY;
    private int zzZ;
    public zzgm zza;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private long zzaf;
    private long zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private long zzak;
    private long zzal;
    private int zzam;
    private zzpk zzan;
    private zzpk zzao;
    private final zzqd zzc;
    private final zzql zzd;
    private final float zze;
    private final zzgc zzf;
    private final zzgc zzg;
    private final zzgc zzh;
    private final zzpy zzi;
    private final zzed zzj;
    private final ArrayList zzk;
    private final MediaCodec.BufferInfo zzl;
    private final long[] zzm;
    private final long[] zzn;
    private final long[] zzo;
    private zzad zzp;
    private zzad zzq;
    private MediaCrypto zzr;
    private boolean zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzqe zzw;
    private zzad zzx;
    private MediaFormat zzy;
    private boolean zzz;

    public zzqj(int i2, zzqd zzqdVar, zzql zzqlVar, boolean z, float f2) {
        super(i2);
        this.zzc = zzqdVar;
        Objects.requireNonNull(zzqlVar);
        this.zzd = zzqlVar;
        this.zze = f2;
        this.zzf = new zzgc(0, 0);
        this.zzg = new zzgc(0, 0);
        this.zzh = new zzgc(2, 0);
        zzpy zzpyVar = new zzpy();
        this.zzi = zzpyVar;
        this.zzj = new zzed(10);
        this.zzk = new ArrayList();
        this.zzl = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzm = new long[10];
        this.zzn = new long[10];
        this.zzo = new long[10];
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        zzpyVar.zzi(0);
        zzpyVar.zzb.order(ByteOrder.nativeOrder());
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzZ = 0;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzP = -9223372036854775807L;
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        this.zzaa = 0;
        this.zzab = 0;
    }

    private final void zzT() {
        this.zzX = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzW = false;
        this.zzV = false;
    }

    private final void zzU() {
        if (this.zzac) {
            this.zzaa = 1;
            this.zzab = 3;
            return;
        }
        zzap();
        zzan();
    }

    private final void zzaA() {
        try {
            throw null;
        } catch (MediaCryptoException e2) {
            throw zzbg(e2, this.zzp, false, 6006);
        }
    }

    private final boolean zzaB() {
        if (this.zzac) {
            this.zzaa = 1;
            if (this.zzG || this.zzI) {
                this.zzab = 3;
                return false;
            }
            this.zzab = 2;
        } else {
            zzaA();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean zzaC() {
        zzqe zzqeVar = this.zzw;
        boolean z = 0;
        if (zzqeVar == null || this.zzaa == 2 || this.zzah) {
            return false;
        }
        if (this.zzQ < 0) {
            int zza = zzqeVar.zza();
            this.zzQ = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzb = this.zzw.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzaa == 1) {
            if (!this.zzN) {
                this.zzad = true;
                this.zzw.zzj(this.zzQ, 0, 0, 0L, 4);
                zzay();
            }
            this.zzaa = 2;
            return false;
        } else if (this.zzL) {
            this.zzL = false;
            this.zzg.zzb.put(zzb);
            this.zzw.zzj(this.zzQ, 0, 38, 0L, 0);
            zzay();
            this.zzac = true;
            return true;
        } else {
            if (this.zzZ == 1) {
                for (int i2 = 0; i2 < this.zzx.zzo.size(); i2++) {
                    this.zzg.zzb.put((byte[]) this.zzx.zzo.get(i2));
                }
                this.zzZ = 2;
            }
            int position = this.zzg.zzb.position();
            zzja zzh = zzh();
            try {
                int zzbf = zzbf(zzh, this.zzg, 0);
                if (zzG()) {
                    this.zzag = this.zzaf;
                }
                if (zzbf == -3) {
                    return false;
                }
                if (zzbf == -5) {
                    if (this.zzZ == 2) {
                        this.zzg.zzb();
                        this.zzZ = 1;
                    }
                    zzS(zzh);
                    return true;
                }
                zzgc zzgcVar = this.zzg;
                if (zzgcVar.zzg()) {
                    if (this.zzZ == 2) {
                        zzgcVar.zzb();
                        this.zzZ = 1;
                    }
                    this.zzah = true;
                    if (!this.zzac) {
                        zzax();
                        return false;
                    }
                    try {
                        if (!this.zzN) {
                            this.zzad = true;
                            this.zzw.zzj(this.zzQ, 0, 0, 0L, 4);
                            zzay();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e2) {
                        throw zzbg(e2, this.zzp, false, zzeg.zzl(e2.getErrorCode()));
                    }
                } else if (!this.zzac && !zzgcVar.zzh()) {
                    zzgcVar.zzb();
                    if (this.zzZ == 2) {
                        this.zzZ = 1;
                    }
                    return true;
                } else {
                    boolean zzk = zzgcVar.zzk();
                    if (zzk) {
                        zzgcVar.zza.zzb(position);
                    }
                    if (this.zzF && !zzk) {
                        ByteBuffer byteBuffer = this.zzg.zzb;
                        byte[] bArr = zzzp.zza;
                        int position2 = byteBuffer.position();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int i5 = i3 + 1;
                            if (i5 < position2) {
                                int i6 = byteBuffer.get(i3) & 255;
                                if (i4 == 3) {
                                    if (i6 == 1) {
                                        if ((byteBuffer.get(i5) & 31) == 7) {
                                            ByteBuffer duplicate = byteBuffer.duplicate();
                                            duplicate.position(i3 - 3);
                                            duplicate.limit(position2);
                                            byteBuffer.position(0);
                                            byteBuffer.put(duplicate);
                                            break;
                                        }
                                        i6 = 1;
                                    }
                                } else if (i6 == 0) {
                                    i4++;
                                }
                                if (i6 != 0) {
                                    i4 = 0;
                                }
                                i3 = i5;
                            } else {
                                byteBuffer.clear();
                                break;
                            }
                        }
                        if (this.zzg.zzb.position() == 0) {
                            return true;
                        }
                        this.zzF = false;
                    }
                    zzgc zzgcVar2 = this.zzg;
                    long j2 = zzgcVar2.zzd;
                    zzpz zzpzVar = this.zzO;
                    if (zzpzVar != null) {
                        j2 = zzpzVar.zzb(this.zzp, zzgcVar2);
                        this.zzaf = Math.max(this.zzaf, this.zzO.zza(this.zzp));
                    }
                    long j3 = j2;
                    if (this.zzg.zzf()) {
                        this.zzk.add(Long.valueOf(j3));
                    }
                    if (this.zzaj) {
                        this.zzj.zzd(j3, this.zzp);
                        this.zzaj = false;
                    }
                    this.zzaf = Math.max(this.zzaf, j3);
                    this.zzg.zzj();
                    zzgc zzgcVar3 = this.zzg;
                    if (zzgcVar3.zze()) {
                        zzam(zzgcVar3);
                    }
                    zzad(this.zzg);
                    try {
                        if (zzk) {
                            this.zzw.zzk(this.zzQ, 0, this.zzg.zza, j3, 0);
                        } else {
                            this.zzw.zzj(this.zzQ, 0, this.zzg.zzb.limit(), j3, 0);
                        }
                        zzay();
                        this.zzac = true;
                        this.zzZ = 0;
                        zzgm zzgmVar = this.zza;
                        z = zzgmVar.zzc + 1;
                        zzgmVar.zzc = z;
                        return true;
                    } catch (MediaCodec.CryptoException e3) {
                        throw zzbg(e3, this.zzp, z, zzeg.zzl(e3.getErrorCode()));
                    }
                }
            } catch (zzgb e4) {
                zzX(e4);
                zzaE(0);
                zzab();
                return true;
            }
        }
    }

    private final boolean zzaD() {
        return this.zzR >= 0;
    }

    private final boolean zzaE(int i2) {
        zzja zzh = zzh();
        this.zzf.zzb();
        int zzbf = zzbf(zzh, this.zzf, i2 | 4);
        if (zzbf == -5) {
            zzS(zzh);
            return true;
        } else if (zzbf == -4 && this.zzf.zzg()) {
            this.zzah = true;
            zzax();
            return false;
        } else {
            return false;
        }
    }

    private final boolean zzaF(long j2) {
        return this.zzt == -9223372036854775807L || SystemClock.elapsedRealtime() - j2 < this.zzt;
    }

    private final boolean zzaG(zzad zzadVar) {
        if (zzeg.zza >= 23 && this.zzw != null && this.zzab != 3 && zzbe() != 0) {
            float zzP = zzP(this.zzv, zzadVar, zzJ());
            float f2 = this.zzA;
            if (f2 == zzP) {
                return true;
            }
            if (zzP == -1.0f) {
                zzU();
                return false;
            } else if (f2 == -1.0f && zzP <= this.zze) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", zzP);
                this.zzw.zzp(bundle);
                this.zzA = zzP;
            }
        }
        return true;
    }

    private final void zzab() {
        try {
            this.zzw.zzi();
        } finally {
            zzaq();
        }
    }

    public static boolean zzav(zzad zzadVar) {
        return zzadVar.zzF == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0196, code lost:
        if ("stvm8".equals(r5) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a6, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzaw(com.google.android.gms.internal.ads.zzqg r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqj.zzaw(com.google.android.gms.internal.ads.zzqg, android.media.MediaCrypto):void");
    }

    private final void zzax() {
        int i2 = this.zzab;
        if (i2 == 1) {
            zzab();
        } else if (i2 == 2) {
            zzab();
            zzaA();
        } else if (i2 != 3) {
            this.zzai = true;
            zzae();
        } else {
            zzap();
            zzan();
        }
    }

    private final void zzay() {
        this.zzQ = -1;
        this.zzg.zzb = null;
    }

    private final void zzaz() {
        this.zzR = -1;
        this.zzS = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgl, com.google.android.gms.internal.ads.zzju
    public void zzD(float f2, float f3) {
        this.zzu = f2;
        this.zzv = f3;
        zzaG(this.zzx);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:124|(5:(6:126|(1:216)(2:130|131)|(2:133|(2:135|(1:156)(1:141))(3:157|158|(1:165)(0)))(2:166|(1:168)(2:169|(12:175|(1:177)|178|(2:180|(2:184|(1:186)))|187|(1:(2:189|(2:192|193)(1:191))(2:210|211))|194|(1:196)(1:209)|197|(1:201)|(1:203)(2:205|(1:207))|204)(2:173|174)))|142|143|(2:146|147)(1:145))|(3:219|220|(6:222|223|224|225|226|(3:228|229|(2:232|233)(3:231|143|(0)(0)))(2:235|236)))|261|262|(0)(0))|217|258|259|260) */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0260, code lost:
        if (r15.zzq != null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x032d, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x030e A[LOOP:2: B:72:0x0139->B:180:0x030e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031e A[Catch: IllegalStateException -> 0x034f, TryCatch #0 {IllegalStateException -> 0x034f, blocks: (B:177:0x0307, B:182:0x0318, B:184:0x031e, B:186:0x0324, B:173:0x02ef, B:175:0x0301, B:193:0x0335), top: B:227:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x030d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    @Override // com.google.android.gms.internal.ads.zzju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzL(long r24, long r26) {
        /*
            Method dump skipped, instructions count: 929
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqj.zzL(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public boolean zzM() {
        return this.zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public boolean zzN() {
        if (this.zzp != null) {
            if (zzI() || zzaD()) {
                return true;
            }
            if (this.zzP != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzP) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final int zzO(zzad zzadVar) {
        try {
            return zzQ(this.zzd, zzadVar);
        } catch (zzqs e2) {
            throw zzbg(e2, zzadVar, false, 4002);
        }
    }

    public float zzP(float f2, zzad zzadVar, zzad[] zzadVarArr) {
        throw null;
    }

    public abstract int zzQ(zzql zzqlVar, zzad zzadVar);

    public zzgn zzR(zzqg zzqgVar, zzad zzadVar, zzad zzadVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        if (zzaB() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
        if (zzaB() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009b, code lost:
        if (zzaB() == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzgn zzS(com.google.android.gms.internal.ads.zzja r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqj.zzS(com.google.android.gms.internal.ads.zzja):com.google.android.gms.internal.ads.zzgn");
    }

    public abstract zzqc zzV(zzqg zzqgVar, zzad zzadVar, MediaCrypto mediaCrypto, float f2);

    public abstract List zzW(zzql zzqlVar, zzad zzadVar, boolean z);

    public void zzX(Exception exc) {
        throw null;
    }

    public void zzY(String str, zzqc zzqcVar, long j2, long j3) {
        throw null;
    }

    public void zzZ(String str) {
        throw null;
    }

    public void zzaa(zzad zzadVar, MediaFormat mediaFormat) {
        throw null;
    }

    public void zzac() {
    }

    public void zzad(zzgc zzgcVar) {
        throw null;
    }

    public void zzae() {
    }

    public abstract boolean zzaf(long j2, long j3, zzqe zzqeVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, zzad zzadVar);

    public boolean zzag(zzad zzadVar) {
        return false;
    }

    public final float zzah() {
        return this.zzu;
    }

    public final long zzai() {
        return this.zzal;
    }

    public final zzqe zzaj() {
        return this.zzw;
    }

    public zzqf zzak(Throwable th, zzqg zzqgVar) {
        return new zzqf(th, zzqgVar);
    }

    public final zzqg zzal() {
        return this.zzD;
    }

    public void zzam(zzgc zzgcVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6 A[Catch: zzqi -> 0x0119, TryCatch #0 {zzqi -> 0x0119, blocks: (B:30:0x0065, B:33:0x006a, B:35:0x0080, B:36:0x008b, B:41:0x009a, B:43:0x00a2, B:44:0x00aa, B:46:0x00ae, B:57:0x00d6, B:59:0x00f6, B:61:0x00ff, B:64:0x0108, B:65:0x010a, B:60:0x00f9, B:66:0x010b, B:68:0x010e, B:69:0x0118, B:39:0x008f, B:40:0x0099, B:54:0x00c6, B:55:0x00d4, B:49:0x00bd), top: B:74:0x0065, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9 A[Catch: zzqi -> 0x0119, TryCatch #0 {zzqi -> 0x0119, blocks: (B:30:0x0065, B:33:0x006a, B:35:0x0080, B:36:0x008b, B:41:0x009a, B:43:0x00a2, B:44:0x00aa, B:46:0x00ae, B:57:0x00d6, B:59:0x00f6, B:61:0x00ff, B:64:0x0108, B:65:0x010a, B:60:0x00f9, B:66:0x010b, B:68:0x010e, B:69:0x0118, B:39:0x008f, B:40:0x0099, B:54:0x00c6, B:55:0x00d4, B:49:0x00bd), top: B:74:0x0065, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0108 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzan() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqj.zzan():void");
    }

    public void zzao(long j2) {
        while (true) {
            int i2 = this.zzam;
            if (i2 == 0 || j2 < this.zzo[0]) {
                return;
            }
            long[] jArr = this.zzm;
            this.zzak = jArr[0];
            this.zzal = this.zzn[0];
            int i3 = i2 - 1;
            this.zzam = i3;
            System.arraycopy(jArr, 1, jArr, 0, i3);
            long[] jArr2 = this.zzn;
            System.arraycopy(jArr2, 1, jArr2, 0, this.zzam);
            long[] jArr3 = this.zzo;
            System.arraycopy(jArr3, 1, jArr3, 0, this.zzam);
            zzac();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzpk, android.media.MediaCrypto, com.google.android.gms.internal.ads.zzqe] */
    public final void zzap() {
        try {
            zzqe zzqeVar = this.zzw;
            if (zzqeVar != null) {
                zzqeVar.zzl();
                this.zza.zzb++;
                zzZ(this.zzD.zza);
            }
        } finally {
            this.zzw = null;
            this.zzr = null;
            this.zzan = null;
            zzar();
        }
    }

    public void zzaq() {
        zzay();
        zzaz();
        this.zzP = -9223372036854775807L;
        this.zzad = false;
        this.zzac = false;
        this.zzL = false;
        this.zzM = false;
        this.zzT = false;
        this.zzU = false;
        this.zzk.clear();
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        zzpz zzpzVar = this.zzO;
        if (zzpzVar != null) {
            zzpzVar.zzc();
        }
        this.zzaa = 0;
        this.zzab = 0;
        this.zzZ = this.zzY ? 1 : 0;
    }

    public final void zzar() {
        zzaq();
        this.zzO = null;
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzae = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzN = false;
        this.zzY = false;
        this.zzZ = 0;
        this.zzs = false;
    }

    public final boolean zzas() {
        boolean zzat = zzat();
        if (zzat) {
            zzan();
        }
        return zzat;
    }

    public final boolean zzat() {
        if (this.zzw == null) {
            return false;
        }
        if (this.zzab != 3 && !this.zzG && ((!this.zzH || this.zzae) && (!this.zzI || !this.zzad))) {
            zzab();
            return false;
        }
        zzap();
        return true;
    }

    public boolean zzau(zzqg zzqgVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgl, com.google.android.gms.internal.ads.zzjv
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    public void zzs() {
        this.zzp = null;
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        this.zzam = 0;
        zzat();
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    public void zzt(boolean z, boolean z2) {
        this.zza = new zzgm();
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    public void zzu(long j2, boolean z) {
        this.zzah = false;
        this.zzai = false;
        if (this.zzV) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzW = false;
        } else {
            zzas();
        }
        zzed zzedVar = this.zzj;
        if (zzedVar.zza() > 0) {
            this.zzaj = true;
        }
        zzedVar.zze();
        int i2 = this.zzam;
        if (i2 != 0) {
            int i3 = i2 - 1;
            this.zzal = this.zzn[i3];
            this.zzak = this.zzm[i3];
            this.zzam = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    public void zzv() {
        try {
            zzT();
            zzap();
        } finally {
            this.zzao = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    public final void zzy(zzad[] zzadVarArr, long j2, long j3) {
        if (this.zzal == -9223372036854775807L) {
            zzcw.zzf(this.zzak == -9223372036854775807L);
            this.zzak = j2;
            this.zzal = j3;
            return;
        }
        int i2 = this.zzam;
        if (i2 == 10) {
            Log.w("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.zzn[9]);
        } else {
            this.zzam = i2 + 1;
        }
        long[] jArr = this.zzm;
        int i3 = this.zzam - 1;
        jArr[i3] = j2;
        this.zzn[i3] = j3;
        this.zzo[i3] = this.zzaf;
    }
}
