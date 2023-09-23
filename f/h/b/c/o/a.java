package f.h.b.c.o;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: InsetDialogOnTouchListener.java */
/* loaded from: classes.dex */
public class a implements View.OnTouchListener {

    /* renamed from: f  reason: collision with root package name */
    public final Dialog f5356f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5357g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5358h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5359i;

    public a(Dialog dialog, Rect rect) {
        this.f5356f = dialog;
        this.f5357g = rect.left;
        this.f5358h = rect.top;
        this.f5359i = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f5357g;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f5358h;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i2 = this.f5359i;
            obtain.setLocation((-i2) - 1, (-i2) - 1);
        }
        view.performClick();
        return this.f5356f.onTouchEvent(obtain);
    }
}
