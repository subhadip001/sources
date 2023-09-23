package f.e.a.l.s.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* compiled from: Downsampler.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: f  reason: collision with root package name */
    public static final f.e.a.l.k<DecodeFormat> f3456f = f.e.a.l.k.b("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* renamed from: g  reason: collision with root package name */
    public static final f.e.a.l.k<PreferredColorSpace> f3457g = f.e.a.l.k.a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h  reason: collision with root package name */
    public static final f.e.a.l.k<Boolean> f3458h;

    /* renamed from: i  reason: collision with root package name */
    public static final f.e.a.l.k<Boolean> f3459i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<String> f3460j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f3461k;

    /* renamed from: l  reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f3462l;

    /* renamed from: m  reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f3463m;
    public final f.e.a.l.q.b0.d a;
    public final DisplayMetrics b;
    public final f.e.a.l.q.b0.b c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f3464d;

    /* renamed from: e  reason: collision with root package name */
    public final p f3465e = p.a();

    /* compiled from: Downsampler.java */
    /* loaded from: classes.dex */
    public class a implements b {
        @Override // f.e.a.l.s.c.k.b
        public void a(f.e.a.l.q.b0.d dVar, Bitmap bitmap) {
        }

        @Override // f.e.a.l.s.c.k.b
        public void b() {
        }
    }

    /* compiled from: Downsampler.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(f.e.a.l.q.b0.d dVar, Bitmap bitmap);

        void b();
    }

    static {
        f.e.a.l.k<DownsampleStrategy> kVar = DownsampleStrategy.f692f;
        Boolean bool = Boolean.FALSE;
        f3458h = f.e.a.l.k.b("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f3459i = f.e.a.l.k.b("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f3460j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f3461k = new a();
        f3462l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = f.e.a.r.l.a;
        f3463m = new ArrayDeque(0);
    }

    public k(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, f.e.a.l.q.b0.d dVar, f.e.a.l.q.b0.b bVar) {
        this.f3464d = list;
        Objects.requireNonNull(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        Objects.requireNonNull(dVar, "Argument must not be null");
        this.a = dVar;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.c = bVar;
    }

    public static Bitmap c(q qVar, BitmapFactory.Options options, b bVar, f.e.a.l.q.b0.d dVar) {
        if (!options.inJustDecodeBounds) {
            bVar.b();
            qVar.c();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = x.f3482d;
        lock.lock();
        try {
            try {
                Bitmap b2 = qVar.b(options);
                lock.unlock();
                return b2;
            } catch (IllegalArgumentException e2) {
                IOException h2 = h(e2, i2, i3, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", h2);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        dVar.d(bitmap);
                        options.inBitmap = null;
                        Bitmap c = c(qVar, options, bVar, dVar);
                        x.f3482d.unlock();
                        return c;
                    } catch (IOException unused) {
                        throw h2;
                    }
                }
                throw h2;
            }
        } catch (Throwable th) {
            x.f3482d.unlock();
            throw th;
        }
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder A = f.a.b.a.a.A(" (");
        A.append(bitmap.getAllocationByteCount());
        A.append(")");
        String sb = A.toString();
        StringBuilder A2 = f.a.b.a.a.A("[");
        A2.append(bitmap.getWidth());
        A2.append("x");
        A2.append(bitmap.getHeight());
        A2.append("] ");
        A2.append(bitmap.getConfig());
        A2.append(sb);
        return A2.toString();
    }

    public static int e(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    public static int[] f(q qVar, BitmapFactory.Options options, b bVar, f.e.a.l.q.b0.d dVar) {
        options.inJustDecodeBounds = true;
        c(qVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static boolean g(int i2) {
        return i2 == 90 || i2 == 270;
    }

    public static IOException h(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        StringBuilder C = f.a.b.a.a.C("Exception decoding bitmap, outWidth: ", i2, ", outHeight: ", i3, ", outMimeType: ");
        C.append(str);
        C.append(", inBitmap: ");
        C.append(d(options.inBitmap));
        return new IOException(C.toString(), illegalArgumentException);
    }

    public static void i(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static int j(double d2) {
        return (int) (d2 + 0.5d);
    }

    public final f.e.a.l.q.v<Bitmap> a(q qVar, int i2, int i3, f.e.a.l.l lVar, b bVar) {
        Queue<BitmapFactory.Options> queue;
        BitmapFactory.Options poll;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.c.e(LogFileManager.MAX_LOG_SIZE, byte[].class);
        synchronized (k.class) {
            queue = f3463m;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                i(poll);
            }
            options = poll;
        }
        options.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) lVar.c(f3456f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) lVar.c(f3457g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) lVar.c(DownsampleStrategy.f692f);
        boolean booleanValue = ((Boolean) lVar.c(f3458h)).booleanValue();
        f.e.a.l.k<Boolean> kVar = f3459i;
        try {
            e d2 = e.d(b(qVar, options, downsampleStrategy, decodeFormat, preferredColorSpace, lVar.c(kVar) != null && ((Boolean) lVar.c(kVar)).booleanValue(), i2, i3, booleanValue, bVar), this.a);
            i(options);
            synchronized (queue) {
                queue.offer(options);
            }
            this.c.d(bArr);
            return d2;
        } catch (Throwable th) {
            i(options);
            Queue<BitmapFactory.Options> queue2 = f3463m;
            synchronized (queue2) {
                queue2.offer(options);
                this.c.d(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x050a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(f.e.a.l.s.c.q r32, android.graphics.BitmapFactory.Options r33, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r34, com.bumptech.glide.load.DecodeFormat r35, com.bumptech.glide.load.PreferredColorSpace r36, boolean r37, int r38, int r39, boolean r40, f.e.a.l.s.c.k.b r41) {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.l.s.c.k.b(f.e.a.l.s.c.q, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy, com.bumptech.glide.load.DecodeFormat, com.bumptech.glide.load.PreferredColorSpace, boolean, int, int, boolean, f.e.a.l.s.c.k$b):android.graphics.Bitmap");
    }
}
