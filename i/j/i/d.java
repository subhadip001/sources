package i.j.i;

import i.j.f;
import i.l.a.p;
import i.l.b.i;
import i.l.b.q;

/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes2.dex */
public final class d extends i.j.j.a.c {

    /* renamed from: i  reason: collision with root package name */
    public int f8631i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p f8632j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f8633k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i.j.d dVar, f fVar, p pVar, Object obj) {
        super(dVar, fVar);
        this.f8632j = pVar;
        this.f8633k = obj;
        i.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // i.j.j.a.a
    public Object l(Object obj) {
        int i2 = this.f8631i;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f8631i = 2;
                f.n.a.n.i.e0(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f8631i = 1;
        f.n.a.n.i.e0(obj);
        i.c(this.f8632j, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
        p pVar = this.f8632j;
        q.a(pVar, 2);
        return pVar.k(this.f8633k, this);
    }
}
