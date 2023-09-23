package e.g.c;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public class f extends View {

    /* renamed from: f  reason: collision with root package name */
    public int f2176f;

    /* renamed from: g  reason: collision with root package name */
    public View f2177g;

    /* renamed from: h  reason: collision with root package name */
    public int f2178h;

    public void a() {
        if (this.f2177g == null) {
            return;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.f2177g.getLayoutParams();
        aVar2.q0.i0 = 0;
        ConstraintWidget.DimensionBehaviour m2 = aVar.q0.m();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        if (m2 != dimensionBehaviour) {
            aVar.q0.T(aVar2.q0.u());
        }
        if (aVar.q0.t() != dimensionBehaviour) {
            aVar.q0.O(aVar2.q0.l());
        }
        aVar2.q0.i0 = 8;
    }

    public View getContent() {
        return this.f2177g;
    }

    public int getEmptyVisibility() {
        return this.f2178h;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i2) {
        View findViewById;
        if (this.f2176f == i2) {
            return;
        }
        View view = this.f2177g;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.a) this.f2177g.getLayoutParams()).f0 = false;
            this.f2177g = null;
        }
        this.f2176f = i2;
        if (i2 == -1 || (findViewById = ((View) getParent()).findViewById(i2)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i2) {
        this.f2178h = i2;
    }
}
