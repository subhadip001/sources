package com.google.android.gms.internal.ads;

import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfel {
    private final long zza;
    private long zzc;
    private final zzfek zzb = new zzfek();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfel() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
        this.zza = currentTimeMillis;
        this.zzc = currentTimeMillis;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfek zzd() {
        zzfek clone = this.zzb.clone();
        zzfek zzfekVar = this.zzb;
        zzfekVar.zza = false;
        zzfekVar.zzb = 0;
        return clone;
    }

    public final String zze() {
        StringBuilder A = a.A("Created: ");
        A.append(this.zza);
        A.append(" Last accessed: ");
        A.append(this.zzc);
        A.append(" Accesses: ");
        A.append(this.zzd);
        A.append("\nEntries retrieved: Valid: ");
        A.append(this.zze);
        A.append(" Stale: ");
        A.append(this.zzf);
        return A.toString();
    }

    public final void zzf() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}
