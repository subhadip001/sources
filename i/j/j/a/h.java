package i.j.j.a;

import i.l.b.i;
import i.l.b.o;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class h extends c implements i.l.b.f<Object> {

    /* renamed from: i  reason: collision with root package name */
    public final int f8638i;

    public h(int i2, i.j.d<Object> dVar) {
        super(dVar);
        this.f8638i = i2;
    }

    @Override // i.l.b.f
    public int d() {
        return this.f8638i;
    }

    @Override // i.j.j.a.a
    public String toString() {
        if (this.f8634f == null) {
            String a = o.a.a(this);
            i.d(a, "renderLambdaToString(this)");
            return a;
        }
        return super.toString();
    }
}
