package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdl {
    public final Object zza;
    private zzw zzb = new zzw();
    private boolean zzc;
    private boolean zzd;

    public zzdl(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdl.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzdl) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i2, zzdj zzdjVar) {
        if (this.zzd) {
            return;
        }
        if (i2 != -1) {
            this.zzb.zza(i2);
        }
        this.zzc = true;
        zzdjVar.zza(this.zza);
    }

    public final void zzb(zzdk zzdkVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzy zzb = this.zzb.zzb();
        this.zzb = new zzw();
        this.zzc = false;
        zzdkVar.zza(this.zza, zzb);
    }

    public final void zzc(zzdk zzdkVar) {
        this.zzd = true;
        if (this.zzc) {
            zzdkVar.zza(this.zza, this.zzb.zzb());
        }
    }
}
