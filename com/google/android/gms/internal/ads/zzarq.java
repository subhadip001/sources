package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzarq implements Handler.Callback, zzawx, zzayc, zzawz {
    private zzaro zzA;
    private long zzB;
    private zzarm zzC;
    private zzarm zzD;
    private zzarm zzE;
    private zzasd zzF;
    private boolean zzG;
    private boolean zzH;
    private int zzI;
    private volatile int zzJ;
    private volatile int zzK;
    private final zzcio zzL;
    private final zzarx[] zza;
    private final zzayd zzc;
    private final zzazj zzd;
    private final Handler zze;
    private final HandlerThread zzf;
    private final Handler zzg;
    private final zzari zzh;
    private final zzasc zzi;
    private final zzasb zzj;
    private zzarn zzk;
    private zzarw zzl;
    private zzarx zzm;
    private zzazc zzn;
    private zzaxa zzo;
    private zzarx[] zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private int zzw;
    private int zzx;
    private long zzy;
    private int zzz;
    private int zzv = 0;
    private int zzu = 1;
    private final zzary[] zzb = new zzary[2];

    public zzarq(zzarx[] zzarxVarArr, zzayd zzaydVar, zzcio zzcioVar, boolean z, int i2, Handler handler, zzarn zzarnVar, zzari zzariVar, byte[] bArr) {
        this.zza = zzarxVarArr;
        this.zzc = zzaydVar;
        this.zzL = zzcioVar;
        this.zzr = z;
        this.zzg = handler;
        this.zzk = zzarnVar;
        this.zzh = zzariVar;
        for (int i3 = 0; i3 < 2; i3++) {
            zzarxVarArr[i3].zzw(i3);
            this.zzb[i3] = zzarxVarArr[i3].zzf();
        }
        this.zzd = new zzazj();
        this.zzp = new zzarx[0];
        this.zzi = new zzasc();
        this.zzj = new zzasb();
        zzaydVar.zzf(this);
        this.zzl = zzarw.zza;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.zzf = handlerThread;
        handlerThread.start();
        this.zze = new Handler(handlerThread.getLooper(), this);
    }

    private final void zzA(Object obj, int i2) {
        this.zzk = new zzarn(0, 0L);
        zzD(obj, i2);
        this.zzk = new zzarn(0, -9223372036854775807L);
        zzJ(4);
        zzE(false);
    }

    private final void zzB() {
        zzarm zzarmVar = this.zzC;
        long zza = !zzarmVar.zzj ? 0L : zzarmVar.zza.zza();
        if (zza == Long.MIN_VALUE) {
            zzH(false);
            return;
        }
        zzarm zzarmVar2 = this.zzC;
        long j2 = this.zzB - (zzarmVar2.zzf - zzarmVar2.zzh);
        boolean zzj = this.zzL.zzj(zza - j2);
        zzH(zzj);
        if (zzj) {
            this.zzC.zza.zzbj(j2);
        }
    }

    private final void zzC() {
        zzarm zzarmVar = this.zzC;
        if (zzarmVar == null || zzarmVar.zzj) {
            return;
        }
        zzarm zzarmVar2 = this.zzD;
        if (zzarmVar2 == null || zzarmVar2.zzl == zzarmVar) {
            for (zzarx zzarxVar : this.zzp) {
                if (!zzarxVar.zzA()) {
                    return;
                }
            }
            this.zzC.zza.zzs();
        }
    }

    private final void zzD(Object obj, int i2) {
        this.zzg.obtainMessage(6, new zzarp(this.zzF, obj, this.zzk, i2)).sendToTarget();
    }

    private final void zzE(boolean z) {
        zzarx[] zzarxVarArr;
        this.zze.removeMessages(2);
        this.zzs = false;
        this.zzd.zzc();
        this.zzn = null;
        this.zzm = null;
        this.zzB = 60000000L;
        for (zzarx zzarxVar : this.zzp) {
            try {
                zzQ(zzarxVar);
                zzarxVar.zzj();
            } catch (zzare | RuntimeException e2) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e2);
            }
        }
        this.zzp = new zzarx[0];
        zzarm zzarmVar = this.zzE;
        if (zzarmVar == null) {
            zzarmVar = this.zzC;
        }
        zzR(zzarmVar);
        this.zzC = null;
        this.zzD = null;
        this.zzE = null;
        zzH(false);
        if (z) {
            zzaxa zzaxaVar = this.zzo;
            if (zzaxaVar != null) {
                zzaxaVar.zzd();
                this.zzo = null;
            }
            this.zzF = null;
        }
    }

    private final void zzF(long j2) {
        zzarm zzarmVar = this.zzE;
        long j3 = zzarmVar == null ? j2 + 60000000 : j2 + (zzarmVar.zzf - zzarmVar.zzh);
        this.zzB = j3;
        this.zzd.zza(j3);
        for (zzarx zzarxVar : this.zzp) {
            zzarxVar.zzu(this.zzB);
        }
    }

    private final void zzG(long j2, long j3) {
        this.zze.removeMessages(2);
        long elapsedRealtime = (j2 + j3) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.zze.sendEmptyMessage(2);
        } else {
            this.zze.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private final void zzH(boolean z) {
        if (this.zzt != z) {
            this.zzt = z;
            this.zzg.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    private final void zzI(zzarm zzarmVar) {
        if (this.zzE == zzarmVar) {
            return;
        }
        boolean[] zArr = new boolean[2];
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            zzarx zzarxVar = this.zza[i3];
            zArr[i3] = zzarxVar.zzb() != 0;
            zzaxt zza = zzarmVar.zzm.zzb.zza(i3);
            if (zza != null) {
                i2++;
            }
            if (zArr[i3] && (zza == null || (zzarxVar.zzB() && zzarxVar.zzh() == this.zzE.zzd[i3]))) {
                if (zzarxVar == this.zzm) {
                    this.zzd.zzd(this.zzn);
                    this.zzn = null;
                    this.zzm = null;
                }
                zzQ(zzarxVar);
                zzarxVar.zzj();
            }
        }
        this.zzE = zzarmVar;
        this.zzg.obtainMessage(3, zzarmVar.zzm).sendToTarget();
        zzz(zArr, i2);
    }

    private final void zzJ(int i2) {
        if (this.zzu != i2) {
            this.zzu = i2;
            this.zzg.obtainMessage(1, i2, 0).sendToTarget();
        }
    }

    private final void zzK() {
        this.zzs = false;
        this.zzd.zzb();
        for (zzarx zzarxVar : this.zzp) {
            zzarxVar.zzy();
        }
    }

    private final void zzL() {
        zzE(true);
        this.zzL.zzc();
        zzJ(1);
    }

    private final void zzM() {
        this.zzd.zzc();
        for (zzarx zzarxVar : this.zzp) {
            zzQ(zzarxVar);
        }
    }

    private final void zzN() {
        zzarm zzarmVar = this.zzE;
        if (zzarmVar == null) {
            return;
        }
        long zzh = zzarmVar.zza.zzh();
        if (zzh != -9223372036854775807L) {
            zzF(zzh);
        } else {
            zzarx zzarxVar = this.zzm;
            if (zzarxVar != null && !zzarxVar.zzE()) {
                long zzI = this.zzn.zzI();
                this.zzB = zzI;
                this.zzd.zza(zzI);
            } else {
                this.zzB = this.zzd.zzI();
            }
            zzarm zzarmVar2 = this.zzE;
            zzh = this.zzB - (zzarmVar2.zzf - zzarmVar2.zzh);
        }
        this.zzk.zzc = zzh;
        this.zzy = SystemClock.elapsedRealtime() * 1000;
        long zzg = this.zzp.length == 0 ? Long.MIN_VALUE : this.zzE.zza.zzg();
        zzarn zzarnVar = this.zzk;
        if (zzg == Long.MIN_VALUE) {
            zzg = this.zzF.zzd(this.zzE.zzg, this.zzj, false).zzc;
        }
        zzarnVar.zzd = zzg;
    }

    private final boolean zzO(int i2) {
        this.zzF.zzd(i2, this.zzj, false);
        this.zzF.zzg(0, this.zzi, false);
        return this.zzF.zzf(i2, this.zzj, this.zzi, this.zzv) == -1;
    }

    private final boolean zzP(long j2) {
        zzarm zzarmVar;
        return j2 == -9223372036854775807L || this.zzk.zzc < j2 || ((zzarmVar = this.zzE.zzl) != null && zzarmVar.zzj);
    }

    private static final void zzQ(zzarx zzarxVar) {
        if (zzarxVar.zzb() == 2) {
            zzarxVar.zzz();
        }
    }

    private static final void zzR(zzarm zzarmVar) {
        while (zzarmVar != null) {
            zzarmVar.zzc();
            zzarmVar = zzarmVar.zzl;
        }
    }

    private final int zzt(int i2, zzasd zzasdVar, zzasd zzasdVar2) {
        int zzb = zzasdVar.zzb();
        int i3 = -1;
        for (int i4 = 0; i4 < zzb && i3 == -1; i4++) {
            i2 = zzasdVar.zzf(i2, this.zzj, this.zzi, this.zzv);
            i3 = zzasdVar2.zza(zzasdVar.zzd(i2, this.zzj, true).zzb);
        }
        return i3;
    }

    private final long zzu(int i2, long j2) {
        zzarm zzarmVar;
        zzM();
        this.zzs = false;
        zzJ(2);
        zzarm zzarmVar2 = this.zzE;
        if (zzarmVar2 == null) {
            zzarm zzarmVar3 = this.zzC;
            if (zzarmVar3 != null) {
                zzarmVar3.zzc();
            }
            zzarmVar = null;
        } else {
            zzarmVar = null;
            while (zzarmVar2 != null) {
                if (zzarmVar2.zzg == i2 && zzarmVar2.zzj) {
                    zzarmVar = zzarmVar2;
                } else {
                    zzarmVar2.zzc();
                }
                zzarmVar2 = zzarmVar2.zzl;
            }
        }
        zzarm zzarmVar4 = this.zzE;
        if (zzarmVar4 != zzarmVar || zzarmVar4 != this.zzD) {
            for (zzarx zzarxVar : this.zzp) {
                zzarxVar.zzj();
            }
            this.zzp = new zzarx[0];
            this.zzn = null;
            this.zzm = null;
            this.zzE = null;
        }
        if (zzarmVar != null) {
            zzarmVar.zzl = null;
            this.zzC = zzarmVar;
            this.zzD = zzarmVar;
            zzI(zzarmVar);
            zzarm zzarmVar5 = this.zzE;
            if (zzarmVar5.zzk) {
                j2 = zzarmVar5.zza.zzi(j2);
            }
            zzF(j2);
            zzB();
        } else {
            this.zzC = null;
            this.zzD = null;
            this.zzE = null;
            zzF(j2);
        }
        this.zze.sendEmptyMessage(2);
        return j2;
    }

    private final Pair zzv(int i2, long j2) {
        return zzw(this.zzF, 0, -9223372036854775807L);
    }

    private final Pair zzw(zzasd zzasdVar, int i2, long j2) {
        return zzx(zzasdVar, 0, j2, 0L);
    }

    private final Pair zzx(zzasd zzasdVar, int i2, long j2, long j3) {
        zzayy.zza(0, 0, zzasdVar.zzc());
        zzasdVar.zze(0, this.zzi, false, j3);
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        long j4 = zzasdVar.zzd(0, this.zzj, false).zzc;
        if (j4 != -9223372036854775807L) {
            int i3 = (j2 > j4 ? 1 : (j2 == j4 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j2));
    }

    private final Pair zzy(zzaro zzaroVar) {
        zzasd zzasdVar = zzaroVar.zza;
        if (zzasdVar.zzh()) {
            zzasdVar = this.zzF;
        }
        try {
            Pair zzw = zzw(zzasdVar, 0, zzaroVar.zzc);
            zzasd zzasdVar2 = this.zzF;
            if (zzasdVar2 == zzasdVar) {
                return zzw;
            }
            if (zzasdVar2.zza(zzasdVar.zzd(((Integer) zzw.first).intValue(), this.zzj, true).zzb) != -1) {
                return Pair.create(0, (Long) zzw.second);
            }
            if (zzt(((Integer) zzw.first).intValue(), zzasdVar, this.zzF) != -1) {
                this.zzF.zzd(0, this.zzj, false);
                return zzv(0, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new zzaru(this.zzF, 0, zzaroVar.zzc);
        }
    }

    private final void zzz(boolean[] zArr, int i2) {
        int i3;
        this.zzp = new zzarx[i2];
        int i4 = 0;
        int i5 = 0;
        while (i4 < 2) {
            zzarx zzarxVar = this.zza[i4];
            zzaxt zza = this.zzE.zzm.zzb.zza(i4);
            if (zza != null) {
                int i6 = i5 + 1;
                this.zzp[i5] = zzarxVar;
                if (zzarxVar.zzb() == 0) {
                    zzarz zzarzVar = this.zzE.zzm.zzd[i4];
                    boolean z = this.zzr && this.zzu == 3;
                    boolean z2 = !zArr[i4] && z;
                    zza.zzb();
                    zzars[] zzarsVarArr = new zzars[1];
                    for (int i7 = 0; i7 <= 0; i7++) {
                        zzarsVarArr[i7] = zza.zzc(i7);
                    }
                    zzarm zzarmVar = this.zzE;
                    i3 = i4;
                    zzarxVar.zzk(zzarzVar, zzarsVarArr, zzarmVar.zzd[i4], this.zzB, z2, zzarmVar.zzf - zzarmVar.zzh);
                    zzazc zzi = zzarxVar.zzi();
                    if (zzi != null) {
                        if (this.zzn == null) {
                            this.zzn = zzi;
                            this.zzm = zzarxVar;
                            zzi.zzK(this.zzl);
                        } else {
                            throw zzare.zzc(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z) {
                        zzarxVar.zzy();
                    }
                } else {
                    i3 = i4;
                }
                i5 = i6;
            } else {
                i3 = i4;
            }
            i4 = i3 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0330, code lost:
        if (r2 != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0332, code lost:
        r2 = r33.zzE.zzg;
        r33.zzk = new com.google.android.gms.internal.ads.zzarn(r2, zzu(r2, r33.zzk.zzc));
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0346, code lost:
        r33.zzC = r3;
        r3.zzl = null;
        zzR(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
        zzR(r12);
        r2.zzl = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0798, code lost:
        if (zzP(r1) != false) goto L372;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0268 A[Catch: IOException -> 0x0872, zzare -> 0x0878, RuntimeException -> 0x087e, TryCatch #4 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026c A[Catch: IOException -> 0x0872, zzare -> 0x0878, RuntimeException -> 0x087e, TryCatch #4 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0271 A[Catch: IOException -> 0x0872, zzare -> 0x0878, RuntimeException -> 0x087e, TryCatch #4 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04ea A[Catch: IOException -> 0x0872, zzare -> 0x0878, RuntimeException -> 0x087e, TryCatch #4 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04f1 A[Catch: IOException -> 0x0872, zzare -> 0x0878, RuntimeException -> 0x087e, TryCatch #4 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x050b A[Catch: IOException -> 0x0872, zzare -> 0x0878, RuntimeException -> 0x087e, TryCatch #4 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0546 A[Catch: IOException -> 0x0872, zzare -> 0x0878, RuntimeException -> 0x087e, TryCatch #4 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0558 A[Catch: IOException -> 0x0872, zzare -> 0x0878, RuntimeException -> 0x087e, TryCatch #4 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0572 A[Catch: IOException -> 0x0872, zzare -> 0x0878, RuntimeException -> 0x087e, LOOP:9: B:305:0x0572->B:309:0x0582, LOOP_START, TryCatch #4 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06c7 A[Catch: IOException -> 0x0872, zzare -> 0x0878, RuntimeException -> 0x087e, TryCatch #4 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x07a2 A[Catch: IOException -> 0x0872, zzare -> 0x0878, RuntimeException -> 0x087e, TryCatch #4 {RuntimeException -> 0x087e, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:121:0x019d, B:115:0x0178, B:117:0x017e, B:118:0x0184, B:120:0x018c, B:122:0x01a9, B:126:0x01b0, B:128:0x01b6, B:130:0x01be, B:132:0x01c2, B:134:0x01c6, B:136:0x01ce, B:139:0x01d3, B:141:0x01e4, B:142:0x01f2, B:144:0x01f6, B:146:0x0206, B:148:0x020a, B:150:0x0218, B:151:0x021d, B:159:0x0264, B:161:0x0268, B:163:0x026c, B:164:0x0271, B:166:0x027b, B:168:0x0285, B:169:0x028a, B:170:0x02b2, B:172:0x02b6, B:176:0x02c1, B:177:0x02c4, B:178:0x02d4, B:182:0x02e3, B:184:0x02e9, B:185:0x02fa, B:187:0x02fe, B:189:0x030c, B:191:0x031e, B:195:0x032d, B:197:0x0332, B:198:0x0346, B:199:0x034d, B:152:0x0235, B:154:0x023d, B:156:0x0243, B:157:0x0248, B:201:0x0351, B:202:0x035c, B:209:0x0367, B:210:0x0368, B:212:0x036c, B:214:0x0374, B:216:0x037e, B:215:0x0379, B:218:0x038a, B:220:0x0392, B:221:0x039b, B:223:0x03a1, B:224:0x03bf, B:228:0x03c8, B:234:0x03ea, B:235:0x03f7, B:243:0x0407, B:246:0x0417, B:247:0x0428, B:248:0x0429, B:250:0x0433, B:356:0x0677, B:358:0x067d, B:360:0x0686, B:362:0x06a1, B:364:0x06ac, B:368:0x06b5, B:370:0x06bb, B:376:0x06c7, B:381:0x06d1, B:383:0x06d8, B:384:0x06db, B:386:0x06df, B:388:0x06eb, B:389:0x06fe, B:393:0x0718, B:395:0x0720, B:397:0x0726, B:432:0x07c0, B:434:0x07c5, B:436:0x07cb, B:437:0x07d3, B:439:0x07d7, B:443:0x07e1, B:445:0x07e5, B:447:0x07eb, B:456:0x0808, B:441:0x07dc, B:448:0x07ef, B:450:0x07f4, B:452:0x07f8, B:454:0x07fe, B:455:0x0802, B:398:0x072f, B:400:0x0734, B:403:0x073b, B:405:0x0743, B:409:0x0752, B:421:0x079a, B:423:0x07a2, B:412:0x0759, B:413:0x0766, B:415:0x076a, B:416:0x0780, B:406:0x0746, B:419:0x0794, B:426:0x07a9, B:431:0x07b5, B:429:0x07af, B:251:0x043b, B:253:0x043f, B:265:0x0479, B:267:0x0481, B:292:0x0554, B:294:0x0558, B:297:0x055f, B:299:0x0563, B:301:0x0567, B:303:0x056e, B:305:0x0572, B:307:0x0578, B:309:0x0582, B:310:0x05a9, B:315:0x05b1, B:317:0x05bd, B:319:0x05c3, B:321:0x05c9, B:322:0x05cc, B:326:0x05d3, B:329:0x05e5, B:331:0x05eb, B:332:0x05ee, B:334:0x05f4, B:336:0x05f8, B:338:0x0608, B:355:0x066d, B:343:0x0622, B:344:0x0626, B:346:0x062c, B:348:0x063c, B:350:0x0642, B:352:0x064a, B:353:0x0653, B:354:0x0666, B:302:0x056b, B:268:0x0488, B:270:0x048c, B:278:0x04e6, B:280:0x04ea, B:283:0x0504, B:287:0x0510, B:289:0x0546, B:290:0x0548, B:286:0x050b, B:282:0x04f1, B:272:0x0493, B:275:0x04a4, B:277:0x04d5, B:254:0x0444, B:256:0x044a, B:258:0x0450, B:260:0x045e, B:262:0x0462, B:264:0x046d, B:458:0x080e, B:462:0x0815, B:464:0x081c, B:466:0x0824, B:468:0x0829, B:471:0x0836, B:473:0x083d, B:475:0x0854, B:476:0x0860), top: B:501:0x0005 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r34) {
        /*
            Method dump skipped, instructions count: 2288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarq.handleMessage(android.os.Message):boolean");
    }

    public final synchronized void zza(zzarh... zzarhVarArr) {
        if (this.zzq) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        int i2 = this.zzw;
        this.zzw = i2 + 1;
        this.zze.obtainMessage(11, zzarhVarArr).sendToTarget();
        while (this.zzx <= i2) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void zzb() {
        this.zzG = true;
    }

    public final void zzc(int i2) {
        this.zzI = i2;
    }

    public final void zzd() {
        this.zzH = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final /* bridge */ /* synthetic */ void zze(zzaxm zzaxmVar) {
        this.zze.obtainMessage(9, (zzawy) zzaxmVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzawx
    public final void zzf(zzawy zzawyVar) {
        this.zze.obtainMessage(8, zzawyVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzg(zzasd zzasdVar, Object obj) {
        this.zze.obtainMessage(7, Pair.create(zzasdVar, null)).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zzh() {
        this.zze.sendEmptyMessage(10);
    }

    public final void zzi(zzaxa zzaxaVar, boolean z) {
        this.zze.obtainMessage(0, 1, 0, zzaxaVar).sendToTarget();
    }

    public final synchronized void zzj() {
        if (this.zzq) {
            return;
        }
        this.zze.sendEmptyMessage(6);
        while (!this.zzq) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.zzf.quit();
    }

    public final void zzk(zzasd zzasdVar, int i2, long j2) {
        this.zze.obtainMessage(3, new zzaro(zzasdVar, 0, j2)).sendToTarget();
    }

    public final void zzl(zzarh... zzarhVarArr) {
        if (this.zzq) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.zzw++;
        this.zze.obtainMessage(11, zzarhVarArr).sendToTarget();
    }

    public final void zzm(int i2) {
        this.zzK = i2;
    }

    public final void zzn(int i2) {
        this.zzJ = i2;
    }

    public final void zzo(boolean z) {
        this.zze.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void zzp() {
        this.zze.sendEmptyMessage(5);
    }

    public final synchronized boolean zzq(zzarh... zzarhVarArr) {
        int i2;
        if (this.zzq) {
            return true;
        }
        int i3 = this.zzw;
        this.zzw = i3 + 1;
        this.zze.obtainMessage(11, zzarhVarArr).sendToTarget();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.zzI;
        long j3 = elapsedRealtime + j2;
        while (true) {
            i2 = this.zzx;
            if (i2 > i3 || j2 <= 0) {
                break;
            }
            try {
                wait(j2);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            j2 = j3 - SystemClock.elapsedRealtime();
        }
        return i3 < i2;
    }

    public final boolean zzr() {
        return this.zzH && this.zzI > 0;
    }

    public final synchronized boolean zzs() {
        if (this.zzq) {
            return true;
        }
        this.zze.sendEmptyMessage(6);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.zzI;
        long j3 = elapsedRealtime + j2;
        while (true) {
            if (!this.zzq) {
                if (j2 <= 0) {
                    break;
                }
                try {
                    wait(j2);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                j2 = j3 - SystemClock.elapsedRealtime();
            } else {
                this.zzf.quit();
                break;
            }
        }
        return this.zzq;
    }
}
