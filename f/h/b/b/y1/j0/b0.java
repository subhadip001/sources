package f.h.b.b.y1.j0;

import android.net.Uri;
import android.util.SparseArray;
import java.util.Map;

/* compiled from: PsExtractor.java */
/* loaded from: classes.dex */
public final class b0 implements f.h.b.b.y1.h {

    /* renamed from: e  reason: collision with root package name */
    public boolean f4882e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4883f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4884g;

    /* renamed from: h  reason: collision with root package name */
    public long f4885h;

    /* renamed from: i  reason: collision with root package name */
    public z f4886i;

    /* renamed from: j  reason: collision with root package name */
    public f.h.b.b.y1.j f4887j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4888k;
    public final f.h.b.b.g2.a0 a = new f.h.b.b.g2.a0(0);
    public final f.h.b.b.g2.t c = new f.h.b.b.g2.t(4096);
    public final SparseArray<a> b = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    public final a0 f4881d = new a0();

    /* compiled from: PsExtractor.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final o a;
        public final f.h.b.b.g2.a0 b;
        public final f.h.b.b.g2.s c = new f.h.b.b.g2.s(new byte[64]);

        /* renamed from: d  reason: collision with root package name */
        public boolean f4889d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4890e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4891f;

        /* renamed from: g  reason: collision with root package name */
        public int f4892g;

        /* renamed from: h  reason: collision with root package name */
        public long f4893h;

        public a(o oVar, f.h.b.b.g2.a0 a0Var) {
            this.a = oVar;
            this.b = a0Var;
        }
    }

    static {
        d dVar = new f.h.b.b.y1.l() { // from class: f.h.b.b.y1.j0.d
            @Override // f.h.b.b.y1.l
            public final f.h.b.b.y1.h[] a() {
                return new f.h.b.b.y1.h[]{new b0()};
            }

            @Override // f.h.b.b.y1.l
            public /* synthetic */ f.h.b.b.y1.h[] b(Uri uri, Map map) {
                return f.h.b.b.y1.k.a(this, uri, map);
            }
        };
    }

    @Override // f.h.b.b.y1.h
    public boolean b(f.h.b.b.y1.i iVar) {
        byte[] bArr = new byte[14];
        iVar.o(bArr, 0, 14);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            iVar.g(bArr[13] & 7);
            iVar.o(bArr, 0, 3);
            return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x020a  */
    @Override // f.h.b.b.y1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int e(f.h.b.b.y1.i r18, f.h.b.b.y1.s r19) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.j0.b0.e(f.h.b.b.y1.i, f.h.b.b.y1.s):int");
    }

    @Override // f.h.b.b.y1.h
    public void f(f.h.b.b.y1.j jVar) {
        this.f4887j = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r7 != r9) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[LOOP:0: B:16:0x0034->B:18:0x003c, LOOP_END] */
    @Override // f.h.b.b.y1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(long r7, long r9) {
        /*
            r6 = this;
            f.h.b.b.g2.a0 r7 = r6.a
            long r7 = r7.c()
            r0 = 0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 != 0) goto L12
            r7 = 1
            goto L13
        L12:
            r7 = 0
        L13:
            if (r7 != 0) goto L23
            f.h.b.b.g2.a0 r7 = r6.a
            long r7 = r7.a
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L2c
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 == 0) goto L2c
        L23:
            f.h.b.b.g2.a0 r7 = r6.a
            r7.c = r1
            f.h.b.b.g2.a0 r7 = r6.a
            r7.d(r9)
        L2c:
            f.h.b.b.y1.j0.z r7 = r6.f4886i
            if (r7 == 0) goto L33
            r7.e(r9)
        L33:
            r7 = 0
        L34:
            android.util.SparseArray<f.h.b.b.y1.j0.b0$a> r8 = r6.b
            int r8 = r8.size()
            if (r7 >= r8) goto L4e
            android.util.SparseArray<f.h.b.b.y1.j0.b0$a> r8 = r6.b
            java.lang.Object r8 = r8.valueAt(r7)
            f.h.b.b.y1.j0.b0$a r8 = (f.h.b.b.y1.j0.b0.a) r8
            r8.f4891f = r0
            f.h.b.b.y1.j0.o r8 = r8.a
            r8.c()
            int r7 = r7 + 1
            goto L34
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.j0.b0.g(long, long):void");
    }

    @Override // f.h.b.b.y1.h
    public void release() {
    }
}
