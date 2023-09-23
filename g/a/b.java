package g.a;

import g.a.h;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: CallOptions.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: j  reason: collision with root package name */
    public static final b f7526j = new b();
    public n a;
    public Executor b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f7527d;

    /* renamed from: e  reason: collision with root package name */
    public Object[][] f7528e;

    /* renamed from: f  reason: collision with root package name */
    public List<h.a> f7529f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f7530g;

    /* renamed from: h  reason: collision with root package name */
    public Integer f7531h;

    /* renamed from: i  reason: collision with root package name */
    public Integer f7532i;

    /* compiled from: CallOptions.java */
    /* loaded from: classes2.dex */
    public static final class a<T> {
        public final String a;

        public a(String str, T t) {
            this.a = str;
        }

        public static <T> a<T> a(String str) {
            f.h.b.c.a.x(str, "debugString");
            return new a<>(str, null);
        }

        public String toString() {
            return this.a;
        }
    }

    public b() {
        this.f7529f = Collections.emptyList();
        this.f7528e = (Object[][]) Array.newInstance(Object.class, 0, 2);
    }

    public <T> T a(a<T> aVar) {
        f.h.b.c.a.x(aVar, "key");
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.f7528e;
            if (i2 >= objArr.length) {
                return null;
            }
            if (aVar.equals(objArr[i2][0])) {
                return (T) this.f7528e[i2][1];
            }
            i2++;
        }
    }

    public boolean b() {
        return Boolean.TRUE.equals(this.f7530g);
    }

    public b c(int i2) {
        f.h.b.c.a.o(i2 >= 0, "invalid maxsize %s", i2);
        b bVar = new b(this);
        bVar.f7531h = Integer.valueOf(i2);
        return bVar;
    }

    public b d(int i2) {
        f.h.b.c.a.o(i2 >= 0, "invalid maxsize %s", i2);
        b bVar = new b(this);
        bVar.f7532i = Integer.valueOf(i2);
        return bVar;
    }

    public <T> b e(a<T> aVar, T t) {
        f.h.b.c.a.x(aVar, "key");
        f.h.b.c.a.x(t, "value");
        b bVar = new b(this);
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.f7528e;
            if (i2 >= objArr.length) {
                i2 = -1;
                break;
            } else if (aVar.equals(objArr[i2][0])) {
                break;
            } else {
                i2++;
            }
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, this.f7528e.length + (i2 == -1 ? 1 : 0), 2);
        bVar.f7528e = objArr2;
        Object[][] objArr3 = this.f7528e;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i2 == -1) {
            Object[][] objArr4 = bVar.f7528e;
            int length = this.f7528e.length;
            Object[] objArr5 = new Object[2];
            objArr5[0] = aVar;
            objArr5[1] = t;
            objArr4[length] = objArr5;
        } else {
            Object[][] objArr6 = bVar.f7528e;
            Object[] objArr7 = new Object[2];
            objArr7[0] = aVar;
            objArr7[1] = t;
            objArr6[i2] = objArr7;
        }
        return bVar;
    }

    public b f(h.a aVar) {
        b bVar = new b(this);
        ArrayList arrayList = new ArrayList(this.f7529f.size() + 1);
        arrayList.addAll(this.f7529f);
        arrayList.add(aVar);
        bVar.f7529f = Collections.unmodifiableList(arrayList);
        return bVar;
    }

    public String toString() {
        f.h.c.a.i c1 = f.h.b.c.a.c1(this);
        c1.c("deadline", this.a);
        c1.c("authority", this.c);
        c1.c("callCredentials", null);
        Executor executor = this.b;
        c1.c("executor", executor != null ? executor.getClass() : null);
        c1.c("compressorName", this.f7527d);
        c1.c("customOptions", Arrays.deepToString(this.f7528e));
        c1.d("waitForReady", b());
        c1.c("maxInboundMessageSize", this.f7531h);
        c1.c("maxOutboundMessageSize", this.f7532i);
        c1.c("streamTracerFactories", this.f7529f);
        return c1.toString();
    }

    public b(b bVar) {
        this.f7529f = Collections.emptyList();
        this.a = bVar.a;
        this.c = bVar.c;
        this.b = bVar.b;
        this.f7527d = bVar.f7527d;
        this.f7528e = bVar.f7528e;
        this.f7530g = bVar.f7530g;
        this.f7531h = bVar.f7531h;
        this.f7532i = bVar.f7532i;
        this.f7529f = bVar.f7529f;
    }
}
