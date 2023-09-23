package f.n.a.v.u;

import f.b.a.b;

/* compiled from: VideoTrimFragmentView.java */
/* loaded from: classes2.dex */
public class h implements b.c {
    public final /* synthetic */ i a;

    public h(i iVar) {
        this.a = iVar;
    }

    public void a() {
        for (d dVar : this.a.c()) {
            dVar.g(this.a.t.getLeftProgress() * 100.0f, this.a.t.getRightProgress() * 100.0f);
        }
    }

    public void b(float f2) {
        for (d dVar : this.a.c()) {
            dVar.c(f2);
        }
    }
}
