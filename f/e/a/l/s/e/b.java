package f.e.a.l.s.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import e.i.c.d.j;

/* compiled from: DrawableDecoderCompat.java */
/* loaded from: classes.dex */
public final class b {
    public static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (a) {
                return e.b.a.b(theme != null ? new e.b.g.c(context2, theme) : context2, i2);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return e.i.c.a.getDrawable(context2, i2);
            }
            throw e2;
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = j.a;
        return resources.getDrawable(i2, theme);
    }
}
