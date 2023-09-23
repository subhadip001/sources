package f.j.a.g;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import com.arthenica.ffmpegkit.MediaInformation;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.inverseai.adhelper.BannerAd;
import com.inverseai.adhelper.util.AdType;
import i.j.d;
import i.j.j.a.e;
import i.j.j.a.h;
import i.l.a.p;
import i.l.b.i;
import j.a.c0;
import java.lang.ref.WeakReference;

/* compiled from: AdmobBannerAd.kt */
/* loaded from: classes2.dex */
public final class c implements BannerAd {
    public final c0 a;
    public final c0 b;
    public final BannerAd.AdSize c;

    /* renamed from: d  reason: collision with root package name */
    public AdView f6465d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f6466e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6467f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6468g;

    /* renamed from: h  reason: collision with root package name */
    public f.j.a.m.a f6469h;

    /* renamed from: i  reason: collision with root package name */
    public final long f6470i;

    /* compiled from: AdmobBannerAd.kt */
    @e(c = "com.inverseai.adhelper.banner.AdmobBannerAd$loadAd$2", f = "AdmobBannerAd.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends h implements p<c0, d<? super i.h>, Object> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Context f6472k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ String f6473l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f6474m;

        /* compiled from: AdmobBannerAd.kt */
        @e(c = "com.inverseai.adhelper.banner.AdmobBannerAd$loadAd$2$1", f = "AdmobBannerAd.kt", l = {}, m = "invokeSuspend")
        /* renamed from: f.j.a.g.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0153a extends h implements p<c0, d<? super i.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ c f6475j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ String f6476k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ ViewGroup f6477l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ Context f6478m;

            /* compiled from: AdmobBannerAd.kt */
            /* renamed from: f.j.a.g.c$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0154a extends AdListener {
                public final /* synthetic */ WeakReference<Context> a;
                public final /* synthetic */ c b;
                public final /* synthetic */ WeakReference<ViewGroup> c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ String f6479d;

                public C0154a(WeakReference<Context> weakReference, c cVar, WeakReference<ViewGroup> weakReference2, String str) {
                    this.a = weakReference;
                    this.b = cVar;
                    this.c = weakReference2;
                    this.f6479d = str;
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    super.onAdClosed();
                    if (this.a.get() == null) {
                        return;
                    }
                    Log.d("AdmobBannerAd", "onAdClosed: ");
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    i.e(loadAdError, "adError");
                    super.onAdFailedToLoad(loadAdError);
                    final Context context = this.a.get();
                    if (context == null) {
                        return;
                    }
                    final c cVar = this.b;
                    final WeakReference<ViewGroup> weakReference = this.c;
                    final String str = this.f6479d;
                    Log.d("AdmobBannerAd", i.g("onAdFailedToLoad: ", loadAdError.getMessage()));
                    f.j.a.m.a aVar = cVar.f6469h;
                    if (aVar != null) {
                        aVar.h(context, AdType.BANNER_AD);
                    }
                    cVar.f6466e.postDelayed(new Runnable() { // from class: f.j.a.g.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            WeakReference weakReference2 = weakReference;
                            c cVar2 = cVar;
                            Context context2 = context;
                            String str2 = str;
                            i.e(weakReference2, "$weakAdContainerReference");
                            i.e(cVar2, "this$0");
                            i.e(context2, "$weakContext");
                            i.e(str2, "$adId");
                            ViewGroup viewGroup = (ViewGroup) weakReference2.get();
                            if (viewGroup == null) {
                                return;
                            }
                            cVar2.c(context2, viewGroup, str2);
                        }
                    }, cVar.f6470i);
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdLoaded() {
                    super.onAdLoaded();
                    Context context = this.a.get();
                    if (context == null) {
                        return;
                    }
                    c cVar = this.b;
                    Log.d("AdmobBannerAd", "onAdLoaded: ");
                    f.j.a.m.a aVar = cVar.f6469h;
                    if (aVar != null) {
                        aVar.c(AdType.BANNER_AD);
                    }
                    f.j.a.m.a aVar2 = cVar.f6469h;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.j(context, AdType.BANNER_AD);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0153a(c cVar, String str, ViewGroup viewGroup, Context context, d<? super C0153a> dVar) {
                super(2, dVar);
                this.f6475j = cVar;
                this.f6476k = str;
                this.f6477l = viewGroup;
                this.f6478m = context;
            }

            @Override // i.j.j.a.a
            public final d<i.h> a(Object obj, d<?> dVar) {
                return new C0153a(this.f6475j, this.f6476k, this.f6477l, this.f6478m, dVar);
            }

            @Override // i.l.a.p
            public Object k(c0 c0Var, d<? super i.h> dVar) {
                d<? super i.h> dVar2 = dVar;
                c cVar = this.f6475j;
                String str = this.f6476k;
                ViewGroup viewGroup = this.f6477l;
                Context context = this.f6478m;
                if (dVar2 != null) {
                    dVar2.getContext();
                }
                i.h hVar = i.h.a;
                f.n.a.n.i.e0(hVar);
                AdView adView = cVar.f6465d;
                if (adView != null) {
                    adView.setAdUnitId(str);
                    viewGroup.removeAllViews();
                    AdView adView2 = cVar.f6465d;
                    if (adView2 != null) {
                        viewGroup.addView(adView2);
                        WeakReference weakReference = new WeakReference(context);
                        WeakReference weakReference2 = new WeakReference(viewGroup);
                        AdView adView3 = cVar.f6465d;
                        if (adView3 != null) {
                            adView3.setAdListener(new C0154a(weakReference, cVar, weakReference2, str));
                            f.a.b.a.a.M(FirebaseAnalytics.getInstance(context), "ADMOB_LOAD_BANNER");
                            AdView adView4 = cVar.f6465d;
                            if (adView4 != null) {
                                adView4.loadAd(new AdRequest.Builder().build());
                                return hVar;
                            }
                            i.h("adView");
                            throw null;
                        }
                        i.h("adView");
                        throw null;
                    }
                    i.h("adView");
                    throw null;
                }
                i.h("adView");
                throw null;
            }

            @Override // i.j.j.a.a
            public final Object l(Object obj) {
                f.n.a.n.i.e0(obj);
                AdView adView = this.f6475j.f6465d;
                if (adView != null) {
                    adView.setAdUnitId(this.f6476k);
                    this.f6477l.removeAllViews();
                    ViewGroup viewGroup = this.f6477l;
                    AdView adView2 = this.f6475j.f6465d;
                    if (adView2 != null) {
                        viewGroup.addView(adView2);
                        WeakReference weakReference = new WeakReference(this.f6478m);
                        WeakReference weakReference2 = new WeakReference(this.f6477l);
                        c cVar = this.f6475j;
                        AdView adView3 = cVar.f6465d;
                        if (adView3 != null) {
                            adView3.setAdListener(new C0154a(weakReference, cVar, weakReference2, this.f6476k));
                            f.a.b.a.a.M(FirebaseAnalytics.getInstance(this.f6478m), "ADMOB_LOAD_BANNER");
                            AdView adView4 = this.f6475j.f6465d;
                            if (adView4 != null) {
                                adView4.loadAd(new AdRequest.Builder().build());
                                return i.h.a;
                            }
                            i.h("adView");
                            throw null;
                        }
                        i.h("adView");
                        throw null;
                    }
                    i.h("adView");
                    throw null;
                }
                i.h("adView");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, ViewGroup viewGroup, d<? super a> dVar) {
            super(2, dVar);
            this.f6472k = context;
            this.f6473l = str;
            this.f6474m = viewGroup;
        }

        @Override // i.j.j.a.a
        public final d<i.h> a(Object obj, d<?> dVar) {
            return new a(this.f6472k, this.f6473l, this.f6474m, dVar);
        }

        @Override // i.l.a.p
        public Object k(c0 c0Var, d<? super i.h> dVar) {
            d<? super i.h> dVar2 = dVar;
            c cVar = c.this;
            Context context = this.f6472k;
            String str = this.f6473l;
            ViewGroup viewGroup = this.f6474m;
            if (dVar2 != null) {
                dVar2.getContext();
            }
            i.h hVar = i.h.a;
            f.n.a.n.i.e0(hVar);
            AdView adView = cVar.f6465d;
            if (adView != null) {
                adView.setAdSize(cVar.a(context));
                f.n.a.n.i.D(cVar.b, null, null, new C0153a(cVar, str, viewGroup, context, null), 3, null);
                return hVar;
            }
            i.h("adView");
            throw null;
        }

        @Override // i.j.j.a.a
        public final Object l(Object obj) {
            f.n.a.n.i.e0(obj);
            c cVar = c.this;
            AdView adView = cVar.f6465d;
            if (adView != null) {
                adView.setAdSize(cVar.a(this.f6472k));
                c cVar2 = c.this;
                f.n.a.n.i.D(cVar2.b, null, null, new C0153a(cVar2, this.f6473l, this.f6474m, this.f6472k, null), 3, null);
                return i.h.a;
            }
            i.h("adView");
            throw null;
        }
    }

    public c(c0 c0Var, c0 c0Var2, BannerAd.AdSize adSize) {
        i.e(c0Var, "ioScope");
        i.e(c0Var2, "mainScope");
        i.e(adSize, MediaInformation.KEY_SIZE);
        this.a = c0Var;
        this.b = c0Var2;
        this.c = adSize;
        this.f6466e = new Handler(Looper.getMainLooper());
        this.f6470i = 10000L;
    }

    public final AdSize a(Context context) {
        int ordinal = this.c.ordinal();
        if (ordinal == 1) {
            AdSize adSize = AdSize.LARGE_BANNER;
            i.d(adSize, "LARGE_BANNER");
            return adSize;
        } else if (ordinal == 2) {
            AdSize adSize2 = AdSize.MEDIUM_RECTANGLE;
            i.d(adSize2, "MEDIUM_RECTANGLE");
            return adSize2;
        } else if (ordinal != 3) {
            AdSize adSize3 = AdSize.SMART_BANNER;
            i.d(adSize3, "SMART_BANNER");
            return adSize3;
        } else {
            Display defaultDisplay = f.j.a.m.c.a.b(context).getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            AdSize currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, (int) (displayMetrics.widthPixels / displayMetrics.density));
            i.d(currentOrientationAnchoredAdaptiveBannerAdSize, "getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, adWidth)");
            return currentOrientationAnchoredAdaptiveBannerAdSize;
        }
    }

