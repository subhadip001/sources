package f.l.a.f.c.f;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.nightcode.mediapicker.domain.constants.LayoutMode;
import com.nightcode.mediapicker.domain.constants.MediaType;
import com.nightcode.mediapicker.domain.constants.SortMode;
import com.nightcode.mediapicker.domain.constants.SortOrder;
import com.video_converter.video_compressor.R;
import e.p.c.n;
import e.s.s;
import f.h.b.c.a0.f;
import f.l.a.f.c.g.j;
import i.l.a.q;
import i.l.b.h;
import i.l.b.i;
import java.util.List;
import java.util.Objects;

/* compiled from: MediaPickerFragment.kt */
/* loaded from: classes2.dex */
public final class c extends f.l.a.f.c.c<f.l.a.c.e> implements f.l.a.d.e.b {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f6753l = 0;

    /* renamed from: h  reason: collision with root package name */
    public f.l.a.d.e.b f6754h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6755i;

    /* renamed from: j  reason: collision with root package name */
    public j f6756j;

    /* renamed from: k  reason: collision with root package name */
    public f.l.a.f.c.e.b f6757k;

    /* compiled from: MediaPickerFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends h implements q<LayoutInflater, ViewGroup, Boolean, f.l.a.c.e> {
        public static final a n = new a();

        public a() {
            super(3, f.l.a.c.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/nightcode/mediapicker/databinding/NcFragmentMediaPickerBinding;", 0);
        }

        @Override // i.l.a.q
        public f.l.a.c.e f(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater layoutInflater2 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean booleanValue = bool.booleanValue();
            i.e(layoutInflater2, "p0");
            View inflate = layoutInflater2.inflate(R.layout.nc_fragment_media_picker, viewGroup2, false);
            if (booleanValue) {
                viewGroup2.addView(inflate);
            }
            int i2 = R.id.select_all;
            TextView textView = (TextView) inflate.findViewById(R.id.select_all);
            if (textView != null) {
                i2 = R.id.tab_layout;
                TabLayout tabLayout = (TabLayout) inflate.findViewById(R.id.tab_layout);
                if (tabLayout != null) {
                    i2 = R.id.viewPager2;
                    ViewPager2 viewPager2 = (ViewPager2) inflate.findViewById(R.id.viewPager2);
                    if (viewPager2 != null) {
                        return new f.l.a.c.e((LinearLayout) inflate, textView, tabLayout, viewPager2);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        }
    }

    public c() {
        super(a.n);
    }

    @Override // f.l.a.d.e.b
    public void A() {
    }

    @Override // f.l.a.d.e.b
    public void B(List<? extends f.l.a.d.d.e> list) {
        i.e(list, "list");
        f.l.a.d.e.b bVar = this.f6754h;
        if (bVar == null) {
            return;
        }
        bVar.B(list);
    }

    @Override // f.l.a.d.e.b
    public SortMode a() {
        f.l.a.d.e.b bVar = this.f6754h;
        SortMode a2 = bVar == null ? null : bVar.a();
        if (a2 == null) {
            f.l.a.d.a aVar = f.l.a.d.a.a;
            return f.l.a.d.a.b;
        }
        return a2;
    }

    @Override // f.l.a.d.e.b
    public void c(f.l.a.d.d.e eVar) {
        i.e(eVar, "mediaModel");
        f.l.a.d.e.b bVar = this.f6754h;
        if (bVar == null) {
            return;
        }
        bVar.c(eVar);
    }

    @Override // f.l.a.d.e.b
    public MediaType g() {
        f.l.a.d.e.b bVar = this.f6754h;
        MediaType g2 = bVar == null ? null : bVar.g();
        return g2 == null ? MediaType.VIDEO : g2;
    }

    @Override // f.l.a.d.e.b
    public void j(boolean z) {
        i().b.setText(getString(z ? R.string.unselect_all : R.string.select_all));
    }

    @Override // f.l.a.f.c.c
    public void k() {
        if (!isAdded()) {
            this.f6755i = true;
            return;
        }
        this.f6755i = false;
        i().b.setOnClickListener(new View.OnClickListener() { // from class: f.l.a.f.c.f.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c cVar = c.this;
                int i2 = c.f6753l;
                i.e(cVar, "this$0");
                f.l.a.d.e.a m2 = cVar.m();
                if (m2 == null) {
                    return;
                }
                m2.d();
            }
        });
        ViewPager2 viewPager2 = i().f6620d;
        viewPager2.setAdapter(new e(this, getChildFragmentManager(), getViewLifecycleOwner().getLifecycle()));
        viewPager2.setOffscreenPageLimit(3);
        ViewPager2 viewPager22 = i().f6620d;
        viewPager22.f618h.a.add(new f(this));
        new f.h.b.c.a0.f(i().c, i().f6620d, new f.b() { // from class: f.l.a.f.c.f.b
            @Override // f.h.b.c.a0.f.b
            public final void a(TabLayout.g gVar, int i2) {
                String string;
                c cVar = c.this;
                int i3 = c.f6753l;
                i.e(cVar, "this$0");
                i.e(gVar, "tab");
                if (i2 == 0) {
                    string = cVar.getString(R.string.media);
                } else if (i2 != 1) {
                    string = cVar.getString(R.string.browse);
                } else {
                    string = cVar.getString(R.string.folders);
                }
                gVar.c(string);
            }
        }).a();
        TabLayout tabLayout = i().c;
        d dVar = new d();
        if (tabLayout.M.contains(dVar)) {
            return;
        }
        tabLayout.M.add(dVar);
    }

    public final f.l.a.d.e.a m() {
        f.l.a.d.e.a aVar;
        j jVar = this.f6756j;
        if (jVar == null) {
            jVar = new j();
        }
        this.f6756j = jVar;
        f.l.a.f.c.e.b bVar = this.f6757k;
        if (bVar == null) {
            bVar = new f.l.a.f.c.e.b();
        }
        this.f6757k = bVar;
        int currentItem = i().f6620d.getCurrentItem();
        if (currentItem == 0) {
            aVar = this.f6756j;
            if (!(aVar instanceof f.l.a.d.e.a)) {
                return null;
            }
        } else if (currentItem != 1) {
            return null;
        } else {
            aVar = this.f6757k;
            if (!(aVar instanceof f.l.a.d.e.a)) {
                return null;
            }
        }
        return aVar;
    }

    @Override // f.l.a.d.e.b
    public void n(List<? extends f.l.a.d.d.e> list) {
        i.e(list, "list");
        f.l.a.d.e.b bVar = this.f6754h;
        if (bVar == null) {
            return;
        }
        bVar.n(list);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        i.e(context, "context");
        super.onAttach(context);
        if (getParentFragment() instanceof f.l.a.d.e.b) {
            Fragment parentFragment = getParentFragment();
            Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.nightcode.mediapicker.domain.interfaces.MediaPickerInterface");
            this.f6754h = (f.l.a.d.e.b) parentFragment;
        } else if (getActivity() instanceof f.l.a.d.e.b) {
            n activity = getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.nightcode.mediapicker.domain.interfaces.MediaPickerInterface");
            this.f6754h = (f.l.a.d.e.b) activity;
        }
        if (this.f6755i) {
            Toast.makeText(context, "Initializing from onAttach", 0).show();
            k();
        }
    }

    @Override // f.l.a.d.e.b
    public SortOrder q() {
        f.l.a.d.e.b bVar = this.f6754h;
        SortOrder q = bVar == null ? null : bVar.q();
        if (q == null) {
            f.l.a.d.a aVar = f.l.a.d.a.a;
            return f.l.a.d.a.c;
        }
        return q;
    }

    @Override // f.l.a.d.e.b
    public LayoutMode t() {
        f.l.a.d.e.b bVar = this.f6754h;
        LayoutMode t = bVar == null ? null : bVar.t();
        if (t == null) {
            f.l.a.d.a aVar = f.l.a.d.a.a;
            return f.l.a.d.a.f6631d;
        }
        return t;
    }

    @Override // f.l.a.d.e.b
    public boolean u() {
        f.l.a.d.e.b bVar = this.f6754h;
        if (bVar == null) {
            return true;
        }
        return bVar.u();
    }

    @Override // f.l.a.d.e.b
    public LiveData<List<f.l.a.d.d.e>> w() {
        f.l.a.d.e.b bVar = this.f6754h;
        LiveData<List<f.l.a.d.d.e>> w = bVar == null ? null : bVar.w();
        return w == null ? new s() : w;
    }

    @Override // f.l.a.d.e.b
    public boolean x(f.l.a.d.d.e eVar) {
        i.e(eVar, "imageFile");
        f.l.a.d.e.b bVar = this.f6754h;
        if (bVar == null) {
            return false;
        }
        return bVar.x(eVar);
    }

    @Override // f.l.a.d.e.b
    public boolean y() {
        f.l.a.d.e.b bVar = this.f6754h;
        if (bVar == null) {
            return false;
        }
        return bVar.y();
    }

    @Override // f.l.a.d.e.b
    public void z(f.l.a.d.d.e eVar) {
        i.e(eVar, "mediaModel");
        Log.d("sfssfsf", i.g("addToSelection: ", eVar.e()));
        f.l.a.d.e.b bVar = this.f6754h;
        if (bVar == null) {
            return;
        }
        bVar.z(eVar);
    }
}
