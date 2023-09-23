package f.m.b;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* compiled from: LruCache.java */
/* loaded from: classes2.dex */
public final class n implements d {
    public final LruCache<String, a> a;

    /* compiled from: LruCache.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public final Bitmap a;
        public final int b;

        public a(Bitmap bitmap, int i2) {
            this.a = bitmap;
            this.b = i2;
        }
    }

    public n(Context context) {
        StringBuilder sb = d0.a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.a = new m(this, (int) ((((context.getApplicationInfo().flags & CommonUtils.BYTES_IN_A_MEGABYTE) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 7));
    }

    @Override // f.m.b.d
    public Bitmap a(String str) {
        a aVar = this.a.get(str);
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    @Override // f.m.b.d
    public int b() {
        return this.a.maxSize();
    }

    @Override // f.m.b.d
    public void c(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            int c = d0.c(bitmap);
            if (c > this.a.maxSize()) {
                this.a.remove(str);
                return;
            } else {
                this.a.put(str, new a(bitmap, c));
                return;
            }
        }
        throw new NullPointerException("key == null || bitmap == null");
    }

    @Override // f.m.b.d
    public int size() {
        return this.a.size();
    }
}
