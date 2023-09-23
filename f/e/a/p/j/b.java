package f.e.a.p.j;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: BitmapImageViewTarget.java */
/* loaded from: classes.dex */
public class b extends e<Bitmap> {
    public b(ImageView imageView) {
        super(imageView);
    }

    @Override // f.e.a.p.j.e
    public void a(Bitmap bitmap) {
        ((ImageView) this.f3593f).setImageBitmap(bitmap);
    }
}
