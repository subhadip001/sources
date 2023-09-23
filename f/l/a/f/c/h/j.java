package f.l.a.f.c.h;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
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
import e.p.c.n;
import e.s.e0;
import e.s.i0;
import e.s.j0;
import e.s.m;
import e.s.s;
import e.s.t;
import f.l.a.d.b.j;
import i.l.a.q;
import i.l.b.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import m.a.a.l;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: NCOutputListFragment.kt */
/* loaded from: classes2.dex */
public class j extends f.l.a.f.c.c<f.l.a.c.d> implements f.l.a.d.e.a {
    public static final /* synthetic */ int q = 0;

    /* renamed from: h  reason: collision with root package name */
    public final i.c f6770h;

    /* renamed from: i  reason: collision with root package name */
    public f.l.a.d.e.b f6771i;

    /* renamed from: j  reason: collision with root package name */
    public f.l.a.d.b.j f6772j;

    /* renamed from: k  reason: collision with root package name */
    public LiveData<List<f.l.a.d.d.e>> f6773k;

    /* renamed from: l  reason: collision with root package name */
    public MediaType f6774l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6775m;
    public LayoutMode n;
    public SortMode o;
    public SortOrder p;

    /* compiled from: NCOutputListFragment.kt */
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

    /* compiled from: NCOutputListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements j.a {
        public b() {
        }

        @Override // f.l.a.d.b.j.a
        public boolean a(f.l.a.d.d.e eVar) {
            i.l.b.i.e(eVar, "mediaModel");
            f.l.a.d.e.b bVar = j.this.f6771i;
            if (bVar == null) {
                return false;
            }
            return bVar.x(eVar);
        }

        @Override // f.l.a.d.b.j.a
        public void b(f.l.a.d.d.e eVar) {
            i.l.b.i.e(eVar, "mediaModel");
            if (eVar.b()) {
                f.l.a.d.e.b bVar = j.this.f6771i;
                if (bVar == null) {
                    return;
                }
                bVar.c(eVar);
                return;
            }
            f.l.a.d.e.b bVar2 = j.this.f6771i;
            if (bVar2 == null) {
                return;
            }
            bVar2.z(eVar);
        }
    }

    /* compiled from: NCOutputListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends GridLayoutManager.c {
        public c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int c(int i2) {
            j jVar = j.this;
            int i3 = j.q;
            if (jVar.m().f6695h.d() == LayoutMode.LIST) {
                return 3;
            }
            f.l.a.d.e.b bVar = j.this.f6771i;
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
        public final /* synthetic */ Fragment f6776g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f6776g = fragment;
        }

        @Override // i.l.a.a
        public Fragment c() {
            return this.f6776g;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends i.l.b.j implements i.l.a.a<i0> {

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ i.l.a.a f6777g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i.l.a.a aVar) {
            super(0);
            this.f6777g = aVar;
        }

        @Override // i.l.a.a
        public i0 c() {
            i0 viewModelStore = ((j0) this.f6777g.c()).getViewModelStore();
            i.l.b.i.d(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    /* compiled from: NCOutputListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends i.l.b.j implements i.l.a.a<e0> {
        public f() {
            super(0);
        }

        @Override // i.l.a.a
        public e0 c() {
            Context requireContext = j.this.requireContext();
            i.l.b.i.d(requireContext, "requireContext()");
            return new f.l.a.d.g.b.c(requireContext);
        }
    }

    public j() {
        super(a.n);
        this.f6770h = e.p.a.e(this, o.a(f.l.a.d.g.b.b.class), new e(new d(this)), new f());
        this.f6774l = MediaType.VIDEO;
        f.l.a.d.a aVar = f.l.a.d.a.a;
        this.n = f.l.a.d.a.f6631d;
        this.o = f.l.a.d.a.b;
        this.p = f.l.a.d.a.c;
    }

    @Override // f.l.a.d.e.a
    public void d() {
        f.l.a.d.b.j jVar = this.f6772j;
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
        f.l.a.d.b.j jVar2 = this.f6772j;
        if (jVar2 != null) {
            if (i2 == jVar2.f6642h.size()) {
                f.l.a.d.e.b bVar = this.f6771i;
                if (bVar == null) {
                    return;
                }
                f.l.a.d.b.j jVar3 = this.f6772j;
                if (jVar3 != null) {
                    bVar.n(jVar3.f6642h);
                    return;
                } else {
                    i.l.b.i.h("adapter");
                    throw null;
                }
            }
            f.l.a.d.e.b bVar2 = this.f6771i;
            if (bVar2 == null) {
                return;
            }
            f.l.a.d.b.j jVar4 = this.f6772j;
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
            this.f6775m = true;
            return;
        }
        i().c.setOnClickListener(new View.OnClickListener() { // from class: f.l.a.f.c.h.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j jVar = j.this;
                int i2 = j.q;
                i.l.b.i.e(jVar, "this$0");
                jVar.getParentFragmentManager().Y();
            }
        });
        f.l.a.d.e.b bVar = this.f6771i;
        LiveData<List<f.l.a.d.d.e>> w = bVar == null ? null : bVar.w();
        if (w == null) {
            w = new s<>();
        }
        this.f6773k = w;
        m viewLifecycleOwner = getViewLifecycleOwner();
        i.l.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
        f.l.a.d.b.j jVar = new f.l.a.d.b.j(w, viewLifecycleOwner, new b());
        this.f6772j = jVar;
        f.l.a.d.e.b bVar2 = this.f6771i;
        jVar.f6640f = bVar2 == null ? false : bVar2.y();
        jVar.notifyDataSetChanged();
        f.l.a.d.b.j jVar2 = this.f6772j;
        if (jVar2 != null) {
            jVar2.o(this.n);
            RecyclerView recyclerView = i().f6618f;
            f.l.a.d.b.j jVar3 = this.f6772j;
            if (jVar3 != null) {
                recyclerView.setAdapter(jVar3);
                i().f6618f.setVisibility(8);
                i().f6619g.setOnRefreshListener(new SwipeRefreshLayout.h() { // from class: f.l.a.f.c.h.b
                    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.h
                    public final void a() {
                        j jVar4 = j.this;
                        int i2 = j.q;
                        i.l.b.i.e(jVar4, "this$0");
                        jVar4.m().d(true);
                    }
                });
                f.l.a.d.e.b bVar3 = this.f6771i;
                SortMode a2 = bVar3 == null ? null : bVar3.a();
                if (a2 == null) {
                    f.l.a.d.a aVar = f.l.a.d.a.a;
                    a2 = f.l.a.d.a.b;
                }
                this.o = a2;
                f.l.a.d.e.b bVar4 = this.f6771i;
                SortOrder q2 = bVar4 == null ? null : bVar4.q();
                if (q2 == null) {
                    f.l.a.d.a aVar2 = f.l.a.d.a.a;
                    q2 = f.l.a.d.a.c;
                }
                this.p = q2;
                LayoutMode layoutMode = this.n;
                i.l.b.i.e(layoutMode, "mode");
                f.l.a.d.g.b.b m2 = m();
                Objects.requireNonNull(m2);
                i.l.b.i.e(layoutMode, "mode");
                m2.f6695h.i(layoutMode);
                SortMode sortMode = this.o;
                i.l.b.i.e(sortMode, "mode");
                f.l.a.d.g.b.b m3 = m();
                Objects.requireNonNull(m3);
                i.l.b.i.e(sortMode, "mode");
                m3.f6696i.i(sortMode);
                SortOrder sortOrder = this.p;
                i.l.b.i.e(sortOrder, "order");
                f.l.a.d.g.b.b m4 = m();
                Objects.requireNonNull(m4);
                i.l.b.i.e(sortOrder, "order");
                m4.f6697j.i(sortOrder);
                m().f6692e.e(getViewLifecycleOwner(), new t() { // from class: f.l.a.f.c.h.d
                    @Override // e.s.t
                    public final void a(Object obj) {
                        j jVar4 = j.this;
                        Boolean bool = (Boolean) obj;
                        int i2 = j.q;
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
                m().f6694g.e(getViewLifecycleOwner(), new t() { // from class: f.l.a.f.c.h.a
                    @Override // e.s.t
                    public final void a(Object obj) {
                        j jVar4 = j.this;
                        List list = (List) obj;
                        int i2 = j.q;
                        i.l.b.i.e(jVar4, "this$0");
                        f.l.a.d.b.j jVar5 = jVar4.f6772j;
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
                m().f6695h.e(getViewLifecycleOwner(), new t() { // from class: f.l.a.f.c.h.c
                    @Override // e.s.t
                    public final void a(Object obj) {
                        j jVar4 = j.this;
                        LayoutMode layoutMode2 = (LayoutMode) obj;
                        int i2 = j.q;
                        i.l.b.i.e(jVar4, "this$0");
                        i.l.b.i.d(layoutMode2, "it");
                        jVar4.n = layoutMode2;
                        f.l.a.d.b.j jVar5 = jVar4.f6772j;
                        if (jVar5 != null) {
                            jVar5.o(layoutMode2);
                            jVar4.p(layoutMode2);
                            return;
                        }
                        i.l.b.i.h("adapter");
                        throw null;
                    }
                });
                m().f6696i.e(getViewLifecycleOwner(), new t() { // from class: f.l.a.f.c.h.e
                    @Override // e.s.t
                    public final void a(Object obj) {
                        j jVar4 = j.this;
                        SortMode sortMode2 = (SortMode) obj;
                        int i2 = j.q;
                        i.l.b.i.e(jVar4, "this$0");
                        i.l.b.i.d(sortMode2, "it");
                        jVar4.o = sortMode2;
                        jVar4.m().d(true);
                    }
                });
                m().f6697j.e(getViewLifecycleOwner(), new t() { // from class: f.l.a.f.c.h.h
                    @Override // e.s.t
                    public final void a(Object obj) {
                        j jVar4 = j.this;
                        SortOrder sortOrder2 = (SortOrder) obj;
                        int i2 = j.q;
                        i.l.b.i.e(jVar4, "this$0");
                        i.l.b.i.d(sortOrder2, "it");
                        jVar4.p = sortOrder2;
                        jVar4.m().d(true);
                    }
                });
                m().f6698k.e(getViewLifecycleOwner(), new t() { // from class: f.l.a.f.c.h.f
                    @Override // e.s.t
                    public final void a(Object obj) {
                        j jVar4 = j.this;
                        MediaType mediaType = (MediaType) obj;
                        int i2 = j.q;
                        i.l.b.i.e(jVar4, "this$0");
                        jVar4.m().d(true);
                    }
                });
                f.l.a.d.g.b.b m5 = m();
                Bundle arguments = getArguments();
                if (arguments != null) {
                    arguments.getString("FOLDER_NAME");
                }
                m5.d(false);
                Bundle arguments2 = getArguments();
                Serializable serializable = arguments2 == null ? null : arguments2.getSerializable("extra.options");
                Collection<? extends f.l.a.d.d.f> collection = serializable instanceof ArrayList ? (ArrayList) serializable : null;
                if (collection == null) {
                    collection = i.i.d.f8613f;
                }
                f.l.a.d.g.b.b m6 = m();
                MediaType mediaType = this.f6774l;
                Objects.requireNonNull(m6);
                i.l.b.i.e(collection, "outUris");
                i.l.b.i.e(mediaType, "mediaType");
                m6.f6699l.clear();
                m6.f6699l.addAll(collection);
                m6.f6698k.i(mediaType);
                m6.d(true);
                LiveData<List<f.l.a.d.d.e>> liveData = this.f6773k;
                if (liveData != null) {
                    liveData.e(getViewLifecycleOwner(), new t() { // from class: f.l.a.f.c.h.g
                        @Override // e.s.t
                        public final void a(Object obj) {
                            int i2;
                            j jVar4 = j.this;
                            List list = (List) obj;
                            int i3 = j.q;
                            i.l.b.i.e(jVar4, "this$0");
                            f.l.a.d.e.b bVar5 = jVar4.f6771i;
                            if (bVar5 == null) {
                                return;
                            }
                            boolean z = false;
                            if (jVar4.m().f6694g.d() != null) {
                                List<f.l.a.d.d.e> d2 = jVar4.m().f6694g.d();
                                Integer num = null;
                                Integer valueOf = d2 == null ? null : Integer.valueOf(d2.size());
                                List<f.l.a.d.d.e> d3 = jVar4.m().f6694g.d();
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
                    LayoutMode d2 = m().f6695h.d();
                    i.l.b.i.b(d2);
                    i.l.b.i.d(d2, "viewModel.layoutMode.value!!");
                    p(d2);
                    return;
                }
                i.l.b.i.h("selectedFiles");
                throw null;
            }
            i.l.b.i.h("adapter");
            throw null;
        }
        i.l.b.i.h("adapter");
        throw null;
    }

    public final f.l.a.d.g.b.b m() {
        return (f.l.a.d.g.b.b) this.f6770h.getValue();
    }

    public final void o() {
        f.l.a.d.b.j jVar = this.f6772j;
        if (jVar != null) {
            jVar.f6638d = true;
            Log.d("IsSetterCalled", ": ");
            jVar.notifyDataSetChanged();
            return;
        }
        i.l.b.i.h("adapter");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        i.l.b.i.e(context, "context");
        super.onAttach(context);
        if (getParentFragment() instanceof f.l.a.d.e.b) {
            Fragment parentFragment = getParentFragment();
            Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.nightcode.mediapicker.domain.interfaces.MediaPickerInterface");
            this.f6771i = (f.l.a.d.e.b) parentFragment;
        }
        if (getActivity() instanceof f.l.a.d.e.b) {
            n activity = getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.nightcode.mediapicker.domain.interfaces.MediaPickerInterface");
            this.f6771i = (f.l.a.d.e.b) activity;
        }
        if (this.f6775m) {
            k();
        }
        Log.d("MediaListFragment", i.l.b.i.g("onAttach: ", Boolean.valueOf(this.f6771i == null)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
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
            this.f6774l = MediaType.valueOf(String.valueOf(arguments3 == null ? null : arguments3.getString("MEDIA_TYPE")));
        }
        Bundle arguments4 = getArguments();
        if ((arguments4 == null ? null : arguments4.getString("LAYOUT_MODE")) != null) {
            Bundle arguments5 = getArguments();
            this.n = LayoutMode.valueOf(String.valueOf(arguments5 != null ? arguments5.getString("LAYOUT_MODE") : null));
        }
        if (bundle != null) {
            String string = bundle.getString("MEDIA_TYPE", MediaType.VIDEO.name());
            i.l.b.i.d(string, "savedInstanceState.getSt…PE, MediaType.VIDEO.name)");
            this.f6774l = MediaType.valueOf(string);
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
        f.l.a.d.g.b.b m2 = m();
        Objects.requireNonNull(m2);
        i.l.b.i.e(layoutMode, "mode");
        m2.f6695h.i(layoutMode);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        i.l.b.i.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putString("MEDIA_TYPE", this.f6774l.name());
        bundle.putString("LAYOUT_MODE", this.n.name());
        bundle.putString("SORT_MODE", this.o.name());
        bundle.putString("SORT_ORDER", this.p.name());
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

    public final void p(LayoutMode layoutMode) {
        if (layoutMode == LayoutMode.LIST) {
            i().f6618f.setLayoutManager(new LinearLayoutManager(i().f6618f.getContext()));
            return;
        }
        RecyclerView recyclerView = i().f6618f;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
        gridLayoutManager.M = new c();
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void onEvent(SortMode sortMode) {
        i.l.b.i.e(sortMode, "mode");
        i.l.b.i.e(sortMode, "mode");
        f.l.a.d.g.b.b m2 = m();
        Objects.requireNonNull(m2);
        i.l.b.i.e(sortMode, "mode");
        m2.f6696i.i(sortMode);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void onEvent(SortOrder sortOrder) {
        i.l.b.i.e(sortOrder, "order");
        i.l.b.i.e(sortOrder, "order");
        f.l.a.d.g.b.b m2 = m();
        Objects.requireNonNull(m2);
        i.l.b.i.e(sortOrder, "order");
        m2.f6697j.i(sortOrder);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void onEvent(PermissionStatus permissionStatus) {
        i.l.b.i.e(permissionStatus, "permissionStatus");
        if (permissionStatus == PermissionStatus.GRANTED) {
            m().d(true);
        }
    }
}
