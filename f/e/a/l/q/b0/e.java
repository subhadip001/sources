package f.e.a.l.q.b0;

import android.graphics.Bitmap;

/* compiled from: BitmapPoolAdapter.java */
/* loaded from: classes.dex */
public class e implements d {
    @Override // f.e.a.l.q.b0.d
    public void a(int i2) {
    }

    @Override // f.e.a.l.q.b0.d
    public void b() {
    }

    @Override // f.e.a.l.q.b0.d
    public Bitmap c(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // f.e.a.l.q.b0.d
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // f.e.a.l.q.b0.d
    public Bitmap e(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }
}
