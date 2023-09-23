package f.h.b.a.i.w.h;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* loaded from: classes.dex */
public final class q extends SchedulerConfig.a {
    public final long a;
    public final long b;
    public final Set<SchedulerConfig.Flag> c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    /* loaded from: classes.dex */
    public static final class b extends SchedulerConfig.a.AbstractC0004a {
        public Long a;
        public Long b;
        public Set<SchedulerConfig.Flag> c;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a.AbstractC0004a
        public SchedulerConfig.a a() {
            String str = this.a == null ? " delta" : "";
            if (this.b == null) {
                str = f.a.b.a.a.p(str, " maxAllowedDelay");
            }
            if (this.c == null) {
                str = f.a.b.a.a.p(str, " flags");
            }
            if (str.isEmpty()) {
                return new q(this.a.longValue(), this.b.longValue(), this.c, null);
            }
            throw new IllegalStateException(f.a.b.a.a.p("Missing required properties:", str));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a.AbstractC0004a
        public SchedulerConfig.a.AbstractC0004a b(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a.AbstractC0004a
        public SchedulerConfig.a.AbstractC0004a c(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }
    }

    public q(long j2, long j3, Set set, a aVar) {
        this.a = j2;
        this.b = j3;
        this.c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a
    public long b() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a
    public Set<SchedulerConfig.Flag> c() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SchedulerConfig.a) {
            SchedulerConfig.a aVar = (SchedulerConfig.a) obj;
            return this.a == aVar.b() && this.b == aVar.d() && this.c.equals(aVar.c());
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        return this.c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("ConfigValue{delta=");
        A.append(this.a);
        A.append(", maxAllowedDelay=");
        A.append(this.b);
        A.append(", flags=");
        A.append(this.c);
        A.append("}");
        return A.toString();
    }
}