    @Override // com.inverseai.adhelper.BannerAd
    public void b(f.j.a.m.a aVar) {
        i.e(aVar, "adCallback");
        this.f6469h = aVar;
    }

    @Override // com.inverseai.adhelper.BannerAd
    public void c(final Context context, final ViewGroup viewGroup, final String str) {
        i.e(context, "context");
        i.e(viewGroup, "adContainer");
        i.e(str, "adId");
        if (e()) {
            AdView adView = this.f6465d;
            if (adView == null) {
                i.h("adView");
                throw null;
            } else if (adView.isLoading()) {
                return;
            }
        }
        if (f.j.a.m.c.a(f.j.a.m.c.a, context, null, 2)) {
            if (this.f6467f && !this.f6468g) {
                this.f6466e.postDelayed(new Runnable() { // from class: f.j.a.g.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        c cVar = c.this;
                        Context context2 = context;
                        ViewGroup viewGroup2 = viewGroup;
                        String str2 = str;
                        i.e(cVar, "this$0");
                        i.e(context2, "$context");
                        i.e(viewGroup2, "$adContainer");
                        i.e(str2, "$adId");
                        cVar.c(context2, viewGroup2, str2);
                    }
                }, this.f6470i);
                return;
            }
            Log.d("AdmobBannerAd", "loadAd: ");
            this.f6465d = new AdView(context);
            f.n.a.n.i.D(this.a, null, null, new a(context, str, viewGroup, null), 3, null);
        }
    }

    @Override // com.inverseai.adhelper.BannerAd
    public int d(Context context) {
        i.e(context, "context");
        return a(context).getHeightInPixels(context);
    }

    public final boolean e() {
        return this.f6465d != null;
    }

    @Override // com.inverseai.adhelper.BannerAd
    public void onDestroy() {
        this.f6468g = true;
        if (e()) {
            AdView adView = this.f6465d;
            if (adView == null) {
                i.h("adView");
                throw null;
            }
            adView.destroy();
        }
        this.f6466e.removeCallbacksAndMessages(null);
        this.f6469h = null;
    }

    @Override // com.inverseai.adhelper.BannerAd
    public void onPause() {
        this.f6467f = true;
        if (e()) {
            AdView adView = this.f6465d;
            if (adView != null) {
                adView.pause();
            } else {
                i.h("adView");
                throw null;
            }
        }
    }

    @Override // com.inverseai.adhelper.BannerAd
    public void onResume() {
        this.f6467f = false;
        if (e()) {
            AdView adView = this.f6465d;
            if (adView != null) {
                adView.resume();
            } else {
                i.h("adView");
                throw null;
            }
        }
    }
}
