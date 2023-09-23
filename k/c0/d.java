package k.c0;

import java.util.concurrent.ThreadFactory;

/* compiled from: Util.java */
/* loaded from: classes2.dex */
public final class d implements ThreadFactory {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f8883f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f8884g;

    public d(String str, boolean z) {
        this.f8883f = str;
        this.f8884g = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f8883f);
        thread.setDaemon(this.f8884g);
        return thread;
    }
}
