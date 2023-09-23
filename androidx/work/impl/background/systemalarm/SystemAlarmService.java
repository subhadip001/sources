package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import e.g0.k;
import e.g0.t.p.b.e;
import e.g0.t.t.m;
import e.s.p;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SystemAlarmService extends p implements e.c {

    /* renamed from: i  reason: collision with root package name */
    public static final String f645i = k.e("SystemAlarmService");

    /* renamed from: g  reason: collision with root package name */
    public e f646g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f647h;

    public final void a() {
        e eVar = new e(this);
        this.f646g = eVar;
        if (eVar.o != null) {
            k.c().b(e.p, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            eVar.o = this;
        }
    }

    public void c() {
        this.f647h = true;
        k.c().a(f645i, "All commands completed in dispatcher", new Throwable[0]);
        String str = m.a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = m.b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                k.c().f(m.a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // e.s.p, android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
        this.f647h = false;
    }

    @Override // e.s.p, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f647h = true;
        this.f646g.c();
    }

    @Override // e.s.p, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f647h) {
            k.c().d(f645i, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f646g.c();
            a();
            this.f647h = false;
        }
        if (intent != null) {
            this.f646g.a(intent, i3);
            return 3;
        }
        return 3;
    }
}
