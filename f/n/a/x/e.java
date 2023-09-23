package f.n.a.x;

import android.net.Uri;
import com.video_converter.video_compressor.model.MediaFile;
import f.h.f.z.a;
import f.n.a.o.i;
import f.n.a.x.b;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: SelectedFilesTrackingTask.java */
/* loaded from: classes2.dex */
public class e implements b.a {
    public b a;
    public c b;
    public a c;

    /* compiled from: SelectedFilesTrackingTask.java */
    /* loaded from: classes2.dex */
    public interface a {
        void c();

        void h(ArrayList<MediaFile> arrayList);
    }

    public e(b bVar, c cVar) {
        this.a = bVar;
        this.b = cVar;
        cVar.a(MediaFile.class, new f.n.a.o.b());
        this.b.a(Uri.class, new i());
    }

    @Override // f.n.a.x.b.a
    public void a() {
        this.a.f6940f.remove(this);
    }

    @Override // f.n.a.x.b.a
    public void b() {
        this.a.f6940f.remove(this);
    }

    @Override // f.n.a.x.b.a
    public void c() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.c();
        }
        this.a.f6940f.remove(this);
    }

    @Override // f.n.a.x.b.a
    public void d(String str) {
        c cVar = this.b;
        Objects.requireNonNull(cVar);
        Type a2 = f.h.f.z.a.a(new a.b(null, List.class, MediaFile.class));
        f.h.f.z.a.e(a2);
        a2.hashCode();
        ArrayList<MediaFile> arrayList = (ArrayList) ((List) cVar.a.a().d(str, a2));
        a aVar = this.c;
        if (aVar != null) {
            aVar.h(arrayList);
        }
        this.a.f6940f.remove(this);
    }
}
