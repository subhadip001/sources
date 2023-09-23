package e.g0.t.r;

import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2333f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f2334g;

    public e(SystemForegroundService systemForegroundService, int i2) {
        this.f2334g = systemForegroundService;
        this.f2333f = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2334g.f655j.cancel(this.f2333f);
    }
}
