package e.g0.t.t;

import androidx.work.WorkerParameters;

/* compiled from: StartWorkRunnable.java */
/* loaded from: classes.dex */
public class k implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public e.g0.t.l f2369f;

    /* renamed from: g  reason: collision with root package name */
    public String f2370g;

    /* renamed from: h  reason: collision with root package name */
    public WorkerParameters.a f2371h;

    public k(e.g0.t.l lVar, String str, WorkerParameters.a aVar) {
        this.f2369f = lVar;
        this.f2370g = str;
        this.f2371h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2369f.f2230f.g(this.f2370g, this.f2371h);
    }
}
