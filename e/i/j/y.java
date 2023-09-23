package e.i.j;

import android.view.View;
import e.i.j.z;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public class y extends z.b<Boolean> {
    public y(int i2, Class cls, int i3) {
        super(i2, cls, i3);
    }

    @Override // e.i.j.z.b
    public Boolean b(View view) {
        return Boolean.valueOf(z.m.c(view));
    }

    @Override // e.i.j.z.b
    public void c(View view, Boolean bool) {
        z.m.g(view, bool.booleanValue());
    }

    @Override // e.i.j.z.b
    public boolean f(Boolean bool, Boolean bool2) {
        return !a(bool, bool2);
    }
}
