package f.h.b.b.y1.f0;

import f.h.b.b.y1.i;
import java.util.ArrayDeque;

/* compiled from: DefaultEbmlReader.java */
/* loaded from: classes.dex */
public final class b implements d {
    public final byte[] a = new byte[8];
    public final ArrayDeque<C0113b> b = new ArrayDeque<>();
    public final g c = new g();

    /* renamed from: d  reason: collision with root package name */
    public c f4741d;

    /* renamed from: e  reason: collision with root package name */
    public int f4742e;

    /* renamed from: f  reason: collision with root package name */
    public int f4743f;

    /* renamed from: g  reason: collision with root package name */
    public long f4744g;

    /* compiled from: DefaultEbmlReader.java */
    /* renamed from: f.h.b.b.y1.f0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0113b {
        public final int a;
        public final long b;

        public C0113b(int i2, long j2, a aVar) {
            this.a = i2;
            this.b = j2;
        }
    }

    public final long a(i iVar, int i2) {
        iVar.readFully(this.a, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (this.a[i3] & 255);
        }
        return j2;
    }
}
