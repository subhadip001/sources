package f.h.b.b.y1.j0;

import com.google.android.exoplayer2.Format;
import f.h.b.b.y1.j0.i0;
import java.util.List;

/* compiled from: SeiReader.java */
/* loaded from: classes.dex */
public final class e0 {
    public final List<Format> a;
    public final f.h.b.b.y1.w[] b;

    public e0(List<Format> list) {
        this.a = list;
        this.b = new f.h.b.b.y1.w[list.size()];
    }

    public void a(f.h.b.b.y1.j jVar, i0.d dVar) {
        for (int i2 = 0; i2 < this.b.length; i2++) {
            dVar.a();
            f.h.b.b.y1.w p = jVar.p(dVar.c(), 3);
            Format format = this.a.get(i2);
            String str = format.q;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            f.h.b.b.e2.j.d(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            String str2 = format.f707f;
            if (str2 == null) {
                str2 = dVar.b();
            }
            Format.b bVar = new Format.b();
            bVar.a = str2;
            bVar.f722k = str;
            bVar.f715d = format.f710i;
            bVar.c = format.f709h;
            bVar.C = format.I;
            bVar.f724m = format.s;
            p.e(bVar.a());
            this.b[i2] = p;
        }
    }
}
