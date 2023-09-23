package com.video_converter.video_compressor.adControllers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import com.inverseai.adhelper.BannerAd;
import com.inverseai.adhelper.util.AdType;
import e.s.l;
import e.s.m;
import e.s.u;
import f.n.a.c.e;
import i.l.b.i;
import i.l.b.j;
import i.m.c;
import j.a.a0;
import j.a.c0;
import j.a.l0;
import j.a.y1.n;
import java.util.ArrayList;
import java.util.Objects;
import m.b.a.j.f;
import org.inverseai.cross_promo.model.CrossPromoProduct;

/* compiled from: AdLoader.kt */
/* loaded from: classes2.dex */
public final class AdLoader implements l {

    /* renamed from: f  reason: collision with root package name */
    public Context f1343f;

    /* renamed from: g  reason: collision with root package name */
    public ViewGroup f1344g;

    /* renamed from: h  reason: collision with root package name */
    public m f1345h;

    /* renamed from: i  reason: collision with root package name */
    public final c0 f1346i;

    /* renamed from: j  reason: collision with root package name */
    public final c0 f1347j;

    /* renamed from: k  reason: collision with root package name */
    public final i.c f1348k;

    /* renamed from: l  reason: collision with root package name */
    public BannerAd f1349l;

    /* renamed from: m  reason: collision with root package name */
    public f.j.a.d f1350m;
    public final i.c n;
    public final i.c o;
    public final f.j.a.m.a p;

    /* compiled from: AdLoader.kt */
    /* loaded from: classes2.dex */
    public static final class a extends j implements i.l.a.a<f.j.a.a> {
        public a() {
            super(0);
        }

        @Override // i.l.a.a
        public f.j.a.a c() {
            Context context = AdLoader.this.f1343f;
            i.b(context);
            return new f.j.a.a(context, f.n.a.u.a.e().a());
        }
    }

    /* compiled from: AdLoader.kt */
    /* loaded from: classes2.dex */
    public static final class b implements f.j.a.m.a {
        public b() {
        }

