package f.h.b.b.y1.g0;

import android.net.Uri;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import f.h.b.b.a2.k.b;
import f.h.b.b.g2.t;
import f.h.b.b.h0;
import f.h.b.b.u1.z;
import f.h.b.b.y1.j;
import f.h.b.b.y1.k;
import f.h.b.b.y1.l;
import f.h.b.b.y1.p;
import f.h.b.b.y1.q;
import f.h.b.b.y1.w;
import java.io.EOFException;
import java.util.Map;

/* compiled from: Mp3Extractor.java */
/* loaded from: classes.dex */
public final class f implements f.h.b.b.y1.h {
    public static final b.a u;
    public final int a;
    public final long b;
    public final t c;

    /* renamed from: d  reason: collision with root package name */
    public final z.a f4771d;

    /* renamed from: e  reason: collision with root package name */
    public final p f4772e;

    /* renamed from: f  reason: collision with root package name */
    public final q f4773f;

    /* renamed from: g  reason: collision with root package name */
    public final w f4774g;

    /* renamed from: h  reason: collision with root package name */
    public j f4775h;

    /* renamed from: i  reason: collision with root package name */
    public w f4776i;

    /* renamed from: j  reason: collision with root package name */
    public w f4777j;

    /* renamed from: k  reason: collision with root package name */
    public int f4778k;

    /* renamed from: l  reason: collision with root package name */
    public Metadata f4779l;

    /* renamed from: m  reason: collision with root package name */
    public long f4780m;
    public long n;
    public long o;
    public int p;
    public g q;
    public boolean r;
    public boolean s;
    public long t;

    static {
        a aVar = new l() { // from class: f.h.b.b.y1.g0.a
            @Override // f.h.b.b.y1.l
            public final f.h.b.b.y1.h[] a() {
                return new f.h.b.b.y1.h[]{new f(0)};
            }

            @Override // f.h.b.b.y1.l
            public /* synthetic */ f.h.b.b.y1.h[] b(Uri uri, Map map) {
                return k.a(this, uri, map);
            }
        };
        u = new b.a() { // from class: f.h.b.b.y1.g0.b
            @Override // f.h.b.b.a2.k.b.a
            public final boolean a(int i2, int i3, int i4, int i5, int i6) {
                b.a aVar2 = f.u;
                return (i3 == 67 && i4 == 79 && i5 == 77 && (i6 == 77 || i2 == 2)) || (i3 == 77 && i4 == 76 && i5 == 76 && (i6 == 84 || i2 == 2));
            }
        };
    }

    public f() {
        this(0);
    }

