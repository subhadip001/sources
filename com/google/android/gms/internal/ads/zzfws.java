package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfws {
    private final zzgfr zza;

    private zzfws(zzgfr zzgfrVar) {
        this.zza = zzgfrVar;
    }

    public static zzfws zzd() {
        return new zzfws(zzgfu.zzd());
    }

    private final synchronized int zze() {
        int zza;
        zza = zzgat.zza();
        while (zzg(zza)) {
            zza = zzgat.zza();
        }
        return zza;
    }

    private final synchronized zzgft zzf(zzgfm zzgfmVar) {
        return zzh(zzfxi.zzc(zzgfmVar), zzgfmVar.zzi());
    }

    private final synchronized boolean zzg(int i2) {
        boolean z;
        Iterator it = this.zza.zzc().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((zzgft) it.next()).zza() == i2) {
                z = true;
                break;
            }
        }
        return z;
    }

    private final synchronized zzgft zzh(zzgfh zzgfhVar, int i2) {
        zzgfs zzd;
        int zze = zze();
        if (i2 != 2) {
            zzd = zzgft.zzd();
            zzd.zza(zzgfhVar);
            zzd.zzb(zze);
            zzd.zzd(3);
            zzd.zzc(i2);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zzgft) zzd.zzaj();
    }

    @Deprecated
    public final synchronized int zza(zzgfm zzgfmVar, boolean z) {
        zzgft zzf;
        zzf = zzf(zzgfmVar);
        this.zza.zza(zzf);
        this.zza.zzb(zzf.zza());
        return zzf.zza();
    }

    public final synchronized zzfwr zzb() {
        return zzfwr.zza((zzgfu) this.zza.zzaj());
    }

    @Deprecated
    public final synchronized zzfws zzc(zzgfm zzgfmVar) {
        zza(zzgfmVar, true);
        return this;
    }
}
