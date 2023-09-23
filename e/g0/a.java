package e.g0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public class a implements ThreadFactory {

    /* renamed from: f  reason: collision with root package name */
    public final AtomicInteger f2188f = new AtomicInteger(0);

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f2189g;

    public a(b bVar, boolean z) {
        this.f2189g = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        StringBuilder A = f.a.b.a.a.A(this.f2189g ? "WM.task-" : "androidx.work-");
        A.append(this.f2188f.incrementAndGet());
        return new Thread(runnable, A.toString());
    }
}
