package f.e.a.m;

import android.content.Context;
import f.e.a.m.c;

/* compiled from: DefaultConnectivityMonitor.java */
/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: f  reason: collision with root package name */
    public final Context f3522f;

    /* renamed from: g  reason: collision with root package name */
    public final c.a f3523g;

    public e(Context context, c.a aVar) {
        this.f3522f = context.getApplicationContext();
        this.f3523g = aVar;
    }

    @Override // f.e.a.m.m
    public void onDestroy() {
    }

    @Override // f.e.a.m.m
    public void onStart() {
        t a = t.a(this.f3522f);
        c.a aVar = this.f3523g;
        synchronized (a) {
            a.b.add(aVar);
            if (!a.c && !a.b.isEmpty()) {
                a.c = a.a.a();
            }
        }
    }

    @Override // f.e.a.m.m
    public void onStop() {
        t a = t.a(this.f3522f);
        c.a aVar = this.f3523g;
        synchronized (a) {
            a.b.remove(aVar);
            if (a.c && a.b.isEmpty()) {
                a.a.unregister();
                a.c = false;
            }
        }
    }
}
