package e.n.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.Objects;

/* compiled from: TypefaceEmojiSpan.java */
/* loaded from: classes.dex */
public final class p extends l {
    public p(j jVar) {
        super(jVar);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        Objects.requireNonNull(h.a());
        j jVar = this.f2630g;
        Typeface typeface = jVar.b.f2641d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i7 = jVar.a * 2;
        canvas.drawText(jVar.b.b, i7, 2, f2, i5, paint);
        paint.setTypeface(typeface2);
    }
}
