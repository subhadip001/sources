package f.e.a.l.q.b0;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: LruBitmapPool.java */
/* loaded from: classes.dex */
public class j implements d {

    /* renamed from: j  reason: collision with root package name */
    public static final Bitmap.Config f3280j = Bitmap.Config.ARGB_8888;
    public final k a;
    public final Set<Bitmap.Config> b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public long f3281d;

    /* renamed from: e  reason: collision with root package name */
    public long f3282e;

    /* renamed from: f  reason: collision with root package name */
    public int f3283f;

    /* renamed from: g  reason: collision with root package name */
    public int f3284g;

    /* renamed from: h  reason: collision with root package name */
    public int f3285h;

    /* renamed from: i  reason: collision with root package name */
    public int f3286i;

    /* compiled from: LruBitmapPool.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: LruBitmapPool.java */
    /* loaded from: classes.dex */
    public static final class b implements a {
    }

    public j(long j2) {
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i2 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i2 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f3281d = j2;
        this.a = mVar;
        this.b = unmodifiableSet;
        this.c = new b();
    }

    @Override // f.e.a.l.q.b0.d
    public void a(int i2) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            f.a.b.a.a.N("trimMemory, level=", i2, "LruBitmapPool");
        }
        if (i2 >= 40 || (Build.VERSION.SDK_INT >= 23 && i2 >= 20)) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            i(0L);
        } else if (i2 >= 20 || i2 == 15) {
            i(this.f3281d / 2);
        }
    }

    @Override // f.e.a.l.q.b0.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        i(0L);
    }

    @Override // f.e.a.l.q.b0.d
    public Bitmap c(int i2, int i3, Bitmap.Config config) {
        Bitmap h2 = h(i2, i3, config);
        if (h2 == null) {
            if (config == null) {
                config = f3280j;
            }
            return Bitmap.createBitmap(i2, i3, config);
        }
        return h2;
    }

    @Override // f.e.a.l.q.b0.d
    public synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        Objects.requireNonNull((m) this.a);
                        if (f.e.a.r.l.c(bitmap) <= this.f3281d && this.b.contains(bitmap.getConfig())) {
                            Objects.requireNonNull((m) this.a);
                            int c = f.e.a.r.l.c(bitmap);
                            ((m) this.a).f(bitmap);
                            Objects.requireNonNull((b) this.c);
                            this.f3285h++;
                            this.f3282e += c;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + ((m) this.a).e(bitmap));
                            }
                            f();
                            i(this.f3281d);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((m) this.a).e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // f.e.a.l.q.b0.d
    public Bitmap e(int i2, int i3, Bitmap.Config config) {
        Bitmap h2 = h(i2, i3, config);
        if (h2 != null) {
            h2.eraseColor(0);
            return h2;
        }
        if (config == null) {
            config = f3280j;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    public final void f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            g();
        }
    }

    public final void g() {
        StringBuilder A = f.a.b.a.a.A("Hits=");
        A.append(this.f3283f);
        A.append(", misses=");
        A.append(this.f3284g);
        A.append(", puts=");
        A.append(this.f3285h);
        A.append(", evictions=");
        A.append(this.f3286i);
        A.append(", currentSize=");
        A.append(this.f3282e);
        A.append(", maxSize=");
        A.append(this.f3281d);
        A.append("\nStrategy=");
        A.append(this.a);
        Log.v("LruBitmapPool", A.toString());
    }

    public final synchronized Bitmap h(int i2, int i3, Bitmap.Config config) {
        Bitmap b2;
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
        b2 = ((m) this.a).b(i2, i3, config != null ? config : f3280j);
        if (b2 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                Objects.requireNonNull((m) this.a);
                sb.append(m.c(f.e.a.r.l.d(config) * i2 * i3, config));
                Log.d("LruBitmapPool", sb.toString());
            }
            this.f3284g++;
        } else {
            this.f3283f++;
            long j2 = this.f3282e;
            Objects.requireNonNull((m) this.a);
            this.f3282e = j2 - f.e.a.r.l.c(b2);
            Objects.requireNonNull((b) this.c);
            b2.setHasAlpha(true);
            b2.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            Objects.requireNonNull((m) this.a);
            sb2.append(m.c(f.e.a.r.l.d(config) * i2 * i3, config));
            Log.v("LruBitmapPool", sb2.toString());
        }
        f();
        return b2;
    }

    public final synchronized void i(long j2) {
        while (this.f3282e > j2) {
            m mVar = (m) this.a;
            Bitmap c = mVar.b.c();
            if (c != null) {
                mVar.a(Integer.valueOf(f.e.a.r.l.c(c)), c);
            }
            if (c == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    g();
                }
                this.f3282e = 0L;
                return;
            }
            Objects.requireNonNull((b) this.c);
            long j3 = this.f3282e;
            Objects.requireNonNull((m) this.a);
            this.f3282e = j3 - f.e.a.r.l.c(c);
            this.f3286i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((m) this.a).e(c));
            }
            f();
            c.recycle();
        }
    }
}
