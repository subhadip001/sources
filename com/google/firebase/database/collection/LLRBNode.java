package com.google.firebase.database.collection;

import java.util.Comparator;

/* loaded from: classes2.dex */
public interface LLRBNode<K, V> {

    /* loaded from: classes2.dex */
    public enum Color {
        RED,
        BLACK
    }

    /* loaded from: classes2.dex */
    public static abstract class NodeVisitor<K, V> implements ShortCircuitingNodeVisitor<K, V> {
        @Override // com.google.firebase.database.collection.LLRBNode.ShortCircuitingNodeVisitor
        public boolean shouldContinue(K k2, V v) {
            visitEntry(k2, v);
            return true;
        }

        public abstract void visitEntry(K k2, V v);
    }

    /* loaded from: classes2.dex */
    public interface ShortCircuitingNodeVisitor<K, V> {
        boolean shouldContinue(K k2, V v);
    }

    LLRBNode<K, V> copy(K k2, V v, Color color, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2);

    K getKey();

    LLRBNode<K, V> getLeft();

    LLRBNode<K, V> getMax();

    LLRBNode<K, V> getMin();

    LLRBNode<K, V> getRight();

    V getValue();

    void inOrderTraversal(NodeVisitor<K, V> nodeVisitor);

    LLRBNode<K, V> insert(K k2, V v, Comparator<K> comparator);

    boolean isEmpty();

    boolean isRed();

    LLRBNode<K, V> remove(K k2, Comparator<K> comparator);

    boolean shortCircuitingInOrderTraversal(ShortCircuitingNodeVisitor<K, V> shortCircuitingNodeVisitor);

    boolean shortCircuitingReverseOrderTraversal(ShortCircuitingNodeVisitor<K, V> shortCircuitingNodeVisitor);

    int size();
}
