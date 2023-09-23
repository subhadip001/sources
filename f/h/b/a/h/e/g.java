package f.h.b.a.h.e;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* compiled from: AutoValue_LogRequest.java */
/* loaded from: classes.dex */
public final class g extends l {
    public final long a;
    public final long b;
    public final ClientInfo c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f3688d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3689e;

    /* renamed from: f  reason: collision with root package name */
    public final List<k> f3690f;

    /* renamed from: g  reason: collision with root package name */
    public final QosTier f3691g;

    public g(long j2, long j3, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier, a aVar) {
        this.a = j2;
        this.b = j3;
        this.c = clientInfo;
        this.f3688d = num;
        this.f3689e = str;
        this.f3690f = list;
        this.f3691g = qosTier;
    }

    @Override // f.h.b.a.h.e.l
    public ClientInfo a() {
        return this.c;
    }

    @Override // f.h.b.a.h.e.l
    @Encodable.Field(name = "logEvent")
    public List<k> b() {
        return this.f3690f;
    }

    @Override // f.h.b.a.h.e.l
    public Integer c() {
        return this.f3688d;
    }

    @Override // f.h.b.a.h.e.l
    public String d() {
        return this.f3689e;
    }

    @Override // f.h.b.a.h.e.l
    public QosTier e() {
        return this.f3691g;
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<k> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.a == lVar.f() && this.b == lVar.g() && ((clientInfo = this.c) != null ? clientInfo.equals(lVar.a()) : lVar.a() == null) && ((num = this.f3688d) != null ? num.equals(lVar.c()) : lVar.c() == null) && ((str = this.f3689e) != null ? str.equals(lVar.d()) : lVar.d() == null) && ((list = this.f3690f) != null ? list.equals(lVar.b()) : lVar.b() == null)) {
                QosTier qosTier = this.f3691g;
                if (qosTier == null) {
                    if (lVar.e() == null) {
                        return true;
                    }
                } else if (qosTier.equals(lVar.e())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // f.h.b.a.h.e.l
    public long f() {
        return this.a;
    }

    @Override // f.h.b.a.h.e.l
    public long g() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        ClientInfo clientInfo = this.c;
        int hashCode = (i2 ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f3688d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f3689e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<k> list = this.f3690f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f3691g;
        return hashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("LogRequest{requestTimeMs=");
        A.append(this.a);
        A.append(", requestUptimeMs=");
        A.append(this.b);
        A.append(", clientInfo=");
        A.append(this.c);
        A.append(", logSource=");
        A.append(this.f3688d);
        A.append(", logSourceName=");
        A.append(this.f3689e);
        A.append(", logEvents=");
        A.append(this.f3690f);
        A.append(", qosTier=");
        A.append(this.f3691g);
        A.append("}");
        return A.toString();
    }
}
