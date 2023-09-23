package f.j.b.c;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import i.l.b.i;

/* compiled from: ProductItem.kt */
/* loaded from: classes2.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6581d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6582e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6583f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6584g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6585h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6586i;

    /* renamed from: j  reason: collision with root package name */
    public final String f6587j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6588k;

    /* renamed from: l  reason: collision with root package name */
    public final long f6589l;

    /* renamed from: m  reason: collision with root package name */
    public final long f6590m;
    public final String n;
    public final String o;
    public final String p;
    public boolean q;
    public final String r;
    public Integer s;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, long j2, long j3, String str11, String str12, String str13, boolean z, String str14) {
        i.e(str, "title");
        i.e(str2, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
        i.e(str3, "sku");
        i.e(str4, "freeTrialPeriod");
        i.e(str5, "subscriptionPeriod");
        i.e(str6, FirebaseAnalytics.Param.PRICE);
        i.e(str7, "originalPRice");
        i.e(str8, "priceCurrencyCode");
        i.e(str9, "introductoryPrice");
        i.e(str10, "introductoryPricePeriod");
        i.e(str11, "originalJson");
        i.e(str12, "iconUrl");
        i.e(str13, "description");
        i.e(str14, "payLoad");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f6581d = str4;
        this.f6582e = str5;
        this.f6583f = str6;
        this.f6584g = str7;
        this.f6585h = str8;
        this.f6586i = str9;
        this.f6587j = str10;
        this.f6588k = i2;
        this.f6589l = j2;
        this.f6590m = j3;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = z;
        this.r = str14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && i.a(this.b, aVar.b) && i.a(this.c, aVar.c) && i.a(this.f6581d, aVar.f6581d) && i.a(this.f6582e, aVar.f6582e) && i.a(this.f6583f, aVar.f6583f) && i.a(this.f6584g, aVar.f6584g) && i.a(this.f6585h, aVar.f6585h) && i.a(this.f6586i, aVar.f6586i) && i.a(this.f6587j, aVar.f6587j) && this.f6588k == aVar.f6588k && this.f6589l == aVar.f6589l && this.f6590m == aVar.f6590m && i.a(this.n, aVar.n) && i.a(this.o, aVar.o) && i.a(this.p, aVar.p) && this.q == aVar.q && i.a(this.r, aVar.r);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int I = f.a.b.a.a.I(this.f6586i, f.a.b.a.a.I(this.f6585h, f.a.b.a.a.I(this.f6584g, f.a.b.a.a.I(this.f6583f, f.a.b.a.a.I(this.f6582e, f.a.b.a.a.I(this.f6581d, f.a.b.a.a.I(this.c, f.a.b.a.a.I(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        int a = c.a(this.f6589l);
        int a2 = c.a(this.f6590m);
        int I2 = f.a.b.a.a.I(this.p, f.a.b.a.a.I(this.o, f.a.b.a.a.I(this.n, (a2 + ((a + ((f.a.b.a.a.I(this.f6587j, I, 31) + this.f6588k) * 31)) * 31)) * 31, 31), 31), 31);
        boolean z = this.q;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return this.r.hashCode() + ((I2 + i2) * 31);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("ProductItem(title=");
        A.append(this.a);
        A.append(", type=");
        A.append(this.b);
        A.append(", sku=");
        A.append(this.c);
        A.append(", freeTrialPeriod=");
        A.append(this.f6581d);
        A.append(", subscriptionPeriod=");
        A.append(this.f6582e);
        A.append(", price=");
        A.append(this.f6583f);
        A.append(", originalPRice=");
        A.append(this.f6584g);
        A.append(", priceCurrencyCode=");
        A.append(this.f6585h);
        A.append(", introductoryPrice=");
        A.append(this.f6586i);
        A.append(", introductoryPricePeriod=");
        A.append(this.f6587j);
        A.append(", introductoryPriceCycle=");
        A.append(this.f6588k);
        A.append(", originalPriceAmountMicros=");
        A.append(this.f6589l);
        A.append(", introductoryPriceAmountMicros=");
        A.append(this.f6590m);
        A.append(", originalJson=");
        A.append(this.n);
        A.append(", iconUrl=");
        A.append(this.o);
        A.append(", description=");
        A.append(this.p);
        A.append(", selected=");
        A.append(this.q);
        A.append(", payLoad=");
        A.append(this.r);
        A.append(')');
        return A.toString();
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, long j2, long j3, String str11, String str12, String str13, boolean z, String str14, int i3) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i2, j2, j3, str11, str12, str13, (i3 & LogFileManager.MAX_LOG_SIZE) != 0 ? false : z, str14);
    }
}
