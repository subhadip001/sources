package f.n.a.v.b;

import com.video_converter.video_compressor.adControllers.AdLoader;
import java.util.Objects;

/* compiled from: BatchScreenController.java */
/* loaded from: classes2.dex */
public class i implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f7100f;

    public i(j jVar) {
        this.f7100f = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVar = this.f7100f;
        e.p.c.n nVar = jVar.f7101f;
        jVar.D = new AdLoader(nVar, jVar.f7102g.A, nVar);
        this.f7100f.f7102g.A.setVisibility(0);
        j jVar2 = this.f7100f;
        Objects.requireNonNull(jVar2);
        try {
            jVar2.D.c();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
