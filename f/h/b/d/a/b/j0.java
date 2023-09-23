package f.h.b.d.a.b;

import java.util.Arrays;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class j0 extends d3 {
    public final String a;
    public final long b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5646d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5647e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f5648f;

    public j0(String str, long j2, int i2, boolean z, boolean z2, byte[] bArr) {
        this.a = str;
        this.b = j2;
        this.c = i2;
        this.f5646d = z;
        this.f5647e = z2;
        this.f5648f = bArr;
    }

    @Override // f.h.b.d.a.b.d3
    public final int a() {
        return this.c;
    }

    @Override // f.h.b.d.a.b.d3
    public final long b() {
        return this.b;
    }

    @Override // f.h.b.d.a.b.d3
    public final String c() {
        return this.a;
    }

    @Override // f.h.b.d.a.b.d3
    public final boolean d() {
        return this.f5647e;
    }

    @Override // f.h.b.d.a.b.d3
    public final boolean e() {
        return this.f5646d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d3) {
            d3 d3Var = (d3) obj;
            String str = this.a;
            if (str != null ? str.equals(d3Var.c()) : d3Var.c() == null) {
                if (this.b == d3Var.b() && this.c == d3Var.a() && this.f5646d == d3Var.e() && this.f5647e == d3Var.d()) {
                    if (Arrays.equals(this.f5648f, d3Var instanceof j0 ? ((j0) d3Var).f5648f : d3Var.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // f.h.b.d.a.b.d3
    public final byte[] f() {
        return this.f5648f;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.b;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ (true != this.f5646d ? 1237 : 1231)) * 1000003) ^ (true == this.f5647e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f5648f);
    }

    public final String toString() {
        String str = this.a;
        long j2 = this.b;
        int i2 = this.c;
        boolean z = this.f5646d;
        boolean z2 = this.f5647e;
        String arrays = Arrays.toString(this.f5648f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j2);
        sb.append(", compressionMethod=");
        sb.append(i2);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        return f.a.b.a.a.v(sb, ", headerBytes=", arrays, "}");
    }
}
