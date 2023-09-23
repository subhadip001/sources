package g.a;

import com.google.firebase.messaging.Constants;
import io.grpc.ChannelLogger;
import io.grpc.Status;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: NameResolver.java */
/* loaded from: classes2.dex */
public abstract class k0 {

    /* compiled from: NameResolver.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public final int a;
        public final p0 b;
        public final t0 c;

        /* renamed from: d  reason: collision with root package name */
        public final f f7543d;

        /* renamed from: e  reason: collision with root package name */
        public final ScheduledExecutorService f7544e;

        /* renamed from: f  reason: collision with root package name */
        public final ChannelLogger f7545f;

        /* renamed from: g  reason: collision with root package name */
        public final Executor f7546g;

        public a(Integer num, p0 p0Var, t0 t0Var, f fVar, ScheduledExecutorService scheduledExecutorService, ChannelLogger channelLogger, Executor executor, j0 j0Var) {
            f.h.b.c.a.x(num, "defaultPort not set");
            this.a = num.intValue();
            f.h.b.c.a.x(p0Var, "proxyDetector not set");
            this.b = p0Var;
            f.h.b.c.a.x(t0Var, "syncContext not set");
            this.c = t0Var;
            f.h.b.c.a.x(fVar, "serviceConfigParser not set");
            this.f7543d = fVar;
            this.f7544e = scheduledExecutorService;
            this.f7545f = channelLogger;
            this.f7546g = executor;
        }

        public String toString() {
            f.h.c.a.i c1 = f.h.b.c.a.c1(this);
            c1.a("defaultPort", this.a);
            c1.c("proxyDetector", this.b);
            c1.c("syncContext", this.c);
            c1.c("serviceConfigParser", this.f7543d);
            c1.c("scheduledExecutorService", this.f7544e);
            c1.c("channelLogger", this.f7545f);
            c1.c("executor", this.f7546g);
            return c1.toString();
        }
    }

    /* compiled from: NameResolver.java */
    /* loaded from: classes2.dex */
    public static abstract class c {
        public abstract String a();

        public abstract k0 b(URI uri, a aVar);
    }

    /* compiled from: NameResolver.java */
    /* loaded from: classes2.dex */
    public static abstract class d {
        public abstract void a(Status status);

        public abstract void b(e eVar);
    }

    /* compiled from: NameResolver.java */
    /* loaded from: classes2.dex */
    public static final class e {
        public final List<r> a;
        public final g.a.a b;
        public final b c;

        public e(List<r> list, g.a.a aVar, b bVar) {
            this.a = Collections.unmodifiableList(new ArrayList(list));
            f.h.b.c.a.x(aVar, "attributes");
            this.b = aVar;
            this.c = bVar;
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                return f.h.b.c.a.i0(this.a, eVar.a) && f.h.b.c.a.i0(this.b, eVar.b) && f.h.b.c.a.i0(this.c, eVar.c);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }

        public String toString() {
            f.h.c.a.i c1 = f.h.b.c.a.c1(this);
            c1.c("addresses", this.a);
            c1.c("attributes", this.b);
            c1.c("serviceConfig", this.c);
            return c1.toString();
        }
    }

    /* compiled from: NameResolver.java */
    /* loaded from: classes2.dex */
    public static abstract class f {
        public abstract b a(Map<String, ?> map);
    }

    public abstract String a();

    public abstract void b();

    public abstract void c();

    public abstract void d(d dVar);

    /* compiled from: NameResolver.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public final Status a;
        public final Object b;

        public b(Object obj) {
            f.h.b.c.a.x(obj, "config");
            this.b = obj;
            this.a = null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return f.h.b.c.a.i0(this.a, bVar.a) && f.h.b.c.a.i0(this.b, bVar.b);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b});
        }

        public String toString() {
            if (this.b != null) {
                f.h.c.a.i c1 = f.h.b.c.a.c1(this);
                c1.c("config", this.b);
                return c1.toString();
            }
            f.h.c.a.i c12 = f.h.b.c.a.c1(this);
            c12.c(Constants.IPC_BUNDLE_KEY_SEND_ERROR, this.a);
            return c12.toString();
        }

        public b(Status status) {
            this.b = null;
            f.h.b.c.a.x(status, "status");
            this.a = status;
            f.h.b.c.a.q(!status.f(), "cannot use OK status: %s", status);
        }
    }
}
