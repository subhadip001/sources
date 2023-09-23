package f.h.b.a.i.w;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import f.h.b.a.i.w.h.p;
import f.h.b.a.i.w.h.q;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* loaded from: classes.dex */
public final class f implements Object<SchedulerConfig> {
    public final h.a.a<f.h.b.a.i.y.a> a;

    public f(h.a.a<f.h.b.a.i.y.a> aVar) {
        this.a = aVar;
    }

    public Object get() {
        f.h.b.a.i.y.a aVar = this.a.get();
        HashMap hashMap = new HashMap();
        Priority priority = Priority.DEFAULT;
        SchedulerConfig.a.AbstractC0004a a = SchedulerConfig.a.a();
        a.b(30000L);
        a.c(86400000L);
        hashMap.put(priority, a.a());
        Priority priority2 = Priority.HIGHEST;
        SchedulerConfig.a.AbstractC0004a a2 = SchedulerConfig.a.a();
        a2.b(1000L);
        a2.c(86400000L);
        hashMap.put(priority2, a2.a());
        Priority priority3 = Priority.VERY_LOW;
        SchedulerConfig.a.AbstractC0004a a3 = SchedulerConfig.a.a();
        a3.b(86400000L);
        a3.c(86400000L);
        Set<SchedulerConfig.Flag> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig.Flag.DEVICE_IDLE)));
        q.b bVar = (q.b) a3;
        Objects.requireNonNull(unmodifiableSet, "Null flags");
        bVar.c = unmodifiableSet;
        hashMap.put(priority3, bVar.a());
        Objects.requireNonNull(aVar, "missing required property: clock");
        int size = hashMap.keySet().size();
        Priority.values();
        if (size >= 3) {
            new HashMap();
            return new p(aVar, hashMap);
        }
        throw new IllegalStateException("Not all priorities have been configured");
    }
}
