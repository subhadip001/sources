package f.h.a.a;

import android.view.View;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class a extends UnifiedNativeAdMapper {
    public a(UnifiedNativeAd unifiedNativeAd) {
        setHeadline(unifiedNativeAd.getHeadline());
        setImages(unifiedNativeAd.getImages());
        setBody(unifiedNativeAd.getBody());
        setIcon(unifiedNativeAd.getIcon());
        setCallToAction(unifiedNativeAd.getCallToAction());
        setAdvertiser(unifiedNativeAd.getAdvertiser());
        setStarRating(unifiedNativeAd.getStarRating());
        setStore(unifiedNativeAd.getStore());
        setPrice(unifiedNativeAd.getPrice());
        zzd(unifiedNativeAd.zza());
        setOverrideImpressionRecording(true);
        setOverrideClickHandling(true);
        zze(unifiedNativeAd.getVideoController());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        if (!(view instanceof zzg)) {
            if (((zze) zze.zza.get(view)) != null) {
                throw null;
            }
            return;
        }
        zzg zzgVar = (zzg) view;
        throw null;
    }
}
