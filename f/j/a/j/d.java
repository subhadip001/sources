package f.j.a.j;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.inverseai.adhelper.util.AdType;
import com.video_converter.video_compressor.R;
import i.l.b.i;
import j.a.c0;
import java.lang.ref.WeakReference;

/* compiled from: AdmobNativeAd.kt */
/* loaded from: classes2.dex */
public final class d implements f.j.a.d {
    public final c0 a;
    public final c0 b;
    public NativeAd c;

    /* renamed from: d  reason: collision with root package name */
    public AdLoader f6507d;

    /* renamed from: e  reason: collision with root package name */
    public f.j.a.m.a f6508e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6509f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6510g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6511h;

    /* renamed from: i  reason: collision with root package name */
    public final long f6512i;

    /* renamed from: j  reason: collision with root package name */
    public final Handler f6513j;

    /* compiled from: AdmobNativeAd.kt */
    /* loaded from: classes2.dex */
    public static final class a extends AdListener {
        public final /* synthetic */ WeakReference<Context> a;
        public final /* synthetic */ d b;
        public final /* synthetic */ WeakReference<ViewGroup> c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f6514d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f6515e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ boolean f6516f;

        public a(WeakReference<Context> weakReference, d dVar, WeakReference<ViewGroup> weakReference2, int i2, String str, boolean z) {
            this.a = weakReference;
            this.b = dVar;
            this.c = weakReference2;
            this.f6514d = i2;
            this.f6515e = str;
            this.f6516f = z;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            i.e(loadAdError, "adError");
            super.onAdFailedToLoad(loadAdError);
            Log.d("AdmobNativeAd", i.g("onAdFailedToLoad: ", loadAdError.getMessage()));
            final Context context = this.a.get();
            if (context == null) {
                return;
            }
            final d dVar = this.b;
            final WeakReference<ViewGroup> weakReference = this.c;
            final int i2 = this.f6514d;
            final String str = this.f6515e;
            final boolean z = this.f6516f;
            f.j.a.m.a aVar = dVar.f6508e;
            if (aVar != null) {
                aVar.h(context, AdType.NATIVE_AD);
            }
            dVar.f6513j.postDelayed(new Runnable() { // from class: f.j.a.j.c
                @Override // java.lang.Runnable
                public final void run() {
                    WeakReference weakReference2 = weakReference;
                    d dVar2 = dVar;
                    Context context2 = context;
                    int i3 = i2;
                    String str2 = str;
                    boolean z2 = z;
                    i.e(weakReference2, "$weakViewHolderReference");
                    i.e(dVar2, "this$0");
                    i.e(context2, "$weakContext");
                    i.e(str2, "$adId");
                    ViewGroup viewGroup = (ViewGroup) weakReference2.get();
                    if (viewGroup == null) {
                        return;
                    }
                    dVar2.b(context2, viewGroup, i3, str2, z2);
                }
            }, dVar.f6512i);
        }
    }

    public d(c0 c0Var, c0 c0Var2) {
        i.e(c0Var, "ioScope");
        i.e(c0Var2, "mainScope");
        this.a = c0Var;
        this.b = c0Var2;
        this.f6509f = 2;
        this.f6512i = 10000L;
        this.f6513j = new Handler(Looper.getMainLooper());
    }

    @Override // f.j.a.d
    public void a(Context context, ViewGroup viewGroup, String str, boolean z) {
        i.e(context, "context");
        i.e(viewGroup, "container");
        i.e(str, "adId");
        b(context, viewGroup, this.f6509f, str, z);
    }

