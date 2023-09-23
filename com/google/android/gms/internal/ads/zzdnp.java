package com.google.android.gms.internal.ads;

import e.f.h;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdnp {
    public zzbmb zza;
    public zzbly zzb;
    public zzbmo zzc;
    public zzbml zzd;
    public zzbra zze;
    public final h zzf = new h();
    public final h zzg = new h();

    public final zzdnp zza(zzbly zzblyVar) {
        this.zzb = zzblyVar;
        return this;
    }

    public final zzdnp zzb(zzbmb zzbmbVar) {
        this.zza = zzbmbVar;
        return this;
    }

    public final zzdnp zzc(String str, zzbmh zzbmhVar, zzbme zzbmeVar) {
        this.zzf.put(str, zzbmhVar);
        if (zzbmeVar != null) {
            this.zzg.put(str, zzbmeVar);
        }
        return this;
    }

    public final zzdnp zzd(zzbra zzbraVar) {
        this.zze = zzbraVar;
        return this;
    }

    public final zzdnp zze(zzbml zzbmlVar) {
        this.zzd = zzbmlVar;
        return this;
    }

    public final zzdnp zzf(zzbmo zzbmoVar) {
        this.zzc = zzbmoVar;
        return this;
    }

    public final zzdnr zzg() {
        return new zzdnr(this);
    }
}
