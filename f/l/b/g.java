package f.l.b;

import android.view.View;

/* compiled from: RatingDialog.java */
/* loaded from: classes2.dex */
public class g implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f6806f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e f6807g;

    public g(e eVar, int i2) {
        this.f6807g = eVar;
        this.f6806f = i2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e eVar = this.f6807g;
        int i2 = this.f6806f;
        eVar.a(i2 - (eVar.f6802l == i2 ? 1 : 0));
    }
}
