package f.h.b.b.b2;

import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: SampleDataQueue.java */
/* loaded from: classes.dex */
public class e0 {
    public final f.h.b.b.f2.k a;
    public final int b;
    public final f.h.b.b.g2.t c;

    /* renamed from: d  reason: collision with root package name */
    public a f3844d;

    /* renamed from: e  reason: collision with root package name */
    public a f3845e;

    /* renamed from: f  reason: collision with root package name */
    public a f3846f;

    /* renamed from: g  reason: collision with root package name */
    public long f3847g;

    /* compiled from: SampleDataQueue.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final long b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public f.h.b.b.f2.c f3848d;

        /* renamed from: e  reason: collision with root package name */
        public a f3849e;

        public a(long j2, int i2) {
            this.a = j2;
            this.b = j2 + i2;
        }

        public int a(long j2) {
            return ((int) (j2 - this.a)) + this.f3848d.b;
        }
    }

    public e0(f.h.b.b.f2.k kVar) {
        this.a = kVar;
        int i2 = kVar.b;
        this.b = i2;
        this.c = new f.h.b.b.g2.t(32);
        a aVar = new a(0L, i2);
        this.f3844d = aVar;
        this.f3845e = aVar;
        this.f3846f = aVar;
    }

    public static a d(a aVar, long j2, ByteBuffer byteBuffer, int i2) {
        while (j2 >= aVar.b) {
            aVar = aVar.f3849e;
        }
        while (i2 > 0) {
            int min = Math.min(i2, (int) (aVar.b - j2));
            byteBuffer.put(aVar.f3848d.a, aVar.a(j2), min);
            i2 -= min;
            j2 += min;
            if (j2 == aVar.b) {
                aVar = aVar.f3849e;
            }
        }
        return aVar;
    }

    public static a e(a aVar, long j2, byte[] bArr, int i2) {
        while (j2 >= aVar.b) {
            aVar = aVar.f3849e;
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, (int) (aVar.b - j2));
            System.arraycopy(aVar.f3848d.a, aVar.a(j2), bArr, i2 - i3, min);
            i3 -= min;
            j2 += min;
            if (j2 == aVar.b) {
                aVar = aVar.f3849e;
            }
        }
        return aVar;
    }

    public void a(long j2) {
        a aVar;
        if (j2 == -1) {
            return;
        }
        while (true) {
            aVar = this.f3844d;
            if (j2 < aVar.b) {
                break;
            }
            f.h.b.b.f2.k kVar = this.a;
            f.h.b.b.f2.c cVar = aVar.f3848d;
            synchronized (kVar) {
                f.h.b.b.f2.c[] cVarArr = kVar.c;
                cVarArr[0] = cVar;
                kVar.a(cVarArr);
            }
            a aVar2 = this.f3844d;
            aVar2.f3848d = null;
            a aVar3 = aVar2.f3849e;
            aVar2.f3849e = null;
            this.f3844d = aVar3;
        }
        if (this.f3845e.a < aVar.a) {
            this.f3845e = aVar;
        }
    }

    public final void b(int i2) {
        long j2 = this.f3847g + i2;
        this.f3847g = j2;
        a aVar = this.f3846f;
        if (j2 == aVar.b) {
            this.f3846f = aVar.f3849e;
        }
    }

    public final int c(int i2) {
        f.h.b.b.f2.c cVar;
        a aVar = this.f3846f;
        if (!aVar.c) {
            f.h.b.b.f2.k kVar = this.a;
            synchronized (kVar) {
                kVar.f4216e++;
                int i3 = kVar.f4217f;
                if (i3 > 0) {
                    f.h.b.b.f2.c[] cVarArr = kVar.f4218g;
                    int i4 = i3 - 1;
                    kVar.f4217f = i4;
                    cVar = cVarArr[i4];
                    Objects.requireNonNull(cVar);
                    kVar.f4218g[kVar.f4217f] = null;
                } else {
                    cVar = new f.h.b.b.f2.c(new byte[kVar.b], 0);
                }
            }
            a aVar2 = new a(this.f3846f.b, this.b);
            aVar.f3848d = cVar;
            aVar.f3849e = aVar2;
            aVar.c = true;
        }
        return Math.min(i2, (int) (this.f3846f.b - this.f3847g));
    }
}
