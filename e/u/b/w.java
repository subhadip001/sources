package e.u.b;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public class w extends r {
    public final /* synthetic */ x q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Context context) {
        super(context);
        this.q = xVar;
    }

    @Override // e.u.b.r, androidx.recyclerview.widget.RecyclerView.w
    public void c(View view, RecyclerView.x xVar, RecyclerView.w.a aVar) {
        x xVar2 = this.q;
        int[] b = xVar2.b(xVar2.a.getLayoutManager(), view);
        int i2 = b[0];
        int i3 = b[1];
        int ceil = (int) Math.ceil(g(Math.max(Math.abs(i2), Math.abs(i3))) / 0.3356d);
        if (ceil > 0) {
            aVar.b(i2, i3, ceil, this.f2928j);
        }
    }

    @Override // e.u.b.r
    public float f(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // e.u.b.r
    public int g(int i2) {
        return Math.min(100, super.g(i2));
    }
}
