package f.l.a.c;

import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nightcode.mediapicker.presentation.views.ClippedImageView;

/* compiled from: NcItemSelectedFilesThumbBinding.java */
/* loaded from: classes2.dex */
public final class k implements e.d0.a {
    public final ConstraintLayout a;
    public final ImageButton b;
    public final ClippedImageView c;

    public k(ConstraintLayout constraintLayout, ImageButton imageButton, ClippedImageView clippedImageView) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = clippedImageView;
    }

    @Override // e.d0.a
    public View b() {
        return this.a;
    }
}
