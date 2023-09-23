package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import f.m.b.a;
import f.m.b.d0;
import f.m.b.f;
import f.m.b.g;
import f.m.b.h;
import f.m.b.i;
import f.m.b.k;
import f.m.b.n;
import f.m.b.p;
import f.m.b.q;
import f.m.b.r;
import f.m.b.t;
import f.m.b.w;
import f.m.b.x;
import f.m.b.y;
import f.m.b.z;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class Picasso {
    public static final Handler o = new a(Looper.getMainLooper());
    public static volatile Picasso p = null;
    public final d b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final List<x> f1329d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f1330e;

    /* renamed from: f  reason: collision with root package name */
    public final i f1331f;

    /* renamed from: g  reason: collision with root package name */
    public final f.m.b.d f1332g;

    /* renamed from: h  reason: collision with root package name */
    public final z f1333h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<Object, f.m.b.a> f1334i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<ImageView, h> f1335j;

    /* renamed from: k  reason: collision with root package name */
    public final ReferenceQueue<Object> f1336k;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1338m;
    public volatile boolean n;
    public final c a = null;

    /* renamed from: l  reason: collision with root package name */
    public final Bitmap.Config f1337l = null;

    /* loaded from: classes2.dex */
    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        public final int debugColor;

        LoadedFrom(int i2) {
            this.debugColor = i2;
        }
    }

    /* loaded from: classes2.dex */
    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    /* loaded from: classes2.dex */
    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 3) {
                f.m.b.a aVar = (f.m.b.a) message.obj;
                if (aVar.a.n) {
                    d0.f("Main", "canceled", aVar.b.b(), "target got garbage collected");
                }
                aVar.a.a(aVar.d());
                return;
            }
            if (i2 != 8) {
                if (i2 == 13) {
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        f.m.b.a aVar2 = (f.m.b.a) list.get(i3);
                        Picasso picasso = aVar2.a;
                        Objects.requireNonNull(picasso);
                        Bitmap g2 = MemoryPolicy.a(aVar2.f6811e) ? picasso.g(aVar2.f6815i) : null;
                        if (g2 != null) {
                            LoadedFrom loadedFrom = LoadedFrom.MEMORY;
                            picasso.b(g2, loadedFrom, aVar2, null);
                            if (picasso.n) {
                                String b = aVar2.b.b();
                                d0.f("Main", "completed", b, "from " + loadedFrom);
                            }
                        } else {
                            picasso.c(aVar2);
                            if (picasso.n) {
                                d0.f("Main", "resumed", aVar2.b.b(), "");
                            }
                        }
                    }
                    return;
                }
                StringBuilder A = f.a.b.a.a.A("Unknown handler message received: ");
                A.append(message.what);
                throw new AssertionError(A.toString());
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                f.m.b.c cVar = (f.m.b.c) list2.get(i4);
                Picasso picasso2 = cVar.f6830g;
                Objects.requireNonNull(picasso2);
                f.m.b.a aVar3 = cVar.p;
                List<f.m.b.a> list3 = cVar.q;
                boolean z = true;
                boolean z2 = (list3 == null || list3.isEmpty()) ? false : true;
                if (aVar3 == null && !z2) {
                    z = false;
                }
                if (z) {
                    Uri uri = cVar.f6835l.c;
                    Exception exc = cVar.u;
                    Bitmap bitmap = cVar.r;
                    LoadedFrom loadedFrom2 = cVar.t;
                    if (aVar3 != null) {
                        picasso2.b(bitmap, loadedFrom2, aVar3, exc);
                    }
                    if (z2) {
                        int size3 = list3.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            picasso2.b(bitmap, loadedFrom2, list3.get(i5), exc);
                        }
                    }
                    c cVar2 = picasso2.a;
                    if (cVar2 != null && exc != null) {
                        cVar2.a(picasso2, uri, exc);
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends Thread {

        /* renamed from: f  reason: collision with root package name */
        public final ReferenceQueue<Object> f1339f;

        /* renamed from: g  reason: collision with root package name */
        public final Handler f1340g;

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Exception f1341f;

            public a(b bVar, Exception exc) {
                this.f1341f = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f1341f);
            }
        }

        public b(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f1339f = referenceQueue;
            this.f1340g = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0166a c0166a = (a.C0166a) this.f1339f.remove(1000L);
                    Message obtainMessage = this.f1340g.obtainMessage();
                    if (c0166a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c0166a.a;
                        this.f1340g.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e2) {
                    this.f1340g.post(new a(this, e2));
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(Picasso picasso, Uri uri, Exception exc);
    }

    /* loaded from: classes2.dex */
    public interface d {
        public static final d a = new a();

        /* loaded from: classes2.dex */
        public static class a implements d {
        }
    }

    public Picasso(Context context, i iVar, f.m.b.d dVar, c cVar, d dVar2, List<x> list, z zVar, Bitmap.Config config, boolean z, boolean z2) {
        this.f1330e = context;
        this.f1331f = iVar;
        this.f1332g = dVar;
        this.b = dVar2;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new y(context));
        arrayList.add(new f(context));
        arrayList.add(new p(context));
        arrayList.add(new g(context));
        arrayList.add(new f.m.b.b(context));
        arrayList.add(new k(context));
        arrayList.add(new q(iVar.f6845d, zVar));
        this.f1329d = Collections.unmodifiableList(arrayList);
        this.f1333h = zVar;
        this.f1334i = new WeakHashMap();
        this.f1335j = new WeakHashMap();
        this.f1338m = z;
        this.n = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f1336k = referenceQueue;
        b bVar = new b(referenceQueue, o);
        this.c = bVar;
        bVar.start();
    }

    public static Picasso d() {
        if (p == null) {
            synchronized (Picasso.class) {
                if (p == null) {
                    Context context = PicassoProvider.f1342f;
                    if (context == null) {
                        throw new IllegalStateException("context == null");
                    }
                    if (context != null) {
                        Context applicationContext = context.getApplicationContext();
                        r rVar = new r(applicationContext);
                        n nVar = new n(applicationContext);
                        t tVar = new t();
                        d dVar = d.a;
                        z zVar = new z(nVar);
                        p = new Picasso(applicationContext, new i(applicationContext, tVar, o, rVar, nVar, zVar), nVar, null, dVar, null, zVar, null, false, false);
                    } else {
                        throw new IllegalArgumentException("Context must not be null.");
                    }
                }
            }
        }
        return p;
    }

    public void a(Object obj) {
        d0.a();
        f.m.b.a remove = this.f1334i.remove(obj);
        if (remove != null) {
            remove.a();
            Handler handler = this.f1331f.f6850i;
            handler.sendMessage(handler.obtainMessage(2, remove));
        }
        if (obj instanceof ImageView) {
            h remove2 = this.f1335j.remove((ImageView) obj);
            if (remove2 != null) {
                Objects.requireNonNull(remove2.f6842f);
                remove2.f6844h = null;
                ImageView imageView = remove2.f6843g.get();
                if (imageView == null) {
                    return;
                }
                remove2.f6843g.clear();
                imageView.removeOnAttachStateChangeListener(remove2);
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(remove2);
                }
            }
        }
    }

    public final void b(Bitmap bitmap, LoadedFrom loadedFrom, f.m.b.a aVar, Exception exc) {
        if (aVar.f6818l) {
            return;
        }
        if (!aVar.f6817k) {
            this.f1334i.remove(aVar.d());
        }
        if (bitmap == null) {
            aVar.c(exc);
            if (this.n) {
                d0.f("Main", "errored", aVar.b.b(), exc.getMessage());
            }
        } else if (loadedFrom != null) {
            aVar.b(bitmap, loadedFrom);
            if (this.n) {
                String b2 = aVar.b.b();
                d0.f("Main", "completed", b2, "from " + loadedFrom);
            }
        } else {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
    }

    public void c(f.m.b.a aVar) {
        Object d2 = aVar.d();
        if (d2 != null && this.f1334i.get(d2) != aVar) {
            a(d2);
            this.f1334i.put(d2, aVar);
        }
        Handler handler = this.f1331f.f6850i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    public w e(Uri uri) {
        return new w(this, uri, 0);
    }

    public w f(String str) {
        if (str == null) {
            return new w(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return e(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public Bitmap g(String str) {
        Bitmap a2 = this.f1332g.a(str);
        if (a2 != null) {
            this.f1333h.c.sendEmptyMessage(0);
        } else {
            this.f1333h.c.sendEmptyMessage(1);
        }
        return a2;
    }
}
