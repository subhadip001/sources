package com.nightcode.mediapicker.presentation.activity;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import com.nightcode.mediapicker.domain.constants.LayoutMode;
import com.nightcode.mediapicker.domain.constants.MediaType;
import com.nightcode.mediapicker.domain.constants.SortMode;
import com.nightcode.mediapicker.domain.constants.SortOrder;
import com.nightcode.mediapicker.presentation.activity.MediaFilePickerActivity;
import com.nightcode.mediapicker.presentation.fragments.FragmentTag;
import com.nightcode.mediapicker.presentation.views.ClippedImageView;
import com.video_converter.video_compressor.R;
import e.s.c0;
import e.s.e0;
import e.s.i0;
import e.s.t;
import e.s.z;
import f.l.a.c.k;
import f.l.a.d.c.a;
import i.l.a.l;
import i.l.a.q;
import i.l.b.i;
import i.l.b.j;
import i.l.b.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: MediaFilePickerActivity.kt */
/* loaded from: classes2.dex */
public class MediaFilePickerActivity extends f.l.a.f.b.h<f.l.a.c.a> implements f.l.a.d.e.b {
    public static final /* synthetic */ int J = 0;
    public LayoutMode A;
    public SortMode B;
    public SortOrder C;
    public MediaType D;
    public final b E;
    public f.l.a.f.c.f.c F;
    public e.a.e.b<String[]> G;
    public e.a.e.b<String[]> H;
    public Menu I;
    public final i.c v;
    public final i.c w;
    public final i.c x;
    public final i.c y;
    public MenuItem z;

