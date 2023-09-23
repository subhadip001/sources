package com.google.firebase.database;

import com.google.firebase.database.core.ServerValues;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ServerValue {
    public static final Map<String, String> TIMESTAMP = createScalarServerValuePlaceholder("timestamp");

    private static Map<String, Map<String, Object>> createParameterizedServerValuePlaceholder(String str, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, obj);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(ServerValues.NAME_SUBKEY_SERVERVALUE, Collections.unmodifiableMap(hashMap));
        return Collections.unmodifiableMap(hashMap2);
    }

    private static Map<String, String> createScalarServerValuePlaceholder(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ServerValues.NAME_SUBKEY_SERVERVALUE, str);
        return Collections.unmodifiableMap(hashMap);
    }

    public static final Object increment(long j2) {
        return createParameterizedServerValuePlaceholder(ServerValues.NAME_OP_INCREMENT, Long.valueOf(j2));
    }

    public static final Object increment(double d2) {
        return createParameterizedServerValuePlaceholder(ServerValues.NAME_OP_INCREMENT, Double.valueOf(d2));
    }
}
