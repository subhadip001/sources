package f.h.a.a;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class b extends AdListener implements AppEventListener, zza {
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    public final AbstractAdViewAdapter f3639f;
    @VisibleForTesting

    /* renamed from: g  reason: collision with root package name */
    public final MediationBannerListener f3640g;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f3639f = abstractAdViewAdapter;
        this.f3640g = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f3640g.onAdClicked(this.f3639f);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f3640g.onAdClosed(this.f3639f);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f3640g.onAdFailedToLoad(this.f3639f, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f3640g.onAdLoaded(this.f3639f);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f3640g.onAdOpened(this.f3639f);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f3640g.zzd(this.f3639f, str, str2);
    }
}
