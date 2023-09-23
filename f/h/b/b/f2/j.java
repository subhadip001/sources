package f.h.b.b.f2;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DataSpec.java */
/* loaded from: classes.dex */
public final class j {
    public final Uri a;
    public final int b;
    public final byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f4210d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4211e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4212f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4213g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4214h;

    public j(Uri uri, long j2, int i2, byte[] bArr, Map map, long j3, long j4, String str, int i3, Object obj, a aVar) {
        boolean z = true;
        f.h.b.b.e2.j.c(j2 + j3 >= 0);
        f.h.b.b.e2.j.c(j3 >= 0);
        if (j4 <= 0 && j4 != -1) {
            z = false;
        }
        f.h.b.b.e2.j.c(z);
        this.a = uri;
        this.b = i2;
        this.c = null;
        this.f4210d = Collections.unmodifiableMap(new HashMap(map));
        this.f4211e = j3;
        this.f4212f = j4;
        this.f4213g = str;
        this.f4214h = i3;
    }

    public static String a(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return "HEAD";
                }
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    public String toString() {
        String a2 = a(this.b);
        String valueOf = String.valueOf(this.a);
        long j2 = this.f4211e;
        long j3 = this.f4212f;
        String str = this.f4213g;
        int i2 = this.f4214h;
        StringBuilder z = f.a.b.a.a.z(f.a.b.a.a.x(str, valueOf.length() + a2.length() + 70), "DataSpec[", a2, " ", valueOf);
        f.a.b.a.a.Q(z, ", ", j2, ", ");
        z.append(j3);
        z.append(", ");
        z.append(str);
        z.append(", ");
        z.append(i2);
        z.append("]");
        return z.toString();
    }
}
