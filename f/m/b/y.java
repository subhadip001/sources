package f.m.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import f.m.b.x;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;

/* compiled from: ResourceRequestHandler.java */
/* loaded from: classes2.dex */
public class y extends x {
    public final Context a;

    public y(Context context) {
        this.a = context;
    }

    @Override // f.m.b.x
    public boolean c(v vVar) {
        if (vVar.f6880d != 0) {
            return true;
        }
        return "android.resource".equals(vVar.c.getScheme());
    }

    @Override // f.m.b.x
    public x.a f(v vVar, int i2) {
        Resources resources;
        Uri uri;
        Uri uri2;
        Context context = this.a;
        StringBuilder sb = d0.a;
        if (vVar.f6880d == 0 && (uri2 = vVar.c) != null) {
            String authority = uri2.getAuthority();
            if (authority != null) {
                try {
                    resources = context.getPackageManager().getResourcesForApplication(authority);
                } catch (PackageManager.NameNotFoundException unused) {
                    StringBuilder A = f.a.b.a.a.A("Unable to obtain resources for package: ");
                    A.append(vVar.c);
                    throw new FileNotFoundException(A.toString());
                }
            } else {
                StringBuilder A2 = f.a.b.a.a.A("No package provided: ");
                A2.append(vVar.c);
                throw new FileNotFoundException(A2.toString());
            }
        } else {
            resources = context.getResources();
        }
        int i3 = vVar.f6880d;
        boolean z = true;
        if (i3 == 0 && (uri = vVar.c) != null) {
            String authority2 = uri.getAuthority();
            if (authority2 != null) {
                List<String> pathSegments = vVar.c.getPathSegments();
                if (pathSegments != null && !pathSegments.isEmpty()) {
                    if (pathSegments.size() == 1) {
                        try {
                            i3 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused2) {
                            StringBuilder A3 = f.a.b.a.a.A("Last path segment is not a resource ID: ");
                            A3.append(vVar.c);
                            throw new FileNotFoundException(A3.toString());
                        }
                    } else if (pathSegments.size() == 2) {
                        i3 = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                    } else {
                        StringBuilder A4 = f.a.b.a.a.A("More than two path segments: ");
                        A4.append(vVar.c);
                        throw new FileNotFoundException(A4.toString());
                    }
                } else {
                    StringBuilder A5 = f.a.b.a.a.A("No path segments: ");
                    A5.append(vVar.c);
                    throw new FileNotFoundException(A5.toString());
                }
            } else {
                StringBuilder A6 = f.a.b.a.a.A("No package provided: ");
                A6.append(vVar.c);
                throw new FileNotFoundException(A6.toString());
            }
        }
        BitmapFactory.Options d2 = x.d(vVar);
        if ((d2 == null || !d2.inJustDecodeBounds) ? false : false) {
            BitmapFactory.decodeResource(resources, i3, d2);
            x.b(vVar.f6882f, vVar.f6883g, d2, vVar);
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i3, d2);
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.DISK;
        Objects.requireNonNull(decodeResource, "bitmap == null");
        return new x.a(decodeResource, null, loadedFrom, 0);
    }
}
