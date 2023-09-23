package f.h.b.d.a.i;

import com.google.android.play.core.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

/* JADX WARN: Incorrect class signature, class is equals to this class: <ResultT:Ljava/lang/Object;>Lf/h/b/d/a/i/p<TResultT;>; */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class p<ResultT> {
    public final Object a = new Object();
    public final l b = new l();
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public Object f5830d;

    /* renamed from: e  reason: collision with root package name */
    public Exception f5831e;

    public final p<ResultT> a(a<ResultT> aVar) {
        this.b.a(new f(d.a, aVar));
        g();
        return this;
    }

    public final p<ResultT> b(Executor executor, c<? super ResultT> cVar) {
        this.b.a(new j(executor, cVar));
        g();
        return this;
    }

    public final ResultT c() {
        ResultT resultt;
        synchronized (this.a) {
            if (this.c) {
                Exception exc = this.f5831e;
                if (exc == null) {
                    resultt = (ResultT) this.f5830d;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw new IllegalStateException("Task is not yet complete");
            }
        }
        return resultt;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && this.f5831e == null) {
                z = true;
            }
        }
        return z;
    }

    public final void e(Exception exc) {
        synchronized (this.a) {
            if (!this.c) {
                this.c = true;
                this.f5831e = exc;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        this.b.b(this);
    }

    public final void f(Object obj) {
        synchronized (this.a) {
            if (!this.c) {
                this.c = true;
                this.f5830d = obj;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        this.b.b(this);
    }

    public final void g() {
        synchronized (this.a) {
            if (this.c) {
                this.b.b(this);
            }
        }
    }
}
