package f.c.a.a;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;

/* compiled from: SaleBannerProvider.kt */
/* loaded from: classes.dex */
public final class h implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final String f3111f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3112g;

    /* renamed from: h  reason: collision with root package name */
    public final float f3113h;

    /* renamed from: i  reason: collision with root package name */
    public final float f3114i;

    /* renamed from: j  reason: collision with root package name */
    public final String f3115j;

    /* renamed from: k  reason: collision with root package name */
    public final long f3116k;

    /* renamed from: l  reason: collision with root package name */
    public final String f3117l;

    public h(String str, String str2, float f2, float f3, String str3, long j2, String str4) {
        i.l.b.i.e(str, "skuId");
        i.l.b.i.e(str2, "productDuration");
        i.l.b.i.e(str3, FirebaseAnalytics.Param.CURRENCY);
        i.l.b.i.e(str4, "payload");
        this.f3111f = str;
        this.f3112g = str2;
        this.f3113h = f2;
        this.f3114i = f3;
        this.f3115j = str3;
        this.f3116k = j2;
        this.f3117l = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return i.l.b.i.a(this.f3111f, hVar.f3111f) && i.l.b.i.a(this.f3112g, hVar.f3112g) && i.l.b.i.a(Float.valueOf(this.f3113h), Float.valueOf(hVar.f3113h)) && i.l.b.i.a(Float.valueOf(this.f3114i), Float.valueOf(hVar.f3114i)) && i.l.b.i.a(this.f3115j, hVar.f3115j) && this.f3116k == hVar.f3116k && i.l.b.i.a(this.f3117l, hVar.f3117l);
        }
        return false;
    }

    public int hashCode() {
        int I = f.a.b.a.a.I(this.f3112g, this.f3111f.hashCode() * 31, 31);
        int floatToIntBits = Float.floatToIntBits(this.f3114i);
        int I2 = f.a.b.a.a.I(this.f3115j, (floatToIntBits + ((Float.floatToIntBits(this.f3113h) + I) * 31)) * 31, 31);
        return this.f3117l.hashCode() + ((defpackage.c.a(this.f3116k) + I2) * 31);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Payload(skuId=");
        A.append(this.f3111f);
        A.append(", productDuration=");
        A.append(this.f3112g);
        A.append(", originalPrice=");
        A.append(this.f3113h);
        A.append(", salePrice=");
        A.append(this.f3114i);
        A.append(", currency=");
        A.append(this.f3115j);
        A.append(", countdownTime=");
        A.append(this.f3116k);
        A.append(", payload=");
        A.append(this.f3117l);
        A.append(')');
        return A.toString();
    }
}
