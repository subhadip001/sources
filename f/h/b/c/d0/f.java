package f.h.b.c.d0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.timepicker.TimePickerView;

/* compiled from: TimePickerView.java */
/* loaded from: classes.dex */
public class f implements View.OnTouchListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f5247f;

    public f(TimePickerView timePickerView, GestureDetector gestureDetector) {
        this.f5247f = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f5247f.onTouchEvent(motionEvent);
        }
        return false;
    }
}
