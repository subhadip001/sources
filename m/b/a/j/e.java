package m.b.a.j;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.video_converter.video_compressor.R;
import f.e.a.l.q.k;
import i.l.b.i;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import m.b.a.j.e;
import org.inverseai.cross_promo.helpers.CrossPromoType;
import org.inverseai.cross_promo.model.CrossPromoProduct;

/* compiled from: CrossPromoAd.kt */
/* loaded from: classes2.dex */
public final class e {
    public final CrossPromoType a;
    public ImageButton b;
    public Button c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f9321d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f9322e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f9323f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f9324g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f9325h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f9326i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f9327j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f9328k;

    /* renamed from: l  reason: collision with root package name */
    public RatingBar f9329l;

    /* renamed from: m  reason: collision with root package name */
    public CardView f9330m;
    public TextView n;
    public ConstraintLayout o;
    public int p;
    public View q;
    public boolean r;
    public a s;
    public m.b.a.h.a t;

    /* compiled from: CrossPromoAd.kt */
    /* loaded from: classes2.dex */
    public interface a {
        void h();
    }

    public e(CrossPromoType crossPromoType) {
        i.e(crossPromoType, "crossPromoType");
        this.a = crossPromoType;
    }

    public final View a(Context context, int i2) {
        i.e(context, "context");
        this.p = i2;
        View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) null, false);
        i.d(inflate, "from(context).inflate(layoutId, null, false)");
        return inflate;
    }

    public final void b(View view, final CrossPromoProduct crossPromoProduct, boolean z, boolean z2) {
        View view2;
        String str;
        ImageView imageView;
        ImageView imageView2;
        i.e(view, "view");
        i.e(crossPromoProduct, "product");
        this.t = new m.b.a.h.b();
        this.q = view;
        this.b = (ImageButton) view.findViewById(R.id.actCancelBtn);
        this.c = (Button) view.findViewById(R.id.actInstallBtn);
        this.f9321d = (ImageView) view.findViewById(R.id.iconImageView);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.blurredView);
        this.f9322e = (ImageView) view.findViewById(R.id.bannerImageView);
        this.f9323f = (TextView) view.findViewById(R.id.appNameTxtView);
        this.f9324g = (TextView) view.findViewById(R.id.appShortDesTxtView);
        this.f9325h = (TextView) view.findViewById(R.id.appDesTxtView);
        this.f9326i = (TextView) view.findViewById(R.id.ratingTxtView);
        this.f9327j = (TextView) view.findViewById(R.id.totalRatingTxtView);
        this.f9328k = (TextView) view.findViewById(R.id.downloadCountTxtView);
        this.f9329l = (RatingBar) view.findViewById(R.id.ratingBar);
        this.f9330m = (CardView) view.findViewById(R.id.cv_close);
        this.n = (TextView) view.findViewById(R.id.tv_ad_attr);
        this.o = (ConstraintLayout) view.findViewById(R.id.root_cross_ad);
        final Context context = view.getContext();
        i.d(context, "view.context");
        String icon = crossPromoProduct.getIcon();
        if (f.n.a.n.i.W(crossPromoProduct.getIcon(), "data/", false, 2)) {
            icon = i.g("file:///android_asset/", icon);
        }
        if (!d(context).isFinishing() && !d(context).isDestroyed() && (imageView2 = this.f9321d) != null) {
            imageView2.setClipToOutline(true);
            f.e.a.b.e(imageView2).e(icon).e().i(R.drawable.icon_placeholder).d(k.c).y(imageView2);
        }
        String banner = crossPromoProduct.getBanner();
        if (f.n.a.n.i.W(crossPromoProduct.getBanner(), "data/", false, 2)) {
            banner = i.g("file:///android_asset/", banner);
        }
        if (!d(context).isFinishing() && !d(context).isDestroyed() && (imageView = this.f9322e) != null) {
            f.e.a.b.d(imageView.getContext()).e(banner).e().i(R.drawable.banner_16_9).y(imageView);
        }
        TextView textView = this.f9323f;
        if (textView != null) {
            textView.setText(crossPromoProduct.getName());
        }
        TextView textView2 = this.f9324g;
        if (textView2 != null) {
            textView2.setText(crossPromoProduct.getShort_des());
        }
        TextView textView3 = this.f9324g;
        if (textView3 != null) {
            textView3.setSelected(true);
        }
        TextView textView4 = this.f9325h;
        if (textView4 != null) {
            textView4.setText(crossPromoProduct.getLong_des());
        }
        TextView textView5 = this.f9325h;
        if (textView5 != null) {
            textView5.setSelected(true);
        }
        RatingBar ratingBar = this.f9329l;
        if (ratingBar != null) {
            ratingBar.setRating((float) crossPromoProduct.getRating());
        }
        TextView textView6 = this.f9326i;
        if (textView6 != null) {
            textView6.setText(String.valueOf(crossPromoProduct.getRating()));
        }
        TextView textView7 = this.f9327j;
        if (textView7 != null) {
            textView7.setText(crossPromoProduct.getTotal_ratings());
        }
        TextView textView8 = this.f9328k;
        if (textView8 != null) {
            textView8.setText(crossPromoProduct.getTotal_downloads());
        }
        ImageButton imageButton = this.b;
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: m.b.a.j.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    e eVar = e.this;
                    i.e(eVar, "this$0");
                    e.a aVar = eVar.s;
                    if (aVar == null) {
                        return;
                    }
                    aVar.h();
                }
            });
        }
        CardView cardView = this.f9330m;
        if (cardView != null) {
            cardView.setOnClickListener(new View.OnClickListener() { // from class: m.b.a.j.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    e eVar = e.this;
                    i.e(eVar, "this$0");
                    e.a aVar = eVar.s;
                    if (aVar == null) {
                        return;
                    }
                    aVar.h();
                }
            });
        }
        Button button = this.c;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: m.b.a.j.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    e eVar = e.this;
                    Context context2 = context;
                    CrossPromoProduct crossPromoProduct2 = crossPromoProduct;
                    i.e(eVar, "this$0");
                    i.e(context2, "$context");
                    i.e(crossPromoProduct2, "$product");
                    eVar.c(context2, crossPromoProduct2, "install_button");
                }
            });
        }
        ConstraintLayout constraintLayout = this.o;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: m.b.a.j.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    e eVar = e.this;
                    Context context2 = context;
                    CrossPromoProduct crossPromoProduct2 = crossPromoProduct;
                    i.e(eVar, "this$0");
                    i.e(context2, "$context");
                    i.e(crossPromoProduct2, "$product");
                    eVar.c(context2, crossPromoProduct2, "root_view");
                }
            });
        }
        TextView textView9 = this.n;
        if (textView9 != null) {
            textView9.setVisibility(z2 ? 0 : 8);
        }
        if (z) {
            CardView cardView2 = this.f9330m;
            if (cardView2 != null) {
                cardView2.setVisibility(0);
            }
            ImageButton imageButton2 = this.b;
            if (imageButton2 != null) {
                imageButton2.setVisibility(0);
            }
        } else {
            CardView cardView3 = this.f9330m;
            if (cardView3 != null) {
                cardView3.setVisibility(8);
            }
            ImageButton imageButton3 = this.b;
            if (imageButton3 != null) {
                imageButton3.setVisibility(8);
            }
        }
        String pkg_name = crossPromoProduct.getPkg_name();
        m.b.a.h.a aVar = this.t;
        if (aVar == null || (view2 = this.q) == null) {
            return;
        }
        Context context2 = view2.getContext();
        i.d(context2, "view.context");
        String name = this.a.name();
        int i2 = this.p;
        i.e(context2, "context");
        i.e(name, "adType");
        i.e(pkg_name, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        Bundle bundle = new Bundle();
        bundle.putString("displayed", name);
        int ordinal = CrossPromoType.valueOf(name).ordinal();
        String str2 = "rewarded_";
        if (ordinal == 0) {
            str = "banner_";
        } else if (ordinal == 1) {
            str = "native_";
        } else if (ordinal == 2) {
            str = "interstitial_";
        } else if (ordinal != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "rewarded_";
        }
        String resourceEntryName = context2.getResources().getResourceEntryName(i2);
        i.d(resourceEntryName, "context.resources.getResourceEntryName(layoutId)");
        bundle.putString("layout_displayed", i.g(str, resourceEntryName));
        int ordinal2 = CrossPromoType.valueOf(name).ordinal();
        if (ordinal2 == 0) {
            str2 = "banner_";
        } else if (ordinal2 == 1) {
            str2 = "native_";
        } else if (ordinal2 == 2) {
            str2 = "interstitial_";
        } else if (ordinal2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        bundle.putString("product_displayed", i.g(str2, pkg_name));
        aVar.a(context2, "cross_promo_event", bundle);
    }

    public final void c(Context context, CrossPromoProduct crossPromoProduct, String str) {
        boolean z;
        View view;
        String str2;
        String str3;
        m.b.a.h.a aVar;
        View view2;
        String pkg_name = crossPromoProduct.getPkg_name();
        PackageManager packageManager = context.getPackageManager();
        i.d(packageManager, "context.packageManager");
        i.e(pkg_name, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        i.e(packageManager, "packageManager");
        try {
            packageManager.getPackageInfo(pkg_name, 0);
            z = true;
        } catch (PackageManager.NameNotFoundException unused) {
            z = false;
        }
        if (!z) {
            View view3 = this.q;
            if (view3 == null) {
                str2 = "click_area";
                str3 = "layout_engagement";
            } else {
                Context context2 = view3.getContext();
                i.d(context2, "it.context");
                String pkg_name2 = crossPromoProduct.getPkg_name();
                str2 = "click_area";
                CrossPromoType crossPromoType = this.a;
                i.e(context2, "context");
                i.e(pkg_name2, "targetPackageName");
                i.e(crossPromoType, "crossPromoType");
                StringBuilder sb = new StringBuilder();
                str3 = "layout_engagement";
                sb.append("https://play.google.com/store/apps/details?id=");
                sb.append(pkg_name2);
                sb.append("&referrer=utm_source=");
                sb.append((Object) context2.getApplicationContext().getPackageName());
                sb.append("&utm_campaign=");
                sb.append(crossPromoType.name());
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
                intent.addFlags(1208483840);
                try {
                    context2.startActivity(intent);
                } catch (ActivityNotFoundException unused2) {
                    Toast.makeText(context2, context2.getString(R.string.no_application_found_to_handle_this_action), 0).show();
                } catch (SecurityException unused3) {
                    Toast.makeText(context2, context2.getString(R.string.something_went_wrong), 0).show();
                }
                ArrayList<CrossPromoProduct> arrayList = f.a;
                if (arrayList != null) {
                    arrayList.clear();
                }
                f.a = null;
            }
            if (this.r || (aVar = this.t) == null || (view2 = this.q) == null) {
                return;
            }
            this.r = true;
            Context context3 = view2.getContext();
            i.d(context3, "view.context");
            String name = this.a.name();
            int i2 = this.p;
            i.e(context3, "context");
            i.e(aVar, "eventLogger");
            i.e(name, "adType");
            i.e(crossPromoProduct, "product");
            i.e(str, "clickArea");
            Bundle bundle = new Bundle();
            bundle.putString("engagement", name);
            String b = f.b(name);
            String resourceEntryName = context3.getResources().getResourceEntryName(i2);
            i.d(resourceEntryName, "context.resources.getResourceEntryName(layoutId)");
            bundle.putString(str3, i.g(b, resourceEntryName));
            bundle.putString("install", i.g(f.b(name), crossPromoProduct.getPkg_name()));
            bundle.putString(str2, i.g(f.b(name), str));
            aVar.a(context3, "cross_promo_event", bundle);
            return;
        }
        View view4 = this.q;
        if (view4 != null) {
            Context context4 = view4.getContext();
            i.d(context4, "it.context");
            String pkg_name3 = crossPromoProduct.getPkg_name();
            i.e(context4, "context");
            i.e(pkg_name3, "targetPackageName");
            Intent launchIntentForPackage = context4.getPackageManager().getLaunchIntentForPackage(pkg_name3);
            if (launchIntentForPackage != null) {
                context4.startActivity(launchIntentForPackage);
            } else {
                Toast.makeText(context4, context4.getString(R.string.no_application_found_to_handle_this_action), 0).show();
            }
        }
        m.b.a.h.a aVar2 = this.t;
        if (aVar2 == null || (view = this.q) == null) {
            return;
        }
        Context context5 = view.getContext();
        i.d(context5, "view.context");
        String name2 = this.a.name();
        int i3 = this.p;
        i.e(context5, "context");
        i.e(aVar2, "eventLogger");
        i.e(name2, "adType");
        i.e(crossPromoProduct, "product");
        i.e(str, "clickArea");
        Bundle bundle2 = new Bundle();
        bundle2.putString("engagement", name2);
        String b2 = f.b(name2);
        String resourceEntryName2 = context5.getResources().getResourceEntryName(i3);
        i.d(resourceEntryName2, "context.resources.getResourceEntryName(layoutId)");
        bundle2.putString("layout_engagement", i.g(b2, resourceEntryName2));
        bundle2.putString("open", i.g(f.b(name2), crossPromoProduct.getPkg_name()));
        bundle2.putString("click_area", i.g(f.b(name2), str));
        aVar2.a(context5, "cross_promo_event", bundle2);
    }

    public final Activity d(Context context) {
        while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
            i.d(context, "unwrappedContext as ContextWrapper).baseContext");
        }
        return (Activity) context;
    }
}
