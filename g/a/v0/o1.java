package g.a.v0;

import g.a.c0;
import g.a.v0.m1;
import io.grpc.ConnectivityState;

/* compiled from: ManagedChannelImpl.java */
/* loaded from: classes2.dex */
public class o1 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c0.j f7871f;

    public o1(m1.q qVar, c0.j jVar) {
        this.f7871f = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7871f.a(g.a.l.a(ConnectivityState.SHUTDOWN));
    }
}
