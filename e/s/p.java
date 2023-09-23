package e.s;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.Lifecycle;

/* compiled from: LifecycleService.java */
/* loaded from: classes.dex */
public class p extends Service implements m {

    /* renamed from: f  reason: collision with root package name */
    public final a0 f2819f = new a0(this);

    @Override // e.s.m
    public Lifecycle getLifecycle() {
        return this.f2819f.a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f2819f.a(Lifecycle.Event.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f2819f.a(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        a0 a0Var = this.f2819f;
        a0Var.a(Lifecycle.Event.ON_STOP);
        a0Var.a(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        this.f2819f.a(Lifecycle.Event.ON_START);
        super.onStart(intent, i2);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        return super.onStartCommand(intent, i2, i3);
    }
}
