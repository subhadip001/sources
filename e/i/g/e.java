package e.i.g;

import android.util.Base64;
import java.util.List;
import java.util.Objects;

/* compiled from: FontRequest.java */
/* loaded from: classes.dex */
public final class e {
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f2478d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2479e;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        Objects.requireNonNull(str);
        this.a = str;
        Objects.requireNonNull(str2);
        this.b = str2;
        this.c = str3;
        Objects.requireNonNull(list);
        this.f2478d = list;
        this.f2479e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder A = f.a.b.a.a.A("FontRequest {mProviderAuthority: ");
        A.append(this.a);
        A.append(", mProviderPackage: ");
        A.append(this.b);
        A.append(", mQuery: ");
        A.append(this.c);
        A.append(", mCertificates:");
        sb.append(A.toString());
        for (int i2 = 0; i2 < this.f2478d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f2478d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        return f.a.b.a.a.u(sb, "}", "mCertificatesArray: 0");
    }
}
