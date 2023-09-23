package g.c.w.g;

import g.c.o;
import java.util.concurrent.ThreadFactory;

/* compiled from: NewThreadScheduler.java */
/* loaded from: classes2.dex */
public final class c extends o {
    public static final e b = new e("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    public final ThreadFactory a = b;

    @Override // g.c.o
    public o.b a() {
        return new d(this.a);
    }
}
