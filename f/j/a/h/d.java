package f.j.a.h;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.inverseai.adhelper.util.AdType;
import com.video_converter.video_compressor.R;
import i.l.b.i;
import j.a.c0;
import java.lang.ref.WeakReference;

/* compiled from: AdmobInterstitialAd.kt */
/* loaded from: classes2.dex */
public final class d implements f.j.a.c {
    public final c0 a;
    public final c0 b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6485d;

    /* renamed from: e  reason: collision with root package name */
    public InterstitialAd f6486e;

    /* renamed from: f  reason: collision with root package name */
    public int f6487f;

    /* renamed from: g  reason: collision with root package name */
    public f.j.a.m.a f6488g;

    /* renamed from: h  reason: collision with root package name */
    public final long f6489h;

    /* renamed from: i  reason: collision with root package name */
    public final long f6490i;

    /* renamed from: j  reason: collision with root package name */
    public final Handler f6491j;

    /* compiled from: AdmobInterstitialAd.kt */
    /* loaded from: classes2.dex */
    public final class a extends InterstitialAdLoadCallback {
        public final WeakReference<Context> a;
        public final /* synthetic */ d b;

        public a(d dVar, Context context) {
            i.e(dVar, "this$0");
            i.e(context, "context");
            this.b = dVar;
            this.a = new WeakReference<>(context);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            i.e(loadAdError, "adError");
            super.onAdFailedToLoad(loadAdError);
            StringBuilder A = f.a.b.a.a.A("onAdFailedToLoad: ");
            A.append(loadAdError.getMessage());
            A.append(", tryCnt=");
            A.append(this.b.f6487f);
            Log.d("AdmobInterstitialAd", A.toString());
            final Context context = this.a.get();
            if (context == null) {
                return;
            }
            final d dVar = this.b;
            if (dVar.f6487f <= dVar.f6485d) {
                dVar.f6491j.postDelayed(new Runnable() { // from class: f.j.a.h.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        d dVar2 = d.this;
                        Context context2 = context;
                        i.e(dVar2, "this$0");
                        i.e(context2, "$weakContext");
                        dVar2.f6487f++;
                        String str = dVar2.c;
                        if (str != null) {
                            dVar2.c(context2, str);
                        } else {
                            i.h("adId");
                            throw null;
                        }
                    }
                }, dVar.f6489h);
                return;
            }
            f.j.a.m.a aVar = dVar.f6488g;
            if (aVar == null) {
                return;
            }
            aVar.h(context, AdType.INTERSTITIAL_AD);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(InterstitialAd interstitialAd) {
            InterstitialAd interstitialAd2 = interstitialAd;
            i.e(interstitialAd2, "interstitialAd");
            super.onAdLoaded(interstitialAd2);
            Log.d("AdmobInterstitialAd", "onAdLoaded: ");
            d dVar = this.b;
            dVar.f6487f = 0;
            dVar.f6486e = interstitialAd2;
            Log.d("AdmobInterstitialAd", "cancelTimer: ");
            dVar.f6491j.removeCallbacksAndMessages(null);
            final Context context = this.a.get();
            if (context != null) {
                final d dVar2 = this.b;
                final String str = dVar2.c;
                if (str != null) {
                    Log.d("AdmobInterstitialAd", i.g("startTimerToInvalidateAndReloadAd: ", Long.valueOf(dVar2.f6490i)));
                    dVar2.f6491j.postDelayed(new Runnable() { // from class: f.j.a.h.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            d dVar3 = d.this;
                            Context context2 = context;
                            String str2 = str;
                            i.e(dVar3, "this$0");
                            i.e(context2, "$context");
                            i.e(str2, "$adId");
                            Log.d("AdmobInterstitialAd", "run: invalidating and reloading ad");
                            dVar3.f6486e = null;
                            dVar3.c(context2, str2);
                        }
                    }, dVar2.f6490i);
                } else {
                    i.h("adId");
                    throw null;
                }
            }
            d dVar3 = this.b;
            InterstitialAd interstitialAd3 = dVar3.f6486e;
            if (interstitialAd3 != null) {
                interstitialAd3.setFullScreenContentCallback(new c(dVar3, this));
            }
            f.j.a.m.a aVar = this.b.f6488g;
            if (aVar == null) {
                return;
            }
            aVar.c(AdType.INTERSTITIAL_AD);
        }
    }

    public d(c0 c0Var, c0 c0Var2, Context context) {
        i.e(c0Var, "ioScope");
        i.e(c0Var2, "mainScope");
        i.e(context, "context");
        this.a = c0Var;
        this.b = c0Var2;
        this.f6485d = context.getResources().getInteger(R.integer.maximum_try_loading_ad);
        this.f6489h = 10000L;
        this.f6490i = 1800000L;
        this.f6491j = new Handler(Looper.getMainLooper());
    }

    @Override // f.j.a.c
    public void a(Activity activity) {
        f.j.a.m.a aVar;
        i.e(activity, "activity");
        WeakReference weakReference = new WeakReference(activity);
        if (this.f6486e == null) {
            String str = this.c;
            if (str != null) {
                c(activity, str);
                Activity activity2 = (Activity) weakReference.get();
                if (activity2 == null || (aVar = this.f6488g) == null) {
                    return;
                }
                aVar.f(activity2, AdType.INTERSTITIAL_AD);
                return;
            }
            i.h("adId");
            throw null;
        }
        Log.d("AdmobInterstitialAd", "cancelTimer: ");
        this.f6491j.removeCallbacksAndMessages(null);
        FirebaseAnalytics.getInstance(activity).logEvent("ADMOB_SHOW_INTERSTITIAL", new Bundle());
        Log.d("AdmobInterstitialAd", "show: ");
        InterstitialAd interstitialAd = this.f6486e;
        if (interstitialAd == null) {
            return;
        }
        interstitialAd.show(activity);
    }

    @Override // f.j.a.c
    public void b(f.j.a.m.a aVar) {
        i.e(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f6488g = aVar;
    }

    @Override // f.j.a.c
    public void c(Context context, String str) {
        i.e(context, "context");
        i.e(str, "adId");
        if (this.f6486e != null) {
            return;
        }
        Log.d("AdmobInterstitialAd", "loadAd: ");
        f.a.b.a.a.M(FirebaseAnalytics.getInstance(context), "ADMOB_LOAD_INTERSTITIAL");
        this.c = str;
        InterstitialAd.load(context, str, new AdRequest.Builder().build(), new a(this, context));
    }
}
