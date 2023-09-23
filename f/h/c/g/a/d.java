package f.h.c.g.a;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ThreadFactoryBuilder.java */
/* loaded from: classes.dex */
public class d implements ThreadFactory {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f6027f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f6028g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AtomicLong f6029h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Boolean f6030i;

    public d(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6027f = threadFactory;
        this.f6028g = str;
        this.f6029h = atomicLong;
        this.f6030i = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f6027f.newThread(runnable);
        String str = this.f6028g;
        if (str != null) {
            AtomicLong atomicLong = this.f6029h;
            Objects.requireNonNull(atomicLong);
            newThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        Boolean bool = this.f6030i;
        if (bool != null) {
            newThread.setDaemon(bool.booleanValue());
        }
        return newThread;
    }
}
