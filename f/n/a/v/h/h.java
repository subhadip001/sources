package f.n.a.v.h;

import java.util.Comparator;

/* compiled from: HomeScreenController.java */
/* loaded from: classes2.dex */
public class h implements Comparator<f.j.b.c.a> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f7226f;

    public h(e eVar) {
        this.f7226f = eVar;
    }

    @Override // java.util.Comparator
    public int compare(f.j.b.c.a aVar, f.j.b.c.a aVar2) {
        return (int) (this.f7226f.r(aVar) - this.f7226f.r(aVar2));
    }
}
