package e.l.a;

import android.content.Context;
import android.net.Uri;

/* compiled from: SingleDocumentFile.java */
/* loaded from: classes.dex */
public class b extends a {
    public Context a;
    public Uri b;

    public b(a aVar, Context context, Uri uri) {
        super(null);
        this.a = context;
        this.b = uri;
    }

    @Override // e.l.a.a
    public boolean a() {
        return e.i.a.x(this.a, this.b);
    }

    @Override // e.l.a.a
    public String c() {
        return e.i.a.B(this.a, this.b);
    }

    @Override // e.l.a.a
    public Uri d() {
        return this.b;
    }

    @Override // e.l.a.a
    public long e() {
        return e.i.a.L(this.a, this.b);
    }
}