    /* compiled from: MediaFilePickerActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends i.l.b.h implements l<LayoutInflater, f.l.a.c.a> {
        public static final a n = new a();

        public a() {
            super(1, f.l.a.c.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/nightcode/mediapicker/databinding/NcActivityFilePickerBinding;", 0);
        }

        @Override // i.l.a.l
        public f.l.a.c.a b(LayoutInflater layoutInflater) {
            LayoutInflater layoutInflater2 = layoutInflater;
            i.e(layoutInflater2, "p0");
            View inflate = layoutInflater2.inflate(R.layout.nc_activity_file_picker, (ViewGroup) null, false);
            int i2 = R.id.ad_holder_container;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ad_holder_container);
            if (linearLayout != null) {
                i2 = R.id.ad_holder_container_top;
                LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.ad_holder_container_top);
                if (linearLayout2 != null) {
                    i2 = R.id.clearBtn;
                    ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.clearBtn);
                    if (imageButton != null) {
                        i2 = R.id.count;
                        TextView textView = (TextView) inflate.findViewById(R.id.count);
                        if (textView != null) {
                            i2 = R.id.fragmentContainer;
                            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.fragmentContainer);
                            if (frameLayout != null) {
                                i2 = R.id.nextBtn;
                                MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.nextBtn);
                                if (materialButton != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                    i2 = R.id.searchViewContainer;
                                    FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(R.id.searchViewContainer);
                                    if (frameLayout2 != null) {
                                        i2 = R.id.selectedFilesList;
                                        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.selectedFilesList);
                                        if (recyclerView != null) {
                                            i2 = R.id.selectionController;
                                            MaterialCardView materialCardView = (MaterialCardView) inflate.findViewById(R.id.selectionController);
                                            if (materialCardView != null) {
                                                i2 = R.id.toolbar;
                                                Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
                                                if (toolbar != null) {
                                                    return new f.l.a.c.a(constraintLayout, linearLayout, linearLayout2, imageButton, textView, frameLayout, materialButton, constraintLayout, frameLayout2, recyclerView, materialCardView, toolbar);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        }
    }

    /* compiled from: MediaFilePickerActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends f.l.a.d.b.f<f.l.a.d.d.e, k> {
        public b(c cVar) {
            super(cVar);
        }

        @Override // f.l.a.d.b.f
        public void n(k kVar, f.l.a.d.d.e eVar) {
            Context context;
            k kVar2 = kVar;
            final f.l.a.d.d.e eVar2 = eVar;
            i.e(kVar2, "binding");
            i.e(eVar2, "item");
            try {
                context = kVar2.a.getContext();
            } catch (Exception unused) {
            }
            if (context != null) {
                Activity activity = (Activity) context;
                if (activity.isFinishing()) {
                    return;
                }
                if (activity.isDestroyed()) {
                    return;
                }
                try {
                    if (eVar2 instanceof f.l.a.d.d.g) {
                        f.e.a.b.e(kVar2.c).c(Uri.parse(eVar2.e())).e().i(R.drawable.video_placeholder).y(kVar2.c);
                    } else if (eVar2 instanceof f.l.a.d.d.a) {
                        f.e.a.b.e(kVar2.c).c(Uri.parse(eVar2.e())).e().i(R.drawable.video_placeholder).y(kVar2.c);
                    } else {
                        f.e.a.b.e(kVar2.c).c(Uri.parse(eVar2.e())).e().i(R.drawable.video_placeholder).y(kVar2.c);
                    }
                } catch (Exception unused2) {
                }
                ImageButton imageButton = kVar2.b;
                final MediaFilePickerActivity mediaFilePickerActivity = MediaFilePickerActivity.this;
                imageButton.setOnClickListener(new View.OnClickListener() { // from class: f.l.a.f.b.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MediaFilePickerActivity mediaFilePickerActivity2 = MediaFilePickerActivity.this;
                        f.l.a.d.d.e eVar3 = eVar2;
                        i.e(mediaFilePickerActivity2, "this$0");
                        i.e(eVar3, "$item");
                        mediaFilePickerActivity2.c(eVar3);
                    }
                });
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* compiled from: MediaFilePickerActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends i.l.b.h implements q<LayoutInflater, ViewGroup, Boolean, k> {
        public static final c n = new c();

        public c() {
            super(3, k.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/nightcode/mediapicker/databinding/NcItemSelectedFilesThumbBinding;", 0);
        }

        @Override // i.l.a.q
        public k f(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater layoutInflater2 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean booleanValue = bool.booleanValue();
            i.e(layoutInflater2, "p0");
            View inflate = layoutInflater2.inflate(R.layout.nc_item_selected_files_thumb, viewGroup2, false);
            if (booleanValue) {
                viewGroup2.addView(inflate);
            }
            int i2 = R.id.remove;
            ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.remove);
            if (imageButton != null) {
                i2 = R.id.thumb;
                ClippedImageView clippedImageView = (ClippedImageView) inflate.findViewById(R.id.thumb);
                if (clippedImageView != null) {
                    return new k((ConstraintLayout) inflate, imageButton, clippedImageView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        }
    }

    /* compiled from: MediaFilePickerActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends j implements i.l.a.a<f.l.a.d.f.a.a> {
        public d() {
            super(0);
        }

        @Override // i.l.a.a
        public f.l.a.d.f.a.a c() {
            return new f.l.a.d.f.a.a(new f.l.a.e.a.a(MediaFilePickerActivity.this));
        }
    }

    /* compiled from: MediaFilePickerActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends j implements i.l.a.a<f.l.a.d.f.d.a> {
        public e() {
            super(0);
        }

        @Override // i.l.a.a
        public f.l.a.d.f.d.a c() {
            return new f.l.a.d.f.d.a(new f.l.a.e.a.a(MediaFilePickerActivity.this));
        }
    }

    /* compiled from: MediaFilePickerActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends j implements i.l.a.a<f.l.a.d.f.e.a> {
        public f() {
            super(0);
        }

        @Override // i.l.a.a
        public f.l.a.d.f.e.a c() {
            return new f.l.a.d.f.e.a(new f.l.a.e.a.a(MediaFilePickerActivity.this));
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class g extends j implements i.l.a.a<e0> {

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f1327g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f1327g = componentActivity;
        }

        @Override // i.l.a.a
        public e0 c() {
            ComponentActivity componentActivity = this.f1327g;
            if (componentActivity.getApplication() != null) {
                if (componentActivity.f43j == null) {
                    componentActivity.f43j = new z(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
                }
                return componentActivity.f43j;
            }
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class h extends j implements i.l.a.a<i0> {

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f1328g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f1328g = componentActivity;
        }

        @Override // i.l.a.a
        public i0 c() {
            i0 viewModelStore = this.f1328g.getViewModelStore();
            i.d(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    public MediaFilePickerActivity() {
        super(a.n);
        this.v = f.n.a.n.i.E(new d());
        this.w = f.n.a.n.i.E(new e());
        this.x = f.n.a.n.i.E(new f());
        this.y = new c0(o.a(f.l.a.d.g.c.a.class), new h(this), new g(this));
        f.l.a.d.a aVar = f.l.a.d.a.a;
        this.A = f.l.a.d.a.f6631d;
        this.B = f.l.a.d.a.b;
        this.C = f.l.a.d.a.c;
        this.D = MediaType.VIDEO;
        this.E = new b(c.n);
    }

    @Override // f.l.a.d.e.b
    public void A() {
        Log.d("FilePickerActivity", "launchDefaultPicker: ");
        try {
            if (u()) {
                e.a.e.b<String[]> bVar = this.H;
                if (bVar != null) {
                    bVar.a(new String[]{"*/*"}, null);
                    return;
                } else {
                    i.h("getMultipleContent");
                    throw null;
                }
            }
            e.a.e.b<String[]> bVar2 = this.G;
            if (bVar2 != null) {
                bVar2.a(new String[]{"*/*"}, null);
            } else {
                i.h("getContent");
                throw null;
            }
        } catch (Exception unused) {
            Toast.makeText(this, "No File Manager", 0).show();
        }
    }

    @Override // f.l.a.d.e.b
    public void B(List<? extends f.l.a.d.d.e> list) {
        i.e(list, "list");
        f.l.a.d.g.c.a S = S();
        Objects.requireNonNull(S);
        i.e(list, "list");
        if (S.c.d() == null) {
            S.c.k(new ArrayList());
        }
        List<f.l.a.d.d.e> d2 = S.c.d();
        i.b(d2);
        i.d(d2, "_selectedFiles.value!!");
        List j2 = i.i.b.j(d2);
        ((ArrayList) j2).addAll(list);
        S.c.i(i.i.b.a(j2));
    }

    @Override // f.l.a.f.b.h
    public void Q(Bundle bundle) {
        if (bundle != null) {
            Fragment I = H().I(FragmentTag.MEDIA_PICKER_FRAGMENT_TAG.name());
            Objects.requireNonNull(I, "null cannot be cast to non-null type com.nightcode.mediapicker.presentation.fragments.mediPicker.MediaPickerFragment");
            this.F = (f.l.a.f.c.f.c) I;
            f.l.a.d.a aVar = f.l.a.d.a.a;
            String string = bundle.getString("SORT_MODE", f.l.a.d.a.b.name());
            i.d(string, "savedInstanceState.getSt…DE.name\n                )");
            this.B = SortMode.valueOf(string);
            String string2 = bundle.getString("SORT_ORDER", f.l.a.d.a.c.name());
            i.d(string2, "savedInstanceState.getSt…ER.name\n                )");
            this.C = SortOrder.valueOf(string2);
            String string3 = bundle.getString("LAYOUT_MODE", f.l.a.d.a.f6631d.name());
            i.d(string3, "savedInstanceState.getSt…DE.name\n                )");
            this.A = LayoutMode.valueOf(string3);
            String string4 = bundle.getString("MEDIA_TYPE", MediaType.VIDEO.name());
            i.d(string4, "savedInstanceState.getSt…EO.name\n                )");
            this.D = MediaType.valueOf(string4);
        } else {
            this.F = new f.l.a.f.c.f.c();
        }
        e.p.c.a aVar2 = new e.p.c.a(H());
        int id = P().f6610f.getId();
        f.l.a.f.c.f.c cVar = this.F;
        i.b(cVar);
        aVar2.h(id, cVar, FragmentTag.MEDIA_PICKER_FRAGMENT_TAG.name());
        aVar2.e();
        L().A(P().f6615k);
        e.b.c.a M = M();
        if (M != null) {
            M.m(true);
        }
        P().f6615k.setNavigationOnClickListener(new View.OnClickListener() { // from class: f.l.a.f.b.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaFilePickerActivity mediaFilePickerActivity = MediaFilePickerActivity.this;
                int i2 = MediaFilePickerActivity.J;
                i.e(mediaFilePickerActivity, "this$0");
                mediaFilePickerActivity.onBackPressed();
            }
        });
        P().f6613i.setAdapter(this.E);
        w().e(this, new t() { // from class: f.l.a.f.b.d
            @Override // e.s.t
            public final void a(Object obj) {
                MediaFilePickerActivity mediaFilePickerActivity = MediaFilePickerActivity.this;
                List list = (List) obj;
                int i2 = MediaFilePickerActivity.J;
                i.e(mediaFilePickerActivity, "this$0");
                MaterialCardView materialCardView = mediaFilePickerActivity.P().f6614j;
                i.d(list, "it");
                materialCardView.setVisibility(list.isEmpty() ^ true ? 0 : 8);
                mediaFilePickerActivity.P().f6609e.setText(String.valueOf(list.size()));
                MediaFilePickerActivity.b bVar = mediaFilePickerActivity.E;
                bVar.c.clear();
                bVar.c.addAll(list);
                bVar.notifyDataSetChanged();
                if (mediaFilePickerActivity.E.getItemCount() > 0) {
                    RecyclerView recyclerView = mediaFilePickerActivity.P().f6613i;
                    int itemCount = mediaFilePickerActivity.E.getItemCount() - 1;
                    recyclerView.q0(itemCount >= 0 ? itemCount : 0);
                }
            }
        });
        P().f6608d.setOnClickListener(new View.OnClickListener() { // from class: f.l.a.f.b.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaFilePickerActivity mediaFilePickerActivity = MediaFilePickerActivity.this;
                int i2 = MediaFilePickerActivity.J;
                i.e(mediaFilePickerActivity, "this$0");
                mediaFilePickerActivity.R();
            }
        });
        P().f6611g.setOnClickListener(new View.OnClickListener() { // from class: f.l.a.f.b.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaFilePickerActivity mediaFilePickerActivity = MediaFilePickerActivity.this;
                int i2 = MediaFilePickerActivity.J;
                i.e(mediaFilePickerActivity, "this$0");
                mediaFilePickerActivity.U(mediaFilePickerActivity.w().d());
            }
        });
        e.a.e.b<String[]> G = G(new e.a.e.d.b(), new e.a.e.a() { // from class: f.l.a.f.b.c
            @Override // e.a.e.a
            public final void a(Object obj) {
                MediaFilePickerActivity mediaFilePickerActivity = MediaFilePickerActivity.this;
                Uri uri = (Uri) obj;
                int i2 = MediaFilePickerActivity.J;
                i.e(mediaFilePickerActivity, "this$0");
                if (mediaFilePickerActivity.V(uri)) {
                    return;
                }
                i.d(uri, "it");
                mediaFilePickerActivity.T(uri);
            }
        });
        i.d(G, "registerForActivityResul…Result(it)\n            })");
        i.e(G, "<set-?>");
        this.G = G;
        e.a.e.b<String[]> G2 = G(new e.a.e.d.c(), new e.a.e.a() { // from class: f.l.a.f.b.g
            @Override // e.a.e.a
            public final void a(Object obj) {
                MediaFilePickerActivity mediaFilePickerActivity = MediaFilePickerActivity.this;
                List<? extends Uri> list = (List) obj;
                int i2 = MediaFilePickerActivity.J;
                i.e(mediaFilePickerActivity, "this$0");
                Log.d("FilePickerActivity", "initContentGetters: ");
                if (mediaFilePickerActivity.W(list)) {
                    return;
                }
                i.d(list, "it");
                for (Uri uri : list) {
                    mediaFilePickerActivity.T(uri);
                }
            }
        });
        i.d(G2, "registerForActivityResul…Result(it)\n            })");
        i.e(G2, "<set-?>");
        this.H = G2;
    }

    public final void R() {
        f.l.a.d.g.c.a S = S();
        if (S.c.d() == null) {
            S.c.k(new ArrayList());
        }
        S.c.i(new ArrayList());
    }

    public final f.l.a.d.g.c.a S() {
        return (f.l.a.d.g.c.a) this.y.getValue();
    }

    public final void T(Uri uri) {
        Object c0157a;
        int ordinal = this.D.ordinal();
        if (ordinal == 0) {
            f.l.a.d.c.a<f.l.a.d.d.a> a2 = ((f.l.a.d.f.a.a) this.v.getValue()).a(uri);
            if (a2 instanceof a.b) {
                z((f.l.a.d.d.e) ((a.b) a2).a);
            } else if (a2 instanceof a.C0157a) {
                String uri2 = uri.toString();
                i.d(uri2, "uri.toString()");
                z(new f.l.a.d.d.a("Unknown", uri2, 0L, "", 0L));
                Throwable th = ((a.C0157a) a2).a;
                if (th != null) {
                    th.printStackTrace();
                }
                Toast.makeText(this, getString(R.string.error_getting_media_details), 0).show();
            }
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            f.l.a.d.c.a<f.l.a.d.d.g> a3 = ((f.l.a.d.f.e.a) this.x.getValue()).a(uri);
            if (a3 instanceof a.b) {
                z((f.l.a.d.d.e) ((a.b) a3).a);
            } else if (a3 instanceof a.C0157a) {
                String uri3 = uri.toString();
                i.d(uri3, "uri.toString()");
                z(new f.l.a.d.d.g("Unknown", uri3, 0L, "", "-1", "-1", -1L));
                Throwable th2 = ((a.C0157a) a3).a;
                if (th2 != null) {
                    th2.printStackTrace();
                }
                Toast.makeText(this, getString(R.string.error_getting_media_details), 0).show();
            }
        } else {
            f.l.a.d.f.d.a aVar = (f.l.a.d.f.d.a) this.w.getValue();
            Objects.requireNonNull(aVar);
            i.e(uri, CrashlyticsAnalyticsListener.EVENT_PARAMS_KEY);
            try {
                c0157a = new a.b(aVar.a.d(uri));
            } catch (Exception e2) {
                c0157a = new a.C0157a(e2, e2.getMessage());
            }
            if (c0157a instanceof a.b) {
                z((f.l.a.d.d.e) ((a.b) c0157a).a);
            } else if (c0157a instanceof a.C0157a) {
                String uri4 = uri.toString();
                i.d(uri4, "uri.toString()");
                z(new f.l.a.d.d.d("Unknown", uri4, 0L, "", "-1", "-1"));
                Throwable th3 = ((a.C0157a) c0157a).a;
                if (th3 != null) {
                    th3.printStackTrace();
                }
                Toast.makeText(this, getString(R.string.error_getting_media_details), 0).show();
            }
        }
    }

    public void U(List<? extends f.l.a.d.d.e> list) {
    }

    public boolean V(Uri uri) {
        return false;
    }

    public boolean W(List<? extends Uri> list) {
        return false;
    }

    @Override // f.l.a.d.e.b
    public SortMode a() {
        return this.B;
    }

    @Override // f.l.a.d.e.b
    public void c(f.l.a.d.d.e eVar) {
        i.e(eVar, "mediaModel");
        f.l.a.d.g.c.a S = S();
        Objects.requireNonNull(S);
        i.e(eVar, "mediaModel");
        if (S.c.d() == null) {
            S.c.k(new ArrayList());
        }
        List<f.l.a.d.d.e> d2 = S.c.d();
        i.b(d2);
        i.d(d2, "_selectedFiles.value!!");
        List<f.l.a.d.d.e> j2 = i.i.b.j(d2);
        ((ArrayList) j2).remove(eVar);
        S.c.i(j2);
    }

    @Override // f.l.a.d.e.b
    public MediaType g() {
        return this.D;
    }

    @Override // f.l.a.d.e.b
    public void j(boolean z) {
    }

    @Override // f.l.a.d.e.b
    public void n(List<? extends f.l.a.d.d.e> list) {
        i.e(list, "list");
        f.l.a.d.g.c.a S = S();
        Objects.requireNonNull(S);
        i.e(list, "list");
        if (S.c.d() == null) {
            S.c.k(new ArrayList());
        }
        List<f.l.a.d.d.e> d2 = S.c.d();
        i.b(d2);
        i.d(d2, "selectedFiles.value!!");
        List<f.l.a.d.d.e> j2 = i.i.b.j(d2);
        ((ArrayList) j2).removeAll(list);
        S.c.i(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r0 != true) goto L3;
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBackPressed() {
        /*
            r4 = this;
            f.l.a.f.c.f.c r0 = r4.F
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
        L6:
            r1 = 0
            goto L4f
        L8:
            e.d0.a r3 = r0.i()
            f.l.a.c.e r3 = (f.l.a.c.e) r3
            androidx.viewpager2.widget.ViewPager2 r3 = r3.f6620d
            int r3 = r3.getCurrentItem()
            if (r3 != r1) goto L31
            f.l.a.d.e.a r3 = r0.m()
            if (r3 != 0) goto L1e
            r3 = 0
            goto L22
        L1e:
            boolean r3 = r3.e()
        L22:
            if (r3 == 0) goto L25
            goto L4a
        L25:
            e.d0.a r0 = r0.i()
            f.l.a.c.e r0 = (f.l.a.c.e) r0
            androidx.viewpager2.widget.ViewPager2 r0 = r0.f6620d
            r0.setCurrentItem(r2)
            goto L4a
        L31:
            e.d0.a r3 = r0.i()
            f.l.a.c.e r3 = (f.l.a.c.e) r3
            androidx.viewpager2.widget.ViewPager2 r3 = r3.f6620d
            int r3 = r3.getCurrentItem()
            if (r3 <= 0) goto L4c
            e.d0.a r0 = r0.i()
            f.l.a.c.e r0 = (f.l.a.c.e) r0
            androidx.viewpager2.widget.ViewPager2 r0 = r0.f6620d
            r0.setCurrentItem(r2)
        L4a:
            r0 = 1
            goto L4d
        L4c:
            r0 = 0
        L4d:
            if (r0 != r1) goto L6
        L4f:
            if (r1 == 0) goto L52
            return
        L52:
            androidx.activity.OnBackPressedDispatcher r0 = r4.f44k
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nightcode.mediapicker.presentation.activity.MediaFilePickerActivity.onBackPressed():void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem findItem;
        getMenuInflater().inflate(R.menu.nc_file_picker_menu, menu);
        this.I = menu;
        Log.d("FilePickerActivity", i.g("onCreateOptionsMenu: ", this.A));
        if (this.A == LayoutMode.GRID) {
            MenuItem findItem2 = menu == null ? null : menu.findItem(R.id.action_toggle_mode);
            if (findItem2 != null) {
                findItem2.setIcon(e.i.c.a.getDrawable(this, R.drawable.ic_list_mode));
            }
        } else {
            MenuItem findItem3 = menu == null ? null : menu.findItem(R.id.action_toggle_mode);
            if (findItem3 != null) {
                findItem3.setIcon(e.i.c.a.getDrawable(this, R.drawable.ic_grid_mode));
            }
        }
        if (this.C == SortOrder.ASC) {
            MenuItem findItem4 = menu == null ? null : menu.findItem(R.id.action_sort_order);
            if (findItem4 != null) {
                findItem4.setIcon(e.i.c.a.getDrawable(this, R.drawable.ic_baseline_arrow_drop_up_24));
            }
        } else {
            MenuItem findItem5 = menu == null ? null : menu.findItem(R.id.action_sort_order);
            if (findItem5 != null) {
                findItem5.setIcon(e.i.c.a.getDrawable(this, R.drawable.ic_baseline_arrow_drop_down_24));
            }
        }
        int ordinal = this.B.ordinal();
        if (ordinal == 0) {
            findItem = menu != null ? menu.findItem(R.id.sort_option_title) : null;
            this.z = findItem;
            if (findItem != null) {
                findItem.setChecked(true);
            }
        } else if (ordinal == 1) {
            findItem = menu != null ? menu.findItem(R.id.sort_option_size) : null;
            this.z = findItem;
            if (findItem != null) {
                findItem.setChecked(true);
            }
        } else if (ordinal == 2) {
            findItem = menu != null ? menu.findItem(R.id.sort_option_date_modified) : null;
            this.z = findItem;
            if (findItem != null) {
                findItem.setChecked(true);
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        i.e(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_toggle_mode) {
            LayoutMode layoutMode = this.A;
            LayoutMode layoutMode2 = LayoutMode.LIST;
            if (layoutMode == layoutMode2) {
                LayoutMode layoutMode3 = LayoutMode.GRID;
                this.A = layoutMode3;
                m.a.a.c.b().f(layoutMode3);
                menuItem.setIcon(e.i.c.a.getDrawable(this, R.drawable.ic_list_mode));
            } else {
                this.A = layoutMode2;
                m.a.a.c.b().f(layoutMode2);
                menuItem.setIcon(e.i.c.a.getDrawable(this, R.drawable.ic_grid_mode));
            }
        } else if (itemId == R.id.action_search) {
            e.p.c.a aVar = new e.p.c.a(H());
            aVar.b = R.anim.slide_up_low;
            aVar.c = R.anim.slide_down_low;
            aVar.f2691d = R.anim.slide_up_low;
            aVar.f2692e = R.anim.slide_down_low;
            aVar.h(P().f6612h.getId(), new f.l.a.f.c.i.c(), FragmentTag.SEARCH_FRAGMENT_TAG.name());
            i.d(aVar, "supportFragmentManager\n …ame\n                    )");
            aVar.c(FragmentTag.MEDIA_PICKER_FRAGMENTS.name());
            aVar.e();
        } else if (itemId != R.id.action_sort_mode) {
            if (itemId == R.id.action_sort_order) {
                SortOrder sortOrder = this.C;
                SortOrder sortOrder2 = SortOrder.DESC;
                if (sortOrder == sortOrder2) {
                    sortOrder2 = SortOrder.ASC;
                }
                this.C = sortOrder2;
                m.a.a.c.b().f(this.C);
                menuItem.setIcon(e.i.c.a.getDrawable(this, this.C == SortOrder.ASC ? R.drawable.ic_baseline_arrow_drop_up_24 : R.drawable.ic_baseline_arrow_drop_down_24));
            } else if (itemId == R.id.sort_option_title) {
                MenuItem menuItem2 = this.z;
                if (menuItem2 != null) {
                    menuItem2.setChecked(false);
                }
                this.z = menuItem;
                menuItem.setChecked(true);
                SortMode sortMode = SortMode.BY_TITLE;
                this.B = sortMode;
                m.a.a.c.b().f(sortMode);
            } else if (itemId == R.id.sort_option_size) {
                MenuItem menuItem3 = this.z;
                if (menuItem3 != null) {
                    menuItem3.setChecked(false);
                }
                this.z = menuItem;
                menuItem.setChecked(true);
                SortMode sortMode2 = SortMode.BY_SIZE;
                this.B = sortMode2;
                m.a.a.c.b().f(sortMode2);
            } else if (itemId == R.id.sort_option_date_modified) {
                MenuItem menuItem4 = this.z;
                if (menuItem4 != null) {
                    menuItem4.setChecked(false);
                }
                this.z = menuItem;
                menuItem.setChecked(true);
                SortMode sortMode3 = SortMode.BY_DATE_MODIFIED;
                this.B = sortMode3;
                m.a.a.c.b().f(sortMode3);
            }
        }
        P().f6615k.invalidate();
        return true;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        i.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putString("SORT_MODE", this.B.name());
        bundle.putString("SORT_ORDER", this.C.name());
        bundle.putString("LAYOUT_MODE", this.A.name());
        bundle.putString("MEDIA_TYPE", this.D.name());
    }

    @Override // f.l.a.d.e.b
    public SortOrder q() {
        return this.C;
    }

    @Override // f.l.a.d.e.b
    public LayoutMode t() {
        return this.A;
    }

    @Override // f.l.a.d.e.b
    public boolean u() {
        return true;
    }

    @Override // f.l.a.d.e.b
    public LiveData<List<f.l.a.d.d.e>> w() {
        return S().c;
    }

    @Override // f.l.a.d.e.b
    public boolean x(f.l.a.d.d.e eVar) {
        i.e(eVar, "imageFile");
        return true;
    }

    @Override // f.l.a.d.e.b
    public boolean y() {
        return true;
    }

    @Override // f.l.a.d.e.b
    public void z(f.l.a.d.d.e eVar) {
        i.e(eVar, "mediaModel");
        f.l.a.d.g.c.a S = S();
        boolean u = u();
        Objects.requireNonNull(S);
        i.e(eVar, "mediaModel");
        if (S.c.d() == null) {
            S.c.k(new ArrayList());
        }
        List<f.l.a.d.d.e> d2 = S.c.d();
        i.b(d2);
        i.d(d2, "_selectedFiles.value!!");
        List j2 = i.i.b.j(d2);
        if (!u) {
            ((ArrayList) j2).clear();
        }
        ((ArrayList) j2).add(eVar);
        S.c.i(i.i.b.a(j2));
    }
}
