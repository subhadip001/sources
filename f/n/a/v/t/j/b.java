package f.n.a.v.t.j;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.video_converter.video_compressor.R;

/* compiled from: SpinnerListItemViewImpl.java */
/* loaded from: classes2.dex */
public class b extends f.n.a.v.c.d.b {

    /* renamed from: g  reason: collision with root package name */
    public final TextView f7481g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f7482h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f7483i;

    public b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_spinner_single_item, viewGroup, false);
        this.f7481g = (TextView) a(R.id.text_main);
        this.f7482h = (TextView) a(R.id.text_hint);
        this.f7483i = (TextView) a(R.id.text_super_script);
    }
}
