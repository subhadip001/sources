package f.h.b.c.s;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.video_converter.video_compressor.R;

/* compiled from: ThemeEnforcement.java */
/* loaded from: classes.dex */
public final class r {
    public static final int[] a = {R.attr.colorPrimary};
    public static final int[] b = {R.attr.colorPrimaryVariant};

    public static void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.h.b.c.b.K, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, b, "Theme.MaterialComponents");
            }
        }
        c(context, a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r0.getResourceId(0, -1) != (-1)) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = f.h.b.c.b.K
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            r1 = -1
            if (r9 == 0) goto L34
            int r3 = r9.length
            if (r3 != 0) goto L19
            goto L34
        L19:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = 0
        L1f:
            if (r6 >= r5) goto L30
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r1)
            if (r7 != r1) goto L2d
            r4.recycle()
            goto L3b
        L2d:
            int r6 = r6 + 1
            goto L1f
        L30:
            r4.recycle()
            goto L3a
        L34:
            int r4 = r0.getResourceId(r2, r1)
            if (r4 == r1) goto L3b
        L3a:
            r2 = 1
        L3b:
            r0.recycle()
            if (r2 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.c.s.r.b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < iArr.length) {
                if (!obtainStyledAttributes.hasValue(i2)) {
                    obtainStyledAttributes.recycle();
                    break;
                }
                i2++;
            } else {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            }
        }
        if (!z) {
            throw new IllegalArgumentException(f.a.b.a.a.q("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    public static TypedArray d(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        a(context, attributeSet, i2, i3);
        b(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }
}
