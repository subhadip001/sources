package k.c0.g;

import java.util.List;
import k.n;
import k.s;
import k.v;
import k.y;

/* compiled from: RealInterceptorChain.java */
/* loaded from: classes2.dex */
public final class f implements s.a {
    public final List<s> a;
    public final k.c0.f.f b;
    public final c c;

    /* renamed from: d  reason: collision with root package name */
    public final k.c0.f.c f8938d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8939e;

    /* renamed from: f  reason: collision with root package name */
    public final v f8940f;

    /* renamed from: g  reason: collision with root package name */
    public final k.e f8941g;

    /* renamed from: h  reason: collision with root package name */
    public final n f8942h;

    /* renamed from: i  reason: collision with root package name */
    public final int f8943i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8944j;

    /* renamed from: k  reason: collision with root package name */
    public final int f8945k;

    /* renamed from: l  reason: collision with root package name */
    public int f8946l;

    public f(List<s> list, k.c0.f.f fVar, c cVar, k.c0.f.c cVar2, int i2, v vVar, k.e eVar, n nVar, int i3, int i4, int i5) {
        this.a = list;
        this.f8938d = cVar2;
        this.b = fVar;
        this.c = cVar;
        this.f8939e = i2;
        this.f8940f = vVar;
        this.f8941g = eVar;
        this.f8942h = nVar;
        this.f8943i = i3;
        this.f8944j = i4;
        this.f8945k = i5;
    }

    public y a(v vVar) {
        return b(vVar, this.b, this.c, this.f8938d);
    }

    public y b(v vVar, k.c0.f.f fVar, c cVar, k.c0.f.c cVar2) {
        if (this.f8939e < this.a.size()) {
            this.f8946l++;
            if (this.c != null && !this.f8938d.j(vVar.a)) {
                StringBuilder A = f.a.b.a.a.A("network interceptor ");
                A.append(this.a.get(this.f8939e - 1));
                A.append(" must retain the same host and port");
                throw new IllegalStateException(A.toString());
            }
            if (this.c != null && this.f8946l > 1) {
                StringBuilder A2 = f.a.b.a.a.A("network interceptor ");
                A2.append(this.a.get(this.f8939e - 1));
                A2.append(" must call proceed() exactly once");
                throw new IllegalStateException(A2.toString());
            }
            List<s> list = this.a;
            int i2 = this.f8939e;
            f fVar2 = new f(list, fVar, cVar, cVar2, i2 + 1, vVar, this.f8941g, this.f8942h, this.f8943i, this.f8944j, this.f8945k);
            s sVar = list.get(i2);
            y a = sVar.a(fVar2);
            if (cVar != null && this.f8939e + 1 < this.a.size() && fVar2.f8946l != 1) {
                throw new IllegalStateException("network interceptor " + sVar + " must call proceed() exactly once");
            } else if (a != null) {
                if (a.f9186l != null) {
                    return a;
                }
                throw new IllegalStateException("interceptor " + sVar + " returned a response with no body");
            } else {
                throw new NullPointerException("interceptor " + sVar + " returned null");
            }
        }
        throw new AssertionError();
    }
}
