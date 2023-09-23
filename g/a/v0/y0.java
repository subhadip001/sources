package g.a.v0;

import g.a.v0.w;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Http2Ping.java */
/* loaded from: classes2.dex */
public class y0 {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f7981g = Logger.getLogger(y0.class.getName());
    public final long a;
    public final f.h.c.a.o b;
    public Map<w.a, Executor> c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public boolean f7982d;

    /* renamed from: e  reason: collision with root package name */
    public Throwable f7983e;

    /* renamed from: f  reason: collision with root package name */
    public long f7984f;

    public y0(long j2, f.h.c.a.o oVar) {
        this.a = j2;
        this.b = oVar;
    }

    public static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f7981g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }
}
