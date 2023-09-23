package f.e.a.l.p;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

/* compiled from: AssetFileDescriptorLocalUriFetcher.java */
/* loaded from: classes.dex */
public final class a extends l<AssetFileDescriptor> {
    public a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // f.e.a.l.p.d
    public Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // f.e.a.l.p.l
    public void c(AssetFileDescriptor assetFileDescriptor) {
        assetFileDescriptor.close();
    }

    @Override // f.e.a.l.p.l
    public AssetFileDescriptor f(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException(f.a.b.a.a.n("FileDescriptor is null for: ", uri));
    }
}
