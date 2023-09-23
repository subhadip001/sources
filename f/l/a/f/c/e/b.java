package f.l.a.f.c.e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.nightcode.mediapicker.presentation.fragments.FragmentTag;
import com.video_converter.video_compressor.R;
import e.u.b.l;
import f.l.a.d.c.a;
import i.j.j.a.e;
import i.l.a.p;
import i.l.a.q;
import i.l.b.h;
import i.l.b.i;
import i.l.b.j;
import j.a.c0;
import j.a.l0;
import j.a.y1.n;
import j.a.z;
import java.util.List;
import java.util.Objects;

/* compiled from: FolderListFragment.kt */
/* loaded from: classes2.dex */
public final class b extends f.l.a.f.c.c<f.l.a.c.c> implements f.l.a.d.e.a {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f6740m = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6741h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6742i;

    /* renamed from: j  reason: collision with root package name */
    public f.l.a.d.e.b f6743j;

    /* renamed from: k  reason: collision with root package name */
    public final i.c f6744k;

    /* renamed from: l  reason: collision with root package name */
    public final i.c f6745l;

    /* compiled from: FolderListFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends h implements q<LayoutInflater, ViewGroup, Boolean, f.l.a.c.c> {
        public static final a n = new a();

        public a() {
            super(3, f.l.a.c.c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/nightcode/mediapicker/databinding/NcFragmentFolderListBinding;", 0);
        }

        @Override // i.l.a.q
        public f.l.a.c.c f(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater layoutInflater2 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean booleanValue = bool.booleanValue();
            i.e(layoutInflater2, "p0");
            View inflate = layoutInflater2.inflate(R.layout.nc_fragment_folder_list, viewGroup2, false);
            if (booleanValue) {
                viewGroup2.addView(inflate);
            }
            int i2 = R.id.fragmentContainer;
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.fragmentContainer);
            if (frameLayout != null) {
                i2 = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerView);
                if (recyclerView != null) {
                    return new f.l.a.c.c((FrameLayout) inflate, frameLayout, recyclerView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        }
    }

    /* compiled from: FolderListFragment.kt */
    /* renamed from: f.l.a.f.c.e.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0161b extends j implements i.l.a.a<f.l.a.f.c.e.c> {
        public C0161b() {
            super(0);
        }

        @Override // i.l.a.a
        public f.l.a.f.c.e.c c() {
            return new f.l.a.f.c.e.c(b.this, f.l.a.f.c.e.d.n);
        }
    }

    /* compiled from: FolderListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends j implements i.l.a.a<f.l.a.d.f.c.a> {
        public c() {
            super(0);
        }

        @Override // i.l.a.a
        public f.l.a.d.f.c.a c() {
            Context applicationContext = b.this.requireContext().getApplicationContext();
            i.d(applicationContext, "requireContext().applicationContext");
            return new f.l.a.d.f.c.a(new f.l.a.e.a.a(applicationContext));
        }
    }

    /* compiled from: FolderListFragment.kt */
    @e(c = "com.nightcode.mediapicker.presentation.fragments.folderList.FolderListFragment$initView$1", f = "FolderListFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends i.j.j.a.h implements p<c0, i.j.d<? super i.h>, Object> {

        /* compiled from: FolderListFragment.kt */
        @e(c = "com.nightcode.mediapicker.presentation.fragments.folderList.FolderListFragment$initView$1$1", f = "FolderListFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i.j.j.a.h implements p<c0, i.j.d<? super i.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ b f6749j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ f.l.a.d.c.a<List<f.l.a.d.d.c>> f6750k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b bVar, f.l.a.d.c.a<? extends List<f.l.a.d.d.c>> aVar, i.j.d<? super a> dVar) {
                super(2, dVar);
                this.f6749j = bVar;
                this.f6750k = aVar;
            }

            @Override // i.j.j.a.a
            public final i.j.d<i.h> a(Object obj, i.j.d<?> dVar) {
                return new a(this.f6749j, this.f6750k, dVar);
            }

            @Override // i.l.a.p
            public Object k(c0 c0Var, i.j.d<? super i.h> dVar) {
                i.j.d<? super i.h> dVar2 = dVar;
                b bVar = this.f6749j;
                f.l.a.d.c.a<List<f.l.a.d.d.c>> aVar = this.f6750k;
                if (dVar2 != null) {
                    dVar2.getContext();
                }
                i.h hVar = i.h.a;
                f.n.a.n.i.e0(hVar);
                if (!bVar.isDetached() && !bVar.isRemoving() && (aVar instanceof a.b)) {
                    f.l.a.f.c.e.c cVar = (f.l.a.f.c.e.c) bVar.f6745l.getValue();
                    List list = (List) ((a.b) aVar).a;
                    cVar.c.clear();
                    if (list != null) {
                        cVar.c.addAll(list);
                    }
                    cVar.notifyDataSetChanged();
                }
                return hVar;
            }

            @Override // i.j.j.a.a
            public final Object l(Object obj) {
                f.n.a.n.i.e0(obj);
                if (!this.f6749j.isDetached() && !this.f6749j.isRemoving()) {
                    if (this.f6750k instanceof a.b) {
                        f.l.a.f.c.e.c cVar = (f.l.a.f.c.e.c) this.f6749j.f6745l.getValue();
                        List list = (List) ((a.b) this.f6750k).a;
                        cVar.c.clear();
                        if (list != null) {
                            cVar.c.addAll(list);
                        }
                        cVar.notifyDataSetChanged();
                    }
                    return i.h.a;
                }
                return i.h.a;
            }
        }

