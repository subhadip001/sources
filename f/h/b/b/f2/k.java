package f.h.b.b.f2;

import f.h.b.b.g2.b0;
import java.util.Arrays;

/* compiled from: DefaultAllocator.java */
/* loaded from: classes.dex */
public final class k {
    public final boolean a;
    public final int b;
    public final c[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f4215d;

    /* renamed from: e  reason: collision with root package name */
    public int f4216e;

    /* renamed from: f  reason: collision with root package name */
    public int f4217f;

    /* renamed from: g  reason: collision with root package name */
    public c[] f4218g;

    public k(boolean z, int i2) {
        f.h.b.b.e2.j.c(i2 > 0);
        f.h.b.b.e2.j.c(true);
        this.a = z;
        this.b = i2;
        this.f4217f = 0;
        this.f4218g = new c[100];
        this.c = new c[1];
    }

    public synchronized void a(c[] cVarArr) {
        int i2 = this.f4217f;
        int length = cVarArr.length + i2;
        c[] cVarArr2 = this.f4218g;
        if (length >= cVarArr2.length) {
            this.f4218g = (c[]) Arrays.copyOf(cVarArr2, Math.max(cVarArr2.length * 2, i2 + cVarArr.length));
        }
        for (c cVar : cVarArr) {
            c[] cVarArr3 = this.f4218g;
            int i3 = this.f4217f;
            this.f4217f = i3 + 1;
            cVarArr3[i3] = cVar;
        }
        this.f4216e -= cVarArr.length;
        notifyAll();
    }

    public synchronized void b(int i2) {
        boolean z = i2 < this.f4215d;
        this.f4215d = i2;
        if (z) {
            c();
        }
    }

    public synchronized void c() {
        int max = Math.max(0, b0.f(this.f4215d, this.b) - this.f4216e);
        int i2 = this.f4217f;
        if (max >= i2) {
            return;
        }
        Arrays.fill(this.f4218g, max, i2, (Object) null);
        this.f4217f = max;
    }
}
