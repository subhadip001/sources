package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzelj extends com.google.android.gms.ads.internal.client.zzbr implements zzdei {
    private final Context zza;
    private final zzexq zzb;
    private final String zzc;
    private final zzemc zzd;
    private com.google.android.gms.ads.internal.client.zzq zze;
    private final zzfbw zzf;
    private final zzcfo zzg;
    private zzcvu zzh;

    public zzelj(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzexq zzexqVar, zzemc zzemcVar, zzcfo zzcfoVar) {
        this.zza = context;
        this.zzb = zzexqVar;
        this.zze = zzqVar;
        this.zzc = str;
        this.zzd = zzemcVar;
        this.zzf = zzexqVar.zzi();
        this.zzg = zzcfoVar;
        zzexqVar.zzp(this);
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzf.zzr(zzqVar);
        this.zzf.zzw(this.zze.zzn);
    }

    private final synchronized boolean zzf(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (zzh()) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zza) && zzlVar.zzs == null) {
            zzcfi.zzg("Failed to load the ad because app ID is missing.");
            zzemc zzemcVar = this.zzd;
            if (zzemcVar != null) {
                zzemcVar.zza(zzfcx.zzd(4, null, null));
            }
            return false;
        }
        zzfcs.zza(this.zza, zzlVar.zzf);
        return this.zzb.zzb(zzlVar, this.zzc, null, new zzeli(this));
    }

    private final boolean zzh() {
        boolean z;
        if (((Boolean) zzbjm.zze.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zziq)).booleanValue()) {
                z = true;
                return this.zzg.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzir)).intValue() || !z;
            }
        }
        z = false;
        if (this.zzg.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzir)).intValue()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzA() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcvu zzcvuVar = this.zzh;
        if (zzcvuVar != null) {
            zzcvuVar.zzg();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzcvu zzcvuVar = this.zzh;
        if (zzcvuVar != null) {
            zzcvuVar.zzm().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzo(zzbcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zze(zzbfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzr(zzqVar);
        this.zze = zzqVar;
        zzcvu zzcvuVar = this.zzh;
        if (zzcvuVar != null) {
            zzcvuVar.zzh(this.zzb.zzd(), zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzi(zzbzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbci zzbciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbyd zzbydVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzN(boolean z) {
        if (zzh()) {
            Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzy(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzO(zzbit zzbitVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzq(zzbitVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        this.zzd.zzh(zzdeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbyg zzbygVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcaq zzcaqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzfg zzfgVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzF(zzfgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzY() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zza() {
        if (this.zzb.zzr()) {
            com.google.android.gms.ads.internal.client.zzq zzg = this.zzf.zzg();
            zzcvu zzcvuVar = this.zzh;
            if (zzcvuVar != null && zzcvuVar.zzf() != null && this.zzf.zzO()) {
                zzg = zzfcc.zza(this.zza, Collections.singletonList(this.zzh.zzf()));
            }
            zze(zzg);
            try {
                zzf(this.zzf.zze());
                return;
            } catch (RemoteException unused) {
                zzcfi.zzj("Failed to refresh the banner ad.");
                return;
            }
        }
        this.zzb.zzn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zze(this.zze);
        return zzf(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzQ(zzcdVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcvu zzcvuVar = this.zzh;
        if (zzcvuVar != null) {
            return zzfcc.zza(this.zza, Collections.singletonList(zzcvuVar.zze()));
        }
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbf zzi() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbz zzj() {
        return this.zzd.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdh zzk() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfJ)).booleanValue()) {
            zzcvu zzcvuVar = this.zzh;
            if (zzcvuVar == null) {
                return null;
            }
            return zzcvuVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdk zzl() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcvu zzcvuVar = this.zzh;
        if (zzcvuVar != null) {
            return zzcvuVar.zzd();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        if (zzh()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzr() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzs() {
        zzcvu zzcvuVar = this.zzh;
        if (zzcvuVar == null || zzcvuVar.zzl() == null) {
            return null;
        }
        return zzcvuVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzt() {
        zzcvu zzcvuVar = this.zzh;
        if (zzcvuVar == null || zzcvuVar.zzl() == null) {
            return null;
        }
        return zzcvuVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcvu zzcvuVar = this.zzh;
        if (zzcvuVar != null) {
            zzcvuVar.zzV();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzcvu zzcvuVar = this.zzh;
        if (zzcvuVar != null) {
            zzcvuVar.zzm().zzb(null);
        }
    }
}
