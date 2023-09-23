package f.n.a.v.s;

import java.util.Locale;

/* compiled from: VidComInputScreenManipulationTask.java */
/* loaded from: classes2.dex */
public class h {
    public e.p.c.n a;
    public c0 b;

    public h(e.p.c.n nVar) {
        this.a = nVar;
    }

    public void a() {
        this.b.q.setVisibility(8);
    }

    public void b(int i2) {
        this.b.n.setSelection(i2);
    }

    public void c() {
        this.b.q.setVisibility(0);
        this.b.z.setVisibility(0);
    }

    public void d(int i2, int i3) {
        this.b.z.setText(String.format(Locale.US, "%s/%s", Integer.valueOf(i2), Integer.valueOf(i3)));
    }
}
