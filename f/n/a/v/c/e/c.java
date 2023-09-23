package f.n.a.v.c.e;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;

/* compiled from: MyContextWrapper.java */
/* loaded from: classes2.dex */
public class c extends ContextWrapper {
    public c(Context context) {
        super(context);
    }

    public static ContextWrapper a(Context context, String str) {
        Locale locale;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            locale = configuration.getLocales().get(0);
        } else {
            locale = configuration.locale;
        }
        if (!str.equals("") && !locale.getLanguage().equals(str)) {
            Locale locale2 = new Locale(str);
            Locale.setDefault(locale2);
            if (i2 >= 24) {
                configuration.setLocale(locale2);
            } else {
                configuration.locale = locale2;
            }
            context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        }
        return new c(context);
    }
}
