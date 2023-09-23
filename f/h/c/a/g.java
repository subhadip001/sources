package f.h.c.a;

import java.util.Objects;

/* compiled from: Joiner.java */
/* loaded from: classes.dex */
public class g {
    public final String a;

    public g(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }

    public CharSequence a(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
