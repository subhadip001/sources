package f.h.h;

import com.google.protobuf.InvalidProtocolBufferException;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes2.dex */
public class a0 {
    public volatile n0 a;
    public volatile j b;

    static {
        q.a();
    }

    public n0 a(n0 n0Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = n0Var;
                        this.b = j.f6366g;
                    } catch (InvalidProtocolBufferException unused) {
                        this.a = n0Var;
                        this.b = j.f6366g;
                    }
                }
            }
        }
        return this.a;
    }

    public j b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = j.f6366g;
            } else {
                this.b = this.a.toByteString();
            }
            return this.b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            n0 n0Var = this.a;
            n0 n0Var2 = a0Var.a;
            if (n0Var == null && n0Var2 == null) {
                return b().equals(a0Var.b());
            }
            if (n0Var == null || n0Var2 == null) {
                if (n0Var != null) {
                    return n0Var.equals(a0Var.a(n0Var.getDefaultInstanceForType()));
                }
                return a(n0Var2.getDefaultInstanceForType()).equals(n0Var2);
            }
            return n0Var.equals(n0Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
