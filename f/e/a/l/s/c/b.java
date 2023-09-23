package f.e.a.l.s.c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;

/* compiled from: BitmapDrawableEncoder.java */
/* loaded from: classes.dex */
public class b implements f.e.a.l.n<BitmapDrawable> {
    public final f.e.a.l.q.b0.d a;
    public final f.e.a.l.n<Bitmap> b;

    public b(f.e.a.l.q.b0.d dVar, f.e.a.l.n<Bitmap> nVar) {
        this.a = dVar;
        this.b = nVar;
    }

    @Override // f.e.a.l.a
    public boolean a(Object obj, File file, f.e.a.l.l lVar) {
        return this.b.a(new e(((BitmapDrawable) ((f.e.a.l.q.v) obj).get()).getBitmap(), this.a), file, lVar);
    }

    @Override // f.e.a.l.n
    public EncodeStrategy b(f.e.a.l.l lVar) {
        return this.b.b(lVar);
    }
}
