package e.b.h;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* compiled from: AppCompatProgressBarHelper.java */
/* loaded from: classes.dex */
public class q {
    public static final int[] c = {16843067, 16843068};
    public final ProgressBar a;
    public Bitmap b;

    public q(ProgressBar progressBar) {
        this.a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i2) {
        z0 q = z0.q(this.a.getContext(), attributeSet, c, i2, 0);
        Drawable h2 = q.h(0);
        if (h2 != null) {
            ProgressBar progressBar = this.a;
            if (h2 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) h2;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i3 = 0; i3 < numberOfFrames; i3++) {
                    Drawable b = b(animationDrawable.getFrame(i3), true);
                    b.setLevel(10000);
                    animationDrawable2.addFrame(b, animationDrawable.getDuration(i3));
                }
                animationDrawable2.setLevel(10000);
                h2 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(h2);
        }
        Drawable h3 = q.h(1);
        if (h3 != null) {
            this.a.setProgressDrawable(b(h3, false));
        }
        q.b.recycle();
    }

    public Drawable b(Drawable drawable, boolean z) {
        if (drawable instanceof e.i.d.m.b) {
            e.i.d.m.b bVar = (e.i.d.m.b) drawable;
            Drawable b = bVar.b();
            if (b != null) {
                bVar.a(b(b, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                int id = layerDrawable.getId(i2);
                drawableArr[i2] = b(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i3 = 0; i3 < numberOfLayers; i3++) {
                layerDrawable2.setId(i3, layerDrawable.getId(i3));
                if (Build.VERSION.SDK_INT >= 23) {
                    layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
                    layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
                    layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
                    layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
                    layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
                    layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
                    layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
                    layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
                    layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.b == null) {
                this.b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}
