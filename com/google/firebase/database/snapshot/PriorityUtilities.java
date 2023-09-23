package com.google.firebase.database.snapshot;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.core.Path;
import f.a.b.a.a;

/* loaded from: classes2.dex */
public class PriorityUtilities {
    public static Node NullPriority() {
        return EmptyNode.Empty();
    }

    public static boolean isValidPriority(Node node) {
        return node.getPriority().isEmpty() && (node.isEmpty() || (node instanceof DoubleNode) || (node instanceof StringNode) || (node instanceof DeferredValueNode));
    }

    public static Node parsePriority(Object obj) {
        return parsePriority(null, obj);
    }

    public static Node parsePriority(Path path, Object obj) {
        String str;
        Node NodeFromJSON = NodeUtilities.NodeFromJSON(obj);
        if (NodeFromJSON instanceof LongNode) {
            NodeFromJSON = new DoubleNode(Double.valueOf(((Long) NodeFromJSON.getValue()).longValue()), NullPriority());
        }
        if (isValidPriority(NodeFromJSON)) {
            return NodeFromJSON;
        }
        StringBuilder sb = new StringBuilder();
        if (path != null) {
            str = "Path '" + path + "'";
        } else {
            str = "Node";
        }
        throw new DatabaseException(a.u(sb, str, " contains invalid priority: Must be a string, double, ServerValue, or null"));
    }
}
