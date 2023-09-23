package com.google.firebase.database.core.view.filter;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.Change;
import com.google.firebase.database.core.view.filter.NodeFilter;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.Index;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;

/* loaded from: classes2.dex */
public class IndexedFilter implements NodeFilter {
    private final Index index;

    public IndexedFilter(Index index) {
        this.index = index;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public boolean filtersNodes() {
        return false;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public Index getIndex() {
        return this.index;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public NodeFilter getIndexedFilter() {
        return this;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public IndexedNode updateChild(IndexedNode indexedNode, ChildKey childKey, Node node, Path path, NodeFilter.CompleteChildSource completeChildSource, ChildChangeAccumulator childChangeAccumulator) {
        Utilities.hardAssert(indexedNode.hasIndex(this.index), "The index must match the filter");
        Node node2 = indexedNode.getNode();
        Node immediateChild = node2.getImmediateChild(childKey);
        if (immediateChild.getChild(path).equals(node.getChild(path)) && immediateChild.isEmpty() == node.isEmpty()) {
            return indexedNode;
        }
        if (childChangeAccumulator != null) {
            if (node.isEmpty()) {
                if (node2.hasChild(childKey)) {
                    childChangeAccumulator.trackChildChange(Change.childRemovedChange(childKey, immediateChild));
                } else {
                    Utilities.hardAssert(node2.isLeafNode(), "A child remove without an old child only makes sense on a leaf node");
                }
            } else if (immediateChild.isEmpty()) {
                childChangeAccumulator.trackChildChange(Change.childAddedChange(childKey, node));
            } else {
                childChangeAccumulator.trackChildChange(Change.childChangedChange(childKey, node, immediateChild));
            }
        }
        return (node2.isLeafNode() && node.isEmpty()) ? indexedNode : indexedNode.updateChild(childKey, node);
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public IndexedNode updateFullNode(IndexedNode indexedNode, IndexedNode indexedNode2, ChildChangeAccumulator childChangeAccumulator) {
        Utilities.hardAssert(indexedNode2.hasIndex(this.index), "Can't use IndexedNode that doesn't have filter's index");
        if (childChangeAccumulator != null) {
            for (NamedNode namedNode : indexedNode.getNode()) {
                if (!indexedNode2.getNode().hasChild(namedNode.getName())) {
                    childChangeAccumulator.trackChildChange(Change.childRemovedChange(namedNode.getName(), namedNode.getNode()));
                }
            }
            if (!indexedNode2.getNode().isLeafNode()) {
                for (NamedNode namedNode2 : indexedNode2.getNode()) {
                    if (indexedNode.getNode().hasChild(namedNode2.getName())) {
                        Node immediateChild = indexedNode.getNode().getImmediateChild(namedNode2.getName());
                        if (!immediateChild.equals(namedNode2.getNode())) {
                            childChangeAccumulator.trackChildChange(Change.childChangedChange(namedNode2.getName(), namedNode2.getNode(), immediateChild));
                        }
                    } else {
                        childChangeAccumulator.trackChildChange(Change.childAddedChange(namedNode2.getName(), namedNode2.getNode()));
                    }
                }
            }
        }
        return indexedNode2;
    }

    @Override // com.google.firebase.database.core.view.filter.NodeFilter
    public IndexedNode updatePriority(IndexedNode indexedNode, Node node) {
        return indexedNode.getNode().isEmpty() ? indexedNode : indexedNode.updatePriority(node);
    }
}