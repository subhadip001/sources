package com.google.firebase.database.core;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.snapshot.ChildKey;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ValidationPath {
    public static final int MAX_PATH_DEPTH = 32;
    public static final int MAX_PATH_LENGTH_BYTES = 768;
    private int byteLength;
    private final List<String> parts = new ArrayList();

    private ValidationPath(Path path) {
        this.byteLength = 0;
        Iterator<ChildKey> it = path.iterator();
        while (it.hasNext()) {
            this.parts.add(it.next().asString());
        }
        this.byteLength = Math.max(1, this.parts.size());
        for (int i2 = 0; i2 < this.parts.size(); i2++) {
            this.byteLength += utf8Bytes(this.parts.get(i2));
        }
        checkValid();
    }

    private void checkValid() {
        if (this.byteLength <= 768) {
            if (this.parts.size() <= 32) {
                return;
            }
            StringBuilder A = a.A("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ");
            A.append(toErrorString());
            throw new DatabaseException(A.toString());
        }
        throw new DatabaseException(a.t(a.A("Data has a key path longer than 768 bytes ("), this.byteLength, ")."));
    }

    private static String joinStringList(String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 > 0) {
                sb.append(str);
            }
            sb.append(list.get(i2));
        }
        return sb.toString();
    }

    private String pop() {
        List<String> list;
        String remove = this.parts.remove(list.size() - 1);
        this.byteLength -= utf8Bytes(remove);
        if (this.parts.size() > 0) {
            this.byteLength--;
        }
        return remove;
    }

    private void push(String str) {
        if (this.parts.size() > 0) {
            this.byteLength++;
        }
        this.parts.add(str);
        this.byteLength += utf8Bytes(str);
        checkValid();
    }

    private String toErrorString() {
        return this.parts.size() == 0 ? "" : a.u(a.A("in path '"), joinStringList("/", this.parts), "'");
    }

    private static int utf8Bytes(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt <= 127) {
                i3++;
            } else if (charAt <= 2047) {
                i3 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i3 += 4;
                i2++;
            } else {
                i3 += 3;
            }
            i2++;
        }
        return i3;
    }

    public static void validateWithObject(Path path, Object obj) {
        new ValidationPath(path).withObject(obj);
    }

    private void withObject(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    push(str);
                    withObject(map.get(str));
                    pop();
                }
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            for (int i2 = 0; i2 < list.size(); i2++) {
                push(Integer.toString(i2));
                withObject(list.get(i2));
                pop();
            }
        }
    }
}
