package l;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: Sink.java */
/* loaded from: classes2.dex */
public interface x extends Closeable, Flushable {
    void J(f fVar, long j2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    z d();

    void flush();
}
