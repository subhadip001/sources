package g.a.w0.p.i;

import io.grpc.okhttp.internal.framed.ErrorCode;
import java.io.Closeable;
import java.util.List;

/* compiled from: FrameWriter.java */
/* loaded from: classes2.dex */
public interface b extends Closeable {
    void B(int i2, long j2);

    void H(g gVar);

    void L(g gVar);

    void P(boolean z, int i2, int i3);

    int f0();

    void flush();

    void h0(boolean z, boolean z2, int i2, int i3, List<c> list);

    void o0(int i2, ErrorCode errorCode, byte[] bArr);

    void p0(int i2, ErrorCode errorCode);

    void u();

    void x(boolean z, int i2, l.f fVar, int i3);
}
