package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbuy extends zzbub {
    private final Object zza;
    private zzbva zzb;
    private zzcav zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private MediationRewardedAd zzh;
    private MediationInterscrollerAd zzi;
    private final String zzj = "";

    public zzbuy(Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzR(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle zzS(String str, com.google.android.gms.ads.internal.client.zzl zzlVar, String str2) {
        zzcfi.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString(AdMobAdapter.AD_JSON_PARAMETER, str2);
                if (zzlVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzlVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzcfi.zzh("", th);
            throw new RemoteException();
        }
    }

    private static final boolean zzT(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        return zzcfb.zzp();
    }

    private static final String zzU(String str, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzA(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzz(this.zzd, zzlVar, str, new zzbvb((Adapter) obj, this.zzc));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzcfi.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzB(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbuf zzbufVar) {
        if (this.zza instanceof Adapter) {
            zzcfi.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) this.zza).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzS(str, zzlVar, null), zzR(zzlVar), zzT(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzU(str, zzlVar), ""), new zzbux(this, zzbufVar));
                return;
            } catch (Exception e2) {
                zzcfi.zzh("", e2);
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzcfi.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzC(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzD() {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzcfi.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzE() {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzcfi.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzF(boolean z) {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                zzcfi.zzh("", th);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzcfi.zze(canonicalName + " #009 Class mismatch: " + canonicalName2);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzG() {
        if (this.zza instanceof MediationInterstitialAdapter) {
            zzcfi.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zza).showInterstitial();
                return;
            } catch (Throwable th) {
                zzcfi.zzh("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzcfi.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzH(IObjectWrapper iObjectWrapper) {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzcfi.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        } else if (obj instanceof MediationInterstitialAdapter) {
            zzG();
        } else {
            zzcfi.zze("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.zzf;
            if (mediationInterstitialAd != null) {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            } else {
                zzcfi.zzg("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzI(IObjectWrapper iObjectWrapper) {
        if (this.zza instanceof Adapter) {
            zzcfi.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.zzh;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } else {
                zzcfi.zzg("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzcfi.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzJ() {
        if (this.zza instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzh;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
                return;
            } else {
                zzcfi.zzg("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzcfi.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final boolean zzK() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final boolean zzL() {
        if (this.zza instanceof Adapter) {
            return this.zzc != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzcfi.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final zzbuk zzM() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final zzbul zzN() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final Bundle zze() {
        Object obj = this.zza;
        if (!(obj instanceof zzcnd)) {
            String canonicalName = zzcnd.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzcfi.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            return new Bundle();
        }
        return ((zzcnd) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final Bundle zzf() {
        Object obj = this.zza;
        if (!(obj instanceof zzcne)) {
            String canonicalName = zzcne.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzcfi.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            return new Bundle();
        }
        return ((zzcne) obj).getInterstitialAdapterInfo();
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zzb) {
            try {
                return ((com.google.android.gms.ads.mediation.zzb) obj).getVideoController();
            } catch (Throwable th) {
                zzcfi.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final zzblu zzi() {
        zzbva zzbvaVar = this.zzb;
        if (zzbvaVar != null) {
            NativeCustomTemplateAd zza = zzbvaVar.zza();
            if (zza instanceof zzblv) {
                return ((zzblv) zza).zza();
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final zzbui zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzi;
        if (mediationInterscrollerAd != null) {
            return new zzbuz(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final zzbuo zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        UnifiedNativeAdMapper zzb;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof Adapter) || (unifiedNativeAdMapper = this.zzg) == null) {
                return null;
            }
            return new zzbvd(unifiedNativeAdMapper);
        }
        zzbva zzbvaVar = this.zzb;
        if (zzbvaVar == null || (zzb = zzbvaVar.zzb()) == null) {
            return null;
        }
        return new zzbvd(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final zzbwf zzl() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbwf.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final zzbwf zzm() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbwf.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final IObjectWrapper zzn() {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                zzcfi.zzh("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzcfi.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzo() {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzcfi.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzcav zzcavVar, String str2) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            this.zzd = iObjectWrapper;
            this.zzc = zzcavVar;
            zzcavVar.zzl(ObjectWrapper.wrap(obj));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzcfi.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzq(IObjectWrapper iObjectWrapper, zzbqj zzbqjVar, List list) {
        char c;
        AdFormat adFormat;
        if (this.zza instanceof Adapter) {
            zzbut zzbutVar = new zzbut(this, zzbqjVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbqp zzbqpVar = (zzbqp) it.next();
                String str = zzbqpVar.zza;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1911491517:
                        if (str.equals("rewarded_interstitial")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    adFormat = AdFormat.BANNER;
                } else if (c == 1) {
                    adFormat = AdFormat.INTERSTITIAL;
                } else if (c == 2) {
                    adFormat = AdFormat.REWARDED;
                } else if (c != 3) {
                    adFormat = c != 4 ? null : AdFormat.NATIVE;
                } else {
                    adFormat = AdFormat.REWARDED_INTERSTITIAL;
                }
                if (adFormat != null) {
                    arrayList.add(new MediationConfiguration(adFormat, zzbqpVar.zzb));
                }
            }
            ((Adapter) this.zza).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbutVar, arrayList);
            return;
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzr(IObjectWrapper iObjectWrapper, zzcav zzcavVar, List list) {
        zzcfi.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) {
        zzA(zzlVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbuf zzbufVar) {
        zzu(iObjectWrapper, zzqVar, zzlVar, str, null, zzbufVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbuf zzbufVar) {
        AdSize zzc;
        RemoteException remoteException;
        Object obj = this.zza;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof Adapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzcfi.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
        zzcfi.zze("Requesting banner ad from adapter.");
        if (zzqVar.zzn) {
            zzc = com.google.android.gms.ads.zzb.zzd(zzqVar.zze, zzqVar.zzb);
        } else {
            zzc = com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza);
        }
        AdSize adSize = zzc;
        Object obj2 = this.zza;
        if (obj2 instanceof MediationBannerAdapter) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                List list = zzlVar.zze;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j2 = zzlVar.zzb;
                zzbur zzburVar = new zzbur(j2 == -1 ? null : new Date(j2), zzlVar.zzd, hashSet, zzlVar.zzk, zzT(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, zzU(str, zzlVar));
                Bundle bundle = zzlVar.zzm;
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbva(zzbufVar), zzS(str, zzlVar, str2), adSize, zzburVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
            } finally {
            }
        } else if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzS(str, zzlVar, str2), zzR(zzlVar), zzT(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzU(str, zzlVar), adSize, this.zzj), new zzbuu(this, zzbufVar));
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbuf zzbufVar) {
        if (this.zza instanceof Adapter) {
            zzcfi.zze("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.zza;
                adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzS(str, zzlVar, str2), zzR(zzlVar), zzT(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzU(str, zzlVar), com.google.android.gms.ads.zzb.zze(zzqVar.zze, zzqVar.zzb), ""), new zzbus(this, zzbufVar, adapter));
                return;
            } catch (Exception e2) {
                zzcfi.zzh("", e2);
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzcfi.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbuf zzbufVar) {
        zzx(iObjectWrapper, zzlVar, str, null, zzbufVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbuf zzbufVar) {
        RemoteException remoteException;
        Object obj = this.zza;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof Adapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzcfi.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
        zzcfi.zze("Requesting interstitial ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationInterstitialAdapter) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                List list = zzlVar.zze;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j2 = zzlVar.zzb;
                zzbur zzburVar = new zzbur(j2 == -1 ? null : new Date(j2), zzlVar.zzd, hashSet, zzlVar.zzk, zzT(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, zzU(str, zzlVar));
                Bundle bundle = zzlVar.zzm;
                mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbva(zzbufVar), zzS(str, zzlVar, str2), zzburVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
            } finally {
            }
        } else if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzS(str, zzlVar, str2), zzR(zzlVar), zzT(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzU(str, zzlVar), this.zzj), new zzbuv(this, zzbufVar));
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbuf zzbufVar, zzbko zzbkoVar, List list) {
        RemoteException remoteException;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof Adapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzcfi.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
        zzcfi.zze("Requesting native ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list2 = zzlVar.zze;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j2 = zzlVar.zzb;
                zzbvc zzbvcVar = new zzbvc(j2 == -1 ? null : new Date(j2), zzlVar.zzd, hashSet, zzlVar.zzk, zzT(zzlVar), zzlVar.zzg, zzbkoVar, list, zzlVar.zzr, zzlVar.zzt, zzU(str, zzlVar));
                Bundle bundle = zzlVar.zzm;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzb = new zzbva(zzbufVar);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzS(str, zzlVar, str2), zzbvcVar, bundle2);
            } finally {
            }
        } else if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzS(str, zzlVar, str2), zzR(zzlVar), zzT(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzU(str, zzlVar), this.zzj, zzbkoVar), new zzbuw(this, zzbufVar));
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbuf zzbufVar) {
        if (this.zza instanceof Adapter) {
            zzcfi.zze("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) this.zza).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzS(str, zzlVar, null), zzR(zzlVar), zzT(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzU(str, zzlVar), ""), new zzbux(this, zzbufVar));
                return;
            } catch (Exception e2) {
                zzcfi.zzh("", e2);
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzcfi.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    public zzbuy(MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
