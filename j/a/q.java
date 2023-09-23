package j.a;

import java.util.Objects;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes2.dex */
public final class q {
    public final Object a;
    public final f b;
    public final i.l.a.l<Throwable, i.h> c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f8774d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f8775e;

    /* JADX WARN: Multi-variable type inference failed */
    public q(Object obj, f fVar, i.l.a.l<? super Throwable, i.h> lVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = fVar;
        this.c = lVar;
        this.f8774d = obj2;
        this.f8775e = th;
    }

    public static q a(q qVar, Object obj, f fVar, i.l.a.l lVar, Object obj2, Throwable th, int i2) {
        Object obj3 = (i2 & 1) != 0 ? qVar.a : null;
        if ((i2 & 2) != 0) {
            fVar = qVar.b;
        }
        f fVar2 = fVar;
        i.l.a.l<Throwable, i.h> lVar2 = (i2 & 4) != 0 ? qVar.c : null;
        Object obj4 = (i2 & 8) != 0 ? qVar.f8774d : null;
        if ((i2 & 16) != 0) {
            th = qVar.f8775e;
        }
        Objects.requireNonNull(qVar);
        return new q(obj3, fVar2, lVar2, obj4, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return i.l.b.i.a(this.a, qVar.a) && i.l.b.i.a(this.b, qVar.b) && i.l.b.i.a(this.c, qVar.c) && i.l.b.i.a(this.f8774d, qVar.f8774d) && i.l.b.i.a(this.f8775e, qVar.f8775e);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        f fVar = this.b;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        i.l.a.l<Throwable, i.h> lVar = this.c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f8774d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f8775e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("CompletedContinuation(result=");
        A.append(this.a);
        A.append(", cancelHandler=");
        A.append(this.b);
        A.append(", onCancellation=");
        A.append(this.c);
        A.append(", idempotentResume=");
        A.append(this.f8774d);
        A.append(", cancelCause=");
        A.append(this.f8775e);
        A.append(')');
        return A.toString();
    }

    public q(Object obj, f fVar, i.l.a.l lVar, Object obj2, Throwable th, int i2) {
        fVar = (i2 & 2) != 0 ? null : fVar;
        lVar = (i2 & 4) != 0 ? null : lVar;
        obj2 = (i2 & 8) != 0 ? null : obj2;
        th = (i2 & 16) != 0 ? null : th;
        this.a = obj;
        this.b = fVar;
        this.c = lVar;
        this.f8774d = obj2;
        this.f8775e = th;
    }
}
