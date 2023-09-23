package g.a.v0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import g.a.v0.t2;
import g.a.v0.v1;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: ApplicationThreadDeframerListener.java */
/* loaded from: classes2.dex */
public final class h implements v1.b {
    public final d a;
    public final v1.b b;
    public final Queue<InputStream> c = new ArrayDeque();

    /* compiled from: ApplicationThreadDeframerListener.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f7745f;

        public a(int i2) {
            this.f7745f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.b.c(this.f7745f);
        }
    }

    /* compiled from: ApplicationThreadDeframerListener.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ boolean f7747f;

        public b(boolean z) {
            this.f7747f = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.b.b(this.f7747f);
        }
    }

    /* compiled from: ApplicationThreadDeframerListener.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Throwable f7749f;

        public c(Throwable th) {
            this.f7749f = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.b.d(this.f7749f);
        }
    }

    /* compiled from: ApplicationThreadDeframerListener.java */
    /* loaded from: classes2.dex */
    public interface d {
        void e(Runnable runnable);
    }

    public h(v1.b bVar, d dVar) {
        f.h.b.c.a.x(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b = bVar;
        f.h.b.c.a.x(dVar, "transportExecutor");
        this.a = dVar;
    }

    @Override // g.a.v0.v1.b
    public void a(t2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            }
            this.c.add(next);
        }
    }

    @Override // g.a.v0.v1.b
    public void b(boolean z) {
        this.a.e(new b(z));
    }

    @Override // g.a.v0.v1.b
    public void c(int i2) {
        this.a.e(new a(i2));
    }

    @Override // g.a.v0.v1.b
    public void d(Throwable th) {
        this.a.e(new c(th));
    }
}
