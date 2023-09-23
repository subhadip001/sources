package f.h.b.d.a.b;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class c extends f.h.b.d.a.e.g {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f5580g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f.h.b.d.a.i.m f5581h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ r f5582i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, f.h.b.d.a.i.m mVar, List list, f.h.b.d.a.i.m mVar2) {
        super(mVar);
        this.f5582i = rVar;
        this.f5580g = list;
        this.f5581h = mVar2;
    }

    @Override // f.h.b.d.a.e.g
    public final void a() {
        List<String> list = this.f5580g;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        try {
            r rVar = this.f5582i;
            ((f.h.b.d.a.e.i0) rVar.f5688d.n).g(rVar.a, arrayList, r.f(), new k(this.f5582i, this.f5581h));
        } catch (RemoteException e2) {
            r.f5686g.c(e2, "cancelDownloads(%s)", this.f5580g);
        }
    }
}
