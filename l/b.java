package l;

import java.io.IOException;

/* compiled from: AsyncTimeout.java */
/* loaded from: classes2.dex */
public class b implements y {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ y f9219f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c f9220g;

    public b(c cVar, y yVar) {
        this.f9220g = cVar;
        this.f9219f = yVar;
    }

    @Override // l.y
    public long a0(f fVar, long j2) {
        this.f9220g.i();
        try {
            try {
                long a0 = this.f9219f.a0(fVar, j2);
                this.f9220g.j(true);
                return a0;
            } catch (IOException e2) {
                c cVar = this.f9220g;
                if (!cVar.k()) {
                    throw e2;
                }
                throw cVar.l(e2);
            }
        } catch (Throwable th) {
            this.f9220g.j(false);
            throw th;
        }
    }

    @Override // l.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            try {
                this.f9219f.close();
                this.f9220g.j(true);
            } catch (IOException e2) {
                c cVar = this.f9220g;
                if (!cVar.k()) {
                    throw e2;
                }
                throw cVar.l(e2);
            }
        } catch (Throwable th) {
            this.f9220g.j(false);
            throw th;
        }
    }

    @Override // l.y
    public z d() {
        return this.f9220g;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("AsyncTimeout.source(");
        A.append(this.f9219f);
        A.append(")");
        return A.toString();
    }
}
