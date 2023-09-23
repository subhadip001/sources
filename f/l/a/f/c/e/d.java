package f.l.a.f.c.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nightcode.mediapicker.presentation.views.ClippedImageView;
import com.video_converter.video_compressor.R;
import i.l.a.q;
import i.l.b.h;
import i.l.b.i;

/* compiled from: FolderListFragment.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class d extends h implements q<LayoutInflater, ViewGroup, Boolean, f.l.a.c.h> {
    public static final d n = new d();

    public d() {
        super(3, f.l.a.c.h.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/nightcode/mediapicker/databinding/NcItemFolderListBinding;", 0);
    }

    @Override // i.l.a.q
    public f.l.a.c.h f(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        boolean booleanValue = bool.booleanValue();
        i.e(layoutInflater2, "p0");
        View inflate = layoutInflater2.inflate(R.layout.nc_item_folder_list, viewGroup2, false);
        if (booleanValue) {
            viewGroup2.addView(inflate);
        }
        int i2 = R.id.fileCount;
        TextView textView = (TextView) inflate.findViewById(R.id.fileCount);
        if (textView != null) {
            i2 = R.id.thumb;
            ClippedImageView clippedImageView = (ClippedImageView) inflate.findViewById(R.id.thumb);
            if (clippedImageView != null) {
                i2 = R.id.title;
                TextView textView2 = (TextView) inflate.findViewById(R.id.title);
                if (textView2 != null) {
                    i2 = R.id.totalSize;
                    TextView textView3 = (TextView) inflate.findViewById(R.id.totalSize);
                    if (textView3 != null) {
                        return new f.l.a.c.h((LinearLayout) inflate, textView, clippedImageView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
