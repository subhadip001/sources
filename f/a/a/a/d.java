package f.a.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zze;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public class d extends c {
    public volatile int a;
    public final String b;
    public final Handler c;

    /* renamed from: d  reason: collision with root package name */
    public volatile y f3048d;

    /* renamed from: e  reason: collision with root package name */
    public Context f3049e;

    /* renamed from: f  reason: collision with root package name */
    public volatile zze f3050f;

    /* renamed from: g  reason: collision with root package name */
    public volatile u f3051g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3052h;

    /* renamed from: i  reason: collision with root package name */
    public int f3053i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3054j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3055k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3056l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3057m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public ExecutorService s;

    public d(boolean z, Context context, f.j.b.a.b bVar) {
        String f2 = f();
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.f3053i = 0;
        this.b = f2;
        Context applicationContext = context.getApplicationContext();
        this.f3049e = applicationContext;
        this.f3048d = new y(applicationContext, bVar);
        this.q = z;
        this.r = false;
    }

    public static String f() {
        try {
            return (String) Class.forName("f.a.a.b.a").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "4.1.0";
        }
    }

    @Override // f.a.a.a.c
    public final void a(o oVar, final p pVar) {
        if (!b()) {
            pVar.a(v.f3091l, null);
            return;
        }
        final String str = oVar.a;
        List<String> list = oVar.b;
        if (TextUtils.isEmpty(str)) {
            zzb.zzn("BillingClient", "Please fix the input params. SKU type can't be empty.");
            pVar.a(v.f3085f, null);
        } else if (list != null) {
            final ArrayList arrayList = new ArrayList();
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add(new w(str2));
                } else {
                    throw new IllegalArgumentException("SKU must be set.");
                }
            }
            if (g(new Callable() { // from class: f.a.a.a.e0
                /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
                    r14 = 4;
                    r0 = "Item is unavailable for purchase.";
                 */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 286
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.e0.call():java.lang.Object");
                }
            }, 30000L, new Runnable() { // from class: f.a.a.a.g0
                @Override // java.lang.Runnable
                public final void run() {
                    p.this.a(v.f3092m, null);
                }
            }, c()) == null) {
                pVar.a(e(), null);
            }
        } else {
            zzb.zzn("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            pVar.a(v.f3084e, null);
        }
    }

    public final boolean b() {
        return (this.a != 2 || this.f3050f == null || this.f3051g == null) ? false : true;
    }

    public final Handler c() {
        return Looper.myLooper() == null ? this.c : new Handler(Looper.myLooper());
    }

    public final j d(final j jVar) {
        if (Thread.interrupted()) {
            return jVar;
        }
        this.c.post(new Runnable() { // from class: f.a.a.a.d0
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                j jVar2 = jVar;
                if (dVar.f3048d.b.a != null) {
                    dVar.f3048d.b.a.a(jVar2, null);
                    return;
                }
                Objects.requireNonNull(dVar.f3048d.b);
                zzb.zzn("BillingClient", "No valid listener is set in BroadcastManager");
            }
        });
        return jVar;
    }

    public final j e() {
        if (this.a != 0 && this.a != 3) {
            return v.f3089j;
        }
        return v.f3091l;
    }

    public final Future g(Callable callable, long j2, final Runnable runnable, Handler handler) {
        long j3 = (long) (j2 * 0.95d);
        if (this.s == null) {
            this.s = Executors.newFixedThreadPool(zzb.zza, new r(this));
        }
        try {
            final Future submit = this.s.submit(callable);
            handler.postDelayed(new Runnable() { // from class: f.a.a.a.h0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    zzb.zzn("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, j3);
            return submit;
        } catch (Exception e2) {
            zzb.zzo("BillingClient", "Async task throws exception!", e2);
            return null;
        }
    }
}
