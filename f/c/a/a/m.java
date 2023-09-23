package f.c.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.ariful.sale.banner.BannerTemplate;
import com.video_converter.video_compressor.R;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SaleBannerFragment.kt */
/* loaded from: classes.dex */
public final class m extends Fragment {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f3120l = 0;

    /* renamed from: f  reason: collision with root package name */
    public e.d0.a f3121f;

    /* renamed from: g  reason: collision with root package name */
    public h f3122g;

    /* renamed from: h  reason: collision with root package name */
    public j f3123h;

    /* renamed from: i  reason: collision with root package name */
    public BannerTemplate f3124i;

    /* renamed from: j  reason: collision with root package name */
    public final i.c f3125j = f.n.a.n.i.E(new a());

    /* renamed from: k  reason: collision with root package name */
    public final i.c f3126k = f.n.a.n.i.E(new b());

    /* compiled from: SaleBannerFragment.kt */
    /* loaded from: classes.dex */
    public static final class a extends i.l.b.j implements i.l.a.a<g> {
        public a() {
            super(0);
        }

        @Override // i.l.a.a
        public g c() {
            TextSwitcher textSwitcher;
            TextSwitcher textSwitcher2;
            m mVar = m.this;
            e.d0.a aVar = mVar.f3121f;
            if (aVar != null) {
                if (aVar instanceof f.c.a.a.p.d) {
                    textSwitcher2 = ((f.c.a.a.p.d) aVar).f3149f.b;
                    i.l.b.i.d(textSwitcher2, "bind.timer.timerMinuteSwitcher");
                } else if (aVar instanceof f.c.a.a.p.b) {
                    textSwitcher2 = ((f.c.a.a.p.b) aVar).f3142f.b;
                    i.l.b.i.d(textSwitcher2, "bind.timer.timerMinuteSwitcher");
                } else if (!(aVar instanceof f.c.a.a.p.c)) {
                    textSwitcher = new TextSwitcher(mVar.getContext());
                    m mVar2 = m.this;
                    return new g(textSwitcher, 60000L, new k(mVar2), 0L, new l(mVar2), 8);
                } else {
                    textSwitcher2 = ((f.c.a.a.p.c) aVar).f3145f;
                    i.l.b.i.d(textSwitcher2, "bind.timerMinuteSwitcher");
                }
                textSwitcher = textSwitcher2;
                m mVar22 = m.this;
                return new g(textSwitcher, 60000L, new k(mVar22), 0L, new l(mVar22), 8);
            }
            i.l.b.i.h("binding");
            throw null;
        }
    }

    /* compiled from: SaleBannerFragment.kt */
    /* loaded from: classes.dex */
    public static final class b extends i.l.b.j implements i.l.a.a<g> {
        public b() {
            super(0);
        }

        @Override // i.l.a.a
        public g c() {
            TextSwitcher textSwitcher;
            TextSwitcher textSwitcher2;
            m mVar = m.this;
            e.d0.a aVar = mVar.f3121f;
            if (aVar != null) {
                if (aVar instanceof f.c.a.a.p.d) {
                    textSwitcher2 = ((f.c.a.a.p.d) aVar).f3149f.c;
                    i.l.b.i.d(textSwitcher2, "bind.timer.timerSecondSwitcher");
                } else if (aVar instanceof f.c.a.a.p.b) {
                    textSwitcher2 = ((f.c.a.a.p.b) aVar).f3142f.c;
                    i.l.b.i.d(textSwitcher2, "bind.timer.timerSecondSwitcher");
                } else if (!(aVar instanceof f.c.a.a.p.c)) {
                    textSwitcher = new TextSwitcher(mVar.getContext());
                    return new g(textSwitcher, 0L, null, 0L, new n(m.this), 14);
                } else {
                    textSwitcher2 = ((f.c.a.a.p.c) aVar).f3146g;
                    i.l.b.i.d(textSwitcher2, "bind.timerSecondSwitcher");
                }
                textSwitcher = textSwitcher2;
                return new g(textSwitcher, 0L, null, 0L, new n(m.this), 14);
            }
            i.l.b.i.h("binding");
            throw null;
        }
    }

