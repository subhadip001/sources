package f.e.a.l.q.c0;

import f.e.a.r.l;
import f.e.a.r.m.a;
import f.e.a.r.m.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

/* compiled from: SafeKeyGenerator.java */
/* loaded from: classes.dex */
public class k {
    public final f.e.a.r.i<f.e.a.l.j, String> a = new f.e.a.r.i<>(1000);
    public final e.i.i.c<b> b = f.e.a.r.m.a.a(10, new a(this));

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes.dex */
    public class a implements a.b<b> {
        public a(k kVar) {
        }

        @Override // f.e.a.r.m.a.b
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes.dex */
    public static final class b implements a.d {

        /* renamed from: f  reason: collision with root package name */
        public final MessageDigest f3298f;

        /* renamed from: g  reason: collision with root package name */
        public final f.e.a.r.m.d f3299g = new d.b();

        public b(MessageDigest messageDigest) {
            this.f3298f = messageDigest;
        }

        @Override // f.e.a.r.m.a.d
        public f.e.a.r.m.d g() {
            return this.f3299g;
        }
    }

    public String a(f.e.a.l.j jVar) {
        String a2;
        synchronized (this.a) {
            a2 = this.a.a(jVar);
        }
        if (a2 == null) {
            b b2 = this.b.b();
            Objects.requireNonNull(b2, "Argument must not be null");
            b bVar = b2;
            try {
                jVar.a(bVar.f3298f);
                byte[] digest = bVar.f3298f.digest();
                char[] cArr = l.b;
                synchronized (cArr) {
                    for (int i2 = 0; i2 < digest.length; i2++) {
                        int i3 = digest[i2] & 255;
                        int i4 = i2 * 2;
                        char[] cArr2 = l.a;
                        cArr[i4] = cArr2[i3 >>> 4];
                        cArr[i4 + 1] = cArr2[i3 & 15];
                    }
                    a2 = new String(cArr);
                }
            } finally {
                this.b.a(bVar);
            }
        }
        synchronized (this.a) {
            this.a.d(jVar, a2);
        }
        return a2;
    }
}
