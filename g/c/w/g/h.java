package g.c.w.g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SchedulerPoolFactory.java */
/* loaded from: classes2.dex */
public final class h {
    public static final boolean a;
    public static final int b;
    public static final AtomicReference<ScheduledExecutorService> c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    public static final Map<ScheduledThreadPoolExecutor, Object> f8535d = new ConcurrentHashMap();

    /* compiled from: SchedulerPoolFactory.java */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(h.f8535d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    h.f8535d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[LOOP:0: B:14:0x003f->B:20:0x006a, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[ORIG_RETURN, RETURN] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            g.c.w.g.h.c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            g.c.w.g.h.f8535d = r0
            java.util.Properties r0 = java.lang.System.getProperties()
            java.lang.String r1 = "rx2.purge-enabled"
            boolean r2 = r0.containsKey(r1)
            r3 = 1
            if (r2 == 0) goto L24
            java.lang.String r1 = r0.getProperty(r1)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            goto L25
        L24:
            r1 = 1
        L25:
            if (r1 == 0) goto L38
            java.lang.String r2 = "rx2.purge-period-seconds"
            boolean r4 = r0.containsKey(r2)
            if (r4 == 0) goto L38
            java.lang.String r0 = r0.getProperty(r2)     // Catch: java.lang.NumberFormatException -> L38
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L38
            goto L39
        L38:
            r0 = 1
        L39:
            g.c.w.g.h.a = r1
            g.c.w.g.h.b = r0
            if (r1 == 0) goto L6e
        L3f:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r0 = g.c.w.g.h.c
            java.lang.Object r1 = r0.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            if (r1 == 0) goto L4a
            goto L6e
        L4a:
            g.c.w.g.e r2 = new g.c.w.g.e
            java.lang.String r4 = "RxSchedulerPurge"
            r2.<init>(r4)
            java.util.concurrent.ScheduledExecutorService r5 = java.util.concurrent.Executors.newScheduledThreadPool(r3, r2)
            boolean r0 = r0.compareAndSet(r1, r5)
            if (r0 == 0) goto L6a
            g.c.w.g.h$a r6 = new g.c.w.g.h$a
            r6.<init>()
            int r0 = g.c.w.g.h.b
            long r9 = (long) r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r7 = r9
            r5.scheduleAtFixedRate(r6, r7, r9, r11)
            goto L6e
        L6a:
            r5.shutdownNow()
            goto L3f
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.w.g.h.<clinit>():void");
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            f8535d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }
}
