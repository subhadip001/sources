package f.h.b.a.h.e;

import com.google.android.datatransport.cct.internal.ClientInfo;

/* compiled from: AutoValue_ClientInfo.java */
/* loaded from: classes.dex */
public final class e extends ClientInfo {
    public final ClientInfo.ClientType a;
    public final f.h.b.a.h.e.a b;

    public e(ClientInfo.ClientType clientType, f.h.b.a.h.e.a aVar, a aVar2) {
        this.a = clientType;
        this.b = aVar;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public f.h.b.a.h.e.a a() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public ClientInfo.ClientType b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientInfo) {
            ClientInfo clientInfo = (ClientInfo) obj;
            ClientInfo.ClientType clientType = this.a;
            if (clientType != null ? clientType.equals(clientInfo.b()) : clientInfo.b() == null) {
                f.h.b.a.h.e.a aVar = this.b;
                if (aVar == null) {
                    if (clientInfo.a() == null) {
                        return true;
                    }
                } else if (aVar.equals(clientInfo.a())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        ClientInfo.ClientType clientType = this.a;
        int hashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        f.h.b.a.h.e.a aVar = this.b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("ClientInfo{clientType=");
        A.append(this.a);
        A.append(", androidClientInfo=");
        A.append(this.b);
        A.append("}");
        return A.toString();
    }
}
