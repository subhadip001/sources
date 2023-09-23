package com.google.firebase.database;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.Validation;
import com.google.firebase.database.core.utilities.encoding.CustomClassMapper;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.NamedNode;
import f.a.b.a.a;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class DataSnapshot {
    private final IndexedNode node;
    private final DatabaseReference query;

    public DataSnapshot(DatabaseReference databaseReference, IndexedNode indexedNode) {
        this.node = indexedNode;
        this.query = databaseReference;
    }

    public DataSnapshot child(String str) {
        return new DataSnapshot(this.query.child(str), IndexedNode.from(this.node.getNode().getChild(new Path(str))));
    }

    public boolean exists() {
        return !this.node.getNode().isEmpty();
    }

    public Iterable<DataSnapshot> getChildren() {
        final Iterator<NamedNode> it = this.node.iterator();
        return new Iterable<DataSnapshot>() { // from class: com.google.firebase.database.DataSnapshot.1
            @Override // java.lang.Iterable
            public Iterator<DataSnapshot> iterator() {
                return new Iterator<DataSnapshot>() { // from class: com.google.firebase.database.DataSnapshot.1.1
                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException("remove called on immutable collection");
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.Iterator
                    public DataSnapshot next() {
                        NamedNode namedNode = (NamedNode) it.next();
                        return new DataSnapshot(DataSnapshot.this.query.child(namedNode.getName().asString()), IndexedNode.from(namedNode.getNode()));
                    }
                };
            }
        };
    }

    public long getChildrenCount() {
        return this.node.getNode().getChildCount();
    }

    public String getKey() {
        return this.query.getKey();
    }

    public Object getPriority() {
        Object value = this.node.getNode().getPriority().getValue();
        return value instanceof Long ? Double.valueOf(((Long) value).longValue()) : value;
    }

    public DatabaseReference getRef() {
        return this.query;
    }

    public Object getValue() {
        return this.node.getNode().getValue();
    }

    public boolean hasChild(String str) {
        if (this.query.getParent() == null) {
            Validation.validateRootPathString(str);
        } else {
            Validation.validatePathString(str);
        }
        return !this.node.getNode().getChild(new Path(str)).isEmpty();
    }

    public boolean hasChildren() {
        return this.node.getNode().getChildCount() > 0;
    }

    public String toString() {
        StringBuilder A = a.A("DataSnapshot { key = ");
        A.append(this.query.getKey());
        A.append(", value = ");
        A.append(this.node.getNode().getValue(true));
        A.append(" }");
        return A.toString();
    }

    public Object getValue(boolean z) {
        return this.node.getNode().getValue(z);
    }

    public <T> T getValue(Class<T> cls) {
        return (T) CustomClassMapper.convertToCustomClass(this.node.getNode().getValue(), cls);
    }

    public <T> T getValue(GenericTypeIndicator<T> genericTypeIndicator) {
        return (T) CustomClassMapper.convertToCustomClass(this.node.getNode().getValue(), genericTypeIndicator);
    }
}
