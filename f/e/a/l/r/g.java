package f.e.a.l.r;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Objects;

/* compiled from: GlideUrl.java */
/* loaded from: classes.dex */
public class g implements f.e.a.l.j {
    public final h b;
    public final URL c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3418d;

    /* renamed from: e  reason: collision with root package name */
    public String f3419e;

    /* renamed from: f  reason: collision with root package name */
    public URL f3420f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f3421g;

    /* renamed from: h  reason: collision with root package name */
    public int f3422h;

    public g(URL url) {
        h hVar = h.a;
        Objects.requireNonNull(url, "Argument must not be null");
        this.c = url;
        this.f3418d = null;
        Objects.requireNonNull(hVar, "Argument must not be null");
        this.b = hVar;
    }

    @Override // f.e.a.l.j
    public void a(MessageDigest messageDigest) {
        if (this.f3421g == null) {
            this.f3421g = c().getBytes(f.e.a.l.j.a);
        }
        messageDigest.update(this.f3421g);
    }

    public String c() {
        String str = this.f3418d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        Objects.requireNonNull(url, "Argument must not be null");
        return url.toString();
    }

    public URL d() {
        if (this.f3420f == null) {
            if (TextUtils.isEmpty(this.f3419e)) {
                String str = this.f3418d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.c;
                    Objects.requireNonNull(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f3419e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f3420f = new URL(this.f3419e);
        }
        return this.f3420f;
    }

    @Override // f.e.a.l.j
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return c().equals(gVar.c()) && this.b.equals(gVar.b);
        }
        return false;
    }

    @Override // f.e.a.l.j
    public int hashCode() {
        if (this.f3422h == 0) {
            int hashCode = c().hashCode();
            this.f3422h = hashCode;
            this.f3422h = this.b.hashCode() + (hashCode * 31);
        }
        return this.f3422h;
    }

    public String toString() {
        return c();
    }

    public g(String str, h hVar) {
        this.c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f3418d = str;
            Objects.requireNonNull(hVar, "Argument must not be null");
            this.b = hVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
