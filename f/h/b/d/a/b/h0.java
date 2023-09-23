package f.h.b.d.a.b;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class h0 extends AssetPackState {
    public final String a;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5622d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5623e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5624f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5625g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5626h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5627i;

    public h0(String str, int i2, int i3, long j2, long j3, int i4, int i5, String str2, String str3) {
        Objects.requireNonNull(str, "Null name");
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.f5622d = j2;
        this.f5623e = j3;
        this.f5624f = i4;
        this.f5625g = i5;
        Objects.requireNonNull(str2, "Null availableVersionTag");
        this.f5626h = str2;
        Objects.requireNonNull(str3, "Null installedVersionTag");
        this.f5627i = str3;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long a() {
        return this.f5622d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int b() {
        return this.c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String c() {
        return this.a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int d() {
        return this.b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long e() {
        return this.f5623e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.a.equals(assetPackState.c()) && this.b == assetPackState.d() && this.c == assetPackState.b() && this.f5622d == assetPackState.a() && this.f5623e == assetPackState.e() && this.f5624f == assetPackState.f() && this.f5625g == assetPackState.g() && this.f5626h.equals(assetPackState.j()) && this.f5627i.equals(assetPackState.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int f() {
        return this.f5624f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int g() {
        return this.f5625g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i2 = this.b;
        int i3 = this.c;
        long j2 = this.f5622d;
        long j3 = this.f5623e;
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f5624f) * 1000003) ^ this.f5625g) * 1000003) ^ this.f5626h.hashCode()) * 1000003) ^ this.f5627i.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String j() {
        return this.f5626h;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String k() {
        return this.f5627i;
    }

    public final String toString() {
        String str = this.a;
        int i2 = this.b;
        int i3 = this.c;
        long j2 = this.f5622d;
        long j3 = this.f5623e;
        int i4 = this.f5624f;
        int i5 = this.f5625g;
        String str2 = this.f5626h;
        String str3 = this.f5627i;
        StringBuilder sb = new StringBuilder(str3.length() + str2.length() + str.length() + 261);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        f.a.b.a.a.Q(sb, ", totalBytesToDownload=", j3, ", transferProgressPercentage=");
        f.a.b.a.a.P(sb, i4, ", updateAvailability=", i5, ", availableVersionTag=");
        return f.a.b.a.a.w(sb, str2, ", installedVersionTag=", str3, "}");
    }
}
