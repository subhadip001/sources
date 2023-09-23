package f.n.a.s;

import android.util.Log;
import f.n.a.n.i;
import f.n.a.o.a;
import f.n.a.s.c;
import java.util.Objects;

/* compiled from: MediaInformationExtractor.java */
/* loaded from: classes2.dex */
public class b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c.a f7074f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c f7075g;

    public b(c cVar, c.a aVar) {
        this.f7075g = cVar;
        this.f7074f = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7075g.f7076f = this.f7074f;
        Log.d("BATCH_PROCESSING", "executeFetchingCommand: mie");
        c cVar = this.f7075g;
        String valueOf = String.valueOf(cVar.f7078h.f1372j);
        Objects.requireNonNull(cVar);
        String w = i.w(valueOf);
        a.b bVar = new a.b();
        bVar.a.add("-hide_banner");
        bVar.a.add("-i");
        bVar.a.add(w);
        String[] a = bVar.c().a();
        c cVar2 = this.f7075g;
        cVar2.f7077g.a(a, cVar2);
    }
}
