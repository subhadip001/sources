package e.i.g;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
public class n implements ThreadFactory {

    /* renamed from: f  reason: collision with root package name */
    public String f2491f;

    /* renamed from: g  reason: collision with root package name */
    public int f2492g;

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    public static class a extends Thread {

        /* renamed from: f  reason: collision with root package name */
        public final int f2493f;

        public a(Runnable runnable, String str, int i2) {
            super(runnable, str);
            this.f2493f = i2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(this.f2493f);
            super.run();
        }
    }

    public n(String str, int i2) {
        this.f2491f = str;
        this.f2492g = i2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new a(runnable, this.f2491f, this.f2492g);
    }
}
