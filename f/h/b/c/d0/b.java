package f.h.b.c.d0;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.timepicker.ClockFaceView;
import com.video_converter.video_compressor.R;
import e.i.j.h0.d;

/* compiled from: ClockFaceView.java */
/* loaded from: classes.dex */
public class b extends e.i.j.c {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f5244d;

    public b(ClockFaceView clockFaceView) {
        this.f5244d = clockFaceView;
    }

    @Override // e.i.j.c
    public void d(View view, e.i.j.h0.d dVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            dVar.q(this.f5244d.F.get(intValue - 1));
        }
        dVar.n(d.c.a(0, 1, intValue, 1, false, view.isSelected()));
        dVar.a.setClickable(true);
        dVar.a(d.a.f2534g);
    }

    @Override // e.i.j.c
    public boolean g(View view, int i2, Bundle bundle) {
        if (i2 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            float x = view.getX() + (view.getWidth() / 2.0f);
            float height = (view.getHeight() / 2.0f) + view.getY();
            this.f5244d.C.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x, height, 0));
            this.f5244d.C.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x, height, 0));
            return true;
        }
        return super.g(view, i2, bundle);
    }
}
