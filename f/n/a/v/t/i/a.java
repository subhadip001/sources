package f.n.a.v.t.i;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.model.MediaFile;

/* compiled from: InputFileItemViewImpl.java */
/* loaded from: classes2.dex */
public class a extends f.n.a.v.c.d.b {

    /* renamed from: g  reason: collision with root package name */
    public final TextView f7476g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f7477h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f7478i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f7479j;

    /* renamed from: k  reason: collision with root package name */
    public MediaFile f7480k;

    public a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_re_arrangeable_list_item, viewGroup, false);
        this.f7476g = (TextView) a(R.id.display_name_txt_view);
        this.f7477h = (TextView) a(R.id.secondary_info_txt_view);
        this.f7478i = (TextView) a(R.id.file_size_txt_view);
        this.f7479j = (ImageView) a(R.id.file_icon_img_view);
        ImageView imageView = (ImageView) a(R.id.handle);
    }
}
