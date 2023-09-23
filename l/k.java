package l;

/* compiled from: ForwardingSource.java */
/* loaded from: classes2.dex */
public abstract class k implements y {

    /* renamed from: f  reason: collision with root package name */
    public final y f9237f;

    public k(y yVar) {
        if (yVar != null) {
            this.f9237f = yVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // l.y
    public long a0(f fVar, long j2) {
        return this.f9237f.a0(fVar, j2);
    }

    @Override // l.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9237f.close();
    }

    @Override // l.y
    public z d() {
        return this.f9237f.d();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f9237f.toString() + ")";
    }
}
