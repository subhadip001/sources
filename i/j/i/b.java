package i.j.i;

import i.j.f;
import i.l.a.l;
import i.l.b.i;
import i.l.b.q;

/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes2.dex */
public final class b extends i.j.j.a.c {

    /* renamed from: i  reason: collision with root package name */
    public int f8626i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l f8627j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i.j.d dVar, f fVar, l lVar) {
        super(dVar, fVar);
        this.f8627j = lVar;
        i.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // i.j.j.a.a
    public Object l(Object obj) {
        int i2 = this.f8626i;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f8626i = 2;
                f.n.a.n.i.e0(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f8626i = 1;
        f.n.a.n.i.e0(obj);
        i.c(this.f8627j, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-0>, kotlin.Any?>");
        l lVar = this.f8627j;
        q.a(lVar, 1);
        return lVar.b(this);
    }
}
