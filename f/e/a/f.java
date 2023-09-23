package f.e.a;

import android.os.Trace;
import com.bumptech.glide.Registry;
import java.util.List;

/* compiled from: RegistryFactory.java */
/* loaded from: classes.dex */
public class f implements f.e.a.r.g<Registry> {
    public boolean a;
    public final /* synthetic */ b b;
    public final /* synthetic */ List c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f.e.a.n.a f3178d;

    public f(b bVar, List list, f.e.a.n.a aVar) {
        this.b = bVar;
        this.c = list;
        this.f3178d = aVar;
    }

    @Override // f.e.a.r.g
    public Registry get() {
        if (!this.a) {
            this.a = true;
            Trace.beginSection("Glide registry");
            try {
                return f.c.a.a.i.g(this.b, this.c, this.f3178d);
            } finally {
                Trace.endSection();
            }
        }
        throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
    }
}
