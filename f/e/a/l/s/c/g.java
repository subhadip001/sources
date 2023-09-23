package f.e.a.l.s.c;

import android.graphics.Bitmap;
import f.e.a.l.s.c.q;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: ByteBufferBitmapDecoder.java */
/* loaded from: classes.dex */
public class g implements f.e.a.l.m<ByteBuffer, Bitmap> {
    public final k a;

    public g(k kVar) {
        this.a = kVar;
    }

    @Override // f.e.a.l.m
    public boolean a(ByteBuffer byteBuffer, f.e.a.l.l lVar) {
        Objects.requireNonNull(this.a);
        return true;
    }

    @Override // f.e.a.l.m
    public f.e.a.l.q.v<Bitmap> b(ByteBuffer byteBuffer, int i2, int i3, f.e.a.l.l lVar) {
        k kVar = this.a;
        return kVar.a(new q.a(byteBuffer, kVar.f3464d, kVar.c), i2, i3, lVar, k.f3461k);
    }
}
