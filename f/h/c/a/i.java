package f.h.c.a;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: MoreObjects.java */
/* loaded from: classes.dex */
public final class i {
    public final String a;
    public final b b;
    public b c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5843d;

    /* compiled from: MoreObjects.java */
    /* loaded from: classes.dex */
    public static final class a extends b {
        public a(h hVar) {
            super(null);
        }
    }

    /* compiled from: MoreObjects.java */
    /* loaded from: classes.dex */
    public static class b {
        public String a;
        public Object b;
        public b c;

        public b(h hVar) {
        }
    }

    public i(String str, h hVar) {
        b bVar = new b(null);
        this.b = bVar;
        this.c = bVar;
        this.f5843d = false;
        this.a = str;
    }

    public i a(String str, int i2) {
        e(str, String.valueOf(i2));
        return this;
    }

    public i b(String str, long j2) {
        e(str, String.valueOf(j2));
        return this;
    }

    public i c(String str, Object obj) {
        b bVar = new b(null);
        this.c.c = bVar;
        this.c = bVar;
        bVar.b = obj;
        bVar.a = str;
        return this;
    }

    public i d(String str, boolean z) {
        e(str, String.valueOf(z));
        return this;
    }

    public final i e(String str, Object obj) {
        a aVar = new a(null);
        this.c.c = aVar;
        this.c = aVar;
        aVar.b = obj;
        Objects.requireNonNull(str);
        aVar.a = str;
        return this;
    }

    public String toString() {
        boolean z = this.f5843d;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        String str = "";
        for (b bVar = this.b.c; bVar != null; bVar = bVar.c) {
            Object obj = bVar.b;
            if ((bVar instanceof a) || obj != null || !z) {
                sb.append(str);
                String str2 = bVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj != null && obj.getClass().isArray()) {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                } else {
                    sb.append(obj);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
