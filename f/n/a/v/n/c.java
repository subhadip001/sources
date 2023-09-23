package f.n.a.v.n;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: ProductItemRecyclerAdapter.java */
/* loaded from: classes2.dex */
public class c extends RecyclerView.e {
    public Context a;
    public ArrayList<f.n.a.o.f> b = new ArrayList<>();
    public a c;

    /* compiled from: ProductItemRecyclerAdapter.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* compiled from: ProductItemRecyclerAdapter.java */
    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.a0 {
        public ImageView a;
        public TextView b;
        public TextView c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f7323d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f7324e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f7325f;

        /* renamed from: g  reason: collision with root package name */
        public View f7326g;

        /* renamed from: h  reason: collision with root package name */
        public View f7327h;

        public b(View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.ivSelectOption);
            this.b = (TextView) view.findViewById(R.id.tvDuation);
            this.c = (TextView) view.findViewById(R.id.tvDurationMessageDetails);
            this.f7323d = (TextView) view.findViewById(R.id.tvCostDetailsBasedOnWeekly);
            this.f7324e = (TextView) view.findViewById(R.id.tvOriginalCostDetails);
            this.f7325f = (TextView) view.findViewById(R.id.tvGiftBoxSaving);
            this.f7327h = view.findViewById(R.id.cvGiftBoxSaving);
            this.f7326g = view.findViewById(R.id.mainPurchaseLay);
        }
    }

    /* compiled from: ProductItemRecyclerAdapter.java */
    /* renamed from: f.n.a.v.n.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0190c extends RecyclerView.a0 {
        public ImageView a;
        public TextView b;
        public TextView c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f7328d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f7329e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f7330f;

        /* renamed from: g  reason: collision with root package name */
        public View f7331g;

        /* renamed from: h  reason: collision with root package name */
        public View f7332h;

        public C0190c(View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.ivSelectOption);
            this.b = (TextView) view.findViewById(R.id.tvDuation);
            this.c = (TextView) view.findViewById(R.id.tvDurationMessageDetails);
            this.f7328d = (TextView) view.findViewById(R.id.tvCostDetailsBasedOnWeekly);
            this.f7329e = (TextView) view.findViewById(R.id.tvOriginalCostDetails);
            this.f7330f = (TextView) view.findViewById(R.id.tvGiftBoxSaving);
            this.f7332h = view.findViewById(R.id.cvGiftBoxSaving);
            this.f7331g = view.findViewById(R.id.mainPurchaseLay);
        }
    }

    public c(Context context) {
        this.a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemViewType(int i2) {
        return (this.b.get(i2).a || this.b.get(i2).a) ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(RecyclerView.a0 a0Var, int i2) {
        String string;
        f.n.a.o.f fVar = this.b.get(i2);
        String str = fVar.c.c;
        Object obj = f.n.a.l.b.a;
        if (str.equals("lifetime_premium")) {
            string = this.a.getString(R.string.lifetime);
        } else if (!fVar.c.c.equals("yearly_premium") && !fVar.c.c.equals("yearly_premium_without_trial")) {
            if (!fVar.c.c.equals("monthly_premium") && !fVar.c.c.equals("monthly_premium_without_trial")) {
                if (fVar.c.c.equals("weekly_premium")) {
                    string = this.a.getString(R.string.weekly);
                } else {
                    string = this.a.getString(R.string.lifetime);
                }
            } else {
                string = this.a.getString(R.string.monthly);
            }
        } else {
            string = this.a.getString(R.string.yearly);
        }
        if (a0Var instanceof b) {
            b bVar = (b) a0Var;
            Context context = this.a;
            ArrayList<f.n.a.o.f> arrayList = this.b;
            a aVar = this.c;
            bVar.f7326g.setSelected(fVar.a);
            bVar.b.setText(fVar.a(context));
            bVar.b.setSelected(fVar.a);
            bVar.c.setSelected(fVar.a);
            bVar.f7324e.setSelected(fVar.a);
            bVar.f7323d.setSelected(fVar.a);
            TextView textView = bVar.f7324e;
            Locale locale = Locale.US;
            f.j.b.c.a aVar2 = fVar.c;
            textView.setText(String.format(locale, "%s %.2f", aVar2.f6585h, Double.valueOf(aVar2.f6589l / 1000000.0d)));
            bVar.f7323d.setText(fVar.f7056d);
            bVar.a.setImageResource(R.drawable.ic_selected_purchase_new_24);
            bVar.b.setTextColor(context.getResources().getColor(R.color.orange));
            bVar.c.setTextColor(context.getResources().getColor(R.color.orange));
            bVar.f7324e.setTextColor(context.getResources().getColor(R.color.orange));
            bVar.f7323d.setTextColor(context.getResources().getColor(R.color.disabled_color));
            bVar.c.setTextSize(2, 14.0f);
            bVar.f7324e.setTextSize(2, 14.0f);
            bVar.b.setTextSize(2, 12.0f);
            bVar.f7323d.setTextSize(2, 12.0f);
            bVar.c.setText(string);
            bVar.f7323d.setPaintFlags(bVar.f7324e.getPaintFlags() | 16);
            if (fVar.f7057e > 0) {
                bVar.b.setVisibility(0);
                bVar.f7323d.setVisibility(0);
                if ((fVar.c.c.equals("lifetime_premium") && f.n.a.u.a.e().h()) || ((fVar.c.c.equals("lifetime_premium_offer") && f.n.a.u.a.e().h()) || ((fVar.c.c.equals("yearly_premium") && f.n.a.u.a.e().j()) || ((fVar.c.c.equals("yearly_premium_without_trial") && f.n.a.u.a.e().j()) || ((fVar.c.c.equals("monthly_premium") && f.n.a.u.a.e().i()) || (fVar.c.c.equals("monthly_premium_without_trial") && f.n.a.u.a.e().i())))))) {
                    bVar.f7327h.setVisibility(0);
                    bVar.f7325f.setText(context.getString(R.string.off_percentage, NumberFormat.getInstance(locale).format(fVar.f7057e)));
                } else {
                    bVar.f7327h.setVisibility(8);
                }
            } else {
                if (bVar.b.getText() == "") {
                    bVar.b.setVisibility(8);
                } else {
                    bVar.b.setVisibility(0);
                }
                bVar.f7323d.setVisibility(8);
                bVar.f7327h.setVisibility(8);
            }
            bVar.f7326g.setOnClickListener(new d(bVar, aVar, arrayList, i2));
            return;
        }
        C0190c c0190c = (C0190c) a0Var;
        Context context2 = this.a;
        ArrayList<f.n.a.o.f> arrayList2 = this.b;
        a aVar3 = this.c;
        c0190c.f7331g.setSelected(fVar.a);
        c0190c.b.setText(fVar.a(context2));
        c0190c.b.setSelected(fVar.a);
        c0190c.c.setSelected(fVar.a);
        c0190c.f7329e.setSelected(fVar.a);
        c0190c.f7328d.setSelected(fVar.a);
        TextView textView2 = c0190c.f7329e;
        Locale locale2 = Locale.US;
        f.j.b.c.a aVar4 = fVar.c;
        textView2.setText(String.format(locale2, "%s %.2f", aVar4.f6585h, Double.valueOf(aVar4.f6589l / 1000000.0d)));
        c0190c.f7328d.setText(fVar.f7056d);
        c0190c.a.setImageResource(R.drawable.ic_unselected_purchase_24);
        c0190c.b.setTextColor(context2.getResources().getColor(R.color.new_purchase_texts_on_unselected));
        c0190c.c.setTextColor(context2.getResources().getColor(R.color.new_purchase_texts_on_unselected));
        c0190c.f7329e.setTextColor(context2.getResources().getColor(R.color.new_purchase_texts_on_unselected));
        c0190c.f7328d.setTextColor(context2.getResources().getColor(R.color.disabled_color));
        c0190c.c.setTextSize(2, 12.0f);
        c0190c.f7329e.setTextSize(2, 12.0f);
        c0190c.b.setTextSize(2, 10.0f);
        c0190c.f7328d.setTextSize(2, 10.0f);
        c0190c.c.setText(string);
        c0190c.f7328d.setPaintFlags(c0190c.f7329e.getPaintFlags() | 16);
        if (fVar.f7057e > 0) {
            c0190c.b.setVisibility(0);
            c0190c.f7328d.setVisibility(0);
            if ((fVar.c.c.equals("lifetime_premium") && f.n.a.u.a.e().h()) || ((fVar.c.c.equals("lifetime_premium_offer") && f.n.a.u.a.e().h()) || ((fVar.c.c.equals("yearly_premium") && f.n.a.u.a.e().j()) || ((fVar.c.c.equals("yearly_premium_without_trial") && f.n.a.u.a.e().j()) || ((fVar.c.c.equals("monthly_premium") && f.n.a.u.a.e().i()) || (fVar.c.c.equals("monthly_premium_without_trial") && f.n.a.u.a.e().i())))))) {
                c0190c.f7332h.setVisibility(0);
                c0190c.f7330f.setText(context2.getString(R.string.off_percentage, NumberFormat.getInstance(locale2).format(fVar.f7057e)));
            } else {
                c0190c.f7332h.setVisibility(8);
            }
        } else {
            if (c0190c.b.getText() == "") {
                c0190c.b.setVisibility(8);
            } else {
                c0190c.b.setVisibility(0);
            }
            c0190c.f7328d.setVisibility(8);
            c0190c.f7332h.setVisibility(8);
        }
        c0190c.f7331g.setOnClickListener(new e(c0190c, aVar3, arrayList2, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.a0 onCreateViewHolder(ViewGroup viewGroup, int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                return new b(f.a.b.a.a.T(viewGroup, R.layout.premium_options_list_v_two_recycler_selected, viewGroup, false));
            }
            return new C0190c(f.a.b.a.a.T(viewGroup, R.layout.premium_options_list_v_two_recycler_unselected, viewGroup, false));
        }
        return new b(f.a.b.a.a.T(viewGroup, R.layout.premium_options_list_v_two_recycler_selected, viewGroup, false));
    }
}
