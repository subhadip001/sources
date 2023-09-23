package f.j.b.c;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i.l.b.i;

/* compiled from: PurchasedItem.kt */
/* loaded from: classes2.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6591d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6592e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6593f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6594g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6595h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6596i;

    public b(String str, String str2, String str3, long j2, int i2, String str4, boolean z, boolean z2, String str5) {
        i.e(str, "orderId");
        i.e(str2, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        i.e(str3, "productId");
        i.e(str4, "purchaseToken");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f6591d = j2;
        this.f6592e = i2;
        this.f6593f = str4;
        this.f6594g = z;
        this.f6595h = z2;
        this.f6596i = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return i.a(this.a, bVar.a) && i.a(this.b, bVar.b) && i.a(this.c, bVar.c) && this.f6591d == bVar.f6591d && this.f6592e == bVar.f6592e && i.a(this.f6593f, bVar.f6593f) && this.f6594g == bVar.f6594g && this.f6595h == bVar.f6595h && i.a(this.f6596i, bVar.f6596i);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int I = f.a.b.a.a.I(this.f6593f, (((c.a(this.f6591d) + f.a.b.a.a.I(this.c, f.a.b.a.a.I(this.b, this.a.hashCode() * 31, 31), 31)) * 31) + this.f6592e) * 31, 31);
        boolean z = this.f6594g;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (I + i2) * 31;
        boolean z2 = this.f6595h;
        int i4 = (i3 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str = this.f6596i;
        return i4 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("PurchasedItem(orderId=");
        A.append(this.a);
        A.append(", packageName=");
        A.append(this.b);
        A.append(", productId=");
        A.append(this.c);
        A.append(", purchaseTime=");
        A.append(this.f6591d);
        A.append(", purchaseState=");
        A.append(this.f6592e);
        A.append(", purchaseToken=");
        A.append(this.f6593f);
        A.append(", autoRenewing=");
        A.append(this.f6594g);
        A.append(", acknowledged=");
        A.append(this.f6595h);
        A.append(", originalJson=");
        A.append((Object) this.f6596i);
        A.append(')');
        return A.toString();
    }
}
