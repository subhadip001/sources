package f.h.b.a.h.e;

import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import java.util.Objects;

/* compiled from: AutoValue_BatchedLogRequest.java */
/* loaded from: classes.dex */
public final class d extends j {
    public final List<l> a;

    public d(List<l> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.a = list;
    }

    @Override // f.h.b.a.h.e.j
    @Encodable.Field(name = "logRequest")
    public List<l> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.a.equals(((j) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("BatchedLogRequest{logRequests=");
        A.append(this.a);
        A.append("}");
        return A.toString();
    }
}
