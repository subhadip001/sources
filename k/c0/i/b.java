package k.c0.i;

import com.google.android.gms.common.api.Api;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;
import k.c0.i.p;
import l.t;
import l.y;

/* compiled from: Hpack.java */
/* loaded from: classes2.dex */
public final class b {
    public static final k.c0.i.a[] a;
    public static final Map<l.i, Integer> b;

    /* compiled from: Hpack.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public final l.h b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public int f8975d;
        public final List<k.c0.i.a> a = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public k.c0.i.a[] f8976e = new k.c0.i.a[8];

        /* renamed from: f  reason: collision with root package name */
        public int f8977f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f8978g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f8979h = 0;

        public a(int i2, y yVar) {
            this.c = i2;
            this.f8975d = i2;
            Logger logger = l.o.a;
            this.b = new t(yVar);
        }

        public final void a() {
            Arrays.fill(this.f8976e, (Object) null);
            this.f8977f = this.f8976e.length - 1;
            this.f8978g = 0;
            this.f8979h = 0;
        }

        public final int b(int i2) {
            return this.f8977f + 1 + i2;
        }

        public final int c(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f8976e.length;
                while (true) {
                    length--;
                    i3 = this.f8977f;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    k.c0.i.a[] aVarArr = this.f8976e;
                    i2 -= aVarArr[length].c;
                    this.f8979h -= aVarArr[length].c;
                    this.f8978g--;
                    i4++;
                }
                k.c0.i.a[] aVarArr2 = this.f8976e;
                System.arraycopy(aVarArr2, i3 + 1, aVarArr2, i3 + 1 + i4, this.f8978g);
                this.f8977f += i4;
            }
            return i4;
        }

        public final l.i d(int i2) {
            if (i2 >= 0 && i2 <= b.a.length + (-1)) {
                return b.a[i2].a;
            }
            int b = b(i2 - b.a.length);
            if (b >= 0) {
                k.c0.i.a[] aVarArr = this.f8976e;
                if (b < aVarArr.length) {
                    return aVarArr[b].a;
                }
            }
            StringBuilder A = f.a.b.a.a.A("Header index too large ");
            A.append(i2 + 1);
            throw new IOException(A.toString());
        }

        public final void e(int i2, k.c0.i.a aVar) {
            this.a.add(aVar);
            int i3 = aVar.c;
            if (i2 != -1) {
                i3 -= this.f8976e[(this.f8977f + 1) + i2].c;
            }
            int i4 = this.f8975d;
            if (i3 > i4) {
                a();
                return;
            }
            int c = c((this.f8979h + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f8978g + 1;
                k.c0.i.a[] aVarArr = this.f8976e;
                if (i5 > aVarArr.length) {
                    k.c0.i.a[] aVarArr2 = new k.c0.i.a[aVarArr.length * 2];
                    System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                    this.f8977f = this.f8976e.length - 1;
                    this.f8976e = aVarArr2;
                }
                int i6 = this.f8977f;
                this.f8977f = i6 - 1;
                this.f8976e[i6] = aVar;
                this.f8978g++;
            } else {
                this.f8976e[this.f8977f + 1 + i2 + c + i2] = aVar;
            }
            this.f8979h += i3;
        }

        public l.i f() {
            int readByte = this.b.readByte() & 255;
            boolean z = (readByte & 128) == 128;
            int g2 = g(readByte, 127);
            if (z) {
                p pVar = p.f9080d;
                byte[] S = this.b.S(g2);
                Objects.requireNonNull(pVar);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                p.a aVar = pVar.a;
                int i2 = 0;
                int i3 = 0;
                for (byte b : S) {
                    i2 = (i2 << 8) | (b & 255);
                    i3 += 8;
                    while (i3 >= 8) {
                        int i4 = i3 - 8;
                        aVar = aVar.a[(i2 >>> i4) & 255];
                        if (aVar.a == null) {
                            byteArrayOutputStream.write(aVar.b);
                            i3 -= aVar.c;
                            aVar = pVar.a;
                        } else {
                            i3 = i4;
                        }
                    }
                }
                while (i3 > 0) {
                    p.a aVar2 = aVar.a[(i2 << (8 - i3)) & 255];
                    if (aVar2.a != null || aVar2.c > i3) {
                        break;
                    }
                    byteArrayOutputStream.write(aVar2.b);
                    i3 -= aVar2.c;
                    aVar = pVar.a;
                }
                return l.i.m(byteArrayOutputStream.toByteArray());
            }
            return this.b.j(g2);
        }

        public int g(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int readByte = this.b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i3 + (readByte << i5);
                }
                i3 += (readByte & 127) << i5;
                i5 += 7;
            }
        }
    }

    /* compiled from: Hpack.java */
    /* renamed from: k.c0.i.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0232b {
        public final l.f a;
        public boolean c;
        public int b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* renamed from: e  reason: collision with root package name */
        public k.c0.i.a[] f8981e = new k.c0.i.a[8];

        /* renamed from: f  reason: collision with root package name */
        public int f8982f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f8983g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f8984h = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f8980d = 4096;

        public C0232b(l.f fVar) {
            this.a = fVar;
        }

        public final void a() {
            Arrays.fill(this.f8981e, (Object) null);
            this.f8982f = this.f8981e.length - 1;
            this.f8983g = 0;
            this.f8984h = 0;
        }

        public final int b(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f8981e.length;
                while (true) {
                    length--;
                    i3 = this.f8982f;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    k.c0.i.a[] aVarArr = this.f8981e;
                    i2 -= aVarArr[length].c;
                    this.f8984h -= aVarArr[length].c;
                    this.f8983g--;
                    i4++;
                }
                k.c0.i.a[] aVarArr2 = this.f8981e;
                System.arraycopy(aVarArr2, i3 + 1, aVarArr2, i3 + 1 + i4, this.f8983g);
                k.c0.i.a[] aVarArr3 = this.f8981e;
                int i5 = this.f8982f;
                Arrays.fill(aVarArr3, i5 + 1, i5 + 1 + i4, (Object) null);
                this.f8982f += i4;
            }
            return i4;
        }

        public final void c(k.c0.i.a aVar) {
            int i2 = aVar.c;
            int i3 = this.f8980d;
            if (i2 > i3) {
                a();
                return;
            }
            b((this.f8984h + i2) - i3);
            int i4 = this.f8983g + 1;
            k.c0.i.a[] aVarArr = this.f8981e;
            if (i4 > aVarArr.length) {
                k.c0.i.a[] aVarArr2 = new k.c0.i.a[aVarArr.length * 2];
                System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                this.f8982f = this.f8981e.length - 1;
                this.f8981e = aVarArr2;
            }
            int i5 = this.f8982f;
            this.f8982f = i5 - 1;
            this.f8981e[i5] = aVar;
            this.f8983g++;
            this.f8984h += i2;
        }

        public void d(l.i iVar) {
            Objects.requireNonNull(p.f9080d);
            long j2 = 0;
            int i2 = 0;
            long j3 = 0;
            for (int i3 = 0; i3 < iVar.p(); i3++) {
                j3 += p.c[iVar.k(i3) & 255];
            }
            if (((int) ((j3 + 7) >> 3)) < iVar.p()) {
                l.f fVar = new l.f();
                Objects.requireNonNull(p.f9080d);
                byte b = 0;
                while (i2 < iVar.p()) {
                    int k2 = iVar.k(i2) & 255;
                    int i4 = p.b[k2];
                    byte b2 = p.c[k2];
                    j2 = (j2 << b2) | i4;
                    int i5 = b + b2;
                    while (i5 >= 8) {
                        i5 = (i5 == 1 ? 1 : 0) - 8;
                        fVar.t((int) (j2 >> i5));
                    }
                    i2++;
                    b = i5;
                }
                if (b > 0) {
                    fVar.t((int) ((j2 << (8 - b)) | (255 >>> b)));
                }
                l.i C = fVar.C();
                f(C.f9233f.length, 127, 128);
                this.a.X(C);
                return;
            }
            f(iVar.p(), 127, 0);
            this.a.X(iVar);
        }

        public void e(List<k.c0.i.a> list) {
            int i2;
            int i3;
            if (this.c) {
                int i4 = this.b;
                if (i4 < this.f8980d) {
                    f(i4, 31, 32);
                }
                this.c = false;
                this.b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                f(this.f8980d, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                k.c0.i.a aVar = list.get(i5);
                l.i r = aVar.a.r();
                l.i iVar = aVar.b;
                Integer num = b.b.get(r);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        k.c0.i.a[] aVarArr = b.a;
                        if (k.c0.c.k(aVarArr[i2 - 1].b, iVar)) {
                            i3 = i2;
                        } else if (k.c0.c.k(aVarArr[i2].b, iVar)) {
                            i3 = i2;
                            i2++;
                        }
                    }
                    i3 = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i3 = -1;
                }
                if (i2 == -1) {
                    int i6 = this.f8982f + 1;
                    int length = this.f8981e.length;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        if (k.c0.c.k(this.f8981e[i6].a, r)) {
                            if (k.c0.c.k(this.f8981e[i6].b, iVar)) {
                                i2 = b.a.length + (i6 - this.f8982f);
                                break;
                            } else if (i3 == -1) {
                                i3 = (i6 - this.f8982f) + b.a.length;
                            }
                        }
                        i6++;
                    }
                }
                if (i2 != -1) {
                    f(i2, 127, 128);
                } else if (i3 == -1) {
                    this.a.m0(64);
                    d(r);
                    d(iVar);
                    c(aVar);
                } else {
                    l.i iVar2 = k.c0.i.a.f8969d;
                    Objects.requireNonNull(r);
                    if (r.n(0, iVar2, 0, iVar2.p()) && !k.c0.i.a.f8974i.equals(r)) {
                        f(i3, 15, 0);
                        d(iVar);
                    } else {
                        f(i3, 63, 64);
                        d(iVar);
                        c(aVar);
                    }
                }
            }
        }

        public void f(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.a.m0(i2 | i4);
                return;
            }
            this.a.m0(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.a.m0(128 | (i5 & 127));
                i5 >>>= 7;
            }
            this.a.m0(i5);
        }
    }

    static {
        k.c0.i.a aVar = new k.c0.i.a(k.c0.i.a.f8974i, "");
        int i2 = 0;
        l.i iVar = k.c0.i.a.f8971f;
        l.i iVar2 = k.c0.i.a.f8972g;
        l.i iVar3 = k.c0.i.a.f8973h;
        l.i iVar4 = k.c0.i.a.f8970e;
        k.c0.i.a[] aVarArr = {aVar, new k.c0.i.a(iVar, "GET"), new k.c0.i.a(iVar, "POST"), new k.c0.i.a(iVar2, "/"), new k.c0.i.a(iVar2, "/index.html"), new k.c0.i.a(iVar3, "http"), new k.c0.i.a(iVar3, "https"), new k.c0.i.a(iVar4, "200"), new k.c0.i.a(iVar4, "204"), new k.c0.i.a(iVar4, "206"), new k.c0.i.a(iVar4, "304"), new k.c0.i.a(iVar4, "400"), new k.c0.i.a(iVar4, "404"), new k.c0.i.a(iVar4, "500"), new k.c0.i.a("accept-charset", ""), new k.c0.i.a("accept-encoding", "gzip, deflate"), new k.c0.i.a("accept-language", ""), new k.c0.i.a("accept-ranges", ""), new k.c0.i.a("accept", ""), new k.c0.i.a("access-control-allow-origin", ""), new k.c0.i.a("age", ""), new k.c0.i.a("allow", ""), new k.c0.i.a("authorization", ""), new k.c0.i.a("cache-control", ""), new k.c0.i.a("content-disposition", ""), new k.c0.i.a("content-encoding", ""), new k.c0.i.a("content-language", ""), new k.c0.i.a("content-length", ""), new k.c0.i.a("content-location", ""), new k.c0.i.a("content-range", ""), new k.c0.i.a("content-type", ""), new k.c0.i.a("cookie", ""), new k.c0.i.a("date", ""), new k.c0.i.a("etag", ""), new k.c0.i.a("expect", ""), new k.c0.i.a("expires", ""), new k.c0.i.a(Constants.MessagePayloadKeys.FROM, ""), new k.c0.i.a("host", ""), new k.c0.i.a("if-match", ""), new k.c0.i.a("if-modified-since", ""), new k.c0.i.a("if-none-match", ""), new k.c0.i.a("if-range", ""), new k.c0.i.a("if-unmodified-since", ""), new k.c0.i.a("last-modified", ""), new k.c0.i.a("link", ""), new k.c0.i.a(FirebaseAnalytics.Param.LOCATION, ""), new k.c0.i.a("max-forwards", ""), new k.c0.i.a("proxy-authenticate", ""), new k.c0.i.a("proxy-authorization", ""), new k.c0.i.a("range", ""), new k.c0.i.a("referer", ""), new k.c0.i.a("refresh", ""), new k.c0.i.a("retry-after", ""), new k.c0.i.a("server", ""), new k.c0.i.a("set-cookie", ""), new k.c0.i.a("strict-transport-security", ""), new k.c0.i.a("transfer-encoding", ""), new k.c0.i.a("user-agent", ""), new k.c0.i.a("vary", ""), new k.c0.i.a("via", ""), new k.c0.i.a("www-authenticate", "")};
        a = aVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aVarArr.length);
        while (true) {
            k.c0.i.a[] aVarArr2 = a;
            if (i2 < aVarArr2.length) {
                if (!linkedHashMap.containsKey(aVarArr2[i2].a)) {
                    linkedHashMap.put(aVarArr2[i2].a, Integer.valueOf(i2));
                }
                i2++;
            } else {
                b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    public static l.i a(l.i iVar) {
        int p = iVar.p();
        for (int i2 = 0; i2 < p; i2++) {
            byte k2 = iVar.k(i2);
            if (k2 >= 65 && k2 <= 90) {
                StringBuilder A = f.a.b.a.a.A("PROTOCOL_ERROR response malformed: mixed case name: ");
                A.append(iVar.t());
                throw new IOException(A.toString());
            }
        }
        return iVar;
    }
}
