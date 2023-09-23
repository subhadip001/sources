package f.h.b.c.n;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public class e extends RecyclerView.l {
    public final Calendar a = x.e();
    public final Calendar b = x.e();
    public final /* synthetic */ d c;

    public e(d dVar) {
        this.c = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        int width;
        if ((recyclerView.getAdapter() instanceof z) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            z zVar = (z) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (e.i.i.b<Long, Long> bVar : this.c.f5313h.l()) {
                Long l2 = bVar.a;
                if (l2 != null && bVar.b != null) {
                    this.a.setTimeInMillis(l2.longValue());
                    this.b.setTimeInMillis(bVar.b.longValue());
                    int n = zVar.n(this.a.get(1));
                    int n2 = zVar.n(this.b.get(1));
                    View v = gridLayoutManager.v(n);
                    View v2 = gridLayoutManager.v(n2);
                    int i2 = gridLayoutManager.H;
                    int i3 = n / i2;
                    int i4 = n2 / i2;
                    for (int i5 = i3; i5 <= i4; i5++) {
                        View v3 = gridLayoutManager.v(gridLayoutManager.H * i5);
                        if (v3 != null) {
                            int top = v3.getTop() + this.c.f5317l.f5303d.a.top;
                            int bottom = v3.getBottom() - this.c.f5317l.f5303d.a.bottom;
                            int width2 = i5 == i3 ? (v.getWidth() / 2) + v.getLeft() : 0;
                            if (i5 == i4) {
                                width = (v2.getWidth() / 2) + v2.getLeft();
                            } else {
                                width = recyclerView.getWidth();
                            }
                            canvas.drawRect(width2, top, width, bottom, this.c.f5317l.f5307h);
                        }
                    }
                }
            }
        }
    }
}
