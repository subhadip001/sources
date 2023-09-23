package f.h.h;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* compiled from: ByteString.java */
/* loaded from: classes2.dex */
public abstract class j implements Iterable<Byte>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final j f6366g = new f(y.b);

    /* renamed from: h  reason: collision with root package name */
    public static final d f6367h;

    /* renamed from: f  reason: collision with root package name */
    public int f6368f = 0;

    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public Object next() {
            return Byte.valueOf(((i) this).a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public static final class b implements d {
        public b(i iVar) {
        }

        @Override // f.h.h.j.d
        public byte[] a(byte[] bArr, int i2, int i3) {
            return Arrays.copyOfRange(bArr, i2, i3 + i2);
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public static final class c extends f {

        /* renamed from: j  reason: collision with root package name */
        public final int f6369j;

        /* renamed from: k  reason: collision with root package name */
        public final int f6370k;

        public c(byte[] bArr, int i2, int i3) {
            super(bArr);
            j.b(i2, i2 + i3, bArr.length);
            this.f6369j = i2;
            this.f6370k = i3;
        }

        @Override // f.h.h.j.f, f.h.h.j
        public byte a(int i2) {
            int i3 = this.f6370k;
            if (((i3 - (i2 + 1)) | i2) < 0) {
                if (i2 < 0) {
                    throw new ArrayIndexOutOfBoundsException(f.a.b.a.a.i("Index < 0: ", i2));
                }
                throw new ArrayIndexOutOfBoundsException(f.a.b.a.a.k("Index > length: ", i2, ", ", i3));
            }
            return this.f6371i[this.f6369j + i2];
        }

        @Override // f.h.h.j.f, f.h.h.j
        public void e(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f6371i, this.f6369j + i2, bArr, i3, i4);
        }

        @Override // f.h.h.j.f, f.h.h.j
        public byte h(int i2) {
            return this.f6371i[this.f6369j + i2];
        }

        @Override // f.h.h.j.f
        public int r() {
            return this.f6369j;
        }

        @Override // f.h.h.j.f, f.h.h.j
        public int size() {
            return this.f6370k;
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public interface d {
        byte[] a(byte[] bArr, int i2, int i3);
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public static abstract class e extends j {
        @Override // f.h.h.j, java.lang.Iterable
        public Iterator<Byte> iterator() {
            return new i(this);
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public static class f extends e {

        /* renamed from: i  reason: collision with root package name */
        public final byte[] f6371i;

        public f(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f6371i = bArr;
        }

        @Override // f.h.h.j
        public byte a(int i2) {
            return this.f6371i[i2];
        }

        @Override // f.h.h.j
        public void e(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f6371i, i2, bArr, i3, i4);
        }

        @Override // f.h.h.j
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof j) && size() == ((j) obj).size()) {
                if (size() == 0) {
                    return true;
                }
                if (obj instanceof f) {
                    f fVar = (f) obj;
                    int i2 = this.f6368f;
                    int i3 = fVar.f6368f;
                    if (i2 == 0 || i3 == 0 || i2 == i3) {
                        int size = size();
                        if (size <= fVar.size()) {
                            if (0 + size <= fVar.size()) {
                                byte[] bArr = this.f6371i;
                                byte[] bArr2 = fVar.f6371i;
                                int r = r() + size;
                                int r2 = r();
                                int r3 = fVar.r() + 0;
                                while (r2 < r) {
                                    if (bArr[r2] != bArr2[r3]) {
                                        return false;
                                    }
                                    r2++;
                                    r3++;
                                }
                                return true;
                            }
                            StringBuilder C = f.a.b.a.a.C("Ran off end of other: ", 0, ", ", size, ", ");
                            C.append(fVar.size());
                            throw new IllegalArgumentException(C.toString());
                        }
                        throw new IllegalArgumentException("Length too large: " + size + size());
                    }
                    return false;
                }
                return obj.equals(this);
            }
            return false;
        }

        @Override // f.h.h.j
        public byte h(int i2) {
            return this.f6371i[i2];
        }

        @Override // f.h.h.j
        public final boolean i() {
            int r = r();
            return l1.h(this.f6371i, r, size() + r);
        }

        @Override // f.h.h.j
        public final k j() {
            return k.h(this.f6371i, r(), size(), true);
        }

        @Override // f.h.h.j
        public final int k(int i2, int i3, int i4) {
            byte[] bArr = this.f6371i;
            int r = r() + i3;
            Charset charset = y.a;
            for (int i5 = r; i5 < r + i4; i5++) {
                i2 = (i2 * 31) + bArr[i5];
            }
            return i2;
        }

        @Override // f.h.h.j
        public final j l(int i2, int i3) {
            int b = j.b(i2, i3, size());
            if (b == 0) {
                return j.f6366g;
            }
            return new c(this.f6371i, r() + i2, b);
        }

        @Override // f.h.h.j
        public final String m(Charset charset) {
            return new String(this.f6371i, r(), size(), charset);
        }

        @Override // f.h.h.j
        public final void o(h hVar) {
            hVar.a(this.f6371i, r(), size());
        }

        public int r() {
            return 0;
        }

        @Override // f.h.h.j
        public int size() {
            return this.f6371i.length;
        }
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public static final class g implements d {
        public g(i iVar) {
        }

        @Override // f.h.h.j.d
        public byte[] a(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return bArr2;
        }
    }

    static {
        f6367h = f.h.h.d.a() ? new g(null) : new b(null);
    }

    public static int b(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) < 0) {
            if (i2 >= 0) {
                if (i3 < i2) {
                    throw new IndexOutOfBoundsException(f.a.b.a.a.k("Beginning index larger than ending index: ", i2, ", ", i3));
                }
                throw new IndexOutOfBoundsException(f.a.b.a.a.k("End index: ", i3, " >= ", i4));
            }
            throw new IndexOutOfBoundsException(f.a.b.a.a.j("Beginning index: ", i2, " < 0"));
        }
        return i5;
    }

    public static j c(byte[] bArr, int i2, int i3) {
        b(i2, i2 + i3, bArr.length);
        return new f(f6367h.a(bArr, i2, i3));
    }

    public static j d(String str) {
        return new f(str.getBytes(y.a));
    }

    public abstract byte a(int i2);

    public abstract void e(byte[] bArr, int i2, int i3, int i4);

    public abstract boolean equals(Object obj);

    public abstract byte h(int i2);

    public final int hashCode() {
        int i2 = this.f6368f;
        if (i2 == 0) {
            int size = size();
            i2 = k(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f6368f = i2;
        }
        return i2;
    }

    public abstract boolean i();

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new i(this);
    }

    public abstract k j();

    public abstract int k(int i2, int i3, int i4);

    public abstract j l(int i2, int i3);

    public abstract String m(Charset charset);

    public final String n() {
        return size() == 0 ? "" : m(y.a);
    }

    public abstract void o(h hVar);

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = f.h.b.c.a.j0(this);
        } else {
            str = f.h.b.c.a.j0(l(0, 47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
