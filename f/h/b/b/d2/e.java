package f.h.b.b.d2;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/* compiled from: BaseTrackSelection.java */
/* loaded from: classes.dex */
public abstract class e implements g {
    public final TrackGroup a;
    public final int b;
    public final int[] c;

    /* renamed from: d  reason: collision with root package name */
    public final Format[] f4096d;

    /* renamed from: e  reason: collision with root package name */
    public int f4097e;

    public e(TrackGroup trackGroup, int... iArr) {
        f.h.b.b.e2.j.g(iArr.length > 0);
        Objects.requireNonNull(trackGroup);
        this.a = trackGroup;
        int length = iArr.length;
        this.b = length;
        this.f4096d = new Format[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f4096d[i2] = trackGroup.f876g[iArr[i2]];
        }
        Arrays.sort(this.f4096d, new Comparator() { // from class: f.h.b.b.d2.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Format) obj2).f714m - ((Format) obj).f714m;
            }
        });
        this.c = new int[this.b];
        int i3 = 0;
        while (true) {
            int i4 = this.b;
            if (i3 < i4) {
                int[] iArr2 = this.c;
                Format format = this.f4096d[i3];
                int i5 = 0;
                while (true) {
                    Format[] formatArr = trackGroup.f876g;
                    if (i5 >= formatArr.length) {
                        i5 = -1;
                        break;
                    } else if (format == formatArr[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                iArr2[i3] = i5;
                i3++;
            } else {
                long[] jArr = new long[i4];
                return;
            }
        }
    }

    @Override // f.h.b.b.d2.j
    public final TrackGroup a() {
        return this.a;
    }

    @Override // f.h.b.b.d2.g
    public /* synthetic */ void c(boolean z) {
        f.b(this, z);
    }

    @Override // f.h.b.b.d2.j
    public final Format d(int i2) {
        return this.f4096d[i2];
    }

    @Override // f.h.b.b.d2.g
    public void e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && Arrays.equals(this.c, eVar.c);
    }

    @Override // f.h.b.b.d2.j
    public final int f(int i2) {
        return this.c[i2];
    }

    @Override // f.h.b.b.d2.g
    public void g() {
    }

    @Override // f.h.b.b.d2.g
    public final Format h() {
        return this.f4096d[b()];
    }

    public int hashCode() {
        if (this.f4097e == 0) {
            this.f4097e = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f4097e;
    }

    @Override // f.h.b.b.d2.g
    public void i(float f2) {
    }

    @Override // f.h.b.b.d2.g
    public /* synthetic */ void j() {
        f.a(this);
    }

    @Override // f.h.b.b.d2.g
    public /* synthetic */ void k() {
        f.c(this);
    }

    @Override // f.h.b.b.d2.j
    public final int length() {
        return this.c.length;
    }
}
