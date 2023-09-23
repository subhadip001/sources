package f.h.b.b.b2;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import f.h.b.b.b2.a0;
import f.h.b.b.b2.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MediaSourceEventListener.java */
/* loaded from: classes.dex */
public interface a0 {
    void H(int i2, z.a aVar, s sVar, v vVar);

    void M(int i2, z.a aVar, s sVar, v vVar, IOException iOException, boolean z);

    void k(int i2, z.a aVar, v vVar);

    void l(int i2, z.a aVar, s sVar, v vVar);

    void o(int i2, z.a aVar, s sVar, v vVar);

    /* compiled from: MediaSourceEventListener.java */
    /* loaded from: classes.dex */
    public static class a {
        public final int a;
        public final z.a b;
        public final CopyOnWriteArrayList<C0101a> c;

        /* renamed from: d  reason: collision with root package name */
        public final long f3800d;

        /* compiled from: MediaSourceEventListener.java */
        /* renamed from: f.h.b.b.b2.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0101a {
            public Handler a;
            public a0 b;

            public C0101a(Handler handler, a0 a0Var) {
                this.a = handler;
                this.b = a0Var;
            }
        }

        public a() {
            this.c = new CopyOnWriteArrayList<>();
            this.a = 0;
            this.b = null;
            this.f3800d = 0L;
        }

        public final long a(long j2) {
            long b = f.h.b.b.h0.b(j2);
            if (b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f3800d + b;
        }

        public void b(final v vVar) {
            Iterator<C0101a> it = this.c.iterator();
            while (it.hasNext()) {
                C0101a next = it.next();
                final a0 a0Var = next.b;
                f.h.b.b.g2.b0.D(next.a, new Runnable() { // from class: f.h.b.b.b2.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.a aVar = a0.a.this;
                        a0Var.k(aVar.a, aVar.b, vVar);
                    }
                });
            }
        }

        public void c(s sVar, int i2, int i3, Format format, int i4, Object obj, long j2, long j3) {
            d(sVar, new v(i2, i3, null, i4, null, a(j2), a(j3)));
        }

        public void d(final s sVar, final v vVar) {
            Iterator<C0101a> it = this.c.iterator();
            while (it.hasNext()) {
                C0101a next = it.next();
                final a0 a0Var = next.b;
                f.h.b.b.g2.b0.D(next.a, new Runnable() { // from class: f.h.b.b.b2.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.a aVar = a0.a.this;
                        a0Var.l(aVar.a, aVar.b, sVar, vVar);
                    }
                });
            }
        }

        public void e(s sVar, int i2, int i3, Format format, int i4, Object obj, long j2, long j3) {
            f(sVar, new v(i2, i3, null, i4, null, a(j2), a(j3)));
        }

        public void f(final s sVar, final v vVar) {
            Iterator<C0101a> it = this.c.iterator();
            while (it.hasNext()) {
                C0101a next = it.next();
                final a0 a0Var = next.b;
                f.h.b.b.g2.b0.D(next.a, new Runnable() { // from class: f.h.b.b.b2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.a aVar = a0.a.this;
                        a0Var.H(aVar.a, aVar.b, sVar, vVar);
                    }
                });
            }
        }

        public void g(s sVar, int i2, int i3, Format format, int i4, Object obj, long j2, long j3, IOException iOException, boolean z) {
            h(sVar, new v(i2, i3, null, i4, null, a(j2), a(j3)), iOException, z);
        }

        public void h(final s sVar, final v vVar, final IOException iOException, final boolean z) {
            Iterator<C0101a> it = this.c.iterator();
            while (it.hasNext()) {
                C0101a next = it.next();
                final a0 a0Var = next.b;
                f.h.b.b.g2.b0.D(next.a, new Runnable() { // from class: f.h.b.b.b2.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.a aVar = a0.a.this;
                        a0Var.M(aVar.a, aVar.b, sVar, vVar, iOException, z);
                    }
                });
            }
        }

        public void i(s sVar, int i2, int i3, Format format, int i4, Object obj, long j2, long j3) {
            j(sVar, new v(i2, i3, null, i4, null, a(j2), a(j3)));
        }

        public void j(final s sVar, final v vVar) {
            Iterator<C0101a> it = this.c.iterator();
            while (it.hasNext()) {
                C0101a next = it.next();
                final a0 a0Var = next.b;
                f.h.b.b.g2.b0.D(next.a, new Runnable() { // from class: f.h.b.b.b2.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.a aVar = a0.a.this;
                        a0Var.o(aVar.a, aVar.b, sVar, vVar);
                    }
                });
            }
        }

        public a k(int i2, z.a aVar, long j2) {
            return new a(this.c, i2, aVar, j2);
        }

        public a(CopyOnWriteArrayList<C0101a> copyOnWriteArrayList, int i2, z.a aVar, long j2) {
            this.c = copyOnWriteArrayList;
            this.a = i2;
            this.b = aVar;
            this.f3800d = j2;
        }
    }
}
