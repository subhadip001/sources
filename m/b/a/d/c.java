package m.b.a.d;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import org.inverseai.cross_promo.activity.RewardedAdActivity;

/* compiled from: RewardedAdActivity.kt */
/* loaded from: classes2.dex */
public final class c extends ViewPager2.e {
    public final /* synthetic */ RewardedAdActivity a;

    public c(RewardedAdActivity rewardedAdActivity) {
        this.a = rewardedAdActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public void c(int i2) {
        RecyclerView.e adapter;
        RewardedAdActivity rewardedAdActivity = this.a;
        int i3 = RewardedAdActivity.I;
        rewardedAdActivity.P(i2);
        if (i2 == 0) {
            ImageView imageView = this.a.u;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        } else {
            ImageView imageView2 = this.a.u;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
        ViewPager2 viewPager2 = this.a.y;
        int i4 = -1;
        if (viewPager2 != null && (adapter = viewPager2.getAdapter()) != null) {
            i4 = (-1) + adapter.getItemCount();
        }
        if (i2 == i4) {
            ImageView imageView3 = this.a.v;
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(4);
            return;
        }
        ImageView imageView4 = this.a.v;
        if (imageView4 == null) {
            return;
        }
        imageView4.setVisibility(0);
    }
}
