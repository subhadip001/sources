package f.n.a.v.e;

import f.n.a.v.e.b;
import java.util.ArrayList;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class p implements b.a {
    public final /* synthetic */ x a;

    public p(x xVar) {
        this.a = xVar;
    }

    @Override // f.n.a.v.e.b.a
    public void onItemClicked(ArrayList<f.n.a.o.h> arrayList, int i2) {
        for (e eVar : this.a.c()) {
            eVar.i(arrayList, i2);
        }
    }
}
