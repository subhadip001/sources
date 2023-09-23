package f.h.b.b.c2.m;

import f.h.b.b.c2.g;
import f.h.b.b.c2.i;
import f.h.b.b.c2.j;
import f.h.b.b.c2.m.e;
import f.h.b.b.g2.b0;
import f.h.b.b.v1.f;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;

/* compiled from: CeaDecoder.java */
/* loaded from: classes.dex */
public abstract class e implements g {
    public final ArrayDeque<b> a = new ArrayDeque<>();
    public final ArrayDeque<j> b;
    public final PriorityQueue<b> c;

    /* renamed from: d  reason: collision with root package name */
    public b f3976d;

    /* renamed from: e  reason: collision with root package name */
    public long f3977e;

    /* renamed from: f  reason: collision with root package name */
    public long f3978f;

    /* compiled from: CeaDecoder.java */
    /* loaded from: classes.dex */
    public static final class b extends i implements Comparable<b> {
        public long o;

        public b() {
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            b bVar2 = bVar;
            if (m() != bVar2.m()) {
                if (m()) {
                    return 1;
                }
            } else {
                long j2 = this.f754j - bVar2.f754j;
                if (j2 == 0) {
                    j2 = this.o - bVar2.o;
                    if (j2 == 0) {
                        return 0;
                    }
                }
                if (j2 > 0) {
                    return 1;
                }
            }
            return -1;
        }

        public b(a aVar) {
        }
    }

    /* compiled from: CeaDecoder.java */
    /* loaded from: classes.dex */
    public static final class c extends j {

        /* renamed from: j  reason: collision with root package name */
        public f.a<c> f3979j;

        public c(f.a<c> aVar) {
            this.f3979j = aVar;
        }

        @Override // f.h.b.b.v1.f
        public final void o() {
            this.f3979j.a(this);
        }
    }

    public e() {
        for (int i2 = 0; i2 < 10; i2++) {
            this.a.add(new b(null));
        }
        this.b = new ArrayDeque<>();
        for (int i3 = 0; i3 < 2; i3++) {
            this.b.add(new c(new f.a() { // from class: f.h.b.b.c2.m.b
                @Override // f.h.b.b.v1.f.a
                public final void a(f.h.b.b.v1.f fVar) {
                    e eVar = e.this;
                    e.c cVar = (e.c) fVar;
                    Objects.requireNonNull(eVar);
                    cVar.f4610f = 0;
                    cVar.f3943h = null;
                    eVar.b.add(cVar);
                }
            }));
        }
        this.c = new PriorityQueue<>();
    }

    @Override // f.h.b.b.c2.g
    public void a(long j2) {
        this.f3977e = j2;
    }

    @Override // f.h.b.b.v1.c
    public i c() {
        f.h.b.b.e2.j.g(this.f3976d == null);
        if (this.a.isEmpty()) {
            return null;
        }
        b pollFirst = this.a.pollFirst();
        this.f3976d = pollFirst;
        return pollFirst;
    }

    @Override // f.h.b.b.v1.c
    public void d(i iVar) {
        i iVar2 = iVar;
        f.h.b.b.e2.j.c(iVar2 == this.f3976d);
        b bVar = (b) iVar2;
        if (bVar.l()) {
            i(bVar);
        } else {
            long j2 = this.f3978f;
            this.f3978f = 1 + j2;
            bVar.o = j2;
            this.c.add(bVar);
        }
        this.f3976d = null;
    }

    public abstract f.h.b.b.c2.f e();

    public abstract void f(i iVar);

    @Override // f.h.b.b.v1.c
    public void flush() {
        this.f3978f = 0L;
        this.f3977e = 0L;
        while (!this.c.isEmpty()) {
            int i2 = b0.a;
            i(this.c.poll());
        }
        b bVar = this.f3976d;
        if (bVar != null) {
            i(bVar);
            this.f3976d = null;
        }
    }

    @Override // f.h.b.b.v1.c
    /* renamed from: g */
    public j b() {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty()) {
            int i2 = b0.a;
            if (this.c.peek().f754j > this.f3977e) {
                break;
            }
            b poll = this.c.poll();
            if (poll.m()) {
                j pollFirst = this.b.pollFirst();
                pollFirst.i(4);
                i(poll);
                return pollFirst;
            }
            f(poll);
            if (h()) {
                f.h.b.b.c2.f e2 = e();
                j pollFirst2 = this.b.pollFirst();
                pollFirst2.q(poll.f754j, e2, Long.MAX_VALUE);
                i(poll);
                return pollFirst2;
            }
            i(poll);
        }
        return null;
    }

    public abstract boolean h();

    public final void i(b bVar) {
        bVar.o();
        this.a.add(bVar);
    }

    @Override // f.h.b.b.v1.c
    public void release() {
    }
}
