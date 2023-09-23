package f.h.b.a.i.w.i;

import com.google.logging.type.LogSeverity;

/* compiled from: EventStoreConfig.java */
/* loaded from: classes.dex */
public abstract class b0 {
    public static final b0 a;

    static {
        Long l2 = 10485760L;
        Integer valueOf = Integer.valueOf((int) LogSeverity.INFO_VALUE);
        Integer num = 10000;
        Long l3 = 604800000L;
        Integer num2 = 81920;
        String str = l2 == null ? " maxStorageSizeInBytes" : "";
        if (valueOf == null) {
            str = f.a.b.a.a.p(str, " loadBatchSize");
        }
        if (num == null) {
            str = f.a.b.a.a.p(str, " criticalSectionEnterTimeoutMs");
        }
        if (l3 == null) {
            str = f.a.b.a.a.p(str, " eventCleanUpAge");
        }
        if (num2 == null) {
            str = f.a.b.a.a.p(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            a = new x(l2.longValue(), valueOf.intValue(), num.intValue(), l3.longValue(), num2.intValue(), null);
            return;
        }
        throw new IllegalStateException(f.a.b.a.a.p("Missing required properties:", str));
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
