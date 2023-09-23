package f.n.a.v.n;

import android.app.Activity;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.video_converter.video_compressor.R;
import e.s.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: PurchaseScreenController.java */
/* loaded from: classes2.dex */
public class g implements f {

    /* renamed from: h  reason: collision with root package name */
    public static f.j.b.c.a f7339h;

    /* renamed from: i  reason: collision with root package name */
    public static f.j.b.c.a f7340i;
    public Activity a;
    public p b;
    public f.n.a.k.a c;

    /* renamed from: d  reason: collision with root package name */
    public f.j.b.c.a f7341d;

    /* renamed from: e  reason: collision with root package name */
    public f.n.a.n.d f7342e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<String> f7343f;

    /* renamed from: g  reason: collision with root package name */
    public List<String> f7344g = Arrays.asList("weekly_premium", "monthly_premium", "yearly_premium", "lifetime_premium", "lifetime_premium_offer");

    public g(Activity activity, f.n.a.k.a aVar, f.n.a.n.d dVar, ArrayList<String> arrayList) {
        this.a = activity;
        this.c = aVar;
        this.f7342e = dVar;
        this.f7343f = arrayList;
        f.n.a.l.b.c().d(this.a).f6543h.e((e.s.m) this.a, new t() { // from class: f.n.a.v.n.a
            @Override // e.s.t
            public final void a(Object obj) {
                boolean z;
                Double f2;
                Double f3;
                g gVar = g.this;
                List<f.j.b.c.a> list = (List) obj;
                Objects.requireNonNull(gVar);
                if (list != null && !list.isEmpty()) {
                    try {
                        if (list.isEmpty()) {
                            return;
                        }
                        gVar.b.s.setVisibility(8);
                        gVar.b.r.setVisibility(0);
                        ArrayList<f.n.a.o.f> arrayList2 = new ArrayList<>();
                        for (f.j.b.c.a aVar2 : list) {
                            String str = aVar2.c;
                            Object obj2 = f.n.a.l.b.a;
                            if (str.equals("lifetime_premium_offer_original_price")) {
                                g.f7339h = aVar2;
                            } else if (aVar2.c.equals("weekly_premium")) {
                                g.f7340i = aVar2;
                            }
                        }
                        for (f.j.b.c.a aVar3 : list) {
                            ArrayList<String> arrayList3 = gVar.f7343f;
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                if (gVar.f7343f.contains(aVar3.c)) {
                                    String str2 = aVar3.c;
                                    Object obj3 = f.n.a.l.b.a;
                                    if (!str2.equals("lifetime_premium_offer") && !aVar3.c.equals("lifetime_premium")) {
                                        f3 = gVar.f(aVar3, false);
                                        arrayList2.add(new f.n.a.o.f(false, aVar3.c.equals("lifetime_premium"), aVar3, String.format(Locale.US, "%s %.2f", aVar3.f6585h, f3), gVar.h(gVar.g(aVar3.f6589l), f3)));
                                    }
                                    f3 = gVar.f(aVar3, true);
                                    arrayList2.add(new f.n.a.o.f(false, aVar3.c.equals("lifetime_premium"), aVar3, String.format(Locale.US, "%s %.2f", aVar3.f6585h, f3), gVar.h(gVar.g(aVar3.f6589l), f3)));
                                }
                            } else if (gVar.f7344g.contains(aVar3.c)) {
                                String str3 = aVar3.c;
                                Object obj4 = f.n.a.l.b.a;
                                if (!str3.equals("lifetime_premium") || !f.n.a.u.a.e().f()) {
                                    if (!aVar3.c.equals("lifetime_premium_offer") || f.n.a.u.a.e().f()) {
                                        if (!aVar3.c.equals("lifetime_premium_offer") && !aVar3.c.equals("lifetime_premium")) {
                                            f2 = gVar.f(aVar3, false);
                                            arrayList2.add(new f.n.a.o.f(false, aVar3.c.equals("lifetime_premium"), aVar3, String.format(Locale.US, "%s %.2f", aVar3.f6585h, f2), gVar.h(gVar.g(aVar3.f6589l), f2)));
                                        }
                                        f2 = gVar.f(aVar3, true);
                                        arrayList2.add(new f.n.a.o.f(false, aVar3.c.equals("lifetime_premium"), aVar3, String.format(Locale.US, "%s %.2f", aVar3.f6585h, f2), gVar.h(gVar.g(aVar3.f6589l), f2)));
                                    }
                                }
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return;
                        }
                        gVar.i(arrayList2);
                        Iterator<f.n.a.o.f> it = arrayList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            f.n.a.o.f next = it.next();
                            String str4 = next.c.c;
                            FirebaseRemoteConfig firebaseRemoteConfig = f.n.a.u.a.e().a;
                            if (str4.equals(firebaseRemoteConfig == null ? "lifetime_premium" : firebaseRemoteConfig.getString("initial_purchase_select_option"))) {
                                next.a = true;
                                gVar.f7341d = next.c;
                                z = true;
                                break;
                            }
                        }
                        if (!z) {
                            Iterator<f.n.a.o.f> it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                f.n.a.o.f next2 = it2.next();
                                if (!f.n.a.u.a.e().f()) {
                                    String str5 = next2.c.c;
                                    Object obj5 = f.n.a.l.b.a;
                                    if (str5.equals("lifetime_premium")) {
                                        next2.a = true;
                                        gVar.f7341d = next2.c;
                                        z = true;
                                        break;
                                    }
                                }
                                if (f.n.a.u.a.e().f()) {
                                    String str6 = next2.c.c;
                                    Object obj6 = f.n.a.l.b.a;
                                    if (str6.equals("lifetime_premium_offer")) {
                                        next2.a = true;
                                        gVar.f7341d = next2.c;
                                        z = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (!z) {
                            arrayList2.get(0).a = true;
                            gVar.f7341d = arrayList2.get(0).c;
                        }
                        gVar.j(gVar.f7341d);
                        p pVar = gVar.b;
                        Objects.requireNonNull(pVar);
                        c cVar = pVar.f7356l;
                        Objects.requireNonNull(cVar);
                        cVar.b = arrayList2;
                        cVar.notifyDataSetChanged();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                gVar.b.s.setVisibility(8);
                gVar.b.q.setVisibility(0);
            }
        });
    }

    @Override // f.n.a.v.n.f
    public void a() {
        boolean z;
        if (this.a == null || this.f7341d == null) {
            return;
        }
        Log.d("PurchaseScreenControlle", "onPurchaseBtnClicked: ");
        String str = this.f7341d.c;
        Object obj = f.n.a.l.b.a;
        boolean z2 = false;
        if (!str.equals("lifetime_premium") && (this.f7341d.c.equals("yearly_premium") || this.f7341d.c.equals("monthly_premium"))) {
            z = true;
        } else {
            z = false;
            z2 = true;
        }
        Log.d("PurchaseScreenControlle", "onPurchaseBtnClicked: " + z2 + " " + z);
        if (z2) {
            this.f7342e.a("click_unlock_now");
        } else {
            this.f7342e.a("click_start_free_trial");
        }
        this.a.finish();
        f.n.a.z.b.a().a = true;
        f.n.a.l.b.c().d(this.a).f(this.a, this.f7341d.r);
    }

    @Override // f.n.a.v.n.f
    public void b() {
        Log.d("PurchaseScreenControlle", "onRetryBtnClicked: ");
        this.b.q.setVisibility(8);
        this.b.s.setVisibility(0);
        f.n.a.l.b.c().d(this.a).h();
    }

    @Override // f.n.a.v.n.f
    public void c() {
        this.a.onBackPressed();
    }

    @Override // f.n.a.v.n.f
    public void d(ArrayList<f.n.a.o.f> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        Log.d("TAG", "onPurchaseOptionClicked: " + i2);
        f.n.a.o.f fVar = null;
        Iterator<f.n.a.o.f> it = arrayList.iterator();
        while (it.hasNext()) {
            f.n.a.o.f next = it.next();
            if (next.a) {
                next.a = false;
                fVar = next;
            }
        }
        arrayList.get(i2).a = true;
        f.n.a.o.f fVar2 = arrayList.get(i2);
        this.f7341d = arrayList.get(i2).c;
        p pVar = this.b;
        Objects.requireNonNull(pVar);
        if (fVar != null && fVar2 != null) {
            c cVar = pVar.f7356l;
            Objects.requireNonNull(cVar);
            for (int i3 = 0; i3 < cVar.b.size(); i3++) {
                if (cVar.b.get(i3).c.equals(fVar.c)) {
                    cVar.b.get(i3).a = false;
                    cVar.notifyItemChanged(i3);
                }
                if (cVar.b.get(i3).c.equals(fVar2.c)) {
                    cVar.b.get(i3).a = true;
                    cVar.notifyItemChanged(i3);
                }
            }
        }
        j(arrayList.get(i2).c);
    }

    @Override // f.n.a.v.n.f
    public void e() {
        f.n.a.k.b d2 = this.c.d();
        f.n.a.k.a aVar = this.c;
        d2.b(f.n.a.k.g.a.m(aVar.a.getString(R.string.how_to_cancel_subs), aVar.a.getString(R.string.cancel_info), aVar.a.getString(R.string.dismiss), null), "SUBS_CANCEL_GUIDE_DIALOG");
    }

    public final Double f(f.j.b.c.a aVar, boolean z) {
        double doubleValue;
        double d2;
        if (z) {
            doubleValue = g(f7339h.f6589l).doubleValue();
        } else {
            doubleValue = g(f7340i.f6589l).doubleValue();
        }
        if (!z) {
            String str = aVar.c;
            Object obj = f.n.a.l.b.a;
            if (str.equals("monthly_premium") || aVar.c.equals("monthly_premium_without_trial")) {
                d2 = 4.0d;
            } else if (aVar.c.equals("yearly_premium") || aVar.c.equals("yearly_premium_without_trial")) {
                d2 = 52.0d;
            } else if (aVar.c.equals("lifetime_premium") || aVar.c.equals("lifetime_premium_offer")) {
                d2 = 120.0d;
            }
            doubleValue *= d2;
        }
        return Double.valueOf(doubleValue);
    }

    public final Double g(double d2) {
        return Double.valueOf(d2 / 1000000.0d);
    }

    public int h(Double d2, Double d3) {
        return (int) (((d3.doubleValue() - d2.doubleValue()) * 100.0d) / d3.doubleValue());
    }

    public ArrayList<f.n.a.o.f> i(ArrayList<f.n.a.o.f> arrayList) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < size; i4++) {
                String str = arrayList.get(i4).c.c;
                Object obj = f.n.a.l.b.a;
                if (str.equals("lifetime_premium_offer") || (arrayList.get(i4).b && !arrayList.get(i2).b && !arrayList.get(i2).c.c.equals("lifetime_premium_offer"))) {
                    Collections.swap(arrayList, i2, i4);
                }
            }
            i2 = i3;
        }
        for (int i5 = 0; i5 < size - 1; i5++) {
            String str2 = arrayList.get(i5).c.c;
            Object obj2 = f.n.a.l.b.a;
            if (str2.equals("weekly_premium")) {
                Collections.swap(arrayList, i5, i5 + 1);
            }
        }
        return arrayList;
    }

    public final void j(f.j.b.c.a aVar) {
        if (aVar.c == null) {
            this.b.d(this.a.getString(R.string.unlock_now));
            return;
        }
        String str = this.f7341d.f6581d;
        if (str != null && str.length() > 0) {
            this.b.d(this.a.getString(R.string.free_trial));
        } else {
            this.b.d(this.a.getString(R.string.unlock_now));
        }
    }
}
