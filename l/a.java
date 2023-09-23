package l;

import java.io.IOException;

/* compiled from: AsyncTimeout.java */
/* loaded from: classes2.dex */
public class a implements x {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f9217f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c f9218g;

    public a(c cVar, x xVar) {
        this.f9218g = cVar;
        this.f9217f = xVar;
    }

    @Override // l.x
    public void J(f fVar, long j2) {
        a0.b(fVar.f9230g, 0L, j2);
        while (true) {
            long j3 = 0;
            if (j2 <= 0) {
                return;
            }
            u uVar = fVar.f9229f;
            while (true) {
                if (j3 >= 65536) {
                    break;
                }
                j3 += uVar.c - uVar.b;
                if (j3 >= j2) {
                    j3 = j2;
                    break;
                }
                uVar = uVar.f9262f;
            }
            this.f9218g.i();
            try {
                try {
                    this.f9217f.J(fVar, j3);
                    j2 -= j3;
                    this.f9218g.j(true);
                } catch (IOException e2) {
                    c cVar = this.f9218g;
                    if (!cVar.k()) {
                        throw e2;
                    }
                    throw cVar.l(e2);
                }
            } catch (Throwable th) {
                this.f9218g.j(false);
                throw th;
            }
        }
    }

    @Override // l.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9218g.i();
        try {
            try {
                this.f9217f.close();
                this.f9218g.j(true);
            } catch (IOException e2) {
                c cVar = this.f9218g;
                if (!cVar.k()) {
                    throw e2;
                }
                throw cVar.l(e2);
            }
        } catch (Throwable th) {
            this.f9218g.j(false);
            throw th;
        }
    }

    @Override // l.x
    public z d() {
        return this.f9218g;
    }

    @Override // l.x, java.io.Flushable
    public void flush() {
        this.f9218g.i();
        try {
            try {
                this.f9217f.flush();
                this.f9218g.j(true);
            } catch (IOException e2) {
                c cVar = this.f9218g;
                if (!cVar.k()) {
                    throw e2;
                }
                throw cVar.l(e2);
            }
        } catch (Throwable th) {
            this.f9218g.j(false);
            throw th;
        }
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("AsyncTimeout.sink(");
        A.append(this.f9217f);
        A.append(")");
        return A.toString();
    }
}
