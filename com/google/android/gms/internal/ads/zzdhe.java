package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdhe {
    private final Set zza;
    private final Set zzb;
    private final Set zzc;
    private final Set zzd;
    private final Set zze;
    private final Set zzf;
    private final Set zzg;
    private final Set zzh;
    private final Set zzi;
    private final Set zzj;
    private final Set zzk;
    private final Set zzl;
    private final Set zzm;
    private final Set zzn;
    private final zzeys zzo;
    private zzdbu zzp;
    private zzeil zzq;

    public /* synthetic */ zzdhe(zzdhc zzdhcVar, zzdhd zzdhdVar) {
        this.zza = zzdhc.zzp(zzdhcVar);
        this.zzb = zzdhc.zzC(zzdhcVar);
        this.zzd = zzdhc.zzs(zzdhcVar);
        this.zze = zzdhc.zzx(zzdhcVar);
        this.zzc = zzdhc.zzt(zzdhcVar);
        this.zzf = zzdhc.zzu(zzdhcVar);
        this.zzg = zzdhc.zzv(zzdhcVar);
        this.zzh = zzdhc.zzq(zzdhcVar);
        this.zzi = zzdhc.zzr(zzdhcVar);
        this.zzj = zzdhc.zzw(zzdhcVar);
        this.zzk = zzdhc.zzB(zzdhcVar);
        this.zzl = zzdhc.zzz(zzdhcVar);
        this.zzo = zzdhc.zzo(zzdhcVar);
        this.zzm = zzdhc.zzy(zzdhcVar);
        this.zzn = zzdhc.zzA(zzdhcVar);
    }

    public final zzdbu zza(Set set) {
        if (this.zzp == null) {
            this.zzp = new zzdbu(set);
        }
        return this.zzp;
    }

    public final zzeil zzb(Clock clock, zzeim zzeimVar, zzefd zzefdVar, zzfig zzfigVar) {
        if (this.zzq == null) {
            this.zzq = new zzeil(clock, zzeimVar, zzefdVar, zzfigVar);
        }
        return this.zzq;
    }

    public final zzeys zzc() {
        return this.zzo;
    }

    public final Set zzd() {
        return this.zzm;
    }

    public final Set zze() {
        return this.zza;
    }

    public final Set zzf() {
        return this.zzh;
    }

    public final Set zzg() {
        return this.zzi;
    }

    public final Set zzh() {
        return this.zzd;
    }

    public final Set zzi() {
        return this.zzc;
    }

    public final Set zzj() {
        return this.zzf;
    }

    public final Set zzk() {
        return this.zzg;
    }

    public final Set zzl() {
        return this.zzj;
    }

    public final Set zzm() {
        return this.zze;
    }

    public final Set zzn() {
        return this.zzl;
    }

    public final Set zzo() {
        return this.zzn;
    }

    public final Set zzp() {
        return this.zzk;
    }

    public final Set zzq() {
        return this.zzb;
    }
}
