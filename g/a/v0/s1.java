package g.a.v0;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: ManagedChannelOrphanWrapper.java */
/* loaded from: classes2.dex */
public final class s1 extends q0 {
    public static final ReferenceQueue<s1> b = new ReferenceQueue<>();
    public static final ConcurrentMap<a, a> c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f7904d = Logger.getLogger(s1.class.getName());

    /* compiled from: ManagedChannelOrphanWrapper.java */
    /* loaded from: classes2.dex */
    public static final class a extends WeakReference<s1> {

        /* renamed from: f  reason: collision with root package name */
        public static final boolean f7905f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* renamed from: g  reason: collision with root package name */
        public static final RuntimeException f7906g;
        public final ReferenceQueue<s1> a;
        public final ConcurrentMap<a, a> b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final Reference<RuntimeException> f7907d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicBoolean f7908e;

        static {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            f7906g = runtimeException;
        }

        public a(s1 s1Var, g.a.f0 f0Var, ReferenceQueue<s1> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
            super(s1Var, referenceQueue);
            RuntimeException runtimeException;
            this.f7908e = new AtomicBoolean();
            if (f7905f) {
                runtimeException = new RuntimeException("ManagedChannel allocation site");
            } else {
                runtimeException = f7906g;
            }
            this.f7907d = new SoftReference(runtimeException);
            this.c = f0Var.toString();
            this.a = referenceQueue;
            this.b = concurrentMap;
            concurrentMap.put(this, this);
            a(referenceQueue);
        }

        public static int a(ReferenceQueue<s1> referenceQueue) {
            int i2 = 0;
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return i2;
                }
                RuntimeException runtimeException = aVar.f7907d.get();
                super.clear();
                aVar.b.remove(aVar);
                aVar.f7907d.clear();
                if (!aVar.f7908e.get()) {
                    i2++;
                    Level level = Level.SEVERE;
                    Logger logger = s1.f7904d;
                    if (logger.isLoggable(level)) {
                        StringBuilder A = f.a.b.a.a.A("*~*~*~ Channel {0} was not shutdown properly!!! ~*~*~*");
                        A.append(System.getProperty("line.separator"));
                        A.append("    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        LogRecord logRecord = new LogRecord(level, A.toString());
                        logRecord.setLoggerName(logger.getName());
                        logRecord.setParameters(new Object[]{aVar.c});
                        logRecord.setThrown(runtimeException);
                        logger.log(logRecord);
                    }
                }
            }
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            super.clear();
            this.b.remove(this);
            this.f7907d.clear();
            a(this.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(g.a.f0 f0Var) {
        super(f0Var);
        ReferenceQueue<s1> referenceQueue = b;
        ConcurrentMap<a, a> concurrentMap = c;
        new a(this, f0Var, referenceQueue, concurrentMap);
    }
}
