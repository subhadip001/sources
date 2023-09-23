package g.a;

import com.google.common.io.BaseEncoding;
import g.a.i0;
import java.nio.charset.Charset;

/* compiled from: InternalMetadata.java */
/* loaded from: classes2.dex */
public final class z {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final BaseEncoding b = i0.f7538e;

    /* compiled from: InternalMetadata.java */
    /* loaded from: classes2.dex */
    public interface a<T> extends i0.i<T> {
    }

    public static <T> i0.f<T> a(String str, a<T> aVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return i0.f.b(str, z, aVar);
    }
}
