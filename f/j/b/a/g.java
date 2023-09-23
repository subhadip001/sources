package f.j.b.a;

import com.inverseai.billing.model.ProductType;
import f.a.a.a.o;
import java.util.ArrayList;

/* compiled from: Runnable.kt */
/* loaded from: classes2.dex */
public final class g implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f6561f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList f6562g;

    public g(d dVar, ArrayList arrayList) {
        this.f6561f = dVar;
        this.f6562g = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList(this.f6561f.d(ProductType.IN_APP));
        f.a.a.a.c cVar = this.f6561f.f6540e;
        i.l.b.i.b(cVar);
        o oVar = new o();
        oVar.a = "inapp";
        oVar.b = arrayList;
        cVar.a(oVar, new h(this.f6562g, this.f6561f));
    }
}
