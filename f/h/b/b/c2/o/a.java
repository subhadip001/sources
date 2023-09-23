package f.h.b.b.c2.o;

import android.graphics.Bitmap;
import f.h.b.b.c2.c;
import f.h.b.b.c2.d;
import f.h.b.b.c2.f;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.zip.Inflater;

/* compiled from: PgsDecoder.java */
/* loaded from: classes.dex */
public final class a extends d {
    public final t n;
    public final t o;
    public final C0105a p;
    public Inflater q;

    /* compiled from: PgsDecoder.java */
    /* renamed from: f.h.b.b.c2.o.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0105a {
        public final t a = new t();
        public final int[] b = new int[256];
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public int f4007d;

        /* renamed from: e  reason: collision with root package name */
        public int f4008e;

        /* renamed from: f  reason: collision with root package name */
        public int f4009f;

        /* renamed from: g  reason: collision with root package name */
        public int f4010g;

        /* renamed from: h  reason: collision with root package name */
        public int f4011h;

        /* renamed from: i  reason: collision with root package name */
        public int f4012i;

        public void a() {
            this.f4007d = 0;
            this.f4008e = 0;
            this.f4009f = 0;
            this.f4010g = 0;
            this.f4011h = 0;
            this.f4012i = 0;
            this.a.y(0);
            this.c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.n = new t();
        this.o = new t();
        this.p = new C0105a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // f.h.b.b.c2.d
    public f j(byte[] bArr, int i2, boolean z) {
        t tVar;
        c cVar;
        t tVar2;
        int i3;
        int i4;
        int t;
        a aVar = this;
        t tVar3 = aVar.n;
        tVar3.a = bArr;
        tVar3.c = i2;
        int i5 = 0;
        tVar3.b = 0;
        if (tVar3.a() > 0 && tVar3.c() == 120) {
            if (aVar.q == null) {
                aVar.q = new Inflater();
            }
            if (b0.w(tVar3, aVar.o, aVar.q)) {
                t tVar4 = aVar.o;
                tVar3.A(tVar4.a, tVar4.c);
            }
        }
        aVar.p.a();
        ArrayList arrayList = new ArrayList();
        while (aVar.n.a() >= 3) {
            t tVar5 = aVar.n;
            C0105a c0105a = aVar.p;
            int i6 = tVar5.c;
            int r = tVar5.r();
            int w = tVar5.w();
            int i7 = tVar5.b + w;
            if (i7 > i6) {
                tVar5.C(i6);
                cVar = null;
            } else {
                if (r != 128) {
                    switch (r) {
                        case 20:
                            Objects.requireNonNull(c0105a);
                            if (w % 5 == 2) {
                                tVar5.D(2);
                                Arrays.fill(c0105a.b, i5);
                                int i8 = w / 5;
                                int i9 = 0;
                                while (i9 < i8) {
                                    int r2 = tVar5.r();
                                    int r3 = tVar5.r();
                                    double d2 = r3;
                                    double r4 = tVar5.r() - 128;
                                    arrayList = arrayList;
                                    double r5 = tVar5.r() - 128;
                                    c0105a.b[r2] = (b0.h((int) ((1.402d * r4) + d2), 0, 255) << 16) | (tVar5.r() << 24) | (b0.h((int) ((d2 - (0.34414d * r5)) - (r4 * 0.71414d)), 0, 255) << 8) | b0.h((int) ((r5 * 1.772d) + d2), 0, 255);
                                    i9++;
                                    tVar5 = tVar5;
                                }
                                tVar = tVar5;
                                c0105a.c = true;
                                break;
                            }
                            tVar = tVar5;
                            break;
                        case 21:
                            Objects.requireNonNull(c0105a);
                            if (w >= 4) {
                                tVar5.D(3);
                                int i10 = w - 4;
                                if ((tVar5.r() & 128) != 0) {
                                    if (i10 >= 7 && (t = tVar5.t()) >= 4) {
                                        c0105a.f4011h = tVar5.w();
                                        c0105a.f4012i = tVar5.w();
                                        c0105a.a.y(t - 4);
                                        i10 -= 7;
                                    }
                                }
                                t tVar6 = c0105a.a;
                                int i11 = tVar6.b;
                                int i12 = tVar6.c;
                                if (i11 < i12 && i10 > 0) {
                                    int min = Math.min(i10, i12 - i11);
                                    tVar5.e(c0105a.a.a, i11, min);
                                    c0105a.a.C(i11 + min);
                                }
                            }
                            tVar = tVar5;
                            break;
                        case 22:
                            Objects.requireNonNull(c0105a);
                            if (w >= 19) {
                                c0105a.f4007d = tVar5.w();
                                c0105a.f4008e = tVar5.w();
                                tVar5.D(11);
                                c0105a.f4009f = tVar5.w();
                                c0105a.f4010g = tVar5.w();
                            }
                            tVar = tVar5;
                            break;
                        default:
                            tVar = tVar5;
                            break;
                    }
                    cVar = null;
                } else {
                    tVar = tVar5;
                    if (c0105a.f4007d == 0 || c0105a.f4008e == 0 || c0105a.f4011h == 0 || c0105a.f4012i == 0 || (i3 = (tVar2 = c0105a.a).c) == 0 || tVar2.b != i3 || !c0105a.c) {
                        cVar = null;
                    } else {
                        tVar2.C(0);
                        int i13 = c0105a.f4011h * c0105a.f4012i;
                        int[] iArr = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int r6 = c0105a.a.r();
                            if (r6 != 0) {
                                i4 = i14 + 1;
                                iArr[i14] = c0105a.b[r6];
                            } else {
                                int r7 = c0105a.a.r();
                                if (r7 != 0) {
                                    i4 = ((r7 & 64) == 0 ? r7 & 63 : ((r7 & 63) << 8) | c0105a.a.r()) + i14;
                                    Arrays.fill(iArr, i14, i4, (r7 & 128) == 0 ? 0 : c0105a.b[c0105a.a.r()]);
                                }
                            }
                            i14 = i4;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr, c0105a.f4011h, c0105a.f4012i, Bitmap.Config.ARGB_8888);
                        float f2 = c0105a.f4007d;
                        float f3 = c0105a.f4008e;
                        cVar = new c(null, null, createBitmap, c0105a.f4010g / f3, 0, 0, c0105a.f4009f / f2, 0, Integer.MIN_VALUE, -3.4028235E38f, c0105a.f4011h / f2, c0105a.f4012i / f3, false, -16777216, Integer.MIN_VALUE, null);
                    }
                    c0105a.a();
                }
                tVar.C(i7);
            }
            ArrayList arrayList2 = arrayList;
            if (cVar != null) {
                arrayList2.add(cVar);
            }
            arrayList = arrayList2;
            i5 = 0;
            aVar = this;
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
