package f.h.h;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Writer;
import java.util.Objects;

/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes2.dex */
public class i1 extends g1<h1, h1> {
    @Override // f.h.h.g1
    public void a(h1 h1Var, int i2, int i3) {
        h1Var.f((i2 << 3) | 5, Integer.valueOf(i3));
    }

    @Override // f.h.h.g1
    public void b(h1 h1Var, int i2, long j2) {
        h1Var.f((i2 << 3) | 1, Long.valueOf(j2));
    }

    @Override // f.h.h.g1
    public void c(h1 h1Var, int i2, h1 h1Var2) {
        h1Var.f((i2 << 3) | 3, h1Var2);
    }

    @Override // f.h.h.g1
    public void d(h1 h1Var, int i2, j jVar) {
        h1Var.f((i2 << 3) | 2, jVar);
    }

    @Override // f.h.h.g1
    public void e(h1 h1Var, int i2, long j2) {
        h1Var.f((i2 << 3) | 0, Long.valueOf(j2));
    }

    @Override // f.h.h.g1
    public h1 f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        h1 h1Var = generatedMessageLite.unknownFields;
        if (h1Var == h1.f6360f) {
            h1 e2 = h1.e();
            generatedMessageLite.unknownFields = e2;
            return e2;
        }
        return h1Var;
    }

    @Override // f.h.h.g1
    public h1 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // f.h.h.g1
    public int h(h1 h1Var) {
        return h1Var.b();
    }

    @Override // f.h.h.g1
    public int i(h1 h1Var) {
        h1 h1Var2 = h1Var;
        int i2 = h1Var2.f6361d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < h1Var2.a; i4++) {
            int z = CodedOutputStream.z(2, h1Var2.b[i4] >>> 3);
            i3 += CodedOutputStream.d(3, (j) h1Var2.c[i4]) + z + (CodedOutputStream.y(1) * 2);
        }
        h1Var2.f6361d = i3;
        return i3;
    }

    @Override // f.h.h.g1
    public void j(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.f6362e = false;
    }

    @Override // f.h.h.g1
    public h1 k(h1 h1Var, h1 h1Var2) {
        h1 h1Var3 = h1Var;
        h1 h1Var4 = h1Var2;
        return h1Var4.equals(h1.f6360f) ? h1Var3 : h1.d(h1Var3, h1Var4);
    }

    @Override // f.h.h.g1
    public h1 m() {
        return h1.e();
    }

    @Override // f.h.h.g1
    public void n(Object obj, h1 h1Var) {
        ((GeneratedMessageLite) obj).unknownFields = h1Var;
    }

    @Override // f.h.h.g1
    public void o(Object obj, h1 h1Var) {
        ((GeneratedMessageLite) obj).unknownFields = h1Var;
    }

    @Override // f.h.h.g1
    public boolean p(z0 z0Var) {
        return false;
    }

    @Override // f.h.h.g1
    public h1 q(h1 h1Var) {
        h1 h1Var2 = h1Var;
        h1Var2.f6362e = false;
        return h1Var2;
    }

    @Override // f.h.h.g1
    public void r(h1 h1Var, Writer writer) {
        h1 h1Var2 = h1Var;
        Objects.requireNonNull(h1Var2);
        m mVar = (m) writer;
        Objects.requireNonNull(mVar);
        if (Writer.FieldOrder.ASCENDING == Writer.FieldOrder.DESCENDING) {
            int i2 = h1Var2.a;
            while (true) {
                i2--;
                if (i2 < 0) {
                    return;
                }
                mVar.e(h1Var2.b[i2] >>> 3, h1Var2.c[i2]);
            }
        } else {
            for (int i3 = 0; i3 < h1Var2.a; i3++) {
                mVar.e(h1Var2.b[i3] >>> 3, h1Var2.c[i3]);
            }
        }
    }

    @Override // f.h.h.g1
    public void s(h1 h1Var, Writer writer) {
        h1Var.h(writer);
    }
}
