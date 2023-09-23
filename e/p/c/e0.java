package e.p.c;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class e0 {
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f2691d;

    /* renamed from: e  reason: collision with root package name */
    public int f2692e;

    /* renamed from: f  reason: collision with root package name */
    public int f2693f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2694g;

    /* renamed from: i  reason: collision with root package name */
    public String f2696i;

    /* renamed from: j  reason: collision with root package name */
    public int f2697j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f2698k;

    /* renamed from: l  reason: collision with root package name */
    public int f2699l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f2700m;
    public ArrayList<String> n;
    public ArrayList<String> o;
    public ArrayList<a> a = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f2695h = true;
    public boolean p = false;

    /* compiled from: FragmentTransaction.java */
    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public Fragment b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f2701d;

        /* renamed from: e  reason: collision with root package name */
        public int f2702e;

        /* renamed from: f  reason: collision with root package name */
        public int f2703f;

        /* renamed from: g  reason: collision with root package name */
        public Lifecycle.State f2704g;

        /* renamed from: h  reason: collision with root package name */
        public Lifecycle.State f2705h;

        public a() {
        }

        public a(int i2, Fragment fragment) {
            this.a = i2;
            this.b = fragment;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f2704g = state;
            this.f2705h = state;
        }

        public a(int i2, Fragment fragment, Lifecycle.State state) {
            this.a = i2;
            this.b = fragment;
            this.f2704g = fragment.mMaxState;
            this.f2705h = state;
        }
    }

    public e0(v vVar, ClassLoader classLoader) {
    }

    public void b(a aVar) {
        this.a.add(aVar);
        aVar.c = this.b;
        aVar.f2701d = this.c;
        aVar.f2702e = this.f2691d;
        aVar.f2703f = this.f2692e;
    }

    public e0 c(String str) {
        if (this.f2695h) {
            this.f2694g = true;
            this.f2696i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract int d();

    public abstract int e();

    public abstract void f();

    public abstract void g(int i2, Fragment fragment, String str, int i3);

    public e0 h(int i2, Fragment fragment, String str) {
        if (i2 != 0) {
            g(i2, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
}
