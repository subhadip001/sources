package f.n.a.v.t.i;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.model.MediaFile;
import f.m.b.w;
import f.n.a.v.a.j;
import f.n.a.v.c.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: InputFilesRecyclerAdapter.java */
/* loaded from: classes2.dex */
public class b extends RecyclerView.e<a> implements f.n.a.v.t.a.a {
    public c a;
    public List<MediaFile> b = new ArrayList();

    /* compiled from: InputFilesRecyclerAdapter.java */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.a0 {
        public final f.n.a.v.t.i.a a;

        public a(f.n.a.v.t.i.a aVar) {
            super(aVar.f7131f);
            this.a = aVar;
        }
    }

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        List<MediaFile> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(a aVar, int i2) {
        String str;
        f.n.a.v.t.i.a aVar2 = aVar.a;
        MediaFile mediaFile = this.b.get(i2);
        String str2 = "<unknown>";
        aVar2.f7480k = mediaFile;
        aVar2.f7476g.setText(mediaFile.f1368f);
        TextView textView = aVar2.f7477h;
        try {
            str = j.e(mediaFile.f1374l);
        } catch (Exception unused) {
            str = "<unknown>";
        }
        textView.setText(str);
        TextView textView2 = aVar2.f7478i;
        try {
            str2 = j.f(Long.parseLong(mediaFile.f1369g));
        } catch (Exception unused2) {
        }
        textView2.setText(str2);
        w e2 = Picasso.d().e(aVar2.f7480k.f1372j);
        e2.c = true;
        e2.a();
        e2.f(R.drawable.placeholder_video);
        e2.d(aVar2.f7479j, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new a(new f.n.a.v.t.i.a(this.a.a, viewGroup));
    }
}
