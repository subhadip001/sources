package f.l.a.c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.video_converter.video_compressor.R;

/* compiled from: NcFragmentMediaListBinding.java */
/* loaded from: classes2.dex */
public final class d implements e.d0.a {
    public final SwipeRefreshLayout a;
    public final View b;
    public final FloatingActionButton c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f6616d;

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f6617e;

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f6618f;

    /* renamed from: g  reason: collision with root package name */
    public final SwipeRefreshLayout f6619g;

    public d(SwipeRefreshLayout swipeRefreshLayout, View view, FloatingActionButton floatingActionButton, TextView textView, ProgressBar progressBar, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2) {
        this.a = swipeRefreshLayout;
        this.b = view;
        this.c = floatingActionButton;
        this.f6616d = textView;
        this.f6617e = progressBar;
        this.f6618f = recyclerView;
        this.f6619g = swipeRefreshLayout2;
    }

    public static d a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.nc_fragment_media_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i2 = R.id.destView;
        View findViewById = inflate.findViewById(R.id.destView);
        if (findViewById != null) {
            i2 = R.id.fab;
            FloatingActionButton floatingActionButton = (FloatingActionButton) inflate.findViewById(R.id.fab);
            if (floatingActionButton != null) {
                i2 = R.id.info_text;
                TextView textView = (TextView) inflate.findViewById(R.id.info_text);
                if (textView != null) {
                    i2 = R.id.progressbar;
                    ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progressbar);
                    if (progressBar != null) {
                        i2 = R.id.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerView);
                        if (recyclerView != null) {
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                            return new d(swipeRefreshLayout, findViewById, floatingActionButton, textView, progressBar, recyclerView, swipeRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // e.d0.a
    public View b() {
        return this.a;
    }
}
