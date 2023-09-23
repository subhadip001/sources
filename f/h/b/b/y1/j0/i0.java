package f.h.b.b.y1.j0;

import java.util.Collections;
import java.util.List;

/* compiled from: TsPayloadReader.java */
/* loaded from: classes.dex */
public interface i0 {

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final byte[] b;

        public a(String str, int i2, byte[] bArr) {
            this.a = str;
            this.b = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final String b;
        public final List<a> c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f4935d;

        public b(int i2, String str, List<a> list, byte[] bArr) {
            List<a> unmodifiableList;
            this.a = i2;
            this.b = str;
            if (list == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.c = unmodifiableList;
            this.f4935d = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes.dex */
    public interface c {
        i0 a(int i2, b bVar);
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final String a;
        public final int b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public int f4936d;

        /* renamed from: e  reason: collision with root package name */
        public String f4937e;

        public d(int i2, int i3, int i4) {
            String str;
            if (i2 != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(12);
                sb.append(i2);
                sb.append("/");
                str = sb.toString();
            } else {
                str = "";
            }
            this.a = str;
            this.b = i3;
            this.c = i4;
            this.f4936d = Integer.MIN_VALUE;
            this.f4937e = "";
        }

        public void a() {
            int i2 = this.f4936d;
            int i3 = i2 == Integer.MIN_VALUE ? this.b : i2 + this.c;
            this.f4936d = i3;
            String str = this.a;
            this.f4937e = f.a.b.a.a.d(f.a.b.a.a.x(str, 11), str, i3);
        }

        public String b() {
            if (this.f4936d != Integer.MIN_VALUE) {
                return this.f4937e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public int c() {
            int i2 = this.f4936d;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    void a(f.h.b.b.g2.a0 a0Var, f.h.b.b.y1.j jVar, d dVar);

    void b(f.h.b.b.g2.t tVar, int i2);

    void c();
}
