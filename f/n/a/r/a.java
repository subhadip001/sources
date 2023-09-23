package f.n.a.r;

import android.content.Context;
import f.h.f.j;
import f.n.a.g.c;
import f.n.a.v.l.e;
import java.io.File;

/* compiled from: PreviewGeneratingTask.java */
/* loaded from: classes2.dex */
public class a implements c.a {
    public final /* synthetic */ Context a;
    public final /* synthetic */ b b;

    public a(b bVar, Context context) {
        this.b = bVar;
        this.a = context;
    }

    @Override // f.n.a.g.c.a
    public void a(String[] strArr) {
        boolean z;
        this.b.f7066f = new j().h(strArr);
        if (this.b.f7066f.equalsIgnoreCase((String) f.l.b.c.b(this.a, String.class, "rret_sfrdf"))) {
            try {
                z = new File(this.b.f7073m).exists();
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                b bVar = this.b;
                ((e) bVar.f7070j).g(bVar.f7072l, bVar.f7073m, bVar.n);
                return;
            }
        }
        b bVar2 = this.b;
        bVar2.f7071k = true;
        bVar2.f7069i.a(strArr, bVar2);
    }
}
