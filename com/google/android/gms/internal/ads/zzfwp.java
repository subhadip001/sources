package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfwp {
    private final zzgfm zza;

    private zzfwp(zzgfm zzgfmVar) {
        this.zza = zzgfmVar;
    }

    public static zzfwp zze(String str, byte[] bArr, int i2) {
        zzgfl zza = zzgfm.zza();
        zza.zza(str);
        zza.zzb(zzgjg.zzv(bArr));
        int i3 = i2 - 1;
        zza.zzc(i3 != 0 ? i3 != 1 ? 5 : 4 : 3);
        return new zzfwp((zzgfm) zza.zzaj());
    }

    public final zzgfm zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zza.zzf();
    }

    public final byte[] zzc() {
        return this.zza.zze().zzE();
    }

    public final int zzd() {
        int zzi = this.zza.zzi() - 2;
        int i2 = 1;
        if (zzi != 1) {
            i2 = 2;
            if (zzi != 2) {
                i2 = 3;
                if (zzi != 3) {
                    if (zzi == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i2;
    }
}
