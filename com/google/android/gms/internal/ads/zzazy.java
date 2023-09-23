package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzazy {
    private final zzazx zza;
    private final boolean zzb;
    private final long zzc;
    private final long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private long zzk;

    public zzazy() {
        this(-1.0d);
    }

    private final boolean zzd(long j2, long j3) {
        return Math.abs((j3 - this.zzi) - (j2 - this.zzj)) > 20000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zza(long r10, long r12) {
        /*
            r9 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r10
            boolean r2 = r9.zzh
            if (r2 == 0) goto L42
            long r2 = r9.zze
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 == 0) goto L19
            long r2 = r9.zzk
            r4 = 1
            long r2 = r2 + r4
            r9.zzk = r2
            long r2 = r9.zzg
            r9.zzf = r2
        L19:
            long r2 = r9.zzk
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L3a
            long r4 = r9.zzj
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r9.zzf
            long r2 = r2 + r4
            boolean r4 = r9.zzd(r2, r12)
            if (r4 == 0) goto L33
            r9.zzh = r6
            goto L42
        L33:
            long r4 = r9.zzi
            long r4 = r4 + r2
            long r6 = r9.zzj
            long r4 = r4 - r6
            goto L44
        L3a:
            boolean r2 = r9.zzd(r0, r12)
            if (r2 == 0) goto L42
            r9.zzh = r6
        L42:
            r4 = r12
            r2 = r0
        L44:
            boolean r6 = r9.zzh
            r7 = 0
            if (r6 != 0) goto L53
            r9.zzj = r0
            r9.zzi = r12
            r9.zzk = r7
            r12 = 1
            r9.zzh = r12
        L53:
            r9.zze = r10
            r9.zzg = r2
            com.google.android.gms.internal.ads.zzazx r10 = r9.zza
            if (r10 == 0) goto L85
            long r10 = r10.zza
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 != 0) goto L62
            goto L85
        L62:
            com.google.android.gms.internal.ads.zzazx r10 = r9.zza
            long r10 = r10.zza
            long r12 = r9.zzc
            long r0 = r4 - r10
            long r0 = r0 / r12
            long r0 = r0 * r12
            long r0 = r0 + r10
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 > 0) goto L75
            long r10 = r0 - r12
            goto L78
        L75:
            long r12 = r12 + r0
            r10 = r0
            r0 = r12
        L78:
            long r12 = r0 - r4
            long r4 = r4 - r10
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 >= 0) goto L80
            goto L81
        L80:
            r0 = r10
        L81:
            long r10 = r9.zzd
            long r0 = r0 - r10
            return r0
        L85:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazy.zza(long, long):long");
    }

    public final void zzb() {
        if (this.zzb) {
            this.zza.zzc();
        }
    }

    public final void zzc() {
        this.zzh = false;
        if (this.zzb) {
            this.zza.zzb();
        }
    }

    private zzazy(double d2) {
        long j2;
        boolean z = d2 != -1.0d;
        this.zzb = z;
        if (z) {
            this.zza = zzazx.zza();
            long j3 = (long) (1.0E9d / d2);
            this.zzc = j3;
            j2 = (j3 * 80) / 100;
        } else {
            this.zza = null;
            j2 = -1;
            this.zzc = -1L;
        }
        this.zzd = j2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzazy(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r0 = r3.getDefaultDisplay()
            if (r0 == 0) goto L18
            android.view.Display r3 = r3.getDefaultDisplay()
            float r3 = r3.getRefreshRate()
            double r0 = (double) r3
            goto L1a
        L18:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L1a:
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazy.<init>(android.content.Context):void");
    }
}
