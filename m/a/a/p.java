package m.a.a;

/* compiled from: Subscription.java */
/* loaded from: classes2.dex */
public final class p {
    public final Object a;
    public final n b;
    public volatile boolean c = true;

    public p(Object obj, n nVar) {
        this.a = obj;
        this.b = nVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.a == pVar.a && this.b.equals(pVar.b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.f9290f.hashCode() + this.a.hashCode();
    }
}
