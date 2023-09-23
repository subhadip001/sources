package e.g0.t.q.e;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import e.g0.t.s.p;

/* compiled from: NetworkConnectedController.java */
/* loaded from: classes.dex */
public class d extends c<e.g0.t.q.b> {
    public d(Context context, e.g0.t.t.t.a aVar) {
        super(e.g0.t.q.f.g.a(context, aVar).c);
    }

    @Override // e.g0.t.q.e.c
    public boolean b(p pVar) {
        return pVar.f2342j.a == NetworkType.CONNECTED;
    }

    @Override // e.g0.t.q.e.c
    public boolean c(e.g0.t.q.b bVar) {
        e.g0.t.q.b bVar2 = bVar;
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar2.a && bVar2.b) ? false : true;
        }
        return true ^ bVar2.a;
    }
}
