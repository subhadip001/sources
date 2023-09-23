package f.n.a.v.u;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.jaygoo.widget.RangeSeekBar;
import com.squareup.picasso.Picasso;
import com.video_converter.video_compressor.R;
import f.m.b.w;
import f.n.a.v.a.j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VideoTrimAdapter.java */
/* loaded from: classes2.dex */
public class c extends RecyclerView.e<b> {
    public List<f.n.a.m.c.a> a = new ArrayList();
    public final Context b;
    public a c;

    /* compiled from: VideoTrimAdapter.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* compiled from: VideoTrimAdapter.java */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.a0 {
        public TextView a;
        public TextView b;
        public ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public View f7487d;

        /* renamed from: e  reason: collision with root package name */
        public Group f7488e;

        /* renamed from: f  reason: collision with root package name */
        public RangeSeekBar f7489f;

        public b(c cVar, View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.tv_file_name);
            ImageView imageView = (ImageView) view.findViewById(R.id.videoThumb);
            this.c = imageView;
            imageView.setClipToOutline(true);
            this.f7487d = view.findViewById(R.id.imgCheck);
            this.a = (TextView) view.findViewById(R.id.tv_video_resolution);
            this.b = (TextView) view.findViewById(R.id.tv_file_size);
            this.f7488e = (Group) view.findViewById(R.id.selectionGroup);
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.mainLayout);
            RangeSeekBar rangeSeekBar = (RangeSeekBar) view.findViewById(R.id.statusSeekbar);
            this.f7489f = rangeSeekBar;
            rangeSeekBar.setEnabled(false);
        }
    }

    public c(Context context) {
        this.b = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        List<f.n.a.m.c.a> list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(b bVar, int i2) {
        b bVar2 = bVar;
        f.n.a.m.c.a aVar = this.a.get(i2);
        bVar2.a.setText(aVar.c());
        bVar2.b.setText(j.f(aVar.u));
        bVar2.itemView.setOnClickListener(new f.n.a.v.u.b(this, aVar, i2));
        if (aVar.v) {
            bVar2.f7488e.setVisibility(0);
        } else {
            bVar2.f7488e.setVisibility(8);
        }
        ImageView imageView = bVar2.c;
        w f2 = Picasso.d().f(aVar.f7022j);
        f2.c = true;
        f2.a();
        f2.f(R.drawable.placeholder_video);
        f2.d(imageView, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new b(this, LayoutInflater.from(this.b).inflate(R.layout.video_cut_single_item_new, viewGroup, false));
    }
}
