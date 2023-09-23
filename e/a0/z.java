package e.a0;

import android.view.View;
import android.view.ViewGroup;
import com.video_converter.video_compressor.R;
import e.a0.h;
import java.util.ArrayList;

/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public class z extends k {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a0 f1452d;

    public z(a0 a0Var, ViewGroup viewGroup, View view, View view2) {
        this.f1452d = a0Var;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // e.a0.k, e.a0.h.d
    public void b(h hVar) {
        this.a.getOverlay().remove(this.b);
    }

    @Override // e.a0.h.d
    public void c(h hVar) {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        hVar.v(this);
    }

    @Override // e.a0.k, e.a0.h.d
    public void e(h hVar) {
        if (this.b.getParent() == null) {
            this.a.getOverlay().add(this.b);
            return;
        }
        a0 a0Var = this.f1452d;
        int size = a0Var.r.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            a0Var.r.get(size).cancel();
        }
        ArrayList<h.d> arrayList = a0Var.v;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) a0Var.v.clone();
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((h.d) arrayList2.get(i2)).d(a0Var);
        }
    }
}
