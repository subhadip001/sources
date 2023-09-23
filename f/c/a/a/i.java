package f.c.a.a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.Spannable;
import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.firebase.analytics.FirebaseAnalytics;
import f.e.a.c;
import f.e.a.l.p.k;
import f.e.a.l.r.a;
import f.e.a.l.r.b;
import f.e.a.l.r.d;
import f.e.a.l.r.e;
import f.e.a.l.r.f;
import f.e.a.l.r.k;
import f.e.a.l.r.s;
import f.e.a.l.r.u;
import f.e.a.l.r.v;
import f.e.a.l.r.w;
import f.e.a.l.r.x;
import f.e.a.l.r.y.a;
import f.e.a.l.r.y.b;
import f.e.a.l.r.y.c;
import f.e.a.l.r.y.d;
import f.e.a.l.r.y.e;
import f.e.a.l.s.c.r;
import f.e.a.l.s.c.z;
import f.e.a.l.s.d.a;
import f.e.a.l.s.e.a;
import f.h.b.a.h.d;
import f.h.b.b.a2.k.b;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.t;
import f.h.b.b.y1.o;
import f.h.b.b.y1.w;
import f.h.b.b.y1.y;
import java.io.EOFException;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {
    public static int A(f.h.b.b.y1.i iVar, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            int j2 = iVar.j(bArr, i2 + i4, i3 - i4);
            if (j2 == -1) {
                break;
            }
            i4 += j2;
        }
        return i4;
    }

    public static int B(t tVar) {
        int i2 = 0;
        while (tVar.a() != 0) {
            int r = tVar.r();
            i2 += r;
            if (r != 255) {
                return i2;
            }
        }
        return -1;
    }

    public static long C(t tVar, int i2, int i3) {
        byte[] bArr;
        tVar.C(i2);
        if (tVar.a() < 5) {
            return -9223372036854775807L;
        }
        int f2 = tVar.f();
        if ((8388608 & f2) == 0 && ((2096896 & f2) >> 8) == i3) {
            if (((f2 & 32) != 0) && tVar.r() >= 7 && tVar.a() >= 7) {
                if ((tVar.r() & 16) == 16) {
                    System.arraycopy(tVar.a, tVar.b, new byte[6], 0, 6);
                    tVar.b += 6;
                    return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((bArr[4] & 255) >> 7);
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public static o.a D(t tVar) {
        tVar.D(1);
        int t = tVar.t();
        long j2 = tVar.b + t;
        int i2 = t / 18;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long l2 = tVar.l();
            if (l2 == -1) {
                jArr = Arrays.copyOf(jArr, i3);
                jArr2 = Arrays.copyOf(jArr2, i3);
                break;
            }
            jArr[i3] = l2;
            jArr2[i3] = tVar.l();
            tVar.D(2);
            i3++;
        }
        tVar.D((int) (j2 - tVar.b));
        return new o.a(jArr, jArr2);
    }

    public static y E(t tVar, boolean z, boolean z2) {
        if (z) {
            L(3, tVar, false);
        }
        String o = tVar.o((int) tVar.i());
        long i2 = tVar.i();
        String[] strArr = new String[(int) i2];
        int length = o.length() + 11 + 4;
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = tVar.o((int) tVar.i());
            length = length + 4 + strArr[i3].length();
        }
        if (z2 && (tVar.r() & 1) == 0) {
            throw new ParserException("framing bit expected to be set");
        }
        return new y(o, strArr, length + 1);
    }

    public static f.h.b.b.c2.s.e F(f.h.b.b.c2.s.e eVar, String[] strArr, Map<String, f.h.b.b.c2.s.e> map) {
        int i2 = 0;
        if (eVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                f.h.b.b.c2.s.e eVar2 = new f.h.b.b.c2.s.e();
                int length = strArr.length;
                while (i2 < length) {
                    eVar2.a(map.get(strArr[i2]));
                    i2++;
                }
                return eVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            eVar.a(map.get(strArr[0]));
            return eVar;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i2 < length2) {
                eVar.a(map.get(strArr[i2]));
                i2++;
            }
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [f.h.b.a.h.d$a] */
    public static <TInput, TResult, TException extends Throwable> TResult G(int i2, TInput tinput, f.h.b.a.h.b<TInput, TResult, TException> bVar, f.h.b.a.i.v.a<TInput, TResult> aVar) {
        TResult tresult;
        if (i2 < 1) {
            return (TResult) bVar.a(tinput);
        }
        do {
            tresult = (TResult) bVar.a(tinput);
            d.a aVar2 = (d.a) tinput;
            d.b bVar2 = (d.b) tresult;
            URL url = bVar2.b;
            if (url != null) {
                i("CctTransportBackend", "Following redirect to: %s", url);
                tinput = new d.a(bVar2.b, aVar2.b, aVar2.c);
            } else {
                tinput = null;
            }
            if (tinput == null) {
                break;
            }
            i2--;
        } while (i2 >= 1);
        return tresult;
    }

    public static void H(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(f.a.b.a.a.d(15, "csd-", i2), ByteBuffer.wrap(list.get(i2)));
        }
    }

    public static void I(Context context, String str, boolean z) {
        new Bundle().putString("user_clicked_for", str);
        if (!z && t(context, str)) {
            try {
                context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        StringBuilder E = f.a.b.a.a.E("https://play.google.com/store/apps/details?id=", str, "&referrer=utm_source%3D");
        E.append(context.getApplicationContext().getPackageName());
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(E.toString()));
        intent.setFlags(268468224);
        context.startActivity(intent);
    }

    public static String J(int i2) {
        return b0.k("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Double.valueOf(Color.alpha(i2) / 255.0d));
    }

    public static void K(String str, Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("video_compressor_shared_pref", 0);
        int i2 = sharedPreferences.getInt(str, 0) + 1;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(str, i2);
        edit.commit();
        Log.d("TAG", "updateCountKey: " + i2 + " " + str);
    }

    public static boolean L(int i2, t tVar, boolean z) {
        if (tVar.a() < 7) {
            if (z) {
                return false;
            }
            throw new ParserException(f.a.b.a.a.d(29, "too short header: ", tVar.a()));
        } else if (tVar.r() != i2) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i2));
            throw new ParserException(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "));
        } else if (tVar.r() == 118 && tVar.r() == 111 && tVar.r() == 114 && tVar.r() == 98 && tVar.r() == 105 && tVar.r() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new ParserException("expected characters 'vorbis'");
        }
    }

    public static void a(Spannable spannable, Object obj, int i2, int i3, int i4) {
        Object[] spans;
        for (Object obj2 : spannable.getSpans(i2, i3, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i2 && spannable.getSpanEnd(obj2) == i3 && spannable.getSpanFlags(obj2) == i4) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i2, i3, i4);
    }

    public static List<byte[]> b(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(c(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000));
        arrayList.add(c(80000000L));
        return arrayList;
    }

    public static byte[] c(long j2) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array();
    }

    public static void d(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e(long j2, t tVar, w[] wVarArr) {
        while (true) {
            if (tVar.a() <= 1) {
                return;
            }
            int B = B(tVar);
            int B2 = B(tVar);
            int i2 = tVar.b + B2;
            if (B2 == -1 || B2 > tVar.a()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i2 = tVar.c;
            } else if (B == 4 && B2 >= 8) {
                int r = tVar.r();
                int w = tVar.w();
                int f2 = w == 49 ? tVar.f() : 0;
                int r2 = tVar.r();
                if (w == 47) {
                    tVar.D(1);
                }
                boolean z = r == 181 && (w == 49 || w == 47) && r2 == 3;
                if (w == 49) {
                    z &= f2 == 1195456820;
                }
                if (z) {
                    f(j2, tVar, wVarArr);
                }
            }
            tVar.C(i2);
        }
    }

    public static void f(long j2, t tVar, w[] wVarArr) {
        int r = tVar.r();
        if ((r & 64) != 0) {
            tVar.D(1);
            int i2 = (r & 31) * 3;
            int i3 = tVar.b;
            for (w wVar : wVarArr) {
                tVar.C(i3);
                wVar.c(tVar, i2);
                wVar.d(j2, 1, i2, 0, null);
            }
        }
    }

    public static Registry g(f.e.a.b bVar, List<f.e.a.n.c> list, f.e.a.n.a aVar) {
        f.e.a.l.m gVar;
        f.e.a.l.m wVar;
        Object obj;
        Object obj2;
        Object obj3;
        int i2;
        s.c cVar;
        f.e.a.l.q.b0.d dVar = bVar.f3153f;
        f.e.a.l.q.b0.b bVar2 = bVar.f3156i;
        Context applicationContext = bVar.f3155h.getApplicationContext();
        f.e.a.e eVar = bVar.f3155h.f3175h;
        Registry registry = new Registry();
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        f.e.a.o.b bVar3 = registry.f678g;
        synchronized (bVar3) {
            bVar3.a.add(defaultImageHeaderParser);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 27) {
            f.e.a.l.s.c.n nVar = new f.e.a.l.s.c.n();
            f.e.a.o.b bVar4 = registry.f678g;
            synchronized (bVar4) {
                bVar4.a.add(nVar);
            }
        }
        Resources resources = applicationContext.getResources();
        List<ImageHeaderParser> e2 = registry.e();
        f.e.a.l.s.g.a aVar2 = new f.e.a.l.s.g.a(applicationContext, e2, dVar, bVar2);
        z zVar = new z(dVar, new z.g());
        f.e.a.l.s.c.k kVar = new f.e.a.l.s.c.k(registry.e(), resources.getDisplayMetrics(), dVar, bVar2);
        if (i3 >= 28 && eVar.a.containsKey(c.b.class)) {
            wVar = new r();
            gVar = new f.e.a.l.s.c.h();
        } else {
            gVar = new f.e.a.l.s.c.g(kVar);
            wVar = new f.e.a.l.s.c.w(kVar, bVar2);
        }
        if (i3 >= 28) {
            i2 = i3;
            obj2 = String.class;
            obj3 = Integer.class;
            obj = f.e.a.k.a.class;
            registry.d("Animation", InputStream.class, Drawable.class, new a.c(new f.e.a.l.s.e.a(e2, bVar2)));
            registry.d("Animation", ByteBuffer.class, Drawable.class, new a.b(new f.e.a.l.s.e.a(e2, bVar2)));
        } else {
            obj = f.e.a.k.a.class;
            obj2 = String.class;
            obj3 = Integer.class;
            i2 = i3;
        }
        f.e.a.l.s.e.e eVar2 = new f.e.a.l.s.e.e(applicationContext);
        s.c cVar2 = new s.c(resources);
        s.d dVar2 = new s.d(resources);
        s.b bVar5 = new s.b(resources);
        s.a aVar3 = new s.a(resources);
        f.e.a.l.s.c.c cVar3 = new f.e.a.l.s.c.c(bVar2);
        f.e.a.l.s.h.a aVar4 = new f.e.a.l.s.h.a();
        f.e.a.l.s.h.d dVar3 = new f.e.a.l.s.h.d();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        registry.a(ByteBuffer.class, new f.e.a.l.r.c());
        registry.a(InputStream.class, new f.e.a.l.r.t(bVar2));
        registry.d("Bitmap", ByteBuffer.class, Bitmap.class, gVar);
        registry.d("Bitmap", InputStream.class, Bitmap.class, wVar);
        if (ParcelFileDescriptorRewinder.c()) {
            cVar = cVar2;
            registry.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new f.e.a.l.s.c.t(kVar));
        } else {
            cVar = cVar2;
        }
        registry.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, zVar);
        registry.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new z(dVar, new z.c(null)));
        v.a<?> aVar5 = v.a.a;
        registry.c(Bitmap.class, Bitmap.class, aVar5);
        registry.d("Bitmap", Bitmap.class, Bitmap.class, new f.e.a.l.s.c.y());
        registry.b(Bitmap.class, cVar3);
        registry.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new f.e.a.l.s.c.a(resources, gVar));
        registry.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new f.e.a.l.s.c.a(resources, wVar));
        registry.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new f.e.a.l.s.c.a(resources, zVar));
        registry.b(BitmapDrawable.class, new f.e.a.l.s.c.b(dVar, cVar3));
        registry.d("Animation", InputStream.class, f.e.a.l.s.g.c.class, new f.e.a.l.s.g.j(e2, aVar2, bVar2));
        registry.d("Animation", ByteBuffer.class, f.e.a.l.s.g.c.class, aVar2);
        registry.b(f.e.a.l.s.g.c.class, new f.e.a.l.s.g.d());
        Object obj4 = obj;
        registry.c(obj4, obj4, aVar5);
        registry.d("Bitmap", obj4, Bitmap.class, new f.e.a.l.s.g.h(dVar));
        registry.d("legacy_append", Uri.class, Drawable.class, eVar2);
        registry.d("legacy_append", Uri.class, Bitmap.class, new f.e.a.l.s.c.v(eVar2, dVar));
        registry.h(new a.C0086a());
        registry.c(File.class, ByteBuffer.class, new d.b());
        registry.c(File.class, InputStream.class, new f.e());
        registry.d("legacy_append", File.class, File.class, new f.e.a.l.s.f.a());
        registry.c(File.class, ParcelFileDescriptor.class, new f.b());
        registry.c(File.class, File.class, aVar5);
        registry.h(new k.a(bVar2));
        if (ParcelFileDescriptorRewinder.c()) {
            registry.h(new ParcelFileDescriptorRewinder.a());
        }
        Class cls = Integer.TYPE;
        s.c cVar4 = cVar;
        registry.c(cls, InputStream.class, cVar4);
        registry.c(cls, ParcelFileDescriptor.class, bVar5);
        Object obj5 = obj3;
        registry.c(obj5, InputStream.class, cVar4);
        registry.c(obj5, ParcelFileDescriptor.class, bVar5);
        registry.c(obj5, Uri.class, dVar2);
        registry.c(cls, AssetFileDescriptor.class, aVar3);
        registry.c(obj5, AssetFileDescriptor.class, aVar3);
        registry.c(cls, Uri.class, dVar2);
        Object obj6 = obj2;
        registry.c(obj6, InputStream.class, new e.c());
        registry.c(Uri.class, InputStream.class, new e.c());
        registry.c(obj6, InputStream.class, new u.c());
        registry.c(obj6, ParcelFileDescriptor.class, new u.b());
        registry.c(obj6, AssetFileDescriptor.class, new u.a());
        registry.c(Uri.class, InputStream.class, new a.c(applicationContext.getAssets()));
        registry.c(Uri.class, AssetFileDescriptor.class, new a.b(applicationContext.getAssets()));
        registry.c(Uri.class, InputStream.class, new b.a(applicationContext));
        registry.c(Uri.class, InputStream.class, new c.a(applicationContext));
        int i4 = i2;
        if (i4 >= 29) {
            registry.c(Uri.class, InputStream.class, new d.c(applicationContext));
            registry.c(Uri.class, ParcelFileDescriptor.class, new d.b(applicationContext));
        }
        registry.c(Uri.class, InputStream.class, new w.d(contentResolver));
        registry.c(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver));
        registry.c(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver));
        registry.c(Uri.class, InputStream.class, new x.a());
        registry.c(URL.class, InputStream.class, new e.a());
        registry.c(Uri.class, File.class, new k.a(applicationContext));
        registry.c(f.e.a.l.r.g.class, InputStream.class, new a.C0083a());
        registry.c(byte[].class, ByteBuffer.class, new b.a());
        registry.c(byte[].class, InputStream.class, new b.d());
        registry.c(Uri.class, Uri.class, aVar5);
        registry.c(Drawable.class, Drawable.class, aVar5);
        registry.d("legacy_append", Drawable.class, Drawable.class, new f.e.a.l.s.e.f());
        registry.i(Bitmap.class, BitmapDrawable.class, new f.e.a.l.s.h.b(resources));
        registry.i(Bitmap.class, byte[].class, aVar4);
        registry.i(Drawable.class, byte[].class, new f.e.a.l.s.h.c(dVar, aVar4, dVar3));
        registry.i(f.e.a.l.s.g.c.class, byte[].class, dVar3);
        if (i4 >= 23) {
            z zVar2 = new z(dVar, new z.d());
            registry.d("legacy_append", ByteBuffer.class, Bitmap.class, zVar2);
            registry.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new f.e.a.l.s.c.a(resources, zVar2));
        }
        for (f.e.a.n.c cVar5 : list) {
            try {
                cVar5.b(applicationContext, bVar, registry);
            } catch (AbstractMethodError e3) {
                StringBuilder A = f.a.b.a.a.A("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                A.append(cVar5.getClass().getName());
                throw new IllegalStateException(A.toString(), e3);
            }
        }
        return registry;
    }

    public static String h(String str) {
        StringBuilder z = f.a.b.a.a.z(f.a.b.a.a.x(str, f.a.b.a.a.x(str, 5)), ".", str, ",.", str);
        z.append(" *");
        return z.toString();
    }

    public static void i(String str, String str2, Object obj) {
        String n = n(str);
        if (Log.isLoggable(n, 3)) {
            Log.d(n, String.format(str2, obj));
        }
    }

    public static void j(String str, String str2, Object... objArr) {
        String n = n(str);
        if (Log.isLoggable(n, 3)) {
            Log.d(n, String.format(str2, objArr));
        }
    }

    public static void k(String str, String str2, Throwable th) {
        String n = n(str);
        if (Log.isLoggable(n, 6)) {
            Log.e(n, str2, th);
        }
    }

    public static int l(List<ImageHeaderParser> list, InputStream inputStream, f.e.a.l.q.b0.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new f.e.a.l.s.c.u(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m(list, new f.e.a.l.f(inputStream, bVar));
    }

    public static int m(List<ImageHeaderParser> list, f.e.a.l.h hVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int a = hVar.a(list.get(i2));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    public static String n(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String p = f.a.b.a.a.p("TRuntime.", str);
            return p.length() > 23 ? p.substring(0, 23) : p;
        }
        return f.a.b.a.a.p("TRuntime.", str);
    }

    public static ImageHeaderParser.ImageType o(List<ImageHeaderParser> list, InputStream inputStream, f.e.a.l.q.b0.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new f.e.a.l.s.c.u(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return q(list, new f.e.a.l.b(inputStream));
    }

    public static ImageHeaderParser.ImageType p(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return q(list, new f.e.a.l.c(byteBuffer));
    }

    public static ImageHeaderParser.ImageType q(List<ImageHeaderParser> list, f.e.a.l.i iVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageHeaderParser.ImageType a = iVar.a(list.get(i2));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static void r(String str, String str2, Object obj) {
        String n = n(str);
        if (Log.isLoggable(n, 4)) {
            Log.i(n, String.format(str2, obj));
        }
    }

    public static int s(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    public static boolean t(Context context, String str) {
        try {
            context.getApplicationContext().getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean u(Uri uri) {
        return uri != null && FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean v(int i2, int i3) {
        return i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && i2 <= 512 && i3 <= 384;
    }

    public static void w(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static String x(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i2 = 0; i2 < str.length(); i2++) {
                sb.append(str.charAt(i2));
                if (str2.length() > i2) {
                    sb.append(str2.charAt(i2));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public static f.h.b.b.y1.k0.c y(f.h.b.b.y1.i iVar) {
        byte[] bArr;
        Objects.requireNonNull(iVar);
        t tVar = new t(16);
        if (f.h.b.b.y1.k0.d.a(iVar, tVar).a != 1380533830) {
            return null;
        }
        iVar.o(tVar.a, 0, 4);
        tVar.C(0);
        int f2 = tVar.f();
        if (f2 != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(f2);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        f.h.b.b.y1.k0.d a = f.h.b.b.y1.k0.d.a(iVar, tVar);
        while (a.a != 1718449184) {
            iVar.g((int) a.b);
            a = f.h.b.b.y1.k0.d.a(iVar, tVar);
        }
        f.h.b.b.e2.j.g(a.b >= 16);
        iVar.o(tVar.a, 0, 16);
        tVar.C(0);
        int k2 = tVar.k();
        int k3 = tVar.k();
        int j2 = tVar.j();
        int j3 = tVar.j();
        int k4 = tVar.k();
        int k5 = tVar.k();
        int i2 = ((int) a.b) - 16;
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            iVar.o(bArr2, 0, i2);
            bArr = bArr2;
        } else {
            bArr = b0.f4270f;
        }
        return new f.h.b.b.y1.k0.c(k2, k3, j2, j3, k4, k5, bArr);
    }

    public static Metadata z(f.h.b.b.y1.i iVar, boolean z) {
        f.h.b.b.a2.k.a aVar;
        if (z) {
            aVar = null;
        } else {
            int i2 = f.h.b.b.a2.k.b.b;
            aVar = new b.a() { // from class: f.h.b.b.a2.k.a
                @Override // f.h.b.b.a2.k.b.a
                public final boolean a(int i3, int i4, int i5, int i6, int i7) {
                    int i8 = b.b;
                    return false;
                }
            };
        }
        t tVar = new t(10);
        Metadata metadata = null;
        int i3 = 0;
        while (true) {
            try {
                iVar.o(tVar.a, 0, 10);
                tVar.C(0);
                if (tVar.t() != 4801587) {
                    break;
                }
                tVar.D(3);
                int q = tVar.q();
                int i4 = q + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i4];
                    System.arraycopy(tVar.a, 0, bArr, 0, 10);
                    iVar.o(bArr, 10, q);
                    metadata = new f.h.b.b.a2.k.b(aVar).d(bArr, i4);
                } else {
                    iVar.g(q);
                }
                i3 += i4;
            } catch (EOFException unused) {
            }
        }
        iVar.l();
        iVar.g(i3);
        if (metadata == null || metadata.f770f.length == 0) {
            return null;
        }
        return metadata;
    }
}
