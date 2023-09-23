package f.e.a.l;

import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes.dex */
public class c implements i {
    public final /* synthetic */ ByteBuffer a;

    public c(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // f.e.a.l.i
    public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.a(this.a);
        } finally {
            f.e.a.r.a.c(this.a);
        }
    }
}
