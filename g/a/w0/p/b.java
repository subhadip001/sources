package g.a.w0.p;

import javax.security.auth.x500.X500Principal;

/* compiled from: DistinguishedNameParser.java */
/* loaded from: classes2.dex */
public final class b {
    public final String a;
    public final int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f8077d;

    /* renamed from: e  reason: collision with root package name */
    public int f8078e;

    /* renamed from: f  reason: collision with root package name */
    public int f8079f;

    /* renamed from: g  reason: collision with root package name */
    public char[] f8080g;

    public b(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.a = name;
        this.b = name.length();
    }

    public final int a(int i2) {
        int i3;
        int i4;
        int i5 = i2 + 1;
        if (i5 < this.b) {
            char[] cArr = this.f8080g;
            char c = cArr[i2];
            if (c >= '0' && c <= '9') {
                i3 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i3 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                StringBuilder A = f.a.b.a.a.A("Malformed DN: ");
                A.append(this.a);
                throw new IllegalStateException(A.toString());
            } else {
                i3 = c - '7';
            }
            char c2 = cArr[i5];
            if (c2 >= '0' && c2 <= '9') {
                i4 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i4 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                StringBuilder A2 = f.a.b.a.a.A("Malformed DN: ");
                A2.append(this.a);
                throw new IllegalStateException(A2.toString());
            } else {
                i4 = c2 - '7';
            }
            return (i3 << 4) + i4;
        }
        StringBuilder A3 = f.a.b.a.a.A("Malformed DN: ");
        A3.append(this.a);
        throw new IllegalStateException(A3.toString());
    }

    public final char b() {
        int i2;
        int i3 = this.c + 1;
        this.c = i3;
        if (i3 != this.b) {
            char[] cArr = this.f8080g;
            char c = cArr[i3];
            if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
                switch (c) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                int a = a(i3);
                                this.c++;
                                if (a >= 128) {
                                    if (a < 192 || a > 247) {
                                        return '?';
                                    }
                                    if (a <= 223) {
                                        a &= 31;
                                        i2 = 1;
                                    } else if (a <= 239) {
                                        i2 = 2;
                                        a &= 15;
                                    } else {
                                        i2 = 3;
                                        a &= 7;
                                    }
                                    for (int i4 = 0; i4 < i2; i4++) {
                                        int i5 = this.c + 1;
                                        this.c = i5;
                                        if (i5 == this.b || this.f8080g[i5] != '\\') {
                                            return '?';
                                        }
                                        int i6 = i5 + 1;
                                        this.c = i6;
                                        int a2 = a(i6);
                                        this.c++;
                                        if ((a2 & 192) != 128) {
                                            return '?';
                                        }
                                        a = (a << 6) + (a2 & 63);
                                    }
                                }
                                return (char) a;
                        }
                }
            }
            return cArr[i3];
        }
        StringBuilder A = f.a.b.a.a.A("Unexpected end of DN: ");
        A.append(this.a);
        throw new IllegalStateException(A.toString());
    }

    public final String c() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        while (true) {
            i2 = this.c;
            i3 = this.b;
            if (i2 >= i3 || this.f8080g[i2] != ' ') {
                break;
            }
            this.c = i2 + 1;
        }
        if (i2 == i3) {
            return null;
        }
        this.f8077d = i2;
        this.c = i2 + 1;
        while (true) {
            i4 = this.c;
            i5 = this.b;
            if (i4 >= i5) {
                break;
            }
            char[] cArr = this.f8080g;
            if (cArr[i4] == '=' || cArr[i4] == ' ') {
                break;
            }
            this.c = i4 + 1;
        }
        if (i4 < i5) {
            this.f8078e = i4;
            if (this.f8080g[i4] == ' ') {
                while (true) {
                    i6 = this.c;
                    i7 = this.b;
                    if (i6 >= i7) {
                        break;
                    }
                    char[] cArr2 = this.f8080g;
                    if (cArr2[i6] == '=' || cArr2[i6] != ' ') {
                        break;
                    }
                    this.c = i6 + 1;
                }
                if (this.f8080g[i6] != '=' || i6 == i7) {
                    StringBuilder A = f.a.b.a.a.A("Unexpected end of DN: ");
                    A.append(this.a);
                    throw new IllegalStateException(A.toString());
                }
            }
            this.c++;
            while (true) {
                int i8 = this.c;
                if (i8 >= this.b || this.f8080g[i8] != ' ') {
                    break;
                }
                this.c = i8 + 1;
            }
            int i9 = this.f8078e;
            int i10 = this.f8077d;
            if (i9 - i10 > 4) {
                char[] cArr3 = this.f8080g;
                if (cArr3[i10 + 3] == '.' && ((cArr3[i10] == 'O' || cArr3[i10] == 'o') && ((cArr3[i10 + 1] == 'I' || cArr3[i10 + 1] == 'i') && (cArr3[i10 + 2] == 'D' || cArr3[i10 + 2] == 'd')))) {
                    this.f8077d = i10 + 4;
                }
            }
            char[] cArr4 = this.f8080g;
            int i11 = this.f8077d;
            return new String(cArr4, i11, this.f8078e - i11);
        }
        StringBuilder A2 = f.a.b.a.a.A("Unexpected end of DN: ");
        A2.append(this.a);
        throw new IllegalStateException(A2.toString());
    }
}
