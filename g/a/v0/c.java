package g.a.v0;

/* compiled from: AbstractReadableBuffer.java */
/* loaded from: classes2.dex */
public abstract class c implements d2 {
    public final void a(int i2) {
        if (c() < i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // g.a.v0.d2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
