package f.h.f.b0;

import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import f.h.f.z.q;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: JsonReader.java */
/* loaded from: classes2.dex */
public class a implements Closeable {
    public static final char[] u = ")]}'\n".toCharArray();

    /* renamed from: f  reason: collision with root package name */
    public final Reader f6206f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6207g = false;

    /* renamed from: h  reason: collision with root package name */
    public final char[] f6208h = new char[1024];

    /* renamed from: i  reason: collision with root package name */
    public int f6209i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f6210j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f6211k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f6212l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f6213m = 0;
    public long n;
    public int o;
    public String p;
    public int[] q;
    public int r;
    public String[] s;
    public int[] t;

    /* compiled from: JsonReader.java */
    /* renamed from: f.h.f.b0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0142a extends q {
    }

    static {
        q.a = new C0142a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.q = iArr;
        this.r = 0;
        this.r = 0 + 1;
        iArr[0] = 6;
        this.s = new String[32];
        this.t = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f6206f = reader;
    }

    public String C() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.r;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.q[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.t[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.s;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    public boolean F() {
        int i2 = this.f6213m;
        if (i2 == 0) {
            i2 = l();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public final boolean M(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        g();
        return false;
    }

    public String N() {
        StringBuilder C = f.a.b.a.a.C(" at line ", this.f6211k + 1, " column ", (this.f6209i - this.f6212l) + 1, " path ");
        C.append(C());
        return C.toString();
    }

    public boolean O() {
        int i2 = this.f6213m;
        if (i2 == 0) {
            i2 = l();
        }
        if (i2 == 5) {
            this.f6213m = 0;
            int[] iArr = this.t;
            int i3 = this.r - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.f6213m = 0;
            int[] iArr2 = this.t;
            int i4 = this.r - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            StringBuilder A = f.a.b.a.a.A("Expected a boolean but was ");
            A.append(s0());
            A.append(N());
            throw new IllegalStateException(A.toString());
        }
    }

    public double T() {
        int i2 = this.f6213m;
        if (i2 == 0) {
            i2 = l();
        }
        if (i2 == 15) {
            this.f6213m = 0;
            int[] iArr = this.t;
            int i3 = this.r - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.n;
        }
        if (i2 == 16) {
            this.p = new String(this.f6208h, this.f6209i, this.o);
            this.f6209i += this.o;
        } else if (i2 == 8 || i2 == 9) {
            this.p = m0(i2 == 8 ? '\'' : '\"');
        } else if (i2 == 10) {
            this.p = r0();
        } else if (i2 != 11) {
            StringBuilder A = f.a.b.a.a.A("Expected a double but was ");
            A.append(s0());
            A.append(N());
            throw new IllegalStateException(A.toString());
        }
        this.f6213m = 11;
        double parseDouble = Double.parseDouble(this.p);
        if (!this.f6207g && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + N());
        }
        this.p = null;
        this.f6213m = 0;
        int[] iArr2 = this.t;
        int i4 = this.r - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return parseDouble;
    }

    public int W() {
        int i2 = this.f6213m;
        if (i2 == 0) {
            i2 = l();
        }
        if (i2 == 15) {
            long j2 = this.n;
            int i3 = (int) j2;
            if (j2 == i3) {
                this.f6213m = 0;
                int[] iArr = this.t;
                int i4 = this.r - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            StringBuilder A = f.a.b.a.a.A("Expected an int but was ");
            A.append(this.n);
            A.append(N());
            throw new NumberFormatException(A.toString());
        }
        if (i2 == 16) {
            this.p = new String(this.f6208h, this.f6209i, this.o);
            this.f6209i += this.o;
        } else if (i2 != 8 && i2 != 9 && i2 != 10) {
            StringBuilder A2 = f.a.b.a.a.A("Expected an int but was ");
            A2.append(s0());
            A2.append(N());
            throw new IllegalStateException(A2.toString());
        } else {
            if (i2 == 10) {
                this.p = r0();
            } else {
                this.p = m0(i2 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.p);
                this.f6213m = 0;
                int[] iArr2 = this.t;
                int i5 = this.r - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f6213m = 11;
        double parseDouble = Double.parseDouble(this.p);
        int i6 = (int) parseDouble;
        if (i6 == parseDouble) {
            this.p = null;
            this.f6213m = 0;
            int[] iArr3 = this.t;
            int i7 = this.r - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        StringBuilder A3 = f.a.b.a.a.A("Expected an int but was ");
        A3.append(this.p);
        A3.append(N());
        throw new NumberFormatException(A3.toString());
    }

    public long X() {
        int i2 = this.f6213m;
        if (i2 == 0) {
            i2 = l();
        }
        if (i2 == 15) {
            this.f6213m = 0;
            int[] iArr = this.t;
            int i3 = this.r - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.n;
        }
        if (i2 == 16) {
            this.p = new String(this.f6208h, this.f6209i, this.o);
            this.f6209i += this.o;
        } else if (i2 != 8 && i2 != 9 && i2 != 10) {
            StringBuilder A = f.a.b.a.a.A("Expected a long but was ");
            A.append(s0());
            A.append(N());
            throw new IllegalStateException(A.toString());
        } else {
            if (i2 == 10) {
                this.p = r0();
            } else {
                this.p = m0(i2 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.p);
                this.f6213m = 0;
                int[] iArr2 = this.t;
                int i4 = this.r - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f6213m = 11;
        double parseDouble = Double.parseDouble(this.p);
        long j2 = (long) parseDouble;
        if (j2 == parseDouble) {
            this.p = null;
            this.f6213m = 0;
            int[] iArr3 = this.t;
            int i5 = this.r - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return j2;
        }
        StringBuilder A2 = f.a.b.a.a.A("Expected a long but was ");
        A2.append(this.p);
        A2.append(N());
        throw new NumberFormatException(A2.toString());
    }

    public void a() {
        int i2 = this.f6213m;
        if (i2 == 0) {
            i2 = l();
        }
        if (i2 == 3) {
            t0(1);
            this.t[this.r - 1] = 0;
            this.f6213m = 0;
            return;
        }
        StringBuilder A = f.a.b.a.a.A("Expected BEGIN_ARRAY but was ");
        A.append(s0());
        A.append(N());
        throw new IllegalStateException(A.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6213m = 0;
        this.q[0] = 8;
        this.r = 1;
        this.f6206f.close();
    }

    public String d0() {
        String m0;
        int i2 = this.f6213m;
        if (i2 == 0) {
            i2 = l();
        }
        if (i2 == 14) {
            m0 = r0();
        } else if (i2 == 12) {
            m0 = m0('\'');
        } else if (i2 == 13) {
            m0 = m0('\"');
        } else {
            StringBuilder A = f.a.b.a.a.A("Expected a name but was ");
            A.append(s0());
            A.append(N());
            throw new IllegalStateException(A.toString());
        }
        this.f6213m = 0;
        this.s[this.r - 1] = m0;
        return m0;
    }

    public void f() {
        int i2 = this.f6213m;
        if (i2 == 0) {
            i2 = l();
        }
        if (i2 == 1) {
            t0(3);
            this.f6213m = 0;
            return;
        }
        StringBuilder A = f.a.b.a.a.A("Expected BEGIN_OBJECT but was ");
        A.append(s0());
        A.append(N());
        throw new IllegalStateException(A.toString());
    }

    public final void g() {
        if (this.f6207g) {
            return;
        }
        y0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final int g0(boolean z) {
        char[] cArr = this.f6208h;
        int i2 = this.f6209i;
        int i3 = this.f6210j;
        while (true) {
            boolean z2 = true;
            if (i2 == i3) {
                this.f6209i = i2;
                if (!v(1)) {
                    if (z) {
                        StringBuilder A = f.a.b.a.a.A("End of input");
                        A.append(N());
                        throw new EOFException(A.toString());
                    }
                    return -1;
                }
                i2 = this.f6209i;
                i3 = this.f6210j;
            }
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '\n') {
                this.f6211k++;
                this.f6212l = i4;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f6209i = i4;
                    if (i4 == i3) {
                        this.f6209i = i4 - 1;
                        boolean v = v(2);
                        this.f6209i++;
                        if (!v) {
                            return c;
                        }
                    }
                    g();
                    int i5 = this.f6209i;
                    char c2 = cArr[i5];
                    if (c2 == '*') {
                        this.f6209i = i5 + 1;
                        while (true) {
                            if (this.f6209i + 2 > this.f6210j && !v(2)) {
                                z2 = false;
                                break;
                            }
                            char[] cArr2 = this.f6208h;
                            int i6 = this.f6209i;
                            if (cArr2[i6] != '\n') {
                                for (int i7 = 0; i7 < 2; i7++) {
                                    if (this.f6208h[this.f6209i + i7] != "*/".charAt(i7)) {
                                        break;
                                    }
                                }
                                break;
                            }
                            this.f6211k++;
                            this.f6212l = i6 + 1;
                            this.f6209i++;
                        }
                        if (z2) {
                            i2 = this.f6209i + 2;
                            i3 = this.f6210j;
                        } else {
                            y0("Unterminated comment");
                            throw null;
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f6209i = i5 + 1;
                        w0();
                        i2 = this.f6209i;
                        i3 = this.f6210j;
                    }
                } else if (c == '#') {
                    this.f6209i = i4;
                    g();
                    w0();
                    i2 = this.f6209i;
                    i3 = this.f6210j;
                } else {
                    this.f6209i = i4;
                    return c;
                }
            }
            i2 = i4;
        }
    }

    public void i0() {
        int i2 = this.f6213m;
        if (i2 == 0) {
            i2 = l();
        }
        if (i2 == 7) {
            this.f6213m = 0;
            int[] iArr = this.t;
            int i3 = this.r - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        StringBuilder A = f.a.b.a.a.A("Expected null but was ");
        A.append(s0());
        A.append(N());
        throw new IllegalStateException(A.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0203, code lost:
        if (M(r6) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0205, code lost:
        if (r13 != 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0207, code lost:
        if (r15 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x020d, code lost:
        if (r10 != Long.MIN_VALUE) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x020f, code lost:
        if (r16 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0215, code lost:
        if (r10 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0217, code lost:
        if (r16 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0219, code lost:
        if (r16 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x021c, code lost:
        r10 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x021d, code lost:
        r19.n = r10;
        r19.f6209i += r9;
        r6 = 15;
        r19.f6213m = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0229, code lost:
        if (r13 == 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x022c, code lost:
        if (r13 == 4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x022f, code lost:
        if (r13 != 7) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0231, code lost:
        r19.o = r9;
        r6 = 16;
        r19.f6213m = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0264 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int l() {
        /*
            Method dump skipped, instructions count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.f.b0.a.l():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r3 - r4) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
        r2.append(r0, r4, r3 - r4);
        r10.f6209i = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m0(char r11) {
        /*
            r10 = this;
            char[] r0 = r10.f6208h
            r1 = 0
            r2 = r1
        L4:
            int r3 = r10.f6209i
            int r4 = r10.f6210j
        L8:
            r5 = r4
            r4 = r3
        La:
            r6 = 16
            r7 = 1
            if (r3 >= r5) goto L5d
            int r8 = r3 + 1
            char r3 = r0[r3]
            if (r3 != r11) goto L29
            r10.f6209i = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r4, r8)
            return r11
        L21:
            r2.append(r0, r4, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L29:
            r9 = 92
            if (r3 != r9) goto L50
            r10.f6209i = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L41
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r3.<init>(r2)
            r2 = r3
        L41:
            r2.append(r0, r4, r8)
            char r3 = r10.u0()
            r2.append(r3)
            int r3 = r10.f6209i
            int r4 = r10.f6210j
            goto L8
        L50:
            r6 = 10
            if (r3 != r6) goto L5b
            int r3 = r10.f6211k
            int r3 = r3 + r7
            r10.f6211k = r3
            r10.f6212l = r8
        L5b:
            r3 = r8
            goto La
        L5d:
            if (r2 != 0) goto L6d
            int r2 = r3 - r4
            int r2 = r2 * 2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r5.<init>(r2)
            r2 = r5
        L6d:
            int r5 = r3 - r4
            r2.append(r0, r4, r5)
            r10.f6209i = r3
            boolean r3 = r10.v(r7)
            if (r3 == 0) goto L7b
            goto L4
        L7b:
            java.lang.String r11 = "Unterminated string"
            r10.y0(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.f.b0.a.m0(char):java.lang.String");
    }

    public void p() {
        int i2 = this.f6213m;
        if (i2 == 0) {
            i2 = l();
        }
        if (i2 == 4) {
            int i3 = this.r - 1;
            this.r = i3;
            int[] iArr = this.t;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f6213m = 0;
            return;
        }
        StringBuilder A = f.a.b.a.a.A("Expected END_ARRAY but was ");
        A.append(s0());
        A.append(N());
        throw new IllegalStateException(A.toString());
    }

    public void q() {
        int i2 = this.f6213m;
        if (i2 == 0) {
            i2 = l();
        }
        if (i2 == 2) {
            int i3 = this.r - 1;
            this.r = i3;
            this.s[i3] = null;
            int[] iArr = this.t;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f6213m = 0;
            return;
        }
        StringBuilder A = f.a.b.a.a.A("Expected END_OBJECT but was ");
        A.append(s0());
        A.append(N());
        throw new IllegalStateException(A.toString());
    }

    public String q0() {
        String str;
        int i2 = this.f6213m;
        if (i2 == 0) {
            i2 = l();
        }
        if (i2 == 10) {
            str = r0();
        } else if (i2 == 8) {
            str = m0('\'');
        } else if (i2 == 9) {
            str = m0('\"');
        } else if (i2 == 11) {
            str = this.p;
            this.p = null;
        } else if (i2 == 15) {
            str = Long.toString(this.n);
        } else if (i2 == 16) {
            str = new String(this.f6208h, this.f6209i, this.o);
            this.f6209i += this.o;
        } else {
            StringBuilder A = f.a.b.a.a.A("Expected a string but was ");
            A.append(s0());
            A.append(N());
            throw new IllegalStateException(A.toString());
        }
        this.f6213m = 0;
        int[] iArr = this.t;
        int i3 = this.r - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        g();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String r0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f6209i
            int r4 = r3 + r2
            int r5 = r6.f6210j
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f6208h
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.g()
            goto L5c
        L4e:
            char[] r3 = r6.f6208h
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.v(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f6208h
            int r4 = r6.f6209i
            r1.append(r3, r4, r2)
            int r3 = r6.f6209i
            int r3 = r3 + r2
            r6.f6209i = r3
            r2 = 1
            boolean r2 = r6.v(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f6208h
            int r3 = r6.f6209i
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f6208h
            int r3 = r6.f6209i
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f6209i
            int r2 = r2 + r0
            r6.f6209i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.f.b0.a.r0():java.lang.String");
    }

    public JsonToken s0() {
        int i2 = this.f6213m;
        if (i2 == 0) {
            i2 = l();
        }
        switch (i2) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void t0(int i2) {
        int i3 = this.r;
        int[] iArr = this.q;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.q = Arrays.copyOf(iArr, i4);
            this.t = Arrays.copyOf(this.t, i4);
            this.s = (String[]) Arrays.copyOf(this.s, i4);
        }
        int[] iArr2 = this.q;
        int i5 = this.r;
        this.r = i5 + 1;
        iArr2[i5] = i2;
    }

    public String toString() {
        return getClass().getSimpleName() + N();
    }

    public final char u0() {
        int i2;
        int i3;
        if (this.f6209i == this.f6210j && !v(1)) {
            y0("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f6208h;
        int i4 = this.f6209i;
        int i5 = i4 + 1;
        this.f6209i = i5;
        char c = cArr[i4];
        if (c == '\n') {
            this.f6211k++;
            this.f6212l = i5;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c != 'b') {
                if (c != 'f') {
                    if (c != 'n') {
                        if (c != 'r') {
                            if (c != 't') {
                                if (c == 'u') {
                                    if (i5 + 4 > this.f6210j && !v(4)) {
                                        y0("Unterminated escape sequence");
                                        throw null;
                                    }
                                    char c2 = 0;
                                    int i6 = this.f6209i;
                                    int i7 = i6 + 4;
                                    while (i6 < i7) {
                                        char c3 = this.f6208h[i6];
                                        char c4 = (char) (c2 << 4);
                                        if (c3 < '0' || c3 > '9') {
                                            if (c3 >= 'a' && c3 <= 'f') {
                                                i2 = c3 - 'a';
                                            } else if (c3 < 'A' || c3 > 'F') {
                                                StringBuilder A = f.a.b.a.a.A("\\u");
                                                A.append(new String(this.f6208h, this.f6209i, 4));
                                                throw new NumberFormatException(A.toString());
                                            } else {
                                                i2 = c3 - 'A';
                                            }
                                            i3 = i2 + 10;
                                        } else {
                                            i3 = c3 - '0';
                                        }
                                        c2 = (char) (i3 + c4);
                                        i6++;
                                    }
                                    this.f6209i += 4;
                                    return c2;
                                }
                                y0("Invalid escape sequence");
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        return c;
    }

    public final boolean v(int i2) {
        int i3;
        int i4;
        char[] cArr = this.f6208h;
        int i5 = this.f6212l;
        int i6 = this.f6209i;
        this.f6212l = i5 - i6;
        int i7 = this.f6210j;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f6210j = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f6210j = 0;
        }
        this.f6209i = 0;
        do {
            Reader reader = this.f6206f;
            int i9 = this.f6210j;
            int read = reader.read(cArr, i9, cArr.length - i9);
            if (read == -1) {
                return false;
            }
            i3 = this.f6210j + read;
            this.f6210j = i3;
            if (this.f6211k == 0 && (i4 = this.f6212l) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f6209i++;
                this.f6212l = i4 + 1;
                i2++;
                continue;
            }
        } while (i3 < i2);
        return true;
    }

    public final void v0(char c) {
        char[] cArr = this.f6208h;
        do {
            int i2 = this.f6209i;
            int i3 = this.f6210j;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c2 = cArr[i2];
                if (c2 == c) {
                    this.f6209i = i4;
                    return;
                } else if (c2 == '\\') {
                    this.f6209i = i4;
                    u0();
                    i2 = this.f6209i;
                    i3 = this.f6210j;
                } else {
                    if (c2 == '\n') {
                        this.f6211k++;
                        this.f6212l = i4;
                    }
                    i2 = i4;
                }
            }
            this.f6209i = i2;
        } while (v(1));
        y0("Unterminated string");
        throw null;
    }

    public final void w0() {
        char c;
        do {
            if (this.f6209i >= this.f6210j && !v(1)) {
                return;
            }
            char[] cArr = this.f6208h;
            int i2 = this.f6209i;
            int i3 = i2 + 1;
            this.f6209i = i3;
            c = cArr[i2];
            if (c == '\n') {
                this.f6211k++;
                this.f6212l = i3;
                return;
            }
        } while (c != '\r');
    }

    public void x0() {
        int i2 = 0;
        do {
            int i3 = this.f6213m;
            if (i3 == 0) {
                i3 = l();
            }
            if (i3 == 3) {
                t0(1);
            } else if (i3 == 1) {
                t0(3);
            } else {
                if (i3 == 4) {
                    this.r--;
                } else if (i3 == 2) {
                    this.r--;
                } else {
                    if (i3 == 14 || i3 == 10) {
                        do {
                            int i4 = 0;
                            while (true) {
                                int i5 = this.f6209i + i4;
                                if (i5 < this.f6210j) {
                                    char c = this.f6208h[i5];
                                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                                        if (c != '#') {
                                            if (c != ',') {
                                                if (c != '/' && c != '=') {
                                                    if (c != '{' && c != '}' && c != ':') {
                                                        if (c != ';') {
                                                            switch (c) {
                                                                case '[':
                                                                case ']':
                                                                    break;
                                                                case '\\':
                                                                    break;
                                                                default:
                                                                    i4++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    this.f6209i = i5;
                                }
                            }
                            g();
                            this.f6209i += i4;
                        } while (v(1));
                    } else if (i3 == 8 || i3 == 12) {
                        v0('\'');
                    } else if (i3 == 9 || i3 == 13) {
                        v0('\"');
                    } else if (i3 == 16) {
                        this.f6209i += this.o;
                    }
                    this.f6213m = 0;
                }
                i2--;
                this.f6213m = 0;
            }
            i2++;
            this.f6213m = 0;
        } while (i2 != 0);
        int[] iArr = this.t;
        int i6 = this.r;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.s[i6 - 1] = "null";
    }

    public final IOException y0(String str) {
        StringBuilder A = f.a.b.a.a.A(str);
        A.append(N());
        throw new MalformedJsonException(A.toString());
    }
}
