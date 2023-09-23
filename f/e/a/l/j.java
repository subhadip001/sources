package f.e.a.l;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: Key.java */
/* loaded from: classes.dex */
public interface j {
    public static final Charset a = Charset.forName("UTF-8");

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
