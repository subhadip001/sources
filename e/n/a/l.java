package e.n.a;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: EmojiSpan.java */
/* loaded from: classes.dex */
public abstract class l extends ReplacementSpan {

    /* renamed from: g  reason: collision with root package name */
    public final j f2630g;

    /* renamed from: f  reason: collision with root package name */
    public final Paint.FontMetricsInt f2629f = new Paint.FontMetricsInt();

    /* renamed from: h  reason: collision with root package name */
    public short f2631h = -1;

    /* renamed from: i  reason: collision with root package name */
    public float f2632i = 1.0f;

    public l(j jVar) {
        e.i.a.i(jVar, "metadata cannot be null");
        this.f2630g = jVar;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f2629f);
        Paint.FontMetricsInt fontMetricsInt2 = this.f2629f;
        this.f2632i = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f2630g.c();
        this.f2630g.c();
        e.n.a.q.a e2 = this.f2630g.e();
        int a = e2.a(12);
        short s = (short) ((a != 0 ? e2.b.getShort(a + e2.a) : (short) 0) * this.f2632i);
        this.f2631h = s;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f2629f;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s;
    }
}
