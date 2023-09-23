package i.l.b;

import java.io.Serializable;

/* compiled from: Lambda.kt */
/* loaded from: classes2.dex */
public abstract class j<R> implements f<R>, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final int f8650f;

    public j(int i2) {
        this.f8650f = i2;
    }

    @Override // i.l.b.f
    public int d() {
        return this.f8650f;
    }

    public String toString() {
        String a = o.a.a(this);
        i.d(a, "renderLambdaToString(this)");
        return a;
    }
}
