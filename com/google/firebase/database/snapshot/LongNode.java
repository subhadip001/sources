package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.LeafNode;
import com.google.firebase.database.snapshot.Node;
import f.a.b.a.a;

/* loaded from: classes2.dex */
public class LongNode extends LeafNode<LongNode> {
    private final long value;

    public LongNode(Long l2, Node node) {
        super(node);
        this.value = l2.longValue();
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public boolean equals(Object obj) {
        if (obj instanceof LongNode) {
            LongNode longNode = (LongNode) obj;
            return this.value == longNode.value && this.priority.equals(longNode.priority);
        }
        return false;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public String getHashRepresentation(Node.HashVersion hashVersion) {
        StringBuilder A = a.A(a.p(getPriorityHash(hashVersion), "number:"));
        A.append(Utilities.doubleToHashString(this.value));
        return A.toString();
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public LeafNode.LeafType getLeafType() {
        return LeafNode.LeafType.Number;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Object getValue() {
        return Long.valueOf(this.value);
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public int hashCode() {
        long j2 = this.value;
        return this.priority.hashCode() + ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public int compareLeafValues(LongNode longNode) {
        return Utilities.compareLongs(this.value, longNode.value);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public LongNode updatePriority(Node node) {
        return new LongNode(Long.valueOf(this.value), node);
    }
}
