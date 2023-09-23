package j.a.z1;

import j.a.y1.t;
import java.util.concurrent.TimeUnit;

/* compiled from: Tasks.kt */
/* loaded from: classes2.dex */
public final class k {
    public static final long a = f.n.a.n.i.c0("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);
    public static final int b;
    public static final int c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f8839d;

    /* renamed from: e  reason: collision with root package name */
    public static f f8840e;

    /* renamed from: f  reason: collision with root package name */
    public static final h f8841f;

    /* renamed from: g  reason: collision with root package name */
    public static final h f8842g;

    static {
        int i2 = t.a;
        b = f.n.a.n.i.b0("kotlinx.coroutines.scheduler.core.pool.size", i2 < 2 ? 2 : i2, 1, 0, 8, null);
        c = f.n.a.n.i.b0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f8839d = TimeUnit.SECONDS.toNanos(f.n.a.n.i.c0("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        f8840e = d.a;
        f8841f = new i(0);
        f8842g = new i(1);
    }
}
