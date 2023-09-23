package f.l.a.f.c.g;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.nightcode.mediapicker.domain.constants.LayoutMode;
import com.nightcode.mediapicker.domain.constants.MediaType;
import com.nightcode.mediapicker.domain.constants.PermissionStatus;
import com.nightcode.mediapicker.domain.constants.SortMode;
import com.nightcode.mediapicker.domain.constants.SortOrder;
import com.video_converter.video_compressor.R;
import e.s.e0;
import e.s.i0;
import e.s.j0;
import e.s.m;
import e.s.s;
import e.s.t;
import f.l.a.d.b.j;
import i.l.a.q;
import i.l.b.o;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import m.a.a.l;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: MediaListFragment.kt */
/* loaded from: classes2.dex */
public class j extends f.l.a.f.c.c<f.l.a.c.d> implements f.l.a.d.e.a {
    public static final /* synthetic */ int r = 0;

    /* renamed from: h  reason: collision with root package name */
    public final i.c f6760h;

    /* renamed from: i  reason: collision with root package name */
    public f.l.a.d.e.b f6761i;

    /* renamed from: j  reason: collision with root package name */
    public f.l.a.d.b.j f6762j;

    /* renamed from: k  reason: collision with root package name */
    public LiveData<List<f.l.a.d.d.e>> f6763k;

    /* renamed from: l  reason: collision with root package name */
    public MediaType f6764l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6765m;
    public LayoutMode n;
    public SortMode o;
    public SortOrder p;
    public boolean q;