    public final View i() {
        e.d0.a aVar = this.f3121f;
        if (aVar != null) {
            if (aVar instanceof f.c.a.a.p.d) {
                return ((f.c.a.a.p.d) aVar).c;
            }
            if (aVar instanceof f.c.a.a.p.b) {
                return ((f.c.a.a.p.b) aVar).c;
            }
            if (aVar instanceof f.c.a.a.p.c) {
                return ((f.c.a.a.p.c) aVar).c;
            }
            return null;
        }
        i.l.b.i.h("binding");
        throw null;
    }

    public final TextView k() {
        e.d0.a aVar = this.f3121f;
        if (aVar != null) {
            if (aVar instanceof f.c.a.a.p.d) {
                TextView textView = ((f.c.a.a.p.d) aVar).f3148e;
                i.l.b.i.d(textView, "bind.priceWithoutDiscount");
                return textView;
            } else if (aVar instanceof f.c.a.a.p.b) {
                TextView textView2 = ((f.c.a.a.p.b) aVar).f3141e;
                i.l.b.i.d(textView2, "bind.priceWithoutDiscount");
                return textView2;
            } else if (aVar instanceof f.c.a.a.p.c) {
                TextView textView3 = ((f.c.a.a.p.c) aVar).f3144e;
                i.l.b.i.d(textView3, "bind.priceWithoutDiscount");
                return textView3;
            } else {
                return new TextView(getContext());
            }
        }
        i.l.b.i.h("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        i.l.b.i.e(context, "context");
        super.onAttach(context);
        j jVar = this.f3123h;
        if (jVar == null) {
            Fragment parentFragment = getParentFragment();
            jVar = parentFragment instanceof j ? (j) parentFragment : null;
            if (jVar == null) {
                e.p.c.n activity = getActivity();
                jVar = activity instanceof j ? (j) activity : null;
            }
        }
        this.f3123h = jVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BannerTemplate[] values = BannerTemplate.values();
        Bundle arguments = getArguments();
        this.f3124i = values[arguments == null ? 0 : arguments.getInt("key.temp.type")];
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        e.d0.a dVar;
        int i2;
        i.l.b.i.e(layoutInflater, "inflater");
        BannerTemplate bannerTemplate = this.f3124i;
        if (bannerTemplate != null) {
            int ordinal = bannerTemplate.ordinal();
            int i3 = R.id.buy_blink;
            if (ordinal == 0) {
                View inflate = layoutInflater.inflate(R.layout.fragment_sale_banner, viewGroup, false);
                TextView textView = (TextView) inflate.findViewById(R.id.buy_blink);
                if (textView != null) {
                    TextView textView2 = (TextView) inflate.findViewById(R.id.discount_amount);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.discount_percent);
                        if (constraintLayout != null) {
                            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.discount_price);
                            if (linearLayout != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate.findViewById(R.id.main_content);
                                if (constraintLayout2 != null) {
                                    TextView textView3 = (TextView) inflate.findViewById(R.id.off_txt);
                                    if (textView3 != null) {
                                        ImageView imageView = (ImageView) inflate.findViewById(R.id.percent_txt);
                                        if (imageView != null) {
                                            TextView textView4 = (TextView) inflate.findViewById(R.id.price_after_discount);
                                            if (textView4 != null) {
                                                TextView textView5 = (TextView) inflate.findViewById(R.id.price_without_discount);
                                                if (textView5 != null) {
                                                    View findViewById = inflate.findViewById(R.id.timer);
                                                    if (findViewById != null) {
                                                        f.c.a.a.p.e a2 = f.c.a.a.p.e.a(findViewById);
                                                        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.timer_container);
                                                        if (linearLayout2 != null) {
                                                            dVar = new f.c.a.a.p.d((FrameLayout) inflate, textView, textView2, constraintLayout, linearLayout, constraintLayout2, textView3, imageView, textView4, textView5, a2, linearLayout2);
                                                            i.l.b.i.d(dVar, "inflate(inflater, container, false)");
                                                        } else {
                                                            i3 = R.id.timer_container;
                                                        }
                                                    } else {
                                                        i3 = R.id.timer;
                                                    }
                                                } else {
                                                    i3 = R.id.price_without_discount;
                                                }
                                            } else {
                                                i3 = R.id.price_after_discount;
                                            }
                                        } else {
                                            i3 = R.id.percent_txt;
                                        }
                                    } else {
                                        i3 = R.id.off_txt;
                                    }
                                } else {
                                    i3 = R.id.main_content;
                                }
                            } else {
                                i3 = R.id.discount_price;
                            }
                        } else {
                            i3 = R.id.discount_percent;
                        }
                    } else {
                        i3 = R.id.discount_amount;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
            } else if (ordinal == 1) {
                View inflate2 = layoutInflater.inflate(R.layout.fragment_sale_banner_2, viewGroup, false);
                TextView textView6 = (TextView) inflate2.findViewById(R.id.buy_blink);
                if (textView6 != null) {
                    TextView textView7 = (TextView) inflate2.findViewById(R.id.discount_amount);
                    if (textView7 != null) {
                        LinearLayout linearLayout3 = (LinearLayout) inflate2.findViewById(R.id.discount_percent);
                        if (linearLayout3 != null) {
                            LinearLayout linearLayout4 = (LinearLayout) inflate2.findViewById(R.id.discount_price);
                            if (linearLayout4 != null) {
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) inflate2.findViewById(R.id.main_content);
                                if (constraintLayout3 != null) {
                                    TextView textView8 = (TextView) inflate2.findViewById(R.id.off_txt);
                                    if (textView8 != null) {
                                        ImageView imageView2 = (ImageView) inflate2.findViewById(R.id.percent_txt);
                                        if (imageView2 != null) {
                                            TextView textView9 = (TextView) inflate2.findViewById(R.id.price_after_discount);
                                            if (textView9 != null) {
                                                TextView textView10 = (TextView) inflate2.findViewById(R.id.price_without_discount);
                                                if (textView10 != null) {
                                                    View findViewById2 = inflate2.findViewById(R.id.timer);
                                                    if (findViewById2 != null) {
                                                        f.c.a.a.p.e a3 = f.c.a.a.p.e.a(findViewById2);
                                                        LinearLayout linearLayout5 = (LinearLayout) inflate2.findViewById(R.id.timer_container);
                                                        if (linearLayout5 != null) {
                                                            dVar = new f.c.a.a.p.b((LinearLayout) inflate2, textView6, textView7, linearLayout3, linearLayout4, constraintLayout3, textView8, imageView2, textView9, textView10, a3, linearLayout5);
                                                            i.l.b.i.d(dVar, "inflate(inflater, container, false)");
                                                        } else {
                                                            i3 = R.id.timer_container;
                                                        }
                                                    } else {
                                                        i3 = R.id.timer;
                                                    }
                                                } else {
                                                    i3 = R.id.price_without_discount;
                                                }
                                            } else {
                                                i3 = R.id.price_after_discount;
                                            }
                                        } else {
                                            i3 = R.id.percent_txt;
                                        }
                                    } else {
                                        i3 = R.id.off_txt;
                                    }
                                } else {
                                    i3 = R.id.main_content;
                                }
                            } else {
                                i3 = R.id.discount_price;
                            }
                        } else {
                            i3 = R.id.discount_percent;
                        }
                    } else {
                        i3 = R.id.discount_amount;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
            } else if (ordinal == 2) {
                View inflate3 = layoutInflater.inflate(R.layout.fragment_sale_banner_3, viewGroup, false);
                TextView textView11 = (TextView) inflate3.findViewById(R.id.buy_blink);
                if (textView11 != null) {
                    TextView textView12 = (TextView) inflate3.findViewById(R.id.discount_amount);
                    if (textView12 != null) {
                        LinearLayout linearLayout6 = (LinearLayout) inflate3.findViewById(R.id.discount_percent);
                        if (linearLayout6 != null) {
                            LinearLayout linearLayout7 = (LinearLayout) inflate3.findViewById(R.id.discount_price);
                            if (linearLayout7 != null) {
                                ConstraintLayout constraintLayout4 = (ConstraintLayout) inflate3.findViewById(R.id.main_content);
                                if (constraintLayout4 != null) {
                                    TextView textView13 = (TextView) inflate3.findViewById(R.id.off_txt);
                                    if (textView13 != null) {
                                        ImageView imageView3 = (ImageView) inflate3.findViewById(R.id.percent_txt);
                                        if (imageView3 != null) {
                                            TextView textView14 = (TextView) inflate3.findViewById(R.id.price_after_discount);
                                            if (textView14 != null) {
                                                TextView textView15 = (TextView) inflate3.findViewById(R.id.price_without_discount);
                                                if (textView15 != null) {
                                                    LinearLayout linearLayout8 = (LinearLayout) inflate3.findViewById(R.id.timer_container);
                                                    if (linearLayout8 != null) {
                                                        i2 = R.id.timer_minute_switcher;
                                                        TextSwitcher textSwitcher = (TextSwitcher) inflate3.findViewById(R.id.timer_minute_switcher);
                                                        if (textSwitcher != null) {
                                                            i2 = R.id.timer_second_switcher;
                                                            TextSwitcher textSwitcher2 = (TextSwitcher) inflate3.findViewById(R.id.timer_second_switcher);
                                                            if (textSwitcher2 != null) {
                                                                dVar = new f.c.a.a.p.c((LinearLayout) inflate3, textView11, textView12, linearLayout6, linearLayout7, constraintLayout4, textView13, imageView3, textView14, textView15, linearLayout8, textSwitcher, textSwitcher2);
                                                                i.l.b.i.d(dVar, "inflate(inflater, container, false)");
                                                            }
                                                        }
                                                    } else {
                                                        i2 = R.id.timer_container;
                                                    }
                                                } else {
                                                    i2 = R.id.price_without_discount;
                                                }
                                            } else {
                                                i2 = R.id.price_after_discount;
                                            }
                                        } else {
                                            i2 = R.id.percent_txt;
                                        }
                                    } else {
                                        i2 = R.id.off_txt;
                                    }
                                } else {
                                    i2 = R.id.main_content;
                                }
                            } else {
                                i2 = R.id.discount_price;
                            }
                        } else {
                            i2 = R.id.discount_percent;
                        }
                    } else {
                        i2 = R.id.discount_amount;
                    }
                } else {
                    i2 = R.id.buy_blink;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i2)));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this.f3121f = dVar;
            if (dVar != null) {
                return dVar.b();
            }
            i.l.b.i.h("binding");
            throw null;
        }
        i.l.b.i.h("templateType");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        String str;
        TextView textView2;
        Resources resources;
        Resources resources2;
        Resources resources3;
        i.l.b.i.e(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        Serializable serializable = arguments == null ? null : arguments.getSerializable("key.payload");
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ariful.sale.banner.Payload");
        h hVar = (h) serializable;
        this.f3122g = hVar;
        ((g) this.f3125j.getValue()).b((int) (hVar.f3116k - 1), -1);
        ((g) this.f3126k.getValue()).b(60, 0);
        DecimalFormat decimalFormat = new DecimalFormat("###");
        h hVar2 = this.f3122g;
        if (hVar2 != null) {
            int i2 = 100 - ((int) ((hVar2.f3114i / hVar2.f3113h) * 100));
            e.d0.a aVar = this.f3121f;
            if (aVar != null) {
                if (aVar instanceof f.c.a.a.p.d) {
                    textView = ((f.c.a.a.p.d) aVar).b;
                    i.l.b.i.d(textView, "bind.discountAmount");
                } else if (aVar instanceof f.c.a.a.p.b) {
                    textView = ((f.c.a.a.p.b) aVar).b;
                    i.l.b.i.d(textView, "bind.discountAmount");
                } else if (aVar instanceof f.c.a.a.p.c) {
                    textView = ((f.c.a.a.p.c) aVar).b;
                    i.l.b.i.d(textView, "bind.discountAmount");
                } else {
                    textView = new TextView(getContext());
                }
                Context context = getContext();
                textView.setText((context == null || (resources3 = context.getResources()) == null) ? null : resources3.getString(R.string.discount_amount, decimalFormat.format(Integer.valueOf(i2)).toString()));
                k().setPaintFlags(k().getPaintFlags() | 16);
                DecimalFormat decimalFormat2 = new DecimalFormat("###.#");
                TextView k2 = k();
                Context context2 = getContext();
                if (context2 == null || (resources2 = context2.getResources()) == null) {
                    str = null;
                } else {
                    Object[] objArr = new Object[2];
                    h hVar3 = this.f3122g;
                    if (hVar3 != null) {
                        objArr[0] = hVar3.f3115j;
                        objArr[1] = decimalFormat2.format(Float.valueOf(hVar3.f3113h)).toString();
                        str = resources2.getString(R.string.stricked_text, objArr);
                    } else {
                        i.l.b.i.h("payload");
                        throw null;
                    }
                }
                k2.setText(str);
                e.d0.a aVar2 = this.f3121f;
                if (aVar2 != null) {
                    if (aVar2 instanceof f.c.a.a.p.d) {
                        textView2 = ((f.c.a.a.p.d) aVar2).f3147d;
                        i.l.b.i.d(textView2, "bind.priceAfterDiscount");
                    } else if (aVar2 instanceof f.c.a.a.p.b) {
                        textView2 = ((f.c.a.a.p.b) aVar2).f3140d;
                        i.l.b.i.d(textView2, "bind.priceAfterDiscount");
                    } else if (aVar2 instanceof f.c.a.a.p.c) {
                        textView2 = ((f.c.a.a.p.c) aVar2).f3143d;
                        i.l.b.i.d(textView2, "bind.priceAfterDiscount");
                    } else {
                        textView2 = new TextView(getContext());
                    }
                    Context context3 = getContext();
                    if (context3 != null && (resources = context3.getResources()) != null) {
                        Object[] objArr2 = new Object[2];
                        h hVar4 = this.f3122g;
                        if (hVar4 != null) {
                            objArr2[0] = hVar4.f3115j;
                            objArr2[1] = decimalFormat2.format(Float.valueOf(hVar4.f3114i)).toString();
                            str2 = resources.getString(R.string.sale_price_text, objArr2);
                        } else {
                            i.l.b.i.h("payload");
                            throw null;
                        }
                    }
                    textView2.setText(str2);
                    View i3 = i();
                    if (i3 == null) {
                        return;
                    }
                    i3.setOnClickListener(new View.OnClickListener() { // from class: f.c.a.a.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            m mVar = m.this;
                            int i4 = m.f3120l;
                            i.l.b.i.e(mVar, "this$0");
                            j jVar = mVar.f3123h;
                            if (jVar != null) {
                                BannerTemplate bannerTemplate = mVar.f3124i;
                                if (bannerTemplate == null) {
                                    i.l.b.i.h("templateType");
                                    throw null;
                                }
                                h hVar5 = mVar.f3122g;
                                if (hVar5 == null) {
                                    i.l.b.i.h("payload");
                                    throw null;
                                }
                                jVar.a(bannerTemplate, hVar5);
                            }
                            j jVar2 = mVar.f3123h;
                            if (jVar2 == null) {
                                return;
                            }
                            h hVar6 = mVar.f3122g;
                            if (hVar6 != null) {
                                jVar2.b(hVar6);
                            } else {
                                i.l.b.i.h("payload");
                                throw null;
                            }
                        }
                    });
                    return;
                }
                i.l.b.i.h("binding");
                throw null;
            }
            i.l.b.i.h("binding");
            throw null;
        }
        i.l.b.i.h("payload");
        throw null;
    }
}
