package g.a.v0;

import com.google.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* compiled from: JsonParser.java */
/* loaded from: classes2.dex */
public final class h1 {
    public static final Logger a = Logger.getLogger(h1.class.getName());

    public static Object a(f.h.f.b0.a aVar) {
        boolean z;
        f.h.b.c.a.C(aVar.F(), "unexpected end of JSON");
        int ordinal = aVar.s0().ordinal();
        if (ordinal == 0) {
            aVar.a();
            ArrayList arrayList = new ArrayList();
            while (aVar.F()) {
                arrayList.add(a(aVar));
            }
            z = aVar.s0() == JsonToken.END_ARRAY;
            StringBuilder A = f.a.b.a.a.A("Bad token: ");
            A.append(aVar.C());
            f.h.b.c.a.C(z, A.toString());
            aVar.p();
            return Collections.unmodifiableList(arrayList);
        } else if (ordinal == 2) {
            aVar.f();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (aVar.F()) {
                linkedHashMap.put(aVar.d0(), a(aVar));
            }
            z = aVar.s0() == JsonToken.END_OBJECT;
            StringBuilder A2 = f.a.b.a.a.A("Bad token: ");
            A2.append(aVar.C());
            f.h.b.c.a.C(z, A2.toString());
            aVar.q();
            return Collections.unmodifiableMap(linkedHashMap);
        } else if (ordinal != 5) {
            if (ordinal != 6) {
                if (ordinal != 7) {
                    if (ordinal == 8) {
                        aVar.i0();
                        return null;
                    }
                    StringBuilder A3 = f.a.b.a.a.A("Bad token: ");
                    A3.append(aVar.C());
                    throw new IllegalStateException(A3.toString());
                }
                return Boolean.valueOf(aVar.O());
            }
            return Double.valueOf(aVar.T());
        } else {
            return aVar.q0();
        }
    }
}
