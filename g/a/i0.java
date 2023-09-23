package g.a;

import com.google.common.io.BaseEncoding;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Metadata.java */
/* loaded from: classes2.dex */
public final class i0 {
    public static final Logger c = Logger.getLogger(i0.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final d<String> f7537d = new b();

    /* renamed from: e  reason: collision with root package name */
    public static final BaseEncoding f7538e;
    public Object[] a;
    public int b;

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public class a {
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public class b implements d<String> {
        @Override // g.a.i0.d
        public String a(String str) {
            return str;
        }

        @Override // g.a.i0.d
        public String b(String str) {
            return str;
        }
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public static class c<T> extends f<T> {

        /* renamed from: f  reason: collision with root package name */
        public final d<T> f7539f;

        public c(String str, boolean z, d dVar, a aVar) {
            super(str, z, dVar, null);
            f.h.b.c.a.r(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            f.h.b.c.a.x(dVar, "marshaller");
            this.f7539f = dVar;
        }

        @Override // g.a.i0.f
        public T c(byte[] bArr) {
            return this.f7539f.b(new String(bArr, f.h.c.a.c.a));
        }

        @Override // g.a.i0.f
        public byte[] d(T t) {
            return this.f7539f.a(t).getBytes(f.h.c.a.c.a);
        }
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public interface d<T> {
        String a(T t);

        T b(String str);
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public interface e<T> {
        InputStream a(T t);
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public static abstract class f<T> {

        /* renamed from: e  reason: collision with root package name */
        public static final BitSet f7540e;
        public final String a;
        public final String b;
        public final byte[] c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f7541d;

        static {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
                bitSet.set(c);
            }
            for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
                bitSet.set(c2);
            }
            f7540e = bitSet;
        }

        public f(String str, boolean z, Object obj, a aVar) {
            f.h.b.c.a.x(str, "name");
            this.a = str;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            f.h.b.c.a.x(lowerCase, "name");
            f.h.b.c.a.m(!lowerCase.isEmpty(), "token must have at least 1 tchar");
            if (lowerCase.equals("connection")) {
                i0.c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i2 = 0; i2 < lowerCase.length(); i2++) {
                char charAt = lowerCase.charAt(i2);
                if ((!z || charAt != ':' || i2 != 0) && !f7540e.get(charAt)) {
                    throw new IllegalArgumentException(f.h.b.c.a.E0("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
                }
            }
            this.b = lowerCase;
            this.c = lowerCase.getBytes(f.h.c.a.c.a);
            this.f7541d = obj;
        }

        public static <T> f<T> a(String str, d<T> dVar) {
            return new c(str, false, dVar, null);
        }

        public static <T> f<T> b(String str, boolean z, i<T> iVar) {
            return new h(str, z, iVar, null);
        }

        public abstract T c(byte[] bArr);

        public abstract byte[] d(T t);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.b.equals(((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return f.a.b.a.a.u(f.a.b.a.a.A("Key{name='"), this.b, "'}");
        }
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public static final class g<T> {
        public final e<T> a;
        public final T b;
        public volatile byte[] c;

        public byte[] a() {
            if (this.c == null) {
                synchronized (this) {
                    if (this.c == null) {
                        InputStream a = this.a.a(this.b);
                        Logger logger = i0.c;
                        try {
                            this.c = f.h.c.c.a.b(a);
                        } catch (IOException e2) {
                            throw new RuntimeException("failure reading serialized stream", e2);
                        }
                    }
                }
            }
            return this.c;
        }
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public static final class h<T> extends f<T> {

        /* renamed from: f  reason: collision with root package name */
        public final i<T> f7542f;

        public h(String str, boolean z, i iVar, a aVar) {
            super(str, z, iVar, null);
            f.h.b.c.a.r(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            f.h.b.c.a.x(iVar, "marshaller");
            this.f7542f = iVar;
        }

        @Override // g.a.i0.f
        public T c(byte[] bArr) {
            return this.f7542f.b(bArr);
        }

        @Override // g.a.i0.f
        public byte[] d(T t) {
            return this.f7542f.a(t);
        }
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes2.dex */
    public interface i<T> {
        byte[] a(T t);

        T b(byte[] bArr);
    }

    static {
        BaseEncoding.d dVar = (BaseEncoding.d) BaseEncoding.a;
        Character ch = dVar.f1278d;
        BaseEncoding baseEncoding = dVar;
        if (ch != null) {
            baseEncoding = dVar.h(dVar.c, null);
        }
        f7538e = baseEncoding;
    }

    public i0(byte[]... bArr) {
        this.b = bArr.length / 2;
        this.a = bArr;
    }

    public final int a() {
        Object[] objArr = this.a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    public <T> void b(f<T> fVar) {
        if (e()) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.b;
            if (i2 < i4) {
                if (!Arrays.equals(fVar.c, g(i2))) {
                    this.a[i3 * 2] = g(i2);
                    j(i3, i(i2));
                    i3++;
                }
                i2++;
            } else {
                Arrays.fill(this.a, i3 * 2, i4 * 2, (Object) null);
                this.b = i3;
                return;
            }
        }
    }

    public final void c(int i2) {
        Object[] objArr = new Object[i2];
        if (!e()) {
            System.arraycopy(this.a, 0, objArr, 0, this.b * 2);
        }
        this.a = objArr;
    }

    public <T> T d(f<T> fVar) {
        int i2 = this.b;
        do {
            i2--;
            if (i2 < 0) {
                return null;
            }
        } while (!Arrays.equals(fVar.c, g(i2)));
        Object obj = this.a[(i2 * 2) + 1];
        if (obj instanceof byte[]) {
            return fVar.c((byte[]) obj);
        }
        g gVar = (g) obj;
        Objects.requireNonNull(gVar);
        return fVar.c(gVar.a());
    }

    public final boolean e() {
        return this.b == 0;
    }

    public void f(i0 i0Var) {
        if (i0Var.e()) {
            return;
        }
        int a2 = a() - (this.b * 2);
        if (e() || a2 < i0Var.b * 2) {
            c((this.b * 2) + (i0Var.b * 2));
        }
        System.arraycopy(i0Var.a, 0, this.a, this.b * 2, i0Var.b * 2);
        this.b += i0Var.b;
    }

    public final byte[] g(int i2) {
        return (byte[]) this.a[i2 * 2];
    }

    public <T> void h(f<T> fVar, T t) {
        f.h.b.c.a.x(fVar, "key");
        f.h.b.c.a.x(t, "value");
        int i2 = this.b * 2;
        if (i2 == 0 || i2 == a()) {
            c(Math.max(this.b * 2 * 2, 8));
        }
        int i3 = this.b * 2;
        this.a[i3] = fVar.c;
        this.a[i3 + 1] = fVar.d(t);
        this.b++;
    }

    public final Object i(int i2) {
        return this.a[(i2 * 2) + 1];
    }

    public final void j(int i2, Object obj) {
        if (this.a instanceof byte[][]) {
            c(a());
        }
        this.a[(i2 * 2) + 1] = obj;
    }

    public final byte[] k(int i2) {
        Object obj = this.a[(i2 * 2) + 1];
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return ((g) obj).a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i2 = 0; i2 < this.b; i2++) {
            if (i2 != 0) {
                sb.append(',');
            }
            byte[] g2 = g(i2);
            Charset charset = f.h.c.a.c.a;
            String str = new String(g2, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(f7538e.c(k(i2)));
            } else {
                sb.append(new String(k(i2), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public i0() {
    }
}
