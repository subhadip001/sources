package f.m.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import java.util.Objects;

/* compiled from: RequestHandler.java */
/* loaded from: classes2.dex */
public abstract class x {
    public static void a(int i2, int i3, int i4, int i5, BitmapFactory.Options options, v vVar) {
        int min;
        double floor;
        if (i5 > i3 || i4 > i2) {
            if (i3 == 0) {
                floor = Math.floor(i4 / i2);
            } else if (i2 == 0) {
                floor = Math.floor(i5 / i3);
            } else {
                int floor2 = (int) Math.floor(i5 / i3);
                int floor3 = (int) Math.floor(i4 / i2);
                if (vVar.f6886j) {
                    min = Math.max(floor2, floor3);
                } else {
                    min = Math.min(floor2, floor3);
                }
            }
            min = (int) floor;
        } else {
            min = 1;
        }
        options.inSampleSize = min;
        options.inJustDecodeBounds = false;
    }

    public static void b(int i2, int i3, BitmapFactory.Options options, v vVar) {
        a(i2, i3, options.outWidth, options.outHeight, options, vVar);
    }

    public static BitmapFactory.Options d(v vVar) {
        boolean a2 = vVar.a();
        boolean z = vVar.q != null;
        BitmapFactory.Options options = null;
        if (a2 || z || vVar.p) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = a2;
            boolean z2 = vVar.p;
            options.inInputShareable = z2;
            options.inPurgeable = z2;
            if (z) {
                options.inPreferredConfig = vVar.q;
            }
        }
        return options;
    }

    public abstract boolean c(v vVar);

    public int e() {
        return 0;
    }

    public abstract a f(v vVar, int i2);

    public boolean g(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    public boolean h() {
        return false;
    }

    /* compiled from: RequestHandler.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public final Picasso.LoadedFrom a;
        public final Bitmap b;
        public final l.y c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6897d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(l.y yVar, Picasso.LoadedFrom loadedFrom) {
            this(null, yVar, loadedFrom, 0);
            StringBuilder sb = d0.a;
            Objects.requireNonNull(yVar, "source == null");
        }

        public a(Bitmap bitmap, l.y yVar, Picasso.LoadedFrom loadedFrom, int i2) {
            if ((bitmap != null) != (yVar != null)) {
                this.b = bitmap;
                this.c = yVar;
                StringBuilder sb = d0.a;
                Objects.requireNonNull(loadedFrom, "loadedFrom == null");
                this.a = loadedFrom;
                this.f6897d = i2;
                return;
            }
            throw new AssertionError();
        }
    }
}
