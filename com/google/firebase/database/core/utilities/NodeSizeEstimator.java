package com.google.firebase.database.core.utilities;

import com.google.firebase.database.snapshot.BooleanNode;
import com.google.firebase.database.snapshot.ChildrenNode;
import com.google.firebase.database.snapshot.DoubleNode;
import com.google.firebase.database.snapshot.LeafNode;
import com.google.firebase.database.snapshot.LongNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import com.google.firebase.database.snapshot.StringNode;
import f.a.b.a.a;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class NodeSizeEstimator {
    private static final int LEAF_PRIORITY_OVERHEAD = 24;

    private static long estimateLeafNodeSize(LeafNode<?> leafNode) {
        long j2 = 8;
        if (!(leafNode instanceof DoubleNode) && !(leafNode instanceof LongNode)) {
            if (leafNode instanceof BooleanNode) {
                j2 = 4;
            } else if (leafNode instanceof StringNode) {
                j2 = ((String) leafNode.getValue()).length() + 2;
            } else {
                StringBuilder A = a.A("Unknown leaf node type: ");
                A.append(leafNode.getClass());
                throw new IllegalArgumentException(A.toString());
            }
        }
        return leafNode.getPriority().isEmpty() ? j2 : j2 + 24 + estimateLeafNodeSize((LeafNode) leafNode.getPriority());
    }

    public static long estimateSerializedNodeSize(Node node) {
        if (node.isEmpty()) {
            return 4L;
        }
        if (node.isLeafNode()) {
            return estimateLeafNodeSize((LeafNode) node);
        }
        StringBuilder A = a.A("Unexpected node type: ");
        A.append(node.getClass());
        Utilities.hardAssert(node instanceof ChildrenNode, A.toString());
        long j2 = 1;
        for (NamedNode namedNode : node) {
            j2 = j2 + namedNode.getName().asString().length() + 4 + estimateSerializedNodeSize(namedNode.getNode());
        }
        return !node.getPriority().isEmpty() ? j2 + 12 + estimateLeafNodeSize((LeafNode) node.getPriority()) : j2;
    }

    public static int nodeCount(Node node) {
        int i2 = 0;
        if (node.isEmpty()) {
            return 0;
        }
        if (node.isLeafNode()) {
            return 1;
        }
        StringBuilder A = a.A("Unexpected node type: ");
        A.append(node.getClass());
        Utilities.hardAssert(node instanceof ChildrenNode, A.toString());
        Iterator<NamedNode> it = node.iterator();
        while (it.hasNext()) {
            i2 += nodeCount(it.next().getNode());
        }
        return i2;
    }
}
