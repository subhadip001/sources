package f.h.b.b.d2;

import com.google.android.exoplayer2.source.TrackGroup;
import f.h.b.b.d2.g;
import f.h.c.b.q;
import java.util.List;

/* compiled from: AdaptiveTrackSelection.java */
/* loaded from: classes.dex */
public class d extends e {

    /* renamed from: f  reason: collision with root package name */
    public final f.h.b.b.f2.d f4094f;

    /* renamed from: g  reason: collision with root package name */
    public final f.h.b.b.g2.f f4095g;

    /* compiled from: AdaptiveTrackSelection.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j2, long j3) {
            this.a = j2;
            this.b = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.a) * 31) + ((int) this.b);
        }
    }

    /* compiled from: AdaptiveTrackSelection.java */
    /* loaded from: classes.dex */
    public static class b implements g.b {
        public final f.h.b.b.g2.f a = f.h.b.b.g2.f.a;
    }

    public d(TrackGroup trackGroup, int[] iArr, f.h.b.b.f2.d dVar, long j2, long j3, long j4, float f2, float f3, List<a> list, f.h.b.b.g2.f fVar) {
        super(trackGroup, iArr);
        this.f4094f = dVar;
        q.m(list);
        this.f4095g = fVar;
    }

    public static void l(List<q.a<a>> list, long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            q.a<a> aVar = list.get(i2);
            if (aVar != null) {
                aVar.b(new a(j2, jArr[i2]));
            }
        }
    }

    @Override // f.h.b.b.d2.g
    public int b() {
        return 0;
    }

    @Override // f.h.b.b.d2.e, f.h.b.b.d2.g
    public void e() {
    }

    @Override // f.h.b.b.d2.e, f.h.b.b.d2.g
    public void g() {
    }

    @Override // f.h.b.b.d2.e, f.h.b.b.d2.g
    public void i(float f2) {
    }
}
