package f.h.b.c.b0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* compiled from: CutoutDrawable.java */
/* loaded from: classes.dex */
public class g extends f.h.b.c.y.g {
    public final Paint E;
    public final RectF F;

    public g() {
        this(null);
    }

    public void A(float f2, float f3, float f4, float f5) {
        RectF rectF = this.F;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }

    @Override // f.h.b.c.y.g
    public void h(Canvas canvas) {
        if (this.F.isEmpty()) {
            super.h(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.F);
        } else {
            canvas.clipRect(this.F, Region.Op.DIFFERENCE);
        }
        super.h(canvas);
        canvas.restore();
    }

    public g(f.h.b.c.y.j jVar) {
        super(jVar == null ? new f.h.b.c.y.j() : jVar);
        Paint paint = new Paint(1);
        this.E = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.F = new RectF();
    }
}
