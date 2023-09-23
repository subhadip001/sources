package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgfu extends zzgko implements zzglz {
    private static final zzgfu zzb;
    private int zze;
    private zzgkx zzf = zzgko.zzaH();

    static {
        zzgfu zzgfuVar = new zzgfu();
        zzb = zzgfuVar;
        zzgko.zzaN(zzgfu.class, zzgfuVar);
    }

    private zzgfu() {
    }

    public static zzgfr zzd() {
        return (zzgfr) zzb.zzaw();
    }

    public static zzgfu zzf(InputStream inputStream, zzgka zzgkaVar) {
        return (zzgfu) zzgko.zzaC(zzb, inputStream, zzgkaVar);
    }

    public static zzgfu zzg(byte[] bArr, zzgka zzgkaVar) {
        return (zzgfu) zzgko.zzaD(zzb, bArr, zzgkaVar);
    }

    public static /* synthetic */ void zzj(zzgfu zzgfuVar, zzgft zzgftVar) {
        zzgftVar.getClass();
        zzgkx zzgkxVar = zzgfuVar.zzf;
        if (!zzgkxVar.zzc()) {
            zzgfuVar.zzf = zzgko.zzaI(zzgkxVar);
        }
        zzgfuVar.zzf.add(zzgftVar);
    }

    public final int zza() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgfr(null);
                }
                return new zzgfu();
            }
            return zzgko.zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgft.class});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zze;
    }

    public final List zzh() {
        return this.zzf;
    }
}
