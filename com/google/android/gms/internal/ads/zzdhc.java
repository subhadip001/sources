package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdhc {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzeys zzo;

    public final zzdhc zza(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdiy(zzaVar, executor));
        return this;
    }

    public final zzdhc zzb(zzdbv zzdbvVar, Executor executor) {
        this.zzi.add(new zzdiy(zzdbvVar, executor));
        return this;
    }

    public final zzdhc zzc(zzdci zzdciVar, Executor executor) {
        this.zzl.add(new zzdiy(zzdciVar, executor));
        return this;
    }

    public final zzdhc zzd(zzdcm zzdcmVar, Executor executor) {
        this.zzf.add(new zzdiy(zzdcmVar, executor));
        return this;
    }

    public final zzdhc zze(zzdbs zzdbsVar, Executor executor) {
        this.zze.add(new zzdiy(zzdbsVar, executor));
        return this;
    }

    public final zzdhc zzf(zzddg zzddgVar, Executor executor) {
        this.zzh.add(new zzdiy(zzddgVar, executor));
        return this;
    }

    public final zzdhc zzg(zzddr zzddrVar, Executor executor) {
        this.zzg.add(new zzdiy(zzddrVar, executor));
        return this;
    }

    public final zzdhc zzh(com.google.android.gms.ads.internal.overlay.zzo zzoVar, Executor executor) {
        this.zzn.add(new zzdiy(zzoVar, executor));
        return this;
    }

    public final zzdhc zzi(zzded zzdedVar, Executor executor) {
        this.zzm.add(new zzdiy(zzdedVar, executor));
        return this;
    }

    public final zzdhc zzj(zzden zzdenVar, Executor executor) {
        this.zzb.add(new zzdiy(zzdenVar, executor));
        return this;
    }

    public final zzdhc zzk(zzarb zzarbVar, Executor executor) {
        this.zzk.add(new zzdiy(zzarbVar, executor));
        return this;
    }

    public final zzdhc zzl(zzdjf zzdjfVar, Executor executor) {
        this.zzd.add(new zzdiy(zzdjfVar, executor));
        return this;
    }

    public final zzdhc zzm(zzeys zzeysVar) {
        this.zzo = zzeysVar;
        return this;
    }

    public final zzdhe zzn() {
        return new zzdhe(this, null);
    }
}
