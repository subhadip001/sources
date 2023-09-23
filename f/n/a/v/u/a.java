package f.n.a.v.u;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: VideoTrimFragmentView.java */
/* loaded from: classes2.dex */
public class a extends RecyclerView.l {
    public int a;

    public a(int i2) {
        this.a = i2 / 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.x xVar) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int i2 = this.a;
        if (paddingLeft != i2) {
            recyclerView.setPadding(i2, i2, i2, i2);
            recyclerView.setClipToPadding(false);
        }
        int i3 = this.a;
        rect.top = i3;
        rect.bottom = i3;
        rect.left = i3;
        rect.right = i3;
    }
}
