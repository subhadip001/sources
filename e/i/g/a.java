package e.i.g;

import android.graphics.Typeface;
import e.i.c.d.j;
import e.i.d.e;

/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public class a implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m f2474f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Typeface f2475g;

    public a(c cVar, m mVar, Typeface typeface) {
        this.f2474f = mVar;
        this.f2475g = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        m mVar = this.f2474f;
        Typeface typeface = this.f2475g;
        j.c cVar = ((e.a) mVar).a;
        if (cVar != null) {
            cVar.e(typeface);
        }
    }
}
