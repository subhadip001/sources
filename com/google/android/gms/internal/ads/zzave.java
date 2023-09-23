package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import f.a.b.a.a;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzave implements zzatv {
    public static final zzatx zza = new zzavb();
    private static final int zzb = zzazn.zzg("seig");
    private static final byte[] zzc = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private final SparseArray zzd;
    private final zzazg zze;
    private final zzazg zzf;
    private final zzazg zzg;
    private final zzazg zzh;
    private final zzazg zzi;
    private final byte[] zzj;
    private final Stack zzk;
    private final LinkedList zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private zzazg zzq;
    private long zzr;
    private long zzs;
    private zzavd zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private zzatw zzx;
    private boolean zzy;

    public zzave() {
        this(0, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzatr zza(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r2
        L8:
            if (r3 >= r0) goto La6
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.zzaur r5 = (com.google.android.gms.internal.ads.zzaur) r5
            int r6 = r5.zzaR
            int r7 = com.google.android.gms.internal.ads.zzaus.zzX
            if (r6 != r7) goto La2
            if (r4 != 0) goto L1d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1d:
            com.google.android.gms.internal.ads.zzazg r5 = r5.zza
            byte[] r5 = r5.zza
            com.google.android.gms.internal.ads.zzazg r6 = new com.google.android.gms.internal.ads.zzazg
            r6.<init>(r5)
            int r8 = r6.zzd()
            r9 = 32
            if (r8 >= r9) goto L2f
            goto L7b
        L2f:
            r6.zzv(r1)
            int r8 = r6.zze()
            int r9 = r6.zza()
            int r9 = r9 + 4
            if (r8 == r9) goto L3f
            goto L7b
        L3f:
            int r8 = r6.zze()
            if (r8 == r7) goto L46
            goto L7b
        L46:
            int r7 = r6.zze()
            int r7 = com.google.android.gms.internal.ads.zzaus.zzf(r7)
            r8 = 1
            if (r7 <= r8) goto L59
            java.lang.String r6 = "Unsupported pssh version: "
            java.lang.String r8 = "PsshAtomUtil"
            f.a.b.a.a.O(r6, r7, r8)
            goto L7b
        L59:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.zzl()
            long r12 = r6.zzl()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L71
            int r7 = r6.zzi()
            int r7 = r7 * 16
            r6.zzw(r7)
        L71:
            int r7 = r6.zzi()
            int r8 = r6.zza()
            if (r7 == r8) goto L7d
        L7b:
            r6 = r2
            goto L86
        L7d:
            byte[] r8 = new byte[r7]
            r6.zzq(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L86:
            if (r6 != 0) goto L8a
            r6 = r2
            goto L8e
        L8a:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L8e:
            if (r6 != 0) goto L98
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto La2
        L98:
            com.google.android.gms.internal.ads.zzatq r7 = new com.google.android.gms.internal.ads.zzatq
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5, r1)
            r4.add(r7)
        La2:
            int r3 = r3 + 1
            goto L8
        La6:
            if (r4 != 0) goto La9
            return r2
        La9:
            com.google.android.gms.internal.ads.zzatr r14 = new com.google.android.gms.internal.ads.zzatr
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzave.zza(java.util.List):com.google.android.gms.internal.ads.zzatr");
    }

    private final void zzb() {
        this.zzm = 0;
        this.zzp = 0;
    }

    private static void zzc(zzazg zzazgVar, int i2, zzavm zzavmVar) {
        zzazgVar.zzv(i2 + 8);
        int zze = zzaus.zze(zzazgVar.zze());
        if ((zze & 1) == 0) {
            boolean z = (zze & 2) != 0;
            int zzi = zzazgVar.zzi();
            int i3 = zzavmVar.zze;
            if (zzi == i3) {
                Arrays.fill(zzavmVar.zzm, 0, zzi, z);
                zzavmVar.zza(zzazgVar.zza());
                zzazgVar.zzq(zzavmVar.zzp.zza, 0, zzavmVar.zzo);
                zzavmVar.zzp.zzv(0);
                zzavmVar.zzq = false;
                return;
            }
            throw new zzarv(a.k("Length mismatch: ", zzi, ", ", i3));
        }
        throw new zzarv("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x0600, code lost:
        zzb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0604, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzh(long r48) {
        /*
            Method dump skipped, instructions count: 1541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzave.zzh(long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zzd(zzatw zzatwVar) {
        this.zzx = zzatwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zze(long j2, long j3) {
        int size = this.zzd.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzavd) this.zzd.valueAt(i2)).zzb();
        }
        this.zzl.clear();
        this.zzk.clear();
        zzb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        r2 = r25.zzt;
        r3 = r2.zza;
        r5 = r3.zzh;
        r9 = r2.zze;
        r5 = r5[r9];
        r25.zzu = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (r3.zzl == false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
        r5 = r3.zzp;
        r10 = r3.zza.zza;
        r11 = r3.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r11 == null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
        r11 = r2.zzc.zzh[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        r10 = r11.zza;
        r3 = r3.zzm[r9];
        r9 = r25.zzh;
        r11 = r9.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
        if (true == r3) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
        r11[0] = (byte) (r12 | r10);
        r9.zzv(0);
        r2 = r2.zzb;
        r2.zzb(r25.zzh, 1);
        r2.zzb(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
        if (r3 != false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
        r3 = r5.zzj();
        r5.zzw(-2);
        r3 = (r3 * 6) + 2;
        r2.zzb(r5, r3);
        r10 = (r10 + 1) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
        r25.zzv = r10;
        r5 = r25.zzu + r10;
        r25.zzu = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
        r25.zzv = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e6, code lost:
        if (r25.zzt.zzc.zzg != 1) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
        r25.zzu = r5 - 8;
        r26.zzi(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
        r25.zzm = 4;
        r25.zzw = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
        r2 = r25.zzt;
        r3 = r2.zza;
        r5 = r2.zzc;
        r9 = r2.zzb;
        r2 = r2.zze;
        r6 = r5.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
        if (r6 != 0) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0102, code lost:
        r4 = r25.zzv;
        r6 = r25.zzu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0106, code lost:
        if (r4 >= r6) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
        r25.zzv += r9.zzd(r26, r6 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
        r10 = r25.zzf.zza;
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r4 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0126, code lost:
        if (r25.zzv >= r25.zzu) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
        r11 = r25.zzw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012a, code lost:
        if (r11 != 0) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012c, code lost:
        r26.zzh(r10, r6, r4, false);
        r25.zzf.zzv(0);
        r25.zzw = r25.zzf.zzi() - 1;
        r25.zze.zzv(0);
        r9.zzb(r25.zze, 4);
        r9.zzb(r25.zzf, 1);
        r25.zzv += 5;
        r25.zzu += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
        r11 = r9.zzd(r26, r11, false);
        r25.zzv += r11;
        r25.zzw -= r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0169, code lost:
        r10 = (r3.zzj[r2] + r3.zzi[r2]) * 1000;
        r1 = r3.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
        if (true == r1) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017d, code lost:
        r4 = com.google.firebase.crashlytics.internal.common.CommonUtils.BYTES_IN_A_GIGABYTE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017f, code lost:
        r12 = r4 | (r3.zzk[r2] ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0185, code lost:
        if (r1 == false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0187, code lost:
        r1 = r3.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0189, code lost:
        if (r1 != null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018b, code lost:
        r1 = r5.zzh[r3.zza.zza];
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0193, code lost:
        r2 = r25.zzt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0197, code lost:
        if (r1 == r2.zzi) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0199, code lost:
        r2 = new com.google.android.gms.internal.ads.zzaud(1, r1.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a1, code lost:
        r2 = r2.zzh;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a3, code lost:
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a5, code lost:
        r1 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a7, code lost:
        r2 = r25.zzt;
        r2.zzh = r15;
        r2.zzi = r1;
        r9.zzc(r10, r12, r25.zzu, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b9, code lost:
        if (r25.zzl.isEmpty() == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01bb, code lost:
        r1 = r25.zzt;
        r1.zze++;
        r2 = r1.zzf + 1;
        r1.zzf = r2;
        r3 = r3.zzg;
        r4 = r1.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cd, code lost:
        if (r2 != r3[r4]) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cf, code lost:
        r1.zzg = r4 + 1;
        r1.zzf = 0;
        r25.zzt = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d7, code lost:
        r25.zzm = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01da, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01db, code lost:
        r2 = ((com.google.android.gms.internal.ads.zzavc) r25.zzl.removeFirst()).zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e6, code lost:
        throw null;
     */
    @Override // com.google.android.gms.internal.ads.zzatv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzf(com.google.android.gms.internal.ads.zzatu r26, com.google.android.gms.internal.ads.zzaua r27) {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzave.zzf(com.google.android.gms.internal.ads.zzatu, com.google.android.gms.internal.ads.zzaua):int");
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final boolean zzg(zzatu zzatuVar) {
        return zzavj.zza(zzatuVar);
    }

    public zzave(int i2, zzazk zzazkVar, zzavk zzavkVar) {
        this.zzi = new zzazg(16);
        this.zze = new zzazg(zzaze.zza);
        this.zzf = new zzazg(5);
        this.zzg = new zzazg();
        this.zzh = new zzazg(1);
        this.zzj = new byte[16];
        this.zzk = new Stack();
        this.zzl = new LinkedList();
        this.zzd = new SparseArray();
        this.zzs = -9223372036854775807L;
        zzb();
    }
}
