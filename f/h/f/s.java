package f.h.f;

import java.math.BigInteger;
import java.util.Objects;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes2.dex */
public final class s extends p {
    public final Object a;

    public s(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    public static boolean h(s sVar) {
        Object obj = sVar.a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    @Override // f.h.f.p
    public String c() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return e().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    public boolean d() {
        Object obj = this.a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(c());
    }

    public Number e() {
        Object obj = this.a;
        return obj instanceof String ? new f.h.f.z.r((String) this.a) : (Number) obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.a == null) {
            return sVar.a == null;
        } else if (h(this) && h(sVar)) {
            return e().longValue() == sVar.e().longValue();
        } else {
            Object obj2 = this.a;
            if ((obj2 instanceof Number) && (sVar.a instanceof Number)) {
                double doubleValue = e().doubleValue();
                double doubleValue2 = sVar.e().doubleValue();
                if (doubleValue != doubleValue2) {
                    return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
                }
                return true;
            }
            return obj2.equals(sVar.a);
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (h(this)) {
            doubleToLongBits = e().longValue();
        } else {
            Object obj = this.a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(e().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public s(Number number) {
        Objects.requireNonNull(number);
        this.a = number;
    }

    public s(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }
}
