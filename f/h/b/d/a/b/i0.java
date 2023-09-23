package f.h.b.d.a.b;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class i0 extends w2 {
    public final int a;
    public final String b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5633d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5634e;

    public i0(int i2, String str, long j2, long j3, int i3) {
        this.a = i2;
        this.b = str;
        this.c = j2;
        this.f5633d = j3;
        this.f5634e = i3;
    }

    @Override // f.h.b.d.a.b.w2
    public final int a() {
        return this.a;
    }

    @Override // f.h.b.d.a.b.w2
    public final int b() {
        return this.f5634e;
    }

    @Override // f.h.b.d.a.b.w2
    public final long c() {
        return this.c;
    }

    @Override // f.h.b.d.a.b.w2
    public final long d() {
        return this.f5633d;
    }

    @Override // f.h.b.d.a.b.w2
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w2) {
            w2 w2Var = (w2) obj;
            if (this.a == w2Var.a() && ((str = this.b) != null ? str.equals(w2Var.e()) : w2Var.e() == null) && this.c == w2Var.c() && this.f5633d == w2Var.d() && this.f5634e == w2Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.c;
        long j3 = this.f5633d;
        return ((((((i2 ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f5634e;
    }

    public final String toString() {
        int i2 = this.a;
        String str = this.b;
        long j2 = this.c;
        long j3 = this.f5633d;
        int i3 = this.f5634e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i2);
        sb.append(", filePath=");
        sb.append(str);
        f.a.b.a.a.Q(sb, ", fileOffset=", j2, ", remainingBytes=");
        sb.append(j3);
        sb.append(", previousChunk=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
