package f.l.a.c;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* compiled from: NcActivityFilePickerBinding.java */
/* loaded from: classes2.dex */
public final class a implements e.d0.a {
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final LinearLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageButton f6608d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f6609e;

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f6610f;

    /* renamed from: g  reason: collision with root package name */
    public final MaterialButton f6611g;

    /* renamed from: h  reason: collision with root package name */
    public final FrameLayout f6612h;

    /* renamed from: i  reason: collision with root package name */
    public final RecyclerView f6613i;

    /* renamed from: j  reason: collision with root package name */
    public final MaterialCardView f6614j;

    /* renamed from: k  reason: collision with root package name */
    public final Toolbar f6615k;

    public a(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, TextView textView, FrameLayout frameLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, FrameLayout frameLayout2, RecyclerView recyclerView, MaterialCardView materialCardView, Toolbar toolbar) {
        this.a = constraintLayout;
        this.b = linearLayout;
        this.c = linearLayout2;
        this.f6608d = imageButton;
        this.f6609e = textView;
        this.f6610f = frameLayout;
        this.f6611g = materialButton;
        this.f6612h = frameLayout2;
        this.f6613i = recyclerView;
        this.f6614j = materialCardView;
        this.f6615k = toolbar;
    }

    @Override // e.d0.a
    public View b() {
        return this.a;
    }
}
