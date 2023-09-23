package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.client.zzfg;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbnh;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbxe;
import com.google.android.gms.internal.ads.zzbxg;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public class AdLoader {
    private final zzp zza;
    private final Context zzb;
    private final zzbl zzc;

    public AdLoader(Context context, zzbl zzblVar, zzp zzpVar) {
        this.zzb = context;
        this.zzc = zzblVar;
        this.zza = zzpVar;
    }

    private final void zzb(final zzdr zzdrVar) {
        zzbhy.zzc(this.zzb);
        if (((Boolean) zzbjm.zzc.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zziq)).booleanValue()) {
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader.this.zza(zzdrVar);
                    }
                });
                return;
            }
        }
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdrVar));
        } catch (RemoteException e2) {
            zzcfi.zzh("Failed to load ad.", e2);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        } catch (RemoteException e2) {
            zzcfi.zzk("Failed to check if ad is loading.", e2);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        zzb(adRequest.zza());
    }

    public void loadAds(AdRequest adRequest, int i2) {
        try {
            this.zzc.zzh(this.zza.zza(this.zzb, adRequest.zza()), i2);
        } catch (RemoteException e2) {
            zzcfi.zzh("Failed to load ads.", e2);
        }
    }

    public final /* synthetic */ void zza(zzdr zzdrVar) {
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdrVar));
        } catch (RemoteException e2) {
            zzcfi.zzh("Failed to load ad.", e2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
    /* loaded from: classes.dex */
    public static class Builder {
        private final Context zza;
        private final zzbo zzb;

        public Builder(Context context, String str) {
            zzbo zzc = zzaw.zza().zzc(context, str, new zzbtw());
            this.zza = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            this.zzb = zzc;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzp.zza);
            } catch (RemoteException e2) {
                zzcfi.zzh("Failed to build AdLoader.", e2);
                return new AdLoader(this.zza, new zzep().zzc(), zzp.zza);
            }
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr != null && adSizeArr.length > 0) {
                try {
                    this.zzb.zzj(new zzbnh(onAdManagerAdViewLoadedListener), new zzq(this.zza, adSizeArr));
                } catch (RemoteException e2) {
                    zzcfi.zzk("Failed to add Google Ad Manager banner ad listener", e2);
                }
                return this;
            }
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbxe zzbxeVar = new zzbxe(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbxeVar.zzb(), zzbxeVar.zza());
            } catch (RemoteException e2) {
                zzcfi.zzk("Failed to add custom format ad listener", e2);
            }
            return this;
        }

        @Deprecated
        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            zzbnf zzbnfVar = new zzbnf(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbnfVar.zze(), zzbnfVar.zzd());
            } catch (RemoteException e2) {
                zzcfi.zzk("Failed to add custom template ad listener", e2);
            }
            return this;
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbxg(onNativeAdLoadedListener));
            } catch (RemoteException e2) {
                zzcfi.zzk("Failed to add google native ad listener", e2);
            }
            return this;
        }

        @Deprecated
        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbni(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e2) {
                zzcfi.zzk("Failed to add google native ad listener", e2);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzb.zzl(new zzg(adListener));
            } catch (RemoteException e2) {
                zzcfi.zzk("Failed to set AdListener.", e2);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzm(adManagerAdViewOptions);
            } catch (RemoteException e2) {
                zzcfi.zzk("Failed to specify Ad Manager banner ad options", e2);
            }
            return this;
        }

        @Deprecated
        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbko(nativeAdOptions));
            } catch (RemoteException e2) {
                zzcfi.zzk("Failed to specify native ad options", e2);
            }
            return this;
        }

        public Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbko(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfg(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio()));
            } catch (RemoteException e2) {
                zzcfi.zzk("Failed to specify native ad options", e2);
            }
            return this;
        }
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}
