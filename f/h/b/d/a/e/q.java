package f.h.b.d.a.e;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class q {
    public static final Map o = new HashMap();
    public final Context a;
    public final f b;
    public final String c;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5803g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f5804h;

    /* renamed from: i  reason: collision with root package name */
    public final m f5805i;

    /* renamed from: m  reason: collision with root package name */
    public ServiceConnection f5809m;
    public IInterface n;

    /* renamed from: d  reason: collision with root package name */
    public final List f5800d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final Set f5801e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f5802f = new Object();

    /* renamed from: k  reason: collision with root package name */
    public final IBinder.DeathRecipient f5807k = new IBinder.DeathRecipient() { // from class: f.h.b.d.a.e.h
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            q qVar = q.this;
            qVar.b.d("reportBinderDeath", new Object[0]);
            l lVar = (l) qVar.f5806j.get();
            if (lVar != null) {
                qVar.b.d("calling onBinderDied", new Object[0]);
                lVar.zza();
            } else {
                qVar.b.d("%s : Binder has died.", qVar.c);
                for (g gVar : qVar.f5800d) {
                    RemoteException remoteException = new RemoteException(String.valueOf(qVar.c).concat(" : Binder has died."));
                    f.h.b.d.a.i.m mVar = gVar.f5791f;
                    if (mVar != null) {
                        mVar.a(remoteException);
                    }
                }
                qVar.f5800d.clear();
            }
            qVar.d();
        }
    };

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f5808l = new AtomicInteger(0);

    /* renamed from: j  reason: collision with root package name */
    public final WeakReference f5806j = new WeakReference(null);

    public q(Context context, f fVar, String str, Intent intent, m mVar, l lVar) {
        this.a = context;
        this.b = fVar;
        this.c = str;
        this.f5804h = intent;
        this.f5805i = mVar;
    }

    public final Handler a() {
        Handler handler;
        Map map = o;
        synchronized (map) {
            if (!map.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                map.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.c);
        }
        return handler;
    }

    public final void b(g gVar, final f.h.b.d.a.i.m mVar) {
        synchronized (this.f5802f) {
            this.f5801e.add(mVar);
            mVar.a.a(new f.h.b.d.a.i.a() { // from class: f.h.b.d.a.e.i
                @Override // f.h.b.d.a.i.a
                public final void a(f.h.b.d.a.i.p pVar) {
                    q qVar = q.this;
                    f.h.b.d.a.i.m mVar2 = mVar;
                    synchronized (qVar.f5802f) {
                        qVar.f5801e.remove(mVar2);
                    }
                }
            });
        }
        synchronized (this.f5802f) {
            if (this.f5808l.getAndIncrement() > 0) {
                this.b.a("Already connected to the service.", new Object[0]);
            }
        }
        a().post(new j(this, gVar.f5791f, gVar));
    }

    public final void c(f.h.b.d.a.i.m mVar) {
        synchronized (this.f5802f) {
            this.f5801e.remove(mVar);
        }
        synchronized (this.f5802f) {
            if (this.f5808l.get() > 0 && this.f5808l.decrementAndGet() > 0) {
                this.b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            a().post(new k(this));
        }
    }

    public final void d() {
        synchronized (this.f5802f) {
            for (f.h.b.d.a.i.m mVar : this.f5801e) {
                mVar.a(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
            }
            this.f5801e.clear();
        }
    }
}
