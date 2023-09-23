package e.b.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* compiled from: AppCompatCheckedTextViewHelper.java */
/* loaded from: classes.dex */
public class g {
    public final CheckedTextView a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1772d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1773e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1774f;

    public g(CheckedTextView checkedTextView) {
        this.a = checkedTextView;
    }

    public void a() {
        Drawable checkMarkDrawable = this.a.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1772d || this.f1773e) {
                Drawable mutate = e.i.a.l0(checkMarkDrawable).mutate();
                if (this.f1772d) {
                    mutate.setTintList(this.b);
                }
                if (this.f1773e) {
                    mutate.setTintMode(this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.a.getDrawableState());
                }
                this.a.setCheckMarkDrawable(mutate);
            }
        }
    }
}
