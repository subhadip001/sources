package e.b.h;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: AppCompatPopupWindow.java */
/* loaded from: classes.dex */
public class p extends PopupWindow {
    public p(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.b.b.t, i2, i3);
        if (obtainStyledAttributes.hasValue(2)) {
            e.i.a.Z(this, obtainStyledAttributes.getBoolean(2, false));
        }
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = e.b.a.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3) {
        super.showAsDropDown(view, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i2, int i3, int i4, int i5) {
        super.update(view, i2, i3, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3, int i4) {
        super.showAsDropDown(view, i2, i3, i4);
    }
}
