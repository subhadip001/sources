package f.h.b.b.y1.h0;

import f.h.b.b.g2.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Atom.java */
/* loaded from: classes.dex */
public abstract class d {
    public final int a;

    /* compiled from: Atom.java */
    /* loaded from: classes.dex */
    public static final class a extends d {
        public final long b;
        public final List<b> c;

        /* renamed from: d  reason: collision with root package name */
        public final List<a> f4787d;

        public a(int i2, long j2) {
            super(i2);
            this.b = j2;
            this.c = new ArrayList();
            this.f4787d = new ArrayList();
        }

        public a b(int i2) {
            int size = this.f4787d.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.f4787d.get(i3);
                if (aVar.a == i2) {
                    return aVar;
                }
            }
            return null;
        }

        public b c(int i2) {
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = this.c.get(i3);
                if (bVar.a == i2) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // f.h.b.b.y1.h0.d
        public String toString() {
            String a = d.a(this.a);
            String arrays = Arrays.toString(this.c.toArray());
            String arrays2 = Arrays.toString(this.f4787d.toArray());
            StringBuilder z = f.a.b.a.a.z(f.a.b.a.a.x(arrays2, f.a.b.a.a.x(arrays, f.a.b.a.a.x(a, 22))), a, " leaves: ", arrays, " containers: ");
            z.append(arrays2);
            return z.toString();
        }
    }

    /* compiled from: Atom.java */
    /* loaded from: classes.dex */
    public static final class b extends d {
        public final t b;

        public b(int i2, t tVar) {
            super(i2);
            this.b = tVar;
        }
    }

    public d(int i2) {
        this.a = i2;
    }

    public static String a(int i2) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i2 >> 24) & 255));
        sb.append((char) ((i2 >> 16) & 255));
        sb.append((char) ((i2 >> 8) & 255));
        sb.append((char) (i2 & 255));
        return sb.toString();
    }

    public String toString() {
        return a(this.a);
    }
}
