package com.google.firebase.database.connection;

import f.a.b.a.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ConnectionUtils {
    public static void hardAssert(boolean z) {
        hardAssert(z, "", new Object[0]);
    }

    public static Long longFromObject(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static String pathToString(List<String> list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : list) {
            if (!z) {
                sb.append("/");
            }
            z = false;
            sb.append(str);
        }
        return sb.toString();
    }

    public static List<String> stringToPath(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/", -1);
        for (int i2 = 0; i2 < split.length; i2++) {
            if (!split[i2].isEmpty()) {
                arrayList.add(split[i2]);
            }
        }
        return arrayList;
    }

    public static void hardAssert(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        StringBuilder A = a.A("hardAssert failed: ");
        A.append(String.format(str, objArr));
        throw new AssertionError(A.toString());
    }
}
