package e.i.g;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
public class o<T> implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public Callable<T> f2494f;

    /* renamed from: g  reason: collision with root package name */
    public e.i.i.a<T> f2495g;

    /* renamed from: h  reason: collision with root package name */
    public Handler f2496h;

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e.i.i.a f2497f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Object f2498g;

        public a(o oVar, e.i.i.a aVar, Object obj) {
            this.f2497f = aVar;
            this.f2498g = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            this.f2497f.accept(this.f2498g);
        }
    }

    public o(Handler handler, Callable<T> callable, e.i.i.a<T> aVar) {
        this.f2494f = callable;
        this.f2495g = aVar;
        this.f2496h = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        T t;
        try {
            t = this.f2494f.call();
        } catch (Exception unused) {
            t = null;
        }
        this.f2496h.post(new a(this, this.f2495g, t));
    }
}
