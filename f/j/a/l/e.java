package f.j.a.l;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.inverseai.adhelper.util.AdType;
import com.video_converter.video_compressor.R;
import f.j.a.f;
import i.h;
import i.l.b.i;
import j.a.c0;
import java.lang.ref.WeakReference;

/* compiled from: AdMobRewardedAd.kt */
/* loaded from: classes2.dex */
public final class e implements f {
    public final c0 a;
    public final c0 b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public RewardedAd f6531d;

    /* renamed from: e  reason: collision with root package name */
    public f.j.a.m.b f6532e;

    /* renamed from: f  reason: collision with root package name */
    public int f6533f;

    /* renamed from: g  reason: collision with root package name */
    public final long f6534g;

    /* renamed from: h  reason: collision with root package name */
    public final long f6535h;

    /* renamed from: i  reason: collision with root package name */
    public final Handler f6536i;

    /* compiled from: AdMobRewardedAd.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RewardedAdLoadCallback {
        public final /* synthetic */ WeakReference<Context> b;
        public final /* synthetic */ String c;

        public a(WeakReference<Context> weakReference, String str) {
            this.b = weakReference;
            this.c = str;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            i.e(loadAdError, "adError");
            Log.d("AdMobRewardedAd", "onAdFailedToLoad: " + loadAdError.getMessage() + ", tryCnt=" + e.this.f6533f);
            final Context context = this.b.get();
            if (context == null) {
                return;
            }
            final e eVar = e.this;
            final String str = this.c;
            if (eVar.f6533f <= eVar.c) {
                eVar.f6536i.postDelayed(new Runnable() { // from class: f.j.a.l.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        e eVar2 = e.this;
                        Context context2 = context;
                        String str2 = str;
                        i.e(eVar2, "this$0");
                        i.e(context2, "$weakContext");
                        i.e(str2, "$adId");
                        eVar2.f6533f++;
                        eVar2.c(context2, str2);
                    }
                }, eVar.f6534g);
                return;
            }
            f.j.a.m.b bVar = eVar.f6532e;
            if (bVar == null) {
                return;
            }
            bVar.h(context, AdType.REWARDED_AD);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(RewardedAd rewardedAd) {
            RewardedAd rewardedAd2 = rewardedAd;
            i.e(rewardedAd2, "rewardedAd");
            Log.d("AdMobRewardedAd", "onAdLoaded: ");
            e eVar = e.this;
            eVar.f6533f = 0;
            eVar.f6531d = rewardedAd2;
            eVar.f6536i.removeCallbacksAndMessages(null);
            final Context context = this.b.get();
            if (context != null) {
                final e eVar2 = e.this;
                final String str = this.c;
                eVar2.f6536i.postDelayed(new Runnable() { // from class: f.j.a.l.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        e eVar3 = e.this;
                        Context context2 = context;
                        String str2 = str;
                        i.e(eVar3, "this$0");
                        i.e(context2, "$context");
                        i.e(str2, "$adId");
                        eVar3.f6531d = null;
                        eVar3.c(context2, str2);
                    }
                }, eVar2.f6535h);
            }
            e eVar3 = e.this;
            RewardedAd rewardedAd3 = eVar3.f6531d;
            if (rewardedAd3 != null) {
                rewardedAd3.setFullScreenContentCallback(new d(this.b, eVar3, this.c));
            }
            f.j.a.m.b bVar = e.this.f6532e;
            if (bVar == null) {
                return;
            }
            bVar.c(AdType.REWARDED_AD);
        }
    }

    public e(c0 c0Var, c0 c0Var2, Context context) {
        i.e(c0Var, "ioScope");
        i.e(c0Var2, "mainScope");
        i.e(context, "context");
        this.a = c0Var;
        this.b = c0Var2;
        this.c = context.getResources().getInteger(R.integer.maximum_try_loading_ad);
        this.f6534g = 10000L;
        this.f6535h = 1800000L;
        this.f6536i = new Handler(Looper.getMainLooper());
    }

    @Override // f.j.a.f
    public void a(Activity activity) {
        f.j.a.m.b bVar;
        i.e(activity, "activity");
        WeakReference weakReference = new WeakReference(activity);
        h hVar = null;
        this.f6536i.removeCallbacksAndMessages(null);
        FirebaseAnalytics.getInstance(activity).logEvent("ADMOB_SHOW_REWARDED", new Bundle());
        Activity activity2 = (Activity) weakReference.get();
        if (activity2 == null) {
            return;
        }
        Log.d("AdMobRewardedAd", "show: ");
        RewardedAd rewardedAd = this.f6531d;
        if (rewardedAd != null) {
            rewardedAd.show(activity2, new OnUserEarnedRewardListener() { // from class: f.j.a.l.a
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                    e eVar = e.this;
                    i.e(eVar, "this$0");
                    i.e(rewardItem, "$noName_0");
                    f.j.a.m.b bVar2 = eVar.f6532e;
                    if (bVar2 == null) {
                        return;
                    }
                    bVar2.i();
                }
            });
            hVar = h.a;
        }
        if (hVar != null || (bVar = this.f6532e) == null) {
            return;
        }
        bVar.f(activity2, AdType.REWARDED_AD);
    }

    @Override // f.j.a.f
    public boolean b() {
        return this.f6531d != null;
    }

    @Override // f.j.a.f
    public void c(Context context, String str) {
        i.e(context, "context");
        i.e(str, "adId");
        if (this.f6531d != null) {
            return;
        }
        Log.d("AdMobRewardedAd", "loadAd: ");
        FirebaseAnalytics.getInstance(context).logEvent("ADMOB_LOAD_REWARDED", new Bundle());
        AdRequest build = new AdRequest.Builder().build();
        i.d(build, "Builder().build()");
        WeakReference weakReference = new WeakReference(context);
        this.f6531d = null;
        RewardedAd.load(context, str, build, new a(weakReference, str));
    }

    @Override // f.j.a.f
    public void d(f.j.a.m.b bVar) {
        this.f6532e = bVar;
    }
}
