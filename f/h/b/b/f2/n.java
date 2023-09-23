package f.h.b.b.f2;

import android.content.Context;
import f.h.b.b.f2.i;
import f.h.b.b.f2.o;

/* compiled from: DefaultDataSourceFactory.java */
/* loaded from: classes.dex */
public final class n implements i.a {
    public final Context a;
    public final t b;
    public final i.a c;

    public n(Context context) {
        o.b bVar = new o.b();
        bVar.b = null;
        this.a = context.getApplicationContext();
        this.b = null;
        this.c = bVar;
    }

    @Override // f.h.b.b.f2.i.a
    public i a() {
        m mVar = new m(this.a, this.c.a());
        t tVar = this.b;
        if (tVar != null) {
            mVar.d(tVar);
        }
        return mVar;
    }

    public n(Context context, String str, t tVar) {
        o.b bVar = new o.b();
        bVar.b = str;
        this.a = context.getApplicationContext();
        this.b = tVar;
        this.c = bVar;
    }
}
