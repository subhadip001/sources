package f.h.c.a;

import java.nio.charset.Charset;

/* compiled from: Charsets.java */
/* loaded from: classes.dex */
public final class c {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("ISO-8859-1");
    public static final Charset c = Charset.forName("UTF-8");

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f5839d;

    static {
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        f5839d = Charset.forName("UTF-16");
    }
}
