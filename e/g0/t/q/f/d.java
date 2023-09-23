package e.g0.t.q.f;

import android.content.Context;
import e.g0.k;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class d<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final String f2307f = k.e("ConstraintTracker");
    public final e.g0.t.t.t.a a;
    public final Context b;
    public final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final Set<e.g0.t.q.a<T>> f2308d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    public T f2309e;

    /* compiled from: ConstraintTracker.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ List f2310f;

        public a(List list) {
            this.f2310f = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (e.g0.t.q.a aVar : this.f2310f) {
                aVar.a(d.this.f2309e);
            }
        }
    }

    public d(Context context, e.g0.t.t.t.a aVar) {
        this.b = context.getApplicationContext();
        this.a = aVar;
    }

    public abstract T a();

    public void b(e.g0.t.q.a<T> aVar) {
        synchronized (this.c) {
            if (this.f2308d.remove(aVar) && this.f2308d.isEmpty()) {
                e();
            }
        }
    }

    public void c(T t) {
        synchronized (this.c) {
            T t2 = this.f2309e;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.f2309e = t;
                ((e.g0.t.t.t.b) this.a).c.execute(new a(new ArrayList(this.f2308d)));
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
