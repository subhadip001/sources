package f.e.a.l.s.g;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import f.e.a.l.o;
import f.e.a.l.q.k;
import f.e.a.r.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: GifFrameLoader.java */
/* loaded from: classes.dex */
public class g {
    public final f.e.a.k.a a;
    public final Handler b;
    public final List<b> c;

    /* renamed from: d  reason: collision with root package name */
    public final f.e.a.h f3504d;

    /* renamed from: e  reason: collision with root package name */
    public final f.e.a.l.q.b0.d f3505e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3506f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3507g;

    /* renamed from: h  reason: collision with root package name */
    public f.e.a.g<Bitmap> f3508h;

    /* renamed from: i  reason: collision with root package name */
    public a f3509i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3510j;

    /* renamed from: k  reason: collision with root package name */
    public a f3511k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f3512l;

    /* renamed from: m  reason: collision with root package name */
    public o<Bitmap> f3513m;
    public a n;
    public int o;
    public int p;
    public int q;

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes.dex */
    public static class a extends f.e.a.p.j.c<Bitmap> {

        /* renamed from: f  reason: collision with root package name */
        public final Handler f3514f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3515g;

        /* renamed from: h  reason: collision with root package name */
        public final long f3516h;

        /* renamed from: i  reason: collision with root package name */
        public Bitmap f3517i;

        public a(Handler handler, int i2, long j2) {
            this.f3514f = handler;
            this.f3515g = i2;
            this.f3516h = j2;
        }

        @Override // f.e.a.p.j.h
        public void onLoadCleared(Drawable drawable) {
            this.f3517i = null;
        }

        @Override // f.e.a.p.j.h
        public void onResourceReady(Object obj, f.e.a.p.k.b bVar) {
            this.f3517i = (Bitmap) obj;
            this.f3514f.sendMessageAtTime(this.f3514f.obtainMessage(1, this), this.f3516h);
        }
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes.dex */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                g.this.b((a) message.obj);
                return true;
            } else if (i2 == 2) {
                g.this.f3504d.b((a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    public g(f.e.a.b bVar, f.e.a.k.a aVar, int i2, int i3, o<Bitmap> oVar, Bitmap bitmap) {
        f.e.a.l.q.b0.d dVar = bVar.f3153f;
        f.e.a.h d2 = f.e.a.b.d(bVar.f3155h.getBaseContext());
        f.e.a.h d3 = f.e.a.b.d(bVar.f3155h.getBaseContext());
        Objects.requireNonNull(d3);
        f.e.a.g<Bitmap> a2 = new f.e.a.g(d3.f3179f, d3, Bitmap.class, d3.f3180g).a(f.e.a.h.p).a(new f.e.a.p.f().d(k.a).r(true).n(true).h(i2, i3));
        this.c = new ArrayList();
        this.f3504d = d2;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f3505e = dVar;
        this.b = handler;
        this.f3508h = a2;
        this.a = aVar;
        c(oVar, bitmap);
    }

    public final void a() {
        if (!this.f3506f || this.f3507g) {
            return;
        }
        a aVar = this.n;
        if (aVar != null) {
            this.n = null;
            b(aVar);
            return;
        }
        this.f3507g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.a.d();
        this.a.b();
        this.f3511k = new a(this.b, this.a.f(), uptimeMillis);
        f.e.a.g<Bitmap> z = this.f3508h.a(new f.e.a.p.f().m(new f.e.a.q.d(Double.valueOf(Math.random())))).z(this.a);
        z.x(this.f3511k, null, z, f.e.a.r.e.a);
    }

    public void b(a aVar) {
        this.f3507g = false;
        if (this.f3510j) {
            this.b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f3506f) {
            this.n = aVar;
        } else {
            if (aVar.f3517i != null) {
                Bitmap bitmap = this.f3512l;
                if (bitmap != null) {
                    this.f3505e.d(bitmap);
                    this.f3512l = null;
                }
                a aVar2 = this.f3509i;
                this.f3509i = aVar;
                int size = this.c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.c.get(size).a();
                }
                if (aVar2 != null) {
                    this.b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    public void c(o<Bitmap> oVar, Bitmap bitmap) {
        Objects.requireNonNull(oVar, "Argument must not be null");
        this.f3513m = oVar;
        Objects.requireNonNull(bitmap, "Argument must not be null");
        this.f3512l = bitmap;
        this.f3508h = this.f3508h.a(new f.e.a.p.f().o(oVar, true));
        this.o = l.c(bitmap);
        this.p = bitmap.getWidth();
        this.q = bitmap.getHeight();
    }
}
