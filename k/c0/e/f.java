package k.c0.e;

import java.io.IOException;
import l.j;
import l.x;

/* compiled from: FaultHidingSink.java */
/* loaded from: classes2.dex */
public class f extends j {

    /* renamed from: g  reason: collision with root package name */
    public boolean f8910g;

    public f(x xVar) {
        super(xVar);
    }

    @Override // l.j, l.x
    public void J(l.f fVar, long j2) {
        if (this.f8910g) {
            fVar.e(j2);
            return;
        }
        try {
            this.f9236f.J(fVar, j2);
        } catch (IOException e2) {
            this.f8910g = true;
            a(e2);
        }
    }

    public void a(IOException iOException) {
        throw null;
    }

    @Override // l.j, l.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f8910g) {
            return;
        }
        try {
            super.close();
        } catch (IOException e2) {
            this.f8910g = true;
            a(e2);
        }
    }

    @Override // l.j, l.x, java.io.Flushable
    public void flush() {
        if (this.f8910g) {
            return;
        }
        try {
            this.f9236f.flush();
        } catch (IOException e2) {
            this.f8910g = true;
            a(e2);
        }
    }
}
