package i.q;

import i.l.b.i;
import java.util.NoSuchElementException;

/* compiled from: StringNumberConversions.kt */
/* loaded from: classes2.dex */
public class e extends d {
    public static final boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        i.e(charSequence, "<this>");
        i.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (g(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (e(charSequence, charSequence2, 0, charSequence.length(), z, false, 16) >= 0) {
            return true;
        }
        return false;
    }

    public static final int b(CharSequence charSequence) {
        i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int c(CharSequence charSequence, String str, int i2, boolean z) {
        i.e(charSequence, "<this>");
        i.e(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i2);
        }
        return e(charSequence, str, i2, charSequence.length(), z, false, 16);
    }

    public static final int d(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        i.n.a aVar;
        if (!z2) {
            if (i2 < 0) {
                i2 = 0;
            }
            int length = charSequence.length();
            if (i3 > length) {
                i3 = length;
            }
            aVar = new i.n.c(i2, i3);
        } else {
            int b = b(charSequence);
            if (i2 > b) {
                i2 = b;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            aVar = new i.n.a(i2, i3, -1);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i4 = aVar.f8655f;
            int i5 = aVar.f8656g;
            int i6 = aVar.f8657h;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (!f.n.a.n.i.Q((String) charSequence2, 0, (String) charSequence, i4, charSequence2.length(), z)) {
                    if (i4 != i5) {
                        i4 += i6;
                    }
                }
                return i4;
            }
        } else {
            int i7 = aVar.f8655f;
            int i8 = aVar.f8656g;
            int i9 = aVar.f8657h;
            if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                while (!i(charSequence2, 0, charSequence, i7, charSequence2.length(), z)) {
                    if (i7 != i8) {
                        i7 += i9;
                    }
                }
                return i7;
            }
        }
        return -1;
    }

    public static /* synthetic */ int e(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2, int i4) {
        return d(charSequence, charSequence2, i2, i3, z, (i4 & 16) != 0 ? false : z2);
    }

    public static int f(CharSequence charSequence, char c, int i2, boolean z, int i3) {
        int i4;
        boolean z2;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        i.e(charSequence, "<this>");
        if (!z) {
            return ((String) charSequence).indexOf(c, i2);
        }
        char[] cArr = {c};
        i.e(charSequence, "<this>");
        i.e(cArr, "chars");
        if (!z) {
            return ((String) charSequence).indexOf(i.i.b.e(cArr), i2);
        }
        if (i2 < 0) {
            i2 = 0;
        }
        i.n.c cVar = new i.n.c(i2, b(charSequence));
        int i5 = cVar.f8656g;
        int i6 = cVar.f8657h;
        boolean z3 = i6 <= 0 ? i2 >= i5 : i2 <= i5;
        if (!z3) {
            i2 = i5;
        }
        while (z3) {
            if (i2 != i5) {
                i4 = i6 + i2;
            } else if (!z3) {
                throw new NoSuchElementException();
            } else {
                i4 = i2;
                z3 = false;
            }
            char charAt = charSequence.charAt(i2);
            int i7 = 0;
            while (true) {
                if (i7 >= 1) {
                    z2 = false;
                    break;
                } else if (f.n.a.n.i.t(cArr[i7], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i7++;
                }
            }
            if (z2) {
                return i2;
            }
            i2 = i4;
        }
        return -1;
    }

    public static /* synthetic */ int g(CharSequence charSequence, String str, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return c(charSequence, str, i2, z);
    }

    public static int h(CharSequence charSequence, String str, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = b(charSequence);
        }
        int i4 = i2;
        boolean z2 = (i3 & 4) != 0 ? false : z;
        i.e(charSequence, "<this>");
        i.e(str, "string");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i4);
        }
        return d(charSequence, str, i4, 0, z2, true);
    }

    public static final boolean i(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z) {
        i.e(charSequence, "<this>");
        i.e(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!f.n.a.n.i.t(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z)) {
                return false;
            }
        }
        return true;
    }

    public static final void j(int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(f.a.b.a.a.i("Limit must be non-negative, but was ", i2).toString());
        }
    }

    public static String k(String str, char c, String str2, int i2) {
        String str3 = (i2 & 2) != 0 ? str : null;
        i.e(str, "<this>");
        i.e(str3, "missingDelimiterValue");
        int b = b(str);
        i.e(str, "<this>");
        int lastIndexOf = str.lastIndexOf(c, b);
        if (lastIndexOf == -1) {
            return str3;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
