package f.j.b.a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import android.widget.Toast;
import androidx.lifecycle.LiveData;
import com.android.billingclient.api.SkuDetails;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.inverseai.billing.model.ProductType;
import e.s.s;
import f.a.a.a.o;
import f.a.a.a.u;
import f.a.a.a.v;
import f.a.a.a.x;
import f.a.a.a.y;
import i.l.a.p;
import j.a.c0;
import j.a.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: BillingManager.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: k  reason: collision with root package name */
    public static boolean f6537k;

    /* renamed from: l  reason: collision with root package name */
    public static d f6538l;
    public final f.j.b.b.a a;
    public final f.j.b.a.c b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6539d;

    /* renamed from: e  reason: collision with root package name */
    public f.a.a.a.c f6540e;

    /* renamed from: f  reason: collision with root package name */
    public s<Boolean> f6541f;

    /* renamed from: g  reason: collision with root package name */
    public s<Boolean> f6542g;

    /* renamed from: h  reason: collision with root package name */
    public final LiveData<List<f.j.b.c.a>> f6543h;

    /* renamed from: i  reason: collision with root package name */
    public final LiveData<List<f.j.b.c.b>> f6544i;

    /* renamed from: j  reason: collision with root package name */
    public final f.j.b.a.b f6545j;

    /* compiled from: BillingManager.kt */
    /* loaded from: classes2.dex */
    public static final class a implements f.a.a.a.g {

        /* compiled from: BillingManager.kt */
        @i.j.j.a.e(c = "com.inverseai.billing.controller.BillingManager$callForBillingConnection$1$onBillingServiceDisconnected$1", f = "BillingManager.kt", l = {131}, m = "invokeSuspend")
        /* renamed from: f.j.b.a.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0155a extends i.j.j.a.h implements p<c0, i.j.d<? super i.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f6546j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ d f6547k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0155a(d dVar, i.j.d<? super C0155a> dVar2) {
                super(2, dVar2);
                this.f6547k = dVar;
            }

            @Override // i.j.j.a.a
            public final i.j.d<i.h> a(Object obj, i.j.d<?> dVar) {
                return new C0155a(this.f6547k, dVar);
            }

            @Override // i.l.a.p
            public Object k(c0 c0Var, i.j.d<? super i.h> dVar) {
                return new C0155a(this.f6547k, dVar).l(i.h.a);
            }

            @Override // i.j.j.a.a
            public final Object l(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.f6546j;
                if (i2 == 0) {
                    f.n.a.n.i.e0(obj);
                    d dVar = this.f6547k;
                    this.f6546j = 1;
                    if (d.b(dVar, 3000L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    f.n.a.n.i.e0(obj);
                }
                return i.h.a;
            }
        }

        /* compiled from: BillingManager.kt */
        @i.j.j.a.e(c = "com.inverseai.billing.controller.BillingManager$callForBillingConnection$1$onBillingSetupFinished$1", f = "BillingManager.kt", l = {119, 120, 122}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends i.j.j.a.h implements p<c0, i.j.d<? super i.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f6548j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ f.a.a.a.j f6549k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ d f6550l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f.a.a.a.j jVar, d dVar, i.j.d<? super b> dVar2) {
                super(2, dVar2);
                this.f6549k = jVar;
                this.f6550l = dVar;
            }

            @Override // i.j.j.a.a
            public final i.j.d<i.h> a(Object obj, i.j.d<?> dVar) {
                return new b(this.f6549k, this.f6550l, dVar);
            }

            @Override // i.l.a.p
            public Object k(c0 c0Var, i.j.d<? super i.h> dVar) {
                return new b(this.f6549k, this.f6550l, dVar).l(i.h.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[RETURN] */
            @Override // i.j.j.a.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object l(java.lang.Object r6) {
                /*
                    r5 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r5.f6548j
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r4) goto L1c
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    goto L18
                L10:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L18:
                    f.n.a.n.i.e0(r6)
                    goto L4c
                L1c:
                    f.n.a.n.i.e0(r6)
                    goto L34
                L20:
                    f.n.a.n.i.e0(r6)
                    f.a.a.a.j r6 = r5.f6549k
                    int r6 = r6.a
                    if (r6 != 0) goto L3f
                    f.j.b.a.d r6 = r5.f6550l
                    r5.f6548j = r4
                    java.lang.Object r6 = f.j.b.a.d.a(r6, r5)
                    if (r6 != r0) goto L34
                    return r0
                L34:
                    f.j.b.a.d r6 = r5.f6550l
                    r5.f6548j = r3
                    java.lang.Object r6 = r6.g()
                    if (r6 != r0) goto L4c
                    return r0
                L3f:
                    f.j.b.a.d r6 = r5.f6550l
                    r3 = 3000(0xbb8, double:1.482E-320)
                    r5.f6548j = r2
                    java.lang.Object r6 = f.j.b.a.d.b(r6, r3, r5)
                    if (r6 != r0) goto L4c
                    return r0
                L4c:
                    i.h r6 = i.h.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: f.j.b.a.d.a.b.l(java.lang.Object):java.lang.Object");
            }
        }

        public a() {
        }

        @Override // f.a.a.a.g
        public void a(f.a.a.a.j jVar) {
            i.l.b.i.e(jVar, "billingResult");
            d dVar = d.this;
            dVar.c = false;
            dVar.f6539d = false;
            f.n.a.n.i.D(f.n.a.n.i.a(l0.b), null, null, new b(jVar, d.this, null), 3, null);
        }

        @Override // f.a.a.a.g
        public void b() {
            d dVar = d.this;
            dVar.c = false;
            dVar.f6539d = true;
            f.n.a.n.i.D(f.n.a.n.i.a(l0.b), null, null, new C0155a(d.this, null), 3, null);
        }
    }

    /* compiled from: BillingManager.kt */
    @i.j.j.a.e(c = "com.inverseai.billing.controller.BillingManager$initiatePurchase$1", f = "BillingManager.kt", l = {286}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i.j.j.a.h implements p<c0, i.j.d<? super i.h>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f6551j;

        public b(i.j.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // i.j.j.a.a
        public final i.j.d<i.h> a(Object obj, i.j.d<?> dVar) {
            return new b(dVar);
        }

        @Override // i.l.a.p
        public Object k(c0 c0Var, i.j.d<? super i.h> dVar) {
            return new b(dVar).l(i.h.a);
        }

        @Override // i.j.j.a.a
        public final Object l(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f6551j;
            if (i2 == 0) {
                f.n.a.n.i.e0(obj);
                d dVar = d.this;
                this.f6551j = 1;
                if (d.b(dVar, 3000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                f.n.a.n.i.e0(obj);
            }
            return i.h.a;
        }
    }

    /* compiled from: BillingManager.kt */
    @i.j.j.a.e(c = "com.inverseai.billing.controller.BillingManager$refreshAgain$1", f = "BillingManager.kt", l = {101, 102}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends i.j.j.a.h implements p<c0, i.j.d<? super i.h>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f6553j;

        public c(i.j.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // i.j.j.a.a
        public final i.j.d<i.h> a(Object obj, i.j.d<?> dVar) {
            return new c(dVar);
        }

        @Override // i.l.a.p
        public Object k(c0 c0Var, i.j.d<? super i.h> dVar) {
            return new c(dVar).l(i.h.a);
        }

        @Override // i.j.j.a.a
        public final Object l(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f6553j;
            if (i2 == 0) {
                f.n.a.n.i.e0(obj);
                d dVar = d.this;
                this.f6553j = 1;
                if (d.a(dVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.n.a.n.i.e0(obj);
                return i.h.a;
            } else {
                f.n.a.n.i.e0(obj);
            }
            d dVar2 = d.this;
            this.f6553j = 2;
            if (dVar2.g() == coroutineSingletons) {
                return coroutineSingletons;
            }
            return i.h.a;
        }
    }

    public d(f.j.b.b.a aVar, f.j.b.a.c cVar) {
        i.l.b.i.e(aVar, "billingDao");
        i.l.b.i.e(cVar, "clientSecret");
        this.a = aVar;
        this.b = cVar;
        Boolean bool = Boolean.FALSE;
        this.f6541f = new s<>(bool);
        this.f6542g = new s<>(bool);
        f.j.b.b.b bVar = (f.j.b.b.b) aVar;
        this.f6543h = bVar.a.f558e.b(new String[]{"product_table"}, false, new f.j.b.b.c(bVar, e.v.h.g("SELECT * FROM product_table ORDER BY id ASC", 0)));
        this.f6544i = bVar.a.f558e.b(new String[]{"purchase_table"}, false, new f.j.b.b.d(bVar, e.v.h.g("SELECT * FROM purchase_table  ORDER BY purchaseTime ASC", 0)));
        this.f6545j = new f.j.b.a.b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5 A[LOOP:1: B:33:0x009f->B:35:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[LOOP:0: B:48:0x00da->B:50:0x00e0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(f.j.b.a.d r7, i.j.d r8) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.j.b.a.d.a(f.j.b.a.d, i.j.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(f.j.b.a.d r5, long r6, i.j.d r8) {
        /*
            java.util.Objects.requireNonNull(r5)
            boolean r0 = r8 instanceof f.j.b.a.j
            if (r0 == 0) goto L16
            r0 = r8
            f.j.b.a.j r0 = (f.j.b.a.j) r0
            int r1 = r0.f6574l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f6574l = r1
            goto L1b
        L16:
            f.j.b.a.j r0 = new f.j.b.a.j
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r8 = r0.f6572j
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f6574l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            f.n.a.n.i.e0(r8)
            goto L57
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            java.lang.Object r5 = r0.f6571i
            f.j.b.a.d r5 = (f.j.b.a.d) r5
            f.n.a.n.i.e0(r8)
            goto L4b
        L3d:
            f.n.a.n.i.e0(r8)
            r0.f6571i = r5
            r0.f6574l = r4
            java.lang.Object r6 = f.n.a.n.i.q(r6, r0)
            if (r6 != r1) goto L4b
            goto L59
        L4b:
            r6 = 0
            r0.f6571i = r6
            r0.f6574l = r3
            java.lang.Object r5 = r5.g()
            if (r5 != r1) goto L57
            goto L59
        L57:
            i.h r1 = i.h.a
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.j.b.a.d.b(f.j.b.a.d, long, i.j.d):java.lang.Object");
    }

    public final void c() {
        ServiceInfo serviceInfo;
        if (this.c) {
            return;
        }
        this.c = true;
        f.a.a.a.c cVar = this.f6540e;
        if (cVar == null) {
            return;
        }
        a aVar = new a();
        f.a.a.a.d dVar = (f.a.a.a.d) cVar;
        if (dVar.b()) {
            zzb.zzm("BillingClient", "Service connection is valid. No need to re-initialize.");
            aVar.a(v.f3090k);
        } else if (dVar.a == 1) {
            zzb.zzn("BillingClient", "Client is already in the process of connecting to billing service.");
            aVar.a(v.f3083d);
        } else if (dVar.a == 3) {
            zzb.zzn("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            aVar.a(v.f3091l);
        } else {
            dVar.a = 1;
            y yVar = dVar.f3048d;
            x xVar = yVar.b;
            Context context = yVar.a;
            IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
            if (!xVar.b) {
                context.registerReceiver(xVar.c.b, intentFilter);
                xVar.b = true;
            }
            zzb.zzm("BillingClient", "Starting in-app billing setup.");
            dVar.f3051g = new u(dVar, aVar);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = dVar.f3049e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", dVar.b);
                    if (dVar.f3049e.bindService(intent2, dVar.f3051g, 1)) {
                        zzb.zzm("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    zzb.zzn("BillingClient", "Connection to Billing service is blocked.");
                } else {
                    zzb.zzn("BillingClient", "The device doesn't have valid Play Store.");
                }
            }
            dVar.a = 0;
            zzb.zzm("BillingClient", "Billing service unavailable on device.");
            aVar.a(v.c);
        }
    }

    public final List<String> d(ProductType productType) {
        int ordinal = productType.ordinal();
        if (ordinal == 0) {
            Objects.requireNonNull((f.n.a.l.b) this.b);
            return f.n.a.l.b.b();
        } else if (ordinal == 1) {
            Objects.requireNonNull((f.n.a.l.b) this.b);
            return f.n.a.l.b.e();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0451 A[Catch: Exception -> 0x0490, CancellationException -> 0x049d, TimeoutException -> 0x049f, TryCatch #4 {CancellationException -> 0x049d, TimeoutException -> 0x049f, Exception -> 0x0490, blocks: (B:175:0x043f, B:177:0x0451, B:178:0x0475), top: B:197:0x043f }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0475 A[Catch: Exception -> 0x0490, CancellationException -> 0x049d, TimeoutException -> 0x049f, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x049d, TimeoutException -> 0x049f, Exception -> 0x0490, blocks: (B:175:0x043f, B:177:0x0451, B:178:0x0475), top: B:197:0x043f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(android.app.Activity r34, com.android.billingclient.api.SkuDetails r35) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.j.b.a.d.e(android.app.Activity, com.android.billingclient.api.SkuDetails):boolean");
    }

    public final boolean f(Activity activity, String str) {
        i.l.b.i.e(activity, "activity");
        i.l.b.i.e(str, "payload");
        try {
            SkuDetails skuDetails = (SkuDetails) new f.h.f.j().c(str, SkuDetails.class);
            i.l.b.i.d(skuDetails, "details");
            return e(activity, skuDetails);
        } catch (Exception e2) {
            Log.e("BillingManager", "initiatePurchase: ", e2);
            Toast.makeText(activity, "Something went wrong", 0).show();
            return false;
        }
    }

    public final Object g() {
        Boolean d2 = this.f6541f.d();
        Boolean bool = Boolean.TRUE;
        if (i.l.b.i.a(d2, bool)) {
            return i.h.a;
        }
        if (this.f6539d) {
            c();
            return i.h.a;
        }
        final ArrayList arrayList = new ArrayList();
        final g gVar = new g(this, arrayList);
        ArrayList arrayList2 = new ArrayList(d(ProductType.SUBSCRIPTION));
        this.f6541f.i(bool);
        f.a.a.a.c cVar = this.f6540e;
        i.l.b.i.b(cVar);
        o oVar = new o();
        oVar.a = "subs";
        oVar.b = arrayList2;
        cVar.a(oVar, new f.a.a.a.p() { // from class: f.j.b.a.a
            @Override // f.a.a.a.p
            public final void a(f.a.a.a.j jVar, List list) {
                Iterator it;
                ArrayList arrayList3;
                Runnable runnable;
                String h2;
                String optString;
                String e2;
                String d3;
                String optString2;
                String optString3;
                String c2;
                String a2;
                String optString4;
                String optString5;
                ArrayList arrayList4 = arrayList;
                Runnable runnable2 = gVar;
                d dVar = this;
                i.l.b.i.e(arrayList4, "$items");
                i.l.b.i.e(runnable2, "$inAppQuery");
                i.l.b.i.e(dVar, "this$0");
                i.l.b.i.e(jVar, "billingResult");
                int i2 = jVar.a;
                if (i2 == -1) {
                    dVar.f6541f.i(Boolean.FALSE);
                } else if (i2 != 0) {
                    dVar.f6541f.i(Boolean.FALSE);
                } else {
                    Iterator it2 = (list == null ? new ArrayList() : list).iterator();
                    while (it2.hasNext()) {
                        SkuDetails skuDetails = (SkuDetails) it2.next();
                        try {
                            h2 = new f.h.f.j().h(skuDetails);
                            optString = skuDetails.b.optString("title");
                            i.l.b.i.d(optString, "item.title");
                            e2 = skuDetails.e();
                            i.l.b.i.d(e2, "item.type");
                            d3 = skuDetails.d();
                            i.l.b.i.d(d3, "item.sku");
                            optString2 = skuDetails.b.optString("freeTrialPeriod");
                            i.l.b.i.d(optString2, "item.freeTrialPeriod");
                            optString3 = skuDetails.b.optString("subscriptionPeriod");
                            i.l.b.i.d(optString3, "item.subscriptionPeriod");
                            c2 = skuDetails.c();
                            i.l.b.i.d(c2, "item.price");
                            a2 = skuDetails.a();
                            i.l.b.i.d(a2, "item.originalPrice");
                            optString4 = skuDetails.b.optString("price_currency_code");
                            i.l.b.i.d(optString4, "item.priceCurrencyCode");
                            optString5 = skuDetails.b.optString("introductoryPrice");
                            i.l.b.i.d(optString5, "item.introductoryPrice");
                            it = it2;
                        } catch (Exception unused) {
                            it = it2;
                        }
                        try {
                            String optString6 = skuDetails.b.optString("introductoryPricePeriod");
                            i.l.b.i.d(optString6, "item.introductoryPricePeriod");
                            runnable = runnable2;
                            try {
                                int optInt = skuDetails.b.optInt("introductoryPriceCycles");
                                long b2 = skuDetails.b();
                                long optLong = skuDetails.b.optLong("introductoryPriceAmountMicros");
                                String str = skuDetails.a;
                                i.l.b.i.d(str, "item.originalJson");
                                ArrayList arrayList5 = arrayList4;
                                try {
                                    String optString7 = skuDetails.b.optString("iconUrl");
                                    i.l.b.i.d(optString7, "item.iconUrl");
                                    String optString8 = skuDetails.b.optString("description");
                                    i.l.b.i.d(optString8, "item.description");
                                    i.l.b.i.d(h2, "skuDetailsJson");
                                    f.j.b.c.a aVar = new f.j.b.c.a(optString, e2, d3, optString2, optString3, c2, a2, optString4, optString5, optString6, optInt, b2, optLong, str, optString7, optString8, false, h2, LogFileManager.MAX_LOG_SIZE);
                                    arrayList3 = arrayList5;
                                    try {
                                        arrayList3.add(aVar);
                                    } catch (Exception unused2) {
                                    }
                                } catch (Exception unused3) {
                                    arrayList3 = arrayList5;
                                }
                            } catch (Exception unused4) {
                                arrayList3 = arrayList4;
                            }
                        } catch (Exception unused5) {
                            arrayList3 = arrayList4;
                            runnable = runnable2;
                            it2 = it;
                            arrayList4 = arrayList3;
                            runnable2 = runnable;
                        }
                        it2 = it;
                        arrayList4 = arrayList3;
                        runnable2 = runnable;
                    }
                    runnable2.run();
                }
            }
        });
        return i.h.a;
    }

    public final void h() {
        f.n.a.n.i.D(f.n.a.n.i.a(l0.b), null, null, new c(null), 3, null);
    }
}
