package f.h.b.b.h2;

import android.view.Surface;
import f.h.b.b.g2.b0;
import f.h.b.b.h2.w;

/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ w.a f4326f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Surface f4327g;

    public /* synthetic */ d(w.a aVar, Surface surface) {
        this.f4326f = aVar;
        this.f4327g = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w.a aVar = this.f4326f;
        Surface surface = this.f4327g;
        w wVar = aVar.b;
        int i2 = b0.a;
        wVar.q(surface);
    }
}
