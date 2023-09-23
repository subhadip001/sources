package f.h.c.a;

/* compiled from: CharMatcher.java */
/* loaded from: classes.dex */
public abstract class b implements k<Character> {

    /* compiled from: CharMatcher.java */
    /* loaded from: classes.dex */
    public static abstract class a extends b {
        @Override // f.h.c.a.k
        @Deprecated
        public boolean apply(Character ch) {
            return c(ch.charValue());
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: f.h.c.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0131b extends a {
        public final char a;
        public final char b;

        public C0131b(char c, char c2) {
            f.h.b.c.a.l(c2 >= c);
            this.a = c;
            this.b = c2;
        }

        @Override // f.h.c.a.b
        public boolean c(char c) {
            return this.a <= c && c <= this.b;
        }

        public String toString() {
            String a = b.a(this.a);
            String a2 = b.a(this.b);
            StringBuilder z = f.a.b.a.a.z(f.a.b.a.a.x(a2, f.a.b.a.a.x(a, 27)), "CharMatcher.inRange('", a, "', '", a2);
            z.append("')");
            return z.toString();
        }
    }

    /* compiled from: CharMatcher.java */
    /* loaded from: classes.dex */
    public static final class c extends a {
        public final char a;

        public c(char c) {
            this.a = c;
        }

        @Override // f.h.c.a.b
        public boolean c(char c) {
            return c == this.a;
        }

        public String toString() {
            String a = b.a(this.a);
            return f.a.b.a.a.g(f.a.b.a.a.x(a, 18), "CharMatcher.is('", a, "')");
        }
    }

    /* compiled from: CharMatcher.java */
    /* loaded from: classes.dex */
    public static abstract class d extends a {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final String toString() {
            return this.a;
        }
    }

    /* compiled from: CharMatcher.java */
    /* loaded from: classes.dex */
    public static final class e extends d {
        public static final e b = new e();

        public e() {
            super("CharMatcher.none()");
        }

        @Override // f.h.c.a.b
        public int b(CharSequence charSequence, int i2) {
            f.h.b.c.a.z(i2, charSequence.length());
            return -1;
        }

        @Override // f.h.c.a.b
        public boolean c(char c) {
            return false;
        }
    }

    /* compiled from: CharMatcher.java */
    /* loaded from: classes.dex */
    public static final class f extends d {
        public static final int b = Integer.numberOfLeadingZeros(31);
        public static final f c = new f();

        public f() {
            super("CharMatcher.whitespace()");
        }

        @Override // f.h.c.a.b
        public boolean c(char c2) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c2) >>> b) == c2;
        }
    }

    public static String a(char c2) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public int b(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        f.h.b.c.a.z(i2, length);
        while (i2 < length) {
            if (c(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public abstract boolean c(char c2);
}
