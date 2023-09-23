package f.c.a.a;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.video_converter.video_compressor.R;
import f.c.a.a.o;
import java.io.Serializable;
import java.text.DecimalFormat;

/* compiled from: SaleOfferDetailsDialog.kt */
/* loaded from: classes.dex */
public final class o extends e.p.c.k {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f3130i = 0;

    /* renamed from: f  reason: collision with root package name */
    public a f3131f;

    /* renamed from: g  reason: collision with root package name */
    public f.c.a.a.p.a f3132g;

    /* renamed from: h  reason: collision with root package name */
    public h f3133h;

    /* compiled from: SaleOfferDetailsDialog.kt */
    /* loaded from: classes.dex */
    public interface a {
        void a(h hVar);

        void b(h hVar);
    }

    @Override // e.p.c.k
    public int getTheme() {
        return R.style.full_width_dialog;
    }

    public final f.c.a.a.p.a i() {
        f.c.a.a.p.a aVar = this.f3132g;
        if (aVar != null) {
            return aVar;
        }
        i.l.b.i.h("binding");
        throw null;
    }

    @Override // e.p.c.k, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        i.l.b.i.e(context, "context");
        super.onAttach(context);
        a aVar = this.f3131f;
        if (aVar == null) {
            Fragment parentFragment = getParentFragment();
            aVar = parentFragment instanceof a ? (a) parentFragment : null;
            if (aVar == null) {
                e.p.c.n activity = getActivity();
                aVar = activity instanceof a ? (a) activity : null;
            }
        }
        this.f3131f = aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        i.l.b.i.e(layoutInflater, "inflater");
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        View inflate = layoutInflater.inflate(R.layout.dialog_offer_details, viewGroup, false);
        int i2 = R.id.bg1;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.bg1);
        if (imageView != null) {
            i2 = R.id.bg2;
            ImageView imageView2 = (ImageView) inflate.findViewById(R.id.bg2);
            if (imageView2 != null) {
                i2 = R.id.buy_btn;
                TextView textView = (TextView) inflate.findViewById(R.id.buy_btn);
                if (textView != null) {
                    i2 = R.id.close_btn;
                    ImageView imageView3 = (ImageView) inflate.findViewById(R.id.close_btn);
                    if (imageView3 != null) {
                        i2 = R.id.content;
                        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.content);
                        if (linearLayout != null) {
                            i2 = R.id.discount_amount;
                            TextView textView2 = (TextView) inflate.findViewById(R.id.discount_amount);
                            if (textView2 != null) {
                                i2 = R.id.discount_percent;
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.discount_percent);
                                if (constraintLayout != null) {
                                    i2 = R.id.discount_price;
                                    TextView textView3 = (TextView) inflate.findViewById(R.id.discount_price);
                                    if (textView3 != null) {
                                        i2 = R.id.hint_txt;
                                        TextView textView4 = (TextView) inflate.findViewById(R.id.hint_txt);
                                        if (textView4 != null) {
                                            i2 = R.id.off_txt;
                                            TextView textView5 = (TextView) inflate.findViewById(R.id.off_txt);
                                            if (textView5 != null) {
                                                i2 = R.id.original_price;
                                                TextView textView6 = (TextView) inflate.findViewById(R.id.original_price);
                                                if (textView6 != null) {
                                                    i2 = R.id.percent_txt;
                                                    ImageView imageView4 = (ImageView) inflate.findViewById(R.id.percent_txt);
                                                    if (imageView4 != null) {
                                                        i2 = R.id.product_duration;
                                                        TextView textView7 = (TextView) inflate.findViewById(R.id.product_duration);
                                                        if (textView7 != null) {
                                                            f.c.a.a.p.a aVar = new f.c.a.a.p.a((ConstraintLayout) inflate, imageView, imageView2, textView, imageView3, linearLayout, textView2, constraintLayout, textView3, textView4, textView5, textView6, imageView4, textView7);
                                                            i.l.b.i.d(aVar, "inflate(inflater, container, false)");
                                                            i.l.b.i.e(aVar, "<set-?>");
                                                            this.f3132g = aVar;
                                                            return i().a;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Resources resources;
        i.l.b.i.e(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str = null;
        Serializable serializable = arguments == null ? null : arguments.getSerializable("details.extra");
        this.f3133h = serializable instanceof h ? (h) serializable : null;
        i().b.setClipToOutline(true);
        i().c.setClipToOutline(true);
        i().f3138h.setPaintFlags(i().f3138h.getPaintFlags() | 16);
        i().f3135e.setOnClickListener(new View.OnClickListener() { // from class: f.c.a.a.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o oVar = o.this;
                int i2 = o.f3130i;
                i.l.b.i.e(oVar, "this$0");
                o.a aVar = oVar.f3131f;
                if (aVar != null) {
                    aVar.b(oVar.f3133h);
                }
                oVar.dismissAllowingStateLoss();
            }
        });
        i().f3134d.setOnClickListener(new View.OnClickListener() { // from class: f.c.a.a.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o oVar = o.this;
                int i2 = o.f3130i;
                i.l.b.i.e(oVar, "this$0");
                o.a aVar = oVar.f3131f;
                if (aVar != null) {
                    aVar.a(oVar.f3133h);
                }
                oVar.dismissAllowingStateLoss();
            }
        });
        if (this.f3133h != null) {
            DecimalFormat decimalFormat = new DecimalFormat("###.#");
            TextView textView = i().f3139i;
            h hVar = this.f3133h;
            textView.setText(String.valueOf(hVar == null ? null : hVar.f3112g));
            TextView textView2 = i().f3138h;
            StringBuilder sb = new StringBuilder();
            h hVar2 = this.f3133h;
            sb.append((Object) (hVar2 == null ? null : hVar2.f3115j));
            sb.append(' ');
            h hVar3 = this.f3133h;
            i.l.b.i.b(hVar3);
            sb.append((Object) decimalFormat.format(Float.valueOf(hVar3.f3113h)));
            textView2.setText(sb.toString());
            TextView textView3 = i().f3137g;
            StringBuilder sb2 = new StringBuilder();
            h hVar4 = this.f3133h;
            sb2.append((Object) (hVar4 == null ? null : hVar4.f3115j));
            sb2.append(' ');
            h hVar5 = this.f3133h;
            i.l.b.i.b(hVar5);
            sb2.append((Object) decimalFormat.format(Float.valueOf(hVar5.f3114i)));
            textView3.setText(sb2.toString());
            DecimalFormat decimalFormat2 = new DecimalFormat("###");
            h hVar6 = this.f3133h;
            i.l.b.i.b(hVar6);
            float f2 = hVar6.f3114i;
            h hVar7 = this.f3133h;
            i.l.b.i.b(hVar7);
            int i2 = 100 - ((int) ((f2 / hVar7.f3113h) * 100));
            TextView textView4 = i().f3136f;
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null) {
                str = resources.getString(R.string.discount_amount, decimalFormat2.format(Integer.valueOf(i2)).toString());
            }
            textView4.setText(str);
        }
    }
}
