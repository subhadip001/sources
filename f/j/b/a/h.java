package f.j.b.a;

import com.android.billingclient.api.SkuDetails;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import e.v.k;
import f.a.a.a.p;
import j.a.c0;
import j.a.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: BillingManager.kt */
/* loaded from: classes2.dex */
public final class h implements p {
    public final /* synthetic */ ArrayList<f.j.b.c.a> a;
    public final /* synthetic */ d b;

    /* compiled from: BillingManager.kt */
    @i.j.j.a.e(c = "com.inverseai.billing.controller.BillingManager$queryProducts$inAppQuery$1$1$1", f = "BillingManager.kt", l = {217}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i.j.j.a.h implements i.l.a.p<c0, i.j.d<? super i.h>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f6563j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ d f6564k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ArrayList<f.j.b.c.a> f6565l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, ArrayList<f.j.b.c.a> arrayList, i.j.d<? super a> dVar2) {
            super(2, dVar2);
            this.f6564k = dVar;
            this.f6565l = arrayList;
        }

        @Override // i.j.j.a.a
        public final i.j.d<i.h> a(Object obj, i.j.d<?> dVar) {
            return new a(this.f6564k, this.f6565l, dVar);
        }

        @Override // i.l.a.p
        public Object k(c0 c0Var, i.j.d<? super i.h> dVar) {
            return new a(this.f6564k, this.f6565l, dVar).l(i.h.a);
        }

        @Override // i.j.j.a.a
        public final Object l(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f6563j;
            if (i2 == 0) {
                f.n.a.n.i.e0(obj);
                f.j.b.b.a aVar = this.f6564k.a;
                ArrayList<f.j.b.c.a> arrayList = this.f6565l;
                this.f6563j = 1;
                f.j.b.b.b bVar = (f.j.b.b.b) aVar;
                bVar.a.b();
                e.x.a.f.f a = bVar.f6575d.a();
                bVar.a.c();
                try {
                    a.a();
                    bVar.a.l();
                    bVar.a.g();
                    k kVar = bVar.f6575d;
                    if (a == kVar.c) {
                        kVar.a.set(false);
                    }
                    bVar.a.b();
                    bVar.a.c();
                    try {
                        bVar.b.e(arrayList);
                        bVar.a.l();
                        bVar.a.g();
                        if (i.h.a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th) {
                        bVar.a.g();
                        throw th;
                    }
                } catch (Throwable th2) {
                    bVar.a.g();
                    bVar.f6575d.c(a);
                    throw th2;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                f.n.a.n.i.e0(obj);
            }
            return i.h.a;
        }
    }

    public h(ArrayList<f.j.b.c.a> arrayList, d dVar) {
        this.a = arrayList;
        this.b = dVar;
    }

    @Override // f.a.a.a.p
    public final void a(f.a.a.a.j jVar, List<SkuDetails> list) {
        Iterator<SkuDetails> it;
        h hVar;
        String h2;
        String optString;
        String e2;
        String d2;
        String optString2;
        String optString3;
        String c;
        String a2;
        String optString4;
        String optString5;
        String optString6;
        h hVar2;
        i.l.b.i.e(jVar, "billingResult");
        int i2 = jVar.a;
        if (i2 == -1) {
            this.b.f6541f.i(Boolean.FALSE);
            d dVar = this.b;
            dVar.f6539d = true;
            dVar.c();
        } else if (i2 != 0) {
            this.b.f6541f.i(Boolean.FALSE);
        } else {
            Iterator<SkuDetails> it2 = (list == null ? new ArrayList<>() : list).iterator();
            h hVar3 = this;
            while (it2.hasNext()) {
                SkuDetails next = it2.next();
                try {
                    h2 = new f.h.f.j().h(next);
                    optString = next.b.optString("title");
                    i.l.b.i.d(optString, "item.title");
                    e2 = next.e();
                    i.l.b.i.d(e2, "item.type");
                    d2 = next.d();
                    i.l.b.i.d(d2, "item.sku");
                    optString2 = next.b.optString("freeTrialPeriod");
                    i.l.b.i.d(optString2, "item.freeTrialPeriod");
                    optString3 = next.b.optString("subscriptionPeriod");
                    i.l.b.i.d(optString3, "item.subscriptionPeriod");
                    c = next.c();
                    i.l.b.i.d(c, "item.price");
                    a2 = next.a();
                    i.l.b.i.d(a2, "item.originalPrice");
                    optString4 = next.b.optString("price_currency_code");
                    i.l.b.i.d(optString4, "item.priceCurrencyCode");
                    optString5 = next.b.optString("introductoryPrice");
                    i.l.b.i.d(optString5, "item.introductoryPrice");
                    it = it2;
                } catch (Exception unused) {
                    it = it2;
                }
                try {
                    optString6 = next.b.optString("introductoryPricePeriod");
                    i.l.b.i.d(optString6, "item.introductoryPricePeriod");
                    hVar = hVar3;
                } catch (Exception unused2) {
                    hVar = hVar3;
                    hVar3 = hVar;
                    it2 = it;
                }
                try {
                    int optInt = next.b.optInt("introductoryPriceCycles");
                    long b = next.b();
                    try {
                        long optLong = next.b.optLong("introductoryPriceAmountMicros");
                        String str = next.a;
                        i.l.b.i.d(str, "item.originalJson");
                        String optString7 = next.b.optString("iconUrl");
                        i.l.b.i.d(optString7, "item.iconUrl");
                        String optString8 = next.b.optString("description");
                        i.l.b.i.d(optString8, "item.description");
                        i.l.b.i.d(h2, "skuDetailsJson");
                        f.j.b.c.a aVar = new f.j.b.c.a(optString, e2, d2, optString2, optString3, c, a2, optString4, optString5, optString6, optInt, b, optLong, str, optString7, optString8, false, h2, LogFileManager.MAX_LOG_SIZE);
                        hVar2 = this;
                        try {
                            hVar2.a.add(aVar);
                        } catch (Exception unused3) {
                        }
                    } catch (Exception unused4) {
                        hVar2 = this;
                    }
                    hVar3 = hVar2;
                } catch (Exception unused5) {
                    hVar3 = hVar;
                    it2 = it;
                }
                it2 = it;
            }
            hVar3.b.f6541f.i(Boolean.FALSE);
            f.n.a.n.i.D(f.n.a.n.i.a(l0.b), null, null, new a(hVar3.b, hVar3.a, null), 3, null);
        }
    }
}
