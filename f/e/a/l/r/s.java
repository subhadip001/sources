package f.e.a.l.r;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import f.e.a.l.r.n;
import java.io.InputStream;

/* compiled from: ResourceLoader.java */
/* loaded from: classes.dex */
public class s<Data> implements n<Integer, Data> {
    public final n<Uri, Data> a;
    public final Resources b;

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements o<Integer, AssetFileDescriptor> {
        public final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // f.e.a.l.r.o
        public n<Integer, AssetFileDescriptor> b(r rVar) {
            return new s(this.a, rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<Integer, ParcelFileDescriptor> {
        public final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // f.e.a.l.r.o
        public n<Integer, ParcelFileDescriptor> b(r rVar) {
            return new s(this.a, rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static class c implements o<Integer, InputStream> {
        public final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // f.e.a.l.r.o
        public n<Integer, InputStream> b(r rVar) {
            return new s(this.a, rVar.b(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* loaded from: classes.dex */
    public static class d implements o<Integer, Uri> {
        public final Resources a;

        public d(Resources resources) {
            this.a = resources;
        }

        @Override // f.e.a.l.r.o
        public n<Integer, Uri> b(r rVar) {
            return new s(this.a, v.a);
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.b = resources;
        this.a = nVar;
    }

    @Override // f.e.a.l.r.n
    public /* bridge */ /* synthetic */ boolean a(Integer num) {
        return true;
    }

    @Override // f.e.a.l.r.n
    public n.a b(Integer num, int i2, int i3, f.e.a.l.l lVar) {
        Uri uri;
        Integer num2 = num;
        try {
            uri = Uri.parse("android.resource://" + this.b.getResourcePackageName(num2.intValue()) + '/' + this.b.getResourceTypeName(num2.intValue()) + '/' + this.b.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e2) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e2);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.a.b(uri, i2, i3, lVar);
    }
}
