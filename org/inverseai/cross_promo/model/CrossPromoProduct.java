package org.inverseai.cross_promo.model;

import f.a.b.a.a;
import f.h.f.y.b;
import i.l.b.i;
import java.io.Serializable;

/* compiled from: CrossPromoProduct.kt */
/* loaded from: classes2.dex */
public final class CrossPromoProduct implements Serializable {
    @b("banner")
    private final String banner;
    @b("icon")
    private final String icon;
    @b("long_des")
    private final String long_des;
    @b("name")
    private final String name;
    @b("pkg_name")
    private final String pkg_name;
    @b("priority")
    private final int priority;
    @b("rating")
    private final double rating;
    @b("short_des")
    private final String short_des;
    @b("total_downloads")
    private final String total_downloads;
    @b("total_ratings")
    private final String total_ratings;

    public CrossPromoProduct(String str, String str2, String str3, String str4, double d2, String str5, String str6, String str7, String str8, int i2) {
        i.e(str, "pkg_name");
        i.e(str2, "name");
        i.e(str3, "short_des");
        i.e(str4, "long_des");
        i.e(str5, "total_ratings");
        i.e(str6, "total_downloads");
        i.e(str7, "icon");
        i.e(str8, "banner");
        this.pkg_name = str;
        this.name = str2;
        this.short_des = str3;
        this.long_des = str4;
        this.rating = d2;
        this.total_ratings = str5;
        this.total_downloads = str6;
        this.icon = str7;
        this.banner = str8;
        this.priority = i2;
    }

    public final String component1() {
        return this.pkg_name;
    }

    public final int component10() {
        return this.priority;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.short_des;
    }

    public final String component4() {
        return this.long_des;
    }

    public final double component5() {
        return this.rating;
    }

    public final String component6() {
        return this.total_ratings;
    }

    public final String component7() {
        return this.total_downloads;
    }

    public final String component8() {
        return this.icon;
    }

    public final String component9() {
        return this.banner;
    }

    public final CrossPromoProduct copy(String str, String str2, String str3, String str4, double d2, String str5, String str6, String str7, String str8, int i2) {
        i.e(str, "pkg_name");
        i.e(str2, "name");
        i.e(str3, "short_des");
        i.e(str4, "long_des");
        i.e(str5, "total_ratings");
        i.e(str6, "total_downloads");
        i.e(str7, "icon");
        i.e(str8, "banner");
        return new CrossPromoProduct(str, str2, str3, str4, d2, str5, str6, str7, str8, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CrossPromoProduct) {
            CrossPromoProduct crossPromoProduct = (CrossPromoProduct) obj;
            return i.a(this.pkg_name, crossPromoProduct.pkg_name) && i.a(this.name, crossPromoProduct.name) && i.a(this.short_des, crossPromoProduct.short_des) && i.a(this.long_des, crossPromoProduct.long_des) && i.a(Double.valueOf(this.rating), Double.valueOf(crossPromoProduct.rating)) && i.a(this.total_ratings, crossPromoProduct.total_ratings) && i.a(this.total_downloads, crossPromoProduct.total_downloads) && i.a(this.icon, crossPromoProduct.icon) && i.a(this.banner, crossPromoProduct.banner) && this.priority == crossPromoProduct.priority;
        }
        return false;
    }

    public final String getBanner() {
        return this.banner;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getLong_des() {
        return this.long_des;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPkg_name() {
        return this.pkg_name;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final double getRating() {
        return this.rating;
    }

    public final String getShort_des() {
        return this.short_des;
    }

    public final String getTotal_downloads() {
        return this.total_downloads;
    }

    public final String getTotal_ratings() {
        return this.total_ratings;
    }

    public int hashCode() {
        int I = a.I(this.long_des, a.I(this.short_des, a.I(this.name, this.pkg_name.hashCode() * 31, 31), 31), 31);
        return a.I(this.banner, a.I(this.icon, a.I(this.total_downloads, a.I(this.total_ratings, (b.a(this.rating) + I) * 31, 31), 31), 31), 31) + this.priority;
    }

    public String toString() {
        StringBuilder A = a.A("CrossPromoProduct(pkg_name=");
        A.append(this.pkg_name);
        A.append(", name=");
        A.append(this.name);
        A.append(", short_des=");
        A.append(this.short_des);
        A.append(", long_des=");
        A.append(this.long_des);
        A.append(", rating=");
        A.append(this.rating);
        A.append(", total_ratings=");
        A.append(this.total_ratings);
        A.append(", total_downloads=");
        A.append(this.total_downloads);
        A.append(", icon=");
        A.append(this.icon);
        A.append(", banner=");
        A.append(this.banner);
        A.append(", priority=");
        A.append(this.priority);
        A.append(')');
        return A.toString();
    }
}
