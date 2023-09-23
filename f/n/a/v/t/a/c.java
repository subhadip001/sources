package f.n.a.v.t.a;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import e.u.b.o;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SimpleItemTouchHelperCallback.java */
/* loaded from: classes2.dex */
public class c extends o.d {

    /* renamed from: d  reason: collision with root package name */
    public final a f7466d;

    public c(a aVar) {
        this.f7466d = aVar;
    }

    @Override // e.u.b.o.d
    public void a(RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        View view = a0Var.itemView;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            AtomicInteger atomicInteger = z.a;
            z.i.s(view, floatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        a0Var.itemView.setAlpha(1.0f);
        if (a0Var instanceof b) {
            ((b) a0Var).a();
        }
    }

    @Override // e.u.b.o.d
    public void f(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var, float f2, float f3, int i2, boolean z) {
        if (i2 == 1) {
            a0Var.itemView.setAlpha(1.0f - (Math.abs(f2) / a0Var.itemView.getWidth()));
            a0Var.itemView.setTranslationX(f2);
            return;
        }
        View view = a0Var.itemView;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            AtomicInteger atomicInteger = z.a;
            Float valueOf = Float.valueOf(z.i.i(view));
            int childCount = recyclerView.getChildCount();
            float f4 = 0.0f;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                if (childAt != view) {
                    AtomicInteger atomicInteger2 = z.a;
                    float i4 = z.i.i(childAt);
                    if (i4 > f4) {
                        f4 = i4;
                    }
                }
            }
            z.i.s(view, f4 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }
}
