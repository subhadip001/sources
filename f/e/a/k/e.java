package f.e.a.k;

import android.graphics.Bitmap;
import android.util.Log;
import f.e.a.k.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* compiled from: StandardGifDecoder.java */
/* loaded from: classes.dex */
public class e implements a {
    public static final String u = "e";
    public int[] a;
    public final a.InterfaceC0069a c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f3226d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f3227e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f3228f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f3229g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f3230h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f3231i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f3232j;

    /* renamed from: k  reason: collision with root package name */
    public int f3233k;

    /* renamed from: l  reason: collision with root package name */
    public c f3234l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f3235m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public Boolean s;
    public final int[] b = new int[256];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public e(a.InterfaceC0069a interfaceC0069a, c cVar, ByteBuffer byteBuffer, int i2) {
        int[] iArr;
        this.c = interfaceC0069a;
        this.f3234l = new c();
        synchronized (this) {
            if (i2 > 0) {
                int highestOneBit = Integer.highestOneBit(i2);
                this.o = 0;
                this.f3234l = cVar;
                this.f3233k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f3226d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f3226d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator<b> it = cVar.f3218e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().f3212g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = highestOneBit;
                int i3 = cVar.f3219f;
                this.r = i3 / highestOneBit;
                int i4 = cVar.f3220g;
                this.q = i4 / highestOneBit;
                this.f3231i = ((f.e.a.l.s.g.b) this.c).a(i3 * i4);
                a.InterfaceC0069a interfaceC0069a2 = this.c;
                int i5 = this.r * this.q;
                f.e.a.l.q.b0.b bVar = ((f.e.a.l.s.g.b) interfaceC0069a2).b;
                if (bVar == null) {
                    iArr = new int[i5];
                } else {
                    iArr = (int[]) bVar.e(i5, int[].class);
                }
                this.f3232j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
            }
        }
    }

    @Override // f.e.a.k.a
    public synchronized Bitmap a() {
        if (this.f3234l.c <= 0 || this.f3233k < 0) {
            String str = u;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f3234l.c + ", framePointer=" + this.f3233k);
            }
            this.o = 1;
        }
        int i2 = this.o;
        if (i2 != 1 && i2 != 2) {
            this.o = 0;
            if (this.f3227e == null) {
                this.f3227e = ((f.e.a.l.s.g.b) this.c).a(255);
            }
            b bVar = this.f3234l.f3218e.get(this.f3233k);
            int i3 = this.f3233k - 1;
            b bVar2 = i3 >= 0 ? this.f3234l.f3218e.get(i3) : null;
            int[] iArr = bVar.f3216k;
            if (iArr == null) {
                iArr = this.f3234l.a;
            }
            this.a = iArr;
            if (iArr == null) {
                String str2 = u;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.f3233k);
                }
                this.o = 1;
                return null;
            }
            if (bVar.f3211f) {
                System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                int[] iArr2 = this.b;
                this.a = iArr2;
                iArr2[bVar.f3213h] = 0;
                if (bVar.f3212g == 2 && this.f3233k == 0) {
                    this.s = Boolean.TRUE;
                }
            }
            return j(bVar, bVar2);
        }
        String str3 = u;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.o);
        }
        return null;
    }

    @Override // f.e.a.k.a
    public void b() {
        this.f3233k = (this.f3233k + 1) % this.f3234l.c;
    }

    @Override // f.e.a.k.a
    public int c() {
        return this.f3234l.c;
    }

    @Override // f.e.a.k.a
    public void clear() {
        f.e.a.l.q.b0.b bVar;
        f.e.a.l.q.b0.b bVar2;
        f.e.a.l.q.b0.b bVar3;
        this.f3234l = null;
        byte[] bArr = this.f3231i;
        if (bArr != null && (bVar3 = ((f.e.a.l.s.g.b) this.c).b) != null) {
            bVar3.d(bArr);
        }
        int[] iArr = this.f3232j;
        if (iArr != null && (bVar2 = ((f.e.a.l.s.g.b) this.c).b) != null) {
            bVar2.d(iArr);
        }
        Bitmap bitmap = this.f3235m;
        if (bitmap != null) {
            ((f.e.a.l.s.g.b) this.c).a.d(bitmap);
        }
        this.f3235m = null;
        this.f3226d = null;
        this.s = null;
        byte[] bArr2 = this.f3227e;
        if (bArr2 == null || (bVar = ((f.e.a.l.s.g.b) this.c).b) == null) {
            return;
        }
        bVar.d(bArr2);
    }

    @Override // f.e.a.k.a
    public int d() {
        int i2;
        c cVar = this.f3234l;
        int i3 = cVar.c;
        if (i3 <= 0 || (i2 = this.f3233k) < 0) {
            return 0;
        }
        if (i2 < 0 || i2 >= i3) {
            return -1;
        }
        return cVar.f3218e.get(i2).f3214i;
    }

    @Override // f.e.a.k.a
    public ByteBuffer e() {
        return this.f3226d;
    }

    @Override // f.e.a.k.a
    public int f() {
        return this.f3233k;
    }

    @Override // f.e.a.k.a
    public int g() {
        return (this.f3232j.length * 4) + this.f3226d.limit() + this.f3231i.length;
    }

    public final Bitmap h() {
        Boolean bool = this.s;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t;
        Bitmap c = ((f.e.a.l.s.g.b) this.c).a.c(this.r, this.q, config);
        c.setHasAlpha(true);
        return c;
    }

    public void i(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.t = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        if (r3.f3223j == r36.f3213h) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap j(f.e.a.k.b r36, f.e.a.k.b r37) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.k.e.j(f.e.a.k.b, f.e.a.k.b):android.graphics.Bitmap");
    }
}
