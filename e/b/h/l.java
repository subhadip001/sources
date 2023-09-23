package e.b.h;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: AppCompatEmojiTextHelper.java */
/* loaded from: classes.dex */
public class l {
    public final TextView a;
    public final e.n.b.f b;

    public l(TextView textView) {
        this.a = textView;
        this.b = new e.n.b.f(textView, false);
    }

    public void a(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, e.b.b.f1463i, i2, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            b(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void b(boolean z) {
        this.b.a.d(z);
    }
}
