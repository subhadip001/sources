package f.e.a.l.s.c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* compiled from: BitmapImageDecoderResourceDecoder.java */
/* loaded from: classes.dex */
public final class d implements f.e.a.l.m<ImageDecoder.Source, Bitmap> {
    public final f.e.a.l.q.b0.d a = new f.e.a.l.q.b0.e();

    @Override // f.e.a.l.m
    public /* bridge */ /* synthetic */ boolean a(ImageDecoder.Source source, f.e.a.l.l lVar) {
        return true;
    }

    @Override // f.e.a.l.m
    /* renamed from: c */
    public f.e.a.l.q.v<Bitmap> b(ImageDecoder.Source source, int i2, int i3, f.e.a.l.l lVar) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new f.e.a.l.s.a(i2, i3, lVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder A = f.a.b.a.a.A("Decoded [");
            A.append(decodeBitmap.getWidth());
            A.append("x");
            A.append(decodeBitmap.getHeight());
            A.append("] for [");
            A.append(i2);
            A.append("x");
            A.append(i3);
            A.append("]");
            Log.v("BitmapImageDecoder", A.toString());
        }
        return new e(decodeBitmap, this.a);
    }
}
