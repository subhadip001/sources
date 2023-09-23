package e.i.f;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListCompat.java */
/* loaded from: classes.dex */
public final class d {
    public static final /* synthetic */ int b = 0;
    public f a;

    static {
        a(new Locale[0]);
    }

    public d(f fVar) {
        this.a = fVar;
    }

    public static d a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new d(new g(new LocaleList(localeArr)));
        }
        return new d(new e(localeArr));
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && this.a.equals(((d) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
