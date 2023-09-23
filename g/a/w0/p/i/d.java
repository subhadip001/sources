package g.a.w0.p.i;

import com.google.android.gms.common.api.Api;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import g.a.w0.p.i.f;
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
import l.i;
import l.o;
import l.t;
import l.y;

/* compiled from: Hpack.java */
/* loaded from: classes2.dex */
public final class d {
    public static final i a = i.j(":");
    public static final c[] b;
    public static final Map<i, Integer> c;

    /* compiled from: Hpack.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public final l.h b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f8086d;
        public final List<c> a = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public c[] f8087e = new c[8];

        /* renamed from: f  reason: collision with root package name */
        public int f8088f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f8089g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f8090h = 0;

        public a(int i2, y yVar) {
            this.c = i2;
            this.f8086d = i2;
            Logger logger = o.a;
            this.b = new t(yVar);
        }

        public final void a() {
            Arrays.fill(this.f8087e, (Object) null);
            this.f8088f = this.f8087e.length - 1;
            this.f8089g = 0;
            this.f8090h = 0;
        }

        public final int b(int i2) {
            return this.f8088f + 1 + i2;
        }

        public final int c(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f8087e.length;
                while (true) {
                    length--;
                    i3 = this.f8088f;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    c[] cVarArr = this.f8087e;
                    i2 -= cVarArr[length].c;
                    this.f8090h -= cVarArr[length].c;
                    this.f8089g--;
                    i4++;
                }
                c[] cVarArr2 = this.f8087e;
                System.arraycopy(cVarArr2, i3 + 1, cVarArr2, i3 + 1 + i4, this.f8089g);
                this.f8088f += i4;
            }
            return i4;
        }

        public final i d(int i2) {
            if (i2 >= 0 && i2 <= d.b.length + (-1)) {
                return d.b[i2].a;
            }
            int b = b(i2 - d.b.length);
            if (b >= 0) {
                c[] cVarArr = this.f8087e;
                if (b < cVarArr.length) {
                    return cVarArr[b].a;
                }
            }
            StringBuilder A = f.a.b.a.a.A("Header index too large ");
            A.append(i2 + 1);
            throw new IOException(A.toString());
        }

        public final void e(int i2, c cVar) {
            this.a.add(cVar);
            int i3 = cVar.c;
            if (i2 != -1) {
                i3 -= this.f8087e[(this.f8088f + 1) + i2].c;
            }
            int i4 = this.f8086d;
            if (i3 > i4) {
                a();
                return;
            }
            int c = c((this.f8090h + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f8089g + 1;
                c[] cVarArr = this.f8087e;
                if (i5 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f8088f = this.f8087e.length - 1;
                    this.f8087e = cVarArr2;
                }
                int i6 = this.f8088f;
                this.f8088f = i6 - 1;
                this.f8087e[i6] = cVar;
                this.f8089g++;
            } else {
                this.f8087e[this.f8088f + 1 + i2 + c + i2] = cVar;
            }
            this.f8090h += i3;
        }

        public i f() {
            int readByte = this.b.readByte() & 255;
            boolean z = (readByte & 128) == 128;
            int g2 = g(readByte, 127);
            if (z) {
                f fVar = f.f8109d;
                byte[] S = this.b.S(g2);
                Objects.requireNonNull(fVar);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                f.a aVar = fVar.a;
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
                            aVar = fVar.a;
                        } else {
                            i3 = i4;
                        }
                    }
                }
                while (i3 > 0) {
                    f.a aVar2 = aVar.a[(i2 << (8 - i3)) & 255];
                    if (aVar2.a != null || aVar2.c > i3) {
                        break;
                    }
                    byteArrayOutputStream.write(aVar2.b);
                    i3 -= aVar2.c;
                    aVar = fVar.a;
                }
                return i.m(byteArrayOutputStream.toByteArray());
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
    /* loaded from: classes2.dex */
    public static final class b {
        public final l.f a;

        /* renamed from: d  reason: collision with root package name */
        public int f8091d;

        /* renamed from: f  reason: collision with root package name */
        public int f8093f;
        public int b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        public c[] c = new c[8];

        /* renamed from: e  reason: collision with root package name */
        public int f8092e = 7;

        public b(l.f fVar) {
            this.a = fVar;
        }

        public final void a(c cVar) {
            int i2;
            int i3 = cVar.c;
            if (i3 > 4096) {
                Arrays.fill(this.c, (Object) null);
                this.f8092e = this.c.length - 1;
                this.f8091d = 0;
                this.f8093f = 0;
                return;
            }
            int i4 = (this.f8093f + i3) - 4096;
            if (i4 > 0) {
                int length = this.c.length - 1;
                int i5 = 0;
                while (true) {
                    i2 = this.f8092e;
                    if (length < i2 || i4 <= 0) {
                        break;
                    }
                    c[] cVarArr = this.c;
                    i4 -= cVarArr[length].c;
                    this.f8093f -= cVarArr[length].c;
                    this.f8091d--;
                    i5++;
                    length--;
                }
                c[] cVarArr2 = this.c;
                int i6 = i2 + 1;
                System.arraycopy(cVarArr2, i6, cVarArr2, i6 + i5, this.f8091d);
                this.f8092e += i5;
            }
            int i7 = this.f8091d + 1;
            c[] cVarArr3 = this.c;
            if (i7 > cVarArr3.length) {
                c[] cVarArr4 = new c[cVarArr3.length * 2];
                System.arraycopy(cVarArr3, 0, cVarArr4, cVarArr3.length, cVarArr3.length);
                this.f8092e = this.c.length - 1;
                this.c = cVarArr4;
            }
            int i8 = this.f8092e;
            this.f8092e = i8 - 1;
            this.c[i8] = cVar;
            this.f8091d++;
            this.f8093f += i3;
        }

        public void b(i iVar) {
            c(iVar.p(), 127, 0);
            this.a.X(iVar);
        }

        public void c(int i2, int i3, int i4) {
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
        c cVar = new c(c.f8085h, "");
        int i2 = 0;
        i iVar = c.f8082e;
        i iVar2 = c.f8083f;
        i iVar3 = c.f8084g;
        i iVar4 = c.f8081d;
        c[] cVarArr = {cVar, new c(iVar, "GET"), new c(iVar, "POST"), new c(iVar2, "/"), new c(iVar2, "/index.html"), new c(iVar3, "http"), new c(iVar3, "https"), new c(iVar4, "200"), new c(iVar4, "204"), new c(iVar4, "206"), new c(iVar4, "304"), new c(iVar4, "400"), new c(iVar4, "404"), new c(iVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c(Constants.MessagePayloadKeys.FROM, ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c(FirebaseAnalytics.Param.LOCATION, ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        b = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        while (true) {
            c[] cVarArr2 = b;
            if (i2 < cVarArr2.length) {
                if (!linkedHashMap.containsKey(cVarArr2[i2].a)) {
                    linkedHashMap.put(cVarArr2[i2].a, Integer.valueOf(i2));
                }
                i2++;
            } else {
                c = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    public static i a(i iVar) {
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
