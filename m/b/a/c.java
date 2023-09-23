package m.b.a;

import com.video_converter.video_compressor.R;
import f.n.a.n.i;
import i.l.b.j;
import java.util.List;
import m.b.a.j.e;
import org.inverseai.cross_promo.helpers.CrossPromoType;

/* compiled from: CrossNativeAd.kt */
/* loaded from: classes2.dex */
public final class c {
    public final List<Integer> a = i.i.b.c(Integer.valueOf((int) R.layout.cross_native_ad_1), Integer.valueOf((int) R.layout.cross_native_ad_2), Integer.valueOf((int) R.layout.cross_native_ad_3));
    public final i.c b = i.E(a.f9296g);

    /* compiled from: CrossNativeAd.kt */
    /* loaded from: classes2.dex */
    public static final class a extends j implements i.l.a.a<e> {

        /* renamed from: g  reason: collision with root package name */
        public static final a f9296g = new a();

        public a() {
            super(0);
        }

        @Override // i.l.a.a
        public e c() {
            return new e(CrossPromoType.CROSS_NATIVE_AD);
        }
    }

    public final e a() {
        return (e) this.b.getValue();
    }
}
