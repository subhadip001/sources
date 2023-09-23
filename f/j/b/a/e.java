package f.j.b.a;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzb;
import f.a.a.a.a;
import f.a.a.a.v;
import i.l.a.p;
import j.a.c0;
import j.a.o;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: BillingManager.kt */
@i.j.j.a.e(c = "com.inverseai.billing.controller.BillingManager$handlePurchase$1", f = "BillingManager.kt", l = {353}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends i.j.j.a.h implements p<c0, i.j.d<? super i.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f6555j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ d f6556k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ a.C0064a f6557l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, a.C0064a c0064a, i.j.d<? super e> dVar2) {
        super(2, dVar2);
        this.f6556k = dVar;
        this.f6557l = c0064a;
    }

    @Override // i.j.j.a.a
    public final i.j.d<i.h> a(Object obj, i.j.d<?> dVar) {
        return new e(this.f6556k, this.f6557l, dVar);
    }

    @Override // i.l.a.p
    public Object k(c0 c0Var, i.j.d<? super i.h> dVar) {
        return new e(this.f6556k, this.f6557l, dVar).l(i.h.a);
    }

    @Override // i.j.j.a.a
    public final Object l(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f6555j;
        if (i2 == 0) {
            f.n.a.n.i.e0(obj);
            f.a.a.a.c cVar = this.f6556k.f6540e;
            if (cVar != null) {
                String str = this.f6557l.a;
                if (str != null) {
                    final f.a.a.a.a aVar = new f.a.a.a.a();
                    aVar.a = str;
                    i.l.b.i.d(aVar, "acknowledgePurchaseParams.build()");
                    this.f6555j = 1;
                    j.a.p pVar = new j.a.p(null);
                    final f.a.a.a.e eVar = new f.a.a.a.e(pVar);
                    final f.a.a.a.d dVar = (f.a.a.a.d) cVar;
                    if (!dVar.b()) {
                        f.a.a.a.j jVar = v.f3091l;
                        o<f.a.a.a.j> oVar = eVar.a;
                        i.l.b.i.d(jVar, "it");
                        oVar.N(jVar);
                    } else if (TextUtils.isEmpty(aVar.a)) {
                        zzb.zzn("BillingClient", "Please provide a valid purchase token.");
                        f.a.a.a.j jVar2 = v.f3088i;
                        o<f.a.a.a.j> oVar2 = eVar.a;
                        i.l.b.i.d(jVar2, "it");
                        oVar2.N(jVar2);
                    } else if (!dVar.f3055k) {
                        f.a.a.a.j jVar3 = v.b;
                        o<f.a.a.a.j> oVar3 = eVar.a;
                        i.l.b.i.d(jVar3, "it");
                        oVar3.N(jVar3);
                    } else if (dVar.g(new Callable() { // from class: f.a.a.a.b0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            d dVar2 = d.this;
                            a aVar2 = aVar;
                            b bVar = eVar;
                            Objects.requireNonNull(dVar2);
                            try {
                                Bundle zzd = dVar2.f3050f.zzd(9, dVar2.f3049e.getPackageName(), aVar2.a, zzb.zzc(aVar2, dVar2.b));
                                int zzb = zzb.zzb(zzd, "BillingClient");
                                String zzj = zzb.zzj(zzd, "BillingClient");
                                j jVar4 = new j();
                                jVar4.a = zzb;
                                jVar4.b = zzj;
                                j.a.o<j> oVar4 = ((e) bVar).a;
                                i.l.b.i.d(jVar4, "it");
                                oVar4.N(jVar4);
                                return null;
                            } catch (Exception e2) {
                                zzb.zzo("BillingClient", "Error acknowledge purchase!", e2);
                                j jVar5 = v.f3091l;
                                j.a.o<j> oVar5 = ((e) bVar).a;
                                i.l.b.i.d(jVar5, "it");
                                oVar5.N(jVar5);
                                return null;
                            }
                        }
                    }, 30000L, new Runnable() { // from class: f.a.a.a.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            b bVar = b.this;
                            j jVar4 = v.f3092m;
                            j.a.o<j> oVar4 = ((e) bVar).a;
                            i.l.b.i.d(jVar4, "it");
                            oVar4.N(jVar4);
                        }
                    }, dVar.c()) == null) {
                        f.a.a.a.j e2 = dVar.e();
                        o<f.a.a.a.j> oVar4 = eVar.a;
                        i.l.b.i.d(e2, "it");
                        oVar4.N(e2);
                    }
                    obj = pVar.Z(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    throw new IllegalArgumentException("Purchase token must be set");
                }
            }
            return i.h.a;
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            f.n.a.n.i.e0(obj);
        }
        f.a.a.a.j jVar4 = (f.a.a.a.j) obj;
        return i.h.a;
    }
}
