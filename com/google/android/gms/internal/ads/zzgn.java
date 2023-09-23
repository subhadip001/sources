package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgn {
    public final String zza;
    public final zzad zzb;
    public final zzad zzc;
    public final int zzd;
    public final int zze;

    public zzgn(String str, zzad zzadVar, zzad zzadVar2, int i2, int i3) {
        boolean z = false;
        if (i2 != 0) {
            i3 = i3 == 0 ? 0 : i3;
            zzcw.zzd(z);
            zzcw.zzc(str);
            this.zza = str;
            Objects.requireNonNull(zzadVar);
            this.zzb = zzadVar;
            Objects.requireNonNull(zzadVar2);
            this.zzc = zzadVar2;
            this.zzd = i2;
            this.zze = i3;
        }
        z = true;
        zzcw.zzd(z);
        zzcw.zzc(str);
        this.zza = str;
        Objects.requireNonNull(zzadVar);
        this.zzb = zzadVar;
        Objects.requireNonNull(zzadVar2);
        this.zzc = zzadVar2;
        this.zzd = i2;
        this.zze = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzgn.class == obj.getClass()) {
            zzgn zzgnVar = (zzgn) obj;
            if (this.zzd == zzgnVar.zzd && this.zze == zzgnVar.zze && this.zza.equals(zzgnVar.zza) && this.zzb.equals(zzgnVar.zzb) && this.zzc.equals(zzgnVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int I = a.I(this.zza, (((this.zzd + 527) * 31) + this.zze) * 31, 31);
        return this.zzc.hashCode() + ((this.zzb.hashCode() + I) * 31);
    }
}
