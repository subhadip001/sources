package f.e.a.l.s.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import f.e.a.l.m;
import f.e.a.l.q.v;
import f.e.a.r.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: classes.dex */
public class a implements m<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final C0088a f3492f = new C0088a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f3493g = new b();
    public final Context a;
    public final List<ImageHeaderParser> b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final C0088a f3494d;

    /* renamed from: e  reason: collision with root package name */
    public final f.e.a.l.s.g.b f3495e;

    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: f.e.a.l.s.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0088a {
    }

    /* compiled from: ByteBufferGifDecoder.java */
    /* loaded from: classes.dex */
    public static class b {
        public final Queue<f.e.a.k.d> a;

        public b() {
            char[] cArr = l.a;
            this.a = new ArrayDeque(0);
        }

        public synchronized void a(f.e.a.k.d dVar) {
            dVar.b = null;
            dVar.c = null;
            this.a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, f.e.a.l.q.b0.d dVar, f.e.a.l.q.b0.b bVar) {
        b bVar2 = f3493g;
        C0088a c0088a = f3492f;
        this.a = context.getApplicationContext();
        this.b = list;
        this.f3494d = c0088a;
        this.f3495e = new f.e.a.l.s.g.b(dVar, bVar);
        this.c = bVar2;
    }

    public static int d(f.e.a.k.c cVar, int i2, int i3) {
        int min = Math.min(cVar.f3220g / i3, cVar.f3219f / i2);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder C = f.a.b.a.a.C("Downsampling GIF, sampleSize: ", max, ", target dimens: [", i2, "x");
            C.append(i3);
            C.append("], actual dimens: [");
            C.append(cVar.f3219f);
            C.append("x");
            C.append(cVar.f3220g);
            C.append("]");
            Log.v("BufferGifDecoder", C.toString());
        }
        return max;
    }

    @Override // f.e.a.l.m
    public boolean a(ByteBuffer byteBuffer, f.e.a.l.l lVar) {
        return !((Boolean) lVar.c(i.b)).booleanValue() && f.c.a.a.i.p(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // f.e.a.l.m
    public v<c> b(ByteBuffer byteBuffer, int i2, int i3, f.e.a.l.l lVar) {
        f.e.a.k.d dVar;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.c;
        synchronized (bVar) {
            f.e.a.k.d poll = bVar.a.poll();
            if (poll == null) {
                poll = new f.e.a.k.d();
            }
            dVar = poll;
            dVar.b = null;
            Arrays.fill(dVar.a, (byte) 0);
            dVar.c = new f.e.a.k.c();
            dVar.f3225d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            dVar.b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return c(byteBuffer2, i2, i3, dVar, lVar);
        } finally {
            this.c.a(dVar);
        }
    }

    public final e c(ByteBuffer byteBuffer, int i2, int i3, f.e.a.k.d dVar, f.e.a.l.l lVar) {
        Bitmap.Config config;
        int i4 = f.e.a.r.h.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            f.e.a.k.c b2 = dVar.b();
            if (b2.c > 0 && b2.b == 0) {
                if (lVar.c(i.a) == DecodeFormat.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int d2 = d(b2, i2, i3);
                C0088a c0088a = this.f3494d;
                f.e.a.l.s.g.b bVar = this.f3495e;
                Objects.requireNonNull(c0088a);
                f.e.a.k.e eVar = new f.e.a.k.e(bVar, b2, byteBuffer, d2);
                eVar.i(config);
                eVar.f3233k = (eVar.f3233k + 1) % eVar.f3234l.c;
                Bitmap a = eVar.a();
                if (a == null) {
                    return null;
                }
                e eVar2 = new e(new c(this.a, eVar, (f.e.a.l.s.b) f.e.a.l.s.b.b, i2, i3, a));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    StringBuilder A = f.a.b.a.a.A("Decoded GIF from stream in ");
                    A.append(f.e.a.r.h.a(elapsedRealtimeNanos));
                    Log.v("BufferGifDecoder", A.toString());
                }
                return eVar2;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder A2 = f.a.b.a.a.A("Decoded GIF from stream in ");
                A2.append(f.e.a.r.h.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", A2.toString());
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder A3 = f.a.b.a.a.A("Decoded GIF from stream in ");
                A3.append(f.e.a.r.h.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", A3.toString());
            }
        }
    }
}
