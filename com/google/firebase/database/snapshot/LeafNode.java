package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.LeafNode;
import com.google.firebase.database.snapshot.Node;
import f.a.b.a.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class LeafNode<T extends LeafNode> implements Node {
    private String lazyHash;
    public final Node priority;

    /* renamed from: com.google.firebase.database.snapshot.LeafNode$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$database$snapshot$Node$HashVersion;

        static {
            Node.HashVersion.values();
            int[] iArr = new int[2];
            $SwitchMap$com$google$firebase$database$snapshot$Node$HashVersion = iArr;
            try {
                Node.HashVersion hashVersion = Node.HashVersion.V1;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$google$firebase$database$snapshot$Node$HashVersion;
                Node.HashVersion hashVersion2 = Node.HashVersion.V2;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum LeafType {
        DeferredValue,
        Boolean,
        Number,
        String
    }

    public LeafNode(Node node) {
        this.priority = node;
    }

    private static int compareLongDoubleNodes(LongNode longNode, DoubleNode doubleNode) {
        return Double.valueOf(((Long) longNode.getValue()).longValue()).compareTo((Double) doubleNode.getValue());
    }

    public abstract int compareLeafValues(T t);

    public abstract boolean equals(Object obj);

    @Override // com.google.firebase.database.snapshot.Node
    public Node getChild(Path path) {
        if (path.isEmpty()) {
            return this;
        }
        if (path.getFront().isPriorityChildName()) {
            return this.priority;
        }
        return EmptyNode.Empty();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public int getChildCount() {
        return 0;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public String getHash() {
        if (this.lazyHash == null) {
            this.lazyHash = Utilities.sha1HexDigest(getHashRepresentation(Node.HashVersion.V1));
        }
        return this.lazyHash;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node getImmediateChild(ChildKey childKey) {
        if (childKey.isPriorityChildName()) {
            return this.priority;
        }
        return EmptyNode.Empty();
    }

    public abstract LeafType getLeafType();

    @Override // com.google.firebase.database.snapshot.Node
    public ChildKey getPredecessorChildKey(ChildKey childKey) {
        return null;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node getPriority() {
        return this.priority;
    }

    public String getPriorityHash(Node.HashVersion hashVersion) {
        int ordinal = hashVersion.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            throw new IllegalArgumentException("Unknown hash version: " + hashVersion);
        } else if (this.priority.isEmpty()) {
            return "";
        } else {
            StringBuilder A = a.A("priority:");
            A.append(this.priority.getHashRepresentation(hashVersion));
            A.append(":");
            return A.toString();
        }
    }

    @Override // com.google.firebase.database.snapshot.Node
    public ChildKey getSuccessorChildKey(ChildKey childKey) {
        return null;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Object getValue(boolean z) {
        if (z && !this.priority.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put(".value", getValue());
            hashMap.put(".priority", this.priority.getValue());
            return hashMap;
        }
        return getValue();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public boolean hasChild(ChildKey childKey) {
        return false;
    }

    public abstract int hashCode();

    @Override // com.google.firebase.database.snapshot.Node
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public boolean isLeafNode() {
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<NamedNode> iterator() {
        return Collections.emptyList().iterator();
    }

    public int leafCompare(LeafNode<?> leafNode) {
        LeafType leafType = getLeafType();
        LeafType leafType2 = leafNode.getLeafType();
        if (leafType.equals(leafType2)) {
            return compareLeafValues(leafNode);
        }
        return leafType.compareTo(leafType2);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Iterator<NamedNode> reverseIterator() {
        return Collections.emptyList().iterator();
    }

    public String toString() {
        String obj = getValue(true).toString();
        if (obj.length() <= 100) {
            return obj;
        }
        return obj.substring(0, 100) + "...";
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node updateChild(Path path, Node node) {
        ChildKey front = path.getFront();
        if (front == null) {
            return node;
        }
        if (!node.isEmpty() || front.isPriorityChildName()) {
            boolean z = true;
            if (path.getFront().isPriorityChildName() && path.size() != 1) {
                z = false;
            }
            Utilities.hardAssert(z);
            return updateImmediateChild(front, EmptyNode.Empty().updateChild(path.popFront(), node));
        }
        return this;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Node updateImmediateChild(ChildKey childKey, Node node) {
        if (childKey.isPriorityChildName()) {
            return updatePriority(node);
        }
        return node.isEmpty() ? this : EmptyNode.Empty().updateImmediateChild(childKey, node).updatePriority(this.priority);
    }

    @Override // java.lang.Comparable
    public int compareTo(Node node) {
        if (node.isEmpty()) {
            return 1;
        }
        if (node instanceof ChildrenNode) {
            return -1;
        }
        Utilities.hardAssert(node.isLeafNode(), "Node is not leaf node!");
        if ((this instanceof LongNode) && (node instanceof DoubleNode)) {
            return compareLongDoubleNodes((LongNode) this, (DoubleNode) node);
        }
        if ((this instanceof DoubleNode) && (node instanceof LongNode)) {
            return compareLongDoubleNodes((LongNode) node, (DoubleNode) this) * (-1);
        }
        return leafCompare((LeafNode) node);
    }
}
