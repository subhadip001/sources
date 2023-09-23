package e.g0.t.r;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2330f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Notification f2331g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f2332h;

    public d(SystemForegroundService systemForegroundService, int i2, Notification notification) {
        this.f2332h = systemForegroundService;
        this.f2330f = i2;
        this.f2331g = notification;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2332h.f655j.notify(this.f2330f, this.f2331g);
    }
}
