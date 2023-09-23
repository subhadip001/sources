package f.h.b.b.a2;

import com.google.android.exoplayer2.metadata.Metadata;
import f.h.b.b.e2.j;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: SimpleMetadataDecoder.java */
/* loaded from: classes.dex */
public abstract class g implements b {
    @Override // f.h.b.b.a2.b
    public final Metadata a(d dVar) {
        ByteBuffer byteBuffer = dVar.f752h;
        Objects.requireNonNull(byteBuffer);
        j.c(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.l()) {
            return null;
        }
        return b(dVar, byteBuffer);
    }

    public abstract Metadata b(d dVar, ByteBuffer byteBuffer);
}
