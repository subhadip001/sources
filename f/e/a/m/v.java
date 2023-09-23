package f.e.a.m;

import android.util.Log;
import f.e.a.m.t;
import java.util.Objects;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes.dex */
public class v implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t.e f3550f;

    public v(t.e eVar) {
        this.f3550f = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z = this.f3550f.f3543d;
        t.e eVar = this.f3550f;
        eVar.f3543d = eVar.b();
        if (z != this.f3550f.f3543d) {
            if (Log.isLoggable("ConnectivityMonitor", 3)) {
                StringBuilder A = f.a.b.a.a.A("connectivity changed, isConnected: ");
                A.append(this.f3550f.f3543d);
                Log.d("ConnectivityMonitor", A.toString());
            }
            t.e eVar2 = this.f3550f;
            boolean z2 = eVar2.f3543d;
            Objects.requireNonNull(eVar2);
            f.e.a.r.l.k(new w(eVar2, z2));
        }
    }
}
