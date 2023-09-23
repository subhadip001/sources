package f.m.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* compiled from: PicassoDrawable.java */
/* loaded from: classes2.dex */
public final class s extends BitmapDrawable {

    /* renamed from: h  reason: collision with root package name */
    public static final Paint f6873h = new Paint();
    public final boolean a;
    public final float b;
    public final Picasso.LoadedFrom c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f6874d;

    /* renamed from: e  reason: collision with root package name */
    public long f6875e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6876f;

    /* renamed from: g  reason: collision with root package name */
    public int f6877g;

    public s(Context context, Bitmap bitmap, Drawable drawable, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f6877g = 255;
        this.a = z2;
        this.b = context.getResources().getDisplayMetrics().density;
        this.c = loadedFrom;
        if ((loadedFrom == Picasso.LoadedFrom.MEMORY || z) ? false : true) {
            this.f6874d = drawable;
            this.f6876f = true;
            this.f6875e = SystemClock.uptimeMillis();
        }
    }

    public static Path a(int i2, int i3, int i4) {
        Path path = new Path();
        float f2 = i2;
        float f3 = i3;
        path.moveTo(f2, f3);
        path.lineTo(i2 + i4, f3);
        path.lineTo(f2, i3 + i4);
        return path;
    }

    public static void b(ImageView imageView, Context context, Bitmap bitmap, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new s(context, bitmap, drawable, loadedFrom, z, z2));
    }

    public static void c(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!this.f6876f) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f6875e)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f6876f = false;
                this.f6874d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f6874d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f6877g * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f6877g);
            }
        }
        if (this.a) {
            Paint paint = f6873h;
            paint.setColor(-1);
            canvas.drawPath(a(0, 0, (int) (this.b * 16.0f)), paint);
            paint.setColor(this.c.debugColor);
            canvas.drawPath(a(0, 0, (int) (this.b * 15.0f)), paint);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6874d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f6877g = i2;
        Drawable drawable = this.f6874d;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
        super.setAlpha(i2);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6874d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
