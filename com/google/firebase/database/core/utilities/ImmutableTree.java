package com.google.firebase.database.core.utilities;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.StandardComparator;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.snapshot.ChildKey;
import f.a.b.a.a;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ImmutableTree<T> implements Iterable<Map.Entry<Path, T>> {
    private static final ImmutableTree EMPTY;
    private static final ImmutableSortedMap EMPTY_CHILDREN;
    private final ImmutableSortedMap<ChildKey, ImmutableTree<T>> children;
    private final T value;

    /* loaded from: classes2.dex */
    public interface TreeVisitor<T, R> {
        R onNodeValue(Path path, T t, R r);
    }

    static {
        ImmutableSortedMap emptyMap = ImmutableSortedMap.Builder.emptyMap(StandardComparator.getComparator(ChildKey.class));
        EMPTY_CHILDREN = emptyMap;
        EMPTY = new ImmutableTree(null, emptyMap);
    }

    public ImmutableTree(T t, ImmutableSortedMap<ChildKey, ImmutableTree<T>> immutableSortedMap) {
        this.value = t;
        this.children = immutableSortedMap;
    }

    public static <V> ImmutableTree<V> emptyInstance() {
        return EMPTY;
    }

    public boolean containsMatchingValue(Predicate<? super T> predicate) {
        Object obj = (T) this.value;
        if (obj == null || !predicate.evaluate(obj)) {
            Iterator<Map.Entry<ChildKey, ImmutableTree<T>>> it = this.children.iterator();
            while (it.hasNext()) {
                if (it.next().getValue().containsMatchingValue(predicate)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ImmutableTree.class != obj.getClass()) {
            return false;
        }
        ImmutableTree immutableTree = (ImmutableTree) obj;
        ImmutableSortedMap<ChildKey, ImmutableTree<T>> immutableSortedMap = this.children;
        if (immutableSortedMap == null ? immutableTree.children == null : immutableSortedMap.equals(immutableTree.children)) {
            T t = this.value;
            T t2 = immutableTree.value;
            return t == null ? t2 == null : t.equals(t2);
        }
        return false;
    }

    public Path findRootMostMatchingPath(Path path, Predicate<? super T> predicate) {
        ChildKey front;
        ImmutableTree<T> immutableTree;
        Path findRootMostMatchingPath;
        Object obj = (T) this.value;
        if (obj != null && predicate.evaluate(obj)) {
            return Path.getEmptyPath();
        }
        if (path.isEmpty() || (immutableTree = this.children.get((front = path.getFront()))) == null || (findRootMostMatchingPath = immutableTree.findRootMostMatchingPath(path.popFront(), predicate)) == null) {
            return null;
        }
        return new Path(front).child(findRootMostMatchingPath);
    }

    public Path findRootMostPathWithValue(Path path) {
        return findRootMostMatchingPath(path, Predicate.TRUE);
    }

    public <R> R fold(R r, TreeVisitor<? super T, R> treeVisitor) {
        return (R) fold(Path.getEmptyPath(), treeVisitor, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void foreach(TreeVisitor<T, Void> treeVisitor) {
        fold(Path.getEmptyPath(), treeVisitor, null);
    }

    public T get(Path path) {
        if (path.isEmpty()) {
            return this.value;
        }
        ImmutableTree<T> immutableTree = this.children.get(path.getFront());
        if (immutableTree != null) {
            return immutableTree.get(path.popFront());
        }
        return null;
    }

    public ImmutableTree<T> getChild(ChildKey childKey) {
        ImmutableTree<T> immutableTree = this.children.get(childKey);
        return immutableTree != null ? immutableTree : emptyInstance();
    }

    public ImmutableSortedMap<ChildKey, ImmutableTree<T>> getChildren() {
        return this.children;
    }

    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t = this.value;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        ImmutableSortedMap<ChildKey, ImmutableTree<T>> immutableSortedMap = this.children;
        return hashCode + (immutableSortedMap != null ? immutableSortedMap.hashCode() : 0);
    }

    public boolean isEmpty() {
        return this.value == null && this.children.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<Path, T>> iterator() {
        final ArrayList arrayList = new ArrayList();
        foreach(new TreeVisitor<T, Void>() { // from class: com.google.firebase.database.core.utilities.ImmutableTree.2
            @Override // com.google.firebase.database.core.utilities.ImmutableTree.TreeVisitor
            public /* bridge */ /* synthetic */ Void onNodeValue(Path path, Object obj, Void r3) {
                return onNodeValue2(path, (Path) obj, r3);
            }

            /* renamed from: onNodeValue  reason: avoid collision after fix types in other method */
            public Void onNodeValue2(Path path, T t, Void r4) {
                arrayList.add(new AbstractMap.SimpleImmutableEntry(path, t));
                return null;
            }
        });
        return arrayList.iterator();
    }

    public T leafMostValue(Path path) {
        return leafMostValueMatching(path, Predicate.TRUE);
    }

    public T leafMostValueMatching(Path path, Predicate<? super T> predicate) {
        Object obj = (T) this.value;
        T t = (obj == null || !predicate.evaluate(obj)) ? null : this.value;
        Iterator<ChildKey> it = path.iterator();
        ImmutableTree<T> immutableTree = this;
        while (it.hasNext()) {
            immutableTree = immutableTree.children.get(it.next());
            if (immutableTree == null) {
                return t;
            }
            Object obj2 = (T) immutableTree.value;
            if (obj2 != null && predicate.evaluate(obj2)) {
                t = immutableTree.value;
            }
        }
        return t;
    }

    public ImmutableTree<T> remove(Path path) {
        ImmutableSortedMap<ChildKey, ImmutableTree<T>> insert;
        if (path.isEmpty()) {
            if (this.children.isEmpty()) {
                return emptyInstance();
            }
            return new ImmutableTree<>(null, this.children);
        }
        ChildKey front = path.getFront();
        ImmutableTree<T> immutableTree = this.children.get(front);
        if (immutableTree != null) {
            ImmutableTree<T> remove = immutableTree.remove(path.popFront());
            if (remove.isEmpty()) {
                insert = this.children.remove(front);
            } else {
                insert = this.children.insert(front, remove);
            }
            if (this.value == null && insert.isEmpty()) {
                return emptyInstance();
            }
            return new ImmutableTree<>(this.value, insert);
        }
        return this;
    }

    public T rootMostValue(Path path) {
        return rootMostValueMatching(path, Predicate.TRUE);
    }

    public T rootMostValueMatching(Path path, Predicate<? super T> predicate) {
        Object obj = (T) this.value;
        if (obj != null && predicate.evaluate(obj)) {
            return this.value;
        }
        Iterator<ChildKey> it = path.iterator();
        ImmutableTree<T> immutableTree = this;
        while (it.hasNext()) {
            immutableTree = immutableTree.children.get(it.next());
            if (immutableTree == null) {
                return null;
            }
            Object obj2 = (T) immutableTree.value;
            if (obj2 != null && predicate.evaluate(obj2)) {
                return immutableTree.value;
            }
        }
        return null;
    }

    public ImmutableTree<T> set(Path path, T t) {
        if (path.isEmpty()) {
            return new ImmutableTree<>(t, this.children);
        }
        ChildKey front = path.getFront();
        ImmutableTree<T> immutableTree = this.children.get(front);
        if (immutableTree == null) {
            immutableTree = emptyInstance();
        }
        return new ImmutableTree<>(this.value, this.children.insert(front, immutableTree.set(path.popFront(), t)));
    }

    public ImmutableTree<T> setTree(Path path, ImmutableTree<T> immutableTree) {
        ImmutableSortedMap<ChildKey, ImmutableTree<T>> insert;
        if (path.isEmpty()) {
            return immutableTree;
        }
        ChildKey front = path.getFront();
        ImmutableTree<T> immutableTree2 = this.children.get(front);
        if (immutableTree2 == null) {
            immutableTree2 = emptyInstance();
        }
        ImmutableTree<T> tree = immutableTree2.setTree(path.popFront(), immutableTree);
        if (tree.isEmpty()) {
            insert = this.children.remove(front);
        } else {
            insert = this.children.insert(front, tree);
        }
        return new ImmutableTree<>(this.value, insert);
    }

    public ImmutableTree<T> subtree(Path path) {
        if (path.isEmpty()) {
            return this;
        }
        ImmutableTree<T> immutableTree = this.children.get(path.getFront());
        if (immutableTree != null) {
            return immutableTree.subtree(path.popFront());
        }
        return emptyInstance();
    }

    public String toString() {
        StringBuilder A = a.A("ImmutableTree { value=");
        A.append(getValue());
        A.append(", children={");
        Iterator<Map.Entry<ChildKey, ImmutableTree<T>>> it = this.children.iterator();
        while (it.hasNext()) {
            Map.Entry<ChildKey, ImmutableTree<T>> next = it.next();
            A.append(next.getKey().asString());
            A.append("=");
            A.append(next.getValue());
        }
        A.append("} }");
        return A.toString();
    }

    public Collection<T> values() {
        final ArrayList arrayList = new ArrayList();
        foreach(new TreeVisitor<T, Void>() { // from class: com.google.firebase.database.core.utilities.ImmutableTree.1
            @Override // com.google.firebase.database.core.utilities.ImmutableTree.TreeVisitor
            public /* bridge */ /* synthetic */ Void onNodeValue(Path path, Object obj, Void r3) {
                return onNodeValue2(path, (Path) obj, r3);
            }

            /* renamed from: onNodeValue  reason: avoid collision after fix types in other method */
            public Void onNodeValue2(Path path, T t, Void r3) {
                arrayList.add(t);
                return null;
            }
        });
        return arrayList;
    }

    private <R> R fold(Path path, TreeVisitor<? super T, R> treeVisitor, R r) {
        Iterator<Map.Entry<ChildKey, ImmutableTree<T>>> it = this.children.iterator();
        while (it.hasNext()) {
            Map.Entry<ChildKey, ImmutableTree<T>> next = it.next();
            r = (R) next.getValue().fold(path.child(next.getKey()), treeVisitor, r);
        }
        Object obj = this.value;
        return obj != null ? treeVisitor.onNodeValue(path, obj, r) : r;
    }

    public ImmutableTree(T t) {
        this(t, EMPTY_CHILDREN);
    }
}
