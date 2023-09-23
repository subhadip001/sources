package f.h.b.a.i.w.i;

import java.util.Objects;

/* compiled from: AutoValue_PersistedEvent.java */
/* loaded from: classes.dex */
public final class y extends g0 {
    public final long a;
    public final f.h.b.a.i.l b;
    public final f.h.b.a.i.h c;

    public y(long j2, f.h.b.a.i.l lVar, f.h.b.a.i.h hVar) {
        this.a = j2;
        Objects.requireNonNull(lVar, "Null transportContext");
        this.b = lVar;
        Objects.requireNonNull(hVar, "Null event");
        this.c = hVar;
    }

    @Override // f.h.b.a.i.w.i.g0
    public f.h.b.a.i.h a() {
        return this.c;
    }

    @Override // f.h.b.a.i.w.i.g0
    public long b() {
        return this.a;
    }

    @Override // f.h.b.a.i.w.i.g0
    public f.h.b.a.i.l c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return this.a == g0Var.b() && this.b.equals(g0Var.c()) && this.c.equals(g0Var.a());
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        return this.c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("PersistedEvent{id=");
        A.append(this.a);
        A.append(", transportContext=");
        A.append(this.b);
        A.append(", event=");
        A.append(this.c);
        A.append("}");
        return A.toString();
    }
}
