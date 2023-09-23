package f.h.b.c.d0;

import android.view.ViewTreeObserver;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;

/* compiled from: ClockFaceView.java */
/* loaded from: classes.dex */
public class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f5243f;

    public a(ClockFaceView clockFaceView) {
        this.f5243f = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        if (this.f5243f.isShown()) {
            this.f5243f.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView clockFaceView = this.f5243f;
            int height = ((this.f5243f.getHeight() / 2) - clockFaceView.C.f1250l) - clockFaceView.J;
            if (height != clockFaceView.A) {
                clockFaceView.A = height;
                clockFaceView.s();
                ClockHandView clockHandView = clockFaceView.C;
                clockHandView.t = clockFaceView.A;
                clockHandView.invalidate();
            }
            return true;
        }
        return true;
    }
}
