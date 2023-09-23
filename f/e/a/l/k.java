package f.e.a.l;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.Objects;

/* compiled from: Option.java */
/* loaded from: classes.dex */
public final class k<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final b<Object> f3236e = new a();
    public final T a;
    public final b<T> b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f3237d;

    /* compiled from: Option.java */
    /* loaded from: classes.dex */
    public class a implements b<Object> {
        @Override // f.e.a.l.k.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public k(String str, T t, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.c = str;
            this.a = t;
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static <T> k<T> a(String str) {
        return new k<>(str, null, f3236e);
    }

    public static <T> k<T> b(String str, T t) {
        return new k<>(str, t, f3236e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.c.equals(((k) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Option{key='");
        A.append(this.c);
        A.append('\'');
        A.append('}');
        return A.toString();
    }
}
