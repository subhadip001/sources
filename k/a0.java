package k;

import java.io.Closeable;

/* compiled from: ResponseBody.java */
/* loaded from: classes2.dex */
public abstract class a0 implements Closeable {
    public abstract long a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        k.c0.c.d(f());
    }

    public abstract l.h f();
}
