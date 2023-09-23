package f.h.f.z;

import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber.java */
/* loaded from: classes2.dex */
public final class r extends Number {

    /* renamed from: f  reason: collision with root package name */
    public final String f6252f;

    public r(String str) {
        this.f6252f = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f6252f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            String str = this.f6252f;
            String str2 = ((r) obj).f6252f;
            return str == str2 || str.equals(str2);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f6252f);
    }

    public int hashCode() {
        return this.f6252f.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f6252f);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f6252f).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f6252f);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f6252f);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f6252f).longValue();
        }
    }

    public String toString() {
        return this.f6252f;
    }
}
