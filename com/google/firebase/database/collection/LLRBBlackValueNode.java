package com.google.firebase.database.collection;

import com.google.firebase.database.collection.LLRBNode;

/* loaded from: classes2.dex */
public class LLRBBlackValueNode<K, V> extends LLRBValueNode<K, V> {
    private int size;

    public LLRBBlackValueNode(K k2, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        super(k2, v, lLRBNode, lLRBNode2);
        this.size = -1;
    }

    @Override // com.google.firebase.database.collection.LLRBValueNode
    public LLRBValueNode<K, V> copy(K k2, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        if (k2 == null) {
            k2 = getKey();
        }
        if (v == null) {
            v = getValue();
        }
        if (lLRBNode == null) {
            lLRBNode = getLeft();
        }
        if (lLRBNode2 == null) {
            lLRBNode2 = getRight();
        }
        return new LLRBBlackValueNode(k2, v, lLRBNode, lLRBNode2);
    }

    @Override // com.google.firebase.database.collection.LLRBValueNode
    public LLRBNode.Color getColor() {
        return LLRBNode.Color.BLACK;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public boolean isRed() {
        return false;
    }

    @Override // com.google.firebase.database.collection.LLRBValueNode
    public void setLeft(LLRBNode<K, V> lLRBNode) {
        if (this.size == -1) {
            super.setLeft(lLRBNode);
            return;
        }
        throw new IllegalStateException("Can't set left after using size");
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public int size() {
        if (this.size == -1) {
            this.size = getRight().size() + getLeft().size() + 1;
        }
        return this.size;
    }
}
