package f.l.a.c;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nightcode.mediapicker.presentation.views.ClippedImageView;

/* compiled from: NcItemFolderListBinding.java */
/* loaded from: classes2.dex */
public final class h implements e.d0.a {
    public final LinearLayout a;
    public final TextView b;
    public final ClippedImageView c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f6623d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f6624e;

    public h(LinearLayout linearLayout, TextView textView, ClippedImageView clippedImageView, TextView textView2, TextView textView3) {
        this.a = linearLayout;
        this.b = textView;
        this.c = clippedImageView;
        this.f6623d = textView2;
        this.f6624e = textView3;
    }

    @Override // e.d0.a
    public View b() {
        return this.a;
    }
}
