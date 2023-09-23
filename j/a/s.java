package j.a;

/* compiled from: CompletionState.kt */
/* loaded from: classes2.dex */
public final class s {
    public final Object a;
    public final i.l.a.l<Throwable, i.h> b;

    /* JADX WARN: Multi-variable type inference failed */
    public s(Object obj, i.l.a.l<? super Throwable, i.h> lVar) {
        this.a = obj;
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return i.l.b.i.a(this.a, sVar.a) && i.l.b.i.a(this.b, sVar.b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("CompletedWithCancellation(result=");
        A.append(this.a);
        A.append(", onCancellation=");
        A.append(this.b);
        A.append(')');
        return A.toString();
    }
}
