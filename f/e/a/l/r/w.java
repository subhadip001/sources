package f.e.a.l.r;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.firebase.analytics.FirebaseAnalytics;
import f.e.a.l.r.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UriLoader.java */
/* loaded from: classes.dex */
public class w<Data> implements n<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", FirebaseAnalytics.Param.CONTENT)));
    public final c<Data> a;

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // f.e.a.l.r.w.c
        public f.e.a.l.p.d<AssetFileDescriptor> a(Uri uri) {
            return new f.e.a.l.p.a(this.a, uri);
        }

        @Override // f.e.a.l.r.o
        public n<Uri, AssetFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // f.e.a.l.r.w.c
        public f.e.a.l.p.d<ParcelFileDescriptor> a(Uri uri) {
            return new f.e.a.l.p.i(this.a, uri);
        }

        @Override // f.e.a.l.r.o
        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public interface c<Data> {
        f.e.a.l.p.d<Data> a(Uri uri);
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public static class d implements o<Uri, InputStream>, c<InputStream> {
        public final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // f.e.a.l.r.w.c
        public f.e.a.l.p.d<InputStream> a(Uri uri) {
            return new f.e.a.l.p.n(this.a, uri);
        }

        @Override // f.e.a.l.r.o
        public n<Uri, InputStream> b(r rVar) {
            return new w(this);
        }
    }

    public w(c<Data> cVar) {
        this.a = cVar;
    }

    @Override // f.e.a.l.r.n
    public boolean a(Uri uri) {
        return b.contains(uri.getScheme());
    }

    @Override // f.e.a.l.r.n
    public n.a b(Uri uri, int i2, int i3, f.e.a.l.l lVar) {
        Uri uri2 = uri;
        return new n.a(new f.e.a.q.d(uri2), this.a.a(uri2));
    }
}
