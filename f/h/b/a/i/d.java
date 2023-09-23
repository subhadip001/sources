package f.h.b.a.i;

import com.google.android.datatransport.Priority;
import f.h.b.a.i.l;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: AutoValue_TransportContext.java */
/* loaded from: classes.dex */
public final class d extends l {
    public final String a;
    public final byte[] b;
    public final Priority c;

    /* compiled from: AutoValue_TransportContext.java */
    /* loaded from: classes.dex */
    public static final class b extends l.a {
        public String a;
        public byte[] b;
        public Priority c;

        @Override // f.h.b.a.i.l.a
        public l a() {
            String str = this.a == null ? " backendName" : "";
            if (this.c == null) {
                str = f.a.b.a.a.p(str, " priority");
            }
            if (str.isEmpty()) {
                return new d(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(f.a.b.a.a.p("Missing required properties:", str));
        }

        @Override // f.h.b.a.i.l.a
        public l.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.a = str;
            return this;
        }

        @Override // f.h.b.a.i.l.a
        public l.a c(Priority priority) {
            Objects.requireNonNull(priority, "Null priority");
            this.c = priority;
            return this;
        }
    }

    public d(String str, byte[] bArr, Priority priority, a aVar) {
        this.a = str;
        this.b = bArr;
        this.c = priority;
    }

    @Override // f.h.b.a.i.l
    public String b() {
        return this.a;
    }

    @Override // f.h.b.a.i.l
    public byte[] c() {
        return this.b;
    }

    @Override // f.h.b.a.i.l
    public Priority d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.a.equals(lVar.b())) {
                if (Arrays.equals(this.b, lVar instanceof d ? ((d) lVar).b : lVar.c()) && this.c.equals(lVar.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
