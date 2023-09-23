package f.e.a.k;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: GifHeaderParser.java */
/* loaded from: classes.dex */
public class d {
    public ByteBuffer b;
    public c c;
    public final byte[] a = new byte[256];

    /* renamed from: d  reason: collision with root package name */
    public int f3225d = 0;

    public final boolean a() {
        return this.c.b != 0;
    }

    public c b() {
        if (this.b != null) {
            if (a()) {
                return this.c;
            }
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < 6; i2++) {
                sb.append((char) c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.c.b = 1;
            } else {
                this.c.f3219f = f();
                this.c.f3220g = f();
                int c = c();
                c cVar = this.c;
                cVar.f3221h = (c & 128) != 0;
                cVar.f3222i = (int) Math.pow(2.0d, (c & 7) + 1);
                this.c.f3223j = c();
                c cVar2 = this.c;
                c();
                Objects.requireNonNull(cVar2);
                if (this.c.f3221h && !a()) {
                    c cVar3 = this.c;
                    cVar3.a = e(cVar3.f3222i);
                    c cVar4 = this.c;
                    cVar4.f3224k = cVar4.a[cVar4.f3223j];
                }
            }
            if (!a()) {
                boolean z = false;
                while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                    int c2 = c();
                    if (c2 == 33) {
                        int c3 = c();
                        if (c3 == 1) {
                            g();
                        } else if (c3 == 249) {
                            this.c.f3217d = new b();
                            c();
                            int c4 = c();
                            b bVar = this.c.f3217d;
                            int i3 = (c4 & 28) >> 2;
                            bVar.f3212g = i3;
                            if (i3 == 0) {
                                bVar.f3212g = 1;
                            }
                            bVar.f3211f = (c4 & 1) != 0;
                            int f2 = f();
                            if (f2 < 2) {
                                f2 = 10;
                            }
                            b bVar2 = this.c.f3217d;
                            bVar2.f3214i = f2 * 10;
                            bVar2.f3213h = c();
                            c();
                        } else if (c3 == 254) {
                            g();
                        } else if (c3 != 255) {
                            g();
                        } else {
                            d();
                            StringBuilder sb2 = new StringBuilder();
                            for (int i4 = 0; i4 < 11; i4++) {
                                sb2.append((char) this.a[i4]);
                            }
                            if (sb2.toString().equals("NETSCAPE2.0")) {
                                do {
                                    d();
                                    byte[] bArr = this.a;
                                    if (bArr[0] == 1) {
                                        byte b = bArr[1];
                                        byte b2 = bArr[2];
                                        Objects.requireNonNull(this.c);
                                    }
                                    if (this.f3225d > 0) {
                                    }
                                } while (!a());
                            } else {
                                g();
                            }
                        }
                    } else if (c2 == 44) {
                        c cVar5 = this.c;
                        if (cVar5.f3217d == null) {
                            cVar5.f3217d = new b();
                        }
                        cVar5.f3217d.a = f();
                        this.c.f3217d.b = f();
                        this.c.f3217d.c = f();
                        this.c.f3217d.f3209d = f();
                        int c5 = c();
                        boolean z2 = (c5 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (c5 & 7) + 1);
                        b bVar3 = this.c.f3217d;
                        bVar3.f3210e = (c5 & 64) != 0;
                        if (z2) {
                            bVar3.f3216k = e(pow);
                        } else {
                            bVar3.f3216k = null;
                        }
                        this.c.f3217d.f3215j = this.b.position();
                        c();
                        g();
                        if (!a()) {
                            c cVar6 = this.c;
                            cVar6.c++;
                            cVar6.f3218e.add(cVar6.f3217d);
                        }
                    } else if (c2 != 59) {
                        this.c.b = 1;
                    } else {
                        z = true;
                    }
                }
                c cVar7 = this.c;
                if (cVar7.c < 0) {
                    cVar7.b = 1;
                }
            }
            return this.c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void d() {
        int c = c();
        this.f3225d = c;
        if (c <= 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            try {
                i3 = this.f3225d;
                if (i2 >= i3) {
                    return;
                }
                i3 -= i2;
                this.b.get(this.a, i2, i3);
                i2 += i3;
            } catch (Exception e2) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder C = f.a.b.a.a.C("Error Reading Block n: ", i2, " count: ", i3, " blockSize: ");
                    C.append(this.f3225d);
                    Log.d("GifHeaderParser", C.toString(), e2);
                }
                this.c.b = 1;
                return;
            }
        }
    }

    public final int[] e(int i2) {
        byte[] bArr = new byte[i2 * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i3 + 1;
                iArr[i3] = ((bArr[i4] & 255) << 16) | (-16777216) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
                i4 = i7;
                i3 = i8;
            }
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.c.b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.b.getShort();
    }

    public final void g() {
        int c;
        do {
            c = c();
            this.b.position(Math.min(this.b.position() + c, this.b.limit()));
        } while (c > 0);
    }
}
