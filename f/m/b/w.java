package f.m.b;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.RemoteViews;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import f.m.b.u;
import f.m.b.v;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RequestCreator.java */
/* loaded from: classes2.dex */
public class w {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicInteger f6895e = new AtomicInteger();
    public final Picasso a;
    public final v.b b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public int f6896d;

    public w(Picasso picasso, Uri uri, int i2) {
        this.a = picasso;
        this.b = new v.b(uri, i2, picasso.f1337l);
    }

    public w a() {
        v.b bVar = this.b;
        bVar.f6891e = true;
        bVar.f6892f = 17;
        return this;
    }

    public final v b(long j2) {
        int andIncrement = f6895e.getAndIncrement();
        v.b bVar = this.b;
        if (bVar.f6891e && bVar.c == 0 && bVar.f6890d == 0) {
            throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
        }
        if (bVar.f6894h == null) {
            bVar.f6894h = Picasso.Priority.NORMAL;
        }
        v vVar = new v(bVar.a, bVar.b, null, null, bVar.c, bVar.f6890d, bVar.f6891e, false, bVar.f6892f, false, 0.0f, 0.0f, 0.0f, false, false, bVar.f6893g, bVar.f6894h, null);
        vVar.a = andIncrement;
        vVar.b = j2;
        boolean z = this.a.n;
        if (z) {
            d0.f("Main", "created", vVar.d(), vVar.toString());
        }
        Objects.requireNonNull((Picasso.d.a) this.a.b);
        if (vVar != vVar) {
            vVar.a = andIncrement;
            vVar.b = j2;
            if (z) {
                String b = vVar.b();
                d0.f("Main", "changed", b, "into " + vVar);
            }
        }
        return vVar;
    }

    public final Drawable c() {
        int i2 = this.f6896d;
        if (i2 != 0) {
            return this.a.f1330e.getDrawable(i2);
        }
        return null;
    }

    public void d(ImageView imageView, e eVar) {
        Bitmap g2;
        long nanoTime = System.nanoTime();
        d0.a();
        if (imageView != null) {
            v.b bVar = this.b;
            boolean z = true;
            if (!((bVar.a == null && bVar.b == 0) ? false : true)) {
                Picasso picasso = this.a;
                Objects.requireNonNull(picasso);
                picasso.a(imageView);
                s.c(imageView, c());
                return;
            }
            if (this.c) {
                if (bVar.c == 0 && bVar.f6890d == 0) {
                    z = false;
                }
                if (!z) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width != 0 && height != 0) {
                        this.b.a(width, height);
                    } else {
                        s.c(imageView, c());
                        Picasso picasso2 = this.a;
                        h hVar = new h(this, imageView, eVar);
                        if (picasso2.f1335j.containsKey(imageView)) {
                            picasso2.a(imageView);
                        }
                        picasso2.f1335j.put(imageView, hVar);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            v b = b(nanoTime);
            StringBuilder sb = d0.a;
            String b2 = d0.b(b, sb);
            sb.setLength(0);
            if (MemoryPolicy.a(0) && (g2 = this.a.g(b2)) != null) {
                Picasso picasso3 = this.a;
                Objects.requireNonNull(picasso3);
                picasso3.a(imageView);
                Picasso picasso4 = this.a;
                Context context = picasso4.f1330e;
                Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
                s.b(imageView, context, g2, loadedFrom, false, picasso4.f1338m);
                if (this.a.n) {
                    String d2 = b.d();
                    d0.f("Main", "completed", d2, "from " + loadedFrom);
                }
                if (eVar != null) {
                    eVar.a();
                    return;
                }
                return;
            }
            s.c(imageView, c());
            this.a.c(new l(this.a, imageView, b, 0, 0, 0, null, b2, null, eVar, false));
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    public void e(RemoteViews remoteViews, int i2, int i3, Notification notification) {
        Bitmap g2;
        long nanoTime = System.nanoTime();
        if (!this.c) {
            if (this.f6896d == 0) {
                v b = b(nanoTime);
                u.a aVar = new u.a(this.a, b, remoteViews, i2, i3, notification, null, 0, 0, d0.b(b, new StringBuilder()), null, 0, null);
                if (MemoryPolicy.a(0) && (g2 = this.a.g(aVar.f6815i)) != null) {
                    aVar.f6879m.setImageViewBitmap(aVar.n, g2);
                    aVar.e();
                    e eVar = aVar.o;
                    if (eVar != null) {
                        eVar.a();
                        return;
                    }
                    return;
                }
                int i4 = this.f6896d;
                if (i4 != 0) {
                    aVar.f6879m.setImageViewResource(aVar.n, i4);
                    aVar.e();
                }
                this.a.c(aVar);
                return;
            }
            throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
        }
        throw new IllegalStateException("Fit cannot be used with RemoteViews.");
    }

    public w f(int i2) {
        if (i2 != 0) {
            this.f6896d = i2;
            return this;
        }
        throw new IllegalArgumentException("Placeholder image resource invalid.");
    }
}
