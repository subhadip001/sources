package j.a.z1;

import j.a.u0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* compiled from: Dispatcher.kt */
/* loaded from: classes2.dex */
public class e extends u0 {

    /* renamed from: g  reason: collision with root package name */
    public final int f8831g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8832h;

    /* renamed from: i  reason: collision with root package name */
    public final long f8833i;

    /* renamed from: j  reason: collision with root package name */
    public final String f8834j;

    /* renamed from: k  reason: collision with root package name */
    public CoroutineScheduler f8835k;

    public e(int i2, int i3, long j2, String str) {
        this.f8831g = i2;
        this.f8832h = i3;
        this.f8833i = j2;
        this.f8834j = str;
        this.f8835k = new CoroutineScheduler(i2, i3, j2, str);
    }

    @Override // j.a.z
    public void d0(i.j.f fVar, Runnable runnable) {
        CoroutineScheduler coroutineScheduler = this.f8835k;
        AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f9201m;
        coroutineScheduler.g(runnable, k.f8841f, false);
    }
}
