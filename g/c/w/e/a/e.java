package g.c.w.e.a;

import f.n.a.n.i;
import io.reactivex.exceptions.CompositeException;

/* compiled from: CompletableOnErrorComplete.java */
/* loaded from: classes2.dex */
public final class e extends g.c.a {
    public final g.c.c a;
    public final g.c.v.e<? super Throwable> b;

    /* compiled from: CompletableOnErrorComplete.java */
    /* loaded from: classes2.dex */
    public final class a implements g.c.b {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.b f8161f;

        public a(g.c.b bVar) {
            this.f8161f = bVar;
        }

        @Override // g.c.b
        public void onComplete() {
            this.f8161f.onComplete();
        }

        @Override // g.c.b
        public void onError(Throwable th) {
            try {
                if (e.this.b.a(th)) {
                    this.f8161f.onComplete();
                } else {
                    this.f8161f.onError(th);
                }
            } catch (Throwable th2) {
                i.d0(th2);
                this.f8161f.onError(new CompositeException(th, th2));
            }
        }

        @Override // g.c.b
        public void onSubscribe(g.c.t.b bVar) {
            this.f8161f.onSubscribe(bVar);
        }
    }

    public e(g.c.c cVar, g.c.v.e<? super Throwable> eVar) {
        this.a = cVar;
        this.b = eVar;
    }

    @Override // g.c.a
    public void h(g.c.b bVar) {
        this.a.b(new a(bVar));
    }
}
