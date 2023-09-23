package f.h.b.a.i.z;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* compiled from: PriorityMapping.java */
/* loaded from: classes.dex */
public final class a {
    public static SparseArray<Priority> a = new SparseArray<>();
    public static HashMap<Priority, Integer> b;

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        b.put(Priority.VERY_LOW, 1);
        b.put(Priority.HIGHEST, 2);
        for (Priority priority : b.keySet()) {
            a.append(b.get(priority).intValue(), priority);
        }
    }

    public static int a(Priority priority) {
        Integer num = b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    public static Priority b(int i2) {
        Priority priority = a.get(i2);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(f.a.b.a.a.i("Unknown Priority for value ", i2));
    }
}
