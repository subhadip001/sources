package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.LeafNode;
import com.google.firebase.database.snapshot.Node;

/* loaded from: classes2.dex */
public class StringNode extends LeafNode<StringNode> {
    private final String value;

    /* renamed from: com.google.firebase.database.snapshot.StringNode$1  reason: invalid class name */
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

    public StringNode(String str, Node node) {
        super(node);
        this.value = str;
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public boolean equals(Object obj) {
        if (obj instanceof StringNode) {
            StringNode stringNode = (StringNode) obj;
            return this.value.equals(stringNode.value) && this.priority.equals(stringNode.priority);
        }
        return false;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public String getHashRepresentation(Node.HashVersion hashVersion) {
        int ordinal = hashVersion.ordinal();
        if (ordinal == 0) {
            return getPriorityHash(hashVersion) + "string:" + this.value;
        } else if (ordinal == 1) {
            return getPriorityHash(hashVersion) + "string:" + Utilities.stringHashV2Representation(this.value);
        } else {
            throw new IllegalArgumentException("Invalid hash version for string node: " + hashVersion);
        }
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public LeafNode.LeafType getLeafType() {
        return LeafNode.LeafType.String;
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
    public int compareLeafValues(StringNode stringNode) {
        return this.value.compareTo(stringNode.value);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public StringNode updatePriority(Node node) {
        return new StringNode(this.value, node);
    }
}
