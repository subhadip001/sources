package g.a.x0.a;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.InvalidProtocolBufferException;
import f.h.h.k;
import f.h.h.n0;
import f.h.h.q;
import f.h.h.u0;
import g.a.b0;
import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: ProtoLiteUtils.java */
/* loaded from: classes2.dex */
public final class b {
    public static volatile q a = q.a();

    /* compiled from: ProtoLiteUtils.java */
    /* loaded from: classes2.dex */
    public static final class a<T extends n0> implements Object<T> {
        public static final ThreadLocal<Reference<byte[]>> c = new ThreadLocal<>();
        public final u0<T> a;
        public final T b;

        public a(T t) {
            this.b = t;
            this.a = (u0<T>) t.getParserForType();
        }

        public Object a(InputStream inputStream) {
            byte[] bArr;
            if ((inputStream instanceof g.a.x0.a.a) && ((g.a.x0.a.a) inputStream).f8112g == this.a) {
                try {
                    n0 n0Var = ((g.a.x0.a.a) inputStream).f8111f;
                    if (n0Var != null) {
                        return n0Var;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
            k kVar = null;
            try {
                if (inputStream instanceof b0) {
                    int available = inputStream.available();
                    if (available > 0 && available <= 4194304) {
                        ThreadLocal<Reference<byte[]>> threadLocal = c;
                        Reference<byte[]> reference = threadLocal.get();
                        if (reference == null || (bArr = reference.get()) == null || bArr.length < available) {
                            bArr = new byte[available];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i2 = available;
                        while (i2 > 0) {
                            int read = inputStream.read(bArr, available - i2, i2);
                            if (read == -1) {
                                break;
                            }
                            i2 -= read;
                        }
                        if (i2 == 0) {
                            kVar = k.h(bArr, 0, available, false);
                        } else {
                            throw new RuntimeException("size inaccurate: " + available + " != " + (available - i2));
                        }
                    } else if (available == 0) {
                        return this.b;
                    }
                }
                if (kVar == null) {
                    kVar = k.f(inputStream);
                }
                kVar.c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                try {
                    T b = this.a.b(kVar, b.a);
                    try {
                        kVar.a(0);
                        return b;
                    } catch (InvalidProtocolBufferException e2) {
                        e2.f1303f = b;
                        throw e2;
                    }
                } catch (InvalidProtocolBufferException e3) {
                    throw Status.f8692m.h("Invalid protobuf byte sequence").g(e3).a();
                }
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }

        public InputStream b(Object obj) {
            return new g.a.x0.a.a((n0) obj, this.a);
        }
    }
}
