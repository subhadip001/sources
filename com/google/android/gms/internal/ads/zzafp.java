package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzafp implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzafo
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzafp.zza;
            return new zzys[]{new zzafp()};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private final zzafq zzb = new zzafq(null);
    private final zzdy zzc = new zzdy(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzys
    public final int zza(zzyt zzytVar, zzzs zzzsVar) {
        int zza2 = zzytVar.zza(this.zzc.zzH(), 0, 2786);
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
        if ((r5 - r3) >= 8192) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
        r9.zzj();
        r5 = r5 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzd(com.google.android.gms.internal.ads.zzyt r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzdy r0 = new com.google.android.gms.internal.ads.zzdy
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.zzH()
            r5 = r9
            com.google.android.gms.internal.ads.zzym r5 = (com.google.android.gms.internal.ads.zzym) r5
            r5.zzm(r4, r2, r1, r2)
            r0.zzF(r2)
            int r4 = r0.zzm()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L65
            r9.zzj()
            r4 = r9
            com.google.android.gms.internal.ads.zzym r4 = (com.google.android.gms.internal.ads.zzym) r4
            r4.zzl(r3, r2)
            r5 = r3
        L29:
            r1 = 0
        L2a:
            byte[] r6 = r0.zzH()
            r7 = 6
            r4.zzm(r6, r2, r7, r2)
            r0.zzF(r2)
            int r6 = r0.zzo()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L4d
            r9.zzj()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.148E-41)
            if (r1 >= r6) goto L4c
            r4.zzl(r5, r2)
            goto L29
        L4c:
            return r2
        L4d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L53
            return r6
        L53:
            byte[] r6 = r0.zzH()
            int r6 = com.google.android.gms.internal.ads.zzxx.zzb(r6)
            r7 = -1
            if (r6 != r7) goto L5f
            return r2
        L5f:
            int r6 = r6 + (-6)
            r4.zzl(r6, r2)
            goto L2a
        L65:
            r4 = 3
            r0.zzG(r4)
            int r4 = r0.zzj()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzl(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafp.zzd(com.google.android.gms.internal.ads.zzyt):boolean");
    }
}
