package f.n.a.o;

import android.net.Uri;
import f.h.f.n;
import f.h.f.o;
import f.h.f.p;
import f.h.f.s;
import f.h.f.t;
import f.h.f.u;
import java.lang.reflect.Type;

/* compiled from: UriInterfaceAdapter.java */
/* loaded from: classes2.dex */
public class i implements o<Uri>, u<Uri> {
    @Override // f.h.f.o
    public Uri a(p pVar, Type type, n nVar) {
        return Uri.parse(pVar.c());
    }

    @Override // f.h.f.u
    public p b(Uri uri, Type type, t tVar) {
        return new s(uri.toString());
    }
}
