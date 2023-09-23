package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import f.h.b.a.i.w.h.q;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class SchedulerConfig {

    /* loaded from: classes.dex */
    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0004a {
            public abstract a a();

            public abstract AbstractC0004a b(long j2);

            public abstract AbstractC0004a c(long j2);
        }

        public static AbstractC0004a a() {
            q.b bVar = new q.b();
            Set<Flag> emptySet = Collections.emptySet();
            Objects.requireNonNull(emptySet, "Null flags");
            bVar.c = emptySet;
            return bVar;
        }

        public abstract long b();

        public abstract Set<Flag> c();

        public abstract long d();
    }

    public abstract f.h.b.a.i.y.a a();

    public long b(Priority priority, long j2, int i2) {
        int i3;
        long time = j2 - a().getTime();
        a aVar = c().get(priority);
        long b = aVar.b();
        return Math.min(Math.max((long) (Math.pow(3.0d, i2 - 1) * b * Math.max(1.0d, Math.log(10000.0d) / Math.log((b > 1 ? b : 2L) * i3))), time), aVar.d());
    }

    public abstract Map<Priority, a> c();
}
