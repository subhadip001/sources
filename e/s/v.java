package e.s;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import e.s.x;

/* compiled from: ProcessLifecycleOwner.java */
/* loaded from: classes.dex */
public class v implements m {
    public static final v n = new v();

    /* renamed from: j  reason: collision with root package name */
    public Handler f2824j;

    /* renamed from: f  reason: collision with root package name */
    public int f2820f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f2821g = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2822h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2823i = true;

    /* renamed from: k  reason: collision with root package name */
    public final n f2825k = new n(this);

    /* renamed from: l  reason: collision with root package name */
    public Runnable f2826l = new a();

    /* renamed from: m  reason: collision with root package name */
    public x.a f2827m = new b();

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v vVar = v.this;
            if (vVar.f2821g == 0) {
                vVar.f2822h = true;
                vVar.f2825k.e(Lifecycle.Event.ON_PAUSE);
            }
            v vVar2 = v.this;
            if (vVar2.f2820f == 0 && vVar2.f2822h) {
                vVar2.f2825k.e(Lifecycle.Event.ON_STOP);
                vVar2.f2823i = true;
            }
        }
    }

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    public class b implements x.a {
        public b() {
        }
    }

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public void a() {
        int i2 = this.f2821g + 1;
        this.f2821g = i2;
        if (i2 == 1) {
            if (this.f2822h) {
                this.f2825k.e(Lifecycle.Event.ON_RESUME);
                this.f2822h = false;
                return;
            }
            this.f2824j.removeCallbacks(this.f2826l);
        }
    }

    public void c() {
        int i2 = this.f2820f + 1;
        this.f2820f = i2;
        if (i2 == 1 && this.f2823i) {
            this.f2825k.e(Lifecycle.Event.ON_START);
            this.f2823i = false;
        }
    }

    @Override // e.s.m
    public Lifecycle getLifecycle() {
        return this.f2825k;
    }
}
