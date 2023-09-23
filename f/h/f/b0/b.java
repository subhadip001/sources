package f.h.f.b0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: JsonWriter.java */
/* loaded from: classes2.dex */
public class b implements Closeable, Flushable {
    public static final String[] o = new String[128];
    public static final String[] p;

    /* renamed from: f  reason: collision with root package name */
    public final Writer f6214f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f6215g = new int[32];

    /* renamed from: h  reason: collision with root package name */
    public int f6216h = 0;

    /* renamed from: i  reason: collision with root package name */
    public String f6217i;

    /* renamed from: j  reason: collision with root package name */
    public String f6218j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6219k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6220l;

    /* renamed from: m  reason: collision with root package name */
    public String f6221m;
    public boolean n;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            o[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = o;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        p = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        N(6);
        this.f6218j = ":";
        this.n = true;
        Objects.requireNonNull(writer, "out == null");
        this.f6214f = writer;
    }

    public final void C() {
        if (this.f6217i == null) {
            return;
        }
        this.f6214f.write(10);
        int i2 = this.f6216h;
        for (int i3 = 1; i3 < i2; i3++) {
            this.f6214f.write(this.f6217i);
        }
    }

    public b F() {
        if (this.f6221m != null) {
            if (this.n) {
                m0();
            } else {
                this.f6221m = null;
                return this;
            }
        }
        a();
        this.f6214f.write("null");
        return this;
    }

    public final int M() {
        int i2 = this.f6216h;
        if (i2 != 0) {
            return this.f6215g[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void N(int i2) {
        int i3 = this.f6216h;
        int[] iArr = this.f6215g;
        if (i3 == iArr.length) {
            this.f6215g = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f6215g;
        int i4 = this.f6216h;
        this.f6216h = i4 + 1;
        iArr2[i4] = i2;
    }

    public final void O(int i2) {
        this.f6215g[this.f6216h - 1] = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f6220l
            if (r0 == 0) goto L7
            java.lang.String[] r0 = f.h.f.b0.b.p
            goto L9
        L7:
            java.lang.String[] r0 = f.h.f.b0.b.o
        L9:
            java.io.Writer r1 = r8.f6214f
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f6214f
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f6214f
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f6214f
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f6214f
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.f.b0.b.T(java.lang.String):void");
    }

    public b W(long j2) {
        m0();
        a();
        this.f6214f.write(Long.toString(j2));
        return this;
    }

    public b X(Boolean bool) {
        if (bool == null) {
            return F();
        }
        m0();
        a();
        this.f6214f.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public final void a() {
        int M = M();
        if (M == 1) {
            O(2);
            C();
        } else if (M == 2) {
            this.f6214f.append(',');
            C();
        } else if (M != 4) {
            if (M != 6) {
                if (M == 7) {
                    if (!this.f6219k) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            }
            O(7);
        } else {
            this.f6214f.append((CharSequence) this.f6218j);
            O(5);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6214f.close();
        int i2 = this.f6216h;
        if (i2 <= 1 && (i2 != 1 || this.f6215g[i2 - 1] == 7)) {
            this.f6216h = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public b d0(Number number) {
        if (number == null) {
            return F();
        }
        m0();
        String obj = number.toString();
        if (!this.f6219k && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        a();
        this.f6214f.append((CharSequence) obj);
        return this;
    }

    public b f() {
        m0();
        a();
        N(1);
        this.f6214f.write(91);
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f6216h != 0) {
            this.f6214f.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public b g() {
        m0();
        a();
        N(3);
        this.f6214f.write(123);
        return this;
    }

    public b g0(String str) {
        if (str == null) {
            return F();
        }
        m0();
        a();
        T(str);
        return this;
    }

    public b i0(boolean z) {
        m0();
        a();
        this.f6214f.write(z ? "true" : "false");
        return this;
    }

    public final b l(int i2, int i3, char c) {
        int M = M();
        if (M != i3 && M != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f6221m == null) {
            this.f6216h--;
            if (M == i3) {
                C();
            }
            this.f6214f.write(c);
            return this;
        }
        StringBuilder A = f.a.b.a.a.A("Dangling name: ");
        A.append(this.f6221m);
        throw new IllegalStateException(A.toString());
    }

    public final void m0() {
        if (this.f6221m != null) {
            int M = M();
            if (M == 5) {
                this.f6214f.write(44);
            } else if (M != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            C();
            O(4);
            T(this.f6221m);
            this.f6221m = null;
        }
    }

    public b p() {
        l(1, 2, ']');
        return this;
    }

    public b q() {
        l(3, 5, '}');
        return this;
    }

    public b v(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f6221m == null) {
            if (this.f6216h != 0) {
                this.f6221m = str;
                return this;
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new IllegalStateException();
    }
}
