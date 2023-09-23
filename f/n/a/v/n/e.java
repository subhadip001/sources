package f.n.a.v.n;

import android.view.View;
import f.n.a.v.n.c;
import java.util.ArrayList;

/* compiled from: ProductItemRecyclerAdapter.java */
/* loaded from: classes2.dex */
public class e implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c.a f7336f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList f7337g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f7338h;

    public e(c.C0190c c0190c, c.a aVar, ArrayList arrayList, int i2) {
        this.f7336f = aVar;
        this.f7337g = arrayList;
        this.f7338h = i2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        c.a aVar = this.f7336f;
        if (aVar != null) {
            ((m) aVar).a(this.f7337g, this.f7338h);
        }
    }
}
