package f.a.a.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzd;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class u implements ServiceConnection {

    /* renamed from: f  reason: collision with root package name */
    public final Object f3080f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public g f3081g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ d f3082h;

    public /* synthetic */ u(d dVar, g gVar) {
        this.f3082h = dVar;
        this.f3081g = gVar;
    }

    public final void a(j jVar) {
        synchronized (this.f3080f) {
            g gVar = this.f3081g;
            if (gVar != null) {
                gVar.a(jVar);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzm("BillingClient", "Billing service connected.");
        this.f3082h.f3050f = zzd.zzo(iBinder);
        d dVar = this.f3082h;
        if (dVar.g(new Callable() { // from class: f.a.a.a.t
            /* JADX WARN: Removed duplicated region for block: B:75:0x00f0  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x00f6  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 255
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.t.call():java.lang.Object");
            }
        }, 30000L, new Runnable() { // from class: f.a.a.a.s
            @Override // java.lang.Runnable
            public final void run() {
                u uVar = u.this;
                uVar.f3082h.a = 0;
                uVar.f3082h.f3050f = null;
                uVar.a(v.f3092m);
            }
        }, dVar.c()) == null) {
            a(this.f3082h.e());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzn("BillingClient", "Billing service disconnected.");
        this.f3082h.f3050f = null;
        this.f3082h.a = 0;
        synchronized (this.f3080f) {
            g gVar = this.f3081g;
            if (gVar != null) {
                gVar.b();
            }
        }
    }
}
