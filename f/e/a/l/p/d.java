package f.e.a.l.p;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* compiled from: DataFetcher.java */
/* loaded from: classes.dex */
public interface d<T> {

    /* compiled from: DataFetcher.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        void c(Exception exc);

        void f(T t);
    }

    Class<T> a();

    void b();

    void cancel();

    DataSource d();

    void e(Priority priority, a<? super T> aVar);
}
