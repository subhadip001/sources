package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzada implements zzadc {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzadj zzc = new zzadj();
    private zzadb zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzyt zzytVar, int i2) {
        ((zzym) zzytVar).zzn(this.zza, 0, i2, false);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (this.zza[i3] & 255);
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final void zza(zzadb zzadbVar) {
        this.zzd = zzadbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r0 == 1) goto L29;
     */
    @Override // com.google.android.gms.internal.ads.zzadc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzyt r14) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzada.zzc(com.google.android.gms.internal.ads.zzyt):boolean");
    }
}
