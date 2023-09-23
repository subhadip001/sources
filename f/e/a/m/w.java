package f.e.a.m;

import f.e.a.m.t;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes.dex */
public class w implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f3551f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ t.e f3552g;

    public w(t.e eVar, boolean z) {
        this.f3552g = eVar;
        this.f3551f = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3552g.b.a(this.f3551f);
    }
}
