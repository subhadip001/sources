package f.e.a.p.j;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: DrawableImageViewTarget.java */
/* loaded from: classes.dex */
public class d extends e<Drawable> {
    public d(ImageView imageView) {
        super(imageView);
    }

    @Override // f.e.a.p.j.e
    public void a(Drawable drawable) {
        ((ImageView) this.f3593f).setImageDrawable(drawable);
    }
}
