package j.a;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes2.dex */
public final class z0 extends f {

    /* renamed from: f  reason: collision with root package name */
    public final i.l.a.l<Throwable, i.h> f8827f;

    /* JADX WARN: Multi-variable type inference failed */
    public z0(i.l.a.l<? super Throwable, i.h> lVar) {
        this.f8827f = lVar;
    }

    @Override // j.a.g
    public void a(Throwable th) {
        this.f8827f.b(th);
    }

    @Override // i.l.a.l
    public i.h b(Throwable th) {
        this.f8827f.b(th);
        return i.h.a;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("InvokeOnCancel[");
        A.append(e0.a(this.f8827f));
        A.append('@');
        A.append(e0.b(this));
        A.append(']');
        return A.toString();
    }
}
