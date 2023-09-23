package f.h.f;

import com.google.gson.stream.JsonToken;

/* compiled from: Gson.java */
/* loaded from: classes2.dex */
public class g extends w<Number> {
    @Override // f.h.f.w
    public Number a(f.h.f.b0.a aVar) {
        if (aVar.s0() == JsonToken.NULL) {
            aVar.i0();
            return null;
        }
        return Long.valueOf(aVar.X());
    }

    @Override // f.h.f.w
    public void b(f.h.f.b0.b bVar, Number number) {
        Number number2 = number;
        if (number2 == null) {
            bVar.F();
        } else {
            bVar.g0(number2.toString());
        }
    }
}
