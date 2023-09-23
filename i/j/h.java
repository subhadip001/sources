package i.j;

import i.j.f;
import i.l.a.p;
import i.l.b.i;
import java.io.Serializable;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public final class h implements f, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final h f8623f = new h();

    @Override // i.j.f
    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        i.e(pVar, "operation");
        return r;
    }

    @Override // i.j.f
    public <E extends f.a> E get(f.b<E> bVar) {
        i.e(bVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // i.j.f
    public f minusKey(f.b<?> bVar) {
        i.e(bVar, "key");
        return this;
    }

    @Override // i.j.f
    public f plus(f fVar) {
        i.e(fVar, "context");
        return fVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
