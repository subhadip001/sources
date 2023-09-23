package f.i.a;

import i.l.b.i;

/* compiled from: PushNotification.kt */
/* loaded from: classes2.dex */
public final class f {
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6444d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6445e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6446f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6447g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6448h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6449i;

    /* renamed from: j  reason: collision with root package name */
    public final String f6450j;

    /* renamed from: k  reason: collision with root package name */
    public final String f6451k;

    /* renamed from: l  reason: collision with root package name */
    public final String f6452l;

    /* renamed from: m  reason: collision with root package name */
    public final String f6453m;

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        i.e(str9, "channelId");
        i.e(str10, "channelName");
        i.e(str11, "channelDescription");
        i.e(str12, "priority");
        i.e(str13, "campaign");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f6444d = str4;
        this.f6445e = str5;
        this.f6446f = str6;
        this.f6447g = str7;
        this.f6448h = str8;
        this.f6449i = str9;
        this.f6450j = str10;
        this.f6451k = str11;
        this.f6452l = str12;
        this.f6453m = str13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return i.a(this.a, fVar.a) && i.a(this.b, fVar.b) && i.a(this.c, fVar.c) && i.a(this.f6444d, fVar.f6444d) && i.a(this.f6445e, fVar.f6445e) && i.a(this.f6446f, fVar.f6446f) && i.a(this.f6447g, fVar.f6447g) && i.a(this.f6448h, fVar.f6448h) && i.a(this.f6449i, fVar.f6449i) && i.a(this.f6450j, fVar.f6450j) && i.a(this.f6451k, fVar.f6451k) && i.a(this.f6452l, fVar.f6452l) && i.a(this.f6453m, fVar.f6453m);
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f6444d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f6445e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f6446f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f6447g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f6448h;
        return this.f6453m.hashCode() + f.a.b.a.a.I(this.f6452l, f.a.b.a.a.I(this.f6451k, f.a.b.a.a.I(this.f6450j, f.a.b.a.a.I(this.f6449i, (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("PushNotification(title=");
        A.append(this.a);
        A.append(", shortDesc=");
        A.append(this.b);
        A.append(", longDesc=");
        A.append(this.c);
        A.append(", icon=");
        A.append(this.f6444d);
        A.append(", image=");
        A.append(this.f6445e);
        A.append(", packageName=");
        A.append(this.f6446f);
        A.append(", deepLinkUrl=");
        A.append(this.f6447g);
        A.append(", minimumAppVersionCode=");
        A.append(this.f6448h);
        A.append(", channelId=");
        A.append(this.f6449i);
        A.append(", channelName=");
        A.append(this.f6450j);
        A.append(", channelDescription=");
        A.append(this.f6451k);
        A.append(", priority=");
        A.append(this.f6452l);
        A.append(", campaign=");
        A.append(this.f6453m);
        A.append(')');
        return A.toString();
    }
}
