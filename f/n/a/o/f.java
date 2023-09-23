package f.n.a.o;

import android.content.Context;
import com.video_converter.video_compressor.R;

/* compiled from: SelectableProductInfo.java */
/* loaded from: classes2.dex */
public class f {
    public boolean a;
    public boolean b;
    public f.j.b.c.a c;

    /* renamed from: d  reason: collision with root package name */
    public String f7056d;

    /* renamed from: e  reason: collision with root package name */
    public int f7057e;

    public f(boolean z, boolean z2, f.j.b.c.a aVar, String str, int i2) {
        this.a = z;
        this.b = z2;
        this.c = aVar;
        this.f7056d = str;
        this.f7057e = i2;
    }

    public String a(Context context) {
        f.j.b.c.a aVar = this.c;
        if (aVar == null) {
            return "";
        }
        Object obj = f.n.a.l.b.a;
        if (!aVar.c.equals("lifetime_premium") && !this.c.c.equals("lifetime_premium_offer")) {
            if (this.c.c.equals("yearly_premium")) {
                return context.getResources().getString(R.string.yearly_product_title);
            }
            if (this.c.c.equals("yearly_premium_without_trial")) {
                return context.getResources().getString(R.string.yearly_product_no_trial_title);
            }
            if (this.c.c.equals("monthly_premium")) {
                return context.getResources().getString(R.string.monthly_product_title);
            }
            if (this.c.c.equals("monthly_premium_without_trial")) {
                return context.getResources().getString(R.string.monthly_product_no_trial_title);
            }
            return this.c.c.equals("weekly_premium") ? "" : this.c.a;
        }
        return context.getResources().getString(R.string.life_time_product_title);
    }
}
