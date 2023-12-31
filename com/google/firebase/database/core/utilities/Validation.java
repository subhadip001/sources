package com.google.firebase.database.core.utilities;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.ServerValues;
import com.google.firebase.database.core.ValidationPath;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.Node;
import com.google.firebase.database.snapshot.NodeUtilities;
import com.google.firebase.database.snapshot.PriorityUtilities;
import f.a.b.a.a;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class Validation {
    private static final Pattern INVALID_PATH_REGEX = Pattern.compile("[\\[\\]\\.#$]");
    private static final Pattern INVALID_KEY_REGEX = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    private static boolean isValidKey(String str) {
        return str.equals(".info") || !INVALID_KEY_REGEX.matcher(str).find() || str.equals(ChildKey.getMaxName().asString()) || str.equals(ChildKey.getMinName().asString());
    }

    private static boolean isValidPathString(String str) {
        return !INVALID_PATH_REGEX.matcher(str).find();
    }

    private static boolean isWritableKey(String str) {
        return str != null && str.length() > 0 && (str.equals(".value") || str.equals(".priority") || !(str.startsWith(".") || INVALID_KEY_REGEX.matcher(str).find()));
    }

    private static boolean isWritablePath(Path path) {
        ChildKey front = path.getFront();
        return front == null || !front.asString().startsWith(".");
    }

    public static Map<Path, Node> parseAndValidateUpdate(Path path, Map<String, Object> map) {
        Node NodeFromJSON;
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Path path2 = new Path(entry.getKey());
            Object value = entry.getValue();
            ValidationPath.validateWithObject(path.child(path2), value);
            String asString = !path2.isEmpty() ? path2.getBack().asString() : "";
            if (!asString.equals(ServerValues.NAME_SUBKEY_SERVERVALUE) && !asString.equals(".value")) {
                if (asString.equals(".priority")) {
                    NodeFromJSON = PriorityUtilities.parsePriority(path2, value);
                } else {
                    NodeFromJSON = NodeUtilities.NodeFromJSON(value);
                }
                validateWritableObject(value);
                treeMap.put(path2, NodeFromJSON);
            } else {
                throw new DatabaseException("Path '" + path2 + "' contains disallowed child name: " + asString);
            }
        }
        Path path3 = null;
        for (Path path4 : treeMap.keySet()) {
            Utilities.hardAssert(path3 == null || path3.compareTo(path4) < 0);
            if (path3 != null && path3.contains(path4)) {
                throw new DatabaseException("Path '" + path3 + "' is an ancestor of '" + path4 + "' in an update.");
            }
            path3 = path4;
        }
        return treeMap;
    }

    private static void validateDoubleValue(double d2) {
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            throw new DatabaseException("Invalid value: Value cannot be NaN, Inf or -Inf.");
        }
    }

    public static void validateNullableKey(String str) {
        if (str != null && !isValidKey(str)) {
            throw new DatabaseException(a.q("Invalid key: ", str, ". Keys must not contain '/', '.', '#', '$', '[', or ']'"));
        }
    }

    public static void validatePathString(String str) {
        if (!isValidPathString(str)) {
            throw new DatabaseException(a.q("Invalid Firebase Database path: ", str, ". Firebase Database paths must not contain '.', '#', '$', '[', or ']'"));
        }
    }

    public static void validateRootPathString(String str) {
        if (str.startsWith(".info")) {
            validatePathString(str.substring(5));
        } else if (str.startsWith("/.info")) {
            validatePathString(str.substring(6));
        } else {
            validatePathString(str);
        }
    }

    public static void validateWritableKey(String str) {
        if (!isWritableKey(str)) {
            throw new DatabaseException(a.q("Invalid key: ", str, ". Keys must not contain '/', '.', '#', '$', '[', or ']'"));
        }
    }

    public static void validateWritableObject(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey(ServerValues.NAME_SUBKEY_SERVERVALUE)) {
                return;
            }
            for (Map.Entry entry : map.entrySet()) {
                validateWritableKey((String) entry.getKey());
                validateWritableObject(entry.getValue());
            }
        } else if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                validateWritableObject(obj2);
            }
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            validateDoubleValue(((Double) obj).doubleValue());
        }
    }

    public static void validateWritablePath(Path path) {
        if (isWritablePath(path)) {
            return;
        }
        StringBuilder A = a.A("Invalid write location: ");
        A.append(path.toString());
        throw new DatabaseException(A.toString());
    }
}
