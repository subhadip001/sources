package e.g0.t.q.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import e.g0.k;

/* compiled from: BroadcastReceiverConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final String f2305h = k.e("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g  reason: collision with root package name */
    public final BroadcastReceiver f2306g;

    /* compiled from: BroadcastReceiverConstraintTracker.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.g(context, intent);
            }
        }
    }

    public c(Context context, e.g0.t.t.t.a aVar) {
        super(context, aVar);
        this.f2306g = new a();
    }

    @Override // e.g0.t.q.f.d
    public void d() {
        k.c().a(f2305h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.registerReceiver(this.f2306g, f());
    }

    @Override // e.g0.t.q.f.d
    public void e() {
        k.c().a(f2305h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.unregisterReceiver(this.f2306g);
    }

    public abstract IntentFilter f();

    public abstract void g(Context context, Intent intent);
}
