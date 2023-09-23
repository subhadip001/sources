package f.n.a.v.m;

import com.video_converter.video_compressor.adControllers.AdLoader;

/* compiled from: ProcessingScreenController.java */
/* loaded from: classes2.dex */
public class l implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f7314f;

    public l(j jVar) {
        this.f7314f = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            j jVar = this.f7314f;
            e.p.c.n nVar = jVar.f7301f;
            jVar.F = new AdLoader(nVar, jVar.f7304i.K, nVar);
            this.f7314f.F.f();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
