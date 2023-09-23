package e.b.h;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: TintContextWrapper.java */
/* loaded from: classes.dex */
public class w0 extends ContextWrapper {
    public static final Object a = new Object();

    public static Context a(Context context) {
        if (!(context instanceof w0) && !(context.getResources() instanceof y0)) {
            context.getResources();
            int i2 = e1.a;
        }
        return context;
    }
}
