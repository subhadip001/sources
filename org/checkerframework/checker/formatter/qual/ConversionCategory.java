package org.checkerframework.checker.formatter.qual;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

/* loaded from: classes2.dex */
public enum ConversionCategory {
    GENERAL("bBhHsS", null),
    CHAR("cC", Character.class, Byte.class, Short.class, Integer.class),
    INT("doxX", Byte.class, Short.class, Integer.class, Long.class, BigInteger.class),
    FLOAT("eEfgGaA", Float.class, Double.class, BigDecimal.class),
    TIME("tT", Long.class, Calendar.class, Date.class),
    CHAR_AND_INT(null, Byte.class, Short.class, Integer.class),
    INT_AND_TIME(null, Long.class),
    NULL(null, new Class[0]),
    UNUSED(null, null);
    
    public final String chars;
    public final Class<?>[] types;

    ConversionCategory(String str, Class... clsArr) {
        Class cls;
        this.chars = str;
        if (clsArr == null) {
            this.types = clsArr;
            return;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        int length = clsArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Class cls2 = clsArr[i2];
            arrayList.add(cls2);
            if (cls2 == Byte.class) {
                cls = Byte.TYPE;
            } else if (cls2 == Character.class) {
                cls = Character.TYPE;
            } else if (cls2 == Short.class) {
                cls = Short.TYPE;
            } else if (cls2 == Integer.class) {
                cls = Integer.TYPE;
            } else if (cls2 == Long.class) {
                cls = Long.TYPE;
            } else if (cls2 == Float.class) {
                cls = Float.TYPE;
            } else if (cls2 == Double.class) {
                cls = Double.TYPE;
            } else {
                cls = cls2 == Boolean.class ? Boolean.TYPE : null;
            }
            if (cls != null) {
                arrayList.add(cls);
            }
        }
        this.types = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }

    public static <E> Set<E> a(E[] eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static ConversionCategory fromConversionChar(char c) {
        ConversionCategory[] conversionCategoryArr = {GENERAL, CHAR, INT, FLOAT, TIME};
        for (int i2 = 0; i2 < 5; i2++) {
            ConversionCategory conversionCategory = conversionCategoryArr[i2];
            if (conversionCategory.chars.contains(String.valueOf(c))) {
                return conversionCategory;
            }
        }
        throw new IllegalArgumentException("Bad conversion character " + c);
    }

    public static ConversionCategory intersect(ConversionCategory conversionCategory, ConversionCategory conversionCategory2) {
        ConversionCategory conversionCategory3 = UNUSED;
        if (conversionCategory == conversionCategory3) {
            return conversionCategory2;
        }
        if (conversionCategory2 == conversionCategory3) {
            return conversionCategory;
        }
        ConversionCategory conversionCategory4 = GENERAL;
        if (conversionCategory == conversionCategory4) {
            return conversionCategory2;
        }
        if (conversionCategory2 == conversionCategory4) {
            return conversionCategory;
        }
        Set a = a(conversionCategory.types);
        a.retainAll(a(conversionCategory2.types));
        ConversionCategory[] conversionCategoryArr = {CHAR, INT, FLOAT, TIME, CHAR_AND_INT, INT_AND_TIME, NULL};
        for (int i2 = 0; i2 < 7; i2++) {
            ConversionCategory conversionCategory5 = conversionCategoryArr[i2];
            if (a(conversionCategory5.types).equals(a)) {
                return conversionCategory5;
            }
        }
        throw new RuntimeException();
    }

    public static boolean isSubsetOf(ConversionCategory conversionCategory, ConversionCategory conversionCategory2) {
        return intersect(conversionCategory, conversionCategory2) == conversionCategory;
    }

    public static ConversionCategory union(ConversionCategory conversionCategory, ConversionCategory conversionCategory2) {
        ConversionCategory conversionCategory3;
        ConversionCategory conversionCategory4 = UNUSED;
        if (conversionCategory == conversionCategory4 || conversionCategory2 == conversionCategory4 || conversionCategory == (conversionCategory4 = GENERAL) || conversionCategory2 == conversionCategory4) {
            return conversionCategory4;
        }
        ConversionCategory conversionCategory5 = CHAR_AND_INT;
        if ((conversionCategory == conversionCategory5 && conversionCategory2 == INT_AND_TIME) || (conversionCategory == (conversionCategory3 = INT_AND_TIME) && conversionCategory2 == conversionCategory5)) {
            return INT;
        }
        Set a = a(conversionCategory.types);
        a.addAll(a(conversionCategory2.types));
        ConversionCategory[] conversionCategoryArr = {NULL, conversionCategory5, conversionCategory3, CHAR, INT, FLOAT, TIME};
        for (int i2 = 0; i2 < 7; i2++) {
            ConversionCategory conversionCategory6 = conversionCategoryArr[i2];
            if (a(conversionCategory6.types).equals(a)) {
                return conversionCategory6;
            }
        }
        return GENERAL;
    }

    public boolean isAssignableFrom(Class<?> cls) {
        Class<?>[] clsArr = this.types;
        if (clsArr == null || cls == Void.TYPE) {
            return true;
        }
        for (Class<?> cls2 : clsArr) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append(" conversion category");
        Class<?>[] clsArr = this.types;
        if (clsArr != null && clsArr.length != 0) {
            StringJoiner stringJoiner = new StringJoiner(", ", "(one of: ", ")");
            for (Class<?> cls : this.types) {
                stringJoiner.add(cls.getSimpleName());
            }
            sb.append(" ");
            sb.append(stringJoiner);
            return sb.toString();
        }
        return sb.toString();
    }
}
