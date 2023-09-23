package f.l.a.f.c.d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import com.video_converter.video_compressor.R;
import e.p.c.n;
import f.l.a.f.c.c;
import i.l.a.q;
import i.l.b.h;
import i.l.b.i;
import java.util.Objects;

/* compiled from: BrowseMediaFragment.kt */
/* loaded from: classes2.dex */
public final class b extends c<f.l.a.c.b> {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f6736i = 0;

    /* renamed from: h  reason: collision with root package name */
    public f.l.a.d.e.b f6737h;

    /* compiled from: BrowseMediaFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends h implements q<LayoutInflater, ViewGroup, Boolean, f.l.a.c.b> {
        public static final a n = new a();

        public a() {
            super(3, f.l.a.c.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/nightcode/mediapicker/databinding/NcFragmentBrowseMediaBinding;", 0);
        }

        @Override // i.l.a.q
        public f.l.a.c.b f(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater layoutInflater2 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean booleanValue = bool.booleanValue();
            i.e(layoutInflater2, "p0");
            View inflate = layoutInflater2.inflate(R.layout.nc_fragment_browse_media, viewGroup2, false);
            if (booleanValue) {
                viewGroup2.addView(inflate);
            }
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.browseMediaBtn);
            if (materialButton != null) {
                return new f.l.a.c.b((LinearLayout) inflate, materialButton);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.browseMediaBtn)));
        }
    }

    public b() {
        super(a.n);
    }

    @Override // f.l.a.f.c.c
    public void k() {
        i().b.setOnClickListener(new View.OnClickListener() { // from class: f.l.a.f.c.d.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = b.this;
                int i2 = b.f6736i;
                i.e(bVar, "this$0");
                f.l.a.d.e.b bVar2 = bVar.f6737h;
                if (bVar2 == null) {
                    return;
                }
                bVar2.A();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        i.e(context, "context");
        super.onAttach(context);
        if (getParentFragment() instanceof f.l.a.d.e.b) {
            Fragment parentFragment = getParentFragment();
            Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.nightcode.mediapicker.domain.interfaces.MediaPickerInterface");
            this.f6737h = (f.l.a.d.e.b) parentFragment;
        }
        if (getActivity() instanceof f.l.a.d.e.b) {
            n activity = getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.nightcode.mediapicker.domain.interfaces.MediaPickerInterface");
            this.f6737h = (f.l.a.d.e.b) activity;
        }
    }
}
