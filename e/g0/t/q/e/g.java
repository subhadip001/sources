package e.g0.t.q.e;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import e.g0.t.s.p;

/* compiled from: NetworkUnmeteredController.java */
/* loaded from: classes.dex */
public class g extends c<e.g0.t.q.b> {
    public g(Context context, e.g0.t.t.t.a aVar) {
        super(e.g0.t.q.f.g.a(context, aVar).c);
    }

    @Override // e.g0.t.q.e.c
    public boolean b(p pVar) {
        NetworkType networkType = pVar.f2342j.a;
        return networkType == NetworkType.UNMETERED || (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED);
    }

    @Override // e.g0.t.q.e.c
    public boolean c(e.g0.t.q.b bVar) {
        e.g0.t.q.b bVar2 = bVar;
        return !bVar2.a || bVar2.c;
    }
}
