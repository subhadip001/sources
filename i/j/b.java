package i.j;

import i.j.f;
import i.j.f.a;
import i.l.a.l;
import i.l.b.i;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public abstract class b<B extends f.a, E extends B> implements f.b<E> {

    /* renamed from: f  reason: collision with root package name */
    public final l<f.a, E> f8616f;

    /* renamed from: g  reason: collision with root package name */
    public final f.b<?> f8617g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [i.l.a.l<? super i.j.f$a, ? extends E extends B>, java.lang.Object, i.l.a.l<i.j.f$a, E extends B>] */
    public b(f.b<B> bVar, l<? super f.a, ? extends E> lVar) {
        i.e(bVar, "baseKey");
        i.e(lVar, "safeCast");
        this.f8616f = lVar;
        this.f8617g = bVar instanceof b ? (f.b<B>) ((b) bVar).f8617g : bVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Li/j/f$a;)TE; */
    public final f.a a(f.a aVar) {
        i.e(aVar, "element");
        return (f.a) this.f8616f.b(aVar);
    }
}
