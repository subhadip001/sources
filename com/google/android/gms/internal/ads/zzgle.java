package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzgle {
    private static final zzgka zzb = zzgka.zza();
    public volatile zzgly zza;
    private volatile zzgjg zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgle) {
            zzgle zzgleVar = (zzgle) obj;
            zzgly zzglyVar = this.zza;
            zzgly zzglyVar2 = zzgleVar.zza;
            if (zzglyVar == null && zzglyVar2 == null) {
                return zzb().equals(zzgleVar.zzb());
            }
            if (zzglyVar == null || zzglyVar2 == null) {
                if (zzglyVar != null) {
                    zzgleVar.zzc(zzglyVar.zzbh());
                    return zzglyVar.equals(zzgleVar.zza);
                }
                zzc(zzglyVar2.zzbh());
                return this.zza.equals(zzglyVar2);
            }
            return zzglyVar.equals(zzglyVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgjc) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzav();
        }
        return 0;
    }

    public final zzgjg zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzgjg.zzb;
            } else {
                this.zzc = this.zza.zzaq();
            }
            return this.zzc;
        }
    }

    public final void zzc(zzgly zzglyVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzglyVar;
                    this.zzc = zzgjg.zzb;
                } catch (zzgla unused) {
                    this.zza = zzglyVar;
                    this.zzc = zzgjg.zzb;
                }
            }
        }
    }
}
