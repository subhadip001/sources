package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i2) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.a = i2;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i2) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.b = i2;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f2) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.c = f2;
        setLayoutParams(aVar);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
