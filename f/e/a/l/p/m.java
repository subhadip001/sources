package f.e.a.l.p;

import android.content.res.AssetManager;
import java.io.InputStream;

/* compiled from: StreamAssetPathFetcher.java */
/* loaded from: classes.dex */
public class m extends b<InputStream> {
    public m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // f.e.a.l.p.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // f.e.a.l.p.b
    public void c(InputStream inputStream) {
        inputStream.close();
    }

    @Override // f.e.a.l.p.b
    public InputStream f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
