package g.a.v0;

import g.a.i0;
import g.a.v0.a;
import g.a.z;
import io.grpc.Status;
import io.grpc.internal.GrpcUtil;
import java.nio.charset.Charset;

/* compiled from: Http2ClientStreamTransportState.java */
/* loaded from: classes2.dex */
public abstract class v0 extends a.c {
    public static final z.a<Integer> v;
    public static final i0.f<Integer> w;
    public Status r;
    public g.a.i0 s;
    public Charset t;
    public boolean u;

    /* compiled from: Http2ClientStreamTransportState.java */
    /* loaded from: classes2.dex */
    public class a implements z.a<Integer> {
        @Override // g.a.i0.i
        public byte[] a(Object obj) {
            Integer num = (Integer) obj;
            throw new UnsupportedOperationException();
        }

        @Override // g.a.i0.i
        public Object b(byte[] bArr) {
            if (bArr.length >= 3) {
                int i2 = (bArr[1] - 48) * 10;
                return Integer.valueOf((bArr[2] - 48) + i2 + ((bArr[0] - 48) * 100));
            }
            StringBuilder A = f.a.b.a.a.A("Malformed status code ");
            A.append(new String(bArr, g.a.z.a));
            throw new NumberFormatException(A.toString());
        }
    }

    static {
        a aVar = new a();
        v = aVar;
        w = g.a.z.a(":status", aVar);
    }

    public v0(int i2, r2 r2Var, x2 x2Var) {
        super(i2, r2Var, x2Var);
        this.t = f.h.c.a.c.c;
    }

    public static Charset j(g.a.i0 i0Var) {
        String str = (String) i0Var.d(GrpcUtil.f8702g);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return f.h.c.a.c.c;
    }

    public final Status k(g.a.i0 i0Var) {
        char charAt;
        Integer num = (Integer) i0Var.d(w);
        if (num == null) {
            return Status.f8692m.h("Missing HTTP status code");
        }
        String str = (String) i0Var.d(GrpcUtil.f8702g);
        boolean z = false;
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';')) {
                z = true;
            }
        }
        if (z) {
            return null;
        }
        Status f2 = GrpcUtil.f(num.intValue());
        return f2.b("invalid content-type: " + str);
    }
}
