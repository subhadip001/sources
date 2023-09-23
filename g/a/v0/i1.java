package g.a.v0;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: JsonUtil.java */
/* loaded from: classes2.dex */
public class i1 {
    public static final long a = TimeUnit.SECONDS.toNanos(1);
    public static final /* synthetic */ int b = 0;

    public static List<Map<String, ?>> a(List<?> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!(list.get(i2) instanceof Map)) {
                throw new ClassCastException(String.format("value %s for idx %d in %s is not object", list.get(i2), Integer.valueOf(i2), list));
            }
        }
        return list;
    }

    public static List<?> b(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                return (List) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
        }
        return null;
    }

    public static List<String> c(Map<String, ?> map, String str) {
        List b2 = b(map, str);
        if (b2 == null) {
            return null;
        }
        for (int i2 = 0; i2 < b2.size(); i2++) {
            if (!(b2.get(i2) instanceof String)) {
                throw new ClassCastException(String.format("value '%s' for idx %d in '%s' is not string", b2.get(i2), Integer.valueOf(i2), b2));
            }
        }
        return b2;
    }

    public static Double d(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof Double) {
                return (Double) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Double", obj, str, map));
        }
        return null;
    }

    public static Integer e(Map<String, ?> map, String str) {
        Double d2 = d(map, str);
        if (d2 == null) {
            return null;
        }
        int intValue = d2.intValue();
        if (intValue == d2.doubleValue()) {
            return Integer.valueOf(intValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d2);
    }

    public static Map<String, ?> f(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof Map) {
                return (Map) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
        }
        return null;
    }

    public static String g(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
        }
        return null;
    }

    public static Long h(Map<String, ?> map, String str) {
        String g2 = g(map, str);
        if (g2 == null) {
            return null;
        }
        try {
            return Long.valueOf(j(g2));
        } catch (ParseException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long i(long r18, int r20) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.v0.i1.i(long, int):long");
    }

    public static long j(String str) {
        boolean z;
        String str2;
        int i2;
        if (!str.isEmpty() && str.charAt(str.length() - 1) == 's') {
            if (str.charAt(0) == '-') {
                str = str.substring(1);
                z = true;
            } else {
                z = false;
            }
            String substring = str.substring(0, str.length() - 1);
            int indexOf = substring.indexOf(46);
            if (indexOf != -1) {
                str2 = substring.substring(indexOf + 1);
                substring = substring.substring(0, indexOf);
            } else {
                str2 = "";
            }
            long parseLong = Long.parseLong(substring);
            if (str2.isEmpty()) {
                i2 = 0;
            } else {
                int i3 = 0;
                for (int i4 = 0; i4 < 9; i4++) {
                    i3 *= 10;
                    if (i4 < str2.length()) {
                        if (str2.charAt(i4) >= '0' && str2.charAt(i4) <= '9') {
                            i3 = (str2.charAt(i4) - '0') + i3;
                        } else {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                    }
                }
                i2 = i3;
            }
            if (parseLong >= 0) {
                if (z) {
                    parseLong = -parseLong;
                    i2 = -i2;
                }
                try {
                    return i(parseLong, i2);
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Duration value is out of range.", 0);
                }
            }
            throw new ParseException(f.a.b.a.a.p("Invalid duration string: ", str), 0);
        }
        throw new ParseException(f.a.b.a.a.p("Invalid duration string: ", str), 0);
    }
}
