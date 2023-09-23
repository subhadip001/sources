package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzavd {
    public final zzavm zza = new zzavm();
    public final zzaue zzb;
    public zzavk zzc;
    public zzava zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public zzaud zzh;
    public zzavl zzi;

    public zzavd(zzaue zzaueVar) {
        this.zzb = zzaueVar;
    }

    public final void zza(zzavk zzavkVar, zzava zzavaVar) {
        Objects.requireNonNull(zzavkVar);
        this.zzc = zzavkVar;
        Objects.requireNonNull(zzavaVar);
        this.zzd = zzavaVar;
        this.zzb.zza(zzavkVar.zzf);
        zzb();
    }

    public final void zzb() {
        zzavm zzavmVar = this.zza;
        zzavmVar.zzd = 0;
        zzavmVar.zzr = 0L;
        zzavmVar.zzl = false;
        zzavmVar.zzq = false;
        zzavmVar.zzn = null;
        this.zze = 0;
        this.zzg = 0;
        this.zzf = 0;
        this.zzh = null;
        this.zzi = null;
    }
}
