package f.h.h;

import com.google.protobuf.CodedOutputStream;
import f.h.h.g0;
import java.util.Map;
import java.util.Objects;

/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes2.dex */
public class j0 implements i0 {
    @Override // f.h.h.i0
    public Object a(Object obj, Object obj2) {
        h0 h0Var = (h0) obj;
        h0 h0Var2 = (h0) obj2;
        if (!h0Var2.isEmpty()) {
            if (!h0Var.f6359f) {
                h0Var = h0Var.c();
            }
            h0Var.b();
            if (!h0Var2.isEmpty()) {
                h0Var.putAll(h0Var2);
            }
        }
        return h0Var;
    }

    @Override // f.h.h.i0
    public Object b(Object obj) {
        ((h0) obj).f6359f = false;
        return obj;
    }

    @Override // f.h.h.i0
    public g0.a<?, ?> c(Object obj) {
        return ((g0) obj).a;
    }

    @Override // f.h.h.i0
    public Map<?, ?> d(Object obj) {
        return (h0) obj;
    }

    @Override // f.h.h.i0
    public Object e(Object obj) {
        return h0.f6358g.c();
    }

    @Override // f.h.h.i0
    public int f(int i2, Object obj, Object obj2) {
        h0 h0Var = (h0) obj;
        g0 g0Var = (g0) obj2;
        int i3 = 0;
        if (!h0Var.isEmpty()) {
            for (Map.Entry entry : h0Var.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Objects.requireNonNull(g0Var);
                i3 += CodedOutputStream.p(g0.a(g0Var.a, key, value)) + CodedOutputStream.y(i2);
            }
        }
        return i3;
    }

    @Override // f.h.h.i0
    public boolean g(Object obj) {
        return !((h0) obj).f6359f;
    }

    @Override // f.h.h.i0
    public Map<?, ?> h(Object obj) {
        return (h0) obj;
    }
}
