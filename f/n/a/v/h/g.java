package f.n.a.v.h;

import com.video_converter.video_compressor.adControllers.AdLoader;
import e.p.c.n;
import java.util.Objects;

/* compiled from: HomeScreenController.java */
/* loaded from: classes2.dex */
public class g implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f7225f;

    public g(e eVar) {
        this.f7225f = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        e eVar = this.f7225f;
        n nVar = eVar.b;
        eVar.f7214l = new AdLoader(nVar, eVar.a.f7229j, nVar);
        this.f7225f.a.f7229j.setVisibility(0);
        e eVar2 = this.f7225f;
        Objects.requireNonNull(eVar2);
        try {
            eVar2.f7214l.c();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
