package f.j.a.k;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.video_converter.video_compressor.R;
import java.util.Objects;

/* compiled from: TemplateView.java */
/* loaded from: classes2.dex */
public class b extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public int f6517f;

    /* renamed from: g  reason: collision with root package name */
    public a f6518g;

    /* renamed from: h  reason: collision with root package name */
    public NativeAdView f6519h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f6520i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f6521j;

    /* renamed from: k  reason: collision with root package name */
    public RatingBar f6522k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f6523l;

    /* renamed from: m  reason: collision with root package name */
    public ImageView f6524m;
    public MediaView n;
    public Button o;
    public ViewGroup p;

    public b(Context context) {
        super(context);
    }

    public void a() {
        this.f6519h = (NativeAdView) findViewById(R.id.native_ad_view);
        this.f6520i = (TextView) findViewById(R.id.primary);
        this.f6521j = (TextView) findViewById(R.id.secondary);
        this.f6523l = (TextView) findViewById(R.id.body);
        this.f6522k = (RatingBar) findViewById(R.id.rating_bar);
        this.o = (Button) findViewById(R.id.cta);
        this.f6524m = (ImageView) findViewById(R.id.icon);
        MediaView mediaView = (MediaView) findViewById(R.id.media_view);
        this.n = mediaView;
        mediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        this.p = (ViewGroup) findViewById(R.id.background);
    }

    public NativeAdView getNativeAdView() {
        return this.f6519h;
    }

    public String getTemplateTypeName() {
        int i2 = this.f6517f;
        return i2 == R.layout.gnt_medium_template_view ? "medium_template" : i2 == R.layout.gnt_small_template_view ? "small_template" : "";
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        a();
    }

    public void setNativeAd(NativeAd nativeAd) {
        String store = nativeAd.getStore();
        String advertiser = nativeAd.getAdvertiser();
        String headline = nativeAd.getHeadline();
        String body = nativeAd.getBody();
        String callToAction = nativeAd.getCallToAction();
        Double starRating = nativeAd.getStarRating();
        NativeAd.Image icon = nativeAd.getIcon();
        this.f6519h.setCallToActionView(this.o);
        this.f6519h.setHeadlineView(this.f6520i);
        this.f6519h.setMediaView(this.n);
        this.f6521j.setVisibility(0);
        if (!TextUtils.isEmpty(nativeAd.getStore()) && TextUtils.isEmpty(nativeAd.getAdvertiser())) {
            this.f6519h.setStoreView(this.f6521j);
        } else if (TextUtils.isEmpty(advertiser)) {
            store = "";
        } else {
            this.f6519h.setAdvertiserView(this.f6521j);
            store = advertiser;
        }
        this.f6520i.setText(headline);
        this.o.setText(callToAction);
        if (starRating != null && starRating.doubleValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f6521j.setVisibility(8);
            this.f6522k.setVisibility(0);
            this.f6522k.setMax(5);
            this.f6522k.setRating(starRating.floatValue());
            this.f6519h.setStarRatingView(this.f6522k);
        } else {
            this.f6521j.setText(store);
            this.f6521j.setVisibility(0);
            this.f6522k.setVisibility(8);
        }
        if (icon != null) {
            this.f6524m.setVisibility(0);
            this.f6524m.setImageDrawable(icon.getDrawable());
        } else {
            this.f6524m.setVisibility(8);
        }
        TextView textView = this.f6523l;
        if (textView != null) {
            textView.setText(body);
            this.f6519h.setBodyView(this.f6523l);
        }
        this.f6519h.setNativeAd(nativeAd);
    }

    public void setStyles(a aVar) {
        this.f6518g = aVar;
        ColorDrawable colorDrawable = aVar.a;
        if (colorDrawable != null) {
            this.p.setBackground(colorDrawable);
            TextView textView = this.f6520i;
            if (textView != null) {
                textView.setBackground(colorDrawable);
            }
            TextView textView2 = this.f6521j;
            if (textView2 != null) {
                textView2.setBackground(colorDrawable);
            }
            TextView textView3 = this.f6523l;
            if (textView3 != null) {
                textView3.setBackground(colorDrawable);
            }
        }
        Objects.requireNonNull(this.f6518g);
        Objects.requireNonNull(this.f6518g);
        Objects.requireNonNull(this.f6518g);
        Objects.requireNonNull(this.f6518g);
        Objects.requireNonNull(this.f6518g);
        Objects.requireNonNull(this.f6518g);
        Objects.requireNonNull(this.f6518g);
        Objects.requireNonNull(this.f6518g);
        Objects.requireNonNull(this.f6518g);
        Objects.requireNonNull(this.f6518g);
        Objects.requireNonNull(this.f6518g);
        Objects.requireNonNull(this.f6518g);
        Objects.requireNonNull(this.f6518g);
        Objects.requireNonNull(this.f6518g);
        Objects.requireNonNull(this.f6518g);
        Objects.requireNonNull(this.f6518g);
        invalidate();
        requestLayout();
    }

    public void setTemplateView(int i2) {
        if (i2 == 0) {
            this.f6517f = R.layout.gnt_small_template_view_1;
        } else if (i2 == 222) {
            this.f6517f = R.layout.gnt_small_template_view_2;
        } else if (i2 == 1) {
            this.f6517f = R.layout.gnt_small_template_view_3;
        } else if (i2 == 111) {
            this.f6517f = R.layout.gnt_medium_template_view;
        } else if (i2 == 2) {
            this.f6517f = R.layout.gnt_native_advanced_template;
        } else {
            this.f6517f = R.layout.gnt_small_template_view_1;
        }
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(this.f6517f, this);
    }
}
