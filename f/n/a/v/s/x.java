package f.n.a.v.s;

import com.video_converter.video_compressor.model.MediaFile;
import java.util.Objects;

/* compiled from: VidCompInputScreenController.java */
/* loaded from: classes2.dex */
public class x implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f7464f;

    public x(j jVar) {
        this.f7464f = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.n.a.v.q.d dVar;
        j jVar = this.f7464f;
        h hVar = jVar.b;
        MediaFile A = jVar.A();
        f.n.a.m.c.a aVar = this.f7464f.f7431e;
        Objects.requireNonNull(hVar);
        try {
            ((f.n.a.v.q.e) hVar.b.e(hVar.a)).f7395i.u(A, aVar);
        } catch (Exception unused) {
            f.l.b.c.n(hVar.a);
        }
        this.f7464f.a.f7423m.setVisibility(0);
        j jVar2 = this.f7464f;
        h hVar2 = jVar2.b;
        Objects.requireNonNull(hVar2);
        try {
            dVar = ((f.n.a.v.q.e) hVar2.b.e(hVar2.a)).f7395i;
        } catch (Exception unused2) {
            dVar = null;
        }
        if (dVar != null) {
            dVar.n = jVar2;
        }
    }
}
