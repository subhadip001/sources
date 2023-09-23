package f.l.a.c;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nightcode.mediapicker.presentation.views.ClippedImageView;

/* compiled from: NcItemMediaListBinding.java */
/* loaded from: classes2.dex */
public final class j implements e.d0.a {
    public final LinearLayout a;
    public final ImageView b;
    public final LinearLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f6627d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f6628e;

    /* renamed from: f  reason: collision with root package name */
    public final ClippedImageView f6629f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f6630g;

    public j(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView, TextView textView2, ClippedImageView clippedImageView, TextView textView3) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = linearLayout2;
        this.f6627d = textView;
        this.f6628e = textView2;
        this.f6629f = clippedImageView;
        this.f6630g = textView3;
    }

    @Override // e.d0.a
    public View b() {
        return this.a;
    }
}
