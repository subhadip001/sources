package f.h.b.b.y1.b0;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import f.h.b.b.g2.b0;
import f.h.b.b.y1.d;
import f.h.b.b.y1.h;
import f.h.b.b.y1.i;
import f.h.b.b.y1.j;
import f.h.b.b.y1.k;
import f.h.b.b.y1.l;
import f.h.b.b.y1.s;
import f.h.b.b.y1.t;
import f.h.b.b.y1.w;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Map;

/* compiled from: AmrExtractor.java */
/* loaded from: classes.dex */
public final class b implements h {
    public static final int[] o;
    public static final int[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final int s;
    public final byte[] a;
    public boolean b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public int f4685d;

    /* renamed from: e  reason: collision with root package name */
    public int f4686e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4687f;

    /* renamed from: g  reason: collision with root package name */
    public long f4688g;

    /* renamed from: h  reason: collision with root package name */
    public int f4689h;

    /* renamed from: i  reason: collision with root package name */
    public int f4690i;

    /* renamed from: j  reason: collision with root package name */
    public long f4691j;

    /* renamed from: k  reason: collision with root package name */
    public j f4692k;

    /* renamed from: l  reason: collision with root package name */
    public w f4693l;

    /* renamed from: m  reason: collision with root package name */
    public t f4694m;
    public boolean n;

    static {
        a aVar = new l() { // from class: f.h.b.b.y1.b0.a
            @Override // f.h.b.b.y1.l
            public final h[] a() {
                return new h[]{new b()};
            }

            @Override // f.h.b.b.y1.l
            public /* synthetic */ h[] b(Uri uri, Map map) {
                return k.a(this, uri, map);
            }
        };
        o = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        p = iArr;
        q = b0.v("#!AMR\n");
        r = b0.v("#!AMR-WB\n");
        s = iArr[8];
    }

    public b() {
        this.a = new byte[1];
        this.f4689h = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        if ((!r0 && (r5 < 12 || r5 > 14)) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(f.h.b.b.y1.i r5) {
        /*
            r4 = this;
            r5.l()
            byte[] r0 = r4.a
            r1 = 0
            r2 = 1
            r5.o(r0, r1, r2)
            byte[] r5 = r4.a
            r5 = r5[r1]
            r0 = r5 & 131(0x83, float:1.84E-43)
            if (r0 > 0) goto L7a
            int r5 = r5 >> 3
            r0 = 15
            r5 = r5 & r0
            if (r5 < 0) goto L3c
            if (r5 > r0) goto L3c
            boolean r0 = r4.b
            if (r0 == 0) goto L29
            r2 = 10
            if (r5 < r2) goto L27
            r2 = 13
            if (r5 <= r2) goto L29
        L27:
            r2 = 1
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r2 != 0) goto L3b
            if (r0 != 0) goto L38
            r0 = 12
            if (r5 < r0) goto L36
            r0 = 14
            if (r5 <= r0) goto L38
        L36:
            r0 = 1
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 == 0) goto L3c
        L3b:
            r1 = 1
        L3c:
            if (r1 != 0) goto L6c
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            boolean r1 = r4.b
            if (r1 == 0) goto L47
            java.lang.String r1 = "WB"
            goto L49
        L47:
            java.lang.String r1 = "NB"
        L49:
            int r2 = r1.length()
            int r2 = r2 + 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Illegal AMR "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = " frame type "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r0.<init>(r5)
            throw r0
        L6c:
            boolean r0 = r4.b
            if (r0 == 0) goto L75
            int[] r0 = f.h.b.b.y1.b0.b.p
            r5 = r0[r5]
            goto L79
        L75:
            int[] r0 = f.h.b.b.y1.b0.b.o
            r5 = r0[r5]
        L79:
            return r5
        L7a:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 42
            java.lang.String r2 = "Invalid padding bits for frame header "
            java.lang.String r5 = f.a.b.a.a.d(r1, r2, r5)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.b0.b.a(f.h.b.b.y1.i):int");
    }

    @Override // f.h.b.b.y1.h
    public boolean b(i iVar) {
        return c(iVar);
    }

    public final boolean c(i iVar) {
        byte[] bArr = q;
        iVar.l();
        byte[] bArr2 = new byte[bArr.length];
        iVar.o(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.b = false;
            iVar.m(bArr.length);
            return true;
        }
        byte[] bArr3 = r;
        iVar.l();
        byte[] bArr4 = new byte[bArr3.length];
        iVar.o(bArr4, 0, bArr3.length);
        if (Arrays.equals(bArr4, bArr3)) {
            this.b = true;
            iVar.m(bArr3.length);
            return true;
        }
        return false;
    }

    @Override // f.h.b.b.y1.h
    public int e(i iVar, s sVar) {
        f.h.b.b.e2.j.i(this.f4693l);
        if (iVar.getPosition() == 0 && !c(iVar)) {
            throw new ParserException("Could not find AMR header.");
        }
        if (!this.n) {
            this.n = true;
            boolean z = this.b;
            String str = z ? "audio/amr-wb" : "audio/3gpp";
            int i2 = z ? 16000 : 8000;
            w wVar = this.f4693l;
            Format.b bVar = new Format.b();
            bVar.f722k = str;
            bVar.f723l = s;
            bVar.x = 1;
            bVar.y = i2;
            wVar.e(bVar.a());
        }
        int i3 = -1;
        if (this.f4686e == 0) {
            try {
                int a = a(iVar);
                this.f4685d = a;
                this.f4686e = a;
                if (this.f4689h == -1) {
                    this.f4688g = iVar.getPosition();
                    this.f4689h = this.f4685d;
                }
                if (this.f4689h == this.f4685d) {
                    this.f4690i++;
                }
            } catch (EOFException unused) {
            }
        }
        int b = this.f4693l.b(iVar, this.f4686e, true);
        if (b != -1) {
            int i4 = this.f4686e - b;
            this.f4686e = i4;
            if (i4 <= 0) {
                this.f4693l.d(this.f4691j + this.c, 1, this.f4685d, 0, null);
                this.c += FirebaseInAppMessagingDisplay.DISMISS_THRESHOLD_MILLIS;
            }
            i3 = 0;
        }
        iVar.a();
        if (!this.f4687f) {
            t.b bVar2 = new t.b(-9223372036854775807L, 0L);
            this.f4694m = bVar2;
            this.f4692k.a(bVar2);
            this.f4687f = true;
        }
        return i3;
    }

    @Override // f.h.b.b.y1.h
    public void f(j jVar) {
        this.f4692k = jVar;
        this.f4693l = jVar.p(0, 1);
        jVar.j();
    }

    @Override // f.h.b.b.y1.h
    public void g(long j2, long j3) {
        this.c = 0L;
        this.f4685d = 0;
        this.f4686e = 0;
        if (j2 != 0) {
            t tVar = this.f4694m;
            if (tVar instanceof d) {
                d dVar = (d) tVar;
                this.f4691j = d.e(j2, dVar.b, dVar.f4709e);
                return;
            }
        }
        this.f4691j = 0L;
    }

    @Override // f.h.b.b.y1.h
    public void release() {
    }

    public b(int i2) {
        this.a = new byte[1];
        this.f4689h = -1;
    }
}
