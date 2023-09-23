package f.e.a.l.p;

import f.e.a.l.p.e;
import f.e.a.l.s.c.u;
import java.io.InputStream;

/* compiled from: InputStreamRewinder.java */
/* loaded from: classes.dex */
public final class k implements e<InputStream> {
    public final u a;

    /* compiled from: InputStreamRewinder.java */
    /* loaded from: classes.dex */
    public static final class a implements e.a<InputStream> {
        public final f.e.a.l.q.b0.b a;

        public a(f.e.a.l.q.b0.b bVar) {
            this.a = bVar;
        }

        @Override // f.e.a.l.p.e.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // f.e.a.l.p.e.a
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.a);
        }
    }

    public k(InputStream inputStream, f.e.a.l.q.b0.b bVar) {
        u uVar = new u(inputStream, bVar);
        this.a = uVar;
        uVar.mark(5242880);
    }

    @Override // f.e.a.l.p.e
    public void b() {
        this.a.release();
    }

    @Override // f.e.a.l.p.e
    /* renamed from: c */
    public InputStream a() {
        this.a.reset();
        return this.a;
    }
}
