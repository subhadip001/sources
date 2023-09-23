package e.i.f;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper.java */
/* loaded from: classes.dex */
public final class g implements f {
    public final LocaleList a;

    public g(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // e.i.f.f
    public Object a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this.a.equals(((f) obj).a());
    }

    @Override // e.i.f.f
    public Locale get(int i2) {
        return this.a.get(i2);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
