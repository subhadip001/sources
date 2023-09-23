package f.h.b.c.n;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SmoothCalendarLayoutManager.java */
/* loaded from: classes.dex */
public class v extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager.java */
    /* loaded from: classes.dex */
    public class a extends e.u.b.r {
        public a(v vVar, Context context) {
            super(context);
        }

        @Override // e.u.b.r
        public float f(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public v(Context context, int i2, boolean z) {
        super(i2, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void Y0(RecyclerView recyclerView, RecyclerView.x xVar, int i2) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.a = i2;
        Z0(aVar);
    }
}
