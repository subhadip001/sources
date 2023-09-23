package f.a.a.a;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class r implements ThreadFactory {

    /* renamed from: f  reason: collision with root package name */
    public final ThreadFactory f3076f = Executors.defaultThreadFactory();

    /* renamed from: g  reason: collision with root package name */
    public final AtomicInteger f3077g = new AtomicInteger(1);

    public r(d dVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f3076f.newThread(runnable);
        int andIncrement = this.f3077g.getAndIncrement();
        StringBuilder sb = new StringBuilder(30);
        sb.append("PlayBillingLibrary-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
