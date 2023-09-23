package f.l.a.d.b;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.nightcode.mediapicker.domain.constants.LayoutMode;
import com.nightcode.mediapicker.presentation.views.ClippedImageView;
import com.video_converter.video_compressor.R;
import e.s.m;
import e.s.t;
import f.l.a.d.b.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: MediaListAdapter.kt */
/* loaded from: classes2.dex */
public final class j extends RecyclerView.e<l> {
    public final LiveData<List<f.l.a.d.d.e>> a;
    public final m b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6638d;

    /* renamed from: e  reason: collision with root package name */
    public LayoutInflater f6639e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6640f;

    /* renamed from: g  reason: collision with root package name */
    public LayoutMode f6641g;

    /* renamed from: h  reason: collision with root package name */
    public final List<f.l.a.d.d.e> f6642h;

    /* compiled from: MediaListAdapter.kt */
    /* loaded from: classes2.dex */
    public interface a {
        boolean a(f.l.a.d.d.e eVar);

        void b(f.l.a.d.d.e eVar);
    }

    public j(LiveData<List<f.l.a.d.d.e>> liveData, m mVar, a aVar) {
        i.l.b.i.e(liveData, "selectedFile");
        i.l.b.i.e(mVar, "lifecycleOwner");
        i.l.b.i.e(aVar, "callback");
        this.a = liveData;
        this.b = mVar;
        this.c = aVar;
        f.l.a.d.a aVar2 = f.l.a.d.a.a;
        this.f6641g = f.l.a.d.a.f6631d;
        this.f6642h = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        if (this.f6640f) {
            f.l.a.d.a aVar = f.l.a.d.a.a;
            int size = this.f6642h.size();
            return (size / 9) + size;
        }
        return this.f6642h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemViewType(int i2) {
        if (this.f6640f) {
            f.l.a.d.a aVar = f.l.a.d.a.a;
            if (f.l.a.d.a.a(i2)) {
                return 2;
            }
        }
        return this.f6641g == LayoutMode.GRID ? 1 : 0;
    }

    public final f.l.a.d.d.e n(int i2, int i3) {
        if (i3 == 2) {
            return null;
        }
        if (this.f6640f) {
            List<f.l.a.d.d.e> list = this.f6642h;
            f.l.a.d.a aVar = f.l.a.d.a.a;
            return list.get(i2 - ((i2 - 1) / 9));
        }
        return this.f6642h.get(i2);
    }

    public final void o(LayoutMode layoutMode) {
        i.l.b.i.e(layoutMode, "value");
        this.f6641g = layoutMode;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(l lVar, int i2) {
        l lVar2 = lVar;
        i.l.b.i.e(lVar2, "holder");
        if (lVar2 instanceof h) {
            final f.l.a.d.d.e n = n(i2, 1);
            i.l.b.i.b(n);
            final h hVar = (h) lVar2;
            LiveData<List<f.l.a.d.d.e>> liveData = this.a;
            m mVar = this.b;
            final a aVar = this.c;
            boolean z = this.f6638d;
            i.l.b.i.e(liveData, "selectedFiles");
            i.l.b.i.e(mVar, "lifecycleOwner");
            i.l.b.i.e(aVar, "callback");
            i.l.b.i.e(n, "item");
            if (z) {
                hVar.a.b.setVisibility(8);
            } else {
                hVar.a.b.setVisibility(0);
            }
            liveData.e(mVar, new t() { // from class: f.l.a.d.b.b
                @Override // e.s.t
                public final void a(Object obj) {
                    Object obj2;
                    f.l.a.d.d.e eVar = f.l.a.d.d.e.this;
                    h hVar2 = hVar;
                    List list = (List) obj;
                    i.l.b.i.e(eVar, "$item");
                    i.l.b.i.e(hVar2, "this$0");
                    i.l.b.i.d(list, "it");
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (i.l.b.i.a(((f.l.a.d.d.e) obj2).e(), eVar.e())) {
                            break;
                        }
                    }
                    eVar.f(obj2 != null);
                    hVar2.a.b.setImageResource(eVar.b() ? R.drawable.ic_baseline_check_circle_24 : R.drawable.ic_outline_radio_button_unchecked_24);
                    hVar2.a.f6626e.setAlpha(eVar.b() ? 0.4f : 1.0f);
                }
            });
            try {
                f.e.a.b.e(hVar.a.f6626e).c(Uri.parse(n.e())).e().i(R.drawable.video_placeholder).y(hVar.a.f6626e);
            } catch (Exception unused) {
            }
            if (n instanceof f.l.a.d.d.g) {
                hVar.a.c.setText(f.l.a.f.a.b(((f.l.a.d.d.g) n).g()));
                hVar.a.c.setVisibility(0);
            } else if (n instanceof f.l.a.d.d.a) {
                hVar.a.c.setText(f.l.a.f.a.b(Long.valueOf(((f.l.a.d.d.a) n).g())));
                hVar.a.c.setVisibility(0);
            } else {
                hVar.a.c.setVisibility(8);
            }
            hVar.a.f6625d.setText(f.l.a.f.a.a(Long.valueOf(n.c())));
            hVar.a.f6626e.setOnClickListener(new View.OnClickListener() { // from class: f.l.a.d.b.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j.a aVar2 = j.a.this;
                    f.l.a.d.d.e eVar = n;
                    i.l.b.i.e(aVar2, "$callback");
                    i.l.b.i.e(eVar, "$item");
                    aVar2.b(eVar);
                }
            });
            hVar.a.f6626e.setOnLongClickListener(new View.OnLongClickListener() { // from class: f.l.a.d.b.c
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    j.a aVar2 = j.a.this;
                    f.l.a.d.d.e eVar = n;
                    i.l.b.i.e(aVar2, "$callback");
                    i.l.b.i.e(eVar, "$item");
                    return aVar2.a(eVar);
                }
            });
        } else if (lVar2 instanceof i) {
            final f.l.a.d.d.e n2 = n(i2, 0);
            i.l.b.i.b(n2);
            final i iVar = (i) lVar2;
            LiveData<List<f.l.a.d.d.e>> liveData2 = this.a;
            m mVar2 = this.b;
            final a aVar2 = this.c;
            i.l.b.i.e(liveData2, "selectedFiles");
            i.l.b.i.e(mVar2, "lifecycleOwner");
            i.l.b.i.e(aVar2, "callback");
            i.l.b.i.e(n2, "item");
            liveData2.e(mVar2, new t() { // from class: f.l.a.d.b.e
                @Override // e.s.t
                public final void a(Object obj) {
                    Object obj2;
                    f.l.a.d.d.e eVar = f.l.a.d.d.e.this;
                    i iVar2 = iVar;
                    List list = (List) obj;
                    i.l.b.i.e(eVar, "$item");
                    i.l.b.i.e(iVar2, "this$0");
                    i.l.b.i.d(list, "it");
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (i.l.b.i.a(((f.l.a.d.d.e) obj2).e(), eVar.e())) {
                            break;
                        }
                    }
                    eVar.f(obj2 != null);
                    iVar2.a.b.setImageResource(eVar.b() ? R.drawable.ic_baseline_check_circle_24 : R.drawable.ic_outline_radio_button_unchecked_24);
                    iVar2.a.f6629f.setAlpha(eVar.b() ? 0.4f : 1.0f);
                }
            });
            try {
                f.e.a.b.e(iVar.a.f6629f).c(Uri.parse(n2.e())).e().i(R.drawable.video_placeholder).y(iVar.a.f6629f);
            } catch (Exception unused2) {
            }
            iVar.a.f6630g.setText(n2.d());
            if (n2 instanceof f.l.a.d.d.g) {
                iVar.a.f6627d.setText(f.l.a.f.a.b(((f.l.a.d.d.g) n2).g()));
                iVar.a.f6627d.setVisibility(0);
            } else if (n2 instanceof f.l.a.d.d.a) {
                iVar.a.f6627d.setText(f.l.a.f.a.b(Long.valueOf(((f.l.a.d.d.a) n2).g())));
                iVar.a.f6627d.setVisibility(0);
            } else {
                iVar.a.f6627d.setVisibility(8);
            }
            iVar.a.f6628e.setText(f.l.a.f.a.a(Long.valueOf(n2.c())));
            iVar.a.c.setOnClickListener(new View.OnClickListener() { // from class: f.l.a.d.b.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j.a aVar3 = j.a.this;
                    f.l.a.d.d.e eVar = n2;
                    i.l.b.i.e(aVar3, "$callback");
                    i.l.b.i.e(eVar, "$item");
                    aVar3.b(eVar);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public l onCreateViewHolder(ViewGroup viewGroup, int i2) {
        i.l.b.i.e(viewGroup, "parent");
        LayoutInflater layoutInflater = this.f6639e;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
        }
        this.f6639e = layoutInflater;
        int i3 = R.id.title;
        if (i2 == 0) {
            LayoutInflater layoutInflater2 = this.f6639e;
            i.l.b.i.b(layoutInflater2);
            View inflate = layoutInflater2.inflate(R.layout.nc_item_media_list, viewGroup, false);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.checkIcon);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                TextView textView = (TextView) inflate.findViewById(R.id.duration);
                if (textView != null) {
                    TextView textView2 = (TextView) inflate.findViewById(R.id.size);
                    if (textView2 != null) {
                        ClippedImageView clippedImageView = (ClippedImageView) inflate.findViewById(R.id.thumb);
                        if (clippedImageView != null) {
                            TextView textView3 = (TextView) inflate.findViewById(R.id.title);
                            if (textView3 != null) {
                                f.l.a.c.j jVar = new f.l.a.c.j(linearLayout, imageView, linearLayout, textView, textView2, clippedImageView, textView3);
                                i.l.b.i.d(jVar, "inflate(\n               …lse\n                    )");
                                return new i(jVar);
                            }
                        } else {
                            i3 = R.id.thumb;
                        }
                    } else {
                        i3 = R.id.size;
                    }
                } else {
                    i3 = R.id.duration;
                }
            } else {
                i3 = R.id.checkIcon;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
        } else if (i2 != 1) {
            LayoutInflater layoutInflater3 = this.f6639e;
            i.l.b.i.b(layoutInflater3);
            View inflate2 = layoutInflater3.inflate(R.layout.nc_item_ad_view, viewGroup, false);
            Objects.requireNonNull(inflate2, "rootView");
            f.l.a.c.g gVar = new f.l.a.c.g((LinearLayout) inflate2);
            i.l.b.i.d(gVar, "inflate(inflater!!, parent, false)");
            return new g(gVar);
        } else {
            LayoutInflater layoutInflater4 = this.f6639e;
            i.l.b.i.b(layoutInflater4);
            View inflate3 = layoutInflater4.inflate(R.layout.nc_item_media_grid, viewGroup, false);
            ImageView imageView2 = (ImageView) inflate3.findViewById(R.id.checkIcon);
            if (imageView2 != null) {
                TextView textView4 = (TextView) inflate3.findViewById(R.id.duration);
                if (textView4 != null) {
                    TextView textView5 = (TextView) inflate3.findViewById(R.id.size);
                    if (textView5 != null) {
                        ClippedImageView clippedImageView2 = (ClippedImageView) inflate3.findViewById(R.id.thumb);
                        if (clippedImageView2 != null) {
                            TextView textView6 = (TextView) inflate3.findViewById(R.id.title);
                            if (textView6 != null) {
                                f.l.a.c.i iVar = new f.l.a.c.i((LinearLayout) inflate3, imageView2, textView4, textView5, clippedImageView2, textView6);
                                i.l.b.i.d(iVar, "inflate(\n               …lse\n                    )");
                                return new h(iVar);
                            }
                        } else {
                            i3 = R.id.thumb;
                        }
                    } else {
                        i3 = R.id.size;
                    }
                } else {
                    i3 = R.id.duration;
                }
            } else {
                i3 = R.id.checkIcon;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i3)));
        }
    }
}
