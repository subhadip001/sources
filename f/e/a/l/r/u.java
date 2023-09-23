package f.e.a.l.r;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import f.e.a.l.r.n;
import java.io.File;
import java.io.InputStream;

/* compiled from: StringLoader.java */
/* loaded from: classes.dex */
public class u<Data> implements n<String, Data> {
    public final n<Uri, Data> a;

    /* compiled from: StringLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements o<String, AssetFileDescriptor> {
        @Override // f.e.a.l.r.o
        public n<String, AssetFileDescriptor> b(r rVar) {
            return new u(rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<String, ParcelFileDescriptor> {
        @Override // f.e.a.l.r.o
        public n<String, ParcelFileDescriptor> b(r rVar) {
            return new u(rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* loaded from: classes.dex */
    public static class c implements o<String, InputStream> {
        @Override // f.e.a.l.r.o
        public n<String, InputStream> b(r rVar) {
            return new u(rVar.b(Uri.class, InputStream.class));
        }
    }

    public u(n<Uri, Data> nVar) {
        this.a = nVar;
    }

    @Override // f.e.a.l.r.n
    public /* bridge */ /* synthetic */ boolean a(String str) {
        return true;
    }

    @Override // f.e.a.l.r.n
    public n.a b(String str, int i2, int i3, f.e.a.l.l lVar) {
        Uri fromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            fromFile = null;
        } else if (str2.charAt(0) == '/') {
            fromFile = Uri.fromFile(new File(str2));
        } else {
            Uri parse = Uri.parse(str2);
            fromFile = parse.getScheme() == null ? Uri.fromFile(new File(str2)) : parse;
        }
        if (fromFile == null || !this.a.a(fromFile)) {
            return null;
        }
        return this.a.b(fromFile, i2, i3, lVar);
    }
}
