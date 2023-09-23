package org.inverseai.cross_promo.model;

import f.a.b.a.a;
import f.h.f.y.b;
import i.l.b.i;
import java.io.Serializable;

/* compiled from: CrossPromoRewardedAd.kt */
/* loaded from: classes2.dex */
public final class CrossPromoRewardedAd implements Serializable {
    @b("CrossPromoProduct")
    private final CrossPromoProduct CrossPromoProduct;
    @b("layoutId")
    private final int layoutId;

    public CrossPromoRewardedAd(CrossPromoProduct crossPromoProduct, int i2) {
        i.e(crossPromoProduct, "CrossPromoProduct");
        this.CrossPromoProduct = crossPromoProduct;
        this.layoutId = i2;
    }

    public static /* synthetic */ CrossPromoRewardedAd copy$default(CrossPromoRewardedAd crossPromoRewardedAd, CrossPromoProduct crossPromoProduct, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            crossPromoProduct = crossPromoRewardedAd.CrossPromoProduct;
        }
        if ((i3 & 2) != 0) {
            i2 = crossPromoRewardedAd.layoutId;
        }
        return crossPromoRewardedAd.copy(crossPromoProduct, i2);
    }

    public final CrossPromoProduct component1() {
        return this.CrossPromoProduct;
    }

    public final int component2() {
        return this.layoutId;
    }

    public final CrossPromoRewardedAd copy(CrossPromoProduct crossPromoProduct, int i2) {
        i.e(crossPromoProduct, "CrossPromoProduct");
        return new CrossPromoRewardedAd(crossPromoProduct, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CrossPromoRewardedAd) {
            CrossPromoRewardedAd crossPromoRewardedAd = (CrossPromoRewardedAd) obj;
            return i.a(this.CrossPromoProduct, crossPromoRewardedAd.CrossPromoProduct) && this.layoutId == crossPromoRewardedAd.layoutId;
        }
        return false;
    }

    public final CrossPromoProduct getCrossPromoProduct() {
        return this.CrossPromoProduct;
    }

    public final int getLayoutId() {
        return this.layoutId;
    }

    public int hashCode() {
        return (this.CrossPromoProduct.hashCode() * 31) + this.layoutId;
    }

    public String toString() {
        StringBuilder A = a.A("CrossPromoRewardedAd(CrossPromoProduct=");
        A.append(this.CrossPromoProduct);
        A.append(", layoutId=");
        A.append(this.layoutId);
        A.append(')');
        return A.toString();
    }
}
