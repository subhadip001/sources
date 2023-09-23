package g.a.v0;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AtomicLongCounter.java */
/* loaded from: classes2.dex */
public final class j implements l1 {
    public final AtomicLong a = new AtomicLong();

    @Override // g.a.v0.l1
    public void add(long j2) {
        this.a.getAndAdd(j2);
    }
}
