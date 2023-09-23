package f.n.a.j;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.video_converter.video_compressor.R;
import f.n.a.j.a;
import java.util.HashSet;
import java.util.Set;

/* compiled from: CustomPlayerChooserView.java */
/* loaded from: classes2.dex */
public class b implements a.b {
    public LayoutInflater a;
    public final View b;
    public GridView c;

    /* renamed from: d  reason: collision with root package name */
    public GridView f6963d;

    /* renamed from: e  reason: collision with root package name */
    public f.n.a.j.a f6964e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f6965f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f6966g;

    /* renamed from: h  reason: collision with root package name */
    public f.n.a.j.a f6967h;

    /* renamed from: i  reason: collision with root package name */
    public Set<a> f6968i = new HashSet();

    /* compiled from: CustomPlayerChooserView.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(PackageManager packageManager, ResolveInfo resolveInfo);
    }

    public b(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.a = from;
        View inflate = from.inflate(R.layout.custom_chooser_layout, (ViewGroup) null, false);
        this.b = inflate;
        this.f6963d = (GridView) inflate.findViewById(R.id.recommended_app_grid);
        f.n.a.j.a aVar = new f.n.a.j.a(inflate.getContext());
        this.f6967h = aVar;
        this.f6963d.setAdapter((ListAdapter) aVar);
        this.c = (GridView) inflate.findViewById(R.id.app_choice_grid_view);
        f.n.a.j.a aVar2 = new f.n.a.j.a(inflate.getContext());
        this.f6964e = aVar2;
        this.c.setAdapter((ListAdapter) aVar2);
        this.f6965f = (TextView) inflate.findViewById(R.id.recommended_text_vew);
        this.f6966g = (TextView) inflate.findViewById(R.id.other_text_view);
    }

    @Override // f.n.a.j.a.b
    public void a(PackageManager packageManager, ResolveInfo resolveInfo) {
        this.f6964e.f6959h.remove(this);
        for (a aVar : this.f6968i) {
            aVar.a(packageManager, resolveInfo);
        }
    }
}
