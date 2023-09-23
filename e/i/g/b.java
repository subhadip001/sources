package e.i.g;

import e.i.c.d.j;
import e.i.d.e;

/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m f2476f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f2477g;

    public b(c cVar, m mVar, int i2) {
        this.f2476f = mVar;
        this.f2477g = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        m mVar = this.f2476f;
        int i2 = this.f2477g;
        j.c cVar = ((e.a) mVar).a;
        if (cVar != null) {
            cVar.d(i2);
        }
    }
}
