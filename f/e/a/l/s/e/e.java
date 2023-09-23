package f.e.a.l.s.e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;
import f.c.a.a.i;
import f.e.a.l.k;
import f.e.a.l.l;
import f.e.a.l.m;
import f.e.a.l.q.v;
import java.util.List;

/* compiled from: ResourceDrawableDecoder.java */
/* loaded from: classes.dex */
public class e implements m<Uri, Drawable> {
    public static final k<Resources.Theme> b = k.a("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    public final Context a;

    public e(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // f.e.a.l.m
    public boolean a(Uri uri, l lVar) {
        return uri.getScheme().equals("android.resource");
    }

    @Override // f.e.a.l.m
    public /* bridge */ /* synthetic */ v<Drawable> b(Uri uri, int i2, int i3, l lVar) {
        return c(uri, lVar);
    }

    public v c(Uri uri, l lVar) {
        Context context;
        int parseInt;
        Drawable a;
        String authority = uri.getAuthority();
        boolean z = false;
        if (authority.equals(this.a.getPackageName())) {
            context = this.a;
        } else {
            try {
                context = this.a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e2) {
                if (authority.contains(this.a.getPackageName())) {
                    context = this.a;
                } else {
                    throw new IllegalArgumentException(f.a.b.a.a.n("Failed to obtain context or unrecognized Uri format for: ", uri), e2);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            parseInt = context.getResources().getIdentifier(str2, str, authority2);
            if (parseInt == 0) {
                parseInt = Resources.getSystem().getIdentifier(str2, str, DefaultSettingsSpiCall.ANDROID_CLIENT_TYPE);
            }
            if (parseInt == 0) {
                throw new IllegalArgumentException(f.a.b.a.a.n("Failed to find resource id for: ", uri));
            }
        } else if (pathSegments.size() == 1) {
            try {
                parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e3) {
                throw new IllegalArgumentException(f.a.b.a.a.n("Unrecognized Uri format: ", uri), e3);
            }
        } else {
            throw new IllegalArgumentException(f.a.b.a.a.n("Unrecognized Uri format: ", uri));
        }
        Resources.Theme theme = (Resources.Theme) lVar.c(b);
        i.d((context.getPackageName().equals(authority) || theme == null) ? true : true, "Can't get a theme from another package");
        if (theme == null) {
            a = b.a(this.a, context, parseInt, null);
        } else {
            Context context2 = this.a;
            a = b.a(context2, context2, parseInt, theme);
        }
        if (a != null) {
            return new d(a);
        }
        return null;
    }
}
