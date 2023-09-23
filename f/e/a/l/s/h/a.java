package f.e.a.l.s.h;

import android.graphics.Bitmap;
import f.e.a.l.l;
import f.e.a.l.q.v;
import java.io.ByteArrayOutputStream;

/* compiled from: BitmapBytesTranscoder.java */
/* loaded from: classes.dex */
public class a implements e<Bitmap, byte[]> {
    public final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;
    public final int b = 100;

    @Override // f.e.a.l.s.h.e
    public v<byte[]> a(v<Bitmap> vVar, l lVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.a, this.b, byteArrayOutputStream);
        vVar.a();
        return new f.e.a.l.s.d.b(byteArrayOutputStream.toByteArray());
    }
}
