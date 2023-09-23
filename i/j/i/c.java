package i.j.i;

import i.j.j.a.g;
import i.l.a.p;
import i.l.b.i;
import i.l.b.q;

/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes2.dex */
public final class c extends g {

    /* renamed from: g  reason: collision with root package name */
    public int f8628g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p f8629h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f8630i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i.j.d dVar, p pVar, Object obj) {
        super(dVar);
        this.f8629h = pVar;
        this.f8630i = obj;
        i.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // i.j.j.a.a
    public Object l(Object obj) {
        int i2 = this.f8628g;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f8628g = 2;
                f.n.a.n.i.e0(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f8628g = 1;
        f.n.a.n.i.e0(obj);
        i.c(this.f8629h, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
        p pVar = this.f8629h;
        q.a(pVar, 2);
        return pVar.k(this.f8630i, this);
    }
}
