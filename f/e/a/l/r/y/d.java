package f.e.a.l.r.y;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import f.c.a.a.i;
import f.e.a.l.l;
import f.e.a.l.p.d;
import f.e.a.l.r.n;
import f.e.a.l.r.o;
import f.e.a.l.r.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: QMediaStoreUriLoader.java */
/* loaded from: classes.dex */
public final class d<DataT> implements n<Uri, DataT> {
    public final Context a;
    public final n<File, DataT> b;
    public final n<Uri, DataT> c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<DataT> f3440d;

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static abstract class a<DataT> implements o<Uri, DataT> {
        public final Context a;
        public final Class<DataT> b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // f.e.a.l.r.o
        public final n<Uri, DataT> b(r rVar) {
            return new d(this.a, rVar.b(File.class, this.b), rVar.b(Uri.class, this.b), this.b);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: f.e.a.l.r.y.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0084d<DataT> implements f.e.a.l.p.d<DataT> {
        public static final String[] p = {"_data"};

        /* renamed from: f  reason: collision with root package name */
        public final Context f3441f;

        /* renamed from: g  reason: collision with root package name */
        public final n<File, DataT> f3442g;

        /* renamed from: h  reason: collision with root package name */
        public final n<Uri, DataT> f3443h;

        /* renamed from: i  reason: collision with root package name */
        public final Uri f3444i;

        /* renamed from: j  reason: collision with root package name */
        public final int f3445j;

        /* renamed from: k  reason: collision with root package name */
        public final int f3446k;

        /* renamed from: l  reason: collision with root package name */
        public final l f3447l;

        /* renamed from: m  reason: collision with root package name */
        public final Class<DataT> f3448m;
        public volatile boolean n;
        public volatile f.e.a.l.p.d<DataT> o;

        public C0084d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i2, int i3, l lVar, Class<DataT> cls) {
            this.f3441f = context.getApplicationContext();
            this.f3442g = nVar;
            this.f3443h = nVar2;
            this.f3444i = uri;
            this.f3445j = i2;
            this.f3446k = i3;
            this.f3447l = lVar;
            this.f3448m = cls;
        }

        @Override // f.e.a.l.p.d
        public Class<DataT> a() {
            return this.f3448m;
        }

        @Override // f.e.a.l.p.d
        public void b() {
            f.e.a.l.p.d<DataT> dVar = this.o;
            if (dVar != null) {
                dVar.b();
            }
        }

        public final f.e.a.l.p.d<DataT> c() {
            n.a<DataT> b;
            Cursor cursor = null;
            if (Environment.isExternalStorageLegacy()) {
                n<File, DataT> nVar = this.f3442g;
                Uri uri = this.f3444i;
                try {
                    Cursor query = this.f3441f.getContentResolver().query(uri, p, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty(string)) {
                                    File file = new File(string);
                                    query.close();
                                    b = nVar.b(file, this.f3445j, this.f3446k, this.f3447l);
                                } else {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                b = this.f3443h.b(this.f3441f.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0 ? MediaStore.setRequireOriginal(this.f3444i) : this.f3444i, this.f3445j, this.f3446k, this.f3447l);
            }
            if (b != null) {
                return b.c;
            }
            return null;
        }

        @Override // f.e.a.l.p.d
        public void cancel() {
            this.n = true;
            f.e.a.l.p.d<DataT> dVar = this.o;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // f.e.a.l.p.d
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // f.e.a.l.p.d
        public void e(Priority priority, d.a<? super DataT> aVar) {
            try {
                f.e.a.l.p.d<DataT> c = c();
                if (c == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f3444i));
                    return;
                }
                this.o = c;
                if (this.n) {
                    cancel();
                } else {
                    c.e(priority, aVar);
                }
            } catch (FileNotFoundException e2) {
                aVar.c(e2);
            }
        }
    }

    public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = nVar;
        this.c = nVar2;
        this.f3440d = cls;
    }

    @Override // f.e.a.l.r.n
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && i.u(uri);
    }

    @Override // f.e.a.l.r.n
    public n.a b(Uri uri, int i2, int i3, l lVar) {
        Uri uri2 = uri;
        return new n.a(new f.e.a.q.d(uri2), new C0084d(this.a, this.b, this.c, uri2, i2, i3, lVar, this.f3440d));
    }
}
