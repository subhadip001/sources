package f.e.a.l.s.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* compiled from: DrawableToBitmapConverter.java */
/* loaded from: classes.dex */
public final class l {
    public static final f.e.a.l.q.b0.d a = new a();

    /* compiled from: DrawableToBitmapConverter.java */
    /* loaded from: classes.dex */
    public class a extends f.e.a.l.q.b0.e {
        @Override // f.e.a.l.q.b0.e, f.e.a.l.q.b0.d
        public void d(Bitmap bitmap) {
        }
    }

    public static f.e.a.l.q.v<Bitmap> a(f.e.a.l.q.b0.d dVar, Drawable drawable, int i2, int i3) {
        Drawable current = drawable.getCurrent();
        boolean z = false;
        Bitmap bitmap = null;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i2 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                }
            } else if (i3 == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else {
                if (current.getIntrinsicWidth() > 0) {
                    i2 = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i3 = current.getIntrinsicHeight();
                }
                Lock lock = x.f3482d;
                lock.lock();
                Bitmap e2 = dVar.e(i2, i3, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(e2);
                    current.setBounds(0, 0, i2, i3);
                    current.draw(canvas);
                    canvas.setBitmap(null);
                    lock.unlock();
                    bitmap = e2;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }
            z = true;
        }
        if (!z) {
            dVar = a;
        }
        return e.d(bitmap, dVar);
    }
}
