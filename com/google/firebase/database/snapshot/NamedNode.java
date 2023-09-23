package com.google.firebase.database.snapshot;

import f.a.b.a.a;

/* loaded from: classes2.dex */
public final class NamedNode {
    private final ChildKey name;
    private final Node node;
    private static final NamedNode MIN_NODE = new NamedNode(ChildKey.getMinName(), EmptyNode.Empty());
    private static final NamedNode MAX_NODE = new NamedNode(ChildKey.getMaxName(), Node.MAX_NODE);

    public NamedNode(ChildKey childKey, Node node) {
        this.name = childKey;
        this.node = node;
    }

    public static NamedNode getMaxNode() {
        return MAX_NODE;
    }

    public static NamedNode getMinNode() {
        return MIN_NODE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NamedNode.class != obj.getClass()) {
            return false;
        }
        NamedNode namedNode = (NamedNode) obj;
        return this.name.equals(namedNode.name) && this.node.equals(namedNode.node);
    }

    public ChildKey getName() {
        return this.name;
    }

    public Node getNode() {
        return this.node;
    }

    public int hashCode() {
        return this.node.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        StringBuilder A = a.A("NamedNode{name=");
        A.append(this.name);
        A.append(", node=");
        A.append(this.node);
        A.append('}');
        return A.toString();
    }
}
