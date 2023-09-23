package androidx.lifecycle;

import e.s.l;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class Lifecycle {

    /* loaded from: classes.dex */
    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static Event downFrom(State state) {
            int ordinal = state.ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                    return ON_PAUSE;
                }
                return ON_STOP;
            }
            return ON_DESTROY;
        }

        public static Event downTo(State state) {
            int ordinal = state.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return null;
                    }
                    return ON_PAUSE;
                }
                return ON_STOP;
            }
            return ON_DESTROY;
        }

        public static Event upFrom(State state) {
            int ordinal = state.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return null;
                    }
                    return ON_RESUME;
                }
                return ON_START;
            }
            return ON_CREATE;
        }

        public static Event upTo(State state) {
            int ordinal = state.ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                    return ON_RESUME;
                }
                return ON_START;
            }
            return ON_CREATE;
        }

        public State getTargetState() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return State.RESUMED;
                    }
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return State.DESTROYED;
                            }
                            throw new IllegalArgumentException(this + " has no target state");
                        }
                    }
                }
                return State.STARTED;
            }
            return State.CREATED;
        }
    }

    /* loaded from: classes.dex */
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean isAtLeast(State state) {
            return compareTo(state) >= 0;
        }
    }

    public Lifecycle() {
        new AtomicReference();
    }

    public abstract void a(l lVar);

    public abstract void b(l lVar);
}
