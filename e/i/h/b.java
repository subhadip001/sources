package e.i.h;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

/* compiled from: PrecomputedTextCompat.java */
/* loaded from: classes.dex */
public class b implements Spannable {
    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        throw null;
    }

    /* compiled from: PrecomputedTextCompat.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final TextPaint a;
        public final TextDirectionHeuristic b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2506d;

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            }
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = i2;
            this.f2506d = i3;
        }

        public boolean a(a aVar) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 < 23 || (this.c == aVar.c && this.f2506d == aVar.f2506d)) && this.a.getTextSize() == aVar.a.getTextSize() && this.a.getTextScaleX() == aVar.a.getTextScaleX() && this.a.getTextSkewX() == aVar.a.getTextSkewX() && this.a.getLetterSpacing() == aVar.a.getLetterSpacing() && TextUtils.equals(this.a.getFontFeatureSettings(), aVar.a.getFontFeatureSettings()) && this.a.getFlags() == aVar.a.getFlags()) {
                if (i2 >= 24) {
                    if (!this.a.getTextLocales().equals(aVar.a.getTextLocales())) {
                        return false;
                    }
                } else if (!this.a.getTextLocale().equals(aVar.a.getTextLocale())) {
                    return false;
                }
                return this.a.getTypeface() == null ? aVar.a.getTypeface() == null : this.a.getTypeface().equals(aVar.a.getTypeface());
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return a(aVar) && this.b == aVar.b;
            }
            return false;
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return Objects.hash(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f2506d));
            }
            return Objects.hash(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f2506d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder A = f.a.b.a.a.A("textSize=");
            A.append(this.a.getTextSize());
            sb.append(A.toString());
            sb.append(", textScaleX=" + this.a.getTextScaleX());
            sb.append(", textSkewX=" + this.a.getTextSkewX());
            int i2 = Build.VERSION.SDK_INT;
            StringBuilder A2 = f.a.b.a.a.A(", letterSpacing=");
            A2.append(this.a.getLetterSpacing());
            sb.append(A2.toString());
            sb.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
            if (i2 >= 24) {
                StringBuilder A3 = f.a.b.a.a.A(", textLocale=");
                A3.append(this.a.getTextLocales());
                sb.append(A3.toString());
            } else {
                StringBuilder A4 = f.a.b.a.a.A(", textLocale=");
                A4.append(this.a.getTextLocale());
                sb.append(A4.toString());
            }
            StringBuilder A5 = f.a.b.a.a.A(", typeface=");
            A5.append(this.a.getTypeface());
            sb.append(A5.toString());
            if (i2 >= 26) {
                StringBuilder A6 = f.a.b.a.a.A(", variationSettings=");
                A6.append(this.a.getFontVariationSettings());
                sb.append(A6.toString());
            }
            StringBuilder A7 = f.a.b.a.a.A(", textDir=");
            A7.append(this.b);
            sb.append(A7.toString());
            sb.append(", breakStrategy=" + this.c);
            sb.append(", hyphenationFrequency=" + this.f2506d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.f2506d = params.getHyphenationFrequency();
            int i2 = Build.VERSION.SDK_INT;
        }
    }
}
