package f.n.a.v.f.g;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.model.MediaFile;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FixedSizeRvAdapter.java */
/* loaded from: classes2.dex */
public class b extends RecyclerView.e<a> implements c {
    public f.n.a.v.c.c a;
    public List<MediaFile> b = new ArrayList();

    /* compiled from: FixedSizeRvAdapter.java */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.a0 {
        public final f.n.a.v.f.g.a a;

        public a(f.n.a.v.f.g.a aVar) {
            super(aVar.f7131f);
            this.a = aVar;
        }
    }

    /* compiled from: FixedSizeRvAdapter.java */
    /* renamed from: f.n.a.v.f.g.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0188b {
    }

    public b(InterfaceC0188b interfaceC0188b, f.n.a.v.c.c cVar) {
        this.a = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        return this.b.size();
    }

    @Override // f.n.a.v.f.g.c
    public void h(MediaFile mediaFile) {
        int indexOf = this.b.indexOf(mediaFile);
        if (indexOf == -1) {
            return;
        }
        this.b.set(indexOf, mediaFile);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(a aVar, int i2) {
        f.n.a.v.f.g.a aVar2 = aVar.a;
        MediaFile mediaFile = this.b.get(i2);
        aVar2.f7199k = mediaFile;
        aVar2.f7196h.setText(mediaFile.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        f.n.a.v.f.g.a aVar = new f.n.a.v.f.g.a(this.a.a, viewGroup);
        aVar.f7130g.add(this);
        return new a(aVar);
    }
}
