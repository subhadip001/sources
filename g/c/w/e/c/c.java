package g.c.w.e.c;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import f.h.e.n.e.j1;
import g.c.w.e.c.c;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeCreate.java */
/* loaded from: classes2.dex */
public final class c<T> extends g.c.h<T> {

    /* renamed from: f  reason: collision with root package name */
    public final j1<T> f8340f;

    /* compiled from: MaybeCreate.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<g.c.t.b> implements g.c.i<T>, g.c.t.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.j<? super T> f8341f;

        public a(g.c.j<? super T> jVar) {
            this.f8341f = jVar;
        }

        public void a() {
            g.c.t.b andSet;
            g.c.t.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                this.f8341f.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        public void b(Throwable th) {
            boolean z;
            g.c.t.b andSet;
            Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
            g.c.t.b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                z = false;
            } else {
                try {
                    this.f8341f.onError(nullPointerException);
                    z = true;
                } finally {
                    if (andSet != null) {
                        andSet.dispose();
                    }
                }
            }
            if (z) {
                return;
            }
            f.n.a.n.i.L(th);
        }

        @Override // g.c.t.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public c(j1<T> j1Var) {
        this.f8340f = j1Var;
    }

    @Override // g.c.h
    public void l(g.c.j<? super T> jVar) {
        final a aVar = new a(jVar);
        jVar.onSubscribe(aVar);
        try {
            Task task = this.f8340f.a;
            task.addOnSuccessListener(new OnSuccessListener() { // from class: f.h.e.n.e.l1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    g.c.t.b andSet;
                    c.a aVar2 = (c.a) g.c.i.this;
                    g.c.t.b bVar = aVar2.get();
                    DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                    if (bVar != disposableHelper && (andSet = aVar2.getAndSet(disposableHelper)) != disposableHelper) {
                        try {
                            if (obj == null) {
                                aVar2.f8341f.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                            } else {
                                aVar2.f8341f.onSuccess(obj);
                            }
                            if (andSet != null) {
                                andSet.dispose();
                            }
                        } catch (Throwable th) {
                            if (andSet != null) {
                                andSet.dispose();
                            }
                            throw th;
                        }
                    }
                    aVar2.a();
                }
            });
            task.addOnFailureListener(new OnFailureListener() { // from class: f.h.e.n.e.y0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    c.a aVar2 = (c.a) g.c.i.this;
                    aVar2.b(exc);
                    aVar2.a();
                }
            });
        } catch (Throwable th) {
            f.n.a.n.i.d0(th);
            aVar.b(th);
        }
    }
}
