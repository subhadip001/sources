package e.n.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Trace;
import e.n.a.h;
import e.n.a.m;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: classes.dex */
public class m extends h.c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f2633d = new a();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class a {
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class b implements h.g {
        public final Context a;
        public final e.i.g.e b;
        public final a c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f2634d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public Handler f2635e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f2636f;

        /* renamed from: g  reason: collision with root package name */
        public ThreadPoolExecutor f2637g;

        /* renamed from: h  reason: collision with root package name */
        public h.AbstractC0050h f2638h;

        /* renamed from: i  reason: collision with root package name */
        public ContentObserver f2639i;

        /* renamed from: j  reason: collision with root package name */
        public Runnable f2640j;

        public b(Context context, e.i.g.e eVar, a aVar) {
            e.i.a.i(context, "Context cannot be null");
            e.i.a.i(eVar, "FontRequest cannot be null");
            this.a = context.getApplicationContext();
            this.b = eVar;
            this.c = aVar;
        }

        @Override // e.n.a.h.g
        public void a(h.AbstractC0050h abstractC0050h) {
            e.i.a.i(abstractC0050h, "LoaderCallback cannot be null");
            synchronized (this.f2634d) {
                this.f2638h = abstractC0050h;
            }
            c();
        }

        public final void b() {
            synchronized (this.f2634d) {
                this.f2638h = null;
                ContentObserver contentObserver = this.f2639i;
                if (contentObserver != null) {
                    a aVar = this.c;
                    Context context = this.a;
                    Objects.requireNonNull(aVar);
                    context.getContentResolver().unregisterContentObserver(contentObserver);
                    this.f2639i = null;
                }
                Handler handler = this.f2635e;
                if (handler != null) {
                    handler.removeCallbacks(this.f2640j);
                }
                this.f2635e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2637g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2636f = null;
                this.f2637g = null;
            }
        }

        public void c() {
            synchronized (this.f2634d) {
                if (this.f2638h == null) {
                    return;
                }
                if (this.f2636f == null) {
                    ThreadPoolExecutor t = e.i.a.t("emojiCompat");
                    this.f2637g = t;
                    this.f2636f = t;
                }
                this.f2636f.execute(new Runnable() { // from class: e.n.a.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.b bVar = m.b.this;
                        synchronized (bVar.f2634d) {
                            if (bVar.f2638h == null) {
                                return;
                            }
                            try {
                                e.i.g.l d2 = bVar.d();
                                int i2 = d2.f2490e;
                                if (i2 == 2) {
                                    synchronized (bVar.f2634d) {
                                    }
                                }
                                if (i2 == 0) {
                                    int i3 = e.i.f.h.a;
                                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                    m.a aVar = bVar.c;
                                    Context context = bVar.a;
                                    Objects.requireNonNull(aVar);
                                    Typeface b = e.i.d.e.a.b(context, null, new e.i.g.l[]{d2}, 0);
                                    ByteBuffer P = e.i.a.P(bVar.a, null, d2.a);
                                    if (P != null && b != null) {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        n nVar = new n(b, e.i.a.T(P));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (bVar.f2634d) {
                                            h.AbstractC0050h abstractC0050h = bVar.f2638h;
                                            if (abstractC0050h != null) {
                                                abstractC0050h.b(nVar);
                                            }
                                        }
                                        bVar.b();
                                        return;
                                    }
                                    throw new RuntimeException("Unable to open file.");
                                }
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            } catch (Throwable th) {
                                synchronized (bVar.f2634d) {
                                    h.AbstractC0050h abstractC0050h2 = bVar.f2638h;
                                    if (abstractC0050h2 != null) {
                                        abstractC0050h2.a(th);
                                    }
                                    bVar.b();
                                }
                            }
                        }
                    }
                });
            }
        }

        public final e.i.g.l d() {
            try {
                a aVar = this.c;
                Context context = this.a;
                e.i.g.e eVar = this.b;
                Objects.requireNonNull(aVar);
                e.i.g.k a = e.i.g.d.a(context, eVar, null);
                if (a.a == 0) {
                    e.i.g.l[] lVarArr = a.b;
                    if (lVarArr != null && lVarArr.length != 0) {
                        return lVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException(f.a.b.a.a.t(f.a.b.a.a.A("fetchFonts failed ("), a.a, ")"));
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("provider not found", e2);
            }
        }
    }

    public m(Context context, e.i.g.e eVar) {
        super(new b(context, eVar, f2633d));
    }
}
