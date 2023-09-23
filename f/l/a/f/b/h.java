package f.l.a.f.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import e.b.c.k;
import e.d0.a;
import i.l.a.l;
import i.l.b.i;

/* compiled from: BaseActivity.kt */
/* loaded from: classes2.dex */
public abstract class h<B extends e.d0.a> extends k {
    public final l<LayoutInflater, B> t;
    public B u;

    /* JADX WARN: Multi-variable type inference failed */
    public h(l<? super LayoutInflater, ? extends B> lVar) {
        i.e(lVar, "inflater");
        this.t = lVar;
    }

    public final B P() {
        B b = this.u;
        if (b != null) {
            return b;
        }
        i.h("binding");
        throw null;
    }

    public abstract void Q(Bundle bundle);

    @Override // e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l<LayoutInflater, B> lVar = this.t;
        LayoutInflater layoutInflater = getLayoutInflater();
        i.d(layoutInflater, "layoutInflater");
        B b = lVar.b(layoutInflater);
        i.e(b, "<set-?>");
        this.u = b;
        setContentView(P().b());
        Q(bundle);
    }
}
