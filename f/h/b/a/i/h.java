package f.h.b.a.i;

import f.h.b.a.i.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: EventInternal.java */
/* loaded from: classes.dex */
public abstract class h {

    /* compiled from: EventInternal.java */
    /* loaded from: classes.dex */
    public static abstract class a {
        public final a a(String str, String str2) {
            c().put(str, str2);
            return this;
        }

        public abstract h b();

        public abstract Map<String, String> c();

        public abstract a d(g gVar);

        public abstract a e(long j2);

        public abstract a f(String str);

        public abstract a g(long j2);
    }

    public static a a() {
        c.b bVar = new c.b();
        bVar.f3699f = new HashMap();
        return bVar;
    }

    public final String b(String str) {
        String str2 = c().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> c();

    public abstract Integer d();

    public abstract g e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String h();

    public abstract long i();

    public a j() {
        c.b bVar = new c.b();
        bVar.f(h());
        bVar.b = d();
        bVar.d(e());
        bVar.e(f());
        bVar.g(i());
        bVar.f3699f = new HashMap(c());
        return bVar;
    }
}
