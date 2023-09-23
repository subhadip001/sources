package f.h.b.a.i.s;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MetadataBackendRegistry.java */
/* loaded from: classes.dex */
public class j implements e {
    public final a a;
    public final h b;
    public final Map<String, l> c;

    /* compiled from: MetadataBackendRegistry.java */
    /* loaded from: classes.dex */
    public static class a {
        public final Context a;
        public Map<String, String> b = null;

        public a(Context context) {
            this.a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public f.h.b.a.i.s.d a(java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.b.a.i.s.j.a.a(java.lang.String):f.h.b.a.i.s.d");
        }
    }

    public j(Context context, h hVar) {
        a aVar = new a(context);
        this.c = new HashMap();
        this.a = aVar;
        this.b = hVar;
    }

    @Override // f.h.b.a.i.s.e
    public synchronized l a(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        d a2 = this.a.a(str);
        if (a2 == null) {
            return null;
        }
        h hVar = this.b;
        l create = a2.create(new c(hVar.a, hVar.b, hVar.c, str));
        this.c.put(str, create);
        return create;
    }
}
