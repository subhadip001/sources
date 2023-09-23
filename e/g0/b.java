package e.g0;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class b {
    public final Executor a = a(false);
    public final Executor b = a(true);
    public final s c;

    /* renamed from: d  reason: collision with root package name */
    public final j f2190d;

    /* renamed from: e  reason: collision with root package name */
    public final e.g0.t.a f2191e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2192f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2193g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2194h;

    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* compiled from: Configuration.java */
    /* renamed from: e.g0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0038b {
        b a();
    }

    public b(a aVar) {
        String str = s.a;
        this.c = new r();
        this.f2190d = new i();
        this.f2191e = new e.g0.t.a();
        this.f2192f = 4;
        this.f2193g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f2194h = 20;
    }

    public final Executor a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new e.g0.a(this, z));
    }
}
