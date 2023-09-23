package e.g0.t.q.e;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import e.g0.k;
import e.g0.t.s.p;

/* compiled from: NetworkNotRoamingController.java */
/* loaded from: classes.dex */
public class f extends c<e.g0.t.q.b> {

    /* renamed from: e  reason: collision with root package name */
    public static final String f2302e = k.e("NetworkNotRoamingCtrlr");

    public f(Context context, e.g0.t.t.t.a aVar) {
        super(e.g0.t.q.f.g.a(context, aVar).c);
    }

    @Override // e.g0.t.q.e.c
    public boolean b(p pVar) {
        return pVar.f2342j.a == NetworkType.NOT_ROAMING;
    }

    @Override // e.g0.t.q.e.c
    public boolean c(e.g0.t.q.b bVar) {
        e.g0.t.q.b bVar2 = bVar;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 24) {
            k.c().a(f2302e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !bVar2.a;
        }
        if (bVar2.a && bVar2.f2298d) {
            z = false;
        }
        return z;
    }
}
