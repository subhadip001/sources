package f.e.a.l.p;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* compiled from: FileDescriptorLocalUriFetcher.java */
/* loaded from: classes.dex */
public class i extends l<ParcelFileDescriptor> {
    public i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // f.e.a.l.p.d
    public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    @Override // f.e.a.l.p.l
    public void c(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    @Override // f.e.a.l.p.l
    public ParcelFileDescriptor f(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException(f.a.b.a.a.n("FileDescriptor is null for: ", uri));
    }
}
