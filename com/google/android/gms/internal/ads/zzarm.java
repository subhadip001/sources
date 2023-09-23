package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzarm {
    public final zzawy zza;
    public final Object zzb;
    public final int zzc;
    public final zzaxk[] zzd;
    public final boolean[] zze;
    public final long zzf;
    public int zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public zzarm zzl;
    public zzaye zzm;
    private final zzarx[] zzn;
    private final zzary[] zzo;
    private final zzayd zzp;
    private final zzaxa zzq;
    private zzaye zzr;
    private final zzcio zzs;

    public zzarm(zzarx[] zzarxVarArr, zzary[] zzaryVarArr, long j2, zzayd zzaydVar, zzcio zzcioVar, zzaxa zzaxaVar, Object obj, int i2, int i3, boolean z, long j3, byte[] bArr) {
        this.zzn = zzarxVarArr;
        this.zzo = zzaryVarArr;
        this.zzf = j2;
        this.zzp = zzaydVar;
        this.zzs = zzcioVar;
        this.zzq = zzaxaVar;
        Objects.requireNonNull(obj);
        this.zzb = obj;
        this.zzc = i2;
        this.zzg = i3;
        this.zzi = z;
        this.zzh = j3;
        this.zzd = new zzaxk[2];
        this.zze = new boolean[2];
        this.zza = zzaxaVar.zze(i3, zzcioVar.zzl());
    }

    public final long zza(long j2, boolean z) {
        return zzb(j2, false, new boolean[2]);
    }

    public final long zzb(long j2, boolean z, boolean[] zArr) {
        zzayb zzaybVar = this.zzm.zzb;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= 2) {
                break;
            }
            boolean[] zArr2 = this.zze;
            if (z || !this.zzm.zza(this.zzr, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        long zzB = this.zza.zzB(zzaybVar.zzb(), this.zze, this.zzd, zArr, j2);
        this.zzr = this.zzm;
        this.zzk = false;
        int i3 = 0;
        while (true) {
            zzaxk[] zzaxkVarArr = this.zzd;
            if (i3 >= 2) {
                this.zzs.zzd(this.zzn, this.zzm.zza, zzaybVar);
                return zzB;
            }
            if (zzaxkVarArr[i3] != null) {
                zzayy.zze(zzaybVar.zza(i3) != null);
                this.zzk = true;
            } else {
                zzayy.zze(zzaybVar.zza(i3) == null);
            }
            i3++;
        }
    }

    public final void zzc() {
        try {
            this.zzq.zzc(this.zza);
        } catch (RuntimeException e2) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e2);
        }
    }

    public final boolean zzd() {
        return this.zzj && (!this.zzk || this.zza.zzg() == Long.MIN_VALUE);
    }

    public final boolean zze() {
        zzaye zzc = this.zzp.zzc(this.zzo, this.zza.zzn());
        zzaye zzayeVar = this.zzr;
        if (zzayeVar != null) {
            for (int i2 = 0; i2 < 2; i2++) {
                if (zzc.zza(zzayeVar, i2)) {
                }
            }
            return false;
        }
        this.zzm = zzc;
        return true;
    }
}
