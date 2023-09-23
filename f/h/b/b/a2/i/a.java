package f.h.b.b.a2.i;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import f.h.b.b.a2.d;
import f.h.b.b.a2.g;
import f.h.b.b.g2.t;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: EventMessageDecoder.java */
/* loaded from: classes.dex */
public final class a extends g {
    @Override // f.h.b.b.a2.g
    public Metadata b(d dVar, ByteBuffer byteBuffer) {
        t tVar = new t(byteBuffer.array(), byteBuffer.limit());
        String m2 = tVar.m();
        Objects.requireNonNull(m2);
        String m3 = tVar.m();
        Objects.requireNonNull(m3);
        return new Metadata(new EventMessage(m2, m3, tVar.s(), tVar.s(), Arrays.copyOfRange(tVar.a, tVar.b, tVar.c)));
    }
}