        public d(i.j.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // i.j.j.a.a
        public final i.j.d<i.h> a(Object obj, i.j.d<?> dVar) {
            return new d(dVar);
        }

        @Override // i.l.a.p
        public Object k(c0 c0Var, i.j.d<? super i.h> dVar) {
            i.j.d<? super i.h> dVar2 = dVar;
            b bVar = b.this;
            if (dVar2 != null) {
                dVar2.getContext();
            }
            i.h hVar = i.h.a;
            f.n.a.n.i.e0(hVar);
            f.l.a.d.f.c.a aVar = (f.l.a.d.f.c.a) bVar.f6744k.getValue();
            f.l.a.d.e.b bVar2 = bVar.f6743j;
            f.l.a.d.c.a<List<f.l.a.d.d.c>> g2 = aVar.a.g(new f.l.a.d.d.b(bVar2 == null ? null : bVar2.g(), null, null, null, 14));
            z zVar = l0.a;
            f.n.a.n.i.D(f.n.a.n.i.a(n.c), null, null, new a(bVar, g2, null), 3, null);
            return hVar;
        }

        @Override // i.j.j.a.a
        public final Object l(Object obj) {
            f.n.a.n.i.e0(obj);
            f.l.a.d.f.c.a aVar = (f.l.a.d.f.c.a) b.this.f6744k.getValue();
            f.l.a.d.e.b bVar = b.this.f6743j;
            f.l.a.d.c.a<List<f.l.a.d.d.c>> g2 = aVar.a.g(new f.l.a.d.d.b(bVar == null ? null : bVar.g(), null, null, null, 14));
            z zVar = l0.a;
            f.n.a.n.i.D(f.n.a.n.i.a(n.c), null, null, new a(b.this, g2, null), 3, null);
            return i.h.a;
        }
    }

    public b() {
        super(a.n);
        this.f6744k = f.n.a.n.i.E(new c());
        this.f6745l = f.n.a.n.i.E(new C0161b());
    }

    @Override // f.l.a.d.e.a
    public void d() {
        Fragment I;
        if (this.f6742i && (I = getChildFragmentManager().I(FragmentTag.FOLDER_FRAGMENT_TAG.name())) != null && (I instanceof f.l.a.d.e.a)) {
            ((f.l.a.d.e.a) I).d();
        }
    }

    @Override // f.l.a.d.e.a
    public boolean e() {
        if (isAdded() && getChildFragmentManager().I(FragmentTag.FOLDER_FRAGMENT_TAG.name()) != null) {
            getChildFragmentManager().Y();
            return true;
        }
        return false;
    }

    @Override // f.l.a.f.c.c
    public void k() {
        if (isRemoving() || isDetached()) {
            return;
        }
        if (!isAdded()) {
            this.f6741h = true;
            return;
        }
        i().c.setAdapter((f.l.a.f.c.e.c) this.f6745l.getValue());
        i().c.g(new l(requireContext(), 1));
        f.n.a.n.i.D(f.n.a.n.i.a(l0.b), null, null, new d(null), 3, null);
        this.f6742i = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        i.e(context, "context");
        super.onAttach(context);
        if (getParentFragment() instanceof f.l.a.d.e.b) {
            Fragment parentFragment = getParentFragment();
            Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.nightcode.mediapicker.domain.interfaces.MediaPickerInterface");
            this.f6743j = (f.l.a.d.e.b) parentFragment;
        }
        if (getActivity() instanceof f.l.a.d.e.b) {
            e.p.c.n activity = getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.nightcode.mediapicker.domain.interfaces.MediaPickerInterface");
            this.f6743j = (f.l.a.d.e.b) activity;
        }
        if (this.f6741h) {
            k();
        }
    }
}
