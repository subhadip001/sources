package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.LeafNode;
import com.google.firebase.database.snapshot.Node;
import f.a.b.a.a;

/* loaded from: classes2.dex */
public class DoubleNode extends LeafNode<DoubleNode> {
    private final Double value;

    public DoubleNode(Double d2, Node node) {
        super(node);
        this.value = d2;
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public boolean equals(Object obj) {
        if (obj instanceof DoubleNode) {
            DoubleNode doubleNode = (DoubleNode) obj;
            return this.value.equals(doubleNode.value) && this.priority.equals(doubleNode.priority);
        }
        return false;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public String getHashRepresentation(Node.HashVersion hashVersion) {
        StringBuilder A = a.A(a.p(getPriorityHash(hashVersion), "number:"));
        A.append(Utilities.doubleToHashString(this.value.doubleValue()));
        return A.toString();
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public LeafNode.LeafType getLeafType() {
        return LeafNode.LeafType.Number;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Object getValue() {
        return this.value;
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public int hashCode() {
        return this.priority.hashCode() + this.value.hashCode();
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public int compareLeafValues(DoubleNode doubleNode) {
        return this.value.compareTo(doubleNode.value);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public DoubleNode updatePriority(Node node) {
        Utilities.hardAssert(PriorityUtilities.isValidPriority(node));
        return new DoubleNode(this.value, node);
    }
}
