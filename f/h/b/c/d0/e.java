package f.h.b.c.d0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Objects;

/* compiled from: TimePickerView.java */
/* loaded from: classes.dex */
public class e extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TimePickerView f5246f;

    public e(TimePickerView timePickerView) {
        this.f5246f = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        TimePickerView timePickerView = this.f5246f;
        int i2 = TimePickerView.D;
        Objects.requireNonNull(timePickerView);
        return false;
    }
}
