package e.u.b;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: SnapHelper.java */
/* loaded from: classes.dex */
public abstract class c0 extends RecyclerView.p {
    public RecyclerView a;
    public final RecyclerView.r b = new a();

    /* compiled from: SnapHelper.java */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.r {
        public boolean a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void a(RecyclerView recyclerView, int i2) {
            if (i2 == 0 && this.a) {
                this.a = false;
                c0.this.d();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(RecyclerView recyclerView, int i2, int i3) {
            if (i2 == 0 && i3 == 0) {
                return;
            }
            this.a = true;
        }
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            RecyclerView.r rVar = this.b;
            List<RecyclerView.r> list = recyclerView2.o0;
            if (list != null) {
                list.remove(rVar);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() == null) {
                this.a.h(this.b);
                this.a.setOnFlingListener(this);
                new Scroller(this.a.getContext(), new DecelerateInterpolator());
                d();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public abstract int[] b(RecyclerView.m mVar, View view);

    public abstract View c(RecyclerView.m mVar);

    public void d() {
        RecyclerView.m layoutManager;
        View c;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (c = c(layoutManager)) == null) {
            return;
        }
        int[] b = b(layoutManager, c);
        if (b[0] == 0 && b[1] == 0) {
            return;
        }
        this.a.o0(b[0], b[1]);
    }
}
