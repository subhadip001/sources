package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdrf extends zzblo {
    private final String zza;
    private final zzdnb zzb;
    private final zzdng zzc;

    public zzdrf(String str, zzdnb zzdnbVar, zzdng zzdngVar) {
        this.zza = str;
        this.zzb = zzdnbVar;
        this.zzc = zzdngVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final double zzb() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final Bundle zzc() {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final com.google.android.gms.ads.internal.client.zzdk zzd() {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final zzbks zze() {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final zzbla zzf() {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final IObjectWrapper zzg() {
        return this.zzc.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final String zzi() {
        return this.zzc.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final String zzj() {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final String zzk() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final String zzl() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final String zzm() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final String zzn() {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final List zzo() {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzp() {
        this.zzb.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzq(Bundle bundle) {
        this.zzb.zzz(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzr(Bundle bundle) {
        this.zzb.zzE(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final boolean zzs(Bundle bundle) {
        return this.zzb.zzQ(bundle);
    }
}
