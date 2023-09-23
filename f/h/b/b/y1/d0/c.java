package f.h.b.b.y1.d0;

import android.net.Uri;
import f.h.b.b.g2.t;
import f.h.b.b.y1.h;
import f.h.b.b.y1.i;
import f.h.b.b.y1.j;
import f.h.b.b.y1.k;
import f.h.b.b.y1.l;
import f.h.b.b.y1.t;
import java.util.Map;

/* compiled from: FlvExtractor.java */
/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: f  reason: collision with root package name */
    public j f4715f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4717h;

    /* renamed from: i  reason: collision with root package name */
    public long f4718i;

    /* renamed from: j  reason: collision with root package name */
    public int f4719j;

    /* renamed from: k  reason: collision with root package name */
    public int f4720k;

    /* renamed from: l  reason: collision with root package name */
    public int f4721l;

    /* renamed from: m  reason: collision with root package name */
    public long f4722m;
    public boolean n;
    public b o;
    public e p;
    public final t a = new t(4);
    public final t b = new t(9);
    public final t c = new t(11);

    /* renamed from: d  reason: collision with root package name */
    public final t f4713d = new t();

    /* renamed from: e  reason: collision with root package name */
    public final d f4714e = new d();

    /* renamed from: g  reason: collision with root package name */
    public int f4716g = 1;

    static {
        a aVar = new l() { // from class: f.h.b.b.y1.d0.a
            @Override // f.h.b.b.y1.l
            public final h[] a() {
                return new h[]{new c()};
            }

            @Override // f.h.b.b.y1.l
            public /* synthetic */ h[] b(Uri uri, Map map) {
                return k.a(this, uri, map);
            }
        };
    }

    public final void a() {
        if (this.n) {
            return;
        }
        this.f4715f.a(new t.b(-9223372036854775807L, 0L));
        this.n = true;
    }

    @Override // f.h.b.b.y1.h
    public boolean b(i iVar) {
        iVar.o(this.a.a, 0, 3);
        this.a.C(0);
        if (this.a.t() != 4607062) {
            return false;
        }
        iVar.o(this.a.a, 0, 2);
        this.a.C(0);
        if ((this.a.w() & 250) != 0) {
            return false;
        }
        iVar.o(this.a.a, 0, 4);
        this.a.C(0);
        int f2 = this.a.f();
        iVar.l();
        iVar.g(f2);
        iVar.o(this.a.a, 0, 4);
        this.a.C(0);
        return this.a.f() == 0;
    }

    public final f.h.b.b.g2.t c(i iVar) {
        int i2 = this.f4721l;
        f.h.b.b.g2.t tVar = this.f4713d;
        byte[] bArr = tVar.a;
        if (i2 > bArr.length) {
            tVar.a = new byte[Math.max(bArr.length * 2, i2)];
            tVar.c = 0;
            tVar.b = 0;
        } else {
            tVar.C(0);
        }
        this.f4713d.B(this.f4721l);
        iVar.readFully(this.f4713d.a, 0, this.f4721l);
        return this.f4713d;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0009 A[SYNTHETIC] */
    @Override // f.h.b.b.y1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int e(f.h.b.b.y1.i r17, f.h.b.b.y1.s r18) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.d0.c.e(f.h.b.b.y1.i, f.h.b.b.y1.s):int");
    }

    @Override // f.h.b.b.y1.h
    public void f(j jVar) {
        this.f4715f = jVar;
    }

    @Override // f.h.b.b.y1.h
    public void g(long j2, long j3) {
        if (j2 == 0) {
            this.f4716g = 1;
            this.f4717h = false;
        } else {
            this.f4716g = 3;
        }
        this.f4719j = 0;
    }

    @Override // f.h.b.b.y1.h
    public void release() {
    }
}
