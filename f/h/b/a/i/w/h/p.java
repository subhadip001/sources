package f.h.b.a.i.w.h;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Map;
import java.util.Objects;

/* compiled from: AutoValue_SchedulerConfig.java */
/* loaded from: classes.dex */
public final class p extends SchedulerConfig {
    public final f.h.b.a.i.y.a a;
    public final Map<Priority, SchedulerConfig.a> b;

    public p(f.h.b.a.i.y.a aVar, Map<Priority, SchedulerConfig.a> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public f.h.b.a.i.y.a a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public Map<Priority, SchedulerConfig.a> c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SchedulerConfig) {
            SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
            return this.a.equals(schedulerConfig.a()) && this.b.equals(schedulerConfig.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("SchedulerConfig{clock=");
        A.append(this.a);
        A.append(", values=");
        A.append(this.b);
        A.append("}");
        return A.toString();
    }
}
