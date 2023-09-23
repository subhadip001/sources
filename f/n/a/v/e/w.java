package f.n.a.v.e;

import android.view.View;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class w implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f7181f;

    public w(x xVar) {
        this.f7181f = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        for (e eVar : this.f7181f.c()) {
            if (eVar.b(this.f7181f.f7183i.getText().toString()).booleanValue()) {
                x xVar = this.f7181f;
                f.l.b.c.j(xVar.f7182h, Boolean.class, "previous_high_quality_audio", Boolean.valueOf(xVar.N.isChecked()));
                eVar.e(this.f7181f.f7183i.getText().toString(), Boolean.valueOf(this.f7181f.H.isChecked()), Boolean.valueOf(this.f7181f.I.isChecked()), Boolean.valueOf(this.f7181f.N.isChecked()));
            }
        }
    }
}
