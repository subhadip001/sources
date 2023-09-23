package f.e.a.m;

import f.e.a.m.t;
import java.util.Objects;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes.dex */
public class u implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f3548f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ t.d.a f3549g;

    public u(t.d.a aVar, boolean z) {
        this.f3549g = aVar;
        this.f3548f = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        t.d.a aVar = this.f3549g;
        boolean z = this.f3548f;
        Objects.requireNonNull(aVar);
        f.e.a.r.l.a();
        t.d dVar = t.d.this;
        boolean z2 = dVar.a;
        dVar.a = z;
        if (z2 != z) {
            dVar.b.a(z);
        }
    }
}
