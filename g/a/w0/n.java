package g.a.w0;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Api;
import g.a.w0.f;
import java.io.IOException;

/* compiled from: OutboundFlowController.java */
/* loaded from: classes2.dex */
public class n {
    public final g a;
    public final g.a.w0.p.i.b b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public final a f8068d;

    public n(g gVar, g.a.w0.p.i.b bVar) {
        f.h.b.c.a.x(gVar, NotificationCompat.CATEGORY_TRANSPORT);
        this.a = gVar;
        f.h.b.c.a.x(bVar, "frameWriter");
        this.b = bVar;
        this.c = 65535;
        this.f8068d = new a(0, 65535);
    }

    public void a(boolean z, int i2, l.f fVar, boolean z2) {
        f.h.b.c.a.x(fVar, "source");
        f p = this.a.p(i2);
        if (p == null) {
            return;
        }
        a d2 = d(p);
        int c = d2.c();
        boolean z3 = d2.a.f9230g > 0;
        int i3 = (int) fVar.f9230g;
        if (!z3 && c >= i3) {
            d2.d(fVar, i3, z);
        } else {
            if (!z3 && c > 0) {
                d2.d(fVar, c, false);
            }
            d2.a.J(fVar, (int) fVar.f9230g);
            d2.f8071f = z | d2.f8071f;
        }
        if (z2) {
            b();
        }
    }

    public void b() {
        try {
            this.b.flush();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean c(int i2) {
        f[] l2;
        if (i2 >= 0) {
            int i3 = i2 - this.c;
            this.c = i2;
            for (f fVar : this.a.l()) {
                a aVar = (a) fVar.f8023k;
                if (aVar == null) {
                    fVar.f8023k = new a(this, fVar, this.c);
                } else {
                    aVar.a(i3);
                }
            }
            return i3 > 0;
        }
        throw new IllegalArgumentException(f.a.b.a.a.i("Invalid initial window size: ", i2));
    }

    public final a d(f fVar) {
        a aVar = (a) fVar.f8023k;
        if (aVar == null) {
            a aVar2 = new a(this, fVar, this.c);
            fVar.f8023k = aVar2;
            return aVar2;
        }
        return aVar;
    }

    public int e(f fVar, int i2) {
        if (fVar == null) {
            int a2 = this.f8068d.a(i2);
            f();
            return a2;
        }
        a d2 = d(fVar);
        int a3 = d2.a(i2);
        int c = d2.c();
        int min = Math.min(c, d2.c());
        int i3 = 0;
        int i4 = 0;
        while (true) {
            l.f fVar2 = d2.a;
            long j2 = fVar2.f9230g;
            if (!(j2 > 0) || min <= 0) {
                break;
            }
            if (min >= j2) {
                int i5 = (int) j2;
                i4 += i5;
                d2.d(fVar2, i5, d2.f8071f);
            } else {
                i4 += min;
                d2.d(fVar2, min, false);
            }
            i3++;
            min = Math.min(c - i4, d2.c());
        }
        if (i3 > 0) {
            b();
        }
        return a3;
    }

    public void f() {
        f[] l2 = this.a.l();
        int i2 = this.f8068d.c;
        int length = l2.length;
        while (true) {
            if (length <= 0 || i2 <= 0) {
                break;
            }
            int ceil = (int) Math.ceil(i2 / length);
            for (int i3 = 0; i3 < length && i2 > 0; i3++) {
                f fVar = l2[i3];
                a d2 = d(fVar);
                int min = Math.min(i2, Math.min(d2.b(), ceil));
                if (min > 0) {
                    d2.f8069d += min;
                    i2 -= min;
                }
                if (d2.b() > 0) {
                    l2[r4] = fVar;
                    r4++;
                }
            }
            length = r4;
        }
        int i4 = 0;
        for (f fVar2 : this.a.l()) {
            a d3 = d(fVar2);
            int i5 = d3.f8069d;
            int min2 = Math.min(i5, d3.c());
            int i6 = 0;
            while (true) {
                l.f fVar3 = d3.a;
                long j2 = fVar3.f9230g;
                if ((j2 > 0) && min2 > 0) {
                    if (min2 >= j2) {
                        int i7 = (int) j2;
                        i6 += i7;
                        d3.d(fVar3, i7, d3.f8071f);
                    } else {
                        i6 += min2;
                        d3.d(fVar3, min2, false);
                    }
                    i4++;
                    min2 = Math.min(i5 - i6, d3.c());
                }
            }
            d3.f8069d = 0;
        }
        if ((i4 > 0 ? 1 : 0) != 0) {
            b();
        }
    }

    /* compiled from: OutboundFlowController.java */
    /* loaded from: classes2.dex */
    public final class a {
        public final l.f a;
        public final int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f8069d;

        /* renamed from: e  reason: collision with root package name */
        public f f8070e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f8071f;

        public a(n nVar, f fVar, int i2) {
            int i3 = fVar.f8024l;
            n.this = nVar;
            this.f8071f = false;
            this.b = i3;
            this.c = i2;
            this.a = new l.f();
            this.f8070e = fVar;
        }

        public int a(int i2) {
            if (i2 > 0 && Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < this.c) {
                StringBuilder A = f.a.b.a.a.A("Window size overflow for stream: ");
                A.append(this.b);
                throw new IllegalArgumentException(A.toString());
            }
            int i3 = this.c + i2;
            this.c = i3;
            return i3;
        }

        public int b() {
            return Math.max(0, Math.min(this.c, (int) this.a.f9230g)) - this.f8069d;
        }

        public int c() {
            return Math.min(this.c, n.this.f8068d.c);
        }

        public void d(l.f fVar, int i2, boolean z) {
            do {
                int min = Math.min(i2, n.this.b.f0());
                int i3 = -min;
                n.this.f8068d.a(i3);
                a(i3);
                try {
                    boolean z2 = false;
                    n.this.b.x(fVar.f9230g == ((long) min) && z, this.b, fVar, min);
                    f.b bVar = this.f8070e.f8025m;
                    synchronized (bVar.b) {
                        f.h.b.c.a.C(bVar.f7650f, "onStreamAllocated was not called, but it seems the stream is active");
                        int i4 = bVar.f7649e;
                        boolean z3 = i4 < 32768;
                        int i5 = i4 - min;
                        bVar.f7649e = i5;
                        boolean z4 = i5 < 32768;
                        if (!z3 && z4) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        bVar.f();
                    }
                    i2 -= min;
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            } while (i2 > 0);
        }

        public a(int i2, int i3) {
            this.f8071f = false;
            this.b = i2;
            this.c = i3;
            this.a = new l.f();
        }
    }
}