    /* compiled from: MediaListFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends i.l.b.h implements q<LayoutInflater, ViewGroup, Boolean, f.l.a.c.d> {
        public static final a n = new a();

        public a() {
            super(3, f.l.a.c.d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/nightcode/mediapicker/databinding/NcFragmentMediaListBinding;", 0);
        }

        @Override // i.l.a.q
        public f.l.a.c.d f(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater layoutInflater2 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            i.l.b.i.e(layoutInflater2, "p0");
            return f.l.a.c.d.a(layoutInflater2, viewGroup, booleanValue);
        }
    }

    /* compiled from: MediaListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements j.a {
        public b() {
        }

        @Override // f.l.a.d.b.j.a
        public boolean a(f.l.a.d.d.e eVar) {
            i.l.b.i.e(eVar, "mediaModel");
            f.l.a.d.e.b bVar = j.this.f6761i;
            if (bVar == null) {
                return false;
            }
            return bVar.x(eVar);
        }

        @Override // f.l.a.d.b.j.a
        public void b(f.l.a.d.d.e eVar) {
            i.l.b.i.e(eVar, "mediaModel");
            if (eVar.b()) {
                f.l.a.d.e.b bVar = j.this.f6761i;
                if (bVar == null) {
                    return;
                }
                bVar.c(eVar);
                return;
            }
            f.l.a.d.e.b bVar2 = j.this.f6761i;
            if (bVar2 == null) {
                return;
            }
            bVar2.z(eVar);
        }
    }

    /* compiled from: MediaListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends GridLayoutManager.c {
        public c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int c(int i2) {
            j jVar = j.this;
            int i3 = j.r;
            if (jVar.m().f6683k.d() == LayoutMode.LIST) {
                return 3;
            }
            f.l.a.d.e.b bVar = j.this.f6761i;
            if (bVar == null ? false : bVar.y()) {
                f.l.a.d.a aVar = f.l.a.d.a.a;
                return f.l.a.d.a.a(i2) ? 3 : 1;
            }
            return 1;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends i.l.b.j implements i.l.a.a<Fragment> {

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f6766g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f6766g = fragment;
        }

        @Override // i.l.a.a
        public Fragment c() {
            return this.f6766g;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends i.l.b.j implements i.l.a.a<i0> {

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ i.l.a.a f6767g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i.l.a.a aVar) {
            super(0);
            this.f6767g = aVar;
        }

        @Override // i.l.a.a
        public i0 c() {
            i0 viewModelStore = ((j0) this.f6767g.c()).getViewModelStore();
            i.l.b.i.d(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    /* compiled from: MediaListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends i.l.b.j implements i.l.a.a<e0> {
        public f() {
            super(0);
        }

        @Override // i.l.a.a
        public e0 c() {
            Context requireContext = j.this.requireContext();
            i.l.b.i.d(requireContext, "requireContext()");
            return new f.l.a.d.g.a.d(requireContext);
        }
    }

    public j() {
        super(a.n);
        this.f6760h = e.p.a.e(this, o.a(f.l.a.d.g.a.b.class), new e(new d(this)), new f());
        f.l.a.d.a aVar = f.l.a.d.a.a;
        this.n = f.l.a.d.a.f6631d;
        this.o = f.l.a.d.a.b;
        this.p = f.l.a.d.a.c;
    }

    @Override // f.l.a.d.e.a
    public void d() {
        if (this.q) {
            f.l.a.d.b.j jVar = this.f6762j;
            if (jVar == null) {
                i.l.b.i.h("adapter");
                throw null;
            }
            List<f.l.a.d.d.e> list = jVar.f6642h;
            int i2 = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (f.l.a.d.d.e eVar : list) {
                    if (eVar.b() && (i2 = i2 + 1) < 0) {
                        i.i.b.f();
                        throw null;
                    }
                }
            }
            f.l.a.d.b.j jVar2 = this.f6762j;
            if (jVar2 != null) {
                if (i2 == jVar2.f6642h.size()) {
                    f.l.a.d.e.b bVar = this.f6761i;
                    if (bVar == null) {
                        return;
                    }
                    f.l.a.d.b.j jVar3 = this.f6762j;
                    if (jVar3 != null) {
                        bVar.n(jVar3.f6642h);
                        return;
                    } else {
                        i.l.b.i.h("adapter");
                        throw null;
                    }
                }
                f.l.a.d.e.b bVar2 = this.f6761i;
                if (bVar2 == null) {
                    return;
                }
                f.l.a.d.b.j jVar4 = this.f6762j;
                if (jVar4 != null) {
                    bVar2.B(jVar4.f6642h);
                    return;
                } else {
                    i.l.b.i.h("adapter");
                    throw null;
                }
            }
            i.l.b.i.h("adapter");
            throw null;
        }
    }

    @Override // f.l.a.d.e.a
    public boolean e() {
        return false;
    }

    @Override // f.l.a.f.c.c
    public void k() {
        if (isRemoving() || isDetached()) {
            return;
        }
        if (!isAdded()) {
            this.f6765m = true;
            return;
        }
        i().c.setOnClickListener(new View.OnClickListener() { // from class: f.l.a.f.c.g.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j jVar = j.this;
                int i2 = j.r;
                i.l.b.i.e(jVar, "this$0");
                jVar.getParentFragmentManager().Y();
            }
        });
        f.l.a.d.e.b bVar = this.f6761i;
        LiveData<List<f.l.a.d.d.e>> w = bVar == null ? null : bVar.w();
        if (w == null) {
            w = new s<>();
        }
        this.f6763k = w;
        m viewLifecycleOwner = getViewLifecycleOwner();
        i.l.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
        f.l.a.d.b.j jVar = new f.l.a.d.b.j(w, viewLifecycleOwner, new b());
        this.f6762j = jVar;
        f.l.a.d.e.b bVar2 = this.f6761i;
        jVar.f6640f = bVar2 == null ? false : bVar2.y();
        jVar.notifyDataSetChanged();
        f.l.a.d.b.j jVar2 = this.f6762j;
        if (jVar2 != null) {
            jVar2.o(this.n);
            RecyclerView recyclerView = i().f6618f;
            f.l.a.d.b.j jVar3 = this.f6762j;
            if (jVar3 != null) {
                recyclerView.setAdapter(jVar3);
                i().f6618f.setVisibility(8);
                i().f6619g.setOnRefreshListener(new SwipeRefreshLayout.h() { // from class: f.l.a.f.c.g.g
                    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.h
                    public final void a() {
                        j jVar4 = j.this;
                        int i2 = j.r;
                        i.l.b.i.e(jVar4, "this$0");
                        jVar4.m().d(true);
                    }
                });
                f.l.a.d.e.b bVar3 = this.f6761i;
                SortMode a2 = bVar3 == null ? null : bVar3.a();
                if (a2 == null) {
                    f.l.a.d.a aVar = f.l.a.d.a.a;
                    a2 = f.l.a.d.a.b;
                }
                this.o = a2;
                f.l.a.d.e.b bVar4 = this.f6761i;
                SortOrder q = bVar4 == null ? null : bVar4.q();
                if (q == null) {
                    f.l.a.d.a aVar2 = f.l.a.d.a.a;
                    q = f.l.a.d.a.c;
                }
                this.p = q;
                LayoutMode layoutMode = this.n;
                i.l.b.i.e(layoutMode, "mode");
                f.l.a.d.g.a.b m2 = m();
                Objects.requireNonNull(m2);
                i.l.b.i.e(layoutMode, "mode");
                m2.f6683k.i(layoutMode);
                SortMode sortMode = this.o;
                i.l.b.i.e(sortMode, "mode");
                f.l.a.d.g.a.b m3 = m();
                Objects.requireNonNull(m3);
                i.l.b.i.e(sortMode, "mode");
                m3.f6684l.i(sortMode);
                SortOrder sortOrder = this.p;
                i.l.b.i.e(sortOrder, "order");
                f.l.a.d.g.a.b m4 = m();
                Objects.requireNonNull(m4);
                i.l.b.i.e(sortOrder, "order");
                m4.f6685m.i(sortOrder);
                m().f6679g.e(getViewLifecycleOwner(), new t() { // from class: f.l.a.f.c.g.h
                    @Override // e.s.t
                    public final void a(Object obj) {
                        j jVar4 = j.this;
                        Boolean bool = (Boolean) obj;
                        int i2 = j.r;
                        i.l.b.i.e(jVar4, "this$0");
                        SwipeRefreshLayout swipeRefreshLayout = jVar4.i().f6619g;
                        i.l.b.i.d(bool, "it");
                        swipeRefreshLayout.setRefreshing(bool.booleanValue());
                        if (bool.booleanValue()) {
                            RecyclerView recyclerView2 = jVar4.i().f6618f;
                            i.l.b.i.d(recyclerView2, "binding.recyclerView");
                            i.l.b.i.e(recyclerView2, "<this>");
                            recyclerView2.setVisibility(8);
                            ProgressBar progressBar = jVar4.i().f6617e;
                            i.l.b.i.d(progressBar, "binding.progressbar");
                            i.l.b.i.e(progressBar, "<this>");
                            progressBar.setVisibility(0);
                            return;
                        }
                        RecyclerView recyclerView3 = jVar4.i().f6618f;
                        i.l.b.i.d(recyclerView3, "binding.recyclerView");
                        i.l.b.i.e(recyclerView3, "<this>");
                        recyclerView3.setVisibility(0);
                        ProgressBar progressBar2 = jVar4.i().f6617e;
                        i.l.b.i.d(progressBar2, "binding.progressbar");
                        i.l.b.i.e(progressBar2, "<this>");
                        progressBar2.setVisibility(8);
                    }
                });
                m().f6681i.e(getViewLifecycleOwner(), new t() { // from class: f.l.a.f.c.g.c
                    @Override // e.s.t
                    public final void a(Object obj) {
                        j jVar4 = j.this;
                        List list = (List) obj;
                        int i2 = j.r;
                        i.l.b.i.e(jVar4, "this$0");
                        f.l.a.d.b.j jVar5 = jVar4.f6762j;
                        if (jVar5 != null) {
                            jVar5.f6642h.clear();
                            if (list != null) {
                                jVar5.f6642h.addAll(list);
                            }
                            jVar5.notifyDataSetChanged();
                            if (list == null || list.isEmpty()) {
                                jVar4.i().f6616d.setText(jVar4.getString(R.string.no_supported_file_found));
                                jVar4.i().f6616d.setVisibility(0);
                                return;
                            }
                            jVar4.i().f6616d.setVisibility(8);
                            return;
                        }
                        i.l.b.i.h("adapter");
                        throw null;
                    }
                });
                m().f6683k.e(getViewLifecycleOwner(), new t() { // from class: f.l.a.f.c.g.a
                    @Override // e.s.t
                    public final void a(Object obj) {
                        j jVar4 = j.this;
                        LayoutMode layoutMode2 = (LayoutMode) obj;
                        int i2 = j.r;
                        i.l.b.i.e(jVar4, "this$0");
                        i.l.b.i.d(layoutMode2, "it");
                        jVar4.n = layoutMode2;
                        f.l.a.d.b.j jVar5 = jVar4.f6762j;
                        if (jVar5 != null) {
                            jVar5.o(layoutMode2);
                            jVar4.o(layoutMode2);
                            return;
                        }
                        i.l.b.i.h("adapter");
                        throw null;
                    }
                });
                m().f6684l.e(getViewLifecycleOwner(), new t() { // from class: f.l.a.f.c.g.i
                    @Override // e.s.t
                    public final void a(Object obj) {
                        j jVar4 = j.this;
                        SortMode sortMode2 = (SortMode) obj;
                        int i2 = j.r;
                        i.l.b.i.e(jVar4, "this$0");
                        i.l.b.i.d(sortMode2, "it");
                        jVar4.o = sortMode2;
                        jVar4.m().d(true);
                    }
                });
                m().f6685m.e(getViewLifecycleOwner(), new t() { // from class: f.l.a.f.c.g.f
                    @Override // e.s.t
                    public final void a(Object obj) {
                        j jVar4 = j.this;
                        SortOrder sortOrder2 = (SortOrder) obj;
                        int i2 = j.r;
                        i.l.b.i.e(jVar4, "this$0");
                        i.l.b.i.d(sortOrder2, "it");
                        jVar4.p = sortOrder2;
                        jVar4.m().d(true);
                    }
                });
                m().n.e(getViewLifecycleOwner(), new t() { // from class: f.l.a.f.c.g.d
                    @Override // e.s.t
                    public final void a(Object obj) {
                        j jVar4 = j.this;
                        MediaType mediaType = (MediaType) obj;
                        int i2 = j.r;
                        i.l.b.i.e(jVar4, "this$0");
                        jVar4.m().d(true);
                    }
                });
                f.l.a.d.g.a.b m5 = m();
                Bundle arguments = getArguments();
                m5.f6682j = arguments == null ? null : arguments.getString("FOLDER_NAME");
                m5.d(false);
                f.l.a.d.g.a.b m6 = m();
                MediaType mediaType = this.f6764l;
                if (mediaType != null) {
                    Objects.requireNonNull(m6);
                    i.l.b.i.e(mediaType, "mediaType");
                    m6.n.i(mediaType);
                    m6.d(true);
                    LiveData<List<f.l.a.d.d.e>> liveData = this.f6763k;
                    if (liveData != null) {
                        liveData.e(getViewLifecycleOwner(), new t() { // from class: f.l.a.f.c.g.e
                            @Override // e.s.t
                            public final void a(Object obj) {
                                int i2;
                                j jVar4 = j.this;
                                List list = (List) obj;
                                int i3 = j.r;
                                i.l.b.i.e(jVar4, "this$0");
                                f.l.a.d.e.b bVar5 = jVar4.f6761i;
                                if (bVar5 == null) {
                                    return;
                                }
                                boolean z = false;
                                if (jVar4.m().f6681i.d() != null) {
                                    List<f.l.a.d.d.e> d2 = jVar4.m().f6681i.d();
                                    Integer num = null;
                                    Integer valueOf = d2 == null ? null : Integer.valueOf(d2.size());
                                    List<f.l.a.d.d.e> d3 = jVar4.m().f6681i.d();
                                    if (d3 != null) {
                                        if (d3.isEmpty()) {
                                            i2 = 0;
                                        } else {
                                            i2 = 0;
                                            for (f.l.a.d.d.e eVar : d3) {
                                                if (eVar.b() && (i2 = i2 + 1) < 0) {
                                                    i.i.b.f();
                                                    throw null;
                                                }
                                            }
                                        }
                                        num = Integer.valueOf(i2);
                                    }
                                    if (i.l.b.i.a(valueOf, num)) {
                                        z = true;
                                    }
                                }
                                bVar5.j(z);
                            }
                        });
                        LayoutMode d2 = m().f6683k.d();
                        i.l.b.i.b(d2);
                        i.l.b.i.d(d2, "viewModel.layoutMode.value!!");
                        o(d2);
                        this.q = true;
                        return;
                    }
                    i.l.b.i.h("selectedFiles");
                    throw null;
                }
                i.l.b.i.h("mediaType");
                throw null;
            }
            i.l.b.i.h("adapter");
            throw null;
        }
        i.l.b.i.h("adapter");
        throw null;
    }

    public final f.l.a.d.g.a.b m() {
        return (f.l.a.d.g.a.b) this.f6760h.getValue();
    }

    public final void o(LayoutMode layoutMode) {
        if (layoutMode == LayoutMode.LIST) {
            i().f6618f.setLayoutManager(new LinearLayoutManager(i().f6618f.getContext()));
            return;
        }
        RecyclerView recyclerView = i().f6618f;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
        gridLayoutManager.M = new c();
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        i.l.b.i.e(context, "context");
        super.onAttach(context);
        try {
            Fragment parentFragment = getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof f.l.a.d.e.b)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (parentFragment != null) {
                this.f6761i = (f.l.a.d.e.b) parentFragment;
            }
        } catch (Exception unused) {
        }
        if (this.f6765m) {
            k();
        }
    }

    @Override // f.l.a.f.c.c, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.l.b.i.e(layoutInflater, "lInflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Bundle arguments = getArguments();
        if ((arguments == null ? null : arguments.getString("FOLDER_NAME")) != null) {
            i().c.p();
        } else {
            i().c.i();
        }
        Bundle arguments2 = getArguments();
        if ((arguments2 == null ? null : arguments2.getString("MEDIA_TYPE")) != null) {
            Bundle arguments3 = getArguments();
            this.f6764l = MediaType.valueOf(String.valueOf(arguments3 == null ? null : arguments3.getString("MEDIA_TYPE")));
        }
        Bundle arguments4 = getArguments();
        if ((arguments4 == null ? null : arguments4.getString("LAYOUT_MODE")) != null) {
            Bundle arguments5 = getArguments();
            this.n = LayoutMode.valueOf(String.valueOf(arguments5 != null ? arguments5.getString("LAYOUT_MODE") : null));
        }
        if (bundle != null) {
            String string = bundle.getString("MEDIA_TYPE", MediaType.VIDEO.name());
            i.l.b.i.d(string, "savedInstanceState.getSt…PE, MediaType.VIDEO.name)");
            this.f6764l = MediaType.valueOf(string);
            f.l.a.d.a aVar = f.l.a.d.a.a;
            String string2 = bundle.getString("LAYOUT_MODE", f.l.a.d.a.f6631d.name());
            i.l.b.i.d(string2, "savedInstanceState.getSt…DEFAULT_LAYOUT_MODE.name)");
            this.n = LayoutMode.valueOf(string2);
            String string3 = bundle.getString("SORT_MODE", f.l.a.d.a.b.name());
            i.l.b.i.d(string3, "savedInstanceState.getSt…s.DEFAULT_SORT_MODE.name)");
            this.o = SortMode.valueOf(string3);
            String string4 = bundle.getString("SORT_ORDER", f.l.a.d.a.c.name());
            i.l.b.i.d(string4, "savedInstanceState.getSt….DEFAULT_SORT_ORDER.name)");
            this.p = SortOrder.valueOf(string4);
        }
        SwipeRefreshLayout swipeRefreshLayout = i().a;
        i.l.b.i.d(swipeRefreshLayout, "binding.root");
        return swipeRefreshLayout;
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void onEvent(LayoutMode layoutMode) {
        i.l.b.i.e(layoutMode, "mode");
        i.l.b.i.e(layoutMode, "mode");
        f.l.a.d.g.a.b m2 = m();
        Objects.requireNonNull(m2);
        i.l.b.i.e(layoutMode, "mode");
        m2.f6683k.i(layoutMode);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        i.l.b.i.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        MediaType mediaType = this.f6764l;
        if (mediaType != null) {
            bundle.putString("MEDIA_TYPE", mediaType.name());
            bundle.putString("LAYOUT_MODE", this.n.name());
            bundle.putString("SORT_MODE", this.o.name());
            bundle.putString("SORT_ORDER", this.p.name());
            return;
        }
        i.l.b.i.h("mediaType");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        m.a.a.c.b().j(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m.a.a.c.b().l(this);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void onEvent(SortMode sortMode) {
        i.l.b.i.e(sortMode, "mode");
        i.l.b.i.e(sortMode, "mode");
        f.l.a.d.g.a.b m2 = m();
        Objects.requireNonNull(m2);
        i.l.b.i.e(sortMode, "mode");
        m2.f6684l.i(sortMode);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void onEvent(SortOrder sortOrder) {
        i.l.b.i.e(sortOrder, "order");
        i.l.b.i.e(sortOrder, "order");
        f.l.a.d.g.a.b m2 = m();
        Objects.requireNonNull(m2);
        i.l.b.i.e(sortOrder, "order");
        m2.f6685m.i(sortOrder);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void onEvent(PermissionStatus permissionStatus) {
        i.l.b.i.e(permissionStatus, "permissionStatus");
        if (permissionStatus == PermissionStatus.GRANTED) {
            m().d(true);
        }
    }
}
