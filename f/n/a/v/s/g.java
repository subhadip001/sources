package f.n.a.v.s;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import f.n.a.v.s.g;
import java.util.ArrayList;
import java.util.List;

/* compiled from: HorizontalVideoListAdapter.java */
/* loaded from: classes2.dex */
public class g extends RecyclerView.e<b> {
    public List<f.n.a.m.c.a> a = new ArrayList();
    public a b;

    /* compiled from: HorizontalVideoListAdapter.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* compiled from: HorizontalVideoListAdapter.java */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.a0 {
        public TextView a;
        public ImageView b;
        public View c;

        /* renamed from: d  reason: collision with root package name */
        public View f7428d;

        /* renamed from: e  reason: collision with root package name */
        public Group f7429e;

        public b(g gVar, View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.tv_file_name);
            ImageView imageView = (ImageView) view.findViewById(R.id.videoThumb);
            this.b = imageView;
            imageView.setClipToOutline(true);
            this.c = view.findViewById(R.id.imgCheck);
            this.a = (TextView) view.findViewById(R.id.tv_video_resolution);
            this.f7429e = (Group) view.findViewById(R.id.selectionGroup);
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.mainLayout);
            this.f7428d = view.findViewById(R.id.deleteBtn);
        }
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
    public void onBindViewHolder(b bVar, final int i2) {
        b bVar2 = bVar;
        final f.n.a.m.c.a aVar = this.a.get(i2);
        TextView textView = bVar2.a;
        textView.setText(aVar.c() + " | " + f.n.a.v.a.j.f(aVar.u));
        bVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: f.n.a.v.s.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.a aVar2 = g.this.b;
                if (aVar2 != null) {
                    Log.d("TAG", "onClickVideoItem: ");
                    for (i iVar : ((y) aVar2).a.c()) {
                        iVar.j();
                    }
                }
            }
        });
        bVar2.f7428d.setOnClickListener(new View.OnClickListener() { // from class: f.n.a.v.s.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g gVar = g.this;
                f.n.a.m.c.a aVar2 = aVar;
                g.a aVar3 = gVar.b;
                if (aVar3 != null) {
                    for (i iVar : ((y) aVar3).a.c()) {
                        iVar.g(aVar2);
                    }
                }
            }
        });
        bVar2.f7428d.setVisibility(this.a.size() > 1 ? 0 : 8);
        bVar2.f7429e.setVisibility(0);
        bVar2.f7429e.setVisibility(8);
        ImageView imageView = bVar2.b;
        String str = aVar.f7022j;
        try {
            if ((imageView.getContext() instanceof Activity) && ((Activity) imageView.getContext()).isFinishing()) {
                return;
            }
            f.e.a.b.e(imageView).a().z(str).e().i(R.drawable.placeholder_video).y(imageView);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new b(this, f.a.b.a.a.T(viewGroup, R.layout.item_horizontal_vid_list, viewGroup, false));
    }
}
