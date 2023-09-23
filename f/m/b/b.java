package f.m.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import f.m.b.x;

/* compiled from: AssetRequestHandler.java */
/* loaded from: classes2.dex */
public class b extends x {
    public final Context a;
    public final Object b = new Object();
    public AssetManager c;

    public b(Context context) {
        this.a = context;
    }

    @Override // f.m.b.x
    public boolean c(v vVar) {
        Uri uri = vVar.c;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // f.m.b.x
    public x.a f(v vVar, int i2) {
        if (this.c == null) {
            synchronized (this.b) {
                if (this.c == null) {
                    this.c = this.a.getAssets();
                }
            }
        }
        return new x.a(l.o.f(this.c.open(vVar.c.toString().substring(22))), Picasso.LoadedFrom.DISK);
    }
}
