package com.google.firebase.database.core;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.InternalHelpers;
import com.google.firebase.database.annotations.NotNull;
import com.google.firebase.database.core.view.Change;
import com.google.firebase.database.core.view.DataEvent;
import com.google.firebase.database.core.view.Event;
import com.google.firebase.database.core.view.QuerySpec;

/* loaded from: classes2.dex */
public class ChildEventRegistration extends EventRegistration {
    private final ChildEventListener eventListener;
    private final Repo repo;
    private final QuerySpec spec;

    /* renamed from: com.google.firebase.database.core.ChildEventRegistration$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$database$core$view$Event$EventType;

        static {
            Event.EventType.values();
            int[] iArr = new int[5];
            $SwitchMap$com$google$firebase$database$core$view$Event$EventType = iArr;
            try {
                Event.EventType eventType = Event.EventType.CHILD_ADDED;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$google$firebase$database$core$view$Event$EventType;
                Event.EventType eventType2 = Event.EventType.CHILD_CHANGED;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$google$firebase$database$core$view$Event$EventType;
                Event.EventType eventType3 = Event.EventType.CHILD_MOVED;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$google$firebase$database$core$view$Event$EventType;
                Event.EventType eventType4 = Event.EventType.CHILD_REMOVED;
                iArr4[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ChildEventRegistration(@NotNull Repo repo, @NotNull ChildEventListener childEventListener, @NotNull QuerySpec querySpec) {
        this.repo = repo;
        this.eventListener = childEventListener;
        this.spec = querySpec;
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public EventRegistration clone(QuerySpec querySpec) {
        return new ChildEventRegistration(this.repo, this.eventListener, querySpec);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public DataEvent createEvent(Change change, QuerySpec querySpec) {
        return new DataEvent(change.getEventType(), this, InternalHelpers.createDataSnapshot(InternalHelpers.createReference(this.repo, querySpec.getPath().child(change.getChildKey())), change.getIndexedNode()), change.getPrevName() != null ? change.getPrevName().asString() : null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ChildEventRegistration) {
            ChildEventRegistration childEventRegistration = (ChildEventRegistration) obj;
            if (childEventRegistration.eventListener.equals(this.eventListener) && childEventRegistration.repo.equals(this.repo) && childEventRegistration.spec.equals(this.spec)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public void fireCancelEvent(DatabaseError databaseError) {
        this.eventListener.onCancelled(databaseError);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public void fireEvent(DataEvent dataEvent) {
        if (isZombied()) {
            return;
        }
        int ordinal = dataEvent.getEventType().ordinal();
        if (ordinal == 0) {
            this.eventListener.onChildRemoved(dataEvent.getSnapshot());
        } else if (ordinal == 1) {
            this.eventListener.onChildAdded(dataEvent.getSnapshot(), dataEvent.getPreviousName());
        } else if (ordinal == 2) {
            this.eventListener.onChildMoved(dataEvent.getSnapshot(), dataEvent.getPreviousName());
        } else if (ordinal != 3) {
        } else {
            this.eventListener.onChildChanged(dataEvent.getSnapshot(), dataEvent.getPreviousName());
        }
    }

    @Override // com.google.firebase.database.core.EventRegistration
    @NotNull
    public QuerySpec getQuerySpec() {
        return this.spec;
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public Repo getRepo() {
        return this.repo;
    }

    public int hashCode() {
        int hashCode = this.repo.hashCode();
        return this.spec.hashCode() + ((hashCode + (this.eventListener.hashCode() * 31)) * 31);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public boolean isSameListener(EventRegistration eventRegistration) {
        return (eventRegistration instanceof ChildEventRegistration) && ((ChildEventRegistration) eventRegistration).eventListener.equals(this.eventListener);
    }

    @Override // com.google.firebase.database.core.EventRegistration
    public boolean respondsTo(Event.EventType eventType) {
        return eventType != Event.EventType.VALUE;
    }

    public String toString() {
        return "ChildEventRegistration";
    }
}
