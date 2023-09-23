package com.google.firebase.database.core.utilities;

import com.google.firebase.database.snapshot.ChildKey;
import f.a.b.a.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class TreeNode<T> {
    public Map<ChildKey, TreeNode<T>> children = new HashMap();
    public T value;

    public String toString(String str) {
        StringBuilder D = a.D(str, "<value>: ");
        D.append(this.value);
        D.append("\n");
        String sb = D.toString();
        if (this.children.isEmpty()) {
            return a.q(sb, str, "<empty>");
        }
        for (Map.Entry<ChildKey, TreeNode<T>> entry : this.children.entrySet()) {
            StringBuilder D2 = a.D(sb, str);
            D2.append(entry.getKey());
            D2.append(":\n");
            D2.append(entry.getValue().toString(str + "\t"));
            D2.append("\n");
            sb = D2.toString();
        }
        return sb;
    }
}
