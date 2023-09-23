package e.i.f;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: LocaleListCompatWrapper.java */
/* loaded from: classes.dex */
public final class e implements f {
    public static final Locale[] b = new Locale[0];
    public final Locale[] a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        int i2 = d.b;
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public e(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.a = b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < localeArr.length; i2++) {
            Locale locale = localeArr[i2];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    locale2.getLanguage();
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        locale2.getCountry();
                    }
                    int length = localeArr.length;
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(f.a.b.a.a.j("list[", i2, "] is null"));
            }
        }
        this.a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
    }

    @Override // e.i.f.f
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        Locale[] localeArr = ((e) obj).a;
        if (this.a.length != localeArr.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            Locale[] localeArr2 = this.a;
            if (i2 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i2].equals(localeArr[i2])) {
                return false;
            }
            i2++;
        }
    }

    @Override // e.i.f.f
    public Locale get(int i2) {
        if (i2 >= 0) {
            Locale[] localeArr = this.a;
            if (i2 < localeArr.length) {
                return localeArr[i2];
            }
        }
        return null;
    }

    public int hashCode() {
        int i2 = 1;
        int i3 = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i3 >= localeArr.length) {
                return i2;
            }
            i2 = (i2 * 31) + localeArr[i3].hashCode();
            i3++;
        }
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("[");
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i2 < localeArr.length) {
                A.append(localeArr[i2]);
                if (i2 < this.a.length - 1) {
                    A.append(',');
                }
                i2++;
            } else {
                A.append("]");
                return A.toString();
            }
        }
    }
}