    public final void b(final Context context, final ViewGroup viewGroup, final int i2, final String str, final boolean z) {
        AdLoader adLoader = this.f6507d;
        boolean z2 = false;
        if (adLoader != null && adLoader.isLoading()) {
            z2 = true;
        }
        if (!z2 && f.j.a.m.c.a(f.j.a.m.c.a, context, null, 2)) {
            if (this.f6510g && !this.f6511h) {
                this.f6513j.postDelayed(new Runnable() { // from class: f.j.a.j.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        d dVar = d.this;
                        Context context2 = context;
                        ViewGroup viewGroup2 = viewGroup;
                        int i3 = i2;
                        String str2 = str;
                        boolean z3 = z;
                        i.e(dVar, "this$0");
                        i.e(context2, "$context");
                        i.e(viewGroup2, "$viewHolder");
                        i.e(str2, "$adId");
                        dVar.b(context2, viewGroup2, i3, str2, z3);
                    }
                }, this.f6512i);
                return;
            }
            Log.d("AdmobNativeAd", "populateNativeAd: ");
            final WeakReference weakReference = new WeakReference(context);
            WeakReference weakReference2 = new WeakReference(viewGroup);
            AdLoader.Builder forNativeAd = new AdLoader.Builder(context, str).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: f.j.a.j.b
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public final void onNativeAdLoaded(NativeAd nativeAd) {
                    boolean z3 = z;
                    d dVar = this;
                    Context context2 = context;
                    ViewGroup viewGroup2 = viewGroup;
                    int i3 = i2;
                    WeakReference weakReference3 = weakReference;
                    i.e(dVar, "this$0");
                    i.e(context2, "$context");
                    i.e(viewGroup2, "$viewHolder");
                    i.e(weakReference3, "$weakContextReference");
                    i.e(nativeAd, "nativeAd");
                    Log.d("AdmobNativeAd", "onAdLoaded: ");
                    if (z3) {
                        f.j.a.m.c cVar = f.j.a.m.c.a;
                        if (!cVar.b(context2).isFinishing() && !cVar.b(context2).isDestroyed() && !cVar.b(context2).isChangingConfigurations()) {
                            NativeAd nativeAd2 = dVar.c;
                            if (nativeAd2 != null) {
                                nativeAd2.destroy();
                            }
                            dVar.c = nativeAd;
                            try {
                                ((ProgressBar) viewGroup2.findViewById(R.id.adProgress)).setVisibility(8);
                            } catch (Exception unused) {
                            }
                            try {
                                ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.adFrameLayout);
                                viewGroup3.removeAllViews();
                                viewGroup2 = viewGroup3;
                            } catch (Exception unused2) {
                                viewGroup2.removeAllViews();
                            }
                            f.j.a.k.a aVar = new f.j.a.k.a();
                            aVar.a = new ColorDrawable(-1);
                            f.j.a.k.b bVar = new f.j.a.k.b(context2);
                            bVar.setTemplateView(i3);
                            i.b(viewGroup2);
                            viewGroup2.addView(bVar);
                            bVar.a();
                            bVar.setStyles(aVar);
                            bVar.setNativeAd(nativeAd);
                            ViewGroup.LayoutParams layoutParams = bVar.getLayoutParams();
                            layoutParams.height = -1;
                            layoutParams.width = -1;
                        } else {
                            nativeAd.destroy();
                        }
                        Context context3 = (Context) weakReference3.get();
                        if (context3 == null) {
                            return;
                        }
                        f.j.a.m.a aVar2 = dVar.f6508e;
                        if (aVar2 != null) {
                            aVar2.c(AdType.NATIVE_AD);
                        }
                        f.j.a.m.a aVar3 = dVar.f6508e;
                        if (aVar3 == null) {
                            return;
                        }
                        aVar3.j(context3, AdType.NATIVE_AD);
                    }
                }
            });
            i.d(forNativeAd, "Builder(context, adId)\n            .forNativeAd { nativeAd ->\n                Log.d(TAG, \"onAdLoaded: \")\n                if (!canShowAd) {\n                    return@forNativeAd\n                }\n                populateAdmobNativeAd(\n                    context,\n                    viewHolder,\n                    nativeAd,\n                    heightType\n                )\n                weakContextReference.get()?.let { weakContext ->\n                    callback?.onAdLoaded(AdType.NATIVE_AD)\n                    callback?.onAdDisplayed(weakContext, AdType.NATIVE_AD)\n                }\n            }");
            forNativeAd.withAdListener(new a(weakReference, this, weakReference2, i2, str, z));
            FirebaseAnalytics.getInstance(context).logEvent("ADMOB_LOAD_NATIVE", new Bundle());
            AdLoader build = forNativeAd.build();
            this.f6507d = build;
            i.b(build);
            build.loadAd(new AdRequest.Builder().build());
        }
    }

    public void c(f.j.a.m.a aVar) {
        i.e(aVar, "adCallback");
        this.f6508e = aVar;
    }

    @Override // f.j.a.d
    public void onDestroy() {
        this.f6511h = true;
        this.f6508e = null;
        NativeAd nativeAd = this.c;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
        this.f6513j.removeCallbacksAndMessages(null);
    }

    @Override // f.j.a.d
    public void onPause() {
        this.f6510g = true;
    }

    @Override // f.j.a.d
    public void onResume() {
        this.f6510g = false;
    }
}
