package g.c.w.d;

import f.n.a.n.i;
import g.c.n;
import io.reactivex.internal.disposables.DisposableHelper;

/* compiled from: BasicFuseableObserver.java */
/* loaded from: classes2.dex */
public abstract class a<T, R> implements n<T>, g.c.w.c.e<R> {

    /* renamed from: f  reason: collision with root package name */
    public final n<? super R> f8148f;

    /* renamed from: g  reason: collision with root package name */
    public g.c.t.b f8149g;

    /* renamed from: h  reason: collision with root package name */
    public g.c.w.c.e<T> f8150h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8151i;

    /* renamed from: j  reason: collision with root package name */
    public int f8152j;

    public a(n<? super R> nVar) {
        this.f8148f = nVar;
    }

    public final int a(int i2) {
        g.c.w.c.e<T> eVar = this.f8150h;
        if (eVar == null || (i2 & 4) != 0) {
            return 0;
        }
        int requestFusion = eVar.requestFusion(i2);
        if (requestFusion != 0) {
            this.f8152j = requestFusion;
        }
        return requestFusion;
    }

    @Override // g.c.w.c.j
    public void clear() {
        this.f8150h.clear();
    }

    @Override // g.c.t.b
    public void dispose() {
        this.f8149g.dispose();
    }

    @Override // g.c.w.c.j
    public boolean isEmpty() {
        return this.f8150h.isEmpty();
    }

    @Override // g.c.w.c.j
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // g.c.n
    public void onComplete() {
        if (this.f8151i) {
            return;
        }
        this.f8151i = true;
        this.f8148f.onComplete();
    }

    @Override // g.c.n
    public void onError(Throwable th) {
        if (this.f8151i) {
            i.L(th);
            return;
        }
        this.f8151i = true;
        this.f8148f.onError(th);
    }

    @Override // g.c.n
    public final void onSubscribe(g.c.t.b bVar) {
        if (DisposableHelper.validate(this.f8149g, bVar)) {
            this.f8149g = bVar;
            if (bVar instanceof g.c.w.c.e) {
                this.f8150h = (g.c.w.c.e) bVar;
            }
            this.f8148f.onSubscribe(this);
        }
    }
}