        @Override // f.j.a.m.a
        public void c(AdType adType) {
            i.e(adType, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
        }

        @Override // f.j.a.m.a
        public void f(Context context, AdType adType) {
            i.e(context, "context");
            i.e(adType, "message");
        }

        @Override // f.j.a.m.a
        public void g(Context context, AdType adType) {
            i.e(context, "context");
            i.e(adType, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
            Objects.requireNonNull(AdLoader.this);
        }

        @Override // f.j.a.m.a
        public void h(Context context, AdType adType) {
            i.e(context, "context");
            i.e(adType, "message");
            int ordinal = adType.ordinal();
            if (ordinal == 0) {
                AdLoader.this.g(context);
            } else if (ordinal != 2) {
            } else {
                AdLoader.this.h(context);
            }
        }

        @Override // f.j.a.m.a
        public void j(Context context, AdType adType) {
            i.e(context, "context");
            i.e(adType, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
            e.f(context, adType);
        }
    }

    /* compiled from: AdLoader.kt */
    /* loaded from: classes2.dex */
    public static final class c extends j implements i.l.a.a<m.b.a.a> {

        /* renamed from: g  reason: collision with root package name */
        public static final c f1353g = new c();

        public c() {
            super(0);
        }

        @Override // i.l.a.a
        public m.b.a.a c() {
            return new m.b.a.a();
        }
    }

    /* compiled from: AdLoader.kt */
    /* loaded from: classes2.dex */
    public static final class d extends j implements i.l.a.a<m.b.a.c> {

        /* renamed from: g  reason: collision with root package name */
        public static final d f1354g = new d();

        public d() {
            super(0);
        }

        @Override // i.l.a.a
        public m.b.a.c c() {
            return new m.b.a.c();
        }
    }

    public AdLoader(Context context, ViewGroup viewGroup, m mVar) {
        this.f1343f = context;
        this.f1344g = viewGroup;
        this.f1345h = mVar;
        f.j.a.m.c cVar = f.j.a.m.c.a;
        a0 a0Var = f.j.a.m.c.b;
        this.f1346i = f.n.a.n.i.a(a0Var.plus(l0.b));
        this.f1347j = f.n.a.n.i.a(a0Var.plus(n.c));
        this.f1348k = f.n.a.n.i.E(new a());
        this.n = f.n.a.n.i.E(c.f1353g);
        this.o = f.n.a.n.i.E(d.f1354g);
        this.p = new b();
    }

    @u(Lifecycle.Event.ON_DESTROY)
    private final void onDestroyEvent() {
        BannerAd bannerAd = this.f1349l;
        if (bannerAd != null) {
            bannerAd.onDestroy();
        }
        f.j.a.d dVar = this.f1350m;
        if (dVar != null) {
            dVar.onDestroy();
        }
        Objects.requireNonNull(((m.b.a.a) this.n.getValue()).a());
        Objects.requireNonNull(((m.b.a.c) this.o.getValue()).a());
        ViewGroup viewGroup = this.f1344g;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.f1343f = null;
        this.f1344g = null;
        this.f1345h = null;
        this.f1349l = null;
        this.f1350m = null;
        f.n.a.n.i.i(this.f1346i, null, 1);
        f.n.a.n.i.i(this.f1347j, null, 1);
    }

    @u(Lifecycle.Event.ON_PAUSE)
    private final void onPauseEvent() {
        BannerAd bannerAd = this.f1349l;
        if (bannerAd != null) {
            bannerAd.onPause();
        }
        f.j.a.d dVar = this.f1350m;
        if (dVar == null) {
            return;
        }
        dVar.onPause();
    }

    @u(Lifecycle.Event.ON_RESUME)
    private final void onResumeEvent() {
        BannerAd bannerAd = this.f1349l;
        if (bannerAd != null) {
            bannerAd.onResume();
        }
        f.j.a.d dVar = this.f1350m;
        if (dVar == null) {
            return;
        }
        dVar.onResume();
    }

    @u(Lifecycle.Event.ON_START)
    private final void onStartEvent() {
    }

    @u(Lifecycle.Event.ON_STOP)
    private final void onStopEvent() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
        if ((r0 != null ? r0.getBoolean("can_show_cross_banner_ad") : true) == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.video_converter.video_compressor.adControllers.AdLoader.c():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
        if ((r0 == null ? true : r0.getBoolean("can_show_cross_native_ad")) == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.video_converter.video_compressor.adControllers.AdLoader.f():void");
    }

    public final void g(Context context) {
        if (this.f1344g == null) {
            return;
        }
        e.g(context, AdType.BANNER_AD);
        m.b.a.a aVar = (m.b.a.a) this.n.getValue();
        ViewGroup viewGroup = this.f1344g;
        i.b(viewGroup);
        Objects.requireNonNull(aVar);
        i.e(context, "context");
        i.e(viewGroup, "container");
        if (f.c(context)) {
            m.b.a.j.e a2 = aVar.a();
            c.a aVar2 = i.m.c.f8653f;
            View a3 = a2.a(context, aVar.a.get(aVar2.b(aVar.a.size())).intValue());
            m.b.a.j.e a4 = aVar.a();
            Context applicationContext = context.getApplicationContext();
            i.d(applicationContext, "context.applicationContext");
            ArrayList<CrossPromoProduct> a5 = f.a(applicationContext);
            if (a5.size() != 0) {
                CrossPromoProduct crossPromoProduct = a5.get(aVar2.b(a5.size()));
                i.d(crossPromoProduct, "products[index]");
                a4.b(a3, crossPromoProduct, true, true);
                viewGroup.removeAllViews();
                viewGroup.addView(a3);
                return;
            }
            throw new IllegalStateException("No products found in assets");
        }
    }

    public final void h(Context context) {
        if (this.f1344g == null) {
            return;
        }
        e.g(context, AdType.NATIVE_AD);
        m.b.a.c cVar = (m.b.a.c) this.o.getValue();
        ViewGroup viewGroup = this.f1344g;
        i.b(viewGroup);
        Objects.requireNonNull(cVar);
        i.e(context, "context");
        i.e(viewGroup, "container");
        if (f.c(context)) {
            m.b.a.j.e a2 = cVar.a();
            c.a aVar = i.m.c.f8653f;
            View a3 = a2.a(context, cVar.a.get(aVar.b(cVar.a.size())).intValue());
            viewGroup.removeAllViews();
            viewGroup.addView(a3);
            m.b.a.j.e a4 = cVar.a();
            Context applicationContext = context.getApplicationContext();
            i.d(applicationContext, "context.applicationContext");
            ArrayList<CrossPromoProduct> a5 = f.a(applicationContext);
            if (a5.size() != 0) {
                CrossPromoProduct crossPromoProduct = a5.get(aVar.b(a5.size()));
                i.d(crossPromoProduct, "products[index]");
                a4.b(a3, crossPromoProduct, true, true);
                return;
            }
            throw new IllegalStateException("No products found in assets");
        }
    }

    public final void i() {
        onDestroyEvent();
    }
}
