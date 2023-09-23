package f.e.a.l.r;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import f.e.a.l.p.d;
import f.e.a.l.r.n;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: MediaStoreFileLoader.java */
/* loaded from: classes.dex */
public final class k implements n<Uri, File> {
    public final Context a;

    /* compiled from: MediaStoreFileLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements o<Uri, File> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // f.e.a.l.r.o
        public n<Uri, File> b(r rVar) {
            return new k(this.a);
        }
    }

    /* compiled from: MediaStoreFileLoader.java */
    /* loaded from: classes.dex */
    public static class b implements f.e.a.l.p.d<File> {

        /* renamed from: h  reason: collision with root package name */
        public static final String[] f3425h = {"_data"};

        /* renamed from: f  reason: collision with root package name */
        public final Context f3426f;

        /* renamed from: g  reason: collision with root package name */
        public final Uri f3427g;

        public b(Context context, Uri uri) {
            this.f3426f = context;
            this.f3427g = uri;
        }

        @Override // f.e.a.l.p.d
        public Class<File> a() {
            return File.class;
        }

        @Override // f.e.a.l.p.d
        public void b() {
        }

        @Override // f.e.a.l.p.d
        public void cancel() {
        }

        @Override // f.e.a.l.p.d
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // f.e.a.l.p.d
        public void e(Priority priority, d.a<? super File> aVar) {
            Cursor query = this.f3426f.getContentResolver().query(this.f3427g, f3425h, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(r0)) {
                StringBuilder A = f.a.b.a.a.A("Failed to find file path for: ");
                A.append(this.f3427g);
                aVar.c(new FileNotFoundException(A.toString()));
                return;
            }
            aVar.f(new File(r0));
        }
    }

    public k(Context context) {
        this.a = context;
    }

    @Override // f.e.a.l.r.n
    public boolean a(Uri uri) {
        return f.c.a.a.i.u(uri);
    }

    @Override // f.e.a.l.r.n
    public n.a<File> b(Uri uri, int i2, int i3, f.e.a.l.l lVar) {
        Uri uri2 = uri;
        return new n.a<>(new f.e.a.q.d(uri2), new b(this.a, uri2));
    }
}
