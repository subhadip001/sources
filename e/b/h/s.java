package e.b.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.video_converter.video_compressor.R;

/* compiled from: AppCompatRatingBar.java */
/* loaded from: classes.dex */
public class s extends RatingBar {

    /* renamed from: f  reason: collision with root package name */
    public final q f1836f;

    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        u0.a(this, getContext());
        q qVar = new q(this);
        this.f1836f = qVar;
        qVar.a(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmap = this.f1836f.b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
