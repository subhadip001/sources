package m.b.a.d;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.video_converter.video_compressor.R;
import org.inverseai.cross_promo.activity.RewardedAdActivity;
import org.inverseai.cross_promo.helpers.CrossPromoType;

/* compiled from: RewardedAdActivity.kt */
/* loaded from: classes2.dex */
public final class d extends CountDownTimer {
    public final /* synthetic */ RewardedAdActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RewardedAdActivity rewardedAdActivity, long j2) {
        super(j2, 1000L);
        this.a = rewardedAdActivity;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        RewardedAdActivity rewardedAdActivity = this.a;
        rewardedAdActivity.H = true;
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_AD_TYPE", CrossPromoType.CROSS_REWARDED_AD.name());
        bundle.putBoolean("KEY_IS_REWARDED", rewardedAdActivity.H);
        rewardedAdActivity.setResult(-1, intent.putExtra("KEY_EXTRA_DATA", bundle));
        RewardedAdActivity rewardedAdActivity2 = this.a;
        TextView textView = rewardedAdActivity2.x;
        if (textView == null) {
            return;
        }
        textView.setText(rewardedAdActivity2.getString(R.string.rewarded));
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j2) {
        RewardedAdActivity rewardedAdActivity;
        ViewPager2 viewPager2;
        RecyclerView.e adapter;
        RewardedAdActivity rewardedAdActivity2 = this.a;
        int i2 = (int) (j2 / 1000);
        rewardedAdActivity2.F = i2;
        TextView textView = rewardedAdActivity2.x;
        int i3 = 0;
        if (textView != null) {
            textView.setText(rewardedAdActivity2.getString(R.string.remaining_seconds, new Object[]{Integer.valueOf(i2)}));
        }
        RewardedAdActivity rewardedAdActivity3 = this.a;
        if (rewardedAdActivity3.F % rewardedAdActivity3.D == 0) {
            int i4 = rewardedAdActivity3.G + 1;
            rewardedAdActivity3.G = i4;
            ViewPager2 viewPager22 = rewardedAdActivity3.y;
            if (viewPager22 != null && (adapter = viewPager22.getAdapter()) != null) {
                i3 = adapter.getItemCount();
            }
            if (i4 >= i3 || (viewPager2 = (rewardedAdActivity = this.a).y) == null) {
                return;
            }
            viewPager2.setCurrentItem(rewardedAdActivity.G);
        }
    }
}
