package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzagy implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzagw
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzagy.zza;
            return new zzys[]{new zzagy()};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private zzagu zzj;
    private zzyv zzk;
    private boolean zzl;
    private final zzee zzb = new zzee(0);
    private final zzdy zzd = new zzdy(4096);
    private final SparseArray zzc = new SparseArray();
    private final zzagv zze = new zzagv();

    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzyt r17, com.google.android.gms.internal.ads.zzzs r18) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagy.zza(com.google.android.gms.internal.ads.zzyt, com.google.android.gms.internal.ads.zzzs):int");
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzk = zzyvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 != r7) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[LOOP:0: B:14:0x002c->B:16:0x0034, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzee r5 = r4.zzb
            long r0 = r5.zze()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.zzc()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.zzf(r7)
        L24:
            com.google.android.gms.internal.ads.zzagu r5 = r4.zzj
            r6 = 0
            if (r5 == 0) goto L2c
            r5.zzd(r7)
        L2c:
            android.util.SparseArray r5 = r4.zzc
            int r5 = r5.size()
            if (r6 >= r5) goto L42
            android.util.SparseArray r5 = r4.zzc
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.zzagx r5 = (com.google.android.gms.internal.ads.zzagx) r5
            r5.zzb()
            int r6 = r6 + 1
            goto L2c
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagy.zzc(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) {
        byte[] bArr = new byte[14];
        zzym zzymVar = (zzym) zzytVar;
        zzymVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            zzymVar.zzl(bArr[13] & 7, false);
            zzymVar.zzm(bArr, 0, 3, false);
            return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
        }
        return false;
    }
}
