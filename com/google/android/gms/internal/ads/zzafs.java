package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzafs implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzafr
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzafs.zza;
            return new zzys[]{new zzafs()};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private final zzaft zzb = new zzaft(null);
    private final zzdy zzc = new zzdy(16384);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzys
    public final int zza(zzyt zzytVar, zzzs zzzsVar) {
        int zza2 = zzytVar.zza(this.zzc.zzH(), 0, 16384);
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(zza2);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzb.zzb(zzyvVar, new zzahm(Integer.MIN_VALUE, 0, 1));
        zzyvVar.zzB();
        zzyvVar.zzL(new zzzu(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j2, long j3) {
        this.zzd = false;
        this.zzb.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        r16.zzj();
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
        if ((r5 - r3) >= 8192) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzd(com.google.android.gms.internal.ads.zzyt r16) {
        /*
            r15 = this;
            com.google.android.gms.internal.ads.zzdy r0 = new com.google.android.gms.internal.ads.zzdy
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.zzH()
            r5 = r16
            com.google.android.gms.internal.ads.zzym r5 = (com.google.android.gms.internal.ads.zzym) r5
            r5.zzm(r4, r2, r1, r2)
            r0.zzF(r2)
            int r4 = r0.zzm()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L9e
            r16.zzj()
            r4 = r16
            com.google.android.gms.internal.ads.zzym r4 = (com.google.android.gms.internal.ads.zzym) r4
            r4.zzl(r3, r2)
            r5 = r3
        L2c:
            r1 = 0
        L2d:
            byte[] r6 = r0.zzH()
            r8 = 7
            r4.zzm(r6, r2, r8, r2)
            r0.zzF(r2)
            int r6 = r0.zzo()
            r9 = 44096(0xac40, float:6.1792E-41)
            r10 = 44097(0xac41, float:6.1793E-41)
            if (r6 == r9) goto L56
            if (r6 == r10) goto L56
            r16.zzj()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.148E-41)
            if (r1 >= r6) goto L55
            r4.zzl(r5, r2)
            goto L2c
        L55:
            return r2
        L56:
            r9 = 1
            int r1 = r1 + r9
            r11 = 4
            if (r1 < r11) goto L5c
            return r9
        L5c:
            byte[] r9 = r0.zzH()
            int r12 = com.google.android.gms.internal.ads.zzya.zza
            int r12 = r9.length
            r13 = -1
            if (r12 >= r8) goto L68
            r12 = -1
            goto L95
        L68:
            r12 = 2
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            r14 = r9[r7]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12 = r12 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r12 != r14) goto L8f
            r11 = r9[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            r12 = 5
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            r11 = r11 | r12
            r12 = 6
            r9 = r9[r12]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r12 = r11 | r9
            goto L90
        L8f:
            r8 = 4
        L90:
            if (r6 != r10) goto L94
            int r8 = r8 + 2
        L94:
            int r12 = r12 + r8
        L95:
            if (r12 != r13) goto L98
            return r2
        L98:
            int r12 = r12 + (-7)
            r4.zzl(r12, r2)
            goto L2d
        L9e:
            r0.zzG(r7)
            int r4 = r0.zzj()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzl(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafs.zzd(com.google.android.gms.internal.ads.zzyt):boolean");
    }
}
