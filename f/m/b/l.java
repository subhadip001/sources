package f.m.b;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* compiled from: ImageViewAction.java */
/* loaded from: classes2.dex */
public class l extends a<ImageView> {

    /* renamed from: m  reason: collision with root package name */
    public e f6856m;

    public l(Picasso picasso, ImageView imageView, v vVar, int i2, int i3, int i4, Drawable drawable, String str, Object obj, e eVar, boolean z) {
        super(picasso, imageView, vVar, i2, i3, i4, null, str, null, z);
        this.f6856m = eVar;
    }

    @Override // f.m.b.a
    public void a() {
        this.f6818l = true;
        if (this.f6856m != null) {
            this.f6856m = null;
        }
    }

    @Override // f.m.b.a
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView == null) {
            return;
        }
        Picasso picasso = this.a;
        s.b(imageView, picasso.f1330e, bitmap, loadedFrom, this.f6810d, picasso.f1338m);
        e eVar = this.f6856m;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // f.m.b.a
    public void c(Exception exc) {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i2 = this.f6813g;
        if (i2 != 0) {
            imageView.setImageResource(i2);
        } else {
            Drawable drawable2 = this.f6814h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        e eVar = this.f6856m;
        if (eVar != null) {
            eVar.b(exc);
        }
    }
}
