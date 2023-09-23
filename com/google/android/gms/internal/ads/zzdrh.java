package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdrh extends zzblq {
    private final String zza;
    private final zzdnb zzb;
    private final zzdng zzc;

    public zzdrh(String str, zzdnb zzdnbVar, zzdng zzdngVar) {
        this.zza = str;
        this.zzb = zzdnbVar;
        this.zzc = zzdngVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final Bundle zzb() {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final com.google.android.gms.ads.internal.client.zzdk zzc() {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final zzbks zzd() {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final zzbla zze() {
        return this.zzc.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final IObjectWrapper zzf() {
        return this.zzc.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final IObjectWrapper zzg() {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final String zzh() {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final String zzi() {
        return this.zzc.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final String zzj() {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final String zzk() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final String zzl() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final List zzm() {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzn() {
        this.zzb.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzo(Bundle bundle) {
        this.zzb.zzz(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzp(Bundle bundle) {
        this.zzb.zzE(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final boolean zzq(Bundle bundle) {
        return this.zzb.zzQ(bundle);
    }
}
