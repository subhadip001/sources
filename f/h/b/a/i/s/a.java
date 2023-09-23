package f.h.b.a.i.s;

import java.util.Arrays;

/* compiled from: AutoValue_BackendRequest.java */
/* loaded from: classes.dex */
public final class a extends f {
    public final Iterable<f.h.b.a.i.h> a;
    public final byte[] b;

    public a(Iterable iterable, byte[] bArr, C0097a c0097a) {
        this.a = iterable;
        this.b = bArr;
    }

    @Override // f.h.b.a.i.s.f
    public Iterable<f.h.b.a.i.h> a() {
        return this.a;
    }

    @Override // f.h.b.a.i.s.f
    public byte[] b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.a.equals(fVar.a())) {
                if (Arrays.equals(this.b, fVar instanceof a ? ((a) fVar).b : fVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("BackendRequest{events=");
        A.append(this.a);
        A.append(", extras=");
        A.append(Arrays.toString(this.b));
        A.append("}");
        return A.toString();
    }
}
