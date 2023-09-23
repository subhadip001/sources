package com.google.android.gms.internal.ads;

import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfdq {
    private final zzfdp zza = new zzfdp();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final zzfdp zza() {
        zzfdp clone = this.zza.clone();
        zzfdp zzfdpVar = this.zza;
        zzfdpVar.zza = false;
        zzfdpVar.zzb = false;
        return clone;
    }

    public final String zzb() {
        StringBuilder A = a.A("\n\tPool does not exist: ");
        A.append(this.zzd);
        A.append("\n\tNew pools created: ");
        A.append(this.zzb);
        A.append("\n\tPools removed: ");
        A.append(this.zzc);
        A.append("\n\tEntries added: ");
        A.append(this.zzf);
        A.append("\n\tNo entries retrieved: ");
        return a.t(A, this.zze, "\n");
    }

    public final void zzc() {
        this.zzf++;
    }

    public final void zzd() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zze() {
        this.zze++;
    }

    public final void zzf() {
        this.zzd++;
    }

    public final void zzg() {
        this.zzc++;
        this.zza.zzb = true;
    }
}
