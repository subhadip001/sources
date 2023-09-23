package j.a;

import java.util.Objects;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes2.dex */
public abstract class p0 extends z {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f8770j = 0;

    /* renamed from: g  reason: collision with root package name */
    public long f8771g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8772h;

    /* renamed from: i  reason: collision with root package name */
    public j.a.y1.a<k0<?>> f8773i;

    public final void i0(boolean z) {
        long m0 = this.f8771g - m0(z);
        this.f8771g = m0;
        if (m0 <= 0 && this.f8772h) {
            shutdown();
        }
    }

    public final long m0(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public final void q0(k0<?> k0Var) {
        j.a.y1.a<k0<?>> aVar = this.f8773i;
        if (aVar == null) {
            aVar = new j.a.y1.a<>();
            this.f8773i = aVar;
        }
        Object[] objArr = aVar.a;
        int i2 = aVar.c;
        objArr[i2] = k0Var;
        int length = (objArr.length - 1) & (i2 + 1);
        aVar.c = length;
        int i3 = aVar.b;
        if (length == i3) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            f.n.a.n.i.l(objArr, objArr2, 0, i3, 0, 10);
            Object[] objArr3 = aVar.a;
            int length3 = objArr3.length;
            int i4 = aVar.b;
            f.n.a.n.i.l(objArr3, objArr2, length3 - i4, 0, i4, 4);
            aVar.a = objArr2;
            aVar.b = 0;
            aVar.c = length2;
        }
    }

    public final void r0(boolean z) {
        this.f8771g = m0(z) + this.f8771g;
        if (z) {
            return;
        }
        this.f8772h = true;
    }

    public final boolean s0() {
        return this.f8771g >= m0(true);
    }

    public void shutdown() {
    }

    public long t0() {
        return !u0() ? Long.MAX_VALUE : 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    public final boolean u0() {
        j.a.y1.a<k0<?>> aVar = this.f8773i;
        if (aVar == null) {
            return false;
        }
        int i2 = aVar.b;
        k0 k0Var = null;
        if (i2 != aVar.c) {
            ?? r3 = aVar.a;
            ?? r6 = r3[i2];
            r3[i2] = 0;
            aVar.b = (i2 + 1) & (r3.length - 1);
            Objects.requireNonNull(r6, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            k0Var = r6;
        }
        k0 k0Var2 = k0Var;
        if (k0Var2 == null) {
            return false;
        }
        k0Var2.run();
        return true;
    }
}
