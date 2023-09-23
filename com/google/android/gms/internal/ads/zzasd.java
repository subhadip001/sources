package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzasd {
    public static final zzasd zza = new zzasa();

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzasb zzd(int i2, zzasb zzasbVar, boolean z);

    public abstract zzasc zze(int i2, zzasc zzascVar, boolean z, long j2);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if ((zzc() - 1) == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzf(int r3, com.google.android.gms.internal.ads.zzasb r4, com.google.android.gms.internal.ads.zzasc r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.zzd(r3, r4, r0)
            r2.zzg(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L31
            r3 = -1
            if (r6 == 0) goto L22
            if (r6 == r4) goto L20
            r1 = 2
            if (r6 != r1) goto L1a
            int r6 = r2.zzc()
            int r6 = r6 + r3
            if (r6 != 0) goto L2a
            goto L20
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L20:
            r4 = 0
            goto L2a
        L22:
            int r6 = r2.zzc()
            int r6 = r6 + r3
            if (r6 != 0) goto L2a
            r4 = -1
        L2a:
            if (r4 != r3) goto L2d
            return r3
        L2d:
            r2.zzg(r4, r5, r0)
            return r0
        L31:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasd.zzf(int, com.google.android.gms.internal.ads.zzasb, com.google.android.gms.internal.ads.zzasc, int):int");
    }

    public final zzasc zzg(int i2, zzasc zzascVar, boolean z) {
        return zze(i2, zzascVar, false, 0L);
    }

    public final boolean zzh() {
        return zzc() == 0;
    }
}
