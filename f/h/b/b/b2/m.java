package f.h.b.b.b2;

import android.os.Handler;
import f.h.b.b.b2.a0;
import f.h.b.b.b2.z;
import f.h.b.b.q1;
import f.h.b.b.x1.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: CompositeMediaSource.java */
/* loaded from: classes.dex */
public abstract class m<T> extends j {

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<T, b> f3887g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public Handler f3888h;

    /* renamed from: i  reason: collision with root package name */
    public f.h.b.b.f2.t f3889i;

    /* JADX WARN: Field signature parse error: f
    jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TT at position 1 ('T'), unexpected: T
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
    	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
     */
    /* compiled from: CompositeMediaSource.java */
    /* loaded from: classes.dex */
    public final class a implements a0, f.h.b.b.x1.a {

        /* renamed from: f  reason: collision with root package name */
        public final Object f3890f;

        /* renamed from: g  reason: collision with root package name */
        public a0.a f3891g;

        /* renamed from: h  reason: collision with root package name */
        public a.C0110a f3892h;

        /* JADX WARN: Failed to parse method signature: (TT)V
        jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: (TT)V at position 2 ('T'), unexpected: T
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeMethodArgs(SignatureParser.java:318)
        	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:154)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:39)
         */
        public a(Object obj) {
            this.f3891g = m.this.c.k(0, null, 0L);
            this.f3892h = m.this.f3868d.a(0, null);
            this.f3890f = obj;
        }

        @Override // f.h.b.b.b2.a0
        public void H(int i2, z.a aVar, s sVar, v vVar) {
            if (a(i2, aVar)) {
                this.f3891g.f(sVar, b(vVar));
            }
        }

        @Override // f.h.b.b.b2.a0
        public void M(int i2, z.a aVar, s sVar, v vVar, IOException iOException, boolean z) {
            if (a(i2, aVar)) {
                this.f3891g.h(sVar, b(vVar), iOException, z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a(int i2, z.a aVar) {
            z.a aVar2;
            if (aVar != null) {
                aVar2 = m.this.s(this.f3890f, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            Objects.requireNonNull(m.this);
            a0.a aVar3 = this.f3891g;
            if (aVar3.a != i2 || !f.h.b.b.g2.b0.a(aVar3.b, aVar2)) {
                this.f3891g = m.this.c.k(i2, aVar2, 0L);
            }
            a.C0110a c0110a = this.f3892h;
            if (c0110a.a == i2 && f.h.b.b.g2.b0.a(c0110a.b, aVar2)) {
                return true;
            }
            this.f3892h = new a.C0110a(m.this.f3868d.c, i2, aVar2);
            return true;
        }

        public final v b(v vVar) {
            m mVar = m.this;
            long j2 = vVar.f3912f;
            Objects.requireNonNull(mVar);
            m mVar2 = m.this;
            long j3 = vVar.f3913g;
            Objects.requireNonNull(mVar2);
            return (j2 == vVar.f3912f && j3 == vVar.f3913g) ? vVar : new v(vVar.a, vVar.b, vVar.c, vVar.f3910d, vVar.f3911e, j2, j3);
        }

        @Override // f.h.b.b.b2.a0
        public void k(int i2, z.a aVar, v vVar) {
            if (a(i2, aVar)) {
                this.f3891g.b(b(vVar));
            }
        }

        @Override // f.h.b.b.b2.a0
        public void l(int i2, z.a aVar, s sVar, v vVar) {
            if (a(i2, aVar)) {
                this.f3891g.d(sVar, b(vVar));
            }
        }

        @Override // f.h.b.b.b2.a0
        public void o(int i2, z.a aVar, s sVar, v vVar) {
            if (a(i2, aVar)) {
                this.f3891g.j(sVar, b(vVar));
            }
        }
    }

    /* compiled from: CompositeMediaSource.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final z a;
        public final z.b b;
        public final a0 c;

        public b(z zVar, z.b bVar, a0 a0Var) {
            this.a = zVar;
            this.b = bVar;
            this.c = a0Var;
        }
    }

    @Override // f.h.b.b.b2.z
    public void g() {
        for (b bVar : this.f3887g.values()) {
            bVar.a.g();
        }
    }

    @Override // f.h.b.b.b2.j
    public void n() {
        for (b bVar : this.f3887g.values()) {
            bVar.a.d(bVar.b);
        }
    }

    @Override // f.h.b.b.b2.j
    public void o() {
        for (b bVar : this.f3887g.values()) {
            bVar.a.l(bVar.b);
        }
    }

    @Override // f.h.b.b.b2.j
    public void r() {
        for (b bVar : this.f3887g.values()) {
            bVar.a.a(bVar.b);
            bVar.a.c(bVar.c);
        }
        this.f3887g.clear();
    }

    public z.a s(T t, z.a aVar) {
        return aVar;
    }

    public abstract void t(T t, z zVar, q1 q1Var);

    public final void u(T t, z zVar) {
        f.h.b.b.e2.j.c(!this.f3887g.containsKey(null));
        z.b bVar = new z.b() { // from class: f.h.b.b.b2.a
            @Override // f.h.b.b.b2.z.b
            public final void a(z zVar2, q1 q1Var) {
                m.this.t(r2, zVar2, q1Var);
            }
        };
        a aVar = new a(null);
        this.f3887g.put(null, new b(zVar, bVar, aVar));
        Handler handler = this.f3888h;
        Objects.requireNonNull(handler);
        zVar.b(handler, aVar);
        Handler handler2 = this.f3888h;
        Objects.requireNonNull(handler2);
        zVar.f(handler2, aVar);
        zVar.k(bVar, this.f3889i);
        if (!this.b.isEmpty()) {
            return;
        }
        zVar.d(bVar);
    }
}
