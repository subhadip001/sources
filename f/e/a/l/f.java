package f.e.a.l;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes.dex */
public class f implements h {
    public final /* synthetic */ InputStream a;
    public final /* synthetic */ f.e.a.l.q.b0.b b;

    public f(InputStream inputStream, f.e.a.l.q.b0.b bVar) {
        this.a = inputStream;
        this.b = bVar;
    }

    @Override // f.e.a.l.h
    public int a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.d(this.a, this.b);
        } finally {
            this.a.reset();
        }
    }
}
