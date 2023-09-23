package f.n.a.v.n;

import android.view.View;

/* compiled from: PurchaseScreenView.java */
/* loaded from: classes2.dex */
public class k implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p f7348f;

    public k(p pVar) {
        this.f7348f = pVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        for (f fVar : this.f7348f.c()) {
            fVar.b();
        }
    }
}
