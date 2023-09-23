package f.h.b.c.n;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public class g extends RecyclerView.r {
    public final /* synthetic */ s a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ d c;

    public g(d dVar, s sVar, MaterialButton materialButton) {
        this.c = dVar;
        this.a = sVar;
        this.b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void a(RecyclerView recyclerView, int i2) {
        if (i2 == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void b(RecyclerView recyclerView, int i2, int i3) {
        int o1;
        if (i2 < 0) {
            o1 = this.c.k().m1();
        } else {
            o1 = this.c.k().o1();
        }
        this.c.f5315j = this.a.n(o1);
        this.b.setText(this.a.a.f1143f.k(o1).j());
    }
}
