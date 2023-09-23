package e.b.c;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NavUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.video_converter.video_compressor.R;
import e.b.c.b;
import e.b.c.v;
import e.b.c.x;
import e.b.g.a;
import e.b.g.e;
import e.b.g.i.g;
import e.b.g.i.m;
import e.b.h.c0;
import e.b.h.f1;
import e.b.h.p0;
import e.b.h.z0;
import e.i.j.b0;
import e.i.j.d0;
import e.i.j.f0;
import e.i.j.z;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public class n extends m implements g.a, LayoutInflater.Factory2 {
    public static final e.f.h<String, Integer> e0 = new e.f.h<>();
    public static final int[] f0 = {16842836};
    public static final boolean g0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean h0 = true;
    public TextView A;
    public View B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public k[] K;
    public k L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public Configuration Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public h V;
    public h W;
    public boolean X;
    public int Y;
    public boolean a0;
    public Rect b0;
    public Rect c0;
    public u d0;

    /* renamed from: i  reason: collision with root package name */
    public final Object f1483i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f1484j;

    /* renamed from: k  reason: collision with root package name */
    public Window f1485k;

    /* renamed from: l  reason: collision with root package name */
    public f f1486l;

    /* renamed from: m  reason: collision with root package name */
    public final e.b.c.l f1487m;
    public e.b.c.a n;
    public MenuInflater o;
    public CharSequence p;
    public c0 q;
    public d r;
    public l s;
    public e.b.g.a t;
    public ActionBarContextView u;
    public PopupWindow v;
    public Runnable w;
    public boolean y;
    public ViewGroup z;
    public b0 x = null;
    public final Runnable Z = new a();

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = n.this;
            if ((nVar.Y & 1) != 0) {
                nVar.L(0);
            }
            n nVar2 = n.this;
            if ((nVar2.Y & 4096) != 0) {
                nVar2.L(108);
            }
            n nVar3 = n.this;
            nVar3.X = false;
            nVar3.Y = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class b implements b.a {
        public b() {
        }

        @Override // e.b.c.b.a
        public boolean a() {
            n nVar = n.this;
            nVar.U();
            e.b.c.a aVar = nVar.n;
            return (aVar == null || (aVar.d() & 4) == 0) ? false : true;
        }

        @Override // e.b.c.b.a
        public Context b() {
            return n.this.Q();
        }

        @Override // e.b.c.b.a
        public void c(Drawable drawable, int i2) {
            n nVar = n.this;
            nVar.U();
            e.b.c.a aVar = nVar.n;
            if (aVar != null) {
                aVar.o(drawable);
                aVar.n(i2);
            }
        }

        @Override // e.b.c.b.a
        public Drawable d() {
            z0 p = z0.p(n.this.Q(), null, new int[]{R.attr.homeAsUpIndicator});
            Drawable g2 = p.g(0);
            p.b.recycle();
            return g2;
        }

        @Override // e.b.c.b.a
        public void e(int i2) {
            n nVar = n.this;
            nVar.U();
            e.b.c.a aVar = nVar.n;
            if (aVar != null) {
                aVar.n(i2);
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class d implements m.a {
        public d() {
        }

        @Override // e.b.g.i.m.a
        public void b(e.b.g.i.g gVar, boolean z) {
            n.this.H(gVar);
        }

        @Override // e.b.g.i.m.a
        public boolean c(e.b.g.i.g gVar) {
            Window.Callback T = n.this.T();
            if (T != null) {
                T.onMenuOpened(108, gVar);
                return true;
            }
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class e implements a.InterfaceC0026a {
        public a.InterfaceC0026a a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        public class a extends d0 {
            public a() {
            }

            @Override // e.i.j.c0
            public void b(View view) {
                n.this.u.setVisibility(8);
                n nVar = n.this;
                PopupWindow popupWindow = nVar.v;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (nVar.u.getParent() instanceof View) {
                    AtomicInteger atomicInteger = z.a;
                    z.h.c((View) n.this.u.getParent());
                }
                n.this.u.h();
                n.this.x.d(null);
                n nVar2 = n.this;
                nVar2.x = null;
                ViewGroup viewGroup = nVar2.z;
                AtomicInteger atomicInteger2 = z.a;
                z.h.c(viewGroup);
            }
        }

        public e(a.InterfaceC0026a interfaceC0026a) {
            this.a = interfaceC0026a;
        }

        @Override // e.b.g.a.InterfaceC0026a
        public void a(e.b.g.a aVar) {
            this.a.a(aVar);
            n nVar = n.this;
            if (nVar.v != null) {
                nVar.f1485k.getDecorView().removeCallbacks(n.this.w);
            }
            n nVar2 = n.this;
            if (nVar2.u != null) {
                nVar2.M();
                n nVar3 = n.this;
                b0 b = z.b(nVar3.u);
                b.a(0.0f);
                nVar3.x = b;
                b0 b0Var = n.this.x;
                a aVar2 = new a();
                View view = b0Var.a.get();
                if (view != null) {
                    b0Var.e(view, aVar2);
                }
            }
            n nVar4 = n.this;
            e.b.c.l lVar = nVar4.f1487m;
            if (lVar != null) {
                lVar.i(nVar4.t);
            }
            n nVar5 = n.this;
            nVar5.t = null;
            ViewGroup viewGroup = nVar5.z;
            AtomicInteger atomicInteger = z.a;
            z.h.c(viewGroup);
        }

        @Override // e.b.g.a.InterfaceC0026a
        public boolean b(e.b.g.a aVar, Menu menu) {
            return this.a.b(aVar, menu);
        }

        @Override // e.b.g.a.InterfaceC0026a
        public boolean c(e.b.g.a aVar, Menu menu) {
            ViewGroup viewGroup = n.this.z;
            AtomicInteger atomicInteger = z.a;
            z.h.c(viewGroup);
            return this.a.c(aVar, menu);
        }

        @Override // e.b.g.a.InterfaceC0026a
        public boolean d(e.b.g.a aVar, MenuItem menuItem) {
            return this.a.d(aVar, menuItem);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class g extends h {
        public final PowerManager c;

        public g(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // e.b.c.n.h
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // e.b.c.n.h
        public int c() {
            return this.c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // e.b.c.n.h
        public void d() {
            n.this.d();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public abstract class h {
        public BroadcastReceiver a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                h.this.d();
            }
        }

        public h() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    n.this.f1484j.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b = b();
            if (b == null || b.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            n.this.f1484j.registerReceiver(this.a, b);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class i extends h {
        public final x c;

        public i(x xVar) {
            super();
            this.c = xVar;
        }

        @Override // e.b.c.n.h
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // e.b.c.n.h
        public int c() {
            boolean z;
            long j2;
            x xVar = this.c;
            x.a aVar = xVar.c;
            if (aVar.b > System.currentTimeMillis()) {
                z = aVar.a;
            } else {
                Location a = e.i.a.j(xVar.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? xVar.a("network") : null;
                Location a2 = e.i.a.j(xVar.a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? xVar.a("gps") : null;
                if (a2 == null || a == null ? a2 != null : a2.getTime() > a.getTime()) {
                    a = a2;
                }
                if (a != null) {
                    x.a aVar2 = xVar.c;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (w.f1528d == null) {
                        w.f1528d = new w();
                    }
                    w wVar = w.f1528d;
                    wVar.a(currentTimeMillis - 86400000, a.getLatitude(), a.getLongitude());
                    wVar.a(currentTimeMillis, a.getLatitude(), a.getLongitude());
                    r7 = wVar.c == 1;
                    long j3 = wVar.b;
                    long j4 = wVar.a;
                    wVar.a(currentTimeMillis + 86400000, a.getLatitude(), a.getLongitude());
                    long j5 = wVar.b;
                    if (j3 == -1 || j4 == -1) {
                        j2 = 43200000 + currentTimeMillis;
                    } else {
                        j2 = (currentTimeMillis > j4 ? j5 + 0 : currentTimeMillis > j3 ? j4 + 0 : j3 + 0) + 60000;
                    }
                    aVar2.a = r7;
                    aVar2.b = j2;
                    z = aVar.a;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i2 = Calendar.getInstance().get(11);
                    z = (i2 < 6 || i2 >= 22) ? true : true;
                }
            }
            return z ? 2 : 1;
        }

        @Override // e.b.c.n.h
        public void d() {
            n.this.d();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class j extends ContentFrameLayout {
        public j(Context context) {
            super(context, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return n.this.K(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    n nVar = n.this;
                    nVar.I(nVar.S(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(e.b.a.b(getContext(), i2));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static final class k {
        public int a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f1494d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f1495e;

        /* renamed from: f  reason: collision with root package name */
        public View f1496f;

        /* renamed from: g  reason: collision with root package name */
        public View f1497g;

        /* renamed from: h  reason: collision with root package name */
        public e.b.g.i.g f1498h;

        /* renamed from: i  reason: collision with root package name */
        public e.b.g.i.e f1499i;

        /* renamed from: j  reason: collision with root package name */
        public Context f1500j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1501k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1502l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1503m;
        public boolean n;
        public boolean o = false;
        public boolean p;
        public Bundle q;

        public k(int i2) {
            this.a = i2;
        }

        public void a(e.b.g.i.g gVar) {
            e.b.g.i.e eVar;
            e.b.g.i.g gVar2 = this.f1498h;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.u(this.f1499i);
            }
            this.f1498h = gVar;
            if (gVar == null || (eVar = this.f1499i) == null) {
                return;
            }
            gVar.b(eVar, gVar.a);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class l implements m.a {
        public l() {
        }

        @Override // e.b.g.i.m.a
        public void b(e.b.g.i.g gVar, boolean z) {
            e.b.g.i.g k2 = gVar.k();
            boolean z2 = k2 != gVar;
            n nVar = n.this;
            if (z2) {
                gVar = k2;
            }
            k P = nVar.P(gVar);
            if (P != null) {
                if (z2) {
                    n.this.G(P.a, P, k2);
                    n.this.I(P, true);
                    return;
                }
                n.this.I(P, z);
            }
        }

        @Override // e.b.g.i.m.a
        public boolean c(e.b.g.i.g gVar) {
            Window.Callback T;
            if (gVar == gVar.k()) {
                n nVar = n.this;
                if (!nVar.E || (T = nVar.T()) == null || n.this.P) {
                    return true;
                }
                T.onMenuOpened(108, gVar);
                return true;
            }
            return true;
        }
    }

    public n(Context context, Window window, e.b.c.l lVar, Object obj) {
        e.f.h<String, Integer> hVar;
        Integer orDefault;
        e.b.c.k kVar;
        this.R = -100;
        this.f1484j = context;
        this.f1487m = lVar;
        this.f1483i = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof e.b.c.k) {
                    kVar = (e.b.c.k) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            kVar = null;
            if (kVar != null) {
                this.R = kVar.L().h();
            }
        }
        if (this.R == -100 && (orDefault = (hVar = e0).getOrDefault(this.f1483i.getClass().getName(), null)) != null) {
            this.R = orDefault.intValue();
            hVar.remove(this.f1483i.getClass().getName());
        }
        if (window != null) {
            F(window);
        }
        e.b.h.i.e();
    }

    @Override // e.b.c.m
    public void A(Toolbar toolbar) {
        CharSequence charSequence;
        if (this.f1483i instanceof Activity) {
            U();
            e.b.c.a aVar = this.n;
            if (!(aVar instanceof y)) {
                this.o = null;
                if (aVar != null) {
                    aVar.h();
                }
                this.n = null;
                if (toolbar != null) {
                    Object obj = this.f1483i;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.p;
                    }
                    v vVar = new v(toolbar, charSequence, this.f1486l);
                    this.n = vVar;
                    this.f1486l.f1490g = vVar.c;
                } else {
                    this.f1486l.f1490g = null;
                }
                l();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // e.b.c.m
    public void B(int i2) {
        this.S = i2;
    }

    @Override // e.b.c.m
    public final void C(CharSequence charSequence) {
        this.p = charSequence;
        c0 c0Var = this.q;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
            return;
        }
        e.b.c.a aVar = this.n;
        if (aVar != null) {
            aVar.r(charSequence);
            return;
        }
        TextView textView = this.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    @Override // e.b.c.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e.b.g.a D(e.b.g.a.InterfaceC0026a r8) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.c.n.D(e.b.g.a$a):e.b.g.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(boolean r12) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.c.n.E(boolean):boolean");
    }

    public final void F(Window window) {
        if (this.f1485k == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof f)) {
                f fVar = new f(callback);
                this.f1486l = fVar;
                window.setCallback(fVar);
                z0 p = z0.p(this.f1484j, null, f0);
                Drawable h2 = p.h(0);
                if (h2 != null) {
                    window.setBackgroundDrawable(h2);
                }
                p.b.recycle();
                this.f1485k = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public void G(int i2, k kVar, Menu menu) {
        if (menu == null && kVar != null) {
            menu = kVar.f1498h;
        }
        if ((kVar == null || kVar.f1503m) && !this.P) {
            this.f1486l.f1604f.onPanelClosed(i2, menu);
        }
    }

    public void H(e.b.g.i.g gVar) {
        if (this.J) {
            return;
        }
        this.J = true;
        this.q.i();
        Window.Callback T = T();
        if (T != null && !this.P) {
            T.onPanelClosed(108, gVar);
        }
        this.J = false;
    }

    public void I(k kVar, boolean z) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (z && kVar.a == 0 && (c0Var = this.q) != null && c0Var.b()) {
            H(kVar.f1498h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1484j.getSystemService("window");
        if (windowManager != null && kVar.f1503m && (viewGroup = kVar.f1495e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                G(kVar.a, kVar, null);
            }
        }
        kVar.f1501k = false;
        kVar.f1502l = false;
        kVar.f1503m = false;
        kVar.f1496f = null;
        kVar.o = true;
        if (this.L == kVar) {
            this.L = null;
        }
    }

    public final Configuration J(Context context, int i2, Configuration configuration) {
        int i3;
        if (i2 != 1) {
            i3 = i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i3 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean K(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.c.n.K(android.view.KeyEvent):boolean");
    }

    public void L(int i2) {
        k S = S(i2);
        if (S.f1498h != null) {
            Bundle bundle = new Bundle();
            S.f1498h.w(bundle);
            if (bundle.size() > 0) {
                S.q = bundle;
            }
            S.f1498h.z();
            S.f1498h.clear();
        }
        S.p = true;
        S.o = true;
        if ((i2 == 108 || i2 == 0) && this.q != null) {
            k S2 = S(0);
            S2.f1501k = false;
            Z(S2, null);
        }
    }

    public void M() {
        b0 b0Var = this.x;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public final void N() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (this.y) {
            return;
        }
        TypedArray obtainStyledAttributes = this.f1484j.obtainStyledAttributes(e.b.b.f1464j);
        if (obtainStyledAttributes.hasValue(117)) {
            if (obtainStyledAttributes.getBoolean(126, false)) {
                v(1);
            } else if (obtainStyledAttributes.getBoolean(117, false)) {
                v(108);
            }
            if (obtainStyledAttributes.getBoolean(118, false)) {
                v(109);
            }
            if (obtainStyledAttributes.getBoolean(119, false)) {
                v(10);
            }
            this.H = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            O();
            this.f1485k.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f1484j);
            if (!this.I) {
                if (this.H) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.F = false;
                    this.E = false;
                } else if (this.E) {
                    TypedValue typedValue = new TypedValue();
                    this.f1484j.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new e.b.g.c(this.f1484j, typedValue.resourceId);
                    } else {
                        context = this.f1484j;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    c0 c0Var = (c0) viewGroup.findViewById(R.id.decor_content_parent);
                    this.q = c0Var;
                    c0Var.setWindowCallback(T());
                    if (this.F) {
                        this.q.h(109);
                    }
                    if (this.C) {
                        this.q.h(2);
                    }
                    if (this.D) {
                        this.q.h(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.G ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
            }
            if (viewGroup != null) {
                o oVar = new o(this);
                AtomicInteger atomicInteger = z.a;
                z.i.u(viewGroup, oVar);
                if (this.q == null) {
                    this.A = (TextView) viewGroup.findViewById(R.id.title);
                }
                Method method = f1.a;
                try {
                    Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                    if (!method2.isAccessible()) {
                        method2.setAccessible(true);
                    }
                    method2.invoke(viewGroup, new Object[0]);
                } catch (IllegalAccessException e2) {
                    Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
                } catch (NoSuchMethodException unused) {
                    Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                } catch (InvocationTargetException e3) {
                    Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
                }
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f1485k.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f1485k.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new p(this));
                this.z = viewGroup;
                Object obj = this.f1483i;
                if (obj instanceof Activity) {
                    charSequence = ((Activity) obj).getTitle();
                } else {
                    charSequence = this.p;
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    c0 c0Var2 = this.q;
                    if (c0Var2 != null) {
                        c0Var2.setWindowTitle(charSequence);
                    } else {
                        e.b.c.a aVar = this.n;
                        if (aVar != null) {
                            aVar.r(charSequence);
                        } else {
                            TextView textView = this.A;
                            if (textView != null) {
                                textView.setText(charSequence);
                            }
                        }
                    }
                }
                ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.z.findViewById(16908290);
                View decorView = this.f1485k.getDecorView();
                contentFrameLayout2.f194l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                AtomicInteger atomicInteger2 = z.a;
                if (z.g.c(contentFrameLayout2)) {
                    contentFrameLayout2.requestLayout();
                }
                TypedArray obtainStyledAttributes2 = this.f1484j.obtainStyledAttributes(e.b.b.f1464j);
                obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                if (obtainStyledAttributes2.hasValue(122)) {
                    obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                }
                if (obtainStyledAttributes2.hasValue(123)) {
                    obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                }
                if (obtainStyledAttributes2.hasValue(120)) {
                    obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                }
                if (obtainStyledAttributes2.hasValue(121)) {
                    obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                }
                obtainStyledAttributes2.recycle();
                contentFrameLayout2.requestLayout();
                this.y = true;
                k S = S(0);
                if (this.P || S.f1498h != null) {
                    return;
                }
                V(108);
                return;
            }
            StringBuilder A = f.a.b.a.a.A("AppCompat does not support the current theme features: { windowActionBar: ");
            A.append(this.E);
            A.append(", windowActionBarOverlay: ");
            A.append(this.F);
            A.append(", android:windowIsFloating: ");
            A.append(this.H);
            A.append(", windowActionModeOverlay: ");
            A.append(this.G);
            A.append(", windowNoTitle: ");
            A.append(this.I);
            A.append(" }");
            throw new IllegalArgumentException(A.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    public final void O() {
        if (this.f1485k == null) {
            Object obj = this.f1483i;
            if (obj instanceof Activity) {
                F(((Activity) obj).getWindow());
            }
        }
        if (this.f1485k == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public k P(Menu menu) {
        k[] kVarArr = this.K;
        int length = kVarArr != null ? kVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            k kVar = kVarArr[i2];
            if (kVar != null && kVar.f1498h == menu) {
                return kVar;
            }
        }
        return null;
    }

    public final Context Q() {
        U();
        e.b.c.a aVar = this.n;
        Context e2 = aVar != null ? aVar.e() : null;
        return e2 == null ? this.f1484j : e2;
    }

    public final h R(Context context) {
        if (this.V == null) {
            if (x.f1529d == null) {
                Context applicationContext = context.getApplicationContext();
                x.f1529d = new x(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
            }
            this.V = new i(x.f1529d);
        }
        return this.V;
    }

    public k S(int i2) {
        k[] kVarArr = this.K;
        if (kVarArr == null || kVarArr.length <= i2) {
            k[] kVarArr2 = new k[i2 + 1];
            if (kVarArr != null) {
                System.arraycopy(kVarArr, 0, kVarArr2, 0, kVarArr.length);
            }
            this.K = kVarArr2;
            kVarArr = kVarArr2;
        }
        k kVar = kVarArr[i2];
        if (kVar == null) {
            k kVar2 = new k(i2);
            kVarArr[i2] = kVar2;
            return kVar2;
        }
        return kVar;
    }

    public final Window.Callback T() {
        return this.f1485k.getCallback();
    }

    public final void U() {
        N();
        if (this.E && this.n == null) {
            Object obj = this.f1483i;
            if (obj instanceof Activity) {
                this.n = new y((Activity) this.f1483i, this.F);
            } else if (obj instanceof Dialog) {
                this.n = new y((Dialog) this.f1483i);
            }
            e.b.c.a aVar = this.n;
            if (aVar != null) {
                aVar.l(this.a0);
            }
        }
    }

    public final void V(int i2) {
        this.Y = (1 << i2) | this.Y;
        if (this.X) {
            return;
        }
        View decorView = this.f1485k.getDecorView();
        Runnable runnable = this.Z;
        AtomicInteger atomicInteger = z.a;
        z.d.m(decorView, runnable);
        this.X = true;
    }

    public int W(Context context, int i2) {
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 == 0) {
                    if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                        return R(context).c();
                    }
                    return -1;
                } else if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        if (this.W == null) {
                            this.W = new g(context);
                        }
                        return this.W.c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            }
            return i2;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x014a, code lost:
        if (r14 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(e.b.c.n.k r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.c.n.X(e.b.c.n$k, android.view.KeyEvent):void");
    }

    public final boolean Y(k kVar, int i2, KeyEvent keyEvent, int i3) {
        e.b.g.i.g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((kVar.f1501k || Z(kVar, keyEvent)) && (gVar = kVar.f1498h) != null) {
            z = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.q == null) {
            I(kVar, true);
        }
        return z;
    }

    public final boolean Z(k kVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        Resources.Theme theme;
        c0 c0Var3;
        c0 c0Var4;
        if (this.P) {
            return false;
        }
        if (kVar.f1501k) {
            return true;
        }
        k kVar2 = this.L;
        if (kVar2 != null && kVar2 != kVar) {
            I(kVar2, false);
        }
        Window.Callback T = T();
        if (T != null) {
            kVar.f1497g = T.onCreatePanelView(kVar.a);
        }
        int i2 = kVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (c0Var4 = this.q) != null) {
            c0Var4.c();
        }
        if (kVar.f1497g == null && (!z || !(this.n instanceof v))) {
            e.b.g.i.g gVar = kVar.f1498h;
            if (gVar == null || kVar.p) {
                if (gVar == null) {
                    Context context = this.f1484j;
                    int i3 = kVar.a;
                    if ((i3 == 0 || i3 == 108) && this.q != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            e.b.g.c cVar = new e.b.g.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    e.b.g.i.g gVar2 = new e.b.g.i.g(context);
                    gVar2.f1652e = this;
                    kVar.a(gVar2);
                    if (kVar.f1498h == null) {
                        return false;
                    }
                }
                if (z && (c0Var2 = this.q) != null) {
                    if (this.r == null) {
                        this.r = new d();
                    }
                    c0Var2.a(kVar.f1498h, this.r);
                }
                kVar.f1498h.z();
                if (!T.onCreatePanelMenu(kVar.a, kVar.f1498h)) {
                    kVar.a(null);
                    if (z && (c0Var = this.q) != null) {
                        c0Var.a(null, this.r);
                    }
                    return false;
                }
                kVar.p = false;
            }
            kVar.f1498h.z();
            Bundle bundle = kVar.q;
            if (bundle != null) {
                kVar.f1498h.v(bundle);
                kVar.q = null;
            }
            if (!T.onPreparePanel(0, kVar.f1497g, kVar.f1498h)) {
                if (z && (c0Var3 = this.q) != null) {
                    c0Var3.a(null, this.r);
                }
                kVar.f1498h.y();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            kVar.n = z2;
            kVar.f1498h.setQwertyMode(z2);
            kVar.f1498h.y();
        }
        kVar.f1501k = true;
        kVar.f1502l = false;
        this.L = kVar;
        return true;
    }

    @Override // e.b.g.i.g.a
    public boolean a(e.b.g.i.g gVar, MenuItem menuItem) {
        k P;
        Window.Callback T = T();
        if (T == null || this.P || (P = P(gVar.k())) == null) {
            return false;
        }
        return T.onMenuItemSelected(P.a, menuItem);
    }

    public final boolean a0() {
        ViewGroup viewGroup;
        if (this.y && (viewGroup = this.z) != null) {
            AtomicInteger atomicInteger = z.a;
            if (z.g.c(viewGroup)) {
                return true;
            }
        }
        return false;
    }

    @Override // e.b.g.i.g.a
    public void b(e.b.g.i.g gVar) {
        c0 c0Var = this.q;
        if (c0Var != null && c0Var.d() && (!ViewConfiguration.get(this.f1484j).hasPermanentMenuKey() || this.q.e())) {
            Window.Callback T = T();
            if (this.q.b()) {
                this.q.f();
                if (this.P) {
                    return;
                }
                T.onPanelClosed(108, S(0).f1498h);
                return;
            } else if (T == null || this.P) {
                return;
            } else {
                if (this.X && (1 & this.Y) != 0) {
                    this.f1485k.getDecorView().removeCallbacks(this.Z);
                    this.Z.run();
                }
                k S = S(0);
                e.b.g.i.g gVar2 = S.f1498h;
                if (gVar2 == null || S.p || !T.onPreparePanel(0, S.f1497g, gVar2)) {
                    return;
                }
                T.onMenuOpened(108, S.f1498h);
                this.q.g();
                return;
            }
        }
        k S2 = S(0);
        S2.o = true;
        I(S2, false);
        X(S2, null);
    }

    public final void b0() {
        if (this.y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // e.b.c.m
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        N();
        ((ViewGroup) this.z.findViewById(16908290)).addView(view, layoutParams);
        this.f1486l.f1604f.onContentChanged();
    }

    public final int c0(f0 f0Var, Rect rect) {
        boolean z;
        boolean z2;
        int color;
        int f2 = f0Var.f();
        ActionBarContextView actionBarContextView = this.u;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.u.getLayoutParams();
            if (this.u.isShown()) {
                if (this.b0 == null) {
                    this.b0 = new Rect();
                    this.c0 = new Rect();
                }
                Rect rect2 = this.b0;
                Rect rect3 = this.c0;
                rect2.set(f0Var.d(), f0Var.f(), f0Var.e(), f0Var.c());
                f1.a(this.z, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                f0 m2 = z.m(this.z);
                int d2 = m2 == null ? 0 : m2.d();
                int e2 = m2 == null ? 0 : m2.e();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 > 0 && this.B == null) {
                    View view = new View(this.f1484j);
                    this.B = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = d2;
                    layoutParams.rightMargin = e2;
                    this.z.addView(this.B, -1, layoutParams);
                } else {
                    View view2 = this.B;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != d2 || marginLayoutParams2.rightMargin != e2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = d2;
                            marginLayoutParams2.rightMargin = e2;
                            this.B.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.B;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.B;
                    AtomicInteger atomicInteger = z.a;
                    if ((z.d.g(view4) & 8192) != 0) {
                        color = e.i.c.a.getColor(this.f1484j, R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = e.i.c.a.getColor(this.f1484j, R.color.abc_decor_view_status_guard);
                    }
                    view4.setBackgroundColor(color);
                }
                if (!this.G && z) {
                    f2 = 0;
                }
                r4 = z2;
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                } else {
                    r4 = false;
                }
                z = false;
            }
            if (r4) {
                this.u.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.B;
        if (view5 != null) {
            view5.setVisibility(z ? 0 : 8);
        }
        return f2;
    }

    @Override // e.b.c.m
    public boolean d() {
        return E(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x019f  */
    @Override // e.b.c.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.content.Context e(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.c.n.e(android.content.Context):android.content.Context");
    }

    @Override // e.b.c.m
    public <T extends View> T f(int i2) {
        N();
        return (T) this.f1485k.findViewById(i2);
    }

    @Override // e.b.c.m
    public final b.a g() {
        return new b();
    }

    @Override // e.b.c.m
    public int h() {
        return this.R;
    }

    @Override // e.b.c.m
    public MenuInflater i() {
        if (this.o == null) {
            U();
            e.b.c.a aVar = this.n;
            this.o = new e.b.g.f(aVar != null ? aVar.e() : this.f1484j);
        }
        return this.o;
    }

    @Override // e.b.c.m
    public e.b.c.a j() {
        U();
        return this.n;
    }

    @Override // e.b.c.m
    public void k() {
        LayoutInflater from = LayoutInflater.from(this.f1484j);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (from.getFactory2() instanceof n) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // e.b.c.m
    public void l() {
        U();
        e.b.c.a aVar = this.n;
        if (aVar == null || !aVar.f()) {
            V(0);
        }
    }

    @Override // e.b.c.m
    public void m(Configuration configuration) {
        if (this.E && this.y) {
            U();
            e.b.c.a aVar = this.n;
            if (aVar != null) {
                aVar.g(configuration);
            }
        }
        e.b.h.i a2 = e.b.h.i.a();
        Context context = this.f1484j;
        synchronized (a2) {
            p0 p0Var = a2.a;
            synchronized (p0Var) {
                e.f.e<WeakReference<Drawable.ConstantState>> eVar = p0Var.f1823d.get(context);
                if (eVar != null) {
                    eVar.b();
                }
            }
        }
        this.Q = new Configuration(this.f1484j.getResources().getConfiguration());
        E(false);
    }

    @Override // e.b.c.m
    public void n(Bundle bundle) {
        this.N = true;
        E(false);
        O();
        Object obj = this.f1483i;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = NavUtils.getParentActivityName((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                e.b.c.a aVar = this.n;
                if (aVar == null) {
                    this.a0 = true;
                } else {
                    aVar.l(true);
                }
            }
            synchronized (m.f1482h) {
                m.u(this);
                m.f1481g.add(new WeakReference<>(this));
            }
        }
        this.Q = new Configuration(this.f1484j.getResources().getConfiguration());
        this.O = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // e.b.c.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1483i
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = e.b.c.m.f1482h
            monitor-enter(r0)
            e.b.c.m.u(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.X
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f1485k
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.Z
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.P = r0
            int r0 = r3.R
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f1483i
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            e.f.h<java.lang.String, java.lang.Integer> r0 = e.b.c.n.e0
            java.lang.Object r1 = r3.f1483i
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.R
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            e.f.h<java.lang.String, java.lang.Integer> r0 = e.b.c.n.e0
            java.lang.Object r1 = r3.f1483i
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            e.b.c.a r0 = r3.n
            if (r0 == 0) goto L63
            r0.h()
        L63:
            e.b.c.n$h r0 = r3.V
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            e.b.c.n$h r0 = r3.W
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.c.n.o():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0116, code lost:
        if (r8.equals("ImageButton") == false) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0221 -> B:144:0x0227). Please submit an issue!!! */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r7, java.lang.String r8, android.content.Context r9, android.util.AttributeSet r10) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.c.n.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // e.b.c.m
    public void p(Bundle bundle) {
        N();
    }

    @Override // e.b.c.m
    public void q() {
        U();
        e.b.c.a aVar = this.n;
        if (aVar != null) {
            aVar.p(true);
        }
    }

    @Override // e.b.c.m
    public void r(Bundle bundle) {
    }

    @Override // e.b.c.m
    public void s() {
        d();
    }

    @Override // e.b.c.m
    public void t() {
        U();
        e.b.c.a aVar = this.n;
        if (aVar != null) {
            aVar.p(false);
        }
    }

    @Override // e.b.c.m
    public boolean v(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.I && i2 == 108) {
            return false;
        }
        if (this.E && i2 == 1) {
            this.E = false;
        }
        if (i2 == 1) {
            b0();
            this.I = true;
            return true;
        } else if (i2 == 2) {
            b0();
            this.C = true;
            return true;
        } else if (i2 == 5) {
            b0();
            this.D = true;
            return true;
        } else if (i2 == 10) {
            b0();
            this.G = true;
            return true;
        } else if (i2 == 108) {
            b0();
            this.E = true;
            return true;
        } else if (i2 != 109) {
            return this.f1485k.requestFeature(i2);
        } else {
            b0();
            this.F = true;
            return true;
        }
    }

    @Override // e.b.c.m
    public void w(int i2) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1484j).inflate(i2, viewGroup);
        this.f1486l.f1604f.onContentChanged();
    }

    @Override // e.b.c.m
    public void x(View view) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1486l.f1604f.onContentChanged();
    }

    @Override // e.b.c.m
    public void y(View view, ViewGroup.LayoutParams layoutParams) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1486l.f1604f.onContentChanged();
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class f extends e.b.g.h {

        /* renamed from: g  reason: collision with root package name */
        public c f1490g;

        public f(Window.Callback callback) {
            super(callback);
        }

        public final ActionMode a(ActionMode.Callback callback) {
            e.a aVar = new e.a(n.this.f1484j, callback);
            e.b.g.a D = n.this.D(aVar);
            if (D != null) {
                return aVar.e(D);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return n.this.K(keyEvent) || this.f1604f.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
            if (r6 != false) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @Override // android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                android.view.Window$Callback r0 = r5.f1604f
                boolean r0 = r0.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L4f
                e.b.c.n r0 = e.b.c.n.this
                int r3 = r6.getKeyCode()
                r0.U()
                e.b.c.a r4 = r0.n
                if (r4 == 0) goto L1f
                boolean r3 = r4.i(r3, r6)
                if (r3 == 0) goto L1f
            L1d:
                r6 = 1
                goto L4d
            L1f:
                e.b.c.n$k r3 = r0.L
                if (r3 == 0) goto L34
                int r4 = r6.getKeyCode()
                boolean r3 = r0.Y(r3, r4, r6, r2)
                if (r3 == 0) goto L34
                e.b.c.n$k r6 = r0.L
                if (r6 == 0) goto L1d
                r6.f1502l = r2
                goto L1d
            L34:
                e.b.c.n$k r3 = r0.L
                if (r3 != 0) goto L4c
                e.b.c.n$k r3 = r0.S(r1)
                r0.Z(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.Y(r3, r4, r6, r2)
                r3.f1501k = r1
                if (r6 == 0) goto L4c
                goto L1d
            L4c:
                r6 = 0
            L4d:
                if (r6 == 0) goto L50
            L4f:
                r1 = 1
            L50:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e.b.c.n.f.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof e.b.g.i.g)) {
                return this.f1604f.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public View onCreatePanelView(int i2) {
            c cVar = this.f1490g;
            if (cVar != null) {
                v.e eVar = (v.e) cVar;
                Objects.requireNonNull(eVar);
                View view = i2 == 0 ? new View(v.this.a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return this.f1604f.onCreatePanelView(i2);
        }

        @Override // android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            this.f1604f.onMenuOpened(i2, menu);
            n nVar = n.this;
            Objects.requireNonNull(nVar);
            if (i2 == 108) {
                nVar.U();
                e.b.c.a aVar = nVar.n;
                if (aVar != null) {
                    aVar.c(true);
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            this.f1604f.onPanelClosed(i2, menu);
            n nVar = n.this;
            Objects.requireNonNull(nVar);
            if (i2 == 108) {
                nVar.U();
                e.b.c.a aVar = nVar.n;
                if (aVar != null) {
                    aVar.c(false);
                }
            } else if (i2 == 0) {
                k S = nVar.S(i2);
                if (S.f1503m) {
                    nVar.I(S, false);
                }
            }
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            e.b.g.i.g gVar = menu instanceof e.b.g.i.g ? (e.b.g.i.g) menu : null;
            if (i2 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.x = true;
            }
            c cVar = this.f1490g;
            if (cVar != null) {
                v.e eVar = (v.e) cVar;
                if (i2 == 0) {
                    v vVar = v.this;
                    if (!vVar.f1518d) {
                        vVar.a.c();
                        v.this.f1518d = true;
                    }
                }
            }
            boolean onPreparePanel = this.f1604f.onPreparePanel(i2, view, menu);
            if (gVar != null) {
                gVar.x = false;
            }
            return onPreparePanel;
        }

        @Override // android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            e.b.g.i.g gVar = n.this.S(0).f1498h;
            if (gVar != null) {
                this.f1604f.onProvideKeyboardShortcuts(list, gVar, i2);
            } else {
                this.f1604f.onProvideKeyboardShortcuts(list, menu, i2);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            Objects.requireNonNull(n.this);
            return a(callback);
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            Objects.requireNonNull(n.this);
            if (i2 != 0) {
                return this.f1604f.onWindowStartingActionMode(callback, i2);
            }
            return a(callback);
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
