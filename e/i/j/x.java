package e.i.j;

import android.text.TextUtils;
import android.view.View;
import e.i.j.z;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public class x extends z.b<CharSequence> {
    public x(int i2, Class cls, int i3, int i4) {
        super(i2, cls, i3, i4);
    }

    @Override // e.i.j.z.b
    public CharSequence b(View view) {
        return z.o.a(view);
    }

    @Override // e.i.j.z.b
    public void c(View view, CharSequence charSequence) {
        z.o.b(view, charSequence);
    }

    @Override // e.i.j.z.b
    public boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
