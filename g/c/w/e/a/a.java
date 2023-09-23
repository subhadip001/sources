package g.c.w.e.a;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CompletableConcatArray.java */
/* loaded from: classes2.dex */
public final class a extends g.c.a {
    public final g.c.c[] a;

    /* compiled from: CompletableConcatArray.java */
    /* renamed from: g.c.w.e.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0207a extends AtomicInteger implements g.c.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.b f8157f;

        /* renamed from: g  reason: collision with root package name */
        public final g.c.c[] f8158g;

        /* renamed from: h  reason: collision with root package name */
        public int f8159h;

        /* renamed from: i  reason: collision with root package name */
        public final g.c.w.a.c f8160i = new g.c.w.a.c();

        public C0207a(g.c.b bVar, g.c.c[] cVarArr) {
            this.f8157f = bVar;
            this.f8158g = cVarArr;
        }

        public void a() {
            if (!this.f8160i.a() && getAndIncrement() == 0) {
                g.c.c[] cVarArr = this.f8158g;
                while (!this.f8160i.a()) {
                    int i2 = this.f8159h;
                    this.f8159h = i2 + 1;
                    if (i2 == cVarArr.length) {
                        this.f8157f.onComplete();
                        return;
                    }
                    cVarArr[i2].b(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // g.c.b
        public void onComplete() {
            a();
        }

        @Override // g.c.b
        public void onError(Throwable th) {
            this.f8157f.onError(th);
        }

        @Override // g.c.b
        public void onSubscribe(g.c.t.b bVar) {
            g.c.w.a.c cVar = this.f8160i;
            Objects.requireNonNull(cVar);
            DisposableHelper.replace(cVar, bVar);
        }
    }

    public a(g.c.c[] cVarArr) {
        this.a = cVarArr;
    }

    @Override // g.c.a
    public void h(g.c.b bVar) {
        C0207a c0207a = new C0207a(bVar, this.a);
        bVar.onSubscribe(c0207a.f8160i);
        c0207a.a();
    }
}
