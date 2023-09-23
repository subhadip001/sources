package e.v;

import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: InvalidationLiveDataContainer.java */
/* loaded from: classes.dex */
public class e {
    public final Set<LiveData> a = Collections.newSetFromMap(new IdentityHashMap());
    public final RoomDatabase b;

    public e(RoomDatabase roomDatabase) {
        this.b = roomDatabase;
    }
}
