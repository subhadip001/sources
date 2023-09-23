package f.h.h;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Writer;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes2.dex */
public final class h1 {

    /* renamed from: f  reason: collision with root package name */
    public static final h1 f6360f = new h1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f6361d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6362e;

    public h1() {
        this(0, new int[8], new Object[8], true);
    }

    public static h1 d(h1 h1Var, h1 h1Var2) {
        int i2 = h1Var.a + h1Var2.a;
        int[] copyOf = Arrays.copyOf(h1Var.b, i2);
        System.arraycopy(h1Var2.b, 0, copyOf, h1Var.a, h1Var2.a);
        Object[] copyOf2 = Arrays.copyOf(h1Var.c, i2);
        System.arraycopy(h1Var2.c, 0, copyOf2, h1Var.a, h1Var2.a);
        return new h1(i2, copyOf, copyOf2, true);
    }

    public static h1 e() {
        return new h1(0, new int[8], new Object[8], true);
    }

    public static void g(int i2, Object obj, Writer writer) {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            ((m) writer).a.b0(i3, ((Long) obj).longValue());
        } else if (i4 == 1) {
            ((m) writer).a.O(i3, ((Long) obj).longValue());
        } else if (i4 == 2) {
            ((m) writer).a.K(i3, (j) obj);
        } else if (i4 != 3) {
            if (i4 == 5) {
                ((m) writer).a.M(i3, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.d());
        } else {
            m mVar = (m) writer;
            Writer.FieldOrder fieldOrder = Writer.FieldOrder.ASCENDING;
            if (fieldOrder == fieldOrder) {
                mVar.a.Y(i3, 3);
                ((h1) obj).h(writer);
                mVar.a.Y(i3, 4);
                return;
            }
            mVar.a.Y(i3, 4);
            ((h1) obj).h(writer);
            mVar.a.Y(i3, 3);
        }
    }

    public void a() {
        if (!this.f6362e) {
            throw new UnsupportedOperationException();
        }
    }

    public int b() {
        int B;
        int i2 = this.f6361d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            int i5 = this.b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                B = CodedOutputStream.B(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 1) {
                B = CodedOutputStream.i(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 2) {
                B = CodedOutputStream.d(i6, (j) this.c[i4]);
            } else if (i7 == 3) {
                i3 = ((h1) this.c[i4]).b() + (CodedOutputStream.y(i6) * 2) + i3;
            } else if (i7 == 5) {
                B = CodedOutputStream.h(i6, ((Integer) this.c[i4]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.d());
            }
            i3 = B + i3;
        }
        this.f6361d = i3;
        return i3;
    }

    public boolean c(int i2, k kVar) {
        int A;
        a();
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            f(i2, Long.valueOf(kVar.s()));
            return true;
        } else if (i4 == 1) {
            f(i2, Long.valueOf(kVar.p()));
            return true;
        } else if (i4 == 2) {
            f(i2, kVar.l());
            return true;
        } else if (i4 != 3) {
            if (i4 != 4) {
                if (i4 == 5) {
                    f(i2, Integer.valueOf(kVar.o()));
                    return true;
                }
                throw InvalidProtocolBufferException.d();
            }
            return false;
        } else {
            h1 h1Var = new h1(0, new int[8], new Object[8], true);
            do {
                A = kVar.A();
                if (A == 0) {
                    break;
                }
            } while (h1Var.c(A, kVar));
            kVar.a((i3 << 3) | 4);
            f(i2, h1Var);
            return true;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h1)) {
            h1 h1Var = (h1) obj;
            int i2 = this.a;
            if (i2 == h1Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = h1Var.b;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        z = true;
                        break;
                    } else if (iArr[i3] != iArr2[i3]) {
                        z = false;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = h1Var.c;
                    int i4 = this.a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            z2 = true;
                            break;
                        } else if (!objArr[i5].equals(objArr2[i5])) {
                            z2 = false;
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public void f(int i2, Object obj) {
        a();
        int i3 = this.a;
        int[] iArr = this.b;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.b = Arrays.copyOf(iArr, i4);
            this.c = Arrays.copyOf(this.c, i4);
        }
        int[] iArr2 = this.b;
        int i5 = this.a;
        iArr2[i5] = i2;
        this.c[i5] = obj;
        this.a = i5 + 1;
    }

    public void h(Writer writer) {
        if (this.a == 0) {
            return;
        }
        Objects.requireNonNull((m) writer);
        Writer.FieldOrder fieldOrder = Writer.FieldOrder.ASCENDING;
        if (fieldOrder == fieldOrder) {
            for (int i2 = 0; i2 < this.a; i2++) {
                g(this.b[i2], this.c[i2], writer);
            }
            return;
        }
        for (int i3 = this.a - 1; i3 >= 0; i3--) {
            g(this.b[i3], this.c[i3], writer);
        }
    }

    public int hashCode() {
        int i2 = this.a;
        int i3 = (527 + i2) * 31;
        int[] iArr = this.b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.c;
        int i8 = this.a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }

    public h1(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f6361d = -1;
        this.a = i2;
        this.b = iArr;
        this.c = objArr;
        this.f6362e = z;
    }
}
