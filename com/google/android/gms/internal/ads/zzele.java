package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzele extends com.google.android.gms.ads.internal.client.zzbr {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzbf zzb;
    private final zzfby zzc;
    private final zzcvu zzd;
    private final ViewGroup zze;

    public zzele(Context context, com.google.android.gms.ads.internal.client.zzbf zzbfVar, zzfby zzfbyVar, zzcvu zzcvuVar) {
        this.zza = context;
        this.zzb = zzbfVar;
        this.zzc = zzfbyVar;
        this.zzd = zzcvuVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View zzc = zzcvuVar.zzc();
        com.google.android.gms.ads.internal.zzt.zzp();
        frameLayout.addView(zzc, com.google.android.gms.ads.internal.util.zzs.zzn());
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.zze = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzA() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzB() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzc(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
        zzcfi.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        zzcfi.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        zzcfi.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcvu zzcvuVar = this.zzd;
        if (zzcvuVar != null) {
            zzcvuVar.zzh(this.zze, zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
        zzemc zzemcVar = this.zzc.zzc;
        if (zzemcVar != null) {
            zzemcVar.zzi(zzbzVar);
        }
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
    public final void zzN(boolean z) {
        zzcfi.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzO(zzbit zzbitVar) {
        zzcfi.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        zzcfi.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
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
    public final void zzU(com.google.android.gms.ads.internal.client.zzfg zzfgVar) {
        zzcfi.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzcfi.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzab(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
        zzcfi.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        zzcfi.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzfcc.zza(this.zza, Collections.singletonList(this.zzd.zze()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbf zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbz zzj() {
        return this.zzc.zzn;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzdh zzk() {
        return this.zzd.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzdk zzl() {
        return this.zzd.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        return ObjectWrapper.wrap(this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzr() {
        return this.zzc.zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzs() {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzt() {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzV();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzz() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzb(null);
    }
}
