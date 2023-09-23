package g.a.v0;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* compiled from: AtomicBackoff.java */
/* loaded from: classes2.dex */
public final class i {
    public static final Logger c = Logger.getLogger(i.class.getName());
    public final String a;
    public final AtomicLong b;

    /* compiled from: AtomicBackoff.java */
    /* loaded from: classes2.dex */
    public final class b {
        public final long a;

        public b(long j2, a aVar) {
            this.a = j2;
        }
    }

    public i(String str, long j2) {
        AtomicLong atomicLong = new AtomicLong();
        this.b = atomicLong;
        f.h.b.c.a.m(j2 > 0, "value must be positive");
        this.a = str;
        atomicLong.set(j2);
    }
}
