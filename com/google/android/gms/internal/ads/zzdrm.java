package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdrm extends zzbmw {
    private final String zza;
    private final zzdnb zzb;
    private final zzdng zzc;

    public zzdrm(String str, zzdnb zzdnbVar, zzdng zzdngVar) {
        this.zza = str;
        this.zzb = zzdnbVar;
        this.zzc = zzdngVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzA() {
        this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzB(Bundle bundle) {
        this.zzb.zzE(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzC() {
        this.zzb.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzD(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        this.zzb.zzH(zzcqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzE(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zzb.zzI(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzF(zzbmu zzbmuVar) {
        this.zzb.zzJ(zzbmuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final boolean zzG() {
        return this.zzb.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final boolean zzH() {
        return (this.zzc.zzF().isEmpty() || this.zzc.zzk() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final boolean zzI(Bundle bundle) {
        return this.zzb.zzQ(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final double zze() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final Bundle zzf() {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final com.google.android.gms.ads.internal.client.zzdh zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfJ)).booleanValue()) {
            return this.zzb.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final zzbks zzi() {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final zzbkx zzj() {
        return this.zzb.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final zzbla zzk() {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final IObjectWrapper zzl() {
        return this.zzc.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzn() {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzo() {
        return this.zzc.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzp() {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzq() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzr() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzs() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final String zzt() {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final List zzu() {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final List zzv() {
        if (zzH()) {
            return this.zzc.zzF();
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzw() {
        this.zzb.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzx() {
        this.zzb.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzy(com.google.android.gms.ads.internal.client.zzcu zzcuVar) {
        this.zzb.zzw(zzcuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzz(Bundle bundle) {
        this.zzb.zzz(bundle);
    }
}
