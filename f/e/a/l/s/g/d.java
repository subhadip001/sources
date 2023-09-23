package f.e.a.l.s.g;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import f.e.a.l.l;
import f.e.a.l.n;
import f.e.a.l.q.v;
import java.io.File;
import java.io.IOException;

/* compiled from: GifDrawableEncoder.java */
/* loaded from: classes.dex */
public class d implements n<c> {
    @Override // f.e.a.l.a
    public boolean a(Object obj, File file, l lVar) {
        try {
            f.e.a.r.a.d(((c) ((v) obj).get()).f3496f.a.a.e().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            }
            return false;
        }
    }

    @Override // f.e.a.l.n
    public EncodeStrategy b(l lVar) {
        return EncodeStrategy.SOURCE;
    }
}
