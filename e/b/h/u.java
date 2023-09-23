package e.b.h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.video_converter.video_compressor.R;

/* compiled from: AppCompatSeekBar.java */
/* loaded from: classes.dex */
public class u extends SeekBar {

    /* renamed from: f  reason: collision with root package name */
    public final v f1845f;

    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        u0.a(this, getContext());
        v vVar = new v(this);
        this.f1845f = vVar;
        vVar.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        v vVar = this.f1845f;
        Drawable drawable = vVar.f1851e;
        if (drawable != null && drawable.isStateful() && drawable.setState(vVar.f1850d.getDrawableState())) {
            vVar.f1850d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1845f.f1851e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1845f.d(canvas);
    }
}
