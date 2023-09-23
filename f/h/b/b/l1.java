package f.h.b.b;

/* compiled from: RendererConfiguration.java */
/* loaded from: classes.dex */
public final class l1 {
    public static final l1 b = new l1(false);
    public final boolean a;

    public l1(boolean z) {
        this.a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && l1.class == obj.getClass() && this.a == ((l1) obj).a;
    }

    public int hashCode() {
        return !this.a ? 1 : 0;
    }
}
