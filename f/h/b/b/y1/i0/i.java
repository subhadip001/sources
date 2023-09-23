package f.h.b.b.y1.i0;

import com.google.android.exoplayer2.Format;
import f.h.b.b.y1.t;
import f.h.b.b.y1.w;

/* compiled from: StreamReader.java */
/* loaded from: classes.dex */
public abstract class i {
    public w b;
    public f.h.b.b.y1.j c;

    /* renamed from: d  reason: collision with root package name */
    public g f4865d;

    /* renamed from: e  reason: collision with root package name */
    public long f4866e;

    /* renamed from: f  reason: collision with root package name */
    public long f4867f;

    /* renamed from: g  reason: collision with root package name */
    public long f4868g;

    /* renamed from: h  reason: collision with root package name */
    public int f4869h;

    /* renamed from: i  reason: collision with root package name */
    public int f4870i;

    /* renamed from: k  reason: collision with root package name */
    public long f4872k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4873l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4874m;
    public final e a = new e();

    /* renamed from: j  reason: collision with root package name */
    public b f4871j = new b();

    /* compiled from: StreamReader.java */
    /* loaded from: classes.dex */
    public static class b {
        public Format a;
        public g b;
    }

    /* compiled from: StreamReader.java */
    /* loaded from: classes.dex */
    public static final class c implements g {
        public c(a aVar) {
        }

        @Override // f.h.b.b.y1.i0.g
        public t a() {
            return new t.b(-9223372036854775807L, 0L);
        }

        @Override // f.h.b.b.y1.i0.g
        public long b(f.h.b.b.y1.i iVar) {
            return -1L;
        }

        @Override // f.h.b.b.y1.i0.g
        public void c(long j2) {
        }
    }

    public long a(long j2) {
        return (this.f4870i * j2) / 1000000;
    }

    public void b(long j2) {
        this.f4868g = j2;
    }

    public abstract long c(f.h.b.b.g2.t tVar);

    public abstract boolean d(f.h.b.b.g2.t tVar, long j2, b bVar);

    public void e(boolean z) {
        if (z) {
            this.f4871j = new b();
            this.f4867f = 0L;
            this.f4869h = 0;
        } else {
            this.f4869h = 1;
        }
        this.f4866e = -1L;
        this.f4868g = 0L;
    }
}
