package k.c0.i;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.c0.i.m;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: Http2Connection.java */
/* loaded from: classes2.dex */
public final class e implements Closeable {
    public static final ExecutorService z;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8999f;

    /* renamed from: g  reason: collision with root package name */
    public final d f9000g;

    /* renamed from: i  reason: collision with root package name */
    public final String f9002i;

    /* renamed from: j  reason: collision with root package name */
    public int f9003j;

    /* renamed from: k  reason: collision with root package name */
    public int f9004k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f9005l;

    /* renamed from: m  reason: collision with root package name */
    public final ScheduledExecutorService f9006m;
    public final ExecutorService n;
    public final q o;
    public boolean p;
    public long r;
    public final r t;
    public boolean u;
    public final Socket v;
    public final o w;
    public final f x;
    public final Set<Integer> y;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Integer, n> f9001h = new LinkedHashMap();
    public long q = 0;
    public r s = new r();

    /* compiled from: Http2Connection.java */
    /* loaded from: classes2.dex */
    public class a extends k.c0.b {

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f9007g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ ErrorCode f9008h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i2, ErrorCode errorCode) {
            super(str, objArr);
            this.f9007g = i2;
            this.f9008h = errorCode;
        }

        @Override // k.c0.b
        public void a() {
            try {
                e eVar = e.this;
                eVar.w.p(this.f9007g, this.f9008h);
            } catch (IOException unused) {
                e.a(e.this);
            }
        }
    }

    /* compiled from: Http2Connection.java */
    /* loaded from: classes2.dex */
    public class b extends k.c0.b {

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f9010g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ long f9011h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i2, long j2) {
            super(str, objArr);
            this.f9010g = i2;
            this.f9011h = j2;
        }

        @Override // k.c0.b
        public void a() {
            try {
                e.this.w.B(this.f9010g, this.f9011h);
            } catch (IOException unused) {
                e.a(e.this);
            }
        }
    }

    /* compiled from: Http2Connection.java */
    /* loaded from: classes2.dex */
    public static class c {
        public Socket a;
        public String b;
        public l.h c;

        /* renamed from: d  reason: collision with root package name */
        public l.g f9013d;

        /* renamed from: e  reason: collision with root package name */
        public d f9014e = d.a;

        /* renamed from: f  reason: collision with root package name */
        public int f9015f;

        public c(boolean z) {
        }
    }

    /* compiled from: Http2Connection.java */
    /* loaded from: classes2.dex */
    public static abstract class d {
        public static final d a = new a();

        /* compiled from: Http2Connection.java */
        /* loaded from: classes2.dex */
        public class a extends d {
            @Override // k.c0.i.e.d
            public void b(n nVar) {
                nVar.c(ErrorCode.REFUSED_STREAM);
            }
        }

        public void a(e eVar) {
        }

        public abstract void b(n nVar);
    }

    /* compiled from: Http2Connection.java */
    /* renamed from: k.c0.i.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0233e extends k.c0.b {

        /* renamed from: g  reason: collision with root package name */
        public final boolean f9016g;

        /* renamed from: h  reason: collision with root package name */
        public final int f9017h;

        /* renamed from: i  reason: collision with root package name */
        public final int f9018i;

        public C0233e(boolean z, int i2, int i3) {
            super("OkHttp %s ping %08x%08x", e.this.f9002i, Integer.valueOf(i2), Integer.valueOf(i3));
            this.f9016g = z;
            this.f9017h = i2;
            this.f9018i = i3;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:2|(2:d|(3:9|10|11))|18|19|10|11) */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
            r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
            r0.f(r1, r1);
         */
        @Override // k.c0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a() {
            /*
                r6 = this;
                k.c0.i.e r0 = k.c0.i.e.this
                boolean r1 = r6.f9016g
                int r2 = r6.f9017h
                int r3 = r6.f9018i
                java.util.Objects.requireNonNull(r0)
                if (r1 != 0) goto L1f
                monitor-enter(r0)
                boolean r4 = r0.p     // Catch: java.lang.Throwable -> L1c
                r5 = 1
                r0.p = r5     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
                if (r4 == 0) goto L1f
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.io.IOException -> L2a
                r0.f(r1, r1)     // Catch: java.io.IOException -> L2a
                goto L2a
            L1c:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
                throw r1
            L1f:
                k.c0.i.o r4 = r0.w     // Catch: java.io.IOException -> L25
                r4.P(r1, r2, r3)     // Catch: java.io.IOException -> L25
                goto L2a
            L25:
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch: java.io.IOException -> L2a
                r0.f(r1, r1)     // Catch: java.io.IOException -> L2a
            L2a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k.c0.i.e.C0233e.a():void");
        }
    }

    /* compiled from: Http2Connection.java */
    /* loaded from: classes2.dex */
    public class f extends k.c0.b implements m.b {

        /* renamed from: g  reason: collision with root package name */
        public final m f9020g;

        public f(m mVar) {
            super("OkHttp %s", e.this.f9002i);
            this.f9020g = mVar;
        }

        @Override // k.c0.b
        public void a() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    this.f9020g.g(this);
                    while (this.f9020g.f(false, this)) {
                    }
                    errorCode = ErrorCode.NO_ERROR;
                } catch (IOException unused) {
                    errorCode = errorCode2;
                } catch (Throwable th) {
                    th = th;
                    errorCode = errorCode2;
                    try {
                        e.this.f(errorCode, errorCode2);
                    } catch (IOException unused2) {
                    }
                    k.c0.c.d(this.f9020g);
                    throw th;
                }
                try {
                    try {
                        e.this.f(errorCode, ErrorCode.CANCEL);
                    } catch (Throwable th2) {
                        th = th2;
                        e.this.f(errorCode, errorCode2);
                        k.c0.c.d(this.f9020g);
                        throw th;
                    }
                } catch (IOException unused3) {
                    ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                    e.this.f(errorCode3, errorCode3);
                    k.c0.c.d(this.f9020g);
                }
            } catch (IOException unused4) {
            }
            k.c0.c.d(this.f9020g);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = k.c0.c.a;
        z = new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, timeUnit, synchronousQueue, new k.c0.d("OkHttp Http2Connection", true));
    }

    public e(c cVar) {
        r rVar = new r();
        this.t = rVar;
        this.u = false;
        this.y = new LinkedHashSet();
        this.o = q.a;
        this.f8999f = true;
        this.f9000g = cVar.f9014e;
        this.f9004k = 1;
        this.f9004k = 3;
        this.s.b(7, 16777216);
        String str = cVar.b;
        this.f9002i = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new k.c0.d(k.c0.c.l("OkHttp %s Writer", str), false));
        this.f9006m = scheduledThreadPoolExecutor;
        if (cVar.f9015f != 0) {
            C0233e c0233e = new C0233e(false, 0, 0);
            long j2 = cVar.f9015f;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(c0233e, j2, j2, TimeUnit.MILLISECONDS);
        }
        this.n = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new k.c0.d(k.c0.c.l("OkHttp %s Push Observer", str), true));
        rVar.b(7, 65535);
        rVar.b(5, 16384);
        this.r = rVar.a();
        this.v = cVar.a;
        this.w = new o(cVar.f9013d, true);
        this.x = new f(new m(cVar.c, true));
    }

    public static void a(e eVar) {
        Objects.requireNonNull(eVar);
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            eVar.f(errorCode, errorCode);
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.w.f9077i);
        r6 = r3;
        r8.r -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C(int r9, boolean r10, l.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            k.c0.i.o r12 = r8.w
            r12.x(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L5e
            monitor-enter(r8)
        L12:
            long r3 = r8.r     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L30
            java.util.Map<java.lang.Integer, k.c0.i.n> r3 = r8.f9001h     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            if (r3 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            throw r9     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
        L30:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L54
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L54
            k.c0.i.o r3 = r8.w     // Catch: java.lang.Throwable -> L54
            int r3 = r3.f9077i     // Catch: java.lang.Throwable -> L54
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L54
            long r4 = r8.r     // Catch: java.lang.Throwable -> L54
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L54
            long r4 = r4 - r6
            r8.r = r4     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            long r12 = r12 - r6
            k.c0.i.o r4 = r8.w
            if (r10 == 0) goto L4f
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = 0
        L50:
            r4.x(r5, r9, r11, r3)
            goto Ld
        L54:
            r9 = move-exception
            goto L5c
        L56:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L54
            r9.<init>()     // Catch: java.lang.Throwable -> L54
            throw r9     // Catch: java.lang.Throwable -> L54
        L5c:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            throw r9
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.c0.i.e.C(int, boolean, l.f, long):void");
    }

    public void F(int i2, ErrorCode errorCode) {
        try {
            this.f9006m.execute(new a("OkHttp %s stream %d", new Object[]{this.f9002i, Integer.valueOf(i2)}, i2, errorCode));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void M(int i2, long j2) {
        try {
            this.f9006m.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f9002i, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public void f(ErrorCode errorCode, ErrorCode errorCode2) {
        n[] nVarArr = null;
        try {
            v(errorCode);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.f9001h.isEmpty()) {
                nVarArr = (n[]) this.f9001h.values().toArray(new n[this.f9001h.size()]);
                this.f9001h.clear();
            }
        }
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                try {
                    nVar.c(errorCode2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.w.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.v.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.f9006m.shutdown();
        this.n.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public void flush() {
        this.w.flush();
    }

    public synchronized n g(int i2) {
        return this.f9001h.get(Integer.valueOf(i2));
    }

    public synchronized int l() {
        int i2;
        r rVar = this.t;
        i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if ((rVar.a & 16) != 0) {
            i2 = rVar.b[4];
        }
        return i2;
    }

    public boolean p(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public synchronized n q(int i2) {
        n remove;
        remove = this.f9001h.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    public void v(ErrorCode errorCode) {
        synchronized (this.w) {
            synchronized (this) {
                if (this.f9005l) {
                    return;
                }
                this.f9005l = true;
                this.w.g(this.f9003j, errorCode, k.c0.c.a);
            }
        }
    }
}
