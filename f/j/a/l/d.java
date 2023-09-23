package f.j.a.l;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.inverseai.adhelper.util.AdType;
import i.l.b.i;
import java.lang.ref.WeakReference;

/* compiled from: AdMobRewardedAd.kt */
/* loaded from: classes2.dex */
public final class d extends FullScreenContentCallback {
    public final /* synthetic */ WeakReference<Context> a;
    public final /* synthetic */ e b;
    public final /* synthetic */ String c;

    public d(WeakReference<Context> weakReference, e eVar, String str) {
        this.a = weakReference;
        this.b = eVar;
        this.c = str;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        Context context = this.a.get();
        if (context == null) {
            return;
        }
        e eVar = this.b;
        String str = this.c;
        eVar.f6531d = null;
        eVar.c(context, str);
        f.j.a.m.b bVar = eVar.f6532e;
        if (bVar == null) {
            return;
        }
        bVar.g(context, AdType.REWARDED_AD);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        f.j.a.m.b bVar;
        i.e(adError, "adError");
        Context context = this.a.get();
        if (context == null || (bVar = this.b.f6532e) == null) {
            return;
        }
        bVar.f(context, AdType.REWARDED_AD);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdShowedFullScreenContent() {
        f.j.a.m.b bVar;
        Context context = this.a.get();
        if (context == null || (bVar = this.b.f6532e) == null) {
            return;
        }
        bVar.j(context, AdType.REWARDED_AD);
    }
}
