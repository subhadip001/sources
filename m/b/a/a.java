package m.b.a;

import com.video_converter.video_compressor.R;
import f.n.a.n.i;
import i.l.b.j;
import java.util.List;
import m.b.a.j.e;
import org.inverseai.cross_promo.helpers.CrossPromoType;

/* compiled from: CrossBannerAd.kt */
/* loaded from: classes2.dex */
public final class a {
    public final List<Integer> a = i.F(Integer.valueOf((int) R.layout.cross_banner_ad_1));
    public final i.c b = i.E(C0237a.f9295g);

    /* compiled from: CrossBannerAd.kt */
    /* renamed from: m.b.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0237a extends j implements i.l.a.a<e> {

        /* renamed from: g  reason: collision with root package name */
        public static final C0237a f9295g = new C0237a();

        public C0237a() {
            super(0);
        }

        @Override // i.l.a.a
        public e c() {
            return new e(CrossPromoType.CROSS_BANNER_AD);
        }
    }

    public final e a() {
        return (e) this.b.getValue();
    }
}
