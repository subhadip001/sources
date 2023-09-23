package f.e.a.l.s.h;

import f.e.a.l.l;
import f.e.a.l.q.v;
import f.e.a.r.a;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: GifDrawableBytesTranscoder.java */
/* loaded from: classes.dex */
public class d implements e<f.e.a.l.s.g.c, byte[]> {
    @Override // f.e.a.l.s.h.e
    public v<byte[]> a(v<f.e.a.l.s.g.c> vVar, l lVar) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = vVar.get().f3496f.a.a.e().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = f.e.a.r.a.a;
        a.b bVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bVar != null && bVar.a == 0 && bVar.b == bVar.c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            ByteBuffer byteBuffer = (ByteBuffer) asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new f.e.a.l.s.d.b(bArr);
    }
}
