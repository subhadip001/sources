package l;

/* compiled from: ForwardingSink.java */
/* loaded from: classes2.dex */
public abstract class j implements x {

    /* renamed from: f  reason: collision with root package name */
    public final x f9236f;

    public j(x xVar) {
        if (xVar != null) {
            this.f9236f = xVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // l.x
    public void J(f fVar, long j2) {
        this.f9236f.J(fVar, j2);
    }

    @Override // l.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9236f.close();
    }

    @Override // l.x
    public z d() {
        return this.f9236f.d();
    }

    @Override // l.x, java.io.Flushable
    public void flush() {
        this.f9236f.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f9236f.toString() + ")";
    }
}