    public static long d(Metadata metadata) {
        if (metadata != null) {
            int length = metadata.f770f.length;
            for (int i2 = 0; i2 < length; i2++) {
                Metadata.Entry entry = metadata.f770f[i2];
                if (entry instanceof TextInformationFrame) {
                    TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                    if (textInformationFrame.f823f.equals("TLEN")) {
                        return h0.a(Long.parseLong(textInformationFrame.f835h));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public static boolean h(int i2, long j2) {
        return ((long) (i2 & (-128000))) == (j2 & (-128000));
    }

    public final long a(long j2) {
        return ((j2 * 1000000) / this.f4771d.f4606d) + this.f4780m;
    }

    @Override // f.h.b.b.y1.h
    public boolean b(f.h.b.b.y1.i iVar) {
        return j(iVar, true);
    }

    public final g c(f.h.b.b.y1.i iVar) {
        iVar.o(this.c.a, 0, 4);
        this.c.C(0);
        this.f4771d.a(this.c.f());
        return new c(iVar.a(), iVar.getPosition(), this.f4771d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r8 != 1231971951) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023e  */
    @Override // f.h.b.b.y1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int e(f.h.b.b.y1.i r40, f.h.b.b.y1.s r41) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.g0.f.e(f.h.b.b.y1.i, f.h.b.b.y1.s):int");
    }

    @Override // f.h.b.b.y1.h
    public void f(j jVar) {
        this.f4775h = jVar;
        w p = jVar.p(0, 1);
        this.f4776i = p;
        this.f4777j = p;
        this.f4775h.j();
    }

    @Override // f.h.b.b.y1.h
    public void g(long j2, long j3) {
        this.f4778k = 0;
        this.f4780m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = j3;
        g gVar = this.q;
        if (!(gVar instanceof d) || ((d) gVar).b(j3)) {
            return;
        }
        this.s = true;
        this.f4777j = this.f4774g;
    }

    public final boolean i(f.h.b.b.y1.i iVar) {
        g gVar = this.q;
        if (gVar != null) {
            long a = gVar.a();
            if (a != -1 && iVar.f() > a - 4) {
                return true;
            }
        }
        try {
            return !iVar.e(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009d, code lost:
        if (r13 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
        r12.m(r2 + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
        r12.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a7, code lost:
        r11.f4778k = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a9, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(f.h.b.b.y1.i r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.l()
            long r1 = r12.getPosition()
            r3 = 0
            r5 = 4
            r6 = 1
            r7 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L41
            int r1 = r11.a
            r1 = r1 & r5
            if (r1 != 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            if (r1 == 0) goto L24
            r1 = 0
            goto L26
        L24:
            f.h.b.b.a2.k.b$a r1 = f.h.b.b.y1.g0.f.u
        L26:
            f.h.b.b.y1.q r2 = r11.f4773f
            com.google.android.exoplayer2.metadata.Metadata r1 = r2.a(r12, r1)
            r11.f4779l = r1
            if (r1 == 0) goto L35
            f.h.b.b.y1.p r2 = r11.f4772e
            r2.b(r1)
        L35:
            long r1 = r12.f()
            int r2 = (int) r1
            if (r13 != 0) goto L3f
            r12.m(r2)
        L3f:
            r1 = 0
            goto L43
        L41:
            r1 = 0
            r2 = 0
        L43:
            r3 = 0
            r4 = 0
        L45:
            boolean r8 = r11.i(r12)
            if (r8 == 0) goto L54
            if (r3 <= 0) goto L4e
            goto L9d
        L4e:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L54:
            f.h.b.b.g2.t r8 = r11.c
            r8.C(r7)
            f.h.b.b.g2.t r8 = r11.c
            int r8 = r8.f()
            if (r1 == 0) goto L68
            long r9 = (long) r1
            boolean r9 = h(r8, r9)
            if (r9 == 0) goto L6f
        L68:
            int r9 = f.h.b.b.u1.z.a(r8)
            r10 = -1
            if (r9 != r10) goto L90
        L6f:
            int r1 = r4 + 1
            if (r4 != r0) goto L7e
            if (r13 == 0) goto L76
            return r7
        L76:
            com.google.android.exoplayer2.ParserException r12 = new com.google.android.exoplayer2.ParserException
            java.lang.String r13 = "Searched too many bytes."
            r12.<init>(r13)
            throw r12
        L7e:
            if (r13 == 0) goto L89
            r12.l()
            int r3 = r2 + r1
            r12.g(r3)
            goto L8c
        L89:
            r12.m(r6)
        L8c:
            r4 = r1
            r1 = 0
            r3 = 0
            goto L45
        L90:
            int r3 = r3 + 1
            if (r3 != r6) goto L9b
            f.h.b.b.u1.z$a r1 = r11.f4771d
            r1.a(r8)
            r1 = r8
            goto Laa
        L9b:
            if (r3 != r5) goto Laa
        L9d:
            if (r13 == 0) goto La4
            int r2 = r2 + r4
            r12.m(r2)
            goto La7
        La4:
            r12.l()
        La7:
            r11.f4778k = r1
            return r6
        Laa:
            int r9 = r9 + (-4)
            r12.g(r9)
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.g0.f.j(f.h.b.b.y1.i, boolean):boolean");
    }

    @Override // f.h.b.b.y1.h
    public void release() {
    }

    public f(int i2) {
        this.a = i2;
        this.b = -9223372036854775807L;
        this.c = new t(10);
        this.f4771d = new z.a();
        this.f4772e = new p();
        this.f4780m = -9223372036854775807L;
        this.f4773f = new q();
        f.h.b.b.y1.g gVar = new f.h.b.b.y1.g();
        this.f4774g = gVar;
        this.f4777j = gVar;
    }
}
