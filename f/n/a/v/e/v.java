package f.n.a.v.e;

import android.view.View;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class v implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f7180f;

    public v(x xVar) {
        this.f7180f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        for (e eVar : this.f7180f.c()) {
            boolean booleanValue = eVar.b(this.f7180f.f7183i.getText().toString()).booleanValue();
            x.d(this.f7180f, null);
            if (booleanValue) {
                x xVar = this.f7180f;
                f.l.b.c.j(xVar.f7182h, Boolean.class, "previous_high_quality_audio", Boolean.valueOf(xVar.N.isChecked()));
                eVar.h(this.f7180f.f7183i.getText().toString(), Boolean.valueOf(this.f7180f.H.isChecked()), Boolean.valueOf(this.f7180f.I.isChecked()), Boolean.valueOf(this.f7180f.N.isChecked()));
            }
        }
    }
}
