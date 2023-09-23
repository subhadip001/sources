package com.google.firebase.database.core.view;

import com.google.firebase.database.core.Path;

/* loaded from: classes2.dex */
public interface Event {

    /* loaded from: classes2.dex */
    public enum EventType {
        CHILD_REMOVED,
        CHILD_ADDED,
        CHILD_MOVED,
        CHILD_CHANGED,
        VALUE
    }

    void fire();

    Path getPath();

    String toString();
}
