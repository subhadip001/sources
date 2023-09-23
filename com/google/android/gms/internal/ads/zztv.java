package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zztv extends zzci {
    private static final Object zzc = new Object();
    private static final zzbb zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;
    private final zzbb zzh;
    private final zzau zzi;

    static {
        zzah zzahVar = new zzah();
        zzahVar.zza("SinglePeriodTimeline");
        zzahVar.zzb(Uri.EMPTY);
        zzd = zzahVar.zzc();
    }

    public zztv(long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z, boolean z2, boolean z3, Object obj, zzbb zzbbVar, zzau zzauVar) {
        this.zze = j5;
        this.zzf = j6;
        this.zzg = z;
        this.zzh = zzbbVar;
        this.zzi = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zza(Object obj) {
        return zzc.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzcf zzd(int i2, zzcf zzcfVar, boolean z) {
        zzcw.zza(i2, 0, 1);
        zzcfVar.zzk(null, z ? zzc : null, 0, this.zze, 0L, zzd.zza, false);
        return zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzch zze(int i2, zzch zzchVar, long j2) {
        zzcw.zza(i2, 0, 1);
        zzchVar.zza(zzch.zza, this.zzh, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zzg, false, this.zzi, 0L, this.zzf, 0, 0, 0L);
        return zzchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final Object zzf(int i2) {
        zzcw.zza(i2, 0, 1);
        return zzc;
    }
}
