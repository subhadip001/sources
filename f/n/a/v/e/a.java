package f.n.a.v.e;

import android.view.View;

/* compiled from: AudioOptionRecyclerAdapter.java */
/* loaded from: classes2.dex */
public class a implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f7154f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f7155g;

    public a(b bVar, int i2) {
        this.f7155g = bVar;
        this.f7154f = i2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b bVar = this.f7155g;
        bVar.b.onItemClicked(bVar.a, this.f7154f);
    }
}
