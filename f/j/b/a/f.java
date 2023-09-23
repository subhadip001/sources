package f.j.b.a;

import e.v.k;
import i.l.a.p;
import j.a.c0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: BillingManager.kt */
@i.j.j.a.e(c = "com.inverseai.billing.controller.BillingManager$purchaseUpdateListener$1$2", f = "BillingManager.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends i.j.j.a.h implements p<c0, i.j.d<? super i.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f6558j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ d f6559k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ List<f.j.b.c.b> f6560l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, List<f.j.b.c.b> list, i.j.d<? super f> dVar2) {
        super(2, dVar2);
        this.f6559k = dVar;
        this.f6560l = list;
    }

    @Override // i.j.j.a.a
    public final i.j.d<i.h> a(Object obj, i.j.d<?> dVar) {
        return new f(this.f6559k, this.f6560l, dVar);
    }

    @Override // i.l.a.p
    public Object k(c0 c0Var, i.j.d<? super i.h> dVar) {
        return new f(this.f6559k, this.f6560l, dVar).l(i.h.a);
    }

    @Override // i.j.j.a.a
    public final Object l(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f6558j;
        if (i2 == 0) {
            f.n.a.n.i.e0(obj);
            f.j.b.b.a aVar = this.f6559k.a;
            List h2 = i.i.b.h(this.f6560l);
            this.f6558j = 1;
            f.j.b.b.b bVar = (f.j.b.b.b) aVar;
            bVar.a.b();
            e.x.a.f.f a = bVar.f6576e.a();
            bVar.a.c();
            try {
                a.a();
                bVar.a.l();
                bVar.a.g();
                k kVar = bVar.f6576e;
                if (a == kVar.c) {
                    kVar.a.set(false);
                }
                bVar.a.b();
                bVar.a.c();
                try {
                    bVar.c.e(h2);
                    bVar.a.l();
                    bVar.a.g();
                    if (i.h.a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th) {
                    bVar.a.g();
                    throw th;
                }
            } catch (Throwable th2) {
                bVar.a.g();
                bVar.f6576e.c(a);
                throw th2;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            f.n.a.n.i.e0(obj);
        }
        return i.h.a;
    }
}
