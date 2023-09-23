package com.google.android.gms.internal.ads;

import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzauh {
    private final byte[] zza = new byte[8];
    private final Stack zzb = new Stack();
    private final zzaup zzc = new zzaup();
    private int zzd;
    private int zze;
    private long zzf;
    private zzauk zzg;

    private final long zzd(zzatu zzatuVar, int i2) {
        zzatuVar.zzh(this.zza, 0, i2, false);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (this.zza[i3] & 255);
        }
        return j2;
    }

    public final void zza() {
        this.zzd = 0;
        this.zzb.clear();
        this.zzc.zzd();
    }

    public final void zzb(zzauk zzaukVar) {
        this.zzg = zzaukVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (r0 == 1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzatu r13) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzauh.zzc(com.google.android.gms.internal.ads.zzatu):boolean");
    }
}
