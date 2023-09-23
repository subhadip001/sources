package f.h.a.a;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class e extends AdListener implements UnifiedNativeAd.OnUnifiedNativeAdLoadedListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener {
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    public final AbstractAdViewAdapter f3641f;
    @VisibleForTesting

    /* renamed from: g  reason: collision with root package name */
    public final MediationNativeListener f3642g;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f3641f = abstractAdViewAdapter;
        this.f3642g = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f3642g.onAdClicked(this.f3641f);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f3642g.onAdClosed(this.f3641f);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f3642g.onAdFailedToLoad(this.f3641f, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f3642g.onAdImpression(this.f3641f);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f3642g.onAdOpened(this.f3641f);
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener
    public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        this.f3642g.zze(this.f3641f, nativeCustomTemplateAd, str);
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener
    public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
        this.f3642g.zzc(this.f3641f, nativeCustomTemplateAd);
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
    public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
        this.f3642g.onAdLoaded(this.f3641f, new a(unifiedNativeAd));
    }
}
