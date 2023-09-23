package f.h.b.c.s;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: VisibilityAwareImageButton.java */
/* loaded from: classes.dex */
public class y extends ImageButton {

    /* renamed from: f  reason: collision with root package name */
    public int f5445f;

    public y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5445f = getVisibility();
    }

    public final void b(int i2, boolean z) {
        super.setVisibility(i2);
        if (z) {
            this.f5445f = i2;
        }
    }

    public final int getUserSetVisibility() {
        return this.f5445f;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        this.f5445f = i2;
    }

    public y(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f5445f = getVisibility();
    }
}
