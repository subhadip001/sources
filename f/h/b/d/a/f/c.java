package f.h.b.d.a.f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import f.h.b.d.a.e.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public abstract class c {
    public final f a;
    public final IntentFilter b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f5815d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public b f5816e = null;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f5817f = false;

    public c(f fVar, IntentFilter intentFilter, Context context) {
        this.a = fVar;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public abstract void a(Context context, Intent intent);

    public final void b() {
        b bVar;
        if ((this.f5817f || !this.f5815d.isEmpty()) && this.f5816e == null) {
            b bVar2 = new b(this);
            this.f5816e = bVar2;
            this.c.registerReceiver(bVar2, this.b);
        }
        if (this.f5817f || !this.f5815d.isEmpty() || (bVar = this.f5816e) == null) {
            return;
        }
        this.c.unregisterReceiver(bVar);
        this.f5816e = null;
    }

    public final synchronized void c(Object obj) {
        Iterator it = new HashSet(this.f5815d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(obj);
        }
    }
}
