package f.h.b.b;

/* compiled from: MediaMetadata.java */
/* loaded from: classes.dex */
public final class v0 {
    public final String a = null;

    public v0(String str, a aVar) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        return f.h.b.b.g2.b0.a(this.a, ((v0) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
