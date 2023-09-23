package f.h.b.d.a.d;

import com.google.android.play.core.install.InstallState;
import f.a.b.a.a;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class b extends InstallState {
    public final int a;
    public final long b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5787d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5788e;

    public b(int i2, long j2, long j3, int i3, String str) {
        this.a = i2;
        this.b = j2;
        this.c = j3;
        this.f5787d = i3;
        Objects.requireNonNull(str, "Null packageName");
        this.f5788e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long a() {
        return this.b;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int b() {
        return this.f5787d;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int c() {
        return this.a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String d() {
        return this.f5788e;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.a == installState.c() && this.b == installState.a() && this.c == installState.e() && this.f5787d == installState.b() && this.f5788e.equals(installState.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return ((((((((i2 ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f5787d) * 1000003) ^ this.f5788e.hashCode();
    }

    public final String toString() {
        int i2 = this.a;
        long j2 = this.b;
        long j3 = this.c;
        int i3 = this.f5787d;
        String str = this.f5788e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        a.Q(sb, ", totalBytesToDownload=", j3, ", installErrorCode=");
        sb.append(i3);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
