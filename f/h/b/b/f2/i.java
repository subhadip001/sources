package f.h.b.b.f2;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: DataSource.java */
/* loaded from: classes.dex */
public interface i extends f {

    /* compiled from: DataSource.java */
    /* loaded from: classes.dex */
    public interface a {
        i a();
    }

    void close();

    void d(t tVar);

    long i(j jVar);

    Map<String, List<String>> k();

    Uri n();
}
