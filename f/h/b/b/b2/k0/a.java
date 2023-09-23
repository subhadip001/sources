package f.h.b.b.b2.k0;

import android.net.Uri;
import f.h.b.b.e2.j;
import f.h.b.b.g2.b0;
import java.util.Arrays;

/* compiled from: AdPlaybackState.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f3875g = new a(null, new long[0], null, 0, -9223372036854775807L);
    public final Object a = null;
    public final int b;
    public final long[] c;

    /* renamed from: d  reason: collision with root package name */
    public final C0102a[] f3876d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3877e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3878f;

    /* compiled from: AdPlaybackState.java */
    /* renamed from: f.h.b.b.b2.k0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0102a {
        public final int a;
        public final Uri[] b;
        public final int[] c;

        /* renamed from: d  reason: collision with root package name */
        public final long[] f3879d;

        public C0102a() {
            j.c(true);
            this.a = -1;
            this.c = new int[0];
            this.b = new Uri[0];
            this.f3879d = new long[0];
        }

        public int a(int i2) {
            int i3 = i2 + 1;
            while (true) {
                int[] iArr = this.c;
                if (i3 >= iArr.length || iArr[i3] == 0 || iArr[i3] == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public boolean b() {
            return this.a == -1 || a(-1) < this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0102a.class != obj.getClass()) {
                return false;
            }
            C0102a c0102a = (C0102a) obj;
            return this.a == c0102a.a && Arrays.equals(this.b, c0102a.b) && Arrays.equals(this.c, c0102a.c) && Arrays.equals(this.f3879d, c0102a.f3879d);
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.c);
            return Arrays.hashCode(this.f3879d) + ((hashCode + (((this.a * 31) + Arrays.hashCode(this.b)) * 31)) * 31);
        }
    }

    public a(Object obj, long[] jArr, C0102a[] c0102aArr, long j2, long j3) {
        this.c = jArr;
        this.f3877e = j2;
        this.f3878f = j3;
        int length = jArr.length;
        this.b = length;
        C0102a[] c0102aArr2 = new C0102a[length];
        for (int i2 = 0; i2 < this.b; i2++) {
            c0102aArr2[i2] = new C0102a();
        }
        this.f3876d = c0102aArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return b0.a(this.a, aVar.a) && this.b == aVar.b && this.f3877e == aVar.f3877e && this.f3878f == aVar.f3878f && Arrays.equals(this.c, aVar.c) && Arrays.equals(this.f3876d, aVar.f3876d);
    }

    public int hashCode() {
        int i2 = this.b * 31;
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        return Arrays.hashCode(this.f3876d) + ((Arrays.hashCode(this.c) + ((((((i2 + hashCode) * 31) + ((int) this.f3877e)) * 31) + ((int) this.f3878f)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("AdPlaybackState(adsId=");
        A.append(this.a);
        A.append(", adResumePositionUs=");
        A.append(this.f3877e);
        A.append(", adGroups=[");
        for (int i2 = 0; i2 < this.f3876d.length; i2++) {
            A.append("adGroup(timeUs=");
            A.append(this.c[i2]);
            A.append(", ads=[");
            for (int i3 = 0; i3 < this.f3876d[i2].c.length; i3++) {
                A.append("ad(state=");
                int i4 = this.f3876d[i2].c[i3];
                if (i4 == 0) {
                    A.append('_');
                } else if (i4 == 1) {
                    A.append('R');
                } else if (i4 == 2) {
                    A.append('S');
                } else if (i4 == 3) {
                    A.append('P');
                } else if (i4 != 4) {
                    A.append('?');
                } else {
                    A.append('!');
                }
                A.append(", durationUs=");
                A.append(this.f3876d[i2].f3879d[i3]);
                A.append(')');
                if (i3 < this.f3876d[i2].c.length - 1) {
                    A.append(", ");
                }
            }
            A.append("])");
            if (i2 < this.f3876d.length - 1) {
                A.append(", ");
            }
        }
        A.append("])");
        return A.toString();
    }
}
