package e.i.j;

import android.text.TextUtils;
import android.view.View;
import e.i.j.z;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public class w extends z.b<CharSequence> {
    public w(int i2, Class cls, int i3, int i4) {
        super(i2, cls, i3, i4);
    }

    @Override // e.i.j.z.b
    public CharSequence b(View view) {
        return z.m.b(view);
    }

    @Override // e.i.j.z.b
    public void c(View view, CharSequence charSequence) {
        z.m.h(view, charSequence);
    }

    @Override // e.i.j.z.b
    public boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
