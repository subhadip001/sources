package i.n;

/* compiled from: Ranges.kt */
/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: i  reason: collision with root package name */
    public static final c f8662i = null;

    /* renamed from: j  reason: collision with root package name */
    public static final c f8663j = new c(1, 0);

    public c(int i2, int i3) {
        super(i2, i3, 1);
    }

    public boolean a(int i2) {
        return this.f8655f <= i2 && i2 <= this.f8656g;
    }

    @Override // i.n.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f8655f != cVar.f8655f || this.f8656g != cVar.f8656g) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // i.n.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f8655f * 31) + this.f8656g;
    }

    @Override // i.n.a
    public boolean isEmpty() {
        return this.f8655f > this.f8656g;
    }

    @Override // i.n.a
    public String toString() {
        return this.f8655f + ".." + this.f8656g;
    }
}
