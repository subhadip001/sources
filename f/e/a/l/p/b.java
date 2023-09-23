package f.e.a.l.p;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import f.e.a.l.p.d;
import java.io.IOException;

/* compiled from: AssetPathFetcher.java */
/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: f  reason: collision with root package name */
    public final String f3238f;

    /* renamed from: g  reason: collision with root package name */
    public final AssetManager f3239g;

    /* renamed from: h  reason: collision with root package name */
    public T f3240h;

    public b(AssetManager assetManager, String str) {
        this.f3239g = assetManager;
        this.f3238f = str;
    }

    @Override // f.e.a.l.p.d
    public void b() {
        T t = this.f3240h;
        if (t == null) {
            return;
        }
        try {
            c(t);
        } catch (IOException unused) {
        }
    }

    public abstract void c(T t);

    @Override // f.e.a.l.p.d
    public void cancel() {
    }

    @Override // f.e.a.l.p.d
    public DataSource d() {
        return DataSource.LOCAL;
    }

    @Override // f.e.a.l.p.d
    public void e(Priority priority, d.a<? super T> aVar) {
        try {
            T f2 = f(this.f3239g, this.f3238f);
            this.f3240h = f2;
            aVar.f(f2);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            aVar.c(e2);
        }
    }

    public abstract T f(AssetManager assetManager, String str);
}
