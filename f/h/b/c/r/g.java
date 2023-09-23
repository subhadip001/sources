package f.h.b.c.r;

import android.view.ViewTreeObserver;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
public class g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f5395f;

    public g(e eVar) {
        this.f5395f = eVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        e eVar = this.f5395f;
        float rotation = eVar.w.getRotation();
        if (eVar.p != rotation) {
            eVar.p = rotation;
            eVar.w();
            return true;
        }
        return true;
    }
}
