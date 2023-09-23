package f.e.a.l.s.c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;

/* compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
/* loaded from: classes.dex */
public final class r implements f.e.a.l.m<InputStream, Bitmap> {
    public final d a = new d();

    @Override // f.e.a.l.m
    public /* bridge */ /* synthetic */ boolean a(InputStream inputStream, f.e.a.l.l lVar) {
        return true;
    }

    @Override // f.e.a.l.m
    public f.e.a.l.q.v<Bitmap> b(InputStream inputStream, int i2, int i3, f.e.a.l.l lVar) {
        return this.a.b(ImageDecoder.createSource(f.e.a.r.a.b(inputStream)), i2, i3, lVar);
    }
}
