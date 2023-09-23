package com.google.firebase.database.collection;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.LLRBNode;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ImmutableSortedMap<K, V> implements Iterable<Map.Entry<K, V>> {

    /* loaded from: classes2.dex */
    public static class Builder {
        public static final int ARRAY_TO_RB_TREE_SIZE_THRESHOLD = 25;
        private static final KeyTranslator IDENTITY_TRANSLATOR = new KeyTranslator() { // from class: f.h.e.j.c.a
            @Override // com.google.firebase.database.collection.ImmutableSortedMap.Builder.KeyTranslator
            public final Object translate(Object obj) {
                int i2 = ImmutableSortedMap.Builder.ARRAY_TO_RB_TREE_SIZE_THRESHOLD;
                return obj;
            }
        };

        /* loaded from: classes2.dex */
        public interface KeyTranslator<C, D> {
            D translate(C c);
        }

        public static <A, B, C> ImmutableSortedMap<A, C> buildFrom(List<A> list, Map<B, C> map, KeyTranslator<A, B> keyTranslator, Comparator<A> comparator) {
            if (list.size() < 25) {
                return ArraySortedMap.buildFrom(list, map, keyTranslator, comparator);
            }
            return RBTreeSortedMap.buildFrom(list, map, keyTranslator, comparator);
        }

        public static <K, V> ImmutableSortedMap<K, V> emptyMap(Comparator<K> comparator) {
            return new ArraySortedMap(comparator);
        }

        public static <A, B> ImmutableSortedMap<A, B> fromMap(Map<A, B> map, Comparator<A> comparator) {
            if (map.size() < 25) {
                return ArraySortedMap.fromMap(map, comparator);
            }
            return RBTreeSortedMap.fromMap(map, comparator);
        }

        public static <A> KeyTranslator<A, A> identityTranslator() {
            return IDENTITY_TRANSLATOR;
        }
    }

    public abstract boolean containsKey(K k2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImmutableSortedMap) {
            ImmutableSortedMap immutableSortedMap = (ImmutableSortedMap) obj;
            if (getComparator().equals(immutableSortedMap.getComparator()) && size() == immutableSortedMap.size()) {
                Iterator<Map.Entry<K, V>> it = iterator();
                Iterator<Map.Entry<K, V>> it2 = immutableSortedMap.iterator();
                while (it.hasNext()) {
                    if (!it.next().equals(it2.next())) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public abstract V get(K k2);

    public abstract Comparator<K> getComparator();

    public abstract K getMaxKey();

    public abstract K getMinKey();

    public abstract K getPredecessorKey(K k2);

    public abstract K getSuccessorKey(K k2);

    public int hashCode() {
        int hashCode = getComparator().hashCode();
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + it.next().hashCode();
        }
        return hashCode;
    }

    public abstract void inOrderTraversal(LLRBNode.NodeVisitor<K, V> nodeVisitor);

    public abstract int indexOf(K k2);

    public abstract ImmutableSortedMap<K, V> insert(K k2, V v);

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    public abstract Iterator<Map.Entry<K, V>> iterator();

    public abstract Iterator<Map.Entry<K, V>> iteratorFrom(K k2);

    public abstract ImmutableSortedMap<K, V> remove(K k2);

    public abstract Iterator<Map.Entry<K, V>> reverseIterator();

    public abstract Iterator<Map.Entry<K, V>> reverseIteratorFrom(K k2);

    public abstract int size();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator<Map.Entry<K, V>> it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(next.getKey());
            sb.append("=>");
            sb.append(next.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }
}
