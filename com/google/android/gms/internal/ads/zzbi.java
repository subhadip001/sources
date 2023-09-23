package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzbi {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzbi(zzbi zzbiVar) {
        this.zza = zzbiVar.zza;
        this.zzb = zzbiVar.zzb;
        this.zzc = zzbiVar.zzc;
        this.zzd = zzbiVar.zzd;
        this.zze = zzbiVar.zze;
    }

    public zzbi(Object obj, int i2, int i3, long j2) {
        this(obj, i2, i3, j2, -1);
    }

    private zzbi(Object obj, int i2, int i3, long j2, int i4) {
        this.zza = obj;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j2;
        this.zze = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbi) {
            zzbi zzbiVar = (zzbi) obj;
            return this.zza.equals(zzbiVar.zza) && this.zzb == zzbiVar.zzb && this.zzc == zzbiVar.zzc && this.zzd == zzbiVar.zzd && this.zze == zzbiVar.zze;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzbi zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzbi(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzbi(Object obj, long j2) {
        this(obj, -1, -1, j2, -1);
    }

    public zzbi(Object obj, long j2, int i2) {
        this(obj, -1, -1, j2, i2);
    }
}
