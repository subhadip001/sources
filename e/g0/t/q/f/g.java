package e.g0.t.q.f;

import android.content.Context;

/* compiled from: Trackers.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: e  reason: collision with root package name */
    public static g f2317e;
    public a a;
    public b b;
    public e c;

    /* renamed from: d  reason: collision with root package name */
    public f f2318d;

    public g(Context context, e.g0.t.t.t.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = new a(applicationContext, aVar);
        this.b = new b(applicationContext, aVar);
        this.c = new e(applicationContext, aVar);
        this.f2318d = new f(applicationContext, aVar);
    }

    public static synchronized g a(Context context, e.g0.t.t.t.a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f2317e == null) {
                f2317e = new g(context, aVar);
            }
            gVar = f2317e;
        }
        return gVar;
    }
}
