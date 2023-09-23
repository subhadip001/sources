package e.g0.t.q.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import e.g0.k;

/* compiled from: NetworkStateTracker.java */
/* loaded from: classes.dex */
public class e extends d<e.g0.t.q.b> {

    /* renamed from: j  reason: collision with root package name */
    public static final String f2312j = k.e("NetworkStateTracker");

    /* renamed from: g  reason: collision with root package name */
    public final ConnectivityManager f2313g;

    /* renamed from: h  reason: collision with root package name */
    public b f2314h;

    /* renamed from: i  reason: collision with root package name */
    public a f2315i;

    /* compiled from: NetworkStateTracker.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            k.c().a(e.f2312j, "Network broadcast received", new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }
    }

    /* compiled from: NetworkStateTracker.java */
    /* loaded from: classes.dex */
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            k.c().a(e.f2312j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            k.c().a(e.f2312j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }
    }

    public e(Context context, e.g0.t.t.t.a aVar) {
        super(context, aVar);
        this.f2313g = (ConnectivityManager) this.b.getSystemService("connectivity");
        if (g()) {
            this.f2314h = new b();
        } else {
            this.f2315i = new a();
        }
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // e.g0.t.q.f.d
    public e.g0.t.q.b a() {
        return f();
    }

    @Override // e.g0.t.q.f.d
    public void d() {
        if (g()) {
            try {
                k.c().a(f2312j, "Registering network callback", new Throwable[0]);
                this.f2313g.registerDefaultNetworkCallback(this.f2314h);
                return;
            } catch (IllegalArgumentException | SecurityException e2) {
                k.c().b(f2312j, "Received exception while registering network callback", e2);
                return;
            }
        }
        k.c().a(f2312j, "Registering broadcast receiver", new Throwable[0]);
        this.b.registerReceiver(this.f2315i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // e.g0.t.q.f.d
    public void e() {
        if (g()) {
            try {
                k.c().a(f2312j, "Unregistering network callback", new Throwable[0]);
                this.f2313g.unregisterNetworkCallback(this.f2314h);
                return;
            } catch (IllegalArgumentException | SecurityException e2) {
                k.c().b(f2312j, "Received exception while unregistering network callback", e2);
                return;
            }
        }
        k.c().a(f2312j, "Unregistering broadcast receiver", new Throwable[0]);
        this.b.unregisterReceiver(this.f2315i);
    }

    public e.g0.t.q.b f() {
        NetworkCapabilities networkCapabilities;
        boolean z;
        NetworkInfo activeNetworkInfo = this.f2313g.getActiveNetworkInfo();
        boolean z2 = false;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                networkCapabilities = this.f2313g.getNetworkCapabilities(this.f2313g.getActiveNetwork());
            } catch (SecurityException e2) {
                k.c().b(f2312j, "Unable to validate active network", e2);
            }
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    z = true;
                    boolean isActiveNetworkMetered = this.f2313g.isActiveNetworkMetered();
                    if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                        z2 = true;
                    }
                    return new e.g0.t.q.b(z3, z, isActiveNetworkMetered, z2);
                }
            }
        }
        z = false;
        boolean isActiveNetworkMetered2 = this.f2313g.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
            z2 = true;
        }
        return new e.g0.t.q.b(z3, z, isActiveNetworkMetered2, z2);
    }
}
