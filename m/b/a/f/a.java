package m.b.a.f;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import i.l.b.i;
import org.inverseai.cross_promo.activity.RewardedAdActivity;

/* compiled from: RewardedAdResultContract.kt */
/* loaded from: classes2.dex */
public final class a extends e.a.e.d.a<Intent, Boolean> {
    @Override // e.a.e.d.a
    public Intent a(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "input");
        return new Intent(context, RewardedAdActivity.class);
    }

    @Override // e.a.e.d.a
    public Boolean c(int i2, Intent intent) {
        Bundle bundleExtra = intent == null ? null : intent.getBundleExtra("KEY_EXTRA_DATA");
        boolean z = false;
        if (i2 == -1 && bundleExtra != null) {
            z = bundleExtra.getBoolean("KEY_IS_REWARDED", false);
        }
        return Boolean.valueOf(z);
    }
}
