package com.google.firebase.database.core.operation;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.operation.Operation;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.Node;

/* loaded from: classes2.dex */
public class Overwrite extends Operation {
    private final Node snapshot;

    public Overwrite(OperationSource operationSource, Path path, Node node) {
        super(Operation.OperationType.Overwrite, operationSource, path);
        this.snapshot = node;
    }

    public Node getSnapshot() {
        return this.snapshot;
    }

    @Override // com.google.firebase.database.core.operation.Operation
    public Operation operationForChild(ChildKey childKey) {
        if (this.path.isEmpty()) {
            return new Overwrite(this.source, Path.getEmptyPath(), this.snapshot.getImmediateChild(childKey));
        }
        return new Overwrite(this.source, this.path.popFront(), this.snapshot);
    }

    public String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", getPath(), getSource(), this.snapshot);
    }
}
