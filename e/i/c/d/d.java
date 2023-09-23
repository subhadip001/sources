package e.i.c.d;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* compiled from: ComplexColorCompat.java */
/* loaded from: classes.dex */
public final class d {
    public final Shader a;
    public final ColorStateList b;
    public int c;

    public d(Shader shader, ColorStateList colorStateList, int i2) {
        this.a = shader;
        this.b = colorStateList;
        this.c = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c4, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e.i.c.d.d a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.c.d.d.a(android.content.res.Resources, int, android.content.res.Resources$Theme):e.i.c.d.d");
    }

    public boolean b() {
        return this.a != null;
    }

    public boolean c() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful();
    }

    public boolean d(int[] iArr) {
        if (c()) {
            ColorStateList colorStateList = this.b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.c) {
                this.c = colorForState;
                return true;
            }
        }
        return false;
    }
}
