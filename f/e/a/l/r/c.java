package f.e.a.l.r;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferEncoder.java */
/* loaded from: classes.dex */
public class c implements f.e.a.l.a<ByteBuffer> {
    @Override // f.e.a.l.a
    public boolean a(ByteBuffer byteBuffer, File file, f.e.a.l.l lVar) {
        try {
            f.e.a.r.a.d(byteBuffer, file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e2);
            }
            return false;
        }
    }
}
