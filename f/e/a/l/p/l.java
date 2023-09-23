package f.e.a.l.p;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import f.e.a.l.p.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher.java */
/* loaded from: classes.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: f  reason: collision with root package name */
    public final Uri f3256f;

    /* renamed from: g  reason: collision with root package name */
    public final ContentResolver f3257g;

    /* renamed from: h  reason: collision with root package name */
    public T f3258h;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f3257g = contentResolver;
        this.f3256f = uri;
    }

    @Override // f.e.a.l.p.d
    public void b() {
        T t = this.f3258h;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
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
    public final void e(Priority priority, d.a<? super T> aVar) {
        try {
            T f2 = f(this.f3256f, this.f3257g);
            this.f3258h = f2;
            aVar.f(f2);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            aVar.c(e2);
        }
    }

    public abstract T f(Uri uri, ContentResolver contentResolver);
}
