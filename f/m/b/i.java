package f.m.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;
import f.m.b.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: Dispatcher.java */
/* loaded from: classes2.dex */
public class i {
    public final b a;
    public final Context b;
    public final ExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    public final j f6845d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, f.m.b.c> f6846e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Object, f.m.b.a> f6847f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<Object, f.m.b.a> f6848g;

    /* renamed from: h  reason: collision with root package name */
    public final Set<Object> f6849h;

    /* renamed from: i  reason: collision with root package name */
    public final Handler f6850i;

    /* renamed from: j  reason: collision with root package name */
    public final Handler f6851j;

    /* renamed from: k  reason: collision with root package name */
    public final d f6852k;

    /* renamed from: l  reason: collision with root package name */
    public final z f6853l;

    /* renamed from: m  reason: collision with root package name */
    public final List<f.m.b.c> f6854m;
    public final c n;
    public final boolean o;
    public boolean p;

    /* compiled from: Dispatcher.java */
    /* loaded from: classes2.dex */
    public static class a extends Handler {
        public final i a;

        /* compiled from: Dispatcher.java */
        /* renamed from: f.m.b.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0168a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Message f6855f;

            public RunnableC0168a(a aVar, Message message) {
                this.f6855f = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                StringBuilder A = f.a.b.a.a.A("Unknown handler message received: ");
                A.append(this.f6855f.what);
                throw new AssertionError(A.toString());
            }
        }

        public a(Looper looper, i iVar) {
            super(looper);
            this.a = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v39, types: [android.os.Handler] */
        /* JADX WARN: Type inference failed for: r3v62, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v63 */
        /* JADX WARN: Type inference failed for: r3v64, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r3v65, types: [java.util.ArrayList] */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean g2;
            Object d2;
            NetworkInfo networkInfo = 0;
            switch (message.what) {
                case 1:
                    this.a.e((f.m.b.a) message.obj, true);
                    return;
                case 2:
                    f.m.b.a aVar = (f.m.b.a) message.obj;
                    i iVar = this.a;
                    Objects.requireNonNull(iVar);
                    String str = aVar.f6815i;
                    f.m.b.c cVar = iVar.f6846e.get(str);
                    if (cVar != null) {
                        cVar.d(aVar);
                        if (cVar.b()) {
                            iVar.f6846e.remove(str);
                            if (aVar.a.n) {
                                d0.f("Dispatcher", "canceled", aVar.b.b(), "");
                            }
                        }
                    }
                    if (iVar.f6849h.contains(aVar.f6816j)) {
                        iVar.f6848g.remove(aVar.d());
                        if (aVar.a.n) {
                            d0.f("Dispatcher", "canceled", aVar.b.b(), "because paused request got canceled");
                        }
                    }
                    f.m.b.a remove = iVar.f6847f.remove(aVar.d());
                    if (remove == null || !remove.a.n) {
                        return;
                    }
                    d0.f("Dispatcher", "canceled", remove.b.b(), "from replaying");
                    return;
                case 3:
                case 8:
                default:
                    Picasso.o.post(new RunnableC0168a(this, message));
                    return;
                case 4:
                    f.m.b.c cVar2 = (f.m.b.c) message.obj;
                    i iVar2 = this.a;
                    Objects.requireNonNull(iVar2);
                    if ((cVar2.f6836m & MemoryPolicy.NO_STORE.index) == 0) {
                        iVar2.f6852k.c(cVar2.f6834k, cVar2.r);
                    }
                    iVar2.f6846e.remove(cVar2.f6834k);
                    iVar2.a(cVar2);
                    if (cVar2.f6830g.n) {
                        d0.f("Dispatcher", "batched", d0.d(cVar2), "for completion");
                        return;
                    }
                    return;
                case 5:
                    f.m.b.c cVar3 = (f.m.b.c) message.obj;
                    i iVar3 = this.a;
                    Objects.requireNonNull(iVar3);
                    Future<?> future = cVar3.s;
                    if (future != null && future.isCancelled()) {
                        return;
                    }
                    if (iVar3.c.isShutdown()) {
                        iVar3.d(cVar3, false);
                        return;
                    }
                    if (iVar3.o) {
                        Context context = iVar3.b;
                        StringBuilder sb = d0.a;
                        networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    }
                    boolean z = iVar3.p;
                    int i2 = cVar3.w;
                    if (i2 > 0) {
                        cVar3.w = i2 - 1;
                        g2 = cVar3.o.g(z, networkInfo);
                    } else {
                        g2 = false;
                    }
                    if (g2) {
                        if (cVar3.f6830g.n) {
                            d0.f("Dispatcher", "retrying", d0.d(cVar3), "");
                        }
                        if (cVar3.u instanceof q.a) {
                            cVar3.n |= NetworkPolicy.NO_CACHE.index;
                        }
                        cVar3.s = iVar3.c.submit(cVar3);
                        return;
                    }
                    boolean z2 = iVar3.o && cVar3.o.h();
                    iVar3.d(cVar3, z2);
                    if (z2) {
                        f.m.b.a aVar2 = cVar3.p;
                        if (aVar2 != null && (d2 = aVar2.d()) != null) {
                            aVar2.f6817k = true;
                            iVar3.f6847f.put(d2, aVar2);
                        }
                        List<f.m.b.a> list = cVar3.q;
                        if (list != null) {
                            int size = list.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                f.m.b.a aVar3 = list.get(i3);
                                Object d3 = aVar3.d();
                                if (d3 != null) {
                                    aVar3.f6817k = true;
                                    iVar3.f6847f.put(d3, aVar3);
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 6:
                    this.a.d((f.m.b.c) message.obj, false);
                    return;
                case 7:
                    i iVar4 = this.a;
                    Objects.requireNonNull(iVar4);
                    ArrayList arrayList = new ArrayList(iVar4.f6854m);
                    iVar4.f6854m.clear();
                    Handler handler = iVar4.f6851j;
                    handler.sendMessage(handler.obtainMessage(8, arrayList));
                    if (!arrayList.isEmpty() && ((f.m.b.c) arrayList.get(0)).f6830g.n) {
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            f.m.b.c cVar4 = (f.m.b.c) it.next();
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(d0.d(cVar4));
                        }
                        d0.f("Dispatcher", "delivered", sb2.toString(), "");
                        return;
                    }
                    return;
                case 9:
                    NetworkInfo networkInfo2 = (NetworkInfo) message.obj;
                    i iVar5 = this.a;
                    ExecutorService executorService = iVar5.c;
                    if (executorService instanceof t) {
                        t tVar = (t) executorService;
                        Objects.requireNonNull(tVar);
                        if (networkInfo2 != null && networkInfo2.isConnectedOrConnecting()) {
                            int type = networkInfo2.getType();
                            if (type == 0) {
                                int subtype = networkInfo2.getSubtype();
                                switch (subtype) {
                                    case 1:
                                    case 2:
                                        tVar.setCorePoolSize(1);
                                        tVar.setMaximumPoolSize(1);
                                        break;
                                    default:
                                        switch (subtype) {
                                            case 12:
                                                break;
                                            case 13:
                                            case 14:
                                            case 15:
                                                tVar.setCorePoolSize(3);
                                                tVar.setMaximumPoolSize(3);
                                                break;
                                            default:
                                                tVar.setCorePoolSize(3);
                                                tVar.setMaximumPoolSize(3);
                                                break;
                                        }
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                        tVar.setCorePoolSize(2);
                                        tVar.setMaximumPoolSize(2);
                                        break;
                                }
                            } else if (type != 1 && type != 6 && type != 9) {
                                tVar.setCorePoolSize(3);
                                tVar.setMaximumPoolSize(3);
                            } else {
                                tVar.setCorePoolSize(4);
                                tVar.setMaximumPoolSize(4);
                            }
                        } else {
                            tVar.setCorePoolSize(3);
                            tVar.setMaximumPoolSize(3);
                        }
                    }
                    if (networkInfo2 == null || !networkInfo2.isConnected() || iVar5.f6847f.isEmpty()) {
                        return;
                    }
                    Iterator<f.m.b.a> it2 = iVar5.f6847f.values().iterator();
                    while (it2.hasNext()) {
                        f.m.b.a next = it2.next();
                        it2.remove();
                        if (next.a.n) {
                            d0.f("Dispatcher", "replaying", next.b.b(), "");
                        }
                        iVar5.e(next, false);
                    }
                    return;
                case 10:
                    this.a.p = message.arg1 == 1;
                    return;
                case 11:
                    Object obj = message.obj;
                    i iVar6 = this.a;
                    if (iVar6.f6849h.add(obj)) {
                        Iterator<f.m.b.c> it3 = iVar6.f6846e.values().iterator();
                        while (it3.hasNext()) {
                            f.m.b.c next2 = it3.next();
                            boolean z3 = next2.f6830g.n;
                            f.m.b.a aVar4 = next2.p;
                            List<f.m.b.a> list2 = next2.q;
                            boolean z4 = (list2 == null || list2.isEmpty()) ? false : true;
                            if (aVar4 != null || z4) {
                                if (aVar4 != null && aVar4.f6816j.equals(obj)) {
                                    next2.d(aVar4);
                                    iVar6.f6848g.put(aVar4.d(), aVar4);
                                    if (z3) {
                                        d0.f("Dispatcher", "paused", aVar4.b.b(), "because tag '" + obj + "' was paused");
                                    }
                                }
                                if (z4) {
                                    for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                                        f.m.b.a aVar5 = list2.get(size2);
                                        if (aVar5.f6816j.equals(obj)) {
                                            next2.d(aVar5);
                                            iVar6.f6848g.put(aVar5.d(), aVar5);
                                            if (z3) {
                                                d0.f("Dispatcher", "paused", aVar5.b.b(), "because tag '" + obj + "' was paused");
                                            }
                                        }
                                    }
                                }
                                if (next2.b()) {
                                    it3.remove();
                                    if (z3) {
                                        d0.f("Dispatcher", "canceled", d0.d(next2), "all actions paused");
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                case 12:
                    Object obj2 = message.obj;
                    i iVar7 = this.a;
                    if (iVar7.f6849h.remove(obj2)) {
                        Iterator<f.m.b.a> it4 = iVar7.f6848g.values().iterator();
                        while (it4.hasNext()) {
                            f.m.b.a next3 = it4.next();
                            if (next3.f6816j.equals(obj2)) {
                                if (networkInfo == 0) {
                                    networkInfo = new ArrayList();
                                }
                                networkInfo.add(next3);
                                it4.remove();
                            }
                        }
                        if (networkInfo != 0) {
                            ?? r1 = iVar7.f6851j;
                            r1.sendMessage(r1.obtainMessage(13, networkInfo));
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
    }

    /* compiled from: Dispatcher.java */
    /* loaded from: classes2.dex */
    public static class b extends HandlerThread {
        public b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* compiled from: Dispatcher.java */
    /* loaded from: classes2.dex */
    public static class c extends BroadcastReceiver {
        public final i a;

        public c(i iVar) {
            this.a = iVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra(RemoteConfigConstants.ResponseFieldKey.STATE)) {
                    i iVar = this.a;
                    boolean booleanExtra = intent.getBooleanExtra(RemoteConfigConstants.ResponseFieldKey.STATE, false);
                    Handler handler = iVar.f6850i;
                    handler.sendMessage(handler.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                StringBuilder sb = d0.a;
                i iVar2 = this.a;
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                Handler handler2 = iVar2.f6850i;
                handler2.sendMessage(handler2.obtainMessage(9, activeNetworkInfo));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(android.content.Context r6, java.util.concurrent.ExecutorService r7, android.os.Handler r8, f.m.b.j r9, f.m.b.d r10, f.m.b.z r11) {
        /*
            r5 = this;
            r5.<init>()
            f.m.b.i$b r0 = new f.m.b.i$b
            r0.<init>()
            r5.a = r0
            r0.start()
            android.os.Looper r1 = r0.getLooper()
            java.lang.StringBuilder r2 = f.m.b.d0.a
            f.m.b.c0 r2 = new f.m.b.c0
            r2.<init>(r1)
            android.os.Message r1 = r2.obtainMessage()
            r3 = 1000(0x3e8, double:4.94E-321)
            r2.sendMessageDelayed(r1, r3)
            r5.b = r6
            r5.c = r7
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            r5.f6846e = r7
            java.util.WeakHashMap r7 = new java.util.WeakHashMap
            r7.<init>()
            r5.f6847f = r7
            java.util.WeakHashMap r7 = new java.util.WeakHashMap
            r7.<init>()
            r5.f6848g = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r5.f6849h = r7
            f.m.b.i$a r7 = new f.m.b.i$a
            android.os.Looper r0 = r0.getLooper()
            r7.<init>(r0, r5)
            r5.f6850i = r7
            r5.f6845d = r9
            r5.f6851j = r8
            r5.f6852k = r10
            r5.f6853l = r11
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 4
            r7.<init>(r8)
            r5.f6854m = r7
            android.content.ContentResolver r7 = r6.getContentResolver()
            r8 = 1
            r9 = 0
            java.lang.String r10 = "airplane_mode_on"
            int r7 = android.provider.Settings.Global.getInt(r7, r10, r9)     // Catch: java.lang.Throwable -> L6c
            if (r7 == 0) goto L6c
            r7 = 1
            goto L6d
        L6c:
            r7 = 0
        L6d:
            r5.p = r7
            java.lang.String r7 = "android.permission.ACCESS_NETWORK_STATE"
            int r6 = r6.checkCallingOrSelfPermission(r7)
            if (r6 != 0) goto L78
            goto L79
        L78:
            r8 = 0
        L79:
            r5.o = r8
            f.m.b.i$c r6 = new f.m.b.i$c
            r6.<init>(r5)
            r5.n = r6
            android.content.IntentFilter r7 = new android.content.IntentFilter
            r7.<init>()
            java.lang.String r8 = "android.intent.action.AIRPLANE_MODE"
            r7.addAction(r8)
            f.m.b.i r8 = r6.a
            boolean r8 = r8.o
            if (r8 == 0) goto L97
            java.lang.String r8 = "android.net.conn.CONNECTIVITY_CHANGE"
            r7.addAction(r8)
        L97:
            f.m.b.i r8 = r6.a
            android.content.Context r8 = r8.b
            r8.registerReceiver(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.m.b.i.<init>(android.content.Context, java.util.concurrent.ExecutorService, android.os.Handler, f.m.b.j, f.m.b.d, f.m.b.z):void");
    }

    public final void a(f.m.b.c cVar) {
        Future<?> future = cVar.s;
        if (future != null && future.isCancelled()) {
            return;
        }
        Bitmap bitmap = cVar.r;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.f6854m.add(cVar);
        if (this.f6850i.hasMessages(7)) {
            return;
        }
        this.f6850i.sendEmptyMessageDelayed(7, 200L);
    }

    public void b(f.m.b.c cVar) {
        Handler handler = this.f6850i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    public void c(f.m.b.c cVar) {
        Handler handler = this.f6850i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    public void d(f.m.b.c cVar, boolean z) {
        if (cVar.f6830g.n) {
            String d2 = d0.d(cVar);
            StringBuilder A = f.a.b.a.a.A("for error");
            A.append(z ? " (will replay)" : "");
            d0.f("Dispatcher", "batched", d2, A.toString());
        }
        this.f6846e.remove(cVar.f6834k);
        a(cVar);
    }

    public void e(f.m.b.a aVar, boolean z) {
        f.m.b.c cVar;
        if (this.f6849h.contains(aVar.f6816j)) {
            this.f6848g.put(aVar.d(), aVar);
            if (aVar.a.n) {
                String b2 = aVar.b.b();
                StringBuilder A = f.a.b.a.a.A("because tag '");
                A.append(aVar.f6816j);
                A.append("' is paused");
                d0.f("Dispatcher", "paused", b2, A.toString());
                return;
            }
            return;
        }
        f.m.b.c cVar2 = this.f6846e.get(aVar.f6815i);
        if (cVar2 != null) {
            boolean z2 = cVar2.f6830g.n;
            v vVar = aVar.b;
            if (cVar2.p == null) {
                cVar2.p = aVar;
                if (z2) {
                    List<f.m.b.a> list = cVar2.q;
                    if (list != null && !list.isEmpty()) {
                        d0.f("Hunter", "joined", vVar.b(), d0.e(cVar2, "to "));
                        return;
                    } else {
                        d0.f("Hunter", "joined", vVar.b(), "to empty hunter");
                        return;
                    }
                }
                return;
            }
            if (cVar2.q == null) {
                cVar2.q = new ArrayList(3);
            }
            cVar2.q.add(aVar);
            if (z2) {
                d0.f("Hunter", "joined", vVar.b(), d0.e(cVar2, "to "));
            }
            Picasso.Priority priority = aVar.b.r;
            if (priority.ordinal() > cVar2.x.ordinal()) {
                cVar2.x = priority;
            }
        } else if (this.c.isShutdown()) {
            if (aVar.a.n) {
                d0.f("Dispatcher", "ignored", aVar.b.b(), "because shut down");
            }
        } else {
            Picasso picasso = aVar.a;
            d dVar = this.f6852k;
            z zVar = this.f6853l;
            Object obj = f.m.b.c.y;
            v vVar2 = aVar.b;
            List<x> list2 = picasso.f1329d;
            int i2 = 0;
            int size = list2.size();
            while (true) {
                if (i2 < size) {
                    x xVar = list2.get(i2);
                    if (xVar.c(vVar2)) {
                        cVar = new f.m.b.c(picasso, this, dVar, zVar, aVar, xVar);
                        break;
                    }
                    i2++;
                } else {
                    cVar = new f.m.b.c(picasso, this, dVar, zVar, aVar, f.m.b.c.B);
                    break;
                }
            }
            cVar.s = this.c.submit(cVar);
            this.f6846e.put(aVar.f6815i, cVar);
            if (z) {
                this.f6847f.remove(aVar.d());
            }
            if (aVar.a.n) {
                d0.f("Dispatcher", "enqueued", aVar.b.b(), "");
            }
        }
    }
}
