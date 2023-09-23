package f.h.h;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Writer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: CodedOutputStreamWriter.java */
/* loaded from: classes2.dex */
public final class m implements Writer {
    public final CodedOutputStream a;

    public m(CodedOutputStream codedOutputStream) {
        Charset charset = y.a;
        this.a = codedOutputStream;
        codedOutputStream.a = this;
    }

    public void a(int i2, double d2) {
        CodedOutputStream codedOutputStream = this.a;
        Objects.requireNonNull(codedOutputStream);
        codedOutputStream.O(i2, Double.doubleToRawLongBits(d2));
    }

    public void b(int i2, float f2) {
        CodedOutputStream codedOutputStream = this.a;
        Objects.requireNonNull(codedOutputStream);
        codedOutputStream.M(i2, Float.floatToRawIntBits(f2));
    }

    public void c(int i2, Object obj, a1 a1Var) {
        CodedOutputStream codedOutputStream = this.a;
        codedOutputStream.Y(i2, 3);
        a1Var.b((n0) obj, codedOutputStream.a);
        codedOutputStream.Y(i2, 4);
    }

    public void d(int i2, Object obj, a1 a1Var) {
        this.a.S(i2, (n0) obj, a1Var);
    }

    public final void e(int i2, Object obj) {
        if (obj instanceof j) {
            this.a.V(i2, (j) obj);
        } else {
            this.a.U(i2, (n0) obj);
        }
    }

    public void f(int i2, int i3) {
        this.a.Z(i2, CodedOutputStream.D(i3));
    }

    public void g(int i2, long j2) {
        this.a.b0(i2, CodedOutputStream.E(j2));
    }
}
