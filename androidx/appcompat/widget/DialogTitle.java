package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import e.b.b;

/* loaded from: classes.dex */
public class DialogTitle extends AppCompatTextView {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int lineCount;
        super.onMeasure(i2, i3);
        Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, b.y, 16842817, 16973892);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
        super.onMeasure(i2, i3);
    }
}
