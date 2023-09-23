package f.n.a.v.o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;
import f.n.a.v.o.d;
import java.util.List;
import java.util.Objects;

/* compiled from: SelectableListDialog.java */
/* loaded from: classes2.dex */
public class b extends f.h.b.c.h.e implements d.a {

    /* renamed from: f  reason: collision with root package name */
    public a f7364f;

    /* renamed from: g  reason: collision with root package name */
    public f f7365g;

    /* renamed from: h  reason: collision with root package name */
    public d f7366h;

    /* compiled from: SelectableListDialog.java */
    /* loaded from: classes2.dex */
    public interface a {
        void b();

        void k(Item item, String str);
    }

    @Override // e.p.c.k
    public int getTheme() {
        return R.style.CustomBottomSheetDialogTheme;
    }

    public void k() {
        super.dismiss();
        a aVar = this.f7364f;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void l(Item item) {
        super.dismiss();
        a aVar = this.f7364f;
        if (aVar != null) {
            aVar.k(item, getTag());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        f.n.a.v.c.c h2 = ((f.n.a.v.c.e.a) requireActivity()).P().h();
        this.f7365g = new f(h2.a, viewGroup, h2);
        Objects.requireNonNull(((f.n.a.v.c.e.a) requireActivity()).P());
        d dVar = new d();
        this.f7366h = dVar;
        dVar.b = this.f7365g;
        dVar.c = this;
        Bundle arguments = getArguments();
        dVar.b.f7368h.setText(arguments.getString("SELECTABLE_LIST_TITLE"));
        String string = arguments.getString("SELECTABLE_LIST_SUBTITLE");
        if (string == null) {
            dVar.b.f7369i.setVisibility(8);
        } else {
            dVar.b.f7369i.setText(string);
        }
        boolean z = arguments.getBoolean("CUSTOOM_ACTION", false);
        dVar.a = z;
        if (z) {
            dVar.b.f7371k.setVisibility(0);
        }
        f.n.a.v.o.a.b bVar = dVar.b.f7372l;
        bVar.c = (List) arguments.getSerializable("SELECTABLE_LIST_ITEMS");
        bVar.notifyDataSetChanged();
        return this.f7365g.f7131f;
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        d dVar = this.f7366h;
        dVar.b.f7130g.add(dVar);
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        d dVar = this.f7366h;
        dVar.b.f7130g.remove(dVar);
    }
}
