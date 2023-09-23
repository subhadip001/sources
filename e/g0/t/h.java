package e.g0.t;

import android.content.Context;
import android.text.TextUtils;
import e.x.a.c;

/* compiled from: WorkDatabase.java */
/* loaded from: classes.dex */
public class h implements c.InterfaceC0061c {
    public final /* synthetic */ Context a;

    public h(Context context) {
        this.a = context;
    }

    @Override // e.x.a.c.InterfaceC0061c
    public e.x.a.c a(c.b bVar) {
        Context context = this.a;
        String str = bVar.b;
        c.a aVar = bVar.c;
        if (aVar != null) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    return new e.x.a.f.c(context, str, aVar, true);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }
}
