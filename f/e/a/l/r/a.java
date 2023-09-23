package f.e.a.l.r;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import f.e.a.l.r.n;
import java.io.InputStream;

/* compiled from: AssetUriLoader.java */
/* loaded from: classes.dex */
public class a<Data> implements n<Uri, Data> {
    public final AssetManager a;
    public final InterfaceC0079a<Data> b;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: f.e.a.l.r.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0079a<Data> {
        f.e.a.l.p.d<Data> a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<Uri, AssetFileDescriptor>, InterfaceC0079a<AssetFileDescriptor> {
        public final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // f.e.a.l.r.a.InterfaceC0079a
        public f.e.a.l.p.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new f.e.a.l.p.h(assetManager, str);
        }

        @Override // f.e.a.l.r.o
        public n<Uri, AssetFileDescriptor> b(r rVar) {
            return new a(this.a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: classes.dex */
    public static class c implements o<Uri, InputStream>, InterfaceC0079a<InputStream> {
        public final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // f.e.a.l.r.a.InterfaceC0079a
        public f.e.a.l.p.d<InputStream> a(AssetManager assetManager, String str) {
            return new f.e.a.l.p.m(assetManager, str);
        }

        @Override // f.e.a.l.r.o
        public n<Uri, InputStream> b(r rVar) {
            return new a(this.a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0079a<Data> interfaceC0079a) {
        this.a = assetManager;
        this.b = interfaceC0079a;
    }

    @Override // f.e.a.l.r.n
    public boolean a(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }

    @Override // f.e.a.l.r.n
    public n.a b(Uri uri, int i2, int i3, f.e.a.l.l lVar) {
        Uri uri2 = uri;
        return new n.a(new f.e.a.q.d(uri2), this.b.a(this.a, uri2.toString().substring(22)));
    }
}
