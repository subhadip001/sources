package f.e.a.l.s.c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
/* loaded from: classes.dex */
public final class h implements f.e.a.l.m<ByteBuffer, Bitmap> {
    public final d a = new d();

    @Override // f.e.a.l.m
    public /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer, f.e.a.l.l lVar) {
        return true;
    }

    @Override // f.e.a.l.m
    public f.e.a.l.q.v<Bitmap> b(ByteBuffer byteBuffer, int i2, int i3, f.e.a.l.l lVar) {
        return this.a.b(ImageDecoder.createSource(byteBuffer), i2, i3, lVar);
    }
}
