package f.e.a.l.s.g;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import f.e.a.l.l;
import f.e.a.l.m;
import f.e.a.l.q.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: StreamGifDecoder.java */
/* loaded from: classes.dex */
public class j implements m<InputStream, c> {
    public final List<ImageHeaderParser> a;
    public final m<ByteBuffer, c> b;
    public final f.e.a.l.q.b0.b c;

    public j(List<ImageHeaderParser> list, m<ByteBuffer, c> mVar, f.e.a.l.q.b0.b bVar) {
        this.a = list;
        this.b = mVar;
        this.c = bVar;
    }

    @Override // f.e.a.l.m
    public boolean a(InputStream inputStream, l lVar) {
        return !((Boolean) lVar.c(i.b)).booleanValue() && f.c.a.a.i.o(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // f.e.a.l.m
    public v<c> b(InputStream inputStream, int i2, int i3, l lVar) {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(bArr), i2, i3, lVar);
    }
}
