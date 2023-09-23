package f.n.a.l;

import android.content.Context;
import android.os.Bundle;
import androidx.room.RoomDatabase;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.inverseai.billing.db.BillingDb;
import com.video_converter.video_compressor.constants.User;
import e.s.t;
import f.j.b.a.c;
import f.j.b.a.d;
import f.n.a.n.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: BillingUtils.java */
/* loaded from: classes2.dex */
public class b implements c {
    public static final Object a = new Object();
    public static String[] b = {"offer_lifetime_silver", "offer_lifetime_gold", "offer_lifetime_platinum"};
    public static b c;

    public static List<String> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("lifetime_premium");
        arrayList.add("lifetime_premium_offer");
        arrayList.add("lifetime_premium_offer_original_price");
        arrayList.addAll(Arrays.asList(b));
        return arrayList;
    }

    public static b c() {
        b bVar;
        synchronized (a) {
            if (c == null) {
                c = new b();
            }
            bVar = c;
        }
        return bVar;
    }

    public static List<String> e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("weekly_premium");
        arrayList.add("weekly_premium_original");
        arrayList.add("monthly_premium");
        arrayList.add("monthly_premium_original");
        arrayList.add("monthly_premium_without_trial");
        arrayList.add("yearly_premium");
        arrayList.add("yearly_premium_original");
        arrayList.add("yearly_premium_without_trial");
        return arrayList;
    }

    public final void a(Context context) {
        if (User.a.d() == User.Type.FREE) {
            User.a.k(User.Type.SUBSCRIBED);
            f.l.b.c.j(context, Boolean.class, "premium_user", Boolean.TRUE);
            i.X("pro");
            i.i0("free");
        }
    }

    public d d(Context context) {
        try {
            d dVar = d.f6538l;
            if (dVar != null) {
                i.l.b.i.b(dVar);
                return dVar;
            }
            throw new IllegalStateException("Billing manager is not initialized. Initialize it from application class onCreate.");
        } catch (IllegalStateException unused) {
            f(context.getApplicationContext());
            d dVar2 = d.f6538l;
            if (dVar2 != null) {
                i.l.b.i.b(dVar2);
                return dVar2;
            }
            throw new IllegalStateException("Billing manager is not initialized. Initialize it from application class onCreate.");
        }
    }

    public void f(final Context context) {
        i.l.b.i.e(context, "context");
        i.l.b.i.e(this, "clientSecret");
        if (!d.f6537k) {
            BillingDb.a aVar = BillingDb.f1306k;
            i.l.b.i.e(context, "context");
            BillingDb billingDb = BillingDb.f1307l;
            if (billingDb == null) {
                synchronized (aVar) {
                    RoomDatabase.a f2 = e.p.a.f(context.getApplicationContext(), BillingDb.class, "billing.db");
                    f2.f570j = false;
                    f2.f571k = true;
                    BillingDb.f1307l = (BillingDb) f2.b();
                    billingDb = BillingDb.f1307l;
                    i.l.b.i.b(billingDb);
                }
            }
            d dVar = new d(billingDb.m(), this);
            d.f6538l = dVar;
            i.l.b.i.b(dVar);
            f.j.b.a.b bVar = dVar.f6545j;
            if (bVar != null) {
                dVar.f6540e = new f.a.a.a.d(true, context, bVar);
                dVar.c();
                d.f6537k = true;
            } else {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
        }
        try {
            c().d(context).f6544i.f(new t() { // from class: f.n.a.l.a
                @Override // e.s.t
                public final void a(Object obj) {
                    b bVar2 = b.this;
                    Context context2 = context;
                    List<f.j.b.c.b> list = (List) obj;
                    Objects.requireNonNull(bVar2);
                    if (list != null && list.size() != 0) {
                        for (f.j.b.c.b bVar3 : list) {
                            if (((ArrayList) b.b()).contains(bVar3.c)) {
                                f.l.b.c.j(context2, Boolean.class, "is_life_time_user", Boolean.TRUE);
                            }
                            if (bVar3.c.equals("lifetime_premium")) {
                                bVar2.a(context2);
                            } else {
                                bVar2.a(context2);
                            }
                            f.n.a.z.b a2 = f.n.a.z.b.a();
                            String str = a2.b;
                            if (str != null && !str.isEmpty() && a2.a) {
                                Bundle bundle = new Bundle();
                                bundle.putString("purchased", a2.b);
                                bundle.putInt("conversion", ((Integer) f.l.b.c.b(context2, Integer.class, "purchase_screen_visit_count")).intValue());
                                FirebaseAnalytics.getInstance(context2).logEvent("purchase_screen_events", bundle);
                                a2.b = null;
                                a2.a = false;
                            }
                        }
                        return;
                    }
                    if (User.a.d() == User.Type.SUBSCRIBED) {
                        User.a.k(User.Type.FREE);
                        f.l.b.c.j(context2, Boolean.class, "premium_user", Boolean.FALSE);
                    }
                    i.X("free");
                    i.i0("pro");
                }
            });
        } catch (Exception unused) {
        }
    }
}
