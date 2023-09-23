package f.e.a.l;

import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes.dex */
public class e implements h {
    public final /* synthetic */ ByteBuffer a;
    public final /* synthetic */ f.e.a.l.q.b0.b b;

    public e(ByteBuffer byteBuffer, f.e.a.l.q.b0.b bVar) {
        this.a = byteBuffer;
        this.b = bVar;
    }

    @Override // f.e.a.l.h
    public int a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.b(this.a, this.b);
        } finally {
            f.e.a.r.a.c(this.a);
        }
    }
}
