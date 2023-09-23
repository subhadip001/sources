package f.h.b.a.h.e;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* loaded from: classes.dex */
public final class i extends NetworkConnectionInfo {
    public final NetworkConnectionInfo.NetworkType a;
    public final NetworkConnectionInfo.MobileSubtype b;

    public i(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype, a aVar) {
        this.a = networkType;
        this.b = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public NetworkConnectionInfo.MobileSubtype a() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public NetworkConnectionInfo.NetworkType b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NetworkConnectionInfo) {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            NetworkConnectionInfo.NetworkType networkType = this.a;
            if (networkType != null ? networkType.equals(networkConnectionInfo.b()) : networkConnectionInfo.b() == null) {
                NetworkConnectionInfo.MobileSubtype mobileSubtype = this.b;
                if (mobileSubtype == null) {
                    if (networkConnectionInfo.a() == null) {
                        return true;
                    }
                } else if (mobileSubtype.equals(networkConnectionInfo.a())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.a;
        int hashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.b;
        return hashCode ^ (mobileSubtype != null ? mobileSubtype.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("NetworkConnectionInfo{networkType=");
        A.append(this.a);
        A.append(", mobileSubtype=");
        A.append(this.b);
        A.append("}");
        return A.toString();
    }
}
