package com.google.firebase.database.collection;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class ImmutableSortedMapIterator<K, V> implements Iterator<Map.Entry<K, V>> {
    private final boolean isReverse;
    private final ArrayDeque<LLRBValueNode<K, V>> nodeStack = new ArrayDeque<>();

    public ImmutableSortedMapIterator(LLRBNode<K, V> lLRBNode, K k2, Comparator<K> comparator, boolean z) {
        int i2;
        this.isReverse = z;
        while (!lLRBNode.isEmpty()) {
            if (k2 == null) {
                i2 = 1;
            } else if (z) {
                i2 = comparator.compare(k2, lLRBNode.getKey());
            } else {
                i2 = comparator.compare(lLRBNode.getKey(), k2);
            }
            if (i2 < 0) {
                if (z) {
                    lLRBNode = lLRBNode.getLeft();
                } else {
                    lLRBNode = lLRBNode.getRight();
                }
            } else if (i2 == 0) {
                this.nodeStack.push((LLRBValueNode) lLRBNode);
                return;
            } else {
                this.nodeStack.push((LLRBValueNode) lLRBNode);
                if (z) {
                    lLRBNode = lLRBNode.getRight();
                } else {
                    lLRBNode = lLRBNode.getLeft();
                }
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.nodeStack.size() > 0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        try {
            LLRBValueNode<K, V> pop = this.nodeStack.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(pop.getKey(), pop.getValue());
            if (this.isReverse) {
                for (LLRBNode<K, V> left = pop.getLeft(); !left.isEmpty(); left = left.getRight()) {
                    this.nodeStack.push((LLRBValueNode) left);
                }
            } else {
                for (LLRBNode<K, V> right = pop.getRight(); !right.isEmpty(); right = right.getLeft()) {
                    this.nodeStack.push((LLRBValueNode) right);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }
}
