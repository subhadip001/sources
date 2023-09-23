package f.h.b.a.h.e;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import f.h.b.a.h.e.k;
import java.util.Arrays;

/* compiled from: AutoValue_LogEvent.java */
/* loaded from: classes.dex */
public final class f extends k {
    public final long a;
    public final Integer b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f3680d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3681e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3682f;

    /* renamed from: g  reason: collision with root package name */
    public final NetworkConnectionInfo f3683g;

    /* compiled from: AutoValue_LogEvent.java */
    /* loaded from: classes.dex */
    public static final class b extends k.a {
        public Long a;
        public Integer b;
        public Long c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f3684d;

        /* renamed from: e  reason: collision with root package name */
        public String f3685e;

        /* renamed from: f  reason: collision with root package name */
        public Long f3686f;

        /* renamed from: g  reason: collision with root package name */
        public NetworkConnectionInfo f3687g;
    }

    public f(long j2, Integer num, long j3, byte[] bArr, String str, long j4, NetworkConnectionInfo networkConnectionInfo, a aVar) {
        this.a = j2;
        this.b = num;
        this.c = j3;
        this.f3680d = bArr;
        this.f3681e = str;
        this.f3682f = j4;
        this.f3683g = networkConnectionInfo;
    }

    @Override // f.h.b.a.h.e.k
    public Integer a() {
        return this.b;
    }

    @Override // f.h.b.a.h.e.k
    public long b() {
        return this.a;
    }

    @Override // f.h.b.a.h.e.k
    public long c() {
        return this.c;
    }

    @Override // f.h.b.a.h.e.k
    public NetworkConnectionInfo d() {
        return this.f3683g;
    }

    @Override // f.h.b.a.h.e.k
    public byte[] e() {
        return this.f3680d;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.a == kVar.b() && ((num = this.b) != null ? num.equals(kVar.a()) : kVar.a() == null) && this.c == kVar.c()) {
                if (Arrays.equals(this.f3680d, kVar instanceof f ? ((f) kVar).f3680d : kVar.e()) && ((str = this.f3681e) != null ? str.equals(kVar.f()) : kVar.f() == null) && this.f3682f == kVar.g()) {
                    NetworkConnectionInfo networkConnectionInfo = this.f3683g;
                    if (networkConnectionInfo == null) {
                        if (kVar.d() == null) {
                            return true;
                        }
                    } else if (networkConnectionInfo.equals(kVar.d())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // f.h.b.a.h.e.k
    public String f() {
        return this.f3681e;
    }

    @Override // f.h.b.a.h.e.k
    public long g() {
        return this.f3682f;
    }

    public int hashCode() {
        long j2 = this.a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j3 = this.c;
        int hashCode2 = (((((i2 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f3680d)) * 1000003;
        String str = this.f3681e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j4 = this.f3682f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f3683g;
        return i3 ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("LogEvent{eventTimeMs=");
        A.append(this.a);
        A.append(", eventCode=");
        A.append(this.b);
        A.append(", eventUptimeMs=");
        A.append(this.c);
        A.append(", sourceExtension=");
        A.append(Arrays.toString(this.f3680d));
        A.append(", sourceExtensionJsonProto3=");
        A.append(this.f3681e);
        A.append(", timezoneOffsetSeconds=");
        A.append(this.f3682f);
        A.append(", networkConnectionInfo=");
        A.append(this.f3683g);
        A.append("}");
        return A.toString();
    }
}
