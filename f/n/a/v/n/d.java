package f.n.a.v.n;

import android.view.View;
import f.n.a.v.n.c;
import java.util.ArrayList;

/* compiled from: ProductItemRecyclerAdapter.java */
/* loaded from: classes2.dex */
public class d implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c.a f7333f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList f7334g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f7335h;

    public d(c.b bVar, c.a aVar, ArrayList arrayList, int i2) {
        this.f7333f = aVar;
        this.f7334g = arrayList;
        this.f7335h = i2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        c.a aVar = this.f7333f;
        if (aVar != null) {
            ((m) aVar).a(this.f7334g, this.f7335h);
        }
    }
}
