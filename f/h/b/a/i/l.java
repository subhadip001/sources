package f.h.b.a.i;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import f.h.b.a.i.d;

/* compiled from: TransportContext.java */
/* loaded from: classes.dex */
public abstract class l {

    /* compiled from: TransportContext.java */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract l a();

        public abstract a b(String str);

        public abstract a c(Priority priority);
    }

    public static a a() {
        d.b bVar = new d.b();
        bVar.c(Priority.DEFAULT);
        return bVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract Priority d();

    public l e(Priority priority) {
        a a2 = a();
        a2.b(b());
        a2.c(priority);
        d.b bVar = (d.b) a2;
        bVar.b = c();
        return bVar.a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
