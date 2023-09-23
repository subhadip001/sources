package f.h.b.b.y1;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;

/* compiled from: TrackOutput.java */
/* loaded from: classes.dex */
public interface w {

    /* compiled from: TrackOutput.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final byte[] b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5110d;

        public a(int i2, byte[] bArr, int i3, int i4) {
            this.a = i2;
            this.b = bArr;
            this.c = i3;
            this.f5110d = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.c == aVar.c && this.f5110d == aVar.f5110d && Arrays.equals(this.b, aVar.b);
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.f5110d;
        }
    }

    int a(f.h.b.b.f2.f fVar, int i2, boolean z, int i3);

    int b(f.h.b.b.f2.f fVar, int i2, boolean z);

    void c(f.h.b.b.g2.t tVar, int i2);

    void d(long j2, int i2, int i3, int i4, a aVar);

    void e(Format format);

    void f(f.h.b.b.g2.t tVar, int i2, int i3);
}
