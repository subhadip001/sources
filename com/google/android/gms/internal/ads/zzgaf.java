package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgaf {
    public static zzgaa zza(zzgey zzgeyVar) {
        if (zzgeyVar.zze() == 3) {
            return new zzfzx(16);
        }
        if (zzgeyVar.zze() == 4) {
            return new zzfzx(32);
        }
        if (zzgeyVar.zze() == 5) {
            return new zzfzy();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static zzfzz zzb(zzgey zzgeyVar) {
        if (zzgeyVar.zzf() == 3) {
            return new zzfzz("HmacSha256");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    public static zzgam zzc(zzgey zzgeyVar) {
        if (zzgeyVar.zzg() == 3) {
            return new zzgam(new zzfzz("HmacSha256"));
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }
}
