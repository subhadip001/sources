package e.l.a;

import android.content.Context;
import android.net.Uri;

/* compiled from: DocumentFile.java */
/* loaded from: classes.dex */
public abstract class a {
    public a(a aVar) {
    }

    public static a b(Context context, Uri uri) {
        return new b(null, context, uri);
    }

    public abstract boolean a();

    public abstract String c();

    public abstract Uri d();

    public abstract long e();
}
