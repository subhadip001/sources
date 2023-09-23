package f.h.b.b.f2;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: BandwidthMeter.java */
/* loaded from: classes.dex */
public interface d {

    /* compiled from: BandwidthMeter.java */
    /* loaded from: classes.dex */
    public interface a {

        /* compiled from: BandwidthMeter.java */
        /* renamed from: f.h.b.b.f2.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0107a {
            public final CopyOnWriteArrayList<C0108a> a = new CopyOnWriteArrayList<>();

            /* compiled from: BandwidthMeter.java */
            /* renamed from: f.h.b.b.f2.d$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0108a {
                public final Handler a;
                public final a b;
                public boolean c;

                public C0108a(Handler handler, a aVar) {
                    this.a = handler;
                    this.b = aVar;
                }
            }

            public void a(a aVar) {
                Iterator<C0108a> it = this.a.iterator();
                while (it.hasNext()) {
                    C0108a next = it.next();
                    if (next.b == aVar) {
                        next.c = true;
                        this.a.remove(next);
                    }
                }
            }
        }
    }

    t c();

    void d(a aVar);

    void f(Handler handler, a aVar);
}
