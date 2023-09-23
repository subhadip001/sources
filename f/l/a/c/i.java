package f.l.a.c;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nightcode.mediapicker.presentation.views.ClippedImageView;

/* compiled from: NcItemMediaGridBinding.java */
/* loaded from: classes2.dex */
public final class i implements e.d0.a {
    public final LinearLayout a;
    public final ImageView b;
    public final TextView c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f6625d;

    /* renamed from: e  reason: collision with root package name */
    public final ClippedImageView f6626e;

    public i(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, ClippedImageView clippedImageView, TextView textView3) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = textView;
        this.f6625d = textView2;
        this.f6626e = clippedImageView;
    }

    @Override // e.d0.a
    public View b() {
        return this.a;
    }
}
