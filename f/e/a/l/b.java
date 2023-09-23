package f.e.a.l;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes.dex */
public class b implements i {
    public final /* synthetic */ InputStream a;

    public b(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // f.e.a.l.i
    public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.c(this.a);
        } finally {
            this.a.reset();
        }
    }
}
