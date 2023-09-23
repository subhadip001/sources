package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcv {
    public static final zzcv zza = new zzcv(0, 0, 0, 1.0f);
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zzcu
    };
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;

    public zzcv(int i2, int i3, int i4, float f2) {
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcv) {
            zzcv zzcvVar = (zzcv) obj;
            if (this.zzc == zzcvVar.zzc && this.zzd == zzcvVar.zzd && this.zze == zzcvVar.zze && this.zzf == zzcvVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.zzf) + ((((((this.zzc + 217) * 31) + this.zzd) * 31) + this.zze) * 31);
    }
}
