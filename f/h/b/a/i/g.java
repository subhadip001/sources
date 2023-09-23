package f.h.b.a.i;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: EncodedPayload.java */
/* loaded from: classes.dex */
public final class g {
    public final f.h.b.a.b a;
    public final byte[] b;

    public g(f.h.b.a.b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.a = bVar;
        this.b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.a.equals(gVar.a)) {
                return Arrays.equals(this.b, gVar.b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("EncodedPayload{encoding=");
        A.append(this.a);
        A.append(", bytes=[...]}");
        return A.toString();
    }
}
