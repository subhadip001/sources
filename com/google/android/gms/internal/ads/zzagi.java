package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzagi {
    private final zzzz zza;
    private final zzzr zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final zzagh zzi = new zzagh(null);
    private final zzagh zzj = new zzagh(null);
    private boolean zzk = false;

    public zzagi(zzzz zzzzVar, boolean z, boolean z2) {
        this.zza = zzzzVar;
        byte[] bArr = new byte[128];
        this.zze = bArr;
        this.zzd = new zzzr(bArr, 0, 0);
    }

    public final void zza(zzzn zzznVar) {
        this.zzc.append(zzznVar.zza, zzznVar);
    }

    public final void zzb(zzzo zzzoVar) {
        this.zzb.append(zzzoVar.zzd, zzzoVar);
    }

    public final void zzc() {
        this.zzk = false;
    }

    public final void zzd(long j2, int i2, long j3) {
        this.zzf = i2;
        this.zzh = j3;
        this.zzg = j2;
    }

    public final boolean zze(long j2, int i2, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.zzf == 9) {
            if (z && this.zzk) {
                long j3 = this.zzg;
                int i3 = i2 + ((int) (j2 - j3));
                long j4 = this.zzm;
                if (j4 != -9223372036854775807L) {
                    boolean z4 = this.zzn;
                    long j5 = this.zzl;
                    this.zza.zzs(j4, z4 ? 1 : 0, (int) (j3 - j5), i3, null);
                }
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z5 = this.zzn;
        int i4 = this.zzf;
        if (i4 == 5 || (z2 && i4 == 1)) {
            z3 = true;
        }
        boolean z6 = z5 | z3;
        this.zzn = z6;
        return z6;
    }
}
