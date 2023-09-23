package e.i.h;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import e.i.h.d;
import java.util.Locale;

/* compiled from: BidiFormatter.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final c f2499d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f2500e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f2501f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f2502g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f2503h;
    public final boolean a;
    public final int b;
    public final c c;

    /* compiled from: BidiFormatter.java */
    /* renamed from: e.i.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0043a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f2504e = new byte[1792];
        public final CharSequence a;
        public final int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public char f2505d;

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                f2504e[i2] = Character.getDirectionality(i2);
            }
        }

        public C0043a(CharSequence charSequence, boolean z) {
            this.a = charSequence;
            this.b = charSequence.length();
        }

        public byte a() {
            char charAt = this.a.charAt(this.c - 1);
            this.f2505d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.a, this.c);
                this.c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.c--;
            char c = this.f2505d;
            return c < 1792 ? f2504e[c] : Character.getDirectionality(c);
        }
    }

    static {
        c cVar = d.c;
        f2499d = cVar;
        f2500e = Character.toString((char) 8206);
        f2501f = Character.toString((char) 8207);
        f2502g = new a(false, 2, cVar);
        f2503h = new a(true, 2, cVar);
    }

    public a(boolean z, int i2, c cVar) {
        this.a = z;
        this.b = i2;
        this.c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r3 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r4 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r0.c <= 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        switch(r0.a()) {
            case 14: goto L62;
            case 15: goto L62;
            case 16: goto L57;
            case 17: goto L57;
            case 18: goto L53;
            default: goto L65;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (r3 != r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
        if (r3 != r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            e.i.h.a$a r0 = new e.i.h.a$a
            r1 = 0
            r0.<init>(r9, r1)
            r0.c = r1
            r9 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            int r6 = r0.c
            int r7 = r0.b
            if (r6 >= r7) goto L70
            if (r3 != 0) goto L70
            java.lang.CharSequence r7 = r0.a
            char r6 = r7.charAt(r6)
            r0.f2505d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L39
            java.lang.CharSequence r6 = r0.a
            int r7 = r0.c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L4d
        L39:
            int r6 = r0.c
            int r6 = r6 + r2
            r0.c = r6
            char r6 = r0.f2505d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L49
            byte[] r7 = e.i.h.a.C0043a.f2504e
            r6 = r7[r6]
            goto L4d
        L49:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L4d:
            if (r6 == 0) goto L6b
            if (r6 == r2) goto L68
            r7 = 2
            if (r6 == r7) goto L68
            r7 = 9
            if (r6 == r7) goto Ld
            switch(r6) {
                case 14: goto L64;
                case 15: goto L64;
                case 16: goto L60;
                case 17: goto L60;
                case 18: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L6e
        L5c:
            int r5 = r5 + (-1)
            r4 = 0
            goto Ld
        L60:
            int r5 = r5 + 1
            r4 = 1
            goto Ld
        L64:
            int r5 = r5 + 1
            r4 = -1
            goto Ld
        L68:
            if (r5 != 0) goto L6e
            goto L88
        L6b:
            if (r5 != 0) goto L6e
            goto L8c
        L6e:
            r3 = r5
            goto Ld
        L70:
            if (r3 != 0) goto L73
            goto L91
        L73:
            if (r4 == 0) goto L77
            r1 = r4
            goto L91
        L77:
            int r4 = r0.c
            if (r4 <= 0) goto L91
            byte r4 = r0.a()
            switch(r4) {
                case 14: goto L8a;
                case 15: goto L8a;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r5 = r5 + 1
            goto L77
        L86:
            if (r3 != r5) goto L8e
        L88:
            r1 = 1
            goto L91
        L8a:
            if (r3 != r5) goto L8e
        L8c:
            r1 = -1
            goto L91
        L8e:
            int r5 = r5 + (-1)
            goto L77
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.h.a.a(java.lang.CharSequence):int");
    }

    public static int b(CharSequence charSequence) {
        C0043a c0043a = new C0043a(charSequence, false);
        c0043a.c = c0043a.b;
        int i2 = 0;
        int i3 = 0;
        while (c0043a.c > 0) {
            byte a = c0043a.a();
            if (a != 0) {
                if (a == 1 || a == 2) {
                    if (i2 == 0) {
                        return 1;
                    }
                    if (i3 == 0) {
                        i3 = i2;
                    }
                } else if (a != 9) {
                    switch (a) {
                        case 14:
                        case 15:
                            if (i3 == i2) {
                                return -1;
                            }
                            i2--;
                            break;
                        case 16:
                        case 17:
                            if (i3 == i2) {
                                return 1;
                            }
                            i2--;
                            break;
                        case 18:
                            i2++;
                            break;
                        default:
                            if (i3 != 0) {
                                break;
                            } else {
                                i3 = i2;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else if (i2 == 0) {
                return -1;
            } else {
                if (i3 == 0) {
                    i3 = i2;
                }
            }
        }
        return 0;
    }

    public static a c() {
        Locale locale = Locale.getDefault();
        Locale locale2 = e.a;
        boolean z = TextUtils.getLayoutDirectionFromLocale(locale) == 1;
        c cVar = f2499d;
        if (cVar == f2499d) {
            return z ? f2503h : f2502g;
        }
        return new a(z, 2, cVar);
    }

    public CharSequence d(CharSequence charSequence) {
        return e(charSequence, this.c, true);
    }

    public CharSequence e(CharSequence charSequence, c cVar, boolean z) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean b = ((d.c) cVar).b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = "";
        if (((this.b & 2) != 0) && z) {
            boolean b2 = ((d.c) (b ? d.b : d.a)).b(charSequence, 0, charSequence.length());
            if (!this.a && (b2 || a(charSequence) == 1)) {
                str = f2500e;
            } else {
                str = (!this.a || (b2 && a(charSequence) != -1)) ? "" : f2501f;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (b != this.a) {
            spannableStringBuilder.append(b ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean b3 = ((d.c) (b ? d.b : d.a)).b(charSequence, 0, charSequence.length());
            if (!this.a && (b3 || b(charSequence) == 1)) {
                str2 = f2500e;
            } else if (this.a && (!b3 || b(charSequence) == -1)) {
                str2 = f2501f;
            }
            spannableStringBuilder.append((CharSequence) str2);
        }
        return spannableStringBuilder;
    }
}
