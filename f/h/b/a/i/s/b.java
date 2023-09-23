package f.h.b.a.i.s;

import com.google.android.datatransport.runtime.backends.BackendResponse;
import java.util.Objects;

/* compiled from: AutoValue_BackendResponse.java */
/* loaded from: classes.dex */
public final class b extends BackendResponse {
    public final BackendResponse.Status a;
    public final long b;

    public b(BackendResponse.Status status, long j2) {
        Objects.requireNonNull(status, "Null status");
        this.a = status;
        this.b = j2;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BackendResponse) {
            BackendResponse backendResponse = (BackendResponse) obj;
            return this.a.equals(backendResponse.c()) && this.b == backendResponse.b();
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.b;
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("BackendResponse{status=");
        A.append(this.a);
        A.append(", nextRequestWaitMillis=");
        A.append(this.b);
        A.append("}");
        return A.toString();
    }
}
