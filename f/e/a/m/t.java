package f.e.a.m;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import f.e.a.m.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: d  reason: collision with root package name */
    public static volatile t f3540d;
    public final c a;
    public final Set<c.a> b = new HashSet();
    public boolean c;

    /* compiled from: SingletonConnectivityReceiver.java */
    /* loaded from: classes.dex */
    public class a implements f.e.a.r.g<ConnectivityManager> {
        public final /* synthetic */ Context a;

        public a(t tVar, Context context) {
            this.a = context;
        }

        @Override // f.e.a.r.g
        public ConnectivityManager get() {
            return (ConnectivityManager) this.a.getSystemService("connectivity");
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    /* loaded from: classes.dex */
    public class b implements c.a {
        public b() {
        }

        @Override // f.e.a.m.c.a
        public void a(boolean z) {
            ArrayList arrayList;
            f.e.a.r.l.a();
            synchronized (t.this) {
                arrayList = new ArrayList(t.this.b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c.a) it.next()).a(z);
            }
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    /* loaded from: classes.dex */
    public interface c {
        boolean a();

        void unregister();
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    /* loaded from: classes.dex */
    public static final class d implements c {
        public boolean a;
        public final c.a b;
        public final f.e.a.r.g<ConnectivityManager> c;

        /* renamed from: d  reason: collision with root package name */
        public final ConnectivityManager.NetworkCallback f3541d = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        /* loaded from: classes.dex */
        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                f.e.a.r.l.k(new u(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                f.e.a.r.l.k(new u(this, false));
            }
        }

        public d(f.e.a.r.g<ConnectivityManager> gVar, c.a aVar) {
            this.c = gVar;
            this.b = aVar;
        }

        @Override // f.e.a.m.t.c
        public boolean a() {
            this.a = this.c.get().getActiveNetwork() != null;
            try {
                this.c.get().registerDefaultNetworkCallback(this.f3541d);
                return true;
            } catch (RuntimeException e2) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e2);
                }
                return false;
            }
        }

        @Override // f.e.a.m.t.c
        public void unregister() {
            this.c.get().unregisterNetworkCallback(this.f3541d);
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    /* loaded from: classes.dex */
    public static final class e implements c {

        /* renamed from: g  reason: collision with root package name */
        public static final Executor f3542g = AsyncTask.SERIAL_EXECUTOR;
        public final Context a;
        public final c.a b;
        public final f.e.a.r.g<ConnectivityManager> c;

        /* renamed from: d  reason: collision with root package name */
        public volatile boolean f3543d;

        /* renamed from: e  reason: collision with root package name */
        public volatile boolean f3544e;

        /* renamed from: f  reason: collision with root package name */
        public final BroadcastReceiver f3545f = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                e eVar = e.this;
                Objects.requireNonNull(eVar);
                e.f3542g.execute(new v(eVar));
            }
        }

        /* compiled from: SingletonConnectivityReceiver.java */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f3543d = eVar.b();
                try {
                    e eVar2 = e.this;
                    eVar2.a.registerReceiver(eVar2.f3545f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    e.this.f3544e = true;
                } catch (SecurityException e2) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e2);
                    }
                    e.this.f3544e = false;
                }
            }
        }

        /* compiled from: SingletonConnectivityReceiver.java */
        /* loaded from: classes.dex */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e.this.f3544e) {
                    e.this.f3544e = false;
                    e eVar = e.this;
                    eVar.a.unregisterReceiver(eVar.f3545f);
                }
            }
        }

        public e(Context context, f.e.a.r.g<ConnectivityManager> gVar, c.a aVar) {
            this.a = context.getApplicationContext();
            this.c = gVar;
            this.b = aVar;
        }

        @Override // f.e.a.m.t.c
        public boolean a() {
            f3542g.execute(new b());
            return true;
        }

        public boolean b() {
            try {
                NetworkInfo activeNetworkInfo = this.c.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e2) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e2);
                }
                return true;
            }
        }

        @Override // f.e.a.m.t.c
        public void unregister() {
            f3542g.execute(new c());
        }
    }

    public t(Context context) {
        c eVar;
        f.e.a.r.f fVar = new f.e.a.r.f(new a(this, context));
        b bVar = new b();
        if (Build.VERSION.SDK_INT >= 24) {
            eVar = new d(fVar, bVar);
        } else {
            eVar = new e(context, fVar, bVar);
        }
        this.a = eVar;
    }

    public static t a(Context context) {
        if (f3540d == null) {
            synchronized (t.class) {
                if (f3540d == null) {
                    f3540d = new t(context.getApplicationContext());
                }
            }
        }
        return f3540d;
    }
}
