package f.h.b.b.y1.k0;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.t;
import f.h.b.b.y1.h;
import f.h.b.b.y1.i;
import f.h.b.b.y1.j;
import f.h.b.b.y1.k;
import f.h.b.b.y1.l;
import f.h.b.b.y1.w;
import java.util.Map;

/* compiled from: WavExtractor.java */
/* loaded from: classes.dex */
public final class b implements h {
    public j a;
    public w b;
    public InterfaceC0115b c;

    /* renamed from: d  reason: collision with root package name */
    public int f5078d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f5079e = -1;

    /* compiled from: WavExtractor.java */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC0115b {

        /* renamed from: m  reason: collision with root package name */
        public static final int[] f5080m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        public final j a;
        public final w b;
        public final f.h.b.b.y1.k0.c c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5081d;

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f5082e;

        /* renamed from: f  reason: collision with root package name */
        public final t f5083f;

        /* renamed from: g  reason: collision with root package name */
        public final int f5084g;

        /* renamed from: h  reason: collision with root package name */
        public final Format f5085h;

        /* renamed from: i  reason: collision with root package name */
        public int f5086i;

        /* renamed from: j  reason: collision with root package name */
        public long f5087j;

        /* renamed from: k  reason: collision with root package name */
        public int f5088k;

        /* renamed from: l  reason: collision with root package name */
        public long f5089l;

        public a(j jVar, w wVar, f.h.b.b.y1.k0.c cVar) {
            this.a = jVar;
            this.b = wVar;
            this.c = cVar;
            int max = Math.max(1, cVar.c / 10);
            this.f5084g = max;
            byte[] bArr = cVar.f5097f;
            int length = bArr.length;
            byte b = bArr[0];
            byte b2 = bArr[1];
            int i2 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
            this.f5081d = i2;
            int i3 = cVar.b;
            int i4 = (((cVar.f5095d - (i3 * 4)) * 8) / (cVar.f5096e * i3)) + 1;
            if (i2 == i4) {
                int f2 = b0.f(max, i2);
                this.f5082e = new byte[cVar.f5095d * f2];
                this.f5083f = new t(i2 * 2 * i3 * f2);
                int i5 = cVar.c;
                int i6 = ((cVar.f5095d * i5) * 8) / i2;
                Format.b bVar = new Format.b();
                bVar.f722k = "audio/raw";
                bVar.f717f = i6;
                bVar.f718g = i6;
                bVar.f723l = max * 2 * i3;
                bVar.x = cVar.b;
                bVar.y = i5;
                bVar.z = 2;
                this.f5085h = bVar.a();
                return;
            }
            throw new ParserException(f.a.b.a.a.e(56, "Expected frames per block: ", i4, "; got: ", i2));
        }

        @Override // f.h.b.b.y1.k0.b.InterfaceC0115b
        public void a(long j2) {
            this.f5086i = 0;
            this.f5087j = j2;
            this.f5088k = 0;
            this.f5089l = 0L;
        }

        @Override // f.h.b.b.y1.k0.b.InterfaceC0115b
        public void b(int i2, long j2) {
            this.a.a(new e(this.c, this.f5081d, i2, j2));
            this.b.e(this.f5085h);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[LOOP:0: B:6:0x0028->B:13:0x0043, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0041 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003f -> B:12:0x0041). Please submit an issue!!! */
        @Override // f.h.b.b.y1.k0.b.InterfaceC0115b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(f.h.b.b.y1.i r19, long r20) {
            /*
                Method dump skipped, instructions count: 364
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.k0.b.a.c(f.h.b.b.y1.i, long):boolean");
        }

        public final int d(int i2) {
            return i2 / (this.c.b * 2);
        }

        public final void e(int i2) {
            long E = this.f5087j + b0.E(this.f5089l, 1000000L, this.c.c);
            int i3 = i2 * 2 * this.c.b;
            this.b.d(E, 1, i3, this.f5088k - i3, null);
            this.f5089l += i2;
            this.f5088k -= i3;
        }
    }

    /* compiled from: WavExtractor.java */
    /* renamed from: f.h.b.b.y1.k0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0115b {
        void a(long j2);

        void b(int i2, long j2);

        boolean c(i iVar, long j2);
    }

    /* compiled from: WavExtractor.java */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC0115b {
        public final j a;
        public final w b;
        public final f.h.b.b.y1.k0.c c;

        /* renamed from: d  reason: collision with root package name */
        public final Format f5090d;

        /* renamed from: e  reason: collision with root package name */
        public final int f5091e;

        /* renamed from: f  reason: collision with root package name */
        public long f5092f;

        /* renamed from: g  reason: collision with root package name */
        public int f5093g;

        /* renamed from: h  reason: collision with root package name */
        public long f5094h;

        public c(j jVar, w wVar, f.h.b.b.y1.k0.c cVar, String str, int i2) {
            this.a = jVar;
            this.b = wVar;
            this.c = cVar;
            int i3 = (cVar.b * cVar.f5096e) / 8;
            if (cVar.f5095d == i3) {
                int i4 = cVar.c * i3;
                int i5 = i4 * 8;
                int max = Math.max(i3, i4 / 10);
                this.f5091e = max;
                Format.b bVar = new Format.b();
                bVar.f722k = str;
                bVar.f717f = i5;
                bVar.f718g = i5;
                bVar.f723l = max;
                bVar.x = cVar.b;
                bVar.y = cVar.c;
                bVar.z = i2;
                this.f5090d = bVar.a();
                return;
            }
            throw new ParserException(f.a.b.a.a.e(50, "Expected block size: ", i3, "; got: ", cVar.f5095d));
        }

        @Override // f.h.b.b.y1.k0.b.InterfaceC0115b
        public void a(long j2) {
            this.f5092f = j2;
            this.f5093g = 0;
            this.f5094h = 0L;
        }

        @Override // f.h.b.b.y1.k0.b.InterfaceC0115b
        public void b(int i2, long j2) {
            this.a.a(new e(this.c, 1, i2, j2));
            this.b.e(this.f5090d);
        }

        @Override // f.h.b.b.y1.k0.b.InterfaceC0115b
        public boolean c(i iVar, long j2) {
            int i2;
            f.h.b.b.y1.k0.c cVar;
            int i3;
            int i4;
            long j3 = j2;
            while (true) {
                i2 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                if (i2 <= 0 || (i3 = this.f5093g) >= (i4 = this.f5091e)) {
                    break;
                }
                int b = this.b.b(iVar, (int) Math.min(i4 - i3, j3), true);
                if (b == -1) {
                    j3 = 0;
                } else {
                    this.f5093g += b;
                    j3 -= b;
                }
            }
            int i5 = this.c.f5095d;
            int i6 = this.f5093g / i5;
            if (i6 > 0) {
                int i7 = i6 * i5;
                int i8 = this.f5093g - i7;
                this.b.d(this.f5092f + b0.E(this.f5094h, 1000000L, cVar.c), 1, i7, i8, null);
                this.f5094h += i6;
                this.f5093g = i8;
            }
            return i2 <= 0;
        }
    }

    static {
        f.h.b.b.y1.k0.a aVar = new l() { // from class: f.h.b.b.y1.k0.a
            @Override // f.h.b.b.y1.l
            public final h[] a() {
                return new h[]{new b()};
            }

            @Override // f.h.b.b.y1.l
            public /* synthetic */ h[] b(Uri uri, Map map) {
                return k.a(this, uri, map);
            }
        };
    }

    @Override // f.h.b.b.y1.h
    public boolean b(i iVar) {
        return f.c.a.a.i.y(iVar) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    @Override // f.h.b.b.y1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int e(f.h.b.b.y1.i r13, f.h.b.b.y1.s r14) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.k0.b.e(f.h.b.b.y1.i, f.h.b.b.y1.s):int");
    }

    @Override // f.h.b.b.y1.h
    public void f(j jVar) {
        this.a = jVar;
        this.b = jVar.p(0, 1);
        jVar.j();
    }

    @Override // f.h.b.b.y1.h
    public void g(long j2, long j3) {
        InterfaceC0115b interfaceC0115b = this.c;
        if (interfaceC0115b != null) {
            interfaceC0115b.a(j3);
        }
    }

    @Override // f.h.b.b.y1.h
    public void release() {
    }
}
