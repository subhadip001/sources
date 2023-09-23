package f.n.a.v.b.p;

import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.constants.CompressionProfile;
import com.video_converter.video_compressor.constants.User;
import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.processorFactory.ProcessStatus;
import f.n.a.v.b.g;
import f.n.a.v.b.n;
import f.n.a.v.b.p.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: BatchItemRecyclerAdapter.java */
/* loaded from: classes2.dex */
public class a extends RecyclerView.e<C0184a> implements b.a {
    public b a;
    public f.n.a.v.c.c b;
    public List<f.n.a.d.a> c = new ArrayList();

    /* compiled from: BatchItemRecyclerAdapter.java */
    /* renamed from: f.n.a.v.b.p.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0184a extends RecyclerView.a0 {
        public final f.n.a.v.b.p.b a;

        public C0184a(f.n.a.v.b.p.b bVar) {
            super(((f.n.a.v.c.d.b) bVar).f7131f);
            this.a = bVar;
        }
    }

    /* compiled from: BatchItemRecyclerAdapter.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    public a(b bVar, f.n.a.v.c.c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    @Override // f.n.a.v.b.p.b.a
    public void c() {
        f.n.a.f.a.c().e();
    }

    @Override // f.n.a.v.b.p.b.a
    public void d(f.n.a.d.a aVar) {
        for (g gVar : ((n) this.a).c()) {
            gVar.d(aVar);
        }
    }

    @Override // f.n.a.v.b.p.b.a
    public void e(LinearLayout linearLayout, int i2) {
        for (g gVar : ((n) this.a).c()) {
            gVar.e(linearLayout, i2);
        }
    }

    @Override // f.n.a.v.b.p.b.a
    public void g(f.n.a.d.a aVar) {
        for (g gVar : ((n) this.a).c()) {
            gVar.n(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        return this.c.size();
    }

    @Override // f.n.a.v.b.p.b.a
    public void i(f.n.a.d.a aVar) {
        for (g gVar : ((n) this.a).c()) {
            gVar.f(aVar);
        }
    }

    @Override // f.n.a.v.b.p.b.a
    public void j(f.n.a.d.a aVar) {
        for (g gVar : ((n) this.a).c()) {
            gVar.q(aVar);
        }
    }

    @Override // f.n.a.v.b.p.b.a
    public void k(f.n.a.d.a aVar) {
        for (g gVar : ((n) this.a).c()) {
            gVar.h(aVar);
        }
    }

    @Override // f.n.a.v.b.p.b.a
    public void l(f.n.a.d.a aVar) {
        for (g gVar : ((n) this.a).c()) {
            gVar.j(aVar);
        }
    }

    @Override // f.n.a.v.b.p.b.a
    public void m(f.n.a.d.a aVar) {
        for (g gVar : ((n) this.a).c()) {
            gVar.g(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(C0184a c0184a, int i2) {
        String str;
        C0184a c0184a2 = c0184a;
        boolean z = i2 == getItemCount() - 1;
        ProcessStatus processStatus = this.c.get(i2).b.z;
        ProcessStatus processStatus2 = ProcessStatus.SUCCESS;
        boolean z2 = z & (processStatus == processStatus2);
        f.n.a.v.b.p.b bVar = c0184a2.a;
        f.n.a.d.a aVar = this.c.get(i2);
        c cVar = (c) bVar;
        cVar.f7122h = aVar;
        ProcessingInfo processingInfo = aVar.b;
        cVar.y.setVisibility(8);
        cVar.E.setVisibility(8);
        cVar.v.setVisibility(8);
        cVar.A.setVisibility(8);
        cVar.w.setVisibility(8);
        ProcessStatus processStatus3 = processingInfo.z;
        if (processStatus3 == processStatus2) {
            cVar.y.setVisibility(0);
            cVar.E.setVisibility(0);
            cVar.r.setText(processingInfo.f1379j);
            cVar.u.setText(processingInfo.f());
            cVar.s.setText(processingInfo.D);
            cVar.t.setText(processingInfo.E);
            if (processingInfo.F > 0) {
                cVar.A.setVisibility(0);
                cVar.w.setVisibility(0);
                cVar.w.setText(String.format(Locale.US, "%s%%", Integer.valueOf(processingInfo.F)));
            }
            if (processingInfo.q != null) {
                cVar.B.setVisibility(0);
                cVar.C.setVisibility(0);
                cVar.C.setText(processingInfo.q.getExtension());
            }
        } else if (processStatus3 == ProcessStatus.FAILED) {
            cVar.v.setVisibility(0);
            cVar.v.setText(processingInfo.A);
        }
        if (processingInfo.z == ProcessStatus.FAILED && (str = processingInfo.A) != null && !str.equalsIgnoreCase(cVar.b().getString(R.string.compression_cancelled))) {
            cVar.F.setVisibility(0);
        } else {
            cVar.F.setVisibility(8);
        }
        if (!User.a() && (processingInfo.z == ProcessStatus.ON_PROGRESS || z2)) {
            cVar.G.setVisibility(0);
            for (b.a aVar2 : cVar.c()) {
                aVar2.e(cVar.G, i2);
            }
        } else {
            cVar.G.setVisibility(8);
        }
        TextView textView = cVar.p;
        ProcessStatus processStatus4 = processingInfo.z;
        textView.setText(processStatus4 != null ? processStatus4.getStatusValue() : "Unknown");
        cVar.q.setText(processingInfo.d());
        CompressionProfile compressionProfile = cVar.f7122h.b.H;
        if (compressionProfile == null) {
            cVar.x.setText(R.string.undefined);
        } else {
            switch (compressionProfile.ordinal()) {
                case 0:
                    cVar.x.setText(R.string.small_file);
                    break;
                case 1:
                    cVar.x.setText(R.string.medium_file);
                    break;
                case 2:
                    cVar.x.setText(R.string.large_file);
                    break;
                case 3:
                    cVar.x.setText(R.string.high_quality_file);
                    break;
                case 4:
                    cVar.x.setText(R.string.small_hq_file);
                    break;
                case 5:
                    cVar.x.setText(R.string.medium_hq_file);
                    break;
                case 6:
                    cVar.x.setText(R.string.fixed_size_slow);
                    break;
                case 7:
                    cVar.x.setText(R.string.fixed_size_fast);
                    break;
                case 8:
                    cVar.x.setText(R.string.lossy_compression);
                    break;
                case 9:
                    cVar.x.setText(R.string.custom_resolution);
                    break;
                case 10:
                    cVar.x.setText(R.string.custom);
                    break;
            }
        }
        StringBuilder A = f.a.b.a.a.A("bindItem: ");
        A.append(processingInfo.W);
        Log.d("TAGTAGTAG", A.toString());
        int i3 = processingInfo.W;
        if (i3 == 1) {
            f.e.a.b.e(cVar.o).d(Integer.valueOf((int) R.drawable.ic_delete));
            cVar.o.setEnabled(false);
            cVar.o.setText(cVar.b().getResources().getString(R.string.original_deleted));
            cVar.o.setTextColor(-7829368);
        } else if (i3 == 2) {
            f.e.a.b.e(cVar.o).d(Integer.valueOf((int) R.drawable.ic_delete));
            cVar.o.setEnabled(false);
            cVar.o.setText(cVar.b().getResources().getString(R.string.original_delete_failed));
            cVar.o.setTextColor(-7829368);
        } else if (i3 == 3) {
            f.e.a.b.e(cVar.o).a().z("file:///android_asset/loading_gif.gif");
        }
        StringBuilder B = f.a.b.a.a.B("onBindViewHolder: ", i2, " ");
        B.append(this.c.get(i2).b.z.name());
        Log.d("BATCH_DEBUG", B.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public C0184a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        c cVar = new c(this.b.a, viewGroup);
        cVar.f7130g.add(this);
        return new C0184a(cVar);
    }
}
