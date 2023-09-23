package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzvz implements zzvv, zzft {
    public static final zzfrh zza = zzfrh.zzs(5400000L, 3300000L, 2000000L, 1300000L, 760000L);
    public static final zzfrh zzb = zzfrh.zzs(1700000L, 820000L, 450000L, 180000L, 130000L);
    public static final zzfrh zzc = zzfrh.zzs(2300000L, 1300000L, 1000000L, 820000L, 570000L);
    public static final zzfrh zzd = zzfrh.zzs(3400000L, 2000000L, 1400000L, 1000000L, 620000L);
    public static final zzfrh zze = zzfrh.zzs(7500000L, 5200000L, 3700000L, 1800000L, 1100000L);
    public static final zzfrh zzf = zzfrh.zzs(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);
    private static zzvz zzg;
    private final zzfrk zzh;
    private final zzvt zzi;
    private final zzwp zzj;
    private final zzcx zzk;
    private final boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;

    @Deprecated
    public zzvz() {
        zzfrk.zzd();
        zzcx zzcxVar = zzcx.zza;
        throw null;
    }

    public static synchronized zzvz zzg(Context context) {
        zzvz zzvzVar;
        synchronized (zzvz.class) {
            if (zzg == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                int[] zzm = zzm(zzeg.zzK(context));
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                zzfrh zzfrhVar = zza;
                hashMap.put(2, (Long) zzfrhVar.get(zzm[0]));
                hashMap.put(3, (Long) zzb.get(zzm[1]));
                hashMap.put(4, (Long) zzc.get(zzm[2]));
                hashMap.put(5, (Long) zzd.get(zzm[3]));
                hashMap.put(10, (Long) zze.get(zzm[4]));
                hashMap.put(9, (Long) zzf.get(zzm[5]));
                hashMap.put(7, (Long) zzfrhVar.get(zzm[0]));
                zzg = new zzvz(applicationContext, hashMap, 2000, zzcx.zza, true, null);
            }
            zzvzVar = zzg;
        }
        return zzvzVar;
    }

    private final long zzi(int i2) {
        Long l2 = (Long) this.zzh.get(Integer.valueOf(i2));
        if (l2 == null) {
            l2 = (Long) this.zzh.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    private final void zzj(int i2, long j2, long j3) {
        int i3;
        long j4;
        if (i2 == 0) {
            if (j2 != 0) {
                j4 = j2;
            } else if (j3 == this.zzt) {
                return;
            } else {
                j4 = 0;
            }
            i3 = 0;
        } else {
            i3 = i2;
            j4 = j2;
        }
        this.zzt = j3;
        this.zzi.zzb(i3, j4, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzk(int i2) {
        int i3 = this.zzp;
        if (i3 == 0 || this.zzl) {
            if (i3 == i2) {
                return;
            }
            this.zzp = i2;
            if (i2 != 1 && i2 != 0 && i2 != 8) {
                this.zzs = zzi(i2);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzj(this.zzm > 0 ? (int) (elapsedRealtime - this.zzn) : 0, this.zzo, this.zzs);
                this.zzn = elapsedRealtime;
                this.zzo = 0L;
                this.zzr = 0L;
                this.zzq = 0L;
                this.zzj.zzc();
            }
        }
    }

    private static boolean zzl(zzew zzewVar, boolean z) {
        return z && !zzewVar.zzb(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0149, code lost:
        if (r3.equals("YE") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x016f, code lost:
        if (r3.equals("WF") != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01a3, code lost:
        if (r3.equals("VG") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01ad, code lost:
        if (r3.equals("VE") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01b7, code lost:
        if (r3.equals("VC") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01cf, code lost:
        if (r3.equals("UY") != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01d9, code lost:
        if (r3.equals("US") != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01e3, code lost:
        if (r3.equals("UG") != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01fb, code lost:
        if (r3.equals("TZ") != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0213, code lost:
        if (r3.equals("TV") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0247, code lost:
        if (r3.equals("TN") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x025f, code lost:
        if (r3.equals("TL") != false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0293, code lost:
        if (r3.equals("TD") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x029d, code lost:
        if (r3.equals("TC") != false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02b4, code lost:
        if (r3.equals("SY") != false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x02be, code lost:
        if (r3.equals("SX") != false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x02c5, code lost:
        return new int[]{2, 2, 1, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x02da, code lost:
        if (r3.equals("ST") != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x02e4, code lost:
        if (r3.equals("SS") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x02ee, code lost:
        if (r3.equals("SR") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x02f5, code lost:
        return new int[]{2, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x02fc, code lost:
        if (r3.equals("SO") != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0306, code lost:
        if (r3.equals("SN") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0310, code lost:
        if (r3.equals("SM") != false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0328, code lost:
        if (r3.equals("SK") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0332, code lost:
        if (r3.equals("SJ") != false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x033c, code lost:
        if (r3.equals("SI") != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0346, code lost:
        if (r3.equals("SH") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x035e, code lost:
        if (r3.equals("SE") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0368, code lost:
        if (r3.equals("SD") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0380, code lost:
        if (r3.equals("SB") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x038a, code lost:
        if (r3.equals("SA") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0391, code lost:
        return new int[]{2, 2, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x03b4, code lost:
        if (r3.equals("RS") != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
        if (r3.equals("CH") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x042e, code lost:
        if (r3.equals("PM") != false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0438, code lost:
        if (r3.equals("PL") != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0442, code lost:
        if (r3.equals("PK") != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x045a, code lost:
        if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
        if (r3.equals("CG") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x04aa, code lost:
        if (r3.equals("NU") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0508, code lost:
        if (r3.equals("NE") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0512, code lost:
        if (r3.equals("NC") != false) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x052a, code lost:
        if (r3.equals("MZ") != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0534, code lost:
        if (r3.equals("MY") != false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x053e, code lost:
        if (r3.equals("MX") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0545, code lost:
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0576, code lost:
        if (r3.equals("MT") != false) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0580, code lost:
        if (r3.equals("MS") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0598, code lost:
        if (r3.equals("MQ") != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x05a2, code lost:
        if (r3.equals("MP") != false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x05e4, code lost:
        if (r3.equals("MK") != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0618, code lost:
        if (r3.equals("ME") != false) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0622, code lost:
        if (r3.equals("MD") != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x063a, code lost:
        if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_MA) != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0644, code lost:
        if (r3.equals("LY") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x064e, code lost:
        if (r3.equals("LV") != false) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0666, code lost:
        if (r3.equals("LT") != false) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008b, code lost:
        if (r3.equals("BR") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x069a, code lost:
        if (r3.equals("LI") != false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x06a4, code lost:
        if (r3.equals("LC") != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x06bc, code lost:
        if (r3.equals("LA") != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x06c3, code lost:
        return new int[]{2, 2, 1, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x06d8, code lost:
        if (r3.equals("KY") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x06fe, code lost:
        if (r3.equals("KP") != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0708, code lost:
        if (r3.equals("KM") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0711, code lost:
        if (r3.equals("KI") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0718, code lost:
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0757, code lost:
        if (r3.equals("JO") != false) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x075e, code lost:
        return new int[]{1, 0, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0765, code lost:
        if (r3.equals("JM") != false) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x078b, code lost:
        if (r3.equals("IS") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0792, code lost:
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x07a7, code lost:
        if (r3.equals("IQ") != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x07ae, code lost:
        return new int[]{3, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x07b5, code lost:
        if (r3.equals("IO") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x07e9, code lost:
        if (r3.equals("IE") != false) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x080f, code lost:
        if (r3.equals("HT") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0819, code lost:
        if (r3.equals("HR") != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0822, code lost:
        if (r3.equals("HN") != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0829, code lost:
        return new int[]{3, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x083e, code lost:
        if (r3.equals("GY") != false) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0848, code lost:
        if (r3.equals("GW") != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x084f, code lost:
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0856, code lost:
        if (r3.equals("GU") != false) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x086e, code lost:
        if (r3.equals("GR") != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0875, code lost:
        return new int[]{1, 0, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bf, code lost:
        if (r3.equals("BM") != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x088a, code lost:
        if (r3.equals("GP") != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x08a1, code lost:
        if (r3.equals("GM") != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x08a8, code lost:
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x08af, code lost:
        if (r3.equals("GL") != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x08b9, code lost:
        if (r3.equals("GI") != false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x08d1, code lost:
        if (r3.equals("GG") != false) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x08db, code lost:
        if (r3.equals("GF") != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x08e2, code lost:
        return new int[]{2, 1, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c9, code lost:
        if (r3.equals("BL") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x08f7, code lost:
        if (r3.equals("GD") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x092b, code lost:
        if (r3.equals("FO") != false) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x0943, code lost:
        if (r3.equals("FK") != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x094a, code lost:
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x097b, code lost:
        if (r3.equals("ES") != false) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x0982, code lost:
        return new int[]{0, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0989, code lost:
        if (r3.equals("ER") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x0990, code lost:
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x09a5, code lost:
        if (r3.equals("EE") != false) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x09ac, code lost:
        return new int[]{0, 0, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x09c1, code lost:
        if (r3.equals("DZ") != false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x09cb, code lost:
        if (r3.equals("DO") != false) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x09d2, code lost:
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e1, code lost:
        if (r3.equals("AT") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x09d9, code lost:
        if (r3.equals("DM") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x0a0d, code lost:
        if (r3.equals("CZ") != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x0a25, code lost:
        if (r3.equals("CX") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x0a4b, code lost:
        if (r3.equals("CU") != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x0a52, code lost:
        return new int[]{4, 4, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x0a83, code lost:
        if (r3.equals("CM") != false) goto L740;
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x0a8d, code lost:
        if (r3.equals("CL") != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x0a94, code lost:
        return new int[]{1, 1, 2, 2, 3, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x0ac5, code lost:
        if (r3.equals("BW") != false) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x0acc, code lost:
        return new int[]{3, 4, 1, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0ae1, code lost:
        if (r3.equals("BI") != false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:818:0x0ae8, code lost:
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x0afd, code lost:
        if (r3.equals("BG") != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0b04, code lost:
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0b27, code lost:
        if (r3.equals("BD") != false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0b2e, code lost:
        return new int[]{2, 1, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0b35, code lost:
        if (r3.equals("AZ") != false) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x0b3c, code lost:
        return new int[]{3, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x0b43, code lost:
        if (r3.equals("AO") != false) goto L740;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x0b4a, code lost:
        return new int[]{3, 4, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x0b51, code lost:
        if (r3.equals("AI") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0107, code lost:
        if (r3.equals("AQ") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0b58, code lost:
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x0b6d, code lost:
        if (r3.equals("AF") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x0b74, code lost:
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x0b89, code lost:
        if (r3.equals("AD") != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x0b90, code lost:
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0bb3, code lost:
        if (r3.equals("BB") != false) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x0bba, code lost:
        return new int[]{0, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:880:0x0bc1, code lost:
        if (r3.equals("BA") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:883:0x0bca, code lost:
        if (r3.equals("AX") != false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:885:0x0bd1, code lost:
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:887:0x0bd8, code lost:
        if (r3.equals("AW") != false) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:889:0x0bdf, code lost:
        return new int[]{1, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:895:0x0bf4, code lost:
        if (r3.equals("AL") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:897:0x0bfb, code lost:
        return new int[]{1, 2, 0, 1, 2, 2};
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[] zzm(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 6534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvz.zzm(java.lang.String):int[]");
    }

    @Override // com.google.android.gms.internal.ads.zzft
    public final synchronized void zza(zzer zzerVar, zzew zzewVar, boolean z, int i2) {
        if (zzl(zzewVar, z)) {
            this.zzo += i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzft
    public final synchronized void zzb(zzer zzerVar, zzew zzewVar, boolean z) {
        if (zzl(zzewVar, z)) {
            zzcw.zzf(this.zzm > 0);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = (int) (elapsedRealtime - this.zzn);
            this.zzq += i2;
            long j2 = this.zzr;
            long j3 = this.zzo;
            this.zzr = j2 + j3;
            if (i2 > 0) {
                this.zzj.zzb((int) Math.sqrt(j3), (((float) j3) * 8000.0f) / i2);
                if (this.zzq >= 2000 || this.zzr >= 524288) {
                    this.zzs = this.zzj.zza(0.5f);
                }
                zzj(i2, this.zzo, this.zzs);
                this.zzn = elapsedRealtime;
                this.zzo = 0L;
            }
            this.zzm--;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzft
    public final void zzc(zzer zzerVar, zzew zzewVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzft
    public final synchronized void zzd(zzer zzerVar, zzew zzewVar, boolean z) {
        if (zzl(zzewVar, z)) {
            if (this.zzm == 0) {
                this.zzn = SystemClock.elapsedRealtime();
            }
            this.zzm++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvv
    public final void zze(Handler handler, zzvu zzvuVar) {
        Objects.requireNonNull(zzvuVar);
        this.zzi.zza(handler, zzvuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvv
    public final void zzf(zzvu zzvuVar) {
        this.zzi.zzc(zzvuVar);
    }

    public /* synthetic */ zzvz(Context context, Map map, int i2, zzcx zzcxVar, boolean z, zzvy zzvyVar) {
        this.zzh = zzfrk.zzc(map);
        this.zzi = new zzvt();
        this.zzj = new zzwp(2000);
        this.zzk = zzcxVar;
        this.zzl = true;
        if (context != null) {
            zzdw zzb2 = zzdw.zzb(context);
            int zza2 = zzb2.zza();
            this.zzp = zza2;
            this.zzs = zzi(zza2);
            zzb2.zzd(new zzvx(this));
            return;
        }
        this.zzp = 0;
        this.zzs = zzi(0);
    }
}
