package f.n.a.v.n;

import com.google.android.material.tabs.TabLayout;
import com.video_converter.video_compressor.R;
import f.h.b.c.a0.f;

/* compiled from: PurchaseScreenView.java */
/* loaded from: classes2.dex */
public class n implements f.b {
    public n(p pVar) {
    }

    @Override // f.h.b.c.a0.f.b
    public void a(TabLayout.g gVar, int i2) {
        if (i2 == 0) {
            gVar.a(R.drawable.ic_tab_selected_icon);
        } else {
            gVar.a(R.drawable.ic_tab_unselected_icon);
        }
    }
}
