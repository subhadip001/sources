package f.e.a.l.s.c;

import com.bumptech.glide.load.ImageHeaderParser;
import f.e.a.r.a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ExifInterfaceImageHeaderParser.java */
/* loaded from: classes.dex */
public final class n implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(ByteBuffer byteBuffer, f.e.a.l.q.b0.b bVar) {
        AtomicReference<byte[]> atomicReference = f.e.a.r.a.a;
        return d(new a.C0092a(byteBuffer), bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(InputStream inputStream, f.e.a.l.q.b0.b bVar) {
        int c = new e.o.a.a(inputStream).c("Orientation", 1);
        if (c == 0) {
            return -1;
        }
        return c;
    }
}
