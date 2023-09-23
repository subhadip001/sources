package f.n.a.v.f;

import android.app.Dialog;
import android.os.Bundle;
import com.video_converter.video_compressor.model.MediaFile;
import e.p.c.k;
import java.util.List;
import java.util.Objects;

/* compiled from: FixedSizeInputListDialog.java */
/* loaded from: classes2.dex */
public class c extends k implements a {

    /* renamed from: f  reason: collision with root package name */
    public a f7189f;

    /* renamed from: g  reason: collision with root package name */
    public e f7190g;

    /* renamed from: h  reason: collision with root package name */
    public f f7191h;

    @Override // f.n.a.v.f.a
    public void f(List<MediaFile> list) {
    }

    @Override // e.p.c.k
    public Dialog onCreateDialog(Bundle bundle) {
        f.n.a.v.c.c h2 = ((f.n.a.v.c.e.a) requireActivity()).P().h();
        this.f7191h = new f(h2.a, null, h2);
        Objects.requireNonNull(((f.n.a.v.c.e.a) requireActivity()).P());
        e eVar = new e();
        this.f7190g = eVar;
        eVar.a = this.f7191h;
        eVar.b = this;
        Bundle arguments = getArguments();
        Objects.requireNonNull(eVar);
        if (arguments != null) {
            List<MediaFile> list = (List) arguments.getSerializable("SELECTED_FILE");
            eVar.c = list;
            f fVar = eVar.a;
            Objects.requireNonNull(fVar);
            if (list != null) {
                f.n.a.v.f.g.b bVar = fVar.f7193i;
                bVar.b = list;
                bVar.notifyDataSetChanged();
            }
            arguments.getString("TITLE");
        }
        Dialog dialog = new Dialog(requireActivity());
        dialog.setContentView(this.f7191h.f7131f);
        setCancelable(false);
        dialog.getWindow().setLayout((int) (getResources().getDisplayMetrics().widthPixels * 0.99d), -2);
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Objects.requireNonNull(this.f7190g);
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        e eVar = this.f7190g;
        eVar.a.f7130g.add(eVar);
    }
}
