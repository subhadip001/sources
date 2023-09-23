package f.e.a.l.p;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

/* compiled from: FileDescriptorAssetPathFetcher.java */
/* loaded from: classes.dex */
public class h extends b<AssetFileDescriptor> {
    public h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // f.e.a.l.p.d
    public Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // f.e.a.l.p.b
    public void c(AssetFileDescriptor assetFileDescriptor) {
        assetFileDescriptor.close();
    }

    @Override // f.e.a.l.p.b
    public AssetFileDescriptor f(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }
}
